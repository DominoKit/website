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
import org.dominokit.domino.api.client.annotations.presenter.Singleton;
import org.dominokit.domino.api.client.annotations.presenter.Slot;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.api.client.mvp.slots.SlotsEntries;
import org.dominokit.domino.api.shared.extension.DominoEvent;
import org.dominokit.domino.api.shared.extension.DominoEventListener;
import org.dominokit.website.layout.shared.events.LayoutReadyEvent;

/**
 * This is generated class, please don't modify
 */
@Generated("org.dominokit.domino.apt.client.processors.module.client.presenters.PresenterProcessor")
@Presenter
@AutoRoute(
    token = "",
    routeOnce = true,
    reRouteActivated = false
)
@AutoReveal
@Slot("document-body")
@Singleton(true)
public class LayoutProxy_Presenter extends LayoutProxy {
  @Override
  public String revealSlot() {
    return "document-body";
  }

  @Override
  public ViewBaseClientPresenter.RevealedHandler getRevealHandler() {
    return ()-> {
      navigateToHome();
    } ;
  }

  @Override
  protected Map<Class<? extends DominoEvent>, DominoEventListener> getListeners() {
    Map<Class<? extends DominoEvent>, DominoEventListener> listenersMap = new HashMap<>();
    return listenersMap;
  }

  @Override
  protected void fireActivationEvent(boolean state) {
    fireEvent(LayoutReadyEvent.class, new LayoutReadyEvent(state));
  }

  @Override
  protected SlotsEntries getSlots() {
    SlotsEntries slotsEntries = SlotsEntries.create();
    slotsEntries.add("content", view.getContentSlot());
    return slotsEntries;
  }
}
