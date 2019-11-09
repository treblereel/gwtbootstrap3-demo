// Template file: org/treblereel/mvp/view/extras/ToggleSwitchView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.932")
public class ToggleSwitchView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.ToggleSwitchView>, org.treblereel.mvp.view.extras.ToggleSwitchView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Bootstrap Switch")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 3.3.2")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use ToggleSwitch, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.toggleswitch.ToggleSwitch\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it b3):")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("xmlns:b3=\"urn:import:org.gwtbootstrap3.extras.toggleswitch.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("&lt;b3:ToggleSwitch /&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("&lt;b3:ToggleSwitch size=\"LARGE\"/&gt;\\n &lt;b3:ToggleSwitch /&gt;\\n &lt;b3:ToggleSwitch size=\"SMALL\"/&gt;\\n &lt;b3:ToggleSwitch size=\"MINI\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("&lt;b3:ToggleSwitch animate=\"false\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("&lt;b3:ToggleSwitch enabled=\"false\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("&lt;b3:ToggleSwitch readOnly=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("&lt;b3:ToggleSwitch indeterminate=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("&lt;b3:ToggleSwitch inverse=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("&lt;b3:ToggleSwitch onColor=\"INFO\" offColor=\"WARNING\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("&lt;b3:ToggleSwitch onText=\"Yes\" offText=\"No\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("&lt;b3:ToggleSwitch onIcon=\"CHECK\" offIcon=\"TIMES\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
    @Template("&lt;b3:ToggleSwitch labelText=\"Label\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("By default, the handle's width is calculated automatically, to ensure the text inside will fit. This can be explicitly set by setting handleWidth to \"auto\".")
    org.gwtproject.safehtml.shared.SafeHtml html21();
     
    @Template("&lt;b3:ToggleSwitch handleWidth=\"100\"/&gt;\\n &lt;b3:ToggleSwitch onText=\"Automatic sizing by default\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
    @Template("By default, the label's width is calculated automatically, to ensure the text inside will fit. This can be explicitly set by setting labelWidth to \"auto\".")
    org.gwtproject.safehtml.shared.SafeHtml html23();
     
    @Template("&lt;b3:ToggleSwitch labelWidth=\"100\"/&gt;\\n &lt;b3:ToggleSwitch labelText=\"Automatic sizing by default\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html24();
     
    @Template("&lt;b3:ToggleSwitchRadio name=\"radio1\"/&gt;\\n &lt;b3:ToggleSwitchRadio name=\"radio1\"/&gt;\\n &lt;b3:ToggleSwitchRadio name=\"radio1\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html25();
     
    @Template("&lt;b3:ToggleSwitchRadio name=\"radio2\" radioAllOff=\"true\"/&gt;\\n &lt;b3:ToggleSwitchRadio name=\"radio2\" radioAllOff=\"true\"/&gt;\\n &lt;b3:ToggleSwitchRadio name=\"radio2\" radioAllOff=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html26();
     
    @Template("&lt;b3:ToggleSwitch labelText=\"GWT\" offColor=\"DANGER\" offIcon=\"THUMBS_DOWN\" onColor=\"SUCCESS\" onIcon=\"THUMBS_UP\" value=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html27();
     
  }

  Template template = new ToggleSwitchView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.ToggleSwitchView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.ToggleSwitchView owner;


    public Widgets(final org.treblereel.mvp.view.extras.ToggleSwitchView owner) {
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
    org.gwtproject.safehtml.shared.SafeHtml template_html13() {
      return template.html13();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html14() {
      return template.html14();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html15() {
      return template.html15();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html16() {
      return template.html16();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html17() {
      return template.html17();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html18() {
      return template.html18();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html19() {
      return template.html19();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html20() {
      return template.html20();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html21() {
      return template.html21();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html22() {
      return template.html22();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html23() {
      return template.html23();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html24() {
      return template.html24();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html25() {
      return template.html25();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html26() {
      return template.html26();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html27() {
      return template.html27();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.ToggleSwitchView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.ToggleSwitchView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.ToggleSwitchView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.ToggleSwitchView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.ToggleSwitchView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.ToggleSwitchView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.ToggleSwitchView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_BlockQuote9());
      f_Column2.add(get_f_Panel17());
      f_Column2.add(get_f_Panel24());
      f_Column2.add(get_f_Panel34());
      f_Column2.add(get_f_Panel41());
      f_Column2.add(get_f_Panel48());
      f_Column2.add(get_f_Panel55());
      f_Column2.add(get_f_Panel62());
      f_Column2.add(get_f_Panel69());
      f_Column2.add(get_f_Panel76());
      f_Column2.add(get_f_Panel83());
      f_Column2.add(get_f_Panel90());
      f_Column2.add(get_f_Panel97());
      f_Column2.add(get_f_Panel108());
      f_Column2.add(get_f_Panel119());
      f_Column2.add(get_f_Panel128());
      f_Column2.add(get_f_Panel137());

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
      f_PageHeader3.setText("ToggleSwitch");

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
      f_BlockQuote4.add(get_f_Strong5());
      f_BlockQuote4.add(get_f_Anchor6());
      f_BlockQuote4.add(get_f_Br7());
      f_BlockQuote4.add(get_f_Strong8());

      return f_BlockQuote4;
    }

    /**
     * Getter for f_Strong5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong5() {
      return build_f_Strong5();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong5 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong5.setHTML(template_html1().asString());

      return f_Strong5;
    }

    /**
     * Getter for f_Anchor6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor6() {
      return build_f_Anchor6();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor6 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor6.setHTML(template_html2().asString());
      f_Anchor6.addStyleName("" + get_style().spacing() + "");
      f_Anchor6.setHref("http://www.bootstrap-switch.org/");
      f_Anchor6.setTarget("_blank");

      return f_Anchor6;
    }

    /**
     * Getter for f_Br7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br7() {
      return build_f_Br7();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br7 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br7;
    }

    /**
     * Getter for f_Strong8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong8() {
      return build_f_Strong8();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong8 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong8.setHTML(template_html3().asString());

      return f_Strong8;
    }

    /**
     * Getter for f_BlockQuote9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.BlockQuote get_f_BlockQuote9() {
      return build_f_BlockQuote9();
    }
    private org.gwtbootstrap3.client.ui.BlockQuote build_f_BlockQuote9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.BlockQuote f_BlockQuote9 = new org.gwtbootstrap3.client.ui.BlockQuote();
      // Setup section.
      f_BlockQuote9.add(get_f_Heading10());
      f_BlockQuote9.add(get_f_Paragraph11());
      f_BlockQuote9.add(get_f_PrettyPre12());
      f_BlockQuote9.add(get_f_Paragraph13());
      f_BlockQuote9.add(get_f_PrettyPre14());
      f_BlockQuote9.add(get_f_Paragraph15());
      f_BlockQuote9.add(get_f_PrettyPre16());
      f_BlockQuote9.addStyleName("" + get_style().danger() + "");

      return f_BlockQuote9;
    }

    /**
     * Getter for f_Heading10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading10() {
      return build_f_Heading10();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading10 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading10.addStyleName("" + get_style().marginFix() + "");
      f_Heading10.setText("Required for use");

      return f_Heading10;
    }

    /**
     * Getter for f_Paragraph11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph11() {
      return build_f_Paragraph11();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph11 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.

      return f_Paragraph11;
    }

    /**
     * Getter for f_PrettyPre12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre12() {
      return build_f_PrettyPre12();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre12() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre12 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre12.setHTML(template_html5().asString());
      f_PrettyPre12.addStyleName("lang-xml");

      return f_PrettyPre12;
    }

    /**
     * Getter for f_Paragraph13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph13() {
      return build_f_Paragraph13();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph13 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.

      return f_Paragraph13;
    }

    /**
     * Getter for f_PrettyPre14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre14() {
      return build_f_PrettyPre14();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre14() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre14 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre14.setHTML(template_html7().asString());
      f_PrettyPre14.addStyleName("lang-xml");

      return f_PrettyPre14;
    }

    /**
     * Getter for f_Paragraph15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph15() {
      return build_f_Paragraph15();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph15 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html8().asString());
      // Setup section.

      return f_Paragraph15;
    }

    /**
     * Getter for f_PrettyPre16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre16() {
      return build_f_PrettyPre16();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre16() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre16 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre16.setHTML(template_html9().asString());
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
      f_Panel17.add(get_f_PanelFooter22());

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
      f_Heading19.setText("Basic ToggleSwitch");

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
      f_PanelBody20.add(get_f_ToggleSwitch21());

      return f_PanelBody20;
    }

    /**
     * Getter for f_ToggleSwitch21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch21() {
      return build_f_ToggleSwitch21();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch21() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch21 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.

      return f_ToggleSwitch21;
    }

    /**
     * Getter for f_PanelFooter22 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter22() {
      return build_f_PanelFooter22();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter22 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter22.add(get_f_PrettyPre23());

      return f_PanelFooter22;
    }

    /**
     * Getter for f_PrettyPre23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre23() {
      return build_f_PrettyPre23();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre23() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre23 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre23.setHTML(template_html10().asString());
      f_PrettyPre23.addStyleName("lang-xml");

      return f_PrettyPre23;
    }

    /**
     * Getter for f_Panel24 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel24() {
      return build_f_Panel24();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel24 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel24.add(get_f_PanelHeader25());
      f_Panel24.add(get_f_PanelBody27());
      f_Panel24.add(get_f_PanelFooter32());

      return f_Panel24;
    }

    /**
     * Getter for f_PanelHeader25 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader25() {
      return build_f_PanelHeader25();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader25 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader25.add(get_f_Heading26());

      return f_PanelHeader25;
    }

    /**
     * Getter for f_Heading26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading26() {
      return build_f_Heading26();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading26 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading26.setText("Sizes");

      return f_Heading26;
    }

    /**
     * Getter for f_PanelBody27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody27() {
      return build_f_PanelBody27();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody27 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody27.add(get_f_ToggleSwitch28());
      f_PanelBody27.add(get_f_ToggleSwitch29());
      f_PanelBody27.add(get_f_ToggleSwitch30());
      f_PanelBody27.add(get_f_ToggleSwitch31());

      return f_PanelBody27;
    }

    /**
     * Getter for f_ToggleSwitch28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch28() {
      return build_f_ToggleSwitch28();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch28() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch28 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch28.setSize(org.gwtbootstrap3.extras.toggleswitch.client.ui.base.constants.SizeType.LARGE);

      return f_ToggleSwitch28;
    }

    /**
     * Getter for f_ToggleSwitch29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch29() {
      return build_f_ToggleSwitch29();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch29() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch29 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.

      return f_ToggleSwitch29;
    }

    /**
     * Getter for f_ToggleSwitch30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch30() {
      return build_f_ToggleSwitch30();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch30() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch30 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch30.setSize(org.gwtbootstrap3.extras.toggleswitch.client.ui.base.constants.SizeType.SMALL);

      return f_ToggleSwitch30;
    }

    /**
     * Getter for f_ToggleSwitch31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch31() {
      return build_f_ToggleSwitch31();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch31() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch31 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch31.setSize(org.gwtbootstrap3.extras.toggleswitch.client.ui.base.constants.SizeType.MINI);

      return f_ToggleSwitch31;
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
      f_PrettyPre33.setHTML(template_html11().asString());
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
      f_Panel34.add(get_f_PanelFooter39());

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
      f_Heading36.setText("Disable animation");

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
      f_PanelBody37.add(get_f_ToggleSwitch38());

      return f_PanelBody37;
    }

    /**
     * Getter for f_ToggleSwitch38 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch38() {
      return build_f_ToggleSwitch38();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch38() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch38 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch38.setAnimate(false);

      return f_ToggleSwitch38;
    }

    /**
     * Getter for f_PanelFooter39 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter39() {
      return build_f_PanelFooter39();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter39 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter39.add(get_f_PrettyPre40());

      return f_PanelFooter39;
    }

    /**
     * Getter for f_PrettyPre40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre40() {
      return build_f_PrettyPre40();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre40() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre40 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre40.setHTML(template_html12().asString());
      f_PrettyPre40.addStyleName("lang-xml");

      return f_PrettyPre40;
    }

    /**
     * Getter for f_Panel41 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel41() {
      return build_f_Panel41();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel41 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel41.add(get_f_PanelHeader42());
      f_Panel41.add(get_f_PanelBody44());
      f_Panel41.add(get_f_PanelFooter46());

      return f_Panel41;
    }

    /**
     * Getter for f_PanelHeader42 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader42() {
      return build_f_PanelHeader42();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader42 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader42.add(get_f_Heading43());

      return f_PanelHeader42;
    }

    /**
     * Getter for f_Heading43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading43() {
      return build_f_Heading43();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading43 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading43.setText("Disabled");

      return f_Heading43;
    }

    /**
     * Getter for f_PanelBody44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody44() {
      return build_f_PanelBody44();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody44 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody44.add(get_f_ToggleSwitch45());

      return f_PanelBody44;
    }

    /**
     * Getter for f_ToggleSwitch45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch45() {
      return build_f_ToggleSwitch45();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch45() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch45 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch45.setEnabled(false);

      return f_ToggleSwitch45;
    }

    /**
     * Getter for f_PanelFooter46 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter46() {
      return build_f_PanelFooter46();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter46 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter46.add(get_f_PrettyPre47());

      return f_PanelFooter46;
    }

    /**
     * Getter for f_PrettyPre47 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre47() {
      return build_f_PrettyPre47();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre47() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre47 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre47.setHTML(template_html13().asString());
      f_PrettyPre47.addStyleName("lang-xml");

      return f_PrettyPre47;
    }

    /**
     * Getter for f_Panel48 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel48() {
      return build_f_Panel48();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel48 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel48.add(get_f_PanelHeader49());
      f_Panel48.add(get_f_PanelBody51());
      f_Panel48.add(get_f_PanelFooter53());

      return f_Panel48;
    }

    /**
     * Getter for f_PanelHeader49 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader49() {
      return build_f_PanelHeader49();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader49 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader49.add(get_f_Heading50());

      return f_PanelHeader49;
    }

    /**
     * Getter for f_Heading50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading50() {
      return build_f_Heading50();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading50 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading50.setText("Read only");

      return f_Heading50;
    }

    /**
     * Getter for f_PanelBody51 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody51() {
      return build_f_PanelBody51();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody51 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody51.add(get_f_ToggleSwitch52());

      return f_PanelBody51;
    }

    /**
     * Getter for f_ToggleSwitch52 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch52() {
      return build_f_ToggleSwitch52();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch52() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch52 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch52.setReadOnly(true);

      return f_ToggleSwitch52;
    }

    /**
     * Getter for f_PanelFooter53 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter53() {
      return build_f_PanelFooter53();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter53 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter53.add(get_f_PrettyPre54());

      return f_PanelFooter53;
    }

    /**
     * Getter for f_PrettyPre54 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre54() {
      return build_f_PrettyPre54();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre54() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre54 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre54.setHTML(template_html14().asString());
      f_PrettyPre54.addStyleName("lang-xml");

      return f_PrettyPre54;
    }

    /**
     * Getter for f_Panel55 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel55() {
      return build_f_Panel55();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel55 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel55.add(get_f_PanelHeader56());
      f_Panel55.add(get_f_PanelBody58());
      f_Panel55.add(get_f_PanelFooter60());

      return f_Panel55;
    }

    /**
     * Getter for f_PanelHeader56 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader56() {
      return build_f_PanelHeader56();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader56 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader56.add(get_f_Heading57());

      return f_PanelHeader56;
    }

    /**
     * Getter for f_Heading57 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading57() {
      return build_f_Heading57();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading57 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading57.setText("Indeterminate");

      return f_Heading57;
    }

    /**
     * Getter for f_PanelBody58 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody58() {
      return build_f_PanelBody58();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody58 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody58.add(get_f_ToggleSwitch59());

      return f_PanelBody58;
    }

    /**
     * Getter for f_ToggleSwitch59 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch59() {
      return build_f_ToggleSwitch59();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch59() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch59 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch59.setIndeterminate(true);

      return f_ToggleSwitch59;
    }

    /**
     * Getter for f_PanelFooter60 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter60() {
      return build_f_PanelFooter60();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter60 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter60.add(get_f_PrettyPre61());

      return f_PanelFooter60;
    }

    /**
     * Getter for f_PrettyPre61 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre61() {
      return build_f_PrettyPre61();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre61() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre61 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre61.setHTML(template_html15().asString());
      f_PrettyPre61.addStyleName("lang-xml");

      return f_PrettyPre61;
    }

    /**
     * Getter for f_Panel62 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel62() {
      return build_f_Panel62();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel62 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel62.add(get_f_PanelHeader63());
      f_Panel62.add(get_f_PanelBody65());
      f_Panel62.add(get_f_PanelFooter67());

      return f_Panel62;
    }

    /**
     * Getter for f_PanelHeader63 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader63() {
      return build_f_PanelHeader63();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader63 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader63.add(get_f_Heading64());

      return f_PanelHeader63;
    }

    /**
     * Getter for f_Heading64 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading64() {
      return build_f_Heading64();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading64 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading64.setText("Inverse");

      return f_Heading64;
    }

    /**
     * Getter for f_PanelBody65 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody65() {
      return build_f_PanelBody65();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody65 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody65.add(get_f_ToggleSwitch66());

      return f_PanelBody65;
    }

    /**
     * Getter for f_ToggleSwitch66 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch66() {
      return build_f_ToggleSwitch66();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch66() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch66 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch66.setInverse(true);

      return f_ToggleSwitch66;
    }

    /**
     * Getter for f_PanelFooter67 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter67() {
      return build_f_PanelFooter67();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter67 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter67.add(get_f_PrettyPre68());

      return f_PanelFooter67;
    }

    /**
     * Getter for f_PrettyPre68 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre68() {
      return build_f_PrettyPre68();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre68() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre68 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre68.setHTML(template_html16().asString());
      f_PrettyPre68.addStyleName("lang-xml");

      return f_PrettyPre68;
    }

    /**
     * Getter for f_Panel69 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel69() {
      return build_f_Panel69();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel69 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel69.add(get_f_PanelHeader70());
      f_Panel69.add(get_f_PanelBody72());
      f_Panel69.add(get_f_PanelFooter74());

      return f_Panel69;
    }

    /**
     * Getter for f_PanelHeader70 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader70() {
      return build_f_PanelHeader70();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader70 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader70.add(get_f_Heading71());

      return f_PanelHeader70;
    }

    /**
     * Getter for f_Heading71 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading71() {
      return build_f_Heading71();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading71 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading71.setText("On/Off Color");

      return f_Heading71;
    }

    /**
     * Getter for f_PanelBody72 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody72() {
      return build_f_PanelBody72();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody72 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody72.add(get_f_ToggleSwitch73());

      return f_PanelBody72;
    }

    /**
     * Getter for f_ToggleSwitch73 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch73() {
      return build_f_ToggleSwitch73();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch73() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch73 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch73.setOffColor(org.gwtbootstrap3.extras.toggleswitch.client.ui.base.constants.ColorType.WARNING);
      f_ToggleSwitch73.setOnColor(org.gwtbootstrap3.extras.toggleswitch.client.ui.base.constants.ColorType.INFO);

      return f_ToggleSwitch73;
    }

    /**
     * Getter for f_PanelFooter74 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter74() {
      return build_f_PanelFooter74();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter74() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter74 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter74.add(get_f_PrettyPre75());

      return f_PanelFooter74;
    }

    /**
     * Getter for f_PrettyPre75 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre75() {
      return build_f_PrettyPre75();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre75() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre75 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre75.setHTML(template_html17().asString());
      f_PrettyPre75.addStyleName("lang-xml");

      return f_PrettyPre75;
    }

    /**
     * Getter for f_Panel76 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel76() {
      return build_f_Panel76();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel76 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel76.add(get_f_PanelHeader77());
      f_Panel76.add(get_f_PanelBody79());
      f_Panel76.add(get_f_PanelFooter81());

      return f_Panel76;
    }

    /**
     * Getter for f_PanelHeader77 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader77() {
      return build_f_PanelHeader77();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader77 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader77.add(get_f_Heading78());

      return f_PanelHeader77;
    }

    /**
     * Getter for f_Heading78 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading78() {
      return build_f_Heading78();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading78 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading78.setText("On/Off Text");

      return f_Heading78;
    }

    /**
     * Getter for f_PanelBody79 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody79() {
      return build_f_PanelBody79();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody79 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody79.add(get_f_ToggleSwitch80());

      return f_PanelBody79;
    }

    /**
     * Getter for f_ToggleSwitch80 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch80() {
      return build_f_ToggleSwitch80();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch80() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch80 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch80.setOnText("Yes");
      f_ToggleSwitch80.setOffText("No");

      return f_ToggleSwitch80;
    }

    /**
     * Getter for f_PanelFooter81 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter81() {
      return build_f_PanelFooter81();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter81 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter81.add(get_f_PrettyPre82());

      return f_PanelFooter81;
    }

    /**
     * Getter for f_PrettyPre82 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre82() {
      return build_f_PrettyPre82();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre82() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre82 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre82.setHTML(template_html18().asString());
      f_PrettyPre82.addStyleName("lang-xml");

      return f_PrettyPre82;
    }

    /**
     * Getter for f_Panel83 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel83() {
      return build_f_Panel83();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel83 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel83.add(get_f_PanelHeader84());
      f_Panel83.add(get_f_PanelBody86());
      f_Panel83.add(get_f_PanelFooter88());

      return f_Panel83;
    }

    /**
     * Getter for f_PanelHeader84 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader84() {
      return build_f_PanelHeader84();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader84() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader84 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader84.add(get_f_Heading85());

      return f_PanelHeader84;
    }

    /**
     * Getter for f_Heading85 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading85() {
      return build_f_Heading85();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading85() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading85 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading85.setText("On/Off Icon");

      return f_Heading85;
    }

    /**
     * Getter for f_PanelBody86 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody86() {
      return build_f_PanelBody86();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody86() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody86 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody86.add(get_f_ToggleSwitch87());

      return f_PanelBody86;
    }

    /**
     * Getter for f_ToggleSwitch87 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch87() {
      return build_f_ToggleSwitch87();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch87() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch87 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch87.setOnIcon(org.gwtbootstrap3.client.ui.constants.IconType.CHECK);
      f_ToggleSwitch87.setOffIcon(org.gwtbootstrap3.client.ui.constants.IconType.TIMES);

      return f_ToggleSwitch87;
    }

    /**
     * Getter for f_PanelFooter88 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter88() {
      return build_f_PanelFooter88();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter88 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter88.add(get_f_PrettyPre89());

      return f_PanelFooter88;
    }

    /**
     * Getter for f_PrettyPre89 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre89() {
      return build_f_PrettyPre89();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre89() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre89 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre89.setHTML(template_html19().asString());
      f_PrettyPre89.addStyleName("lang-xml");

      return f_PrettyPre89;
    }

    /**
     * Getter for f_Panel90 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel90() {
      return build_f_Panel90();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel90 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel90.add(get_f_PanelHeader91());
      f_Panel90.add(get_f_PanelBody93());
      f_Panel90.add(get_f_PanelFooter95());

      return f_Panel90;
    }

    /**
     * Getter for f_PanelHeader91 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader91() {
      return build_f_PanelHeader91();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader91 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader91.add(get_f_Heading92());

      return f_PanelHeader91;
    }

    /**
     * Getter for f_Heading92 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading92() {
      return build_f_Heading92();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading92() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading92 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading92.setText("Label text");

      return f_Heading92;
    }

    /**
     * Getter for f_PanelBody93 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody93() {
      return build_f_PanelBody93();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody93() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody93 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody93.add(get_f_ToggleSwitch94());

      return f_PanelBody93;
    }

    /**
     * Getter for f_ToggleSwitch94 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch94() {
      return build_f_ToggleSwitch94();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch94() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch94 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch94.setLabelText("Label");

      return f_ToggleSwitch94;
    }

    /**
     * Getter for f_PanelFooter95 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter95() {
      return build_f_PanelFooter95();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter95() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter95 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter95.add(get_f_PrettyPre96());

      return f_PanelFooter95;
    }

    /**
     * Getter for f_PrettyPre96 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre96() {
      return build_f_PrettyPre96();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre96() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre96 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre96.setHTML(template_html20().asString());
      f_PrettyPre96.addStyleName("lang-xml");

      return f_PrettyPre96;
    }

    /**
     * Getter for f_Panel97 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel97() {
      return build_f_Panel97();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel97() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel97 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel97.add(get_f_PanelHeader98());
      f_Panel97.add(get_f_PanelBody100());
      f_Panel97.add(get_f_PanelFooter106());

      return f_Panel97;
    }

    /**
     * Getter for f_PanelHeader98 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader98() {
      return build_f_PanelHeader98();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader98() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader98 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader98.add(get_f_Heading99());

      return f_PanelHeader98;
    }

    /**
     * Getter for f_Heading99 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading99() {
      return build_f_Heading99();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading99 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading99.setText("Handle width");

      return f_Heading99;
    }

    /**
     * Getter for f_PanelBody100 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody100() {
      return build_f_PanelBody100();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody100() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody100 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody100.add(get_f_Paragraph101());
      f_PanelBody100.add(get_f_Div102());
      f_PanelBody100.add(get_f_Div104());

      return f_PanelBody100;
    }

    /**
     * Getter for f_Paragraph101 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph101() {
      return build_f_Paragraph101();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph101 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html21().asString());
      // Setup section.

      return f_Paragraph101;
    }

    /**
     * Getter for f_Div102 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_f_Div102() {
      return build_f_Div102();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_f_Div102() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div f_Div102 = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      f_Div102.add(get_f_ToggleSwitch103());

      return f_Div102;
    }

    /**
     * Getter for f_ToggleSwitch103 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch103() {
      return build_f_ToggleSwitch103();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch103() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch103 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch103.setHandleWidth("100");

      return f_ToggleSwitch103;
    }

    /**
     * Getter for f_Div104 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_f_Div104() {
      return build_f_Div104();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_f_Div104() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div f_Div104 = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      f_Div104.add(get_f_ToggleSwitch105());

      return f_Div104;
    }

    /**
     * Getter for f_ToggleSwitch105 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch105() {
      return build_f_ToggleSwitch105();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch105() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch105 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch105.setOnText("Automatic sizing by default");

      return f_ToggleSwitch105;
    }

    /**
     * Getter for f_PanelFooter106 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter106() {
      return build_f_PanelFooter106();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter106() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter106 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter106.add(get_f_PrettyPre107());

      return f_PanelFooter106;
    }

    /**
     * Getter for f_PrettyPre107 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre107() {
      return build_f_PrettyPre107();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre107() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre107 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre107.setHTML(template_html22().asString());
      f_PrettyPre107.addStyleName("lang-xml");

      return f_PrettyPre107;
    }

    /**
     * Getter for f_Panel108 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel108() {
      return build_f_Panel108();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel108() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel108 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel108.add(get_f_PanelHeader109());
      f_Panel108.add(get_f_PanelBody111());
      f_Panel108.add(get_f_PanelFooter117());

      return f_Panel108;
    }

    /**
     * Getter for f_PanelHeader109 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader109() {
      return build_f_PanelHeader109();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader109() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader109 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader109.add(get_f_Heading110());

      return f_PanelHeader109;
    }

    /**
     * Getter for f_Heading110 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading110() {
      return build_f_Heading110();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading110() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading110 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading110.setText("Label width");

      return f_Heading110;
    }

    /**
     * Getter for f_PanelBody111 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody111() {
      return build_f_PanelBody111();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody111() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody111 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody111.add(get_f_Paragraph112());
      f_PanelBody111.add(get_f_Div113());
      f_PanelBody111.add(get_f_Div115());

      return f_PanelBody111;
    }

    /**
     * Getter for f_Paragraph112 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph112() {
      return build_f_Paragraph112();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph112() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph112 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html23().asString());
      // Setup section.

      return f_Paragraph112;
    }

    /**
     * Getter for f_Div113 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_f_Div113() {
      return build_f_Div113();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_f_Div113() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div f_Div113 = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      f_Div113.add(get_f_ToggleSwitch114());

      return f_Div113;
    }

    /**
     * Getter for f_ToggleSwitch114 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch114() {
      return build_f_ToggleSwitch114();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch114() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch114 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch114.setLabelWidth("100");

      return f_ToggleSwitch114;
    }

    /**
     * Getter for f_Div115 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_f_Div115() {
      return build_f_Div115();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_f_Div115() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div f_Div115 = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      f_Div115.add(get_f_ToggleSwitch116());

      return f_Div115;
    }

    /**
     * Getter for f_ToggleSwitch116 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch116() {
      return build_f_ToggleSwitch116();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch116() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch116 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch116.setLabelText("Automatic sizing by default");

      return f_ToggleSwitch116;
    }

    /**
     * Getter for f_PanelFooter117 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter117() {
      return build_f_PanelFooter117();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter117() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter117 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter117.add(get_f_PrettyPre118());

      return f_PanelFooter117;
    }

    /**
     * Getter for f_PrettyPre118 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre118() {
      return build_f_PrettyPre118();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre118() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre118 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre118.setHTML(template_html24().asString());
      f_PrettyPre118.addStyleName("lang-xml");

      return f_PrettyPre118;
    }

    /**
     * Getter for f_Panel119 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel119() {
      return build_f_Panel119();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel119() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel119 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel119.add(get_f_PanelHeader120());
      f_Panel119.add(get_f_PanelBody122());
      f_Panel119.add(get_f_PanelFooter126());

      return f_Panel119;
    }

    /**
     * Getter for f_PanelHeader120 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader120() {
      return build_f_PanelHeader120();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader120() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader120 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader120.add(get_f_Heading121());

      return f_PanelHeader120;
    }

    /**
     * Getter for f_Heading121 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading121() {
      return build_f_Heading121();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading121() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading121 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading121.setText("Radio version");

      return f_Heading121;
    }

    /**
     * Getter for f_PanelBody122 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody122() {
      return build_f_PanelBody122();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody122() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody122 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody122.add(get_f_ToggleSwitchRadio123());
      f_PanelBody122.add(get_f_ToggleSwitchRadio124());
      f_PanelBody122.add(get_f_ToggleSwitchRadio125());

      return f_PanelBody122;
    }

    /**
     * Getter for f_ToggleSwitchRadio123 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio get_f_ToggleSwitchRadio123() {
      return build_f_ToggleSwitchRadio123();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio build_f_ToggleSwitchRadio123() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio f_ToggleSwitchRadio123 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio("radio1");
      // Setup section.

      return f_ToggleSwitchRadio123;
    }

    /**
     * Getter for f_ToggleSwitchRadio124 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio get_f_ToggleSwitchRadio124() {
      return build_f_ToggleSwitchRadio124();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio build_f_ToggleSwitchRadio124() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio f_ToggleSwitchRadio124 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio("radio1");
      // Setup section.

      return f_ToggleSwitchRadio124;
    }

    /**
     * Getter for f_ToggleSwitchRadio125 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio get_f_ToggleSwitchRadio125() {
      return build_f_ToggleSwitchRadio125();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio build_f_ToggleSwitchRadio125() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio f_ToggleSwitchRadio125 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio("radio1");
      // Setup section.

      return f_ToggleSwitchRadio125;
    }

    /**
     * Getter for f_PanelFooter126 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter126() {
      return build_f_PanelFooter126();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter126() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter126 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter126.add(get_f_PrettyPre127());

      return f_PanelFooter126;
    }

    /**
     * Getter for f_PrettyPre127 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre127() {
      return build_f_PrettyPre127();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre127() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre127 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre127.setHTML(template_html25().asString());
      f_PrettyPre127.addStyleName("lang-xml");

      return f_PrettyPre127;
    }

    /**
     * Getter for f_Panel128 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel128() {
      return build_f_Panel128();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel128() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel128 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel128.add(get_f_PanelHeader129());
      f_Panel128.add(get_f_PanelBody131());
      f_Panel128.add(get_f_PanelFooter135());

      return f_Panel128;
    }

    /**
     * Getter for f_PanelHeader129 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader129() {
      return build_f_PanelHeader129();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader129() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader129 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader129.add(get_f_Heading130());

      return f_PanelHeader129;
    }

    /**
     * Getter for f_Heading130 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading130() {
      return build_f_Heading130();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading130() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading130 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading130.setText("Allow all radios off");

      return f_Heading130;
    }

    /**
     * Getter for f_PanelBody131 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody131() {
      return build_f_PanelBody131();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody131() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody131 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody131.add(get_f_ToggleSwitchRadio132());
      f_PanelBody131.add(get_f_ToggleSwitchRadio133());
      f_PanelBody131.add(get_f_ToggleSwitchRadio134());

      return f_PanelBody131;
    }

    /**
     * Getter for f_ToggleSwitchRadio132 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio get_f_ToggleSwitchRadio132() {
      return build_f_ToggleSwitchRadio132();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio build_f_ToggleSwitchRadio132() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio f_ToggleSwitchRadio132 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio("radio2");
      // Setup section.
      f_ToggleSwitchRadio132.setRadioAllOff(true);

      return f_ToggleSwitchRadio132;
    }

    /**
     * Getter for f_ToggleSwitchRadio133 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio get_f_ToggleSwitchRadio133() {
      return build_f_ToggleSwitchRadio133();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio build_f_ToggleSwitchRadio133() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio f_ToggleSwitchRadio133 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio("radio2");
      // Setup section.
      f_ToggleSwitchRadio133.setRadioAllOff(true);

      return f_ToggleSwitchRadio133;
    }

    /**
     * Getter for f_ToggleSwitchRadio134 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio get_f_ToggleSwitchRadio134() {
      return build_f_ToggleSwitchRadio134();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio build_f_ToggleSwitchRadio134() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio f_ToggleSwitchRadio134 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitchRadio("radio2");
      // Setup section.
      f_ToggleSwitchRadio134.setRadioAllOff(true);

      return f_ToggleSwitchRadio134;
    }

    /**
     * Getter for f_PanelFooter135 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter135() {
      return build_f_PanelFooter135();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter135() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter135 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter135.add(get_f_PrettyPre136());

      return f_PanelFooter135;
    }

    /**
     * Getter for f_PrettyPre136 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre136() {
      return build_f_PrettyPre136();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre136() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre136 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre136.setHTML(template_html26().asString());
      f_PrettyPre136.addStyleName("lang-xml");

      return f_PrettyPre136;
    }

    /**
     * Getter for f_Panel137 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel137() {
      return build_f_Panel137();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel137() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel137 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel137.add(get_f_PanelHeader138());
      f_Panel137.add(get_f_PanelBody140());
      f_Panel137.add(get_f_PanelFooter142());

      return f_Panel137;
    }

    /**
     * Getter for f_PanelHeader138 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader138() {
      return build_f_PanelHeader138();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader138() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader138 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader138.add(get_f_Heading139());

      return f_PanelHeader138;
    }

    /**
     * Getter for f_Heading139 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading139() {
      return build_f_Heading139();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading139() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading139 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading139.setText("Advanced ToggleSwitch");

      return f_Heading139;
    }

    /**
     * Getter for f_PanelBody140 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody140() {
      return build_f_PanelBody140();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody140() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody140 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody140.add(get_f_ToggleSwitch141());

      return f_PanelBody140;
    }

    /**
     * Getter for f_ToggleSwitch141 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch get_f_ToggleSwitch141() {
      return build_f_ToggleSwitch141();
    }
    private org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch build_f_ToggleSwitch141() {
      // Creation section.
      final org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch f_ToggleSwitch141 = new org.gwtbootstrap3.extras.toggleswitch.client.ui.ToggleSwitch();
      // Setup section.
      f_ToggleSwitch141.setOnIcon(org.gwtbootstrap3.client.ui.constants.IconType.THUMBS_UP);
      f_ToggleSwitch141.setOffColor(org.gwtbootstrap3.extras.toggleswitch.client.ui.base.constants.ColorType.DANGER);
      f_ToggleSwitch141.setLabelText("GWT");
      f_ToggleSwitch141.setOnColor(org.gwtbootstrap3.extras.toggleswitch.client.ui.base.constants.ColorType.SUCCESS);
      f_ToggleSwitch141.setOffIcon(org.gwtbootstrap3.client.ui.constants.IconType.THUMBS_DOWN);
      f_ToggleSwitch141.setValue(true);

      return f_ToggleSwitch141;
    }

    /**
     * Getter for f_PanelFooter142 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter142() {
      return build_f_PanelFooter142();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter142() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter142 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter142.add(get_f_PrettyPre143());

      return f_PanelFooter142;
    }

    /**
     * Getter for f_PrettyPre143 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre143() {
      return build_f_PrettyPre143();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre143() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre143 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre143.setHTML(template_html27().asString());
      f_PrettyPre143.addStyleName("lang-xml");

      return f_PrettyPre143;
    }
  }
}
