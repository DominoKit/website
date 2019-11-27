package org.dominokit.website.layout.client.views.ui.components;

import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLElement;
import org.dominokit.domino.ui.Typography.Paragraph;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

public class TypeSafetyComponent extends BaseDominoElement<HTMLElement, TypeSafetyComponent> {

    private DominoElement<HTMLDivElement> root = DominoElement.div().css("feature");

    public static TypeSafetyComponent create() {
        return new TypeSafetyComponent();
    }

    public TypeSafetyComponent() {
        root
                .appendChild(Row.create()
                        .appendChild(Column.span12()
                                .appendChild(Paragraph.create("Dominokit is type safe")
                                        .css("feature-title"))
                        )
                )
                .appendChild(Row.create()
                        .appendChild(Column.span6()
                                .appendChild(Paragraph
                                        .create("Dominokit is Java based compiled to JavaScript, which means during development of the application " +
                                                "you have the power to refactor and keep your application maintainable all the time, " +
                                                "but also you develop your application with the mature set of all tool chain Java can provide, " +
                                                "this include extremely powerful IDEs and mature build tools like maven and gradle, " +
                                                "use Dominokit and bring your java team to the frontend world.")
                                        .addCss("feature-text"))
                        )
                        .appendChild(Column.span6()
                                .appendChild(CodeBlock.create("Row.create()\n" +
                                        "   .appendChild(Column.span6()\n" +
                                        "       .appendChild(TextBox.create())\n" +
                                        "   )\n" +
                                        "   .appendChild(Column.span6()\n" +
                                        "       .appendChild(Button.createPrimary(\"Submit\"))\n" +
                                        "   );")
                                        .addCss("type-safety-code"))
                        )
                );
    }

    @Override
    public HTMLElement asElement() {
        return root.asElement();
    }
}
