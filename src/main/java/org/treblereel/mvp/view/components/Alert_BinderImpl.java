// Template file: org/treblereel/mvp/view/components/Alert.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.392")
public class Alert_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Alert>, org.treblereel.mvp.view.components.Alert.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:Alert type=\"SUCCESS\"&gt;\\n \\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n &lt;/b:Alert&gt;\\n \\n &lt;b:Alert type=\"INFO\"&gt;\\n \\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n &lt;/b:Alert&gt;\\n \\n &lt;b:Alert type=\"WARNING\"&gt;\\n \\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n &lt;/b:Alert&gt;\\n \\n &lt;b:Alert type=\"DANGER\"&gt;\\n \\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n &lt;/b:Alert&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Alert type=\"SUCCESS\" dismissable=\"true\"&gt;\\n \\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n &lt;/b:Alert&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("@UiField\\n Alert dismissibleAlert;\\n\\n // Add a close handler\\n dismissibleAlert.addCloseHandler(...);\\n\\n // Add a closed handler\\n dismissibleAlert.addClosedHandler(...);")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:Alert type=\"SUCCESS\" dismissable=\"true\"&gt;\\n \\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n \\s\\s&lt;b:AlertLink&gt;Link&lt;/AlertLink&gt;\\n &lt;/b:Alert&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
  }

  Template template = new Alert_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Alert owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Alert owner;


    public Widgets(final org.treblereel.mvp.view.components.Alert owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Alert_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Alert_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Alert_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Alert_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Alert_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.components.Alert_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.components.Alert_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel22());
      f_Column2.add(get_f_Panel33());

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
      f_PageHeader3.setText("Alerts");

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
      f_Panel4.add(get_f_PanelFooter20());

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
      f_PanelBody7.add(get_f_Alert8());
      f_PanelBody7.add(get_f_Alert11());
      f_PanelBody7.add(get_f_Alert14());
      f_PanelBody7.add(get_f_Alert17());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Alert8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_f_Alert8() {
      return build_f_Alert8();
    }
    private org.gwtbootstrap3.client.ui.Alert build_f_Alert8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert f_Alert8 = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      f_Alert8.add(get_f_Strong9());
      f_Alert8.add(get_f_Text10());
      f_Alert8.setType(org.gwtbootstrap3.client.ui.constants.AlertType.SUCCESS);

      return f_Alert8;
    }

    /**
     * Getter for f_Strong9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong9() {
      return build_f_Strong9();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong9 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong9.setText("Title");

      return f_Strong9;
    }

    /**
     * Getter for f_Text10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text10() {
      return build_f_Text10();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text10 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text10.setText("Description");

      return f_Text10;
    }

    /**
     * Getter for f_Alert11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_f_Alert11() {
      return build_f_Alert11();
    }
    private org.gwtbootstrap3.client.ui.Alert build_f_Alert11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert f_Alert11 = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      f_Alert11.add(get_f_Strong12());
      f_Alert11.add(get_f_Text13());
      f_Alert11.setType(org.gwtbootstrap3.client.ui.constants.AlertType.INFO);

      return f_Alert11;
    }

    /**
     * Getter for f_Strong12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong12() {
      return build_f_Strong12();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong12 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong12.setText("Title");

      return f_Strong12;
    }

    /**
     * Getter for f_Text13 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text13() {
      return build_f_Text13();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text13 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text13.setText("Description");

      return f_Text13;
    }

    /**
     * Getter for f_Alert14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_f_Alert14() {
      return build_f_Alert14();
    }
    private org.gwtbootstrap3.client.ui.Alert build_f_Alert14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert f_Alert14 = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      f_Alert14.add(get_f_Strong15());
      f_Alert14.add(get_f_Text16());
      f_Alert14.setType(org.gwtbootstrap3.client.ui.constants.AlertType.WARNING);

      return f_Alert14;
    }

    /**
     * Getter for f_Strong15 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong15() {
      return build_f_Strong15();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong15 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong15.setText("Title");

      return f_Strong15;
    }

    /**
     * Getter for f_Text16 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text16() {
      return build_f_Text16();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text16 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text16.setText("Description");

      return f_Text16;
    }

    /**
     * Getter for f_Alert17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_f_Alert17() {
      return build_f_Alert17();
    }
    private org.gwtbootstrap3.client.ui.Alert build_f_Alert17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert f_Alert17 = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      f_Alert17.add(get_f_Strong18());
      f_Alert17.add(get_f_Text19());
      f_Alert17.addStyleName("" + get_style().marginFix() + "");
      f_Alert17.setType(org.gwtbootstrap3.client.ui.constants.AlertType.DANGER);

      return f_Alert17;
    }

    /**
     * Getter for f_Strong18 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong18() {
      return build_f_Strong18();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong18 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong18.setText("Title");

      return f_Strong18;
    }

    /**
     * Getter for f_Text19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text19() {
      return build_f_Text19();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text19 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text19.setText("Description");

      return f_Text19;
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
      f_PrettyPre21.setHTML(template_html1().asString());
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
      f_Panel22.add(get_f_PanelFooter28());

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
      f_Heading24.setText("Dismissible with Handlers");

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
      f_PanelBody25.add(get_dismissibleAlert());

      return f_PanelBody25;
    }

    /**
     * Getter for dismissibleAlert called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_dismissibleAlert() {
      return build_dismissibleAlert();
    }
    private org.gwtbootstrap3.client.ui.Alert build_dismissibleAlert() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert dismissibleAlert = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      dismissibleAlert.add(get_f_Strong26());
      dismissibleAlert.add(get_f_Text27());
      dismissibleAlert.addStyleName("" + get_style().marginFix() + "");
      dismissibleAlert.setDismissable(true);
      dismissibleAlert.setType(org.gwtbootstrap3.client.ui.constants.AlertType.SUCCESS);

      this.owner.dismissibleAlert = dismissibleAlert;

      return dismissibleAlert;
    }

    /**
     * Getter for f_Strong26 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong26() {
      return build_f_Strong26();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong26 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong26.setText("Title");

      return f_Strong26;
    }

    /**
     * Getter for f_Text27 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text27() {
      return build_f_Text27();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text27 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text27.setText("Description");

      return f_Text27;
    }

    /**
     * Getter for f_PanelFooter28 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter28() {
      return build_f_PanelFooter28();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter28 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter28.add(get_f_Heading29());
      f_PanelFooter28.add(get_f_PrettyPre30());
      f_PanelFooter28.add(get_f_Heading31());
      f_PanelFooter28.add(get_f_PrettyPre32());

      return f_PanelFooter28;
    }

    /**
     * Getter for f_Heading29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading29() {
      return build_f_Heading29();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading29 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading29.setText("UiBinder");

      return f_Heading29;
    }

    /**
     * Getter for f_PrettyPre30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre30() {
      return build_f_PrettyPre30();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre30() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre30 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre30.setHTML(template_html2().asString());
      f_PrettyPre30.addStyleName("lang-xml");

      return f_PrettyPre30;
    }

    /**
     * Getter for f_Heading31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading31() {
      return build_f_Heading31();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading31 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading31.setText("Java code");

      return f_Heading31;
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
      f_PrettyPre32.addStyleName("lang-java");

      return f_PrettyPre32;
    }

    /**
     * Getter for f_Panel33 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel33() {
      return build_f_Panel33();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel33 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel33.add(get_f_PanelHeader34());
      f_Panel33.add(get_f_PanelBody36());
      f_Panel33.add(get_f_PanelFooter41());

      return f_Panel33;
    }

    /**
     * Getter for f_PanelHeader34 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader34() {
      return build_f_PanelHeader34();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader34 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader34.add(get_f_Heading35());

      return f_PanelHeader34;
    }

    /**
     * Getter for f_Heading35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading35() {
      return build_f_Heading35();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading35 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading35.setText("Links Inside");

      return f_Heading35;
    }

    /**
     * Getter for f_PanelBody36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody36() {
      return build_f_PanelBody36();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody36 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody36.add(get_f_Alert37());

      return f_PanelBody36;
    }

    /**
     * Getter for f_Alert37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_f_Alert37() {
      return build_f_Alert37();
    }
    private org.gwtbootstrap3.client.ui.Alert build_f_Alert37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert f_Alert37 = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      f_Alert37.add(get_f_Strong38());
      f_Alert37.add(get_f_Text39());
      f_Alert37.add(get_f_Anchor40());
      f_Alert37.addStyleName("" + get_style().marginFix() + "");
      f_Alert37.setDismissable(true);
      f_Alert37.setType(org.gwtbootstrap3.client.ui.constants.AlertType.SUCCESS);

      return f_Alert37;
    }

    /**
     * Getter for f_Strong38 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong38() {
      return build_f_Strong38();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong38 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong38.setText("Title");

      return f_Strong38;
    }

    /**
     * Getter for f_Text39 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text39() {
      return build_f_Text39();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text39 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text39.setText("Description");

      return f_Text39;
    }

    /**
     * Getter for f_Anchor40 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor40() {
      return build_f_Anchor40();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor40 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor40.setText("Link");

      return f_Anchor40;
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
  }
}
