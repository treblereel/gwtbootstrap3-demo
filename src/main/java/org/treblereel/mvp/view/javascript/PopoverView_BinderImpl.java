// Template file: org/treblereel/mvp/view/javascript/PopoverView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.javascript;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.532")
public class PopoverView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.javascript.PopoverView>, org.treblereel.mvp.view.javascript.PopoverView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("For more examples and more options on setup (animation, supporting html, custom selector/container, etc..) go to<a href='http://getbootstrap.com/javascript/#popovers'> http://getbootstrap.com/javascript/#popovers</a>.")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Popover title=\"...\" content=\"...\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Popover&gt;\\n\\n &lt;b:Popover title=\"...\" content=\"...\" placement=\"LEFT\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Popover&gt;\\n\\n &lt;b:Popover title=\"...\" content=\"...\" placement=\"BOTTOM\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Popover&gt;\\n\\n &lt;b:Popover title=\"...\" content=\"...\" placement=\"RIGHT\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Popover&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:Popover title=\"...\" content=\"...\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Popover&gt;\\n\\n &lt;b:Popover title=\"...\" content=\"...\" trigger=\"FOCUS\"/&gt;\\n \\s\\s&lt;b:TextBox/&gt;\\n &lt;/b:Popover&gt;\\n\\n &lt;b:Popover title=\"...\" content=\"...\" trigger=\"CLICK\"/&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Popover&gt;\\n\\n &lt;b:Popover title=\"...\" content=\"...\" trigger=\"MANUAL\"&gt;\\n \\s\\s&lt;b:Button text=\"...\"/&gt;\\n &lt;/b:Popover&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
  }

  Template template = new PopoverView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.javascript.PopoverView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.javascript.PopoverView owner;


    public Widgets(final org.treblereel.mvp.view.javascript.PopoverView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 11 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.javascript.PopoverView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel6());
      f_Column2.add(get_f_Panel20());

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
      f_PageHeader3.setText("Popovers");
      f_PageHeader3.setSubText("Custom Popovers with title and a body");

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
     * Getter for f_Panel6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel6() {
      return build_f_Panel6();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel6 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel6.add(get_f_PanelHeader7());
      f_Panel6.add(get_f_PanelBody9());
      f_Panel6.add(get_f_PanelFooter18());

      return f_Panel6;
    }

    /**
     * Getter for f_PanelHeader7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader7() {
      return build_f_PanelHeader7();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader7 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader7.add(get_f_Heading8());

      return f_PanelHeader7;
    }

    /**
     * Getter for f_Heading8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading8() {
      return build_f_Heading8();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading8 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading8.setText("Basic");

      return f_Heading8;
    }

    /**
     * Getter for f_PanelBody9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody9() {
      return build_f_PanelBody9();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody9 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody9.add(get_f_Popover10());
      f_PanelBody9.add(get_f_Popover12());
      f_PanelBody9.add(get_f_Popover14());
      f_PanelBody9.add(get_f_Popover16());

      return f_PanelBody9;
    }

    /**
     * Getter for f_Popover10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_f_Popover10() {
      return build_f_Popover10();
    }
    private org.gwtbootstrap3.client.ui.Popover build_f_Popover10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover f_Popover10 = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      f_Popover10.add(get_f_Button11());
      f_Popover10.setTitle("Popover Title");
      f_Popover10.setContent("Popover Body");

      return f_Popover10;
    }

    /**
     * Getter for f_Button11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button11() {
      return build_f_Button11();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button11 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button11.addStyleName("" + get_style().margin() + "");
      f_Button11.setText("I have a Popover! (top)");

      return f_Button11;
    }

    /**
     * Getter for f_Popover12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_f_Popover12() {
      return build_f_Popover12();
    }
    private org.gwtbootstrap3.client.ui.Popover build_f_Popover12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover f_Popover12 = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      f_Popover12.add(get_f_Button13());
      f_Popover12.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.LEFT);
      f_Popover12.setTitle("Popover Title");
      f_Popover12.setContent("Popover Body");

      return f_Popover12;
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
      f_Button13.setText("I have a Popover! (left)");

      return f_Button13;
    }

    /**
     * Getter for f_Popover14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_f_Popover14() {
      return build_f_Popover14();
    }
    private org.gwtbootstrap3.client.ui.Popover build_f_Popover14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover f_Popover14 = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      f_Popover14.add(get_f_Button15());
      f_Popover14.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.BOTTOM);
      f_Popover14.setTitle("Popover Title");
      f_Popover14.setContent("Popover Body");

      return f_Popover14;
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
      f_Button15.setText("I have a Popover! (bottom)");

      return f_Button15;
    }

    /**
     * Getter for f_Popover16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_f_Popover16() {
      return build_f_Popover16();
    }
    private org.gwtbootstrap3.client.ui.Popover build_f_Popover16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover f_Popover16 = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      f_Popover16.add(get_f_Button17());
      f_Popover16.setPlacement(org.gwtbootstrap3.client.ui.constants.Placement.RIGHT);
      f_Popover16.setTitle("Popover Title");
      f_Popover16.setContent("Popover Body");

      return f_Popover16;
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
      f_Button17.setText("I have a Popover! (right)");

      return f_Button17;
    }

    /**
     * Getter for f_PanelFooter18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter18() {
      return build_f_PanelFooter18();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter18 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter18.add(get_f_PrettyPre19());

      return f_PanelFooter18;
    }

    /**
     * Getter for f_PrettyPre19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre19() {
      return build_f_PrettyPre19();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre19() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre19 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre19.setHTML(template_html2().asString());
      f_PrettyPre19.addStyleName("lang-xml");

      return f_PrettyPre19;
    }

    /**
     * Getter for f_Panel20 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel20() {
      return build_f_Panel20();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel20 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel20.add(get_f_PanelHeader21());
      f_Panel20.add(get_f_PanelBody23());
      f_Panel20.add(get_f_PanelFooter31());

      return f_Panel20;
    }

    /**
     * Getter for f_PanelHeader21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader21() {
      return build_f_PanelHeader21();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader21 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader21.add(get_f_Heading22());

      return f_PanelHeader21;
    }

    /**
     * Getter for f_Heading22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading22() {
      return build_f_Heading22();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading22 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading22.setText("Triggers");

      return f_Heading22;
    }

    /**
     * Getter for f_PanelBody23 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody23() {
      return build_f_PanelBody23();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody23 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody23.add(get_f_Popover24());
      f_PanelBody23.add(get_f_Popover26());
      f_PanelBody23.add(get_f_Popover28());
      f_PanelBody23.add(get_forcePopover());
      f_PanelBody23.add(get_forceShowButton());
      f_PanelBody23.add(get_forceHideButton());

      return f_PanelBody23;
    }

    /**
     * Getter for f_Popover24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_f_Popover24() {
      return build_f_Popover24();
    }
    private org.gwtbootstrap3.client.ui.Popover build_f_Popover24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover f_Popover24 = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      f_Popover24.add(get_f_Button25());
      f_Popover24.setTitle("Popover Title");
      f_Popover24.setContent("Popover Body");

      return f_Popover24;
    }

    /**
     * Getter for f_Button25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button25() {
      return build_f_Button25();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button25 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button25.addStyleName("" + get_style().margin() + "");
      f_Button25.setText("I have a Popover! (on hover)");

      return f_Button25;
    }

    /**
     * Getter for f_Popover26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_f_Popover26() {
      return build_f_Popover26();
    }
    private org.gwtbootstrap3.client.ui.Popover build_f_Popover26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover f_Popover26 = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      f_Popover26.add(get_f_TextBox27());
      f_Popover26.setTrigger(org.gwtbootstrap3.client.ui.constants.Trigger.FOCUS);
      f_Popover26.setTitle("Popover Title");
      f_Popover26.setContent("Popover Body");

      return f_Popover26;
    }

    /**
     * Getter for f_TextBox27 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox27() {
      return build_f_TextBox27();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox27 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox27.addStyleName("" + get_style().margin() + "");
      f_TextBox27.addStyleName("" + get_style().inline() + "");
      f_TextBox27.setWidth("200px");
      f_TextBox27.setPlaceholder("I have a Popover! (on focus)");

      return f_TextBox27;
    }

    /**
     * Getter for f_Popover28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_f_Popover28() {
      return build_f_Popover28();
    }
    private org.gwtbootstrap3.client.ui.Popover build_f_Popover28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover f_Popover28 = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      f_Popover28.add(get_f_Button29());
      f_Popover28.setTrigger(org.gwtbootstrap3.client.ui.constants.Trigger.CLICK);
      f_Popover28.setTitle("Popover Title");
      f_Popover28.setContent("Popover Body");

      return f_Popover28;
    }

    /**
     * Getter for f_Button29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button29() {
      return build_f_Button29();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button29 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button29.addStyleName("" + get_style().margin() + "");
      f_Button29.setText("I have a Popover! (on click)");

      return f_Button29;
    }

    /**
     * Getter for forcePopover called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Popover get_forcePopover() {
      return build_forcePopover();
    }
    private org.gwtbootstrap3.client.ui.Popover build_forcePopover() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Popover forcePopover = new org.gwtbootstrap3.client.ui.Popover();
      // Setup section.
      forcePopover.add(get_f_Button30());
      forcePopover.setTrigger(org.gwtbootstrap3.client.ui.constants.Trigger.MANUAL);
      forcePopover.setTitle("Popover Title");
      forcePopover.setContent("Popover Body");

      this.owner.forcePopover = forcePopover;

      return forcePopover;
    }

    /**
     * Getter for f_Button30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button30() {
      return build_f_Button30();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button30 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button30.addStyleName("" + get_style().margin() + "");
      f_Button30.setText("I have a Popover! (on manual)");

      return f_Button30;
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
     * Getter for f_PanelFooter31 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter31() {
      return build_f_PanelFooter31();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter31 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter31.add(get_f_PrettyPre32());

      return f_PanelFooter31;
    }

    /**
     * Getter for f_PrettyPre32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre32() {
      return build_f_PrettyPre32();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre32() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre32 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre32.setHTML(template_html3().asString());
      f_PrettyPre32.addStyleName("lang-xml");

      return f_PrettyPre32;
    }
  }
}
