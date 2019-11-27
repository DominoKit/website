package org.dominokit.website.layout.client;

import java.lang.Override;
import javax.annotation.Generated;
import org.dominokit.domino.api.client.InitialTaskRegistry;
import org.dominokit.domino.api.client.ModuleConfiguration;
import org.dominokit.domino.api.client.mvp.presenter.ViewablePresenterSupplier;
import org.dominokit.website.layout.client.presenters.HomeProxy_Presenter;
import org.dominokit.website.layout.client.presenters.HomeProxy_Presenter_Config;
import org.dominokit.website.layout.client.presenters.LayoutProxy_Presenter;
import org.dominokit.website.layout.client.presenters.LayoutProxy_Presenter_Config;
import org.dominokit.website.layout.client.routing.HomeProxy_PresenterHistoryListenerTask;
import org.dominokit.website.layout.client.routing.LayoutProxy_PresenterHistoryListenerTask;
import org.dominokit.website.layout.client.views.HomeView;
import org.dominokit.website.layout.client.views.LayoutView;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.client.processors.module.client.ClientModuleAnnotationProcessor")
public class LayoutModuleConfiguration implements ModuleConfiguration {
  @Override
  public void registerPresenters() {
    HomeProxy_Presenter_Config homeProxy_Presenter_Config = new HomeProxy_Presenter_Config();
    homeProxy_Presenter_Config.setPresenterSupplier(new ViewablePresenterSupplier<HomeProxy_Presenter, HomeView>(false, ()-> new HomeProxy_Presenter()));

    LayoutProxy_Presenter_Config layoutProxy_Presenter_Config = new LayoutProxy_Presenter_Config();
    layoutProxy_Presenter_Config.setPresenterSupplier(new ViewablePresenterSupplier<LayoutProxy_Presenter, LayoutView>(true, ()-> new LayoutProxy_Presenter()));

  }

  @Override
  public void registerInitialTasks(InitialTaskRegistry registry) {
    registry.registerInitialTask(new HomeProxy_PresenterHistoryListenerTask());
    registry.registerInitialTask(new LayoutProxy_PresenterHistoryListenerTask());
  }
}
