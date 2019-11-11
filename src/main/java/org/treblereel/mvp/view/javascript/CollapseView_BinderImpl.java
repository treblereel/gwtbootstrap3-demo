// Template file: org/treblereel/mvp/view/javascript/CollapseView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.javascript;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.517")
public class CollapseView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.javascript.CollapseView>, org.treblereel.mvp.view.javascript.CollapseView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("<b>Transition animations not supported in Internet Explorer 8 &amp; 9</b> <br> Bootstrap exclusively uses CSS3 for its animations, but Internet Explorer 8 &amp; 9 don't support the necessary CSS properties. Thus, there are no slide transition animations when using these browsers. We have intentionally decided not to include jQuery-based fallbacks for the transitions.")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("You can also use the plugin without the accordion markup. Make a button toggle the expanding and collapsing of another element.")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:Button type=\"...\" dataToggle=\"COLLAPSE\" dataTarget=\"#demoCollapse\" text=\"Collapse Me\"/&gt;\\n &lt;b:Collapse b:id=\"demoCollapse&gt;\\n \\s\\sWidget To Collapse\\n &lt;/b:Collapse&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("I am the content of Collapse Group #1.")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("I am the content of Collapse Group #1.")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("I am the content of Collapse Group #1.")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;b:PanelGroup b:id=\"accordion\"&gt;\\n \\s\\s&lt;b:Panel&gt;\\n \\s\\s\\s\\s&lt;b:PanelHeader&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"H4\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Anchor dataToggle=\"COLLAPSE\" dataParent=\"#accordion\" dataTarget=\"#collapseOne\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:Heading&gt;\\n \\s\\s\\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:PanelCollapse b:id=\"collapseOne\" ui:field=\"collapseOne\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\sWidgets\\n \\s\\s\\s\\s\\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;/b:PanelCollapse&gt;\\n \\s\\s&lt;/b:Panel&gt;\\n \\s\\s&lt;b:Panel&gt;\\n \\s\\s\\s\\s&lt;b:PanelHeader&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"H4\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Anchor dataToggle=\"COLLAPSE\" dataParent=\"#accordion\" dataTarget=\"#collapseTwo\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:Heading&gt;\\n \\s\\s\\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:PanelCollapse b:id=\"collapseTwo\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\sWidgets\\n \\s\\s\\s\\s\\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;/b:PanelCollapse&gt;\\n \\s\\s&lt;/b:Panel&gt;\\n \\s\\s&lt;b:Panel&gt;\\n \\s\\s\\s\\s&lt;b:PanelHeader&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"H4\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Anchor icon=\"...\" dataToggle=\"COLLAPSE\" dataParent=\"#accordion\" dataTarget=\"#collapseThree\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:Heading&gt;\\n \\s\\s\\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:PanelCollapse b:id=\"collapseThree\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\sWidgets\\n \\s\\s\\s\\s\\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;/b:PanelCollapse&gt;\\n \\s\\s&lt;/b:Panel&gt;\\n &lt;/b:PanelGroup&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("@UiField\\n PanelCollapse collapseOne;\\n\\n // Add a show handler\\n collapseOne.addShowHandler(...);\\n\\n // Add a hide handler\\n collapseOne.addHideHandler(...);")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("I am the content of Collapse Group!")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("I am the content of Collapse!")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("I am the content of Collapse!")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("&lt;b:PanelGroup b:id=\"accordion\"&gt;\\n \\s\\s&lt;b:Panel&gt;\\n \\s\\s\\s\\s&lt;b:PanelHeader dataToggle=\"COLLAPSE\" dataParent=\"#accordion2\" dataTarget=\"#collapseFour\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"H4\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:PanelCollapse b:id=\"collapseFour\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\sWidgets\\n \\s\\s\\s\\s\\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;/b:PanelCollapse&gt;\\n \\s\\s&lt;/b:Panel&gt;\\n \\s\\s&lt;b:Panel&gt;\\n \\s\\s\\s\\s&lt;b:PanelHeader dataToggle=\"COLLAPSE\" dataParent=\"#accordion2\" dataTarget=\"#collapseFive\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"H4\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:PanelCollapse b:id=\"collapseFive\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\sWidgets\\n \\s\\s\\s\\s\\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;/b:PanelCollapse&gt;\\n \\s\\s&lt;/b:Panel&gt;\\n \\s\\s&lt;b:Panel&gt;\\n \\s\\s\\s\\s&lt;b:PanelHeader dataToggle=\"COLLAPSE\" dataParent=\"#accordion2\" dataTarget=\"#collapseSix\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"H4\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:PanelCollapse b:id=\"collapseSix\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\sWidgets\\n \\s\\s\\s\\s\\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;/b:PanelCollapse&gt;\\n \\s\\s&lt;/b:Panel&gt;\\n &lt;/b:PanelGroup&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
  }

  Template template = new CollapseView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.javascript.CollapseView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.javascript.CollapseView owner;


    public Widgets(final org.treblereel.mvp.view.javascript.CollapseView owner) {
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
    org.gwtproject.safehtml.shared.SafeHtml template_html12() {
      return template.html12();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.CollapseView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.javascript.CollapseView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.javascript.CollapseView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.javascript.CollapseView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.CollapseView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.javascript.CollapseView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.javascript.CollapseView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel7());
      f_Column2.add(get_f_Panel17());
      f_Column2.add(get_f_Panel47());

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
      f_PageHeader3.setText("Collapse");

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
      f_Heading5.setText("Cross-browser compatibility");

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
     * Getter for f_Panel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel7() {
      return build_f_Panel7();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel7 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel7.add(get_f_PanelHeader8());
      f_Panel7.add(get_f_PanelBody10());
      f_Panel7.add(get_f_PanelFooter15());

      return f_Panel7;
    }

    /**
     * Getter for f_PanelHeader8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader8() {
      return build_f_PanelHeader8();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader8 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader8.add(get_f_Heading9());

      return f_PanelHeader8;
    }

    /**
     * Getter for f_Heading9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading9() {
      return build_f_Heading9();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading9 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading9.setText("Collapse via Button target");

      return f_Heading9;
    }

    /**
     * Getter for f_PanelBody10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody10() {
      return build_f_PanelBody10();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody10 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody10.add(get_f_Button11());
      f_PanelBody10.add(get_f_ClearFix12());
      f_PanelBody10.add(get_demoCollapse());

      return f_PanelBody10;
    }

    /**
     * Getter for f_Button11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button11() {
      return build_f_Button11();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button11 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button11.setText("Collapse Me");
      f_Button11.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_Button11.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);
      f_Button11.setDataTarget("#demoCollapse");

      return f_Button11;
    }

    /**
     * Getter for f_ClearFix12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix12() {
      return build_f_ClearFix12();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix12 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.
      f_ClearFix12.addStyleName("" + get_style().margin() + "");

      return f_ClearFix12;
    }

    /**
     * Getter for demoCollapse called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Collapse get_demoCollapse() {
      return build_demoCollapse();
    }
    private org.gwtbootstrap3.client.ui.Collapse build_demoCollapse() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Collapse demoCollapse = new org.gwtbootstrap3.client.ui.Collapse();
      // Setup section.
      demoCollapse.add(get_f_Well13());
      demoCollapse.setId("demoCollapse");

      return demoCollapse;
    }

    /**
     * Getter for f_Well13 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Well get_f_Well13() {
      return build_f_Well13();
    }
    private org.gwtbootstrap3.client.ui.Well build_f_Well13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Well f_Well13 = new org.gwtbootstrap3.client.ui.Well();
      // Setup section.
      f_Well13.add(get_f_Paragraph14());

      return f_Well13;
    }

    /**
     * Getter for f_Paragraph14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph14() {
      return build_f_Paragraph14();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph14 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.

      return f_Paragraph14;
    }

    /**
     * Getter for f_PanelFooter15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter15() {
      return build_f_PanelFooter15();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter15 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter15.add(get_f_PrettyPre16());

      return f_PanelFooter15;
    }

    /**
     * Getter for f_PrettyPre16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre16() {
      return build_f_PrettyPre16();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre16() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre16 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre16.setHTML(template_html3().asString());
      f_PrettyPre16.addStyleName("lang-xml");

      return f_PrettyPre16;
    }

    /**
     * Getter for f_Panel17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel17() {
      return build_f_Panel17();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel17 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel17.add(get_f_PanelHeader18());
      f_Panel17.add(get_f_PanelBody20());
      f_Panel17.add(get_f_PanelFooter42());

      return f_Panel17;
    }

    /**
     * Getter for f_PanelHeader18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader18() {
      return build_f_PanelHeader18();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader18 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader18.add(get_f_Heading19());

      return f_PanelHeader18;
    }

    /**
     * Getter for f_Heading19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading19() {
      return build_f_Heading19();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading19 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading19.setText("Accordion Example using PanelCollapse");

      return f_Heading19;
    }

    /**
     * Getter for f_PanelBody20 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody20() {
      return build_f_PanelBody20();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody20 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody20.add(get_f_PanelGroup21());

      return f_PanelBody20;
    }

    /**
     * Getter for f_PanelGroup21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.PanelGroup get_f_PanelGroup21() {
      return build_f_PanelGroup21();
    }
    private org.gwtbootstrap3.client.ui.PanelGroup build_f_PanelGroup21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelGroup f_PanelGroup21 = new org.gwtbootstrap3.client.ui.PanelGroup();
      // Setup section.
      f_PanelGroup21.add(get_f_Panel22());
      f_PanelGroup21.add(get_f_Panel28());
      f_PanelGroup21.add(get_f_Panel35());
      f_PanelGroup21.setId("accordion");

      return f_PanelGroup21;
    }

    /**
     * Getter for f_Panel22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel22() {
      return build_f_Panel22();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel22 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel22.add(get_f_PanelHeader23());
      f_Panel22.add(get_collapseOne());

      return f_Panel22;
    }

    /**
     * Getter for f_PanelHeader23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader23() {
      return build_f_PanelHeader23();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader23 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader23.add(get_f_Heading24());

      return f_PanelHeader23;
    }

    /**
     * Getter for f_Heading24 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading24() {
      return build_f_Heading24();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading24 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading24.add(get_f_Anchor25());

      return f_Heading24;
    }

    /**
     * Getter for f_Anchor25 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor25() {
      return build_f_Anchor25();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor25 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor25.setDataParent("#accordion");
      f_Anchor25.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_Anchor25.setText("Collapse Group #1");
      f_Anchor25.setDataTarget("#collapseOne");

      return f_Anchor25;
    }

    /**
     * Getter for collapseOne called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelCollapse get_collapseOne() {
      return build_collapseOne();
    }
    private org.gwtbootstrap3.client.ui.PanelCollapse build_collapseOne() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelCollapse collapseOne = new org.gwtbootstrap3.client.ui.PanelCollapse();
      // Setup section.
      collapseOne.add(get_f_PanelBody26());
      collapseOne.setIn(true);
      collapseOne.setId("collapseOne");

      this.owner.collapseOne = collapseOne;

      return collapseOne;
    }

    /**
     * Getter for f_PanelBody26 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody26() {
      return build_f_PanelBody26();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody26 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody26.add(get_f_Paragraph27());

      return f_PanelBody26;
    }

    /**
     * Getter for f_Paragraph27 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph27() {
      return build_f_Paragraph27();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph27 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.

      return f_Paragraph27;
    }

    /**
     * Getter for f_Panel28 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel28() {
      return build_f_Panel28();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel28 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel28.add(get_f_PanelHeader29());
      f_Panel28.add(get_f_PanelCollapse32());

      return f_Panel28;
    }

    /**
     * Getter for f_PanelHeader29 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader29() {
      return build_f_PanelHeader29();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader29 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader29.add(get_f_Heading30());

      return f_PanelHeader29;
    }

    /**
     * Getter for f_Heading30 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading30() {
      return build_f_Heading30();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading30 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading30.add(get_f_Anchor31());

      return f_Heading30;
    }

    /**
     * Getter for f_Anchor31 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor31() {
      return build_f_Anchor31();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor31 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor31.setDataParent("#accordion");
      f_Anchor31.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_Anchor31.setText("Collapse Group #2");
      f_Anchor31.setDataTarget("#collapseTwo");

      return f_Anchor31;
    }

    /**
     * Getter for f_PanelCollapse32 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelCollapse get_f_PanelCollapse32() {
      return build_f_PanelCollapse32();
    }
    private org.gwtbootstrap3.client.ui.PanelCollapse build_f_PanelCollapse32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelCollapse f_PanelCollapse32 = new org.gwtbootstrap3.client.ui.PanelCollapse();
      // Setup section.
      f_PanelCollapse32.add(get_f_PanelBody33());
      f_PanelCollapse32.setId("collapseTwo");

      return f_PanelCollapse32;
    }

    /**
     * Getter for f_PanelBody33 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody33() {
      return build_f_PanelBody33();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody33 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody33.add(get_f_Paragraph34());

      return f_PanelBody33;
    }

    /**
     * Getter for f_Paragraph34 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph34() {
      return build_f_Paragraph34();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph34 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.

      return f_Paragraph34;
    }

    /**
     * Getter for f_Panel35 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel35() {
      return build_f_Panel35();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel35 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel35.add(get_f_PanelHeader36());
      f_Panel35.add(get_f_PanelCollapse39());

      return f_Panel35;
    }

    /**
     * Getter for f_PanelHeader36 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader36() {
      return build_f_PanelHeader36();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader36 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader36.add(get_f_Heading37());

      return f_PanelHeader36;
    }

    /**
     * Getter for f_Heading37 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading37() {
      return build_f_Heading37();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading37 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading37.add(get_f_Anchor38());

      return f_Heading37;
    }

    /**
     * Getter for f_Anchor38 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor38() {
      return build_f_Anchor38();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor38 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor38.setDataParent("#accordion");
      f_Anchor38.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANCHOR);
      f_Anchor38.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_Anchor38.setText("Collapse Group #3");
      f_Anchor38.setDataTarget("#collapseThree");

      return f_Anchor38;
    }

    /**
     * Getter for f_PanelCollapse39 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelCollapse get_f_PanelCollapse39() {
      return build_f_PanelCollapse39();
    }
    private org.gwtbootstrap3.client.ui.PanelCollapse build_f_PanelCollapse39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelCollapse f_PanelCollapse39 = new org.gwtbootstrap3.client.ui.PanelCollapse();
      // Setup section.
      f_PanelCollapse39.add(get_f_PanelBody40());
      f_PanelCollapse39.setId("collapseThree");

      return f_PanelCollapse39;
    }

    /**
     * Getter for f_PanelBody40 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody40() {
      return build_f_PanelBody40();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody40 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody40.add(get_f_Paragraph41());

      return f_PanelBody40;
    }

    /**
     * Getter for f_Paragraph41 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph41() {
      return build_f_Paragraph41();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph41 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.

      return f_Paragraph41;
    }

    /**
     * Getter for f_PanelFooter42 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter42() {
      return build_f_PanelFooter42();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter42 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter42.add(get_f_Heading43());
      f_PanelFooter42.add(get_f_PrettyPre44());
      f_PanelFooter42.add(get_f_Heading45());
      f_PanelFooter42.add(get_f_PrettyPre46());

      return f_PanelFooter42;
    }

    /**
     * Getter for f_Heading43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading43() {
      return build_f_Heading43();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading43 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading43.setText("UiBinder");

      return f_Heading43;
    }

    /**
     * Getter for f_PrettyPre44 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre44() {
      return build_f_PrettyPre44();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre44() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre44 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre44.setHTML(template_html7().asString());
      f_PrettyPre44.addStyleName("lang-xml");

      return f_PrettyPre44;
    }

    /**
     * Getter for f_Heading45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading45() {
      return build_f_Heading45();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading45 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading45.setText("Java code");

      return f_Heading45;
    }

    /**
     * Getter for f_PrettyPre46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre46() {
      return build_f_PrettyPre46();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre46() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre46 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre46.setHTML(template_html8().asString());
      f_PrettyPre46.addStyleName("lang-java");

      return f_PrettyPre46;
    }

    /**
     * Getter for f_Panel47 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel47() {
      return build_f_Panel47();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel47 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel47.add(get_f_PanelHeader48());
      f_Panel47.add(get_f_PanelBody50());
      f_Panel47.add(get_f_PanelFooter70());

      return f_Panel47;
    }

    /**
     * Getter for f_PanelHeader48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader48() {
      return build_f_PanelHeader48();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader48 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader48.add(get_f_Heading49());

      return f_PanelHeader48;
    }

    /**
     * Getter for f_Heading49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading49() {
      return build_f_Heading49();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading49 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading49.setText("Accordion Example using PanelCollapse (whole header)");

      return f_Heading49;
    }

    /**
     * Getter for f_PanelBody50 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody50() {
      return build_f_PanelBody50();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody50 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody50.add(get_f_PanelGroup51());

      return f_PanelBody50;
    }

    /**
     * Getter for f_PanelGroup51 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.PanelGroup get_f_PanelGroup51() {
      return build_f_PanelGroup51();
    }
    private org.gwtbootstrap3.client.ui.PanelGroup build_f_PanelGroup51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelGroup f_PanelGroup51 = new org.gwtbootstrap3.client.ui.PanelGroup();
      // Setup section.
      f_PanelGroup51.add(get_f_Panel52());
      f_PanelGroup51.add(get_f_Panel58());
      f_PanelGroup51.add(get_f_Panel64());
      f_PanelGroup51.setId("accordion2");

      return f_PanelGroup51;
    }

    /**
     * Getter for f_Panel52 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel52() {
      return build_f_Panel52();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel52 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel52.add(get_f_PanelHeader53());
      f_Panel52.add(get_f_PanelCollapse55());

      return f_Panel52;
    }

    /**
     * Getter for f_PanelHeader53 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader53() {
      return build_f_PanelHeader53();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader53 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader53.add(get_f_Heading54());
      f_PanelHeader53.setDataParent("#accordion2");
      f_PanelHeader53.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_PanelHeader53.setDataTarget("#collapseFour");

      return f_PanelHeader53;
    }

    /**
     * Getter for f_Heading54 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading54() {
      return build_f_Heading54();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading54 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading54.setText("Collapse Me");

      return f_Heading54;
    }

    /**
     * Getter for f_PanelCollapse55 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelCollapse get_f_PanelCollapse55() {
      return build_f_PanelCollapse55();
    }
    private org.gwtbootstrap3.client.ui.PanelCollapse build_f_PanelCollapse55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelCollapse f_PanelCollapse55 = new org.gwtbootstrap3.client.ui.PanelCollapse();
      // Setup section.
      f_PanelCollapse55.add(get_f_PanelBody56());
      f_PanelCollapse55.setIn(true);
      f_PanelCollapse55.setId("collapseFour");

      return f_PanelCollapse55;
    }

    /**
     * Getter for f_PanelBody56 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody56() {
      return build_f_PanelBody56();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody56 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody56.add(get_f_Paragraph57());

      return f_PanelBody56;
    }

    /**
     * Getter for f_Paragraph57 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph57() {
      return build_f_Paragraph57();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph57 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html9().asString());
      // Setup section.

      return f_Paragraph57;
    }

    /**
     * Getter for f_Panel58 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel58() {
      return build_f_Panel58();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel58 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel58.add(get_f_PanelHeader59());
      f_Panel58.add(get_f_PanelCollapse61());

      return f_Panel58;
    }

    /**
     * Getter for f_PanelHeader59 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader59() {
      return build_f_PanelHeader59();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader59 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader59.add(get_f_Heading60());
      f_PanelHeader59.setDataParent("#accordion2");
      f_PanelHeader59.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_PanelHeader59.setDataTarget("#collapseFive");

      return f_PanelHeader59;
    }

    /**
     * Getter for f_Heading60 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading60() {
      return build_f_Heading60();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading60 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading60.setText("Collapse Me");

      return f_Heading60;
    }

    /**
     * Getter for f_PanelCollapse61 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelCollapse get_f_PanelCollapse61() {
      return build_f_PanelCollapse61();
    }
    private org.gwtbootstrap3.client.ui.PanelCollapse build_f_PanelCollapse61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelCollapse f_PanelCollapse61 = new org.gwtbootstrap3.client.ui.PanelCollapse();
      // Setup section.
      f_PanelCollapse61.add(get_f_PanelBody62());
      f_PanelCollapse61.setId("collapseFive");

      return f_PanelCollapse61;
    }

    /**
     * Getter for f_PanelBody62 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody62() {
      return build_f_PanelBody62();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody62 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody62.add(get_f_Paragraph63());

      return f_PanelBody62;
    }

    /**
     * Getter for f_Paragraph63 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph63() {
      return build_f_Paragraph63();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph63 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html10().asString());
      // Setup section.

      return f_Paragraph63;
    }

    /**
     * Getter for f_Panel64 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel64() {
      return build_f_Panel64();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel64 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel64.add(get_f_PanelHeader65());
      f_Panel64.add(get_f_PanelCollapse67());

      return f_Panel64;
    }

    /**
     * Getter for f_PanelHeader65 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader65() {
      return build_f_PanelHeader65();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader65 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader65.add(get_f_Heading66());
      f_PanelHeader65.setDataParent("#accordion2");
      f_PanelHeader65.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.COLLAPSE);
      f_PanelHeader65.setDataTarget("#collapseSix");

      return f_PanelHeader65;
    }

    /**
     * Getter for f_Heading66 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading66() {
      return build_f_Heading66();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading66 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading66.setText("Collapse Me");

      return f_Heading66;
    }

    /**
     * Getter for f_PanelCollapse67 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.PanelCollapse get_f_PanelCollapse67() {
      return build_f_PanelCollapse67();
    }
    private org.gwtbootstrap3.client.ui.PanelCollapse build_f_PanelCollapse67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelCollapse f_PanelCollapse67 = new org.gwtbootstrap3.client.ui.PanelCollapse();
      // Setup section.
      f_PanelCollapse67.add(get_f_PanelBody68());
      f_PanelCollapse67.setId("collapseSix");

      return f_PanelCollapse67;
    }

    /**
     * Getter for f_PanelBody68 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody68() {
      return build_f_PanelBody68();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody68 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody68.add(get_f_Paragraph69());

      return f_PanelBody68;
    }

    /**
     * Getter for f_Paragraph69 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph69() {
      return build_f_Paragraph69();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph69 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html11().asString());
      // Setup section.

      return f_Paragraph69;
    }

    /**
     * Getter for f_PanelFooter70 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter70() {
      return build_f_PanelFooter70();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter70 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter70.add(get_f_PrettyPre71());

      return f_PanelFooter70;
    }

    /**
     * Getter for f_PrettyPre71 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre71() {
      return build_f_PrettyPre71();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre71() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre71 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre71.setHTML(template_html12().asString());
      f_PrettyPre71.addStyleName("lang-xml");

      return f_PrettyPre71;
    }
  }
}
