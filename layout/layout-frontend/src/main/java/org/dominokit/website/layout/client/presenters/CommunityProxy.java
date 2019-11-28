package org.dominokit.website.layout.client.presenters;

import org.dominokit.domino.api.client.annotations.presenter.*;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.website.layout.client.views.CommunityView;
import org.dominokit.website.layout.shared.events.LayoutReadyEvent;
import org.dominokit.website.layout.shared.model.LayoutSlots;

@PresenterProxy
@AutoRoute(token = "community")
@Slot(LayoutSlots.CONTENT)
@AutoReveal
@DependsOn(@EventsGroup(LayoutReadyEvent.class))
public class CommunityProxy extends ViewBaseClientPresenter<CommunityView> {
}
