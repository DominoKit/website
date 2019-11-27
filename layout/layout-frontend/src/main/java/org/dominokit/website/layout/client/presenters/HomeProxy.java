package org.dominokit.website.layout.client.presenters;

import org.dominokit.domino.api.client.annotations.presenter.*;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.website.layout.client.views.HomeView;
import org.dominokit.website.layout.shared.events.LayoutReadyEvent;
import org.dominokit.website.layout.shared.model.LayoutSlots;

@PresenterProxy
@AutoRoute(token = "home")
@Slot(LayoutSlots.CONTENT)
@AutoReveal
@DependsOn(@EventsGroup(LayoutReadyEvent.class))
public class HomeProxy extends ViewBaseClientPresenter<HomeView> {
}
