package org.dominokit.website.layout.client.views.ui;

import elemental2.dom.HTMLAnchorElement;
import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.api.client.annotations.UiView;
import org.dominokit.domino.ui.Typography.Paragraph;
import org.dominokit.domino.ui.button.Button;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.grid.flex.*;
import org.dominokit.domino.ui.spin.HSpinSelect;
import org.dominokit.domino.ui.spin.SpinItem;
import org.dominokit.domino.ui.style.Color;
import org.dominokit.domino.ui.style.ColorScheme;
import org.dominokit.domino.ui.style.Elevation;
import org.dominokit.domino.ui.style.Styles;
import org.dominokit.domino.ui.utils.DominoElement;
import org.dominokit.domino.view.BaseElementView;
import org.dominokit.website.layout.client.presenters.HomeProxy;
import org.dominokit.website.layout.client.views.HomeView;
import org.dominokit.website.layout.client.views.ui.components.*;
import org.gwtproject.timer.client.Timer;
import org.jboss.gwt.elemento.core.builder.HtmlContentBuilder;

import static org.jboss.gwt.elemento.core.Elements.*;

@UiView(presentable = HomeProxy.class)
public class HomeViewImpl extends BaseElementView<HTMLDivElement> implements HomeView {

    private DominoElement<HTMLDivElement> element = DominoElement.div().addCss("home-container");
    private DominoElement<HTMLDivElement> featuresContainer = DominoElement.div().addCss("features-container");
    private DominoElement<HTMLDivElement> sponsorsContainer = DominoElement.div().addCss("sponsors-container");
    private DominoElement<HTMLDivElement> othersSayContainer = DominoElement.div().addCss("others-say-container");
    private DominoElement<HTMLDivElement> supportContainer = DominoElement.div().addCss("support-container");
    private int direction = 0;
    private HSpinSelect<String> spinSelect;

    @Override
    protected void init(HTMLDivElement root) {
        // main part
        initOthersSaySection();
        element
                .appendChild(MainCaption.create("A toolkit for building maintainable applications in the browser.")
                        .appendChild(FlexItem.create()
                                .setAlignSelf(FlexAlign.CENTER)
                                .appendChild(GithubButton.createBlack())
                        )
                )
                .appendChild(featuresContainer
                        .appendChild(Row.create()
                                .addCss(Color.GREY_LIGHTEN_3.getBackground())
                                .appendChild(Column.span8()
                                        .offset2()
                                        .appendChild(TypeSafetyComponent.create())
                                )
                        )
                        .appendChild(Row.create()
                                .appendChild(Column.span8()
                                        .offset2()
                                        .appendChild(FastFeatureComponent.create())
                                )
                        )
                        .appendChild(Row.create()
                                .addCss(Color.GREY_LIGHTEN_3.getBackground())
                                .appendChild(Column.span8()
                                        .offset2()
                                        .appendChild(ModularFeatureComponent.create())
                                )
                        )
                )
                .appendChild(sponsorsContainer
                        .appendChild(FlexLayout.create()
                                .setJustifyContent(FlexJustifyContent.CENTER)
                                .setDirection(FlexDirection.TOP_TO_BOTTOM)
                                .appendChild(FlexItem.create()
                                        .appendChild(h(3)
                                                .css("section-title").textContent("Sponsors and supporters"))
                                )
                                .appendChild(FlexItem.create()
                                        .appendChild(Row.create()
                                                .appendChild(Column.span4()
                                                        .appendChild(sponsorItem("https://www.vertispan.com/", "./images/sponsors/vertispan.png")))
                                                .appendChild(Column.span4()
                                                        .appendChild(sponsorItem("https://www.progressoft.com/", "./images/sponsors/ProgressSoft.png")))
                                                .appendChild(Column.span4()
                                                        .appendChild(sponsorItem("https://www.ej-technologies.com/products/install4j/overview.html", "./images/sponsors/install4j_large.png")))
                                        )
                                )
                        )
                )
                .appendChild(othersSayContainer
                        .addCss(Color.GREY_LIGHTEN_3.getBackground())
                        .appendChild(h(3)
                                .css("section-title").textContent("What others say"))
                        .appendChild(spinSelect)
                )
                .appendChild(supportContainer
                        .appendChild(h(3)
                                .css("section-title").textContent("Official Support?"))
                        .appendChild(Paragraph.create("Need help troubleshooting or improving your code? " +
                                "Need custom components or new features? " +
                                "Work directly with the engineers behind Dominokit.")
                                .addCss("support-text"))
                        .appendChild(FlexLayout.create()
                                .setJustifyContent(FlexJustifyContent.CENTER)
                                .appendChild(FlexItem.create()
                                        .appendChild(a()
                                                .attr("href", "https://www.vertispan.com/services")
                                                .attr("target", "_blank")
                                                .add(Button.createDefault("Get paid support")
                                                        .setColor(Color.BLUE)
                                                        .large()
                                                        .bordered()))
                                )
                        )
                );
    }

    private void initOthersSaySection() {
        spinSelect = HSpinSelect.<String>create()
                .appendChild(SpinItem.create("", DominoElement.of(div().css(Styles.align_center))
                        .appendChild(img("https://secure.gravatar.com/avatar/7ec73ac46e7215d35633a18d134f44e7")
                                .css(Styles.img_responsive, "person-pic", "quote-pic", Elevation.LEVEL_1.getStyle()))
                        .appendChild(h(3).textContent("Flavio Castro"))
                        .appendChild(Paragraph.create("After years working with GWT, Domino-ui came to the rescue, making the developers lives easier while providing a better and faster experience to the users."))
                        .appendChild(Paragraph.create("- Tech Leader / Architect @ Ardan1")
                                .styler(style -> style.add(Styles.font_12)
                                        .add(ColorScheme.GREY.darker_3().getStyle()))
                                .italic())))
                .appendChild(SpinItem.create("", DominoElement.of(div().css(Styles.align_center))
                        .appendChild(img("./images/raul.jpg")
                                .css(Styles.img_responsive, "person-pic", "quote-pic", Elevation.LEVEL_1.getStyle()))
                        .appendChild(h(3).textContent("Raúl Pampliega Mayoral"))
                        .appendChild(Paragraph.create("After trying out several ways to modernize our UI layer, Domino-ui make us really fast and it looks and feel amazing."))
                        .appendChild(Paragraph.create("- Software Engineer @ Babcock MCS Spain")
                                .styler(style -> style.add(Styles.font_12)
                                        .add(ColorScheme.GREY.darker_3().getStyle()))
                                .italic())))
                .appendChild(SpinItem.create("", DominoElement.of(div().css(Styles.align_center))
                        .appendChild(img("./images/anas-zahran.jpg")
                                .css(Styles.img_responsive, "person-pic", "quote-pic", Elevation.LEVEL_1.getStyle()))
                        .appendChild(h(3).textContent("Anas Zahran"))
                        .appendChild(Paragraph.create("Domino-ui can smoothly reduce the lines of code required to create a cross browser web application."))
                        .appendChild(Paragraph.create("- Technologist @ Progressoft")
                                .styler(style -> style.add(Styles.font_12)
                                        .add(ColorScheme.GREY.darker_3().getStyle()))
                                .italic())))
                .appendChild(SpinItem.create("", DominoElement.of(div().css(Styles.align_center))
                        .appendChild(img("./images/saif-badran.jpg")
                                .css(Styles.img_responsive, "person-pic", "quote-pic", Elevation.LEVEL_1.getStyle()))
                        .appendChild(h(3).textContent("Saif Badran"))
                        .appendChild(Paragraph.create("Domino-ui made it so simple. It's a real pleasure working on it, the way it generates professional, user-friendly interfaces is impressive!."))
                        .appendChild(Paragraph.create("- Software Engineer @ Progressoft")
                                .styler(style -> style.add(Styles.font_12)
                                        .add(ColorScheme.GREY.darker_3().getStyle()))
                                .italic())))
                .appendChild(SpinItem.create("", DominoElement.of(div().css(Styles.align_center))
                        .appendChild(img("./images/hadil-kayyali.jpeg")
                                .css(Styles.img_responsive, "person-pic", "quote-pic", Elevation.LEVEL_1.getStyle()))
                        .appendChild(h(3).textContent("Hadil Khalaf Kayyali"))
                        .appendChild(Paragraph.create("As a business non technical person ,implementing the UI requirements on Domino was a successful user friendly implementation that is not customary in other software languages. Implementation was quick and changes were instantaneous."))
                        .appendChild(Paragraph.create("- Senior  Banking Consultant")
                                .styler(style -> style.add(Styles.font_12)
                                        .add(ColorScheme.GREY.darker_3().getStyle()))
                                .italic())));

        Timer timer = new Timer() {
            @Override
            public void run() {
                SpinItem<String> activeItem = spinSelect.getActiveItem();
                if (spinSelect.isLastItem(activeItem)) {
                    direction = 2;
                } else if (spinSelect.isFirstItem(activeItem)) {
                    direction = 1;
                }

                if (direction == 1) {
                    spinSelect.moveForward();
                } else {
                    spinSelect.moveBack();
                }
            }
        };
        spinSelect.onNavigate(direction -> {
            if (timer.isRunning()) {
                timer.cancel();
                timer.scheduleRepeating(10000);
            }
        });

        timer.scheduleRepeating(10000);
    }

    private HtmlContentBuilder<HTMLAnchorElement> sponsorItem(String s, String s2) {
        return a()
                .css("sponsor-item")
                .attr("href", s)
                .attr("target", "_blank")
                .add(img(s2)
                        .style("width: 200px; margin-left:auto; margin-right:auto;")
                        .css(Styles.img_responsive, Styles.cursor_pointer));
    }

    @Override
    public HTMLDivElement createRoot() {
        return element.asElement();
    }
}
