// Template file: org/treblereel/mvp/view/components/ProgressBar.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.883")
public class ProgressBar_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.ProgressBar>, org.treblereel.mvp.view.components.ProgressBar.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Progress bars use CSS3 transitions and animations to achieve some of their effects. These features are not supported in Internet Explorer 9 and below or older versions of Firefox. Opera 12 does not support animations.")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Progress&gt;\\n \\s\\s&lt;b:ProgressBar type=\"SUCCESS\" percent=\"40\"/&gt;\\n &lt;/b:Progress&gt;\\n &lt;b:Progress&gt;\\n \\s\\s&lt;b:ProgressBar type=\"INFO\" percent=\"20\" text=\"20%\"/&gt;\\n &lt;/b:Progress&gt;\\n &lt;b:Progress&gt;\\n \\s\\s&lt;b:ProgressBar type=\"WARNING\" percent=\"60\"/&gt;\\n &lt;/b:Progress&gt;\\n &lt;b:Progress&gt;\\n \\s\\s&lt;b:ProgressBar type=\"DANGER\" percent=\"80\"/&gt;\\n &lt;/b:Progress&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("** Not available in IE8.")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:Progress type=\"STRIPED\"&gt;\\n \\s\\s&lt;b:ProgressBar type=\"SUCCESS\" percent=\"40\"/&gt;\\n &lt;/b:Progress&gt;\\n &lt;b:Progress type=\"STRIPED\"&gt;\\n \\s\\s&lt;b:ProgressBar type=\"INFO\" percent=\"20\" text=\"20%\"/&gt;\\n &lt;/b:Progress&gt;\\n &lt;b:Progress type=\"STRIPED\"&gt;\\n \\s\\s&lt;b:ProgressBar type=\"WARNING\" percent=\"60\"/&gt;\\n &lt;/b:Progress&gt;\\n &lt;b:Progress type=\"STRIPED\"&gt;\\n \\s\\s&lt;b:ProgressBar type=\"DANGER\" percent=\"80\"/&gt;\\n &lt;/b:Progress&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("** Not available in all versions of IE.")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:Progress active=\"true\" type=\"STRIPED\"&gt;\\n \\s\\s&lt;b:ProgressBar type=\"SUCCESS\" percent=\"40\"/&gt;\\n &lt;/b:Progress&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;b:Progress&gt;\\n \\s\\s&lt;b:ProgressBar type=\"SUCCESS\" percent=\"35\"/&gt;\\n \\s\\s&lt;b:ProgressBar type=\"WARNING\" percent=\"20\"/&gt;\\n \\s\\s&lt;b:ProgressBar type=\"DANGER\" percent=\"10\"/&gt;\\n &lt;/b:Progress&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
  }

  Template template = new ProgressBar_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.ProgressBar owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.ProgressBar owner;


    public Widgets(final org.treblereel.mvp.view.components.ProgressBar owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.ProgressBar_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.ProgressBar_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.ProgressBar_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.ProgressBar_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.ProgressBar_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.components.ProgressBar_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.components.ProgressBar_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel21());
      f_Column2.add(get_f_Panel36());
      f_Column2.add(get_f_Panel45());

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
      f_PageHeader3.setText("Progress Bars");

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
      f_Panel7.add(get_f_PanelFooter19());

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
      f_Heading9.setText("Basic");

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
      f_PanelBody10.add(get_f_Progress11());
      f_PanelBody10.add(get_f_Progress13());
      f_PanelBody10.add(get_f_Progress15());
      f_PanelBody10.add(get_f_Progress17());

      return f_PanelBody10;
    }

    /**
     * Getter for f_Progress11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress11() {
      return build_f_Progress11();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress11 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress11.add(get_f_ProgressBar12());

      return f_Progress11;
    }

    /**
     * Getter for f_ProgressBar12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar12() {
      return build_f_ProgressBar12();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar12 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar12.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.SUCCESS);
      f_ProgressBar12.setPercent(40);

      return f_ProgressBar12;
    }

    /**
     * Getter for f_Progress13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress13() {
      return build_f_Progress13();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress13 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress13.add(get_f_ProgressBar14());

      return f_Progress13;
    }

    /**
     * Getter for f_ProgressBar14 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar14() {
      return build_f_ProgressBar14();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar14 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar14.setText("20%");
      f_ProgressBar14.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.INFO);
      f_ProgressBar14.setPercent(20);

      return f_ProgressBar14;
    }

    /**
     * Getter for f_Progress15 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress15() {
      return build_f_Progress15();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress15 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress15.add(get_f_ProgressBar16());

      return f_Progress15;
    }

    /**
     * Getter for f_ProgressBar16 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar16() {
      return build_f_ProgressBar16();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar16 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar16.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.WARNING);
      f_ProgressBar16.setPercent(60);

      return f_ProgressBar16;
    }

    /**
     * Getter for f_Progress17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress17() {
      return build_f_Progress17();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress17 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress17.add(get_f_ProgressBar18());

      return f_Progress17;
    }

    /**
     * Getter for f_ProgressBar18 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar18() {
      return build_f_ProgressBar18();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar18 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar18.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.DANGER);
      f_ProgressBar18.setPercent(80);

      return f_ProgressBar18;
    }

    /**
     * Getter for f_PanelFooter19 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter19() {
      return build_f_PanelFooter19();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter19 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter19.add(get_f_PrettyPre20());

      return f_PanelFooter19;
    }

    /**
     * Getter for f_PrettyPre20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre20() {
      return build_f_PrettyPre20();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre20() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre20 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre20.setHTML(template_html2().asString());
      f_PrettyPre20.addStyleName("lang-xml");

      return f_PrettyPre20;
    }

    /**
     * Getter for f_Panel21 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel21() {
      return build_f_Panel21();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel21 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel21.add(get_f_PanelHeader22());
      f_Panel21.add(get_f_PanelBody24());
      f_Panel21.add(get_f_PanelFooter34());

      return f_Panel21;
    }

    /**
     * Getter for f_PanelHeader22 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader22() {
      return build_f_PanelHeader22();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader22 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader22.add(get_f_Heading23());

      return f_PanelHeader22;
    }

    /**
     * Getter for f_Heading23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading23() {
      return build_f_Heading23();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading23 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading23.setText("Striped");

      return f_Heading23;
    }

    /**
     * Getter for f_PanelBody24 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody24() {
      return build_f_PanelBody24();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody24 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody24.add(get_f_Paragraph25());
      f_PanelBody24.add(get_f_Progress26());
      f_PanelBody24.add(get_f_Progress28());
      f_PanelBody24.add(get_f_Progress30());
      f_PanelBody24.add(get_f_Progress32());

      return f_PanelBody24;
    }

    /**
     * Getter for f_Paragraph25 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph25() {
      return build_f_Paragraph25();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph25 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      return f_Paragraph25;
    }

    /**
     * Getter for f_Progress26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress26() {
      return build_f_Progress26();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress26 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress26.add(get_f_ProgressBar27());
      f_Progress26.setType(org.gwtbootstrap3.client.ui.constants.ProgressType.STRIPED);

      return f_Progress26;
    }

    /**
     * Getter for f_ProgressBar27 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar27() {
      return build_f_ProgressBar27();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar27 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar27.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.SUCCESS);
      f_ProgressBar27.setPercent(40);

      return f_ProgressBar27;
    }

    /**
     * Getter for f_Progress28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress28() {
      return build_f_Progress28();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress28 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress28.add(get_f_ProgressBar29());
      f_Progress28.setType(org.gwtbootstrap3.client.ui.constants.ProgressType.STRIPED);

      return f_Progress28;
    }

    /**
     * Getter for f_ProgressBar29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar29() {
      return build_f_ProgressBar29();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar29 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar29.setText("20%");
      f_ProgressBar29.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.INFO);
      f_ProgressBar29.setPercent(20);

      return f_ProgressBar29;
    }

    /**
     * Getter for f_Progress30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress30() {
      return build_f_Progress30();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress30 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress30.add(get_f_ProgressBar31());
      f_Progress30.setType(org.gwtbootstrap3.client.ui.constants.ProgressType.STRIPED);

      return f_Progress30;
    }

    /**
     * Getter for f_ProgressBar31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar31() {
      return build_f_ProgressBar31();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar31 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar31.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.WARNING);
      f_ProgressBar31.setPercent(60);

      return f_ProgressBar31;
    }

    /**
     * Getter for f_Progress32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress32() {
      return build_f_Progress32();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress32 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress32.add(get_f_ProgressBar33());
      f_Progress32.setType(org.gwtbootstrap3.client.ui.constants.ProgressType.STRIPED);

      return f_Progress32;
    }

    /**
     * Getter for f_ProgressBar33 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar33() {
      return build_f_ProgressBar33();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar33 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar33.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.DANGER);
      f_ProgressBar33.setPercent(80);

      return f_ProgressBar33;
    }

    /**
     * Getter for f_PanelFooter34 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter34() {
      return build_f_PanelFooter34();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter34 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter34.add(get_f_PrettyPre35());

      return f_PanelFooter34;
    }

    /**
     * Getter for f_PrettyPre35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre35() {
      return build_f_PrettyPre35();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre35() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre35 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre35.setHTML(template_html4().asString());
      f_PrettyPre35.addStyleName("lang-xml");

      return f_PrettyPre35;
    }

    /**
     * Getter for f_Panel36 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel36() {
      return build_f_Panel36();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel36 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel36.add(get_f_PanelHeader37());
      f_Panel36.add(get_f_PanelBody39());
      f_Panel36.add(get_f_PanelFooter43());

      return f_Panel36;
    }

    /**
     * Getter for f_PanelHeader37 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader37() {
      return build_f_PanelHeader37();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader37 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader37.add(get_f_Heading38());

      return f_PanelHeader37;
    }

    /**
     * Getter for f_Heading38 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading38() {
      return build_f_Heading38();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading38 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading38.setText("Animated");

      return f_Heading38;
    }

    /**
     * Getter for f_PanelBody39 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody39() {
      return build_f_PanelBody39();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody39 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody39.add(get_f_Paragraph40());
      f_PanelBody39.add(get_f_Progress41());

      return f_PanelBody39;
    }

    /**
     * Getter for f_Paragraph40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph40() {
      return build_f_Paragraph40();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph40 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.

      return f_Paragraph40;
    }

    /**
     * Getter for f_Progress41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress41() {
      return build_f_Progress41();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress41 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress41.add(get_f_ProgressBar42());
      f_Progress41.setActive(true);
      f_Progress41.setType(org.gwtbootstrap3.client.ui.constants.ProgressType.STRIPED);

      return f_Progress41;
    }

    /**
     * Getter for f_ProgressBar42 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar42() {
      return build_f_ProgressBar42();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar42 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar42.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.SUCCESS);
      f_ProgressBar42.setPercent(40);

      return f_ProgressBar42;
    }

    /**
     * Getter for f_PanelFooter43 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter43() {
      return build_f_PanelFooter43();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter43 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter43.add(get_f_PrettyPre44());

      return f_PanelFooter43;
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
      f_PrettyPre44.setHTML(template_html6().asString());
      f_PrettyPre44.addStyleName("lang-xml");

      return f_PrettyPre44;
    }

    /**
     * Getter for f_Panel45 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel45() {
      return build_f_Panel45();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel45 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel45.add(get_f_PanelHeader46());
      f_Panel45.add(get_f_PanelBody48());
      f_Panel45.add(get_f_PanelFooter53());

      return f_Panel45;
    }

    /**
     * Getter for f_PanelHeader46 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader46() {
      return build_f_PanelHeader46();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader46 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader46.add(get_f_Heading47());

      return f_PanelHeader46;
    }

    /**
     * Getter for f_Heading47 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading47() {
      return build_f_Heading47();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading47 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading47.setText("Stacked");

      return f_Heading47;
    }

    /**
     * Getter for f_PanelBody48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody48() {
      return build_f_PanelBody48();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody48 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody48.add(get_f_Progress49());

      return f_PanelBody48;
    }

    /**
     * Getter for f_Progress49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress49() {
      return build_f_Progress49();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress49 = new org.gwtbootstrap3.client.ui.Progress();
      // Setup section.
      f_Progress49.add(get_f_ProgressBar50());
      f_Progress49.add(get_f_ProgressBar51());
      f_Progress49.add(get_f_ProgressBar52());

      return f_Progress49;
    }

    /**
     * Getter for f_ProgressBar50 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar50() {
      return build_f_ProgressBar50();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar50 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar50.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.SUCCESS);
      f_ProgressBar50.setPercent(35);

      return f_ProgressBar50;
    }

    /**
     * Getter for f_ProgressBar51 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar51() {
      return build_f_ProgressBar51();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar51 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar51.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.WARNING);
      f_ProgressBar51.setPercent(20);

      return f_ProgressBar51;
    }

    /**
     * Getter for f_ProgressBar52 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar52() {
      return build_f_ProgressBar52();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar52 = new org.gwtbootstrap3.client.ui.ProgressBar();
      // Setup section.
      f_ProgressBar52.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.DANGER);
      f_ProgressBar52.setPercent(10);

      return f_ProgressBar52;
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
      f_PrettyPre54.setHTML(template_html7().asString());
      f_PrettyPre54.addStyleName("lang-xml");

      return f_PrettyPre54;
    }
  }
}
