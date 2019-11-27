package org.dominokit.website.layout.client.presenters;

import java.lang.Override;
import java.util.function.Supplier;
import javax.annotation.Generated;
import org.dominokit.domino.api.client.mvp.ViewablePresenterConfig;
import org.dominokit.domino.api.client.mvp.presenter.ViewablePresenterSupplier;
import org.dominokit.website.layout.client.views.HomeView;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.client.processors.module.client.presenters.PresenterProcessor")
public class HomeProxy_Presenter_Config implements ViewablePresenterConfig<HomeProxy_Presenter, HomeView> {
  private static ViewablePresenterSupplier<HomeProxy_Presenter, HomeView> presenterSupplier;

  private static Supplier<HomeView> viewSupplier;

  public void setPresenterSupplier(ViewablePresenterSupplier<HomeProxy_Presenter, HomeView> presenterSupplier) {
    HomeProxy_Presenter_Config.presenterSupplier = presenterSupplier;
  }

  @Override
  public ViewablePresenterSupplier<HomeProxy_Presenter, HomeView> getPresenterSupplier() {
    return HomeProxy_Presenter_Config.presenterSupplier;
  }

  public void setViewSupplier(Supplier<HomeView> viewSupplier) {
    HomeProxy_Presenter_Config.viewSupplier = viewSupplier;
  }

  @Override
  public Supplier<HomeView> getViewSupplier() {
    return HomeProxy_Presenter_Config.viewSupplier;
  }
}
