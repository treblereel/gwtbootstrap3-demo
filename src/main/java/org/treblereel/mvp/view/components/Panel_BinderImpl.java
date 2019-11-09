// Template file: org/treblereel/mvp/view/components/Panel.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.386")
public class Panel_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Panel>, org.treblereel.mvp.view.components.Panel.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:Panel&gt;\\n \\s\\s&lt;b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:Heading size=\"H3\" text=\"...\"/&gt;\\n \\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s&lt;b:PanelFooter&gt;\\n \\s\\s\\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;/b:PanelFooter&gt;\\n &lt;/b:Panel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Panel type=\"INFO | DANGER | SUCCESS | PRIMARY | WARNING | DEFAULT\"&gt;\\n \\s\\s&lt;b:PanelHeader&gt;\\n \\s\\s\\s\\s&lt;b:Heading size=\"H3\" text=\"...\"/&gt;\\n \\s\\s&lt;/b:PanelHeader&gt;\\n \\s\\s&lt;b:PanelBody&gt;\\n \\s\\s\\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;/b:PanelBody&gt;\\n \\s\\s&lt;b:PanelFooter&gt;\\n \\s\\s\\s\\s&lt;b.html:Strong text=\"...\"/&gt;\\n \\s\\s&lt;/b:PanelFooter&gt;\\n &lt;/b:Panel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
  }

  Template template = new Panel_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Panel owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Panel owner;


    public Widgets(final org.treblereel.mvp.view.components.Panel owner) {
      this.owner = owner;
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html2() {
      return template.html2();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Panel_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Panel_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Panel_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Panel_BinderImpl_GenBundleImpl();
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
      f_Column2.add(get_f_Panel17());

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
      f_PageHeader3.setText("Panels");

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
      f_PanelBody7.add(get_f_Panel8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Panel8 called 1 times. Type: DEFAULT. Build precedence: 5.
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
      f_Panel8.add(get_f_PanelFooter13());

      return f_Panel8;
    }

    /**
     * Getter for f_PanelHeader9 called 1 times. Type: DEFAULT. Build precedence: 6.
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
     * Getter for f_Heading10 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading10() {
      return build_f_Heading10();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading10 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading10.setText("Panel Header");

      return f_Heading10;
    }

    /**
     * Getter for f_PanelBody11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody11() {
      return build_f_PanelBody11();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody11 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody11.add(get_f_Strong12());

      return f_PanelBody11;
    }

    /**
     * Getter for f_Strong12 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong12() {
      return build_f_Strong12();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong12 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong12.setText("Panel Body");

      return f_Strong12;
    }

    /**
     * Getter for f_PanelFooter13 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter13() {
      return build_f_PanelFooter13();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter13 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter13.add(get_f_Strong14());

      return f_PanelFooter13;
    }

    /**
     * Getter for f_Strong14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong14() {
      return build_f_Strong14();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong14 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong14.setText("Panel Footer");

      return f_Strong14;
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
      f_Panel17.add(get_f_PanelFooter35());

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
      f_Heading19.setText("Contextual Classes");

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
      f_PanelBody20.add(get_f_Panel21());
      f_PanelBody20.add(get_f_Panel28());

      return f_PanelBody20;
    }

    /**
     * Getter for f_Panel21 called 1 times. Type: DEFAULT. Build precedence: 5.
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
      f_Panel21.add(get_f_PanelFooter26());
      f_Panel21.setType(org.gwtbootstrap3.client.ui.constants.PanelType.INFO);

      return f_Panel21;
    }

    /**
     * Getter for f_PanelHeader22 called 1 times. Type: DEFAULT. Build precedence: 6.
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
     * Getter for f_Heading23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading23() {
      return build_f_Heading23();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading23 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading23.setText("Panel Header");

      return f_Heading23;
    }

    /**
     * Getter for f_PanelBody24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody24() {
      return build_f_PanelBody24();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody24 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody24.add(get_f_Strong25());

      return f_PanelBody24;
    }

    /**
     * Getter for f_Strong25 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong25() {
      return build_f_Strong25();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong25 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong25.setText("Panel Body");

      return f_Strong25;
    }

    /**
     * Getter for f_PanelFooter26 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter26() {
      return build_f_PanelFooter26();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter26 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter26.add(get_f_Strong27());

      return f_PanelFooter26;
    }

    /**
     * Getter for f_Strong27 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong27() {
      return build_f_Strong27();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong27 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong27.setText("Panel Footer");

      return f_Strong27;
    }

    /**
     * Getter for f_Panel28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel28() {
      return build_f_Panel28();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel28 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel28.add(get_f_PanelHeader29());
      f_Panel28.add(get_f_PanelBody31());
      f_Panel28.add(get_f_PanelFooter33());
      f_Panel28.setType(org.gwtbootstrap3.client.ui.constants.PanelType.DANGER);

      return f_Panel28;
    }

    /**
     * Getter for f_PanelHeader29 called 1 times. Type: DEFAULT. Build precedence: 6.
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
     * Getter for f_Heading30 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading30() {
      return build_f_Heading30();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading30 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading30.setText("Panel Header");

      return f_Heading30;
    }

    /**
     * Getter for f_PanelBody31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody31() {
      return build_f_PanelBody31();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody31 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody31.add(get_f_Strong32());

      return f_PanelBody31;
    }

    /**
     * Getter for f_Strong32 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong32() {
      return build_f_Strong32();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong32 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong32.setText("Panel Body");

      return f_Strong32;
    }

    /**
     * Getter for f_PanelFooter33 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter33() {
      return build_f_PanelFooter33();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter33 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter33.add(get_f_Strong34());

      return f_PanelFooter33;
    }

    /**
     * Getter for f_Strong34 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong34() {
      return build_f_Strong34();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong34 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong34.setText("Panel Footer");

      return f_Strong34;
    }

    /**
     * Getter for f_PanelFooter35 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter35() {
      return build_f_PanelFooter35();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter35 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter35.add(get_f_PrettyPre36());

      return f_PanelFooter35;
    }

    /**
     * Getter for f_PrettyPre36 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre36() {
      return build_f_PrettyPre36();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre36() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre36 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre36.setHTML(template_html2().asString());
      f_PrettyPre36.addStyleName("lang-xml");

      return f_PrettyPre36;
    }
  }
}
