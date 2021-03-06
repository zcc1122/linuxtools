/*******************************************************************************
 * Copyright (c) 2015, 2016 Red Hat Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat - Initial Contribution
 *******************************************************************************/

package org.eclipse.linuxtools.internal.docker.ui.launch;

import static org.eclipse.linuxtools.docker.core.IDockerImageBuildOptions.DOCKER_CONNECTION;
import static org.eclipse.linuxtools.docker.core.IDockerImageBuildOptions.FORCE_RM_INTERMEDIATE_CONTAINERS;
import static org.eclipse.linuxtools.docker.core.IDockerImageBuildOptions.NO_CACHE;
import static org.eclipse.linuxtools.docker.core.IDockerImageBuildOptions.QUIET_BUILD;
import static org.eclipse.linuxtools.docker.core.IDockerImageBuildOptions.REPO_NAME;
import static org.eclipse.linuxtools.docker.core.IDockerImageBuildOptions.RM_INTERMEDIATE_CONTAINERS;
import static org.eclipse.linuxtools.internal.docker.ui.launch.IBuildDockerImageLaunchConfigurationConstants.SOURCE_PATH_LOCATION;
import static org.eclipse.linuxtools.internal.docker.ui.launch.IBuildDockerImageLaunchConfigurationConstants.SOURCE_PATH_WORKSPACE_RELATIVE_LOCATION;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchGroup;
import org.eclipse.linuxtools.docker.core.DockerConnectionManager;
import org.eclipse.linuxtools.docker.core.IDockerConnection;
import org.eclipse.linuxtools.internal.docker.ui.jobs.BuildDockerImageJob;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

/**
 * The {@link ILaunchConfigurationDelegate} to trigger the build of a Docker
 * Image.
 *
 */
public class BuildDockerImageLaunchConfigurationDelegate
		implements ILaunchConfigurationDelegate {

	@Override
	public void launch(final ILaunchConfiguration configuration,
			final String mode, final ILaunch launch,
			final IProgressMonitor monitor) throws CoreException {
		final String sourcePathLocation = configuration
				.getAttribute(SOURCE_PATH_LOCATION, (String) null);
		final boolean sourcePathWorkspaceRelativeLocation = configuration
				.getAttribute(SOURCE_PATH_WORKSPACE_RELATIVE_LOCATION,
						false);
		final IPath sourcePath = BuildDockerImageUtils.getPath(
				sourcePathLocation,
				sourcePathWorkspaceRelativeLocation);
		final String connectionName = configuration
				.getAttribute(DOCKER_CONNECTION, (String) null);
		final String repoName = configuration.getAttribute(REPO_NAME,
				(String) null);
		final IDockerConnection connection = DockerConnectionManager
				.getInstance().getConnectionByName(connectionName);
		final Map<String, Object> buildOptions = new HashMap<>();
		buildOptions.put(QUIET_BUILD,
				configuration.getAttribute(QUIET_BUILD, false));
		buildOptions.put(NO_CACHE, configuration.getAttribute(NO_CACHE, false));
		buildOptions.put(RM_INTERMEDIATE_CONTAINERS, configuration
				.getAttribute(RM_INTERMEDIATE_CONTAINERS, true));
		buildOptions.put(FORCE_RM_INTERMEDIATE_CONTAINERS, configuration
				.getAttribute(FORCE_RM_INTERMEDIATE_CONTAINERS, false));
		if (connection != null && sourcePath != null) {
			final Job buildImageJob = new BuildDockerImageJob(connection,
					sourcePath, repoName, buildOptions);
			buildImageJob.schedule();
		} else {
			final ILaunchGroup launchGroup = DebugUITools
					.getLaunchGroup(configuration, "run"); //$NON-NLS-1$
			// prompt the user with the launch configuration editor
			Display.getDefault()
					.syncExec(() -> DebugUITools.openLaunchConfigurationDialog(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow()
									.getShell(),
							configuration, launchGroup.getIdentifier(), null));

		}
	}

}
