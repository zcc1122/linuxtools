/*******************************************************************************
 * Copyright (c) 2014 Red Hat.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat - Initial Contribution
 *******************************************************************************/
package org.eclipse.linuxtools.internal.docker.ui.preferences;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.linuxtools.docker.ui.Activator;
import org.eclipse.linuxtools.internal.docker.core.DockerMachine;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * The {@link IWorkbenchPreferencePage} for the Docker Machine settings.
 */
public class DockerMachinePreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	/**
	 * The {@link DirectoryFieldEditor} to select the installation directory for
	 * the {@code docker-machine} command.
	 */
	private DirectoryFieldEditor dockerMachineInstallDir;

	/**
	 * The {@link DirectoryFieldEditor} to select the installation directory for
	 * the underlying VM driver commands used by 'docker-machine'.
	 */
	private DirectoryFieldEditor vmDriverInstallDir;

	/**
	 * Constructor.
	 */
	public DockerMachinePreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription(PreferenceMessages.getString("DockerMachine.message")); //$NON-NLS-1$
	}

	@Override
	public void init(final IWorkbench workbench) {
	}

	@Override
	protected void createFieldEditors() {
		// installation directory for docker-machine
		this.dockerMachineInstallDir = new CustomDirectoryFieldEditor(
				PreferenceConstants.DOCKER_MACHINE_INSTALLATION_DIRECTORY,
				PreferenceMessages.getString("DockerMachinePath.label"), //$NON-NLS-1$
				getFieldEditorParent()) {
			@Override
			protected boolean checkState() {
				if (isEmptyStringAllowed()
						&& !this.getStringValue().isEmpty()) {
					final boolean validPath = super.checkState();
					if (!validPath) {
						return false;
					}
					if (!DockerMachine.getInstance()
							.checkPathToDockerMachine(this.getStringValue())) {
						setWarningMessage(NLS.bind(
								org.eclipse.linuxtools.docker.core.Messages.Docker_Machine_Command_Not_Found,
								this.getStringValue()));
						return true;
					}
				}
				setMessage(null);
				return true;
			}
		};
		addField(this.dockerMachineInstallDir);
		this.dockerMachineInstallDir.setPreferenceStore(getPreferenceStore());
		// allow empty value if docker-machine is not installed
		this.dockerMachineInstallDir.setEmptyStringAllowed(true);
		this.dockerMachineInstallDir
				.setValidateStrategy(StringFieldEditor.VALIDATE_ON_KEY_STROKE);
		this.dockerMachineInstallDir.setPage(this);
		this.dockerMachineInstallDir.setErrorMessage(
				PreferenceMessages.getString("DockerMachinePath.invalid.label")); //$NON-NLS-1$
		this.dockerMachineInstallDir.showErrorMessage();
		this.dockerMachineInstallDir.load();
		// installation directory for underlying VM driver
		this.vmDriverInstallDir = new CustomDirectoryFieldEditor(
				PreferenceConstants.VM_DRIVER_INSTALLATION_DIRECTORY,
				PreferenceMessages.getString("VMDriverPath.label"), //$NON-NLS-1$
				getFieldEditorParent());
		addField(this.vmDriverInstallDir);
		this.vmDriverInstallDir.setPreferenceStore(getPreferenceStore());
		// allow empty value if docker-machine is not installed
		this.vmDriverInstallDir.setPage(this);
		this.vmDriverInstallDir.setEmptyStringAllowed(true);
		this.vmDriverInstallDir.setErrorMessage(
				PreferenceMessages.getString("VMDriverPath.invalid.label")); //$NON-NLS-1$
		this.vmDriverInstallDir.showErrorMessage();
		this.vmDriverInstallDir
				.setValidateStrategy(StringFieldEditor.VALIDATE_ON_KEY_STROKE);
		this.vmDriverInstallDir.load();
	}

	private void setWarningMessage(final String message) {
		super.setMessage(message, IMessageProvider.WARNING);
	}

	/**
	 * Subclass of the {@link DirectoryFieldEditor} but with the
	 * {@link StringFieldEditor#VALIDATE_ON_KEY_STROKE} validation strategy.
	 */
	private static class CustomDirectoryFieldEditor
			extends DirectoryFieldEditor {

		public CustomDirectoryFieldEditor(String name, String labelText,
				Composite parent) {
			init(name, labelText);
			setErrorMessage(JFaceResources
					.getString("DirectoryFieldEditor.errorMessage"));//$NON-NLS-1$
			setChangeButtonText(JFaceResources.getString("openBrowse"));//$NON-NLS-1$
			setValidateStrategy(StringFieldEditor.VALIDATE_ON_KEY_STROKE);
			createControl(parent);
		}
		
		

	}
}