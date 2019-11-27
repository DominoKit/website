package org.dominokit.website.layout.client.views.ui.components;

import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLPreElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

import static org.jboss.gwt.elemento.core.Elements.pre;

public class CodeBlock extends BaseDominoElement<HTMLElement, CodeBlock> {

    private final DominoElement<HTMLPreElement> codeBlock;

    public static CodeBlock create(String code) {
        return new CodeBlock(code);
    }

    private CodeBlock(String code) {
        codeBlock = DominoElement.of(pre())
                .css("prettyprint")
                .css("code-block")
                .setInnerHtml(PR.prettyPrintOne(code, null, false));
        init(this);
    }

    @Override
    public HTMLElement asElement() {
        return codeBlock.asElement();
    }
}
