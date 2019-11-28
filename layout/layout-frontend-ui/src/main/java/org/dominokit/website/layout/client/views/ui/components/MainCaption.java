package org.dominokit.website.layout.client.views.ui.components;

import elemental2.dom.HTMLElement;
import org.dominokit.domino.ui.grid.flex.*;
import org.dominokit.domino.ui.utils.BaseDominoElement;

import static org.jboss.gwt.elemento.core.Elements.h;

public class MainCaption extends BaseDominoElement<HTMLElement, MainCaption> {

    private FlexLayout root;

    public static MainCaption create(String caption) {
        return new MainCaption(caption);
    }

    public MainCaption(String caption) {
        root = FlexLayout.create()
                .addCss("main-caption-container")
                .setJustifyContent(FlexJustifyContent.CENTER)
                .setWrap(FlexWrap.WRAP_TOP_TO_BOTTOM)
                .setDirection(FlexDirection.TOP_TO_BOTTOM)
                .appendChild(FlexItem.create()
                        .setAlignSelf(FlexAlign.CENTER)
                        .appendChild(h(1)
                                .css("main-caption")
                                .textContent(caption))
                );
        init(this);
    }

    @Override
    public HTMLElement asElement() {
        return root.asElement();
    }
}
