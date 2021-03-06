/*
 *     Copyright 2017 Hewlett-Packard Development Company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.hp.octane.integrations;

import com.hp.octane.integrations.spi.CIPluginServices;
import com.hp.octane.integrations.dto.configuration.CIProxyConfiguration;
import com.hp.octane.integrations.dto.configuration.OctaneConfiguration;
import com.hp.octane.integrations.dto.general.CIJobsList;
import com.hp.octane.integrations.dto.general.CIPluginInfo;
import com.hp.octane.integrations.dto.general.CIServerInfo;
import com.hp.octane.integrations.dto.pipelines.BuildHistory;
import com.hp.octane.integrations.dto.pipelines.PipelineNode;
import com.hp.octane.integrations.dto.snapshots.SnapshotNode;
import com.hp.octane.integrations.dto.tests.TestsResult;
import org.junit.Test;

import java.io.File;

/**
 * Octane SDK tests
 */

public class OctaneSDKTest {

	@Test
	public void SDKTest_A() {
		OctaneSDK.init(new CIPluginServicesMockA(), false);
	}

	private class CIPluginServicesMockA implements CIPluginServices  {

		public CIServerInfo getServerInfo() {
			return null;
		}

		public CIPluginInfo getPluginInfo() {
			return null;
		}

		public File getAllowedOctaneStorage() {
			return null;
		}

		@Override
		public File getPredictiveOctanePath() {
			return null;
		}

		public OctaneConfiguration getOctaneConfiguration() {
			return null;
		}

		public CIProxyConfiguration getProxyConfiguration(String targetHost) {
			return null;
		}

		public CIJobsList getJobsList(boolean includeParameters) {
			return null;
		}

		public PipelineNode getPipeline(String rootCIJobId) {
			return null;
		}

		public void runPipeline(String ciJobId, String originalBody) {

		}

		public SnapshotNode getSnapshotLatest(String ciJobId, boolean subTree) {
			return null;
		}

		public SnapshotNode getSnapshotByNumber(String ciJobId, String buildCiId, boolean subTree) {
			return null;
		}

		public BuildHistory getHistoryPipeline(String ciJobId, String originalBody) {
			return null;
		}

		public TestsResult getTestsResult(String jobId, String buildNumber) {
			return null;
		}
	}
}
