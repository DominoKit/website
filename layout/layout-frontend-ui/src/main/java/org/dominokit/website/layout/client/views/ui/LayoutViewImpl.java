package org.dominokit.website.layout.client.views.ui;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.api.client.annotations.UiView;
import org.dominokit.domino.api.client.mvp.slots.IsSlot;
import org.dominokit.domino.ui.Typography.Paragraph;
import org.dominokit.domino.ui.forms.FieldStyle;
import org.dominokit.domino.ui.forms.TextBox;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.grid.flex.FlexAlign;
import org.dominokit.domino.ui.grid.flex.FlexDirection;
import org.dominokit.domino.ui.grid.flex.FlexItem;
import org.dominokit.domino.ui.grid.flex.FlexLayout;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.mediaquery.MediaQuery;
import org.dominokit.domino.ui.style.Color;
import org.dominokit.domino.ui.style.ColorScheme;
import org.dominokit.domino.ui.style.Styles;
import org.dominokit.domino.ui.themes.Theme;
import org.dominokit.domino.ui.utils.DominoElement;
import org.dominokit.domino.view.BaseElementView;
import org.dominokit.domino.view.slots.SingleElementSlot;
import org.dominokit.website.layout.client.presenters.LayoutProxy;
import org.dominokit.website.layout.client.views.LayoutView;
import org.dominokit.website.layout.client.views.ui.components.GithubButton;
import org.gwtproject.safehtml.shared.SafeHtmlBuilder;

import static org.jboss.gwt.elemento.core.Elements.*;

@UiView(presentable = LayoutProxy.class)
public class LayoutViewImpl extends BaseElementView<HTMLDivElement> implements LayoutView {

    private Layout layout;
    private DominoElement<HTMLDivElement> header;

    @Override
    public void init(HTMLDivElement root) {
        new Theme(ColorScheme.BLUE_GREY).apply();
        layout.disableLeftPanel();
        initHeader();
        initFooter();
    }

    private void initHeader() {
        layout.setLogo(img("/static/logo.png").css("logo-img"));

        header = DominoElement.div();
        TextBox searchBox = TextBox.create()
                .setFieldStyle(FieldStyle.ROUNDED)
                .addLeftAddOn(Icons.ALL.search().setColor(Color.WHITE))
                .addCss("search-box");

        header.appendChild(FlexLayout.create()
                .styler(style -> style.setHeight("55px"))
                .setDirection(FlexDirection.RIGHT_TO_LEFT)
                .appendChild(createHeaderItem()
                        .appendChild(clickableItem("Team"))
                )
                .appendChild(createHeaderItem()
                        .appendChild(clickableItem("Documentation"))
                )
                .appendChild(createHeaderItem()
                        .appendChild(searchBox)
                )
        );

        MediaQuery.addOnMediumAndUpListener(() -> {
            header.show();
        });

        MediaQuery.addOnMediumAndDownListener(() -> {
            header.hide();
        });

        layout.getTopBar().appendChild(header);
    }

    private void initFooter() {
        Row footerRow = createFooterRow();
        layout.getFooter().appendChild(footerRow);
        HTMLDivElement copyrightsElement = div()
                .css(Theme.currentTheme.getScheme().darker_3().getBackground())
                .css(Styles.align_center)
                .add(p().style("line-height: 45px; height: 45px; margin: 0px;")
                        .textContent("© 2018 Copyright DominoKit")).asElement();

        layout.getFooter().appendChild(copyrightsElement);
        layout.showFooter();
    }

    private Row createFooterRow() {
        return Row.create()
                .style()
                .setMargin("0px")
                .add("app-footer")
                .get()
                .addColumn(Column.span4()
                        .style()
                        .setMarginBottom("20px")
                        .get()
                        .appendChild(h(4)
                                .textContent("Support us")
                        )
                        .appendChild(p().textContent("Your donation will help us to continue working on domino-ui and let it grow to meet your needs, and is highly appreciated."))
                        .appendChild(div().innerHtml(new SafeHtmlBuilder().appendHtmlConstant("<form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"_top\">\n" +
                                "<input type=\"hidden\" name=\"cmd\" value=\"_s-xclick\" />\n" +
                                "<input type=\"hidden\" name=\"lc\" value=\"US\" />\n" +
                                "<input type=\"hidden\" name=\"hosted_button_id\" value=\"AW5YG4LTTYNPS\" />\n" +
                                "<input type=\"image\" src=\"https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif\" border=\"0\" name=\"submit\" title=\"PayPal - The safer, easier way to pay online!\" alt=\"Donate with PayPal button\" />\n" +
                                "<img alt=\"\" border=\"0\" src=\"https://www.paypal.com/en_JO/i/scr/pixel.gif\" width=\"1\" height=\"1\" />\n" +
                                "</form>\n").toSafeHtml()))
                )
                .addColumn(Column.span4()
                        .style()
                        .setMarginBottom("20px")
                        .get()
                        .appendChild(h(4)
                                .textContent("Join discussions")
                        )
                        .appendChild(p().textContent("Join our Gitter channel for positive discussions, feedback, announcements and ask questions, it is lively in there."))
                        .appendChild(p().innerHtml(new SafeHtmlBuilder().appendHtmlConstant("<a title=\"Gitter\" href=\"https://gitter.im/domino-gwt/domino-ui\" rel=\"nofollow\"><img src=\"https://camo.githubusercontent.com/da2edb525cde1455a622c58c0effc3a90b9a181c/68747470733a2f2f6261646765732e6769747465722e696d2f4a6f696e253230436861742e737667\" data-canonical-src=\"https://badges.gitter.im/Join%20Chat.svg\" style=\"max-width:100%;\"></a>").toSafeHtml()))
                )
                .addColumn(Column.span4()
                        .style()
                        .setMarginBottom("20px")
                        .get()
                        .appendChild(h(4)
                                .textContent("Our repository")
                        )
                        .appendChild(p().textContent("Contribute to our libraries at our official Dominokit Github organization by forking, making pull requests or filing issues."))
                        .appendChild(GithubButton.createWhite())
                );
    }

    private Paragraph clickableItem(String team) {
        return Paragraph.create(team)
                .addCss("clickable-header-item");
    }

    private FlexItem createHeaderItem() {
        return FlexItem.create()
                .setAlignSelf(FlexAlign.CENTER)
                .styler(style -> style.setMarginRight("10px")
                        .setMarginLeft("10px"));
    }

    @Override
    public HTMLDivElement createRoot() {
        layout = Layout.create("Dominokit");
        return layout.asElement();
    }

    @Override
    public IsSlot<?> getContentSlot() {
        return SingleElementSlot.of(layout.getContentPanel());
    }
}