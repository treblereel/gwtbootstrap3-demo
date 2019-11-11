// Template file: org/treblereel/mvp/view/css/GridSystem.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.css;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.441")
public class GridSystem_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.css.GridSystem>, org.treblereel.mvp.view.css.GridSystem.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("For more information about the Grid System, please go to: <a href='http://getbootstrap.com/css/#grid'>Twitter Grid System.</a>")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Container fluid=\"true\"&gt;\\n \\s\\s&lt;b:Row&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:Row&gt;\\n &lt;/b:Container&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("You can also set the sizes for each view port (Mobile/Table/Desktop/Large Desktop) right in the size so that it will be responsive without any extra code! Resize the browser to see!")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("\\s\\s&lt;b:Container fluid=\"true\"&gt;\\n \\s\\s&lt;b:Row&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"XS_6,SM_4,MD_3,LG_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"XS_6,SM_4,MD_3,LG_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"XS_6,SM_4,MD_3,LG_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"XS_6,SM_4,MD_3,LG_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"XS_6,SM_4,MD_3,LG_1\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:Row&gt;\\n &lt;/b:Container&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:Container fluid=\"true\"&gt;\\n \\s\\s&lt;b:Row&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_4\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_4\" offset=\"MD_4\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:Row&gt;\\n &lt;/b:Container&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:Container fluid=\"true\"&gt;\\n \\s\\s&lt;b:Row&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_9\"&gt;\\n \\s\\s\\s\\s\\s\\s &lt;b:Row&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Column size=\"MD_6\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Column size=\"MD_6\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:Row&gt;\\n \\s\\s\\s\\s&lt;/b:Column&gt;\\n \\s\\s&lt;/b:Row&gt;\\n &lt;/b:Container&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;b:Container fluid=\"true\"&gt;\\n \\s\\s&lt;b:Row&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_9\" push=\"MD_3\"&gt;...&lt;/b:Column&gt;\\n \\s\\s\\s\\s&lt;b:Column size=\"MD_3\" pull=\"MD_9\"&gt;...&lt;/b:Column&gt;\\n \\s\\s&lt;/b:Row&gt;\\n &lt;/b:Container&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
  }

  Template template = new GridSystem_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.css.GridSystem owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.css.GridSystem owner;


    public Widgets(final org.treblereel.mvp.view.css.GridSystem owner) {
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
    private org.treblereel.mvp.view.css.GridSystem_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.css.GridSystem_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.css.GridSystem_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.css.GridSystem_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 31 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.GridSystem_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.css.GridSystem_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.css.GridSystem_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel38());
      f_Column2.add(get_f_Panel71());
      f_Column2.add(get_f_Panel83());
      f_Column2.add(get_f_Panel98());

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
      f_PageHeader3.setText("Grid System");
      f_PageHeader3.setSubText("12 column system");

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
      f_Panel6.add(get_f_PanelFooter36());

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
      f_PanelBody9.add(get_f_Container10());

      return f_PanelBody9;
    }

    /**
     * Getter for f_Container10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container10() {
      return build_f_Container10();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container10 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container10.add(get_f_Row11());
      f_Container10.setFluid(true);

      return f_Container10;
    }

    /**
     * Getter for f_Row11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row11() {
      return build_f_Row11();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row11 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row11.add(get_f_Column12());
      f_Row11.add(get_f_Column14());
      f_Row11.add(get_f_Column16());
      f_Row11.add(get_f_Column18());
      f_Row11.add(get_f_Column20());
      f_Row11.add(get_f_Column22());
      f_Row11.add(get_f_Column24());
      f_Row11.add(get_f_Column26());
      f_Row11.add(get_f_Column28());
      f_Row11.add(get_f_Column30());
      f_Row11.add(get_f_Column32());
      f_Row11.add(get_f_Column34());
      f_Row11.setMarginBottom(0);

      return f_Row11;
    }

    /**
     * Getter for f_Column12 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column12() {
      return build_f_Column12();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column12 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column12.add(get_f_Strong13());
      f_Column12.addStyleName("" + get_style().column() + "");

      return f_Column12;
    }

    /**
     * Getter for f_Strong13 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong13() {
      return build_f_Strong13();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong13 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong13.setText("1");

      return f_Strong13;
    }

    /**
     * Getter for f_Column14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column14() {
      return build_f_Column14();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column14 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column14.add(get_f_Strong15());
      f_Column14.addStyleName("" + get_style().column() + "");

      return f_Column14;
    }

    /**
     * Getter for f_Strong15 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong15() {
      return build_f_Strong15();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong15 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong15.setText("1");

      return f_Strong15;
    }

    /**
     * Getter for f_Column16 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column16() {
      return build_f_Column16();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column16 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column16.add(get_f_Strong17());
      f_Column16.addStyleName("" + get_style().column() + "");

      return f_Column16;
    }

    /**
     * Getter for f_Strong17 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong17() {
      return build_f_Strong17();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong17 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong17.setText("1");

      return f_Strong17;
    }

    /**
     * Getter for f_Column18 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column18() {
      return build_f_Column18();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column18 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column18.add(get_f_Strong19());
      f_Column18.addStyleName("" + get_style().column() + "");

      return f_Column18;
    }

    /**
     * Getter for f_Strong19 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong19() {
      return build_f_Strong19();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong19 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong19.setText("1");

      return f_Strong19;
    }

    /**
     * Getter for f_Column20 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column20() {
      return build_f_Column20();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column20 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column20.add(get_f_Strong21());
      f_Column20.addStyleName("" + get_style().column() + "");

      return f_Column20;
    }

    /**
     * Getter for f_Strong21 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong21() {
      return build_f_Strong21();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong21 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong21.setText("1");

      return f_Strong21;
    }

    /**
     * Getter for f_Column22 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column22() {
      return build_f_Column22();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column22 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column22.add(get_f_Strong23());
      f_Column22.addStyleName("" + get_style().column() + "");

      return f_Column22;
    }

    /**
     * Getter for f_Strong23 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong23() {
      return build_f_Strong23();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong23 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong23.setText("1");

      return f_Strong23;
    }

    /**
     * Getter for f_Column24 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column24() {
      return build_f_Column24();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column24 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column24.add(get_f_Strong25());
      f_Column24.addStyleName("" + get_style().column() + "");

      return f_Column24;
    }

    /**
     * Getter for f_Strong25 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong25() {
      return build_f_Strong25();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong25 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong25.setText("1");

      return f_Strong25;
    }

    /**
     * Getter for f_Column26 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column26() {
      return build_f_Column26();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column26 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column26.add(get_f_Strong27());
      f_Column26.addStyleName("" + get_style().column() + "");

      return f_Column26;
    }

    /**
     * Getter for f_Strong27 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong27() {
      return build_f_Strong27();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong27 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong27.setText("1");

      return f_Strong27;
    }

    /**
     * Getter for f_Column28 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column28() {
      return build_f_Column28();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column28 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column28.add(get_f_Strong29());
      f_Column28.addStyleName("" + get_style().column() + "");

      return f_Column28;
    }

    /**
     * Getter for f_Strong29 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong29() {
      return build_f_Strong29();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong29 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong29.setText("1");

      return f_Strong29;
    }

    /**
     * Getter for f_Column30 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column30() {
      return build_f_Column30();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column30 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column30.add(get_f_Strong31());
      f_Column30.addStyleName("" + get_style().column() + "");

      return f_Column30;
    }

    /**
     * Getter for f_Strong31 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong31() {
      return build_f_Strong31();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong31 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong31.setText("1");

      return f_Strong31;
    }

    /**
     * Getter for f_Column32 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column32() {
      return build_f_Column32();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column32 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column32.add(get_f_Strong33());
      f_Column32.addStyleName("" + get_style().column() + "");

      return f_Column32;
    }

    /**
     * Getter for f_Strong33 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong33() {
      return build_f_Strong33();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong33 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong33.setText("1");

      return f_Strong33;
    }

    /**
     * Getter for f_Column34 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column34() {
      return build_f_Column34();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column34 = new org.gwtbootstrap3.client.ui.Column("MD_1");
      // Setup section.
      f_Column34.add(get_f_Strong35());
      f_Column34.addStyleName("" + get_style().column() + "");

      return f_Column34;
    }

    /**
     * Getter for f_Strong35 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong35() {
      return build_f_Strong35();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong35 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong35.setText("1");

      return f_Strong35;
    }

    /**
     * Getter for f_PanelFooter36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter36() {
      return build_f_PanelFooter36();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter36 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter36.add(get_f_PrettyPre37());

      return f_PanelFooter36;
    }

    /**
     * Getter for f_PrettyPre37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre37() {
      return build_f_PrettyPre37();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre37() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre37 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre37.setHTML(template_html2().asString());
      f_PrettyPre37.addStyleName("lang-xml");

      return f_PrettyPre37;
    }

    /**
     * Getter for f_Panel38 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel38() {
      return build_f_Panel38();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel38 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel38.add(get_f_PanelHeader39());
      f_Panel38.add(get_f_PanelBody41());
      f_Panel38.add(get_f_PanelFooter69());

      return f_Panel38;
    }

    /**
     * Getter for f_PanelHeader39 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader39() {
      return build_f_PanelHeader39();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader39 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader39.add(get_f_Heading40());

      return f_PanelHeader39;
    }

    /**
     * Getter for f_Heading40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading40() {
      return build_f_Heading40();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading40 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading40.setText("Responsiveness");

      return f_Heading40;
    }

    /**
     * Getter for f_PanelBody41 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody41() {
      return build_f_PanelBody41();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody41 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody41.add(get_f_Paragraph42());
      f_PanelBody41.add(get_f_Container43());

      return f_PanelBody41;
    }

    /**
     * Getter for f_Paragraph42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph42() {
      return build_f_Paragraph42();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph42 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      return f_Paragraph42;
    }

    /**
     * Getter for f_Container43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container43() {
      return build_f_Container43();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container43 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container43.add(get_f_Row44());
      f_Container43.setFluid(true);

      return f_Container43;
    }

    /**
     * Getter for f_Row44 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row44() {
      return build_f_Row44();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row44 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row44.add(get_f_Column45());
      f_Row44.add(get_f_Column47());
      f_Row44.add(get_f_Column49());
      f_Row44.add(get_f_Column51());
      f_Row44.add(get_f_Column53());
      f_Row44.add(get_f_Column55());
      f_Row44.add(get_f_Column57());
      f_Row44.add(get_f_Column59());
      f_Row44.add(get_f_Column61());
      f_Row44.add(get_f_Column63());
      f_Row44.add(get_f_Column65());
      f_Row44.add(get_f_Column67());
      f_Row44.setMarginBottom(0);

      return f_Row44;
    }

    /**
     * Getter for f_Column45 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column45() {
      return build_f_Column45();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column45 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column45.add(get_f_Strong46());
      f_Column45.addStyleName("" + get_style().column() + "");

      return f_Column45;
    }

    /**
     * Getter for f_Strong46 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong46() {
      return build_f_Strong46();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong46 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong46.setText("C");

      return f_Strong46;
    }

    /**
     * Getter for f_Column47 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column47() {
      return build_f_Column47();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column47 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column47.add(get_f_Strong48());
      f_Column47.addStyleName("" + get_style().column() + "");

      return f_Column47;
    }

    /**
     * Getter for f_Strong48 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong48() {
      return build_f_Strong48();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong48 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong48.setText("C");

      return f_Strong48;
    }

    /**
     * Getter for f_Column49 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column49() {
      return build_f_Column49();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column49 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column49.add(get_f_Strong50());
      f_Column49.addStyleName("" + get_style().column() + "");

      return f_Column49;
    }

    /**
     * Getter for f_Strong50 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong50() {
      return build_f_Strong50();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong50 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong50.setText("C");

      return f_Strong50;
    }

    /**
     * Getter for f_Column51 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column51() {
      return build_f_Column51();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column51 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column51.add(get_f_Strong52());
      f_Column51.addStyleName("" + get_style().column() + "");

      return f_Column51;
    }

    /**
     * Getter for f_Strong52 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong52() {
      return build_f_Strong52();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong52 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong52.setText("C");

      return f_Strong52;
    }

    /**
     * Getter for f_Column53 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column53() {
      return build_f_Column53();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column53 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column53.add(get_f_Strong54());
      f_Column53.addStyleName("" + get_style().column() + "");

      return f_Column53;
    }

    /**
     * Getter for f_Strong54 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong54() {
      return build_f_Strong54();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong54 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong54.setText("C");

      return f_Strong54;
    }

    /**
     * Getter for f_Column55 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column55() {
      return build_f_Column55();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column55 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column55.add(get_f_Strong56());
      f_Column55.addStyleName("" + get_style().column() + "");

      return f_Column55;
    }

    /**
     * Getter for f_Strong56 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong56() {
      return build_f_Strong56();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong56 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong56.setText("C");

      return f_Strong56;
    }

    /**
     * Getter for f_Column57 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column57() {
      return build_f_Column57();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column57 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column57.add(get_f_Strong58());
      f_Column57.addStyleName("" + get_style().column() + "");

      return f_Column57;
    }

    /**
     * Getter for f_Strong58 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong58() {
      return build_f_Strong58();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong58 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong58.setText("C");

      return f_Strong58;
    }

    /**
     * Getter for f_Column59 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column59() {
      return build_f_Column59();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column59 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column59.add(get_f_Strong60());
      f_Column59.addStyleName("" + get_style().column() + "");

      return f_Column59;
    }

    /**
     * Getter for f_Strong60 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong60() {
      return build_f_Strong60();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong60 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong60.setText("C");

      return f_Strong60;
    }

    /**
     * Getter for f_Column61 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column61() {
      return build_f_Column61();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column61 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column61.add(get_f_Strong62());
      f_Column61.addStyleName("" + get_style().column() + "");

      return f_Column61;
    }

    /**
     * Getter for f_Strong62 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong62() {
      return build_f_Strong62();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong62 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong62.setText("C");

      return f_Strong62;
    }

    /**
     * Getter for f_Column63 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column63() {
      return build_f_Column63();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column63 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column63.add(get_f_Strong64());
      f_Column63.addStyleName("" + get_style().column() + "");

      return f_Column63;
    }

    /**
     * Getter for f_Strong64 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong64() {
      return build_f_Strong64();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong64 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong64.setText("C");

      return f_Strong64;
    }

    /**
     * Getter for f_Column65 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column65() {
      return build_f_Column65();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column65 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column65.add(get_f_Strong66());
      f_Column65.addStyleName("" + get_style().column() + "");

      return f_Column65;
    }

    /**
     * Getter for f_Strong66 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong66() {
      return build_f_Strong66();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong66 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong66.setText("C");

      return f_Strong66;
    }

    /**
     * Getter for f_Column67 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column67() {
      return build_f_Column67();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column67 = new org.gwtbootstrap3.client.ui.Column("XS_6,SM_4,MD_3,LG_1");
      // Setup section.
      f_Column67.add(get_f_Strong68());
      f_Column67.addStyleName("" + get_style().column() + "");

      return f_Column67;
    }

    /**
     * Getter for f_Strong68 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong68() {
      return build_f_Strong68();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong68 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong68.setText("C");

      return f_Strong68;
    }

    /**
     * Getter for f_PanelFooter69 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter69() {
      return build_f_PanelFooter69();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter69 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter69.add(get_f_PrettyPre70());

      return f_PanelFooter69;
    }

    /**
     * Getter for f_PrettyPre70 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre70() {
      return build_f_PrettyPre70();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre70() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre70 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre70.setHTML(template_html4().asString());
      f_PrettyPre70.addStyleName("lang-xml");

      return f_PrettyPre70;
    }

    /**
     * Getter for f_Panel71 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel71() {
      return build_f_Panel71();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel71 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel71.add(get_f_PanelHeader72());
      f_Panel71.add(get_f_PanelBody74());
      f_Panel71.add(get_f_PanelFooter81());

      return f_Panel71;
    }

    /**
     * Getter for f_PanelHeader72 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader72() {
      return build_f_PanelHeader72();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader72 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader72.add(get_f_Heading73());

      return f_PanelHeader72;
    }

    /**
     * Getter for f_Heading73 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading73() {
      return build_f_Heading73();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading73 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading73.setText("Offsetting");

      return f_Heading73;
    }

    /**
     * Getter for f_PanelBody74 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody74() {
      return build_f_PanelBody74();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody74() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody74 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody74.add(get_f_Container75());

      return f_PanelBody74;
    }

    /**
     * Getter for f_Container75 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container75() {
      return build_f_Container75();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container75 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container75.add(get_f_Row76());
      f_Container75.setFluid(true);

      return f_Container75;
    }

    /**
     * Getter for f_Row76 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row76() {
      return build_f_Row76();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row76 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row76.add(get_f_Column77());
      f_Row76.add(get_f_Column79());

      return f_Row76;
    }

    /**
     * Getter for f_Column77 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column77() {
      return build_f_Column77();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column77 = new org.gwtbootstrap3.client.ui.Column("MD_4");
      // Setup section.
      f_Column77.add(get_f_Strong78());
      f_Column77.addStyleName("" + get_style().column() + "");

      return f_Column77;
    }

    /**
     * Getter for f_Strong78 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong78() {
      return build_f_Strong78();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong78 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong78.setText("C");

      return f_Strong78;
    }

    /**
     * Getter for f_Column79 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column79() {
      return build_f_Column79();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column79 = new org.gwtbootstrap3.client.ui.Column("MD_4");
      // Setup section.
      f_Column79.add(get_f_Strong80());
      f_Column79.addStyleName("" + get_style().column() + "");
      f_Column79.setOffset("MD_4");

      return f_Column79;
    }

    /**
     * Getter for f_Strong80 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong80() {
      return build_f_Strong80();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong80 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong80.setText("C");

      return f_Strong80;
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
      f_PrettyPre82.setHTML(template_html5().asString());
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
      f_Panel83.add(get_f_PanelFooter96());

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
      f_Heading85.setText("Nesting");

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
      f_PanelBody86.add(get_f_Container87());

      return f_PanelBody86;
    }

    /**
     * Getter for f_Container87 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container87() {
      return build_f_Container87();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container87() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container87 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container87.add(get_f_Row88());
      f_Container87.setFluid(true);

      return f_Container87;
    }

    /**
     * Getter for f_Row88 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row88() {
      return build_f_Row88();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row88 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row88.add(get_f_Column89());

      return f_Row88;
    }

    /**
     * Getter for f_Column89 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column89() {
      return build_f_Column89();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column89 = new org.gwtbootstrap3.client.ui.Column("MD_9");
      // Setup section.
      f_Column89.add(get_f_Strong90());
      f_Column89.add(get_f_Row91());
      f_Column89.addStyleName("" + get_style().column() + "");

      return f_Column89;
    }

    /**
     * Getter for f_Strong90 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong90() {
      return build_f_Strong90();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong90 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong90.setText("Level 1");

      return f_Strong90;
    }

    /**
     * Getter for f_Row91 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row91() {
      return build_f_Row91();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row91 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row91.add(get_f_Column92());
      f_Row91.add(get_f_Column94());

      return f_Row91;
    }

    /**
     * Getter for f_Column92 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column92() {
      return build_f_Column92();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column92() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column92 = new org.gwtbootstrap3.client.ui.Column("MD_6");
      // Setup section.
      f_Column92.add(get_f_Strong93());
      f_Column92.addStyleName("" + get_style().column() + "");

      return f_Column92;
    }

    /**
     * Getter for f_Strong93 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong93() {
      return build_f_Strong93();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong93() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong93 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong93.setText("Level 2");

      return f_Strong93;
    }

    /**
     * Getter for f_Column94 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column94() {
      return build_f_Column94();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column94() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column94 = new org.gwtbootstrap3.client.ui.Column("MD_6");
      // Setup section.
      f_Column94.add(get_f_Strong95());
      f_Column94.addStyleName("" + get_style().column() + "");

      return f_Column94;
    }

    /**
     * Getter for f_Strong95 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong95() {
      return build_f_Strong95();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong95() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong95 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong95.setText("Level 2");

      return f_Strong95;
    }

    /**
     * Getter for f_PanelFooter96 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter96() {
      return build_f_PanelFooter96();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter96() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter96 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter96.add(get_f_PrettyPre97());

      return f_PanelFooter96;
    }

    /**
     * Getter for f_PrettyPre97 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre97() {
      return build_f_PrettyPre97();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre97() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre97 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre97.setHTML(template_html6().asString());
      f_PrettyPre97.addStyleName("lang-xml");

      return f_PrettyPre97;
    }

    /**
     * Getter for f_Panel98 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel98() {
      return build_f_Panel98();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel98() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel98 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel98.add(get_f_PanelHeader99());
      f_Panel98.add(get_f_PanelBody101());
      f_Panel98.add(get_f_PanelFooter108());

      return f_Panel98;
    }

    /**
     * Getter for f_PanelHeader99 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader99() {
      return build_f_PanelHeader99();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader99 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader99.add(get_f_Heading100());

      return f_PanelHeader99;
    }

    /**
     * Getter for f_Heading100 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading100() {
      return build_f_Heading100();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading100() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading100 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading100.setText("Ordering");

      return f_Heading100;
    }

    /**
     * Getter for f_PanelBody101 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody101() {
      return build_f_PanelBody101();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody101 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody101.add(get_f_Container102());

      return f_PanelBody101;
    }

    /**
     * Getter for f_Container102 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container102() {
      return build_f_Container102();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container102() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container102 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container102.add(get_f_Row103());
      f_Container102.setFluid(true);

      return f_Container102;
    }

    /**
     * Getter for f_Row103 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row103() {
      return build_f_Row103();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row103() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row103 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row103.add(get_f_Column104());
      f_Row103.add(get_f_Column106());

      return f_Row103;
    }

    /**
     * Getter for f_Column104 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column104() {
      return build_f_Column104();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column104() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column104 = new org.gwtbootstrap3.client.ui.Column("MD_9");
      // Setup section.
      f_Column104.add(get_f_Strong105());
      f_Column104.addStyleName("" + get_style().column() + "");
      f_Column104.setPush("MD_3");

      return f_Column104;
    }

    /**
     * Getter for f_Strong105 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong105() {
      return build_f_Strong105();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong105() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong105 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong105.setText("First in Code");

      return f_Strong105;
    }

    /**
     * Getter for f_Column106 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column106() {
      return build_f_Column106();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column106() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column106 = new org.gwtbootstrap3.client.ui.Column("MD_3");
      // Setup section.
      f_Column106.add(get_f_Strong107());
      f_Column106.addStyleName("" + get_style().column() + "");
      f_Column106.setPull("MD_9");

      return f_Column106;
    }

    /**
     * Getter for f_Strong107 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong107() {
      return build_f_Strong107();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong107() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong107 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong107.setText("Second in Code");

      return f_Strong107;
    }

    /**
     * Getter for f_PanelFooter108 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter108() {
      return build_f_PanelFooter108();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter108() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter108 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter108.add(get_f_PrettyPre109());

      return f_PanelFooter108;
    }

    /**
     * Getter for f_PrettyPre109 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre109() {
      return build_f_PrettyPre109();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre109() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre109 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre109.setHTML(template_html7().asString());
      f_PrettyPre109.addStyleName("lang-xml");

      return f_PrettyPre109;
    }
  }
}
