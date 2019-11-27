package org.dominokit.website.layout.client;

import java.lang.Override;
import javax.annotation.Generated;
import org.dominokit.domino.api.client.ModuleConfiguration;
import org.dominokit.website.layout.client.presenters.HomeProxy_Presenter_Config;
import org.dominokit.website.layout.client.presenters.LayoutProxy_Presenter_Config;
import org.dominokit.website.layout.client.views.ui.HomeViewImpl;
import org.dominokit.website.layout.client.views.ui.LayoutViewImpl;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.client.processors.module.client.ClientModuleAnnotationProcessor")
public class LayoutUIModuleConfiguration implements ModuleConfiguration {
  @Override
  public void registerViews() {
    HomeProxy_Presenter_Config homeProxy_Presenter_Config = new HomeProxy_Presenter_Config();
    homeProxy_Presenter_Config.setViewSupplier(()-> new HomeViewImpl());
    LayoutProxy_Presenter_Config layoutProxy_Presenter_Config = new LayoutProxy_Presenter_Config();
    layoutProxy_Presenter_Config.setViewSupplier(()-> new LayoutViewImpl());
  }
}
