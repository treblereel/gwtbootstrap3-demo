// Template file: org/treblereel/mvp/view/css/Buttons.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.css;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.339")
public class Buttons_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.css.Buttons>, org.treblereel.mvp.view.css.Buttons.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:Button type=\"DEFAULT\"/&gt;\\n &lt;b:Button type=\"PRIMARY\"/&gt;\\n &lt;b:Button type=\"SUCCESS\"/&gt;\\n &lt;b:Button type=\"INFO\"/&gt;\\n &lt;b:Button type=\"WARNING\"/&gt;\\n &lt;b:Button type=\"DANGER\"/&gt;\\n &lt;b:Button type=\"LINK\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Button type=\"PRIMARY\" size=\"SMALL\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" size=\"LARGE\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" size=\"EXTRA_SMALL\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:Button type=\"PRIMARY\" enabled=\"true\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" enabled=\"false\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:Button type=\"PRIMARY\" icon=\"STAR\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" icon=\"STAR\" iconPosition=\"RIGHT\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" icon=\"STAR\" iconSpin=\"true\" iconBordered=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:Button type=\"PRIMARY\" badgeText=\"...\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" badgeText=\"...\" badgePosition=\"LEFT\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:Button dataToggle=\"BUTTON\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;b:Button ui:field=\"button\" text=\"Click me\" dataLoadingText=\"Loading...\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("@UiHandler(\"button\")\\n public void onButtonClick(final ClickEvent event) {\\n \\s\\sbutton.state().loading();\\n \\n \\s\\snew Timer() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void run() {\\n \\s\\s\\s\\s\\s\\sbutton.state().reset();\\n \\s\\s\\s\\s}\\n \\s\\s}.schedule(2000);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("&lt;b:Button text=\"Block level button\" block=\"true\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
  }

  Template template = new Buttons_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.css.Buttons owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.css.Buttons owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onButtonClick((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.css.Buttons owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.Buttons_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.css.Buttons_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.css.Buttons_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.css.Buttons_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 8 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.Buttons_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.css.Buttons_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.css.Buttons_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel4());
      f_Column2.add(get_f_Panel17());
      f_Column2.add(get_f_Panel26());
      f_Column2.add(get_f_Panel34());
      f_Column2.add(get_f_Panel43());
      f_Column2.add(get_f_Panel51());
      f_Column2.add(get_f_Panel58());
      f_Column2.add(get_f_Panel67());

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
      f_PageHeader3.setText("Buttons");
      f_PageHeader3.setSubText("styled, states, icons...");

      return f_PageHeader3;
    }

    /**
     * Getter for f_Panel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel4() {
      return build_f_Panel4();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel4 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel4.add(get_f_PanelHeader5());
      f_Panel4.add(get_f_PanelBody7());
      f_Panel4.add(get_f_PanelFooter15());

      return f_Panel4;
    }

    /**
     * Getter for f_PanelHeader5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader5() {
      return build_f_PanelHeader5();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader5 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader5.add(get_f_Heading6());

      return f_PanelHeader5;
    }

    /**
     * Getter for f_Heading6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading6() {
      return build_f_Heading6();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading6 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading6.setText("Basic");

      return f_Heading6;
    }

    /**
     * Getter for f_PanelBody7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody7() {
      return build_f_PanelBody7();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody7 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody7.add(get_f_Button8());
      f_PanelBody7.add(get_f_Button9());
      f_PanelBody7.add(get_f_Button10());
      f_PanelBody7.add(get_f_Button11());
      f_PanelBody7.add(get_f_Button12());
      f_PanelBody7.add(get_f_Button13());
      f_PanelBody7.add(get_f_Button14());
      f_PanelBody7.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody7;
    }

    /**
     * Getter for f_Button8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button8() {
      return build_f_Button8();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button8 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button8.setText("Default");

      return f_Button8;
    }

    /**
     * Getter for f_Button9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button9() {
      return build_f_Button9();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button9 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button9.setText("Primary");
      f_Button9.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button9;
    }

    /**
     * Getter for f_Button10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button10() {
      return build_f_Button10();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button10 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button10.setText("Success");
      f_Button10.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.SUCCESS);

      return f_Button10;
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
      f_Button11.setText("Info");
      f_Button11.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.INFO);

      return f_Button11;
    }

    /**
     * Getter for f_Button12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button12() {
      return build_f_Button12();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button12 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button12.setText("Warning");
      f_Button12.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.WARNING);

      return f_Button12;
    }

    /**
     * Getter for f_Button13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button13() {
      return build_f_Button13();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button13 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button13.setText("Danger");
      f_Button13.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);

      return f_Button13;
    }

    /**
     * Getter for f_Button14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button14() {
      return build_f_Button14();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button14 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button14.setText("Link");
      f_Button14.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.LINK);

      return f_Button14;
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
      f_PrettyPre16.setHTML(template_html1().asString());
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
      f_Panel17.add(get_f_PanelFooter24());

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
      f_Heading19.setText("Sizes");

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
      f_PanelBody20.add(get_f_Button21());
      f_PanelBody20.add(get_f_Button22());
      f_PanelBody20.add(get_f_Button23());
      f_PanelBody20.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody20;
    }

    /**
     * Getter for f_Button21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button21() {
      return build_f_Button21();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button21 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button21.setSize(org.gwtbootstrap3.client.ui.constants.ButtonSize.SMALL);
      f_Button21.setText("Small");
      f_Button21.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button21;
    }

    /**
     * Getter for f_Button22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button22() {
      return build_f_Button22();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button22 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button22.setSize(org.gwtbootstrap3.client.ui.constants.ButtonSize.LARGE);
      f_Button22.setText("Large");
      f_Button22.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button22;
    }

    /**
     * Getter for f_Button23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button23() {
      return build_f_Button23();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button23 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button23.setSize(org.gwtbootstrap3.client.ui.constants.ButtonSize.EXTRA_SMALL);
      f_Button23.setText("Extra Small");
      f_Button23.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button23;
    }

    /**
     * Getter for f_PanelFooter24 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter24() {
      return build_f_PanelFooter24();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter24 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter24.add(get_f_PrettyPre25());

      return f_PanelFooter24;
    }

    /**
     * Getter for f_PrettyPre25 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre25() {
      return build_f_PrettyPre25();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre25() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre25 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre25.setHTML(template_html2().asString());
      f_PrettyPre25.addStyleName("lang-xml");

      return f_PrettyPre25;
    }

    /**
     * Getter for f_Panel26 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel26() {
      return build_f_Panel26();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel26 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel26.add(get_f_PanelHeader27());
      f_Panel26.add(get_f_PanelBody29());
      f_Panel26.add(get_f_PanelFooter32());

      return f_Panel26;
    }

    /**
     * Getter for f_PanelHeader27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader27() {
      return build_f_PanelHeader27();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader27 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader27.add(get_f_Heading28());

      return f_PanelHeader27;
    }

    /**
     * Getter for f_Heading28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading28() {
      return build_f_Heading28();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading28 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading28.setText("Disabled State");

      return f_Heading28;
    }

    /**
     * Getter for f_PanelBody29 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody29() {
      return build_f_PanelBody29();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody29 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody29.add(get_f_Button30());
      f_PanelBody29.add(get_f_Button31());
      f_PanelBody29.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody29;
    }

    /**
     * Getter for f_Button30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button30() {
      return build_f_Button30();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button30 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button30.setText("Enabled");
      f_Button30.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button30.setEnabled(true);

      return f_Button30;
    }

    /**
     * Getter for f_Button31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button31() {
      return build_f_Button31();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button31 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button31.setText("Disabled");
      f_Button31.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button31.setEnabled(false);

      return f_Button31;
    }

    /**
     * Getter for f_PanelFooter32 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter32() {
      return build_f_PanelFooter32();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter32 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter32.add(get_f_PrettyPre33());

      return f_PanelFooter32;
    }

    /**
     * Getter for f_PrettyPre33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre33() {
      return build_f_PrettyPre33();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre33() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre33 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre33.setHTML(template_html3().asString());
      f_PrettyPre33.addStyleName("lang-xml");

      return f_PrettyPre33;
    }

    /**
     * Getter for f_Panel34 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel34() {
      return build_f_Panel34();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel34 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel34.add(get_f_PanelHeader35());
      f_Panel34.add(get_f_PanelBody37());
      f_Panel34.add(get_f_PanelFooter41());

      return f_Panel34;
    }

    /**
     * Getter for f_PanelHeader35 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader35() {
      return build_f_PanelHeader35();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader35 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader35.add(get_f_Heading36());

      return f_PanelHeader35;
    }

    /**
     * Getter for f_Heading36 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading36() {
      return build_f_Heading36();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading36 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading36.setText("With Icons");

      return f_Heading36;
    }

    /**
     * Getter for f_PanelBody37 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody37() {
      return build_f_PanelBody37();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody37 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody37.add(get_f_Button38());
      f_PanelBody37.add(get_f_Button39());
      f_PanelBody37.add(get_f_Button40());
      f_PanelBody37.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody37;
    }

    /**
     * Getter for f_Button38 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button38() {
      return build_f_Button38();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button38 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button38.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.STAR);
      f_Button38.setText("With Icon");
      f_Button38.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button38;
    }

    /**
     * Getter for f_Button39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button39() {
      return build_f_Button39();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button39 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button39.setIconPosition(org.gwtbootstrap3.client.ui.constants.IconPosition.RIGHT);
      f_Button39.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.STAR);
      f_Button39.setText("With Icon on Right");
      f_Button39.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button39;
    }

    /**
     * Getter for f_Button40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button40() {
      return build_f_Button40();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button40 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button40.setIconSpin(true);
      f_Button40.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.STAR);
      f_Button40.setText("With Icon with Properties");
      f_Button40.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button40.setIconBordered(true);

      return f_Button40;
    }

    /**
     * Getter for f_PanelFooter41 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter41() {
      return build_f_PanelFooter41();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter41 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter41.add(get_f_PrettyPre42());

      return f_PanelFooter41;
    }

    /**
     * Getter for f_PrettyPre42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre42() {
      return build_f_PrettyPre42();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre42() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre42 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre42.setHTML(template_html4().asString());
      f_PrettyPre42.addStyleName("lang-xml");

      return f_PrettyPre42;
    }

    /**
     * Getter for f_Panel43 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel43() {
      return build_f_Panel43();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel43 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel43.add(get_f_PanelHeader44());
      f_Panel43.add(get_f_PanelBody46());
      f_Panel43.add(get_f_PanelFooter49());

      return f_Panel43;
    }

    /**
     * Getter for f_PanelHeader44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader44() {
      return build_f_PanelHeader44();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader44 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader44.add(get_f_Heading45());

      return f_PanelHeader44;
    }

    /**
     * Getter for f_Heading45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading45() {
      return build_f_Heading45();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading45 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading45.setText("With Badges");

      return f_Heading45;
    }

    /**
     * Getter for f_PanelBody46 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody46() {
      return build_f_PanelBody46();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody46 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody46.add(get_f_Button47());
      f_PanelBody46.add(get_f_Button48());
      f_PanelBody46.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody46;
    }

    /**
     * Getter for f_Button47 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button47() {
      return build_f_Button47();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button47 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button47.setText("With Badge");
      f_Button47.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button47.setBadgeText("1");

      return f_Button47;
    }

    /**
     * Getter for f_Button48 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button48() {
      return build_f_Button48();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button48 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button48.setText("With Badge on Left");
      f_Button48.setBadgePosition(org.gwtbootstrap3.client.ui.constants.BadgePosition.LEFT);
      f_Button48.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button48.setBadgeText("2");

      return f_Button48;
    }

    /**
     * Getter for f_PanelFooter49 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter49() {
      return build_f_PanelFooter49();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter49 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter49.add(get_f_PrettyPre50());

      return f_PanelFooter49;
    }

    /**
     * Getter for f_PrettyPre50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre50() {
      return build_f_PrettyPre50();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre50() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre50 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre50.setHTML(template_html5().asString());
      f_PrettyPre50.addStyleName("lang-xml");

      return f_PrettyPre50;
    }

    /**
     * Getter for f_Panel51 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel51() {
      return build_f_Panel51();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel51 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel51.add(get_f_PanelHeader52());
      f_Panel51.add(get_f_PanelBody54());
      f_Panel51.add(get_f_PanelFooter56());

      return f_Panel51;
    }

    /**
     * Getter for f_PanelHeader52 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader52() {
      return build_f_PanelHeader52();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader52 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader52.add(get_f_Heading53());

      return f_PanelHeader52;
    }

    /**
     * Getter for f_Heading53 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading53() {
      return build_f_Heading53();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading53 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading53.setText("Toggle button");

      return f_Heading53;
    }

    /**
     * Getter for f_PanelBody54 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody54() {
      return build_f_PanelBody54();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody54 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody54.add(get_f_Button55());
      f_PanelBody54.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody54;
    }

    /**
     * Getter for f_Button55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button55() {
      return build_f_Button55();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button55 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button55.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.BUTTON);
      f_Button55.setText("Toggle button");

      return f_Button55;
    }

    /**
     * Getter for f_PanelFooter56 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter56() {
      return build_f_PanelFooter56();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter56 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter56.add(get_f_PrettyPre57());

      return f_PanelFooter56;
    }

    /**
     * Getter for f_PrettyPre57 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre57() {
      return build_f_PrettyPre57();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre57() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre57 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre57.setHTML(template_html6().asString());
      f_PrettyPre57.addStyleName("lang-xml");

      return f_PrettyPre57;
    }

    /**
     * Getter for f_Panel58 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel58() {
      return build_f_Panel58();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel58 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel58.add(get_f_PanelHeader59());
      f_Panel58.add(get_f_PanelBody61());
      f_Panel58.add(get_f_PanelFooter62());

      return f_Panel58;
    }

    /**
     * Getter for f_PanelHeader59 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader59() {
      return build_f_PanelHeader59();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader59 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader59.add(get_f_Heading60());

      return f_PanelHeader59;
    }

    /**
     * Getter for f_Heading60 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading60() {
      return build_f_Heading60();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading60 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading60.setText("With loading state");

      return f_Heading60;
    }

    /**
     * Getter for f_PanelBody61 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody61() {
      return build_f_PanelBody61();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody61 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody61.add(get_button());
      f_PanelBody61.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody61;
    }

    /**
     * Getter for button called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_button() {
      return build_button();
    }
    private org.gwtbootstrap3.client.ui.Button build_button() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button button = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      button.setText("Click me");
      button.setDataLoadingText("Loading...");
      button.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.button = button;

      return button;
    }

    /**
     * Getter for f_PanelFooter62 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter62() {
      return build_f_PanelFooter62();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter62 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter62.add(get_f_Heading63());
      f_PanelFooter62.add(get_f_PrettyPre64());
      f_PanelFooter62.add(get_f_Heading65());
      f_PanelFooter62.add(get_f_PrettyPre66());

      return f_PanelFooter62;
    }

    /**
     * Getter for f_Heading63 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading63() {
      return build_f_Heading63();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading63 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading63.setText("UiBinder");

      return f_Heading63;
    }

    /**
     * Getter for f_PrettyPre64 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre64() {
      return build_f_PrettyPre64();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre64() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre64 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre64.setHTML(template_html7().asString());
      f_PrettyPre64.addStyleName("lang-xml");

      return f_PrettyPre64;
    }

    /**
     * Getter for f_Heading65 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading65() {
      return build_f_Heading65();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading65 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading65.setText("Java code");

      return f_Heading65;
    }

    /**
     * Getter for f_PrettyPre66 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre66() {
      return build_f_PrettyPre66();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre66() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre66 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre66.setHTML(template_html8().asString());
      f_PrettyPre66.addStyleName("lang-java");

      return f_PrettyPre66;
    }

    /**
     * Getter for f_Panel67 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel67() {
      return build_f_Panel67();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel67 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel67.add(get_f_PanelHeader68());
      f_Panel67.add(get_f_PanelBody70());
      f_Panel67.add(get_f_PanelFooter72());

      return f_Panel67;
    }

    /**
     * Getter for f_PanelHeader68 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader68() {
      return build_f_PanelHeader68();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader68 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader68.add(get_f_Heading69());

      return f_PanelHeader68;
    }

    /**
     * Getter for f_Heading69 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading69() {
      return build_f_Heading69();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading69 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading69.setText("Block level button");

      return f_Heading69;
    }

    /**
     * Getter for f_PanelBody70 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody70() {
      return build_f_PanelBody70();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody70 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody70.add(get_f_Button71());
      f_PanelBody70.addStyleName("" + get_style().spacing() + "");

      return f_PanelBody70;
    }

    /**
     * Getter for f_Button71 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button71() {
      return build_f_Button71();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button71 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button71.setBlock(true);
      f_Button71.setText("Block level button");

      return f_Button71;
    }

    /**
     * Getter for f_PanelFooter72 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter72() {
      return build_f_PanelFooter72();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter72 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter72.add(get_f_PrettyPre73());

      return f_PanelFooter72;
    }

    /**
     * Getter for f_PrettyPre73 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre73() {
      return build_f_PrettyPre73();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre73() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre73 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre73.setHTML(template_html9().asString());
      f_PrettyPre73.addStyleName("lang-xml");

      return f_PrettyPre73;
    }
  }
}
