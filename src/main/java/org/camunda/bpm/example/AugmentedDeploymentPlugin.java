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

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;
import org.camunda.commons.logging.BaseLogger;

/**
 * Set these two loggers to DEBUG:
 *
 * <ul>
 * <li>org.camunda.bpm.application
 * <li>org.camunda.bpm.engine.plugin.deployment
 * <li>org.camunda.bpm.engine.impl.persistence.entity.ProcessDefinitionEntity.selectProcessDefinitionByKeyIn
 *
 * @author Thorben Lindhauer
 *
 */
public class AugmentedDeploymentPlugin implements ProcessEnginePlugin {

  public static final AugmentedDeploymentLogger LOGGER = BaseLogger.createLogger(
      AugmentedDeploymentLogger.class, "999", "org.camunda.bpm.engine.plugin.deployment", "999");

  public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
    processEngineConfiguration.setRepositoryService(new AugmentedRepositoryService());
  }

  public void postInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
  }

  public void postProcessEngineBuild(ProcessEngine processEngine) {
  }

}
