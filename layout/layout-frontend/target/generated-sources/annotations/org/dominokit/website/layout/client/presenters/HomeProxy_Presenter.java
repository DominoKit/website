package org.dominokit.website.layout.client.presenters;

import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.dominokit.domino.api.client.annotations.presenter.AutoReveal;
import org.dominokit.domino.api.client.annotations.presenter.AutoRoute;
import org.dominokit.domino.api.client.annotations.presenter.Presenter;
import org.dominokit.domino.api.client.annotations.presenter.Slot;
import org.dominokit.domino.api.shared.extension.DominoEvent;
import org.dominokit.domino.api.shared.extension.DominoEventListener;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.client.processors.module.client.presenters.PresenterProcessor")
@Presenter
@AutoRoute(
    token = "home",
    routeOnce = false,
    reRouteActivated = false
)
@AutoReveal
@Slot("content")
public class HomeProxy_Presenter extends HomeProxy {
  @Override
  public String revealSlot() {
    return "content";
  }

  @Override
  protected Map<Class<? extends DominoEvent>, DominoEventListener> getListeners() {
    Map<Class<? extends DominoEvent>, DominoEventListener> listenersMap = new HashMap<>();
    return listenersMap;
  }
}
