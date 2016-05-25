/*******************************************************************************
 * Copyright (c) 2016 Red Hat.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat - Initial Contribution
 *******************************************************************************/

package org.eclipse.linuxtools.internal.docker.ui.testutils.swt;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.junit.Assert;
import org.junit.rules.ExternalResource;

/**
 * 
 */
public class SWTBotViewRule extends ExternalResource {

	private final SWTWorkbenchBot bot = new SWTWorkbenchBot();

	private final String viewId;

	private SWTBotView botView = null;

	private IViewPart view = null;

	public SWTBotViewRule(final String viewId) {
		this.viewId = viewId;
	}

	@Override
	protected void before() throws Throwable {
		SWTUtils.asyncExec(() -> {
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(this.viewId);
			} catch (Exception e) {
				e.printStackTrace();
				Assert.fail("Failed to open view with id '" + this.viewId + "': " + e.getMessage());
			}
		});
		this.botView = this.bot.viewById(this.viewId);
		this.botView.show();
		this.view = this.botView.getViewReference().getView(true);
	}

	public SWTBotView bot() {
		return this.botView;
	}

	public <T> T view() {
		return (T) view;
	}
}