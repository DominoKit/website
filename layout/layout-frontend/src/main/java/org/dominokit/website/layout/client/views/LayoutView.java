package org.dominokit.website.layout.client.views;

import org.dominokit.domino.api.client.mvp.view.ContentView;
import org.dominokit.domino.api.client.mvp.view.HasUiHandlers;
import org.dominokit.domino.api.client.mvp.view.UiHandlers;
import org.dominokit.website.layout.client.presenters.LayoutProxySlots;

import static org.dominokit.website.layout.client.views.LayoutView.LayoutUiHandlers;

public interface LayoutView extends ContentView, HasUiHandlers<LayoutUiHandlers>, LayoutProxySlots {

    interface LayoutUiHandlers extends UiHandlers {

        void onCommunitySelected();

        void onHomeSelected();
    }
}