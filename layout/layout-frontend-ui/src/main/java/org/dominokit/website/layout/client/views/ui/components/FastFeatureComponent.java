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

import static org.jboss.gwt.elemento.core.Elements.li;
import static org.jboss.gwt.elemento.core.Elements.ul;

public class FastFeatureComponent extends BaseDominoElement<HTMLElement, FastFeatureComponent> {

    private DominoElement<HTMLDivElement> root = DominoElement.div().css("feature");

    public static FastFeatureComponent create() {
        return new FastFeatureComponent();
    }

    public FastFeatureComponent() {
        root
                .appendChild(Row.create()
                        .appendChild(Column.span12()
                                .appendChild(Paragraph.create("Dominokit is fast")
                                        .css("feature-title"))
                        )
                )
                .appendChild(Row.create()
                        .appendChild(Column.span6()
                                .appendChild(Paragraph
                                        .create("Dominokit gives you incredible maintainability and agility to create intensive applications " +
                                                "in an impressive speed, with a minimum effort, in a very fun way.")
                                        .addCss("feature-text"))
                        )
                        .appendChild(Column.span6()
                                .appendChild(ul()
                                        .add(point("Dominokit is simple. Learning how to use our tools are straight forward."))
                                        .add(point("Dominokit is fast. Dominokit gives a set of APIs that help you to build what you need with a minimum effort."))
                                        .add(point("Dominokit is maintainable. Dominokit guides you to write your application in a maintainable way."))
                                )
                        )
                );
    }

    private HtmlContentBuilder<HTMLLIElement> point(String text) {
        return li().css("fast-feature-point").textContent(text);
    }

    @Override
    public HTMLElement asElement() {
        return root.asElement();
    }
}
