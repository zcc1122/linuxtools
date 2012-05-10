package org.eclipse.linuxtools.systemtap.ui.graphingapi.ui.charts;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.linuxtools.systemtap.ui.graphingapi.nonui.adapters.IAdapter;

import org.swtchart.IAxis;
import org.swtchart.ISeries;
import org.swtchart.ITitle;
import org.swtchart.LineStyle;

/**
 * Builds the chart with axis.
 * 
 * @author Qi Liang
 */
public abstract class AbstractChartWithAxisBuilder extends AbstractChartBuilder {

    /**
     * Title of X axis.
     */
    protected String xTitle = null;

    /**
     * Constructor.
     * 
     * @param dataSet
     *            data for chart
     */
    
    public AbstractChartWithAxisBuilder(IAdapter adapter, Composite parent, int style, String title) {
    	 super(adapter, parent, style, title);
	}

	/**
	 * Builds X axis.
	 */
	protected void buildXAxis() {
		super.buildXAxis();
		String labels[] = adapter.getLabels();
		IAxis xAxis = this.chart.getAxisSet().getXAxis(0);
		xAxis.getGrid().setStyle(LineStyle.NONE);
		xAxis.getTick().setForeground(BLACK);
		ITitle xTitle = xAxis.getTitle();
		xTitle.setForeground(BLACK);

		if (labels.length > 0)
			xTitle.setText(labels[0]);
		else
			xTitle.setText("");
	}

	/**
	 * Builds Y axis.
	 */
	protected void buildYAxis() {
		IAxis yAxis = this.chart.getAxisSet().getYAxis(0);
		yAxis.getTitle().setText("");
		yAxis.getGrid().setStyle(LineStyle.SOLID);
		yAxis.getTick().setForeground(BLACK);
	}

	/**
	 * Builds X series.
	 */
	protected void buildXSeries() {
		Object data[][] = adapter.getData();
		if (data == null || data.length == 0)
			return;

		int totalMaxItems = (int)Math.round(this.maxItems * scale);
		int start = 0, len = Math.min(totalMaxItems, data.length);
		if (totalMaxItems < data.length) {
			start = data.length - totalMaxItems;
		}

		double[] valx = new double[len];
		double[][] valy = new double[data[0].length-1][len];

		ISeries allSeries[] = chart.getSeriesSet().getSeries();
		for (int i = 0; i < valx.length; i++)
			for (int j = 0; j < data[start + i].length; j++) {
				if (j == 0)
					valx[i] = getDoubleValue(data[start + i][j]);
				else
					valy[j-1][i] = getDoubleValue(data[start + i][j]);
			}

		for (int i = 0; i < valy.length; i++) {
			ISeries series;
			if (i >= allSeries.length) {
				series = createChartISeries(i);
			} else {
				series = chart.getSeriesSet().getSeries()[i];
			}
			series.setXSeries(valx);
			series.setYSeries(valy[i]);
		}

		chart.getAxisSet().adjustRange();
		chart.redraw();
	}

	/*
	 * Create a chart series for that chart.
	 */
	protected ISeries createChartISeries(int i) {
		return null;
	}
}
