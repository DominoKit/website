package org.dominokit.website.layout.client.views.ui.components;

import elemental2.dom.HTMLAnchorElement;
import elemental2.dom.HTMLElement;
import org.dominokit.domino.ui.button.Button;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.style.Color;
import org.dominokit.domino.ui.utils.BaseDominoElement;

import static org.jboss.gwt.elemento.core.Elements.a;

public class GithubButton extends BaseDominoElement<HTMLElement, GithubButton> {

    private HTMLAnchorElement anchorElement;

    public static GithubButton createWhite() {
        return new GithubButton(Color.WHITE);
    }

    public static GithubButton createBlack() {
        return new GithubButton(Color.BLACK);
    }

    public GithubButton(Color color) {
        Button githubButton = Button.create(Icons.ALL.github_circle_mdi())
                .setContent("Github")
                .setBackground(Color.TRANSPARENT)
                .setColor(color)
                .bordered();
        anchorElement = a()
                .attr("href", "https://github.com/DominoKit")
                .attr("target", "_blank")
                .add(githubButton)
                .asElement();
    }

    @Override
    public HTMLElement asElement() {
        return anchorElement;
    }
}
