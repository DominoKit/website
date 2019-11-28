package org.dominokit.website.layout.client.presenters;

import org.dominokit.domino.api.client.annotations.presenter.*;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.api.shared.extension.MainDominoEvent;
import org.dominokit.website.layout.client.views.LayoutView;
import org.dominokit.website.layout.shared.events.LayoutReadyEvent;
import org.dominokit.website.layout.shared.model.LayoutSlots;

import static org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter.DOCUMENT_BODY;

@PresenterProxy
@Singleton
@AutoRoute(routeOnce = true)
@Slot(DOCUMENT_BODY)
@AutoReveal
@DependsOn(@EventsGroup(MainDominoEvent.class))
@RegisterSlots(LayoutSlots.CONTENT)
@OnStateChanged(LayoutReadyEvent.class)
public class LayoutProxy extends ViewBaseClientPresenter<LayoutView> implements LayoutView.LayoutUiHandlers {

    @OnReveal
    public void navigateToHome() {
        if (history().currentToken().isEmpty()) {
            onHomeSelected();
        }
    }

    @Override
    public void onCommunitySelected() {
        history().fireState("community");
    }

    @Override
    public void onHomeSelected() {
        history().fireState("home");
    }
}