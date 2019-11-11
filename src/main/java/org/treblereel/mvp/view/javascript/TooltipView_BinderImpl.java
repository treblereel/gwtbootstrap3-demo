// Template file: org/treblereel/mvp/view/javascript/TooltipView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.javascript;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.704")
public class TooltipView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.javascript.TooltipView>, org.treblereel.mvp.view.javascript.TooltipView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Tooltip supports setting options for things like animation, html support, container element, and more. See the <a href='http://gwtbootstrap3.github.io/gwtbootstrap3-demo/snapshot/apidocs/org/gwtbootstrap3/client/ui/Tooltip.html'> Tooltip javadoc</a> for the full set of options.")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Tooltip also supports setting class names into the default template, while still using the template. This is useful for overriding the default look on a case-by-case basis.")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("For more examples and screenshots, go to<a href='http://getbootstrap.com/javascript/#tooltips'> http://getbootstrap.com/javascript/#tooltips</a>.")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:Tooltip title=\"...\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" placement=\"LEFT\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" placement=\"BOTTOM\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" placement=\"RIGHT\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:Tooltip title=\"...\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" trigger=\"FOCUS\"&gt;\\n \\s\\s&lt;b:TextBox/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" trigger=\"CLICK\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" trigger=\"MANUAL\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:Tooltip title=\"...\" tooltipClassNames=\"tooltip ...\" tooltipInnerClassNames=\"tooltip-inner ...\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" hideDelayMs=\"2000\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n &lt;b:Tooltip title=\"...\" isHtml=\"true\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Tooltip&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
  }

  Template template = new TooltipView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.javascript.TooltipView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.javascript.TooltipView owner;


    public Widgets(final org.treblereel.mvp.view.javascript.TooltipView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 16 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.javascript.TooltipView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel8());
      f_Column2.add(get_f_Panel22());
      f_Column2.add(get_f_Panel35());

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
      f_PageHeader3.setText("Tooltips");
      f_PageHeader3.setSubText("JavaScript tooltips");

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
      f_BlockQuote4.add(get_f_Paragraph5());
      f_BlockQuote4.add(get_f_Paragraph6());
      f_BlockQuote4.add(get_f_Paragraph7());

      return f_BlockQuote4;
    }

    /**
     * Getter for f_Paragraph5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph5() {
      return build_f_Paragraph5();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph5 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph5;
    }

    /**
     * Getter for f_Paragraph6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph6() {
      return build_f_Paragraph6();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph6 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.

      return f_Paragraph6;
    }

    /**
     * Getter for f_Paragraph7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph7() {
      return build_f_Paragraph7();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph7 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      return f_Paragraph7;
    }

    /**
     * Getter for f_Panel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel8() {
      return build_f_Panel8();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel8 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel8.add(get_f_PanelHeader9());
      f_Panel8.add(get_f_PanelBody11());
      f_Panel8.add(get_f_PanelFooter20());

      return f_Panel8;
    }

    /**
     * Getter for f_PanelHeader9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader9() {
      return build_f_PanelHeader9();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader9 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader9.add(get_f_Heading10());

      return f_PanelHeader9;
    }

    /**
     * Getter for f_Heading10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading10() {
      return build_f_Heading10();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading10 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading10.setText("Basic");

      return f_Heading10;
    }

    /**
     * Getter for f_PanelBody11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody11() {
      return build_f_PanelBody11();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody11 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody11.add(get_f_Tooltip12());
      f_PanelBody11.add(get_f_Tooltip14());
      f_PanelBody11.add(get_f_Tooltip16());
      f_PanelBody11.add(get_f_Tooltip18());

      return f_PanelBody11;
    }

    /**
     * Getter for f_Tooltip12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip12() {
      return build_f_Tooltip12();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip12 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip12.add(get_f_Button13());
      f_Tooltip12.setTitle("I am a Tooltip!");

      return f_Tooltip12;
    }

    /**
     * Getter for f_Button13 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button13() {
      return build_f_Button13();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button13 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button13.addStyleName("" + get_style().margin() + "");
      f_Button13.setText("I have a Tooltip! (top)");

      return f_Button13;
    }

    /**
     * Getter for f_Tooltip14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip14() {
      return build_f_Tooltip14();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip14 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip14.add(get_f_Button15());
      f_Tooltip14.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.LEFT);
      f_Tooltip14.setTitle("I am a Tooltip!");

      return f_Tooltip14;
    }

    /**
     * Getter for f_Button15 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button15() {
      return build_f_Button15();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button15 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button15.addStyleName("" + get_style().margin() + "");
      f_Button15.setText("I have a Tooltip! (left)");

      return f_Button15;
    }

    /**
     * Getter for f_Tooltip16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip16() {
      return build_f_Tooltip16();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip16 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip16.add(get_f_Button17());
      f_Tooltip16.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.BOTTOM);
      f_Tooltip16.setTitle("I am a Tooltip!");

      return f_Tooltip16;
    }

    /**
     * Getter for f_Button17 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button17() {
      return build_f_Button17();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button17 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button17.addStyleName("" + get_style().margin() + "");
      f_Button17.setText("I have a Tooltip! (bottom)");

      return f_Button17;
    }

    /**
     * Getter for f_Tooltip18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip18() {
      return build_f_Tooltip18();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip18 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip18.add(get_f_Button19());
      f_Tooltip18.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.RIGHT);
      f_Tooltip18.setTitle("I am a Tooltip!");

      return f_Tooltip18;
    }

    /**
     * Getter for f_Button19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button19() {
      return build_f_Button19();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button19 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button19.addStyleName("" + get_style().margin() + "");
      f_Button19.setText("I have a Tooltip! (right)");

      return f_Button19;
    }

    /**
     * Getter for f_PanelFooter20 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter20() {
      return build_f_PanelFooter20();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter20 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter20.add(get_f_PrettyPre21());

      return f_PanelFooter20;
    }

    /**
     * Getter for f_PrettyPre21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre21() {
      return build_f_PrettyPre21();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre21() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre21 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre21.setHTML(template_html4().asString());
      f_PrettyPre21.addStyleName("lang-xml");

      return f_PrettyPre21;
    }

    /**
     * Getter for f_Panel22 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel22() {
      return build_f_Panel22();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel22 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel22.add(get_f_PanelHeader23());
      f_Panel22.add(get_f_PanelBody25());
      f_Panel22.add(get_f_PanelFooter33());

      return f_Panel22;
    }

    /**
     * Getter for f_PanelHeader23 called 1 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for f_Heading24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading24() {
      return build_f_Heading24();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading24 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading24.setText("Triggers");

      return f_Heading24;
    }

    /**
     * Getter for f_PanelBody25 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody25() {
      return build_f_PanelBody25();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody25 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody25.add(get_f_Tooltip26());
      f_PanelBody25.add(get_f_Tooltip28());
      f_PanelBody25.add(get_f_Tooltip30());
      f_PanelBody25.add(get_forceTooltip());
      f_PanelBody25.add(get_forceShowButton());
      f_PanelBody25.add(get_forceHideButton());

      return f_PanelBody25;
    }

    /**
     * Getter for f_Tooltip26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip26() {
      return build_f_Tooltip26();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip26 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip26.add(get_f_Button27());
      f_Tooltip26.setTitle("I am a Tooltip!");

      return f_Tooltip26;
    }

    /**
     * Getter for f_Button27 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button27() {
      return build_f_Button27();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button27 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button27.addStyleName("" + get_style().margin() + "");
      f_Button27.setText("I have a Tooltip! (on hover)");

      return f_Button27;
    }

    /**
     * Getter for f_Tooltip28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip28() {
      return build_f_Tooltip28();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip28 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip28.add(get_f_TextBox29());
      f_Tooltip28.setTrigger(org.gwtbootstrap3.client.ui.constants.Trigger.FOCUS);
      f_Tooltip28.setTitle("I am a Tooltip!");

      return f_Tooltip28;
    }

    /**
     * Getter for f_TextBox29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox29() {
      return build_f_TextBox29();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox29 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox29.addStyleName("" + get_style().margin() + "");
      f_TextBox29.addStyleName("" + get_style().inline() + "");
      f_TextBox29.setWidth("200px");
      f_TextBox29.setPlaceholder("I have a Tooltip! (on focus)");

      return f_TextBox29;
    }

    /**
     * Getter for f_Tooltip30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip30() {
      return build_f_Tooltip30();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip30 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip30.add(get_f_Button31());
      f_Tooltip30.setTrigger(org.gwtbootstrap3.client.ui.constants.Trigger.CLICK);
      f_Tooltip30.setTitle("I am a Tooltip!");

      return f_Tooltip30;
    }

    /**
     * Getter for f_Button31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button31() {
      return build_f_Button31();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button31 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button31.addStyleName("" + get_style().margin() + "");
      f_Button31.setText("I have a Tooltip! (on click)");

      return f_Button31;
    }

    /**
     * Getter for forceTooltip called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_forceTooltip() {
      return build_forceTooltip();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_forceTooltip() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip forceTooltip = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      forceTooltip.add(get_f_Button32());
      forceTooltip.setTrigger(org.gwtbootstrap3.client.ui.constants.Trigger.MANUAL);
      forceTooltip.setTitle("I am a Tooltip!");

      this.owner.forceTooltip = forceTooltip;

      return forceTooltip;
    }

    /**
     * Getter for f_Button32 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button32() {
      return build_f_Button32();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button32 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button32.addStyleName("" + get_style().margin() + "");
      f_Button32.setText("I have a Tooltip! (on manual)");

      return f_Button32;
    }

    /**
     * Getter for forceShowButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_forceShowButton() {
      return build_forceShowButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_forceShowButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button forceShowButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      forceShowButton.addStyleName("" + get_style().margin() + "");
      forceShowButton.setText("Show");

      this.owner.forceShowButton = forceShowButton;

      return forceShowButton;
    }

    /**
     * Getter for forceHideButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_forceHideButton() {
      return build_forceHideButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_forceHideButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button forceHideButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      forceHideButton.addStyleName("" + get_style().margin() + "");
      forceHideButton.setText("Hide");

      this.owner.forceHideButton = forceHideButton;

      return forceHideButton;
    }

    /**
     * Getter for f_PanelFooter33 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter33() {
      return build_f_PanelFooter33();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter33 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter33.add(get_f_PrettyPre34());

      return f_PanelFooter33;
    }

    /**
     * Getter for f_PrettyPre34 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre34() {
      return build_f_PrettyPre34();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre34() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre34 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre34.setHTML(template_html5().asString());
      f_PrettyPre34.addStyleName("lang-xml");

      return f_PrettyPre34;
    }

    /**
     * Getter for f_Panel35 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel35() {
      return build_f_Panel35();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel35 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel35.add(get_f_PanelHeader36());
      f_Panel35.add(get_f_PanelBody38());
      f_Panel35.add(get_f_PanelFooter45());

      return f_Panel35;
    }

    /**
     * Getter for f_PanelHeader36 called 1 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for f_Heading37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading37() {
      return build_f_Heading37();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading37 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading37.setText("Options");

      return f_Heading37;
    }

    /**
     * Getter for f_PanelBody38 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody38() {
      return build_f_PanelBody38();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody38 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody38.add(get_f_Tooltip39());
      f_PanelBody38.add(get_f_Tooltip41());
      f_PanelBody38.add(get_f_Tooltip43());

      return f_PanelBody38;
    }

    /**
     * Getter for f_Tooltip39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip39() {
      return build_f_Tooltip39();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip39 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip39.add(get_f_Button40());
      f_Tooltip39.setTooltipClassNames("tooltip " + get_style().wider() + "");
      f_Tooltip39.setTooltipInnerClassNames("tooltip-inner " + get_style().wider() + "");
      f_Tooltip39.setTitle("I am a Tooltip with very long text that should be wider than a normal tooltip!");

      return f_Tooltip39;
    }

    /**
     * Getter for f_Button40 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button40() {
      return build_f_Button40();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button40 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button40.addStyleName("" + get_style().margin() + "");
      f_Button40.setText("I have a Tooltip!");

      return f_Button40;
    }

    /**
     * Getter for f_Tooltip41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip41() {
      return build_f_Tooltip41();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip41 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip41.add(get_f_Button42());
      f_Tooltip41.setTitle("I am a Tooltip with a 2 second hide delay!");
      f_Tooltip41.setHideDelayMs(2000);

      return f_Tooltip41;
    }

    /**
     * Getter for f_Button42 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button42() {
      return build_f_Button42();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button42 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button42.addStyleName("" + get_style().margin() + "");
      f_Button42.setText("I have a Tooltip!");

      return f_Button42;
    }

    /**
     * Getter for f_Tooltip43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Tooltip get_f_Tooltip43() {
      return build_f_Tooltip43();
    }
    private org.gwtbootstrap3.client.ui.Tooltip build_f_Tooltip43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Tooltip f_Tooltip43 = new org.gwtbootstrap3.client.ui.Tooltip();
      // Setup section.
      f_Tooltip43.add(get_f_Button44());
      f_Tooltip43.setIsHtml(true);
      f_Tooltip43.setTitle("<table style='border: 1px solid white'><tr><td>I am a tooltip</tr></td><tr><td>with an HTML table!</tr></td></table>");

      return f_Tooltip43;
    }

    /**
     * Getter for f_Button44 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button44() {
      return build_f_Button44();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button44 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button44.addStyleName("" + get_style().margin() + "");
      f_Button44.setText("I have a Tooltip!");

      return f_Button44;
    }

    /**
     * Getter for f_PanelFooter45 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter45() {
      return build_f_PanelFooter45();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter45 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter45.add(get_f_PrettyPre46());

      return f_PanelFooter45;
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
      f_PrettyPre46.setHTML(template_html6().asString());
      f_PrettyPre46.addStyleName("lang-xml");

      return f_PrettyPre46;
    }
  }
}
