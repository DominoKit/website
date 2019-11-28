package org.dominokit.website.layout.client.views.ui;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.api.client.annotations.UiView;
import org.dominokit.domino.ui.Typography.Paragraph;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.style.Color;
import org.dominokit.domino.ui.style.Styles;
import org.dominokit.domino.ui.themes.Theme;
import org.dominokit.domino.ui.utils.DominoElement;
import org.dominokit.domino.view.BaseElementView;
import org.dominokit.website.layout.client.presenters.CommunityProxy;
import org.dominokit.website.layout.client.views.CommunityView;
import org.dominokit.website.layout.client.views.ui.components.MainCaption;

import static org.jboss.gwt.elemento.core.Elements.*;

@UiView(presentable = CommunityProxy.class)
public class CommunityViewImpl extends BaseElementView<HTMLDivElement> implements CommunityView {

    private DominoElement<HTMLDivElement> root = DominoElement.div();
    private DominoElement<HTMLDivElement> getHelpContainer = DominoElement.div().addCss("get-help-container");
    private DominoElement<HTMLDivElement> teamContainer = DominoElement.div().addCss("team-container");

    @Override
    protected void init(HTMLDivElement element) {
        root.appendChild(MainCaption.create("Without the community we are nothing."));
        root.appendChild(getHelpContainer
                .addCss(Color.GREY_LIGHTEN_3.getBackground())
                .appendChild(Row.create()
                        .appendChild(Column.span12()
                                .centerContent()
                                .appendChild(h(3)
                                        .css("section-title")
                                        .textContent("We are building users and developers community, so why not be a part of it?"))
                        )
                )
                .appendChild(Row.create()
                        .appendChild(createCommunityItem("User group",
                                "A Google Group for users. Post a message if you need help or to report problems.",
                                "https://groups.google.com/forum/#!forum/dominokit")
                                .offset2())
                        .appendChild(createCommunityItem("Stack Overflow",
                                "Mark your questions with the Dominokit tag and we'll answer you.",
                                "https://stackoverflow.com/questions/tagged/domino-ui"))
                )
                .appendChild(Row.create()
                        .appendChild(createCommunityItem("Gitter Channel",
                                "Come and chat with other users.",
                                "https://gitter.im/domino-gwt/domino-ui")
                                .offset2())
                        .appendChild(createCommunityItem("Bug reports",
                                "Having a problem or need a new feature? File a new issue.",
                                "https://github.com/DominoKit"))
                )
        );

        root.appendChild(teamContainer
                .appendChild(Row.create()
                        .appendChild(Column.span12()
                                .centerContent()
                                .appendChild(h(3)
                                        .css("section-title")
                                        .textContent("Meet our team"))
                        )
                )
                .appendChild(Row.create()
                        .appendChild(Column.span5()
                                .offset1()
                                .styler(style -> style.add(Styles.align_center))
                                .appendChild(img("./images/authors/Ahmad.Bawaneh.jpg").css(Styles.img_responsive, "person-pic"))
                                .appendChild(h(3).textContent("Ahmad Bawaneh"))
                                .appendChild(Paragraph.create("Java developer with 11 years experience in building enterprise web application, works on both frontend and backend, and is big fan of GWT"))
                                .appendChild(div()
                                        .add(a()
                                                .attr("href", "https://www.linkedin.com/in/ahmad-bawaneh")
                                                .attr("target", "_blank")
                                                .add(img("./images/authors/linkedin.png")
                                                        .css(Styles.cursor_pointer)))
                                        .add(a()
                                                .attr("href", "https://github.com/vegegoku")
                                                .attr("target", "_blank")
                                                .add(img("./images/authors/github.png")
                                                        .css(Styles.cursor_pointer))))
                        )
                        .appendChild(Column.span5()
                                .styler(style -> style.add(Styles.align_center))
                                .appendChild(img("./images/authors/Rafat.albarouki.jpg").css(Styles.img_responsive, "person-pic"))
                                .appendChild(h(3).textContent("Rafat Al-Barouki"))
                                .appendChild(Paragraph.create("Java developer with 5 years experience in building enterprise web application, works on both frontend and backend, and is big fan of GWT"))
                                .appendChild(div()
                                        .add(a()
                                                .attr("href", "https://www.linkedin.com/in/rafat-al-barouki")
                                                .attr("target", "_blank")
                                                .add(img("./images/authors/linkedin.png")
                                                        .css(Styles.cursor_pointer)))
                                        .add(a()
                                                .attr("href", "https://github.com/rjeeb")
                                                .attr("target", "_blank")
                                                .add(img("./images/authors/github.png")
                                                        .css(Styles.cursor_pointer))))
                        )

                )
        );
    }

    private Column createCommunityItem(String title, String content, String url) {
        return Column.span4()
                .styler(style -> style.setPadding("10px 20px"))
                .appendChild(a()
                        .attr("href", url)
                        .attr("target", "_blank")
                        .add(h(3).textContent(title))
                        .css(Theme.currentTheme.getScheme().color().getStyle()))
                .appendChild(Paragraph.create(content));
    }

    @Override
    public HTMLDivElement createRoot() {
        return root.asElement();
    }
}
