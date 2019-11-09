// Template file: org/treblereel/mvp/view/css/Code.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.css;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.276")
public class Code_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.css.Code>, org.treblereel.mvp.view.css.Code.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;section&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Code&gt;\\n \\s\\s...\\n &lt;/b:Code&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b.html:Paragraph emphasis=\"MUTED\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:Pre&gt;\\n \\s\\s...\\n &lt;/b:Pre&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
  }

  Template template = new Code_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.css.Code owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.css.Code owner;


    public Widgets(final org.treblereel.mvp.view.css.Code owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.Code_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.css.Code_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.css.Code_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.css.Code_BinderImpl_GenBundleImpl();
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
      f_PageHeader3.setText("Code");
      f_PageHeader3.setSubText("have code highlighting for users");

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
      f_Heading6.setText("Inline");

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
      f_PanelBody7.add(get_f_Strong8());
      f_PanelBody7.add(get_f_Code9());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Strong8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong8() {
      return build_f_Strong8();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong8 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong8.setText("Code for section:");

      return f_Strong8;
    }

    /**
     * Getter for f_Code9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Code get_f_Code9() {
      return build_f_Code9();
    }
    private org.gwtbootstrap3.client.ui.Code build_f_Code9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Code f_Code9 = new org.gwtbootstrap3.client.ui.Code();
      // Setup section.
      f_Code9.setHTML(template_html1().asString());

      return f_Code9;
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
      f_Panel12.add(get_f_PanelFooter17());

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
      f_Heading14.setText("Block");

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
      f_PanelBody15.add(get_f_Pre16());

      return f_PanelBody15;
    }

    /**
     * Getter for f_Pre16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pre get_f_Pre16() {
      return build_f_Pre16();
    }
    private org.gwtbootstrap3.client.ui.Pre build_f_Pre16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pre f_Pre16 = new org.gwtbootstrap3.client.ui.Pre();
      // Setup section.
      f_Pre16.setHTML(template_html3().asString());

      return f_Pre16;
    }

    /**
     * Getter for f_PanelFooter17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter17() {
      return build_f_PanelFooter17();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter17 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter17.add(get_f_PrettyPre18());

      return f_PanelFooter17;
    }

    /**
     * Getter for f_PrettyPre18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre18() {
      return build_f_PrettyPre18();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre18() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre18 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre18.setHTML(template_html4().asString());
      f_PrettyPre18.addStyleName("lang-xml");

      return f_PrettyPre18;
    }
  }
}
