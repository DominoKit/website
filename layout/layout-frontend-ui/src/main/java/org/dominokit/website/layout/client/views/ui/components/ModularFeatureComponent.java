package org.dominokit.website.layout.client.views.ui.components;

import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLLIElement;
import org.dominokit.domino.ui.Typography.Paragraph;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;
import org.jboss.gwt.elemento.core.builder.HtmlContentBuilder;

import static org.jboss.gwt.elemento.core.Elements.img;
import static org.jboss.gwt.elemento.core.Elements.li;

public class ModularFeatureComponent extends BaseDominoElement<HTMLElement, ModularFeatureComponent> {

    private DominoElement<HTMLDivElement> root = DominoElement.div().css("feature");

    public static ModularFeatureComponent create() {
        return new ModularFeatureComponent();
    }

    public ModularFeatureComponent() {
        root
                .appendChild(Row.create()
                        .appendChild(Column.span7()
                                .appendChild(Row.create()
                                        .appendChild(Column.span12()
                                                .appendChild(Paragraph.create("Dominokit is modular")
                                                        .css("feature-title"))
                                        )
                                )
                                .appendChild(Row.create()
                                        .appendChild(Column.span10()
                                                .appendChild(Paragraph
                                                        .create("Dominokit is a set of tools that focus on different part of your application lifecycle, " +
                                                                "each module can be used separately, yet using them all together gives amazing result.")
                                                        .addCss("feature-text"))
                                        )
                                )
                                .appendChild(Row.create()
                                        .appendChild(Column.span10()
                                                .appendChild(point("Domino MVP"))
                                                .appendChild(point("Domino UI"))
                                                .appendChild(point("Domino REST"))
                                                .appendChild(point("Domino History"))
                                                .appendChild(point("Domino Jackson"))
                                                .appendChild(point("Domino Aggregator"))
                                        )
                                )
                        )
                        .appendChild(Column.span5()
                                .appendChild(Column.span6()
                                        .appendChild(img("./images/modularity.png")
                                                .css("modular-feature-image")
                                        )
                                )
                        )
                );
    }

    private HtmlContentBuilder<HTMLLIElement> point(String text) {
        return li().textContent(text);
    }

    @Override
    public HTMLElement asElement() {
        return root.asElement();
    }
}
