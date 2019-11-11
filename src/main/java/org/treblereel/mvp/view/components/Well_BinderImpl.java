// Template file: org/treblereel/mvp/view/components/Well.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.327")
public class Well_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Well>, org.treblereel.mvp.view.components.Well.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Look, I am in a well!")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Well&gt;\\n \\s\\s... widgets\\n &lt;/b:Well&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Look, I am in a well!")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("Look, I am in a well!")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:Well size=\"LARGE\"&gt;\\n \\s\\s... widgets\\n &lt;/b:Well&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:Well size=\"SMALL\"&gt;\\n \\s\\s... widgets\\n &lt;/b:Well&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
  }

  Template template = new Well_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Well owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Well owner;


    public Widgets(final org.treblereel.mvp.view.components.Well owner) {
      this.owner = owner;
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
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Well_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Well_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Well_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Well_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
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
      f_PageHeader3.setText("Wells");

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
      f_Panel4.add(get_f_PanelFooter10());

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
      f_Heading6.setText("Default");

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
      f_PanelBody7.add(get_f_Well8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Well8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Well get_f_Well8() {
      return build_f_Well8();
    }
    private org.gwtbootstrap3.client.ui.Well build_f_Well8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Well f_Well8 = new org.gwtbootstrap3.client.ui.Well();
      // Setup section.
      f_Well8.add(get_f_Span9());

      return f_Well8;
    }

    /**
     * Getter for f_Span9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span9() {
      return build_f_Span9();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span9 = new org.gwtbootstrap3.client.ui.html.Span(template_html1().asString());
      // Setup section.

      return f_Span9;
    }

    /**
     * Getter for f_PanelFooter10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter10() {
      return build_f_PanelFooter10();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter10 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter10.add(get_f_PrettyPre11());

      return f_PanelFooter10;
    }

    /**
     * Getter for f_PrettyPre11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre11() {
      return build_f_PrettyPre11();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre11() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre11 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre11.setHTML(template_html2().asString());
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
      f_Panel12.add(get_f_PanelFooter20());

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
      f_Heading14.setText("Optional classes");

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
      f_PanelBody15.add(get_f_Well16());
      f_PanelBody15.add(get_f_Well18());

      return f_PanelBody15;
    }

    /**
     * Getter for f_Well16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Well get_f_Well16() {
      return build_f_Well16();
    }
    private org.gwtbootstrap3.client.ui.Well build_f_Well16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Well f_Well16 = new org.gwtbootstrap3.client.ui.Well();
      // Setup section.
      f_Well16.add(get_f_Span17());
      f_Well16.setSize(org.gwtbootstrap3.client.ui.constants.WellSize.LARGE);

      return f_Well16;
    }

    /**
     * Getter for f_Span17 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span17() {
      return build_f_Span17();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span17 = new org.gwtbootstrap3.client.ui.html.Span(template_html3().asString());
      // Setup section.

      return f_Span17;
    }

    /**
     * Getter for f_Well18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Well get_f_Well18() {
      return build_f_Well18();
    }
    private org.gwtbootstrap3.client.ui.Well build_f_Well18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Well f_Well18 = new org.gwtbootstrap3.client.ui.Well();
      // Setup section.
      f_Well18.add(get_f_Span19());
      f_Well18.setSize(org.gwtbootstrap3.client.ui.constants.WellSize.SMALL);

      return f_Well18;
    }

    /**
     * Getter for f_Span19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span19() {
      return build_f_Span19();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span19 = new org.gwtbootstrap3.client.ui.html.Span(template_html4().asString());
      // Setup section.

      return f_Span19;
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
      f_PanelFooter20.add(get_f_ClearFix22());
      f_PanelFooter20.add(get_f_PrettyPre23());

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
      f_PrettyPre21.setHTML(template_html5().asString());
      f_PrettyPre21.addStyleName("lang-xml");

      return f_PrettyPre21;
    }

    /**
     * Getter for f_ClearFix22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix22() {
      return build_f_ClearFix22();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix22 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix22;
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
      f_PrettyPre23.setHTML(template_html6().asString());
      f_PrettyPre23.addStyleName("lang-xml");

      return f_PrettyPre23;
    }
  }
}
