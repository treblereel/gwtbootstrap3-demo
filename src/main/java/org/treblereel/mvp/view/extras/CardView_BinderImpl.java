// Template file: org/treblereel/mvp/view/extras/CardView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.895")
public class CardView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.CardView>, org.treblereel.mvp.view.extras.CardView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("To use Bootstrap Cards, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.card.Card\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it card):")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("xmlns:card=\"urn:import:org.gwtbootstrap3.extras.card.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("Basic cards that flip to reveal a front and a back. Very basic implementation right now, if you require different animations, you can send a pull request or override the CSS.")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("The contents of the Front/Back can by anything. The Front/Back are containers, so feel free to do whatever is needed inside these!")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("Front")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("Back")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("&lt;card:Card width=\"100px\"&gt;\\n \\s\\s&lt;card:Front&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/card:Front&gt;\\n \\s\\s&lt;card:Back&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/card:Back&gt;\\n &lt;/card:Card&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
  }

  Template template = new CardView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.CardView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.CardView owner;


    public Widgets(final org.treblereel.mvp.view.extras.CardView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html2() {
      return template.html2();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html3() {
      return template.html3();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html4() {
      return template.html4();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html5() {
      return template.html5();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html6() {
      return template.html6();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html7() {
      return template.html7();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html8() {
      return template.html8();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html9() {
      return template.html9();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html10() {
      return template.html10();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html11() {
      return template.html11();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.CardView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.CardView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.CardView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.CardView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.CardView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.CardView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.CardView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_Row1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row1() {
      return build_f_Row1();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row1 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row1.add(get_f_Column2());

      return f_Row1;
    }

    /**
     * Getter for f_Column2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column2() {
      return build_f_Column2();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column2 = new org.gwtbootstrap3.client.ui.Column("XS_12");
      // Setup section.
      f_Column2.add(get_f_PageHeader3());
      f_Column2.add(get_f_BlockQuote4());
      f_Column2.add(get_f_Panel12());

      return f_Column2;
    }

    /**
     * Getter for f_PageHeader3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.PageHeader get_f_PageHeader3() {
      return build_f_PageHeader3();
    }
    private org.gwtbootstrap3.client.ui.PageHeader build_f_PageHeader3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PageHeader f_PageHeader3 = new org.gwtbootstrap3.client.ui.PageHeader();
      // Setup section.
      f_PageHeader3.setText("Cards");

      return f_PageHeader3;
    }

    /**
     * Getter for f_BlockQuote4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.BlockQuote get_f_BlockQuote4() {
      return build_f_BlockQuote4();
    }
    private org.gwtbootstrap3.client.ui.BlockQuote build_f_BlockQuote4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.BlockQuote f_BlockQuote4 = new org.gwtbootstrap3.client.ui.BlockQuote();
      // Setup section.
      f_BlockQuote4.add(get_f_Heading5());
      f_BlockQuote4.add(get_f_Paragraph6());
      f_BlockQuote4.add(get_f_PrettyPre7());
      f_BlockQuote4.add(get_f_Paragraph8());
      f_BlockQuote4.add(get_f_PrettyPre9());
      f_BlockQuote4.add(get_f_Paragraph10());
      f_BlockQuote4.add(get_f_PrettyPre11());
      f_BlockQuote4.addStyleName("" + get_style().danger() + "");

      return f_BlockQuote4;
    }

    /**
     * Getter for f_Heading5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading5() {
      return build_f_Heading5();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading5 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading5.addStyleName("" + get_style().marginFix() + "");
      f_Heading5.setText("Required for use");

      return f_Heading5;
    }

    /**
     * Getter for f_Paragraph6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph6() {
      return build_f_Paragraph6();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph6 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph6;
    }

    /**
     * Getter for f_PrettyPre7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre7() {
      return build_f_PrettyPre7();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre7() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre7 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre7.setHTML(template_html2().asString());
      f_PrettyPre7.addStyleName("lang-xml");

      return f_PrettyPre7;
    }

    /**
     * Getter for f_Paragraph8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph8() {
      return build_f_Paragraph8();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph8 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      return f_Paragraph8;
    }

    /**
     * Getter for f_PrettyPre9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre9() {
      return build_f_PrettyPre9();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre9() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre9 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre9.setHTML(template_html4().asString());
      f_PrettyPre9.addStyleName("lang-xml");

      return f_PrettyPre9;
    }

    /**
     * Getter for f_Paragraph10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph10() {
      return build_f_Paragraph10();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph10 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.

      return f_Paragraph10;
    }

    /**
     * Getter for f_PrettyPre11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre11() {
      return build_f_PrettyPre11();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre11() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre11 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre11.setHTML(template_html6().asString());
      f_PrettyPre11.addStyleName("lang-xml");

      return f_PrettyPre11;
    }

    /**
     * Getter for f_Panel12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel12() {
      return build_f_Panel12();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel12 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel12.add(get_f_PanelHeader13());
      f_Panel12.add(get_f_PanelBody15());
      f_Panel12.add(get_f_PanelFooter23());

      return f_Panel12;
    }

    /**
     * Getter for f_PanelHeader13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader13() {
      return build_f_PanelHeader13();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader13 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader13.add(get_f_Heading14());

      return f_PanelHeader13;
    }

    /**
     * Getter for f_Heading14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading14() {
      return build_f_Heading14();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading14 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading14.setText("How to Use");

      return f_Heading14;
    }

    /**
     * Getter for f_PanelBody15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody15() {
      return build_f_PanelBody15();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody15 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody15.add(get_f_Paragraph16());
      f_PanelBody15.add(get_f_Paragraph17());
      f_PanelBody15.add(get_f_Card18());

      return f_PanelBody15;
    }

    /**
     * Getter for f_Paragraph16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph16() {
      return build_f_Paragraph16();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph16 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html7().asString());
      // Setup section.

      return f_Paragraph16;
    }

    /**
     * Getter for f_Paragraph17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph17() {
      return build_f_Paragraph17();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph17 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html8().asString());
      // Setup section.

      return f_Paragraph17;
    }

    /**
     * Getter for f_Card18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.card.client.ui.Card get_f_Card18() {
      return build_f_Card18();
    }
    private org.gwtbootstrap3.extras.card.client.ui.Card build_f_Card18() {
      // Creation section.
      final org.gwtbootstrap3.extras.card.client.ui.Card f_Card18 = new org.gwtbootstrap3.extras.card.client.ui.Card();
      // Setup section.
      f_Card18.add(get_f_Front19());
      f_Card18.add(get_f_Back21());
      f_Card18.setWidth("100px");

      return f_Card18;
    }

    /**
     * Getter for f_Front19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.card.client.ui.Front get_f_Front19() {
      return build_f_Front19();
    }
    private org.gwtbootstrap3.extras.card.client.ui.Front build_f_Front19() {
      // Creation section.
      final org.gwtbootstrap3.extras.card.client.ui.Front f_Front19 = new org.gwtbootstrap3.extras.card.client.ui.Front();
      // Setup section.
      f_Front19.add(get_f_Span20());

      return f_Front19;
    }

    /**
     * Getter for f_Span20 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span20() {
      return build_f_Span20();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span20 = new org.gwtbootstrap3.client.ui.html.Span(template_html9().asString());
      // Setup section.

      return f_Span20;
    }

    /**
     * Getter for f_Back21 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.card.client.ui.Back get_f_Back21() {
      return build_f_Back21();
    }
    private org.gwtbootstrap3.extras.card.client.ui.Back build_f_Back21() {
      // Creation section.
      final org.gwtbootstrap3.extras.card.client.ui.Back f_Back21 = new org.gwtbootstrap3.extras.card.client.ui.Back();
      // Setup section.
      f_Back21.add(get_f_Span22());

      return f_Back21;
    }

    /**
     * Getter for f_Span22 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span22() {
      return build_f_Span22();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span22 = new org.gwtbootstrap3.client.ui.html.Span(template_html10().asString());
      // Setup section.

      return f_Span22;
    }

    /**
     * Getter for f_PanelFooter23 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter23() {
      return build_f_PanelFooter23();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter23 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter23.add(get_f_PrettyPre24());

      return f_PanelFooter23;
    }

    /**
     * Getter for f_PrettyPre24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre24() {
      return build_f_PrettyPre24();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre24() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre24 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre24.setHTML(template_html11().asString());
      f_PrettyPre24.addStyleName("lang-xml");

      return f_PrettyPre24;
    }
  }
}
