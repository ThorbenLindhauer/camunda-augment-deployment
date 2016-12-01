/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.example;

import java.util.Arrays;
import java.util.Set;

import org.camunda.commons.logging.BaseLogger;

/**
 * @author Thorben Lindhauer
 *
 */
public class AugmentedDeploymentLogger extends BaseLogger {


  public void logResumePreviousVersionsBy(String resumptionOption) {
    logDebug("001", "Resuming previous deployments by {}", resumptionOption);
  }

  public void logPreviousDeploymentsWithSameName(Set<String> deploymentIds) {
    logDebug("002", "Deployments with same name: {}", Arrays.toString(deploymentIds.toArray()));
  }

  public void logDefinitionKeysForResumption(Set<String> resourceDefinitionKeys) {
    logDebug("003", "Searching for previous deployments that contain processes/cases with keys: {}", Arrays.toString(resourceDefinitionKeys.toArray()));
  }

  public void logPreviousDeploymentsWithSameResourceKey(Set<String> deploymentIds) {
    logDebug("004", "Deployments that contain resources with same keys: {}", Arrays.toString(deploymentIds.toArray()));
  }


}
