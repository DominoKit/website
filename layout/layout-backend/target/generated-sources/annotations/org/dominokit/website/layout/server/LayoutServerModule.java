package org.dominokit.website.layout.server;

import com.google.auto.service.AutoService;
import javax.annotation.Generated;
import org.dominokit.domino.api.server.config.ServerModuleConfiguration;
import org.dominokit.domino.api.server.resource.ResourceRegistry;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.server.ServerModuleAnnotationProcessor")
@AutoService(ServerModuleConfiguration.class)
public class LayoutServerModule implements ServerModuleConfiguration {
  @Override
  public void registerResources(ResourceRegistry registry) {
    registry.registerResource(org.dominokit.website.layout.server.resources.LayoutResource.class);
  }
}
