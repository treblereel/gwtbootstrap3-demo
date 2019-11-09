// Template file: org/treblereel/mvp/view/components/InputGroup.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.847")
public class InputGroup_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.InputGroup>, org.treblereel.mvp.view.components.InputGroup.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:InputGroup&gt;\\n \\s\\s&lt;b:InputGroupAddon&gt;P&lt;/b:InputGroupAddon&gt;\\n \\s\\s&lt;b:TextBox placeholder=\"Type here\" autoComplete=\"false\"/&gt;\\n \\s\\s&lt;b:InputGroupAddon&gt;A&lt;/b:InputGroupAddon&gt;\\n &lt;/b:InputGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:InputGroup&gt;\\n \\s\\s&lt;b:InputGroupAddon icon=\"USER\"/&gt;\\n \\s\\s&lt;b:TextBox placeholder=\"Type here\" autoComplete=\"false\"/&gt;\\n \\s\\s&lt;b:InputGroupAddon icon=\"FACEBOOK\" iconSpin=\"true\"/&gt;\\n &lt;/b:InputGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:InputGroup&gt;\\n \\s\\s&lt;b:InputGroupAddon icon=\"USER\"&gt;User&lt;/b:InputGroupAddon&gt;\\n \\s\\s&lt;b:TextBox placeholder=\"Type here\" autoComplete=\"false\"/&gt;\\n \\s\\s&lt;b:InputGroupAddon icon=\"FACEBOOK\" iconPosition=\"RIGHT\"&gt;Facebook&lt;/b:InputGroupAddon&gt;\\n &lt;/b:InputGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:InputGroup&gt;\\n \\s\\s&lt;b:InputGroupButton&gt;\\n \\s\\s\\s\\s&lt;b:CheckButton&gt;\\n \\s\\s&lt;/b:InputGroupButton&gt;\\n \\s\\s&lt;b:TextBox placeholder=\"Type here\" autoComplete=\"false\"/&gt;\\n &lt;/b:InputGroup&gt;\\n \\n &lt;b:InputGroup&gt;\\n \\s\\s&lt;b:InputGroupButton&gt;\\n \\s\\s\\s\\s&lt;b:RadioButton&gt;\\n \\s\\s&lt;/b:InputGroupButton&gt;\\n \\s\\s&lt;b:TextBox placeholder=\"Type here\" autoComplete=\"false\"/&gt;\\n &lt;/b:InputGroup&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:InputGroup&gt;\\n \\s\\s&lt;b:InputGroupButton&gt;\\n \\s\\s\\s\\s&lt;b:Button text=\"...\"&gt;\\n \\s\\s&lt;/b:InputGroupButton&gt;\\n \\s\\s&lt;b:TextBox placeholder=\"Type here\" autoComplete=\"false\"/&gt;\\n &lt;/b:InputGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
  }

  Template template = new InputGroup_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.InputGroup owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.InputGroup owner;


    public Widgets(final org.treblereel.mvp.view.components.InputGroup owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.InputGroup_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.InputGroup_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.InputGroup_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.InputGroup_BinderImpl_GenBundleImpl();
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
      f_Column2.add(get_f_Panel14());
      f_Column2.add(get_f_Panel24());
      f_Column2.add(get_f_Panel34());
      f_Column2.add(get_f_Panel51());

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
      f_PageHeader3.setText("Input Groups");

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
      f_Panel4.add(get_f_PanelFooter12());

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
      f_PanelBody7.add(get_f_InputGroup8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_InputGroup8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.InputGroup get_f_InputGroup8() {
      return build_f_InputGroup8();
    }
    private org.gwtbootstrap3.client.ui.InputGroup build_f_InputGroup8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroup f_InputGroup8 = new org.gwtbootstrap3.client.ui.InputGroup();
      // Setup section.
      f_InputGroup8.add(get_f_InputGroupAddon9());
      f_InputGroup8.add(get_f_TextBox10());
      f_InputGroup8.add(get_f_InputGroupAddon11());

      return f_InputGroup8;
    }

    /**
     * Getter for f_InputGroupAddon9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_f_InputGroupAddon9() {
      return build_f_InputGroupAddon9();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_f_InputGroupAddon9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon f_InputGroupAddon9 = new org.gwtbootstrap3.client.ui.InputGroupAddon();
      // Setup section.
      f_InputGroupAddon9.setText("P");

      return f_InputGroupAddon9;
    }

    /**
     * Getter for f_TextBox10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox10() {
      return build_f_TextBox10();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox10 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox10.setAutoComplete(false);
      f_TextBox10.setPlaceholder("Type here");

      return f_TextBox10;
    }

    /**
     * Getter for f_InputGroupAddon11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_f_InputGroupAddon11() {
      return build_f_InputGroupAddon11();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_f_InputGroupAddon11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon f_InputGroupAddon11 = new org.gwtbootstrap3.client.ui.InputGroupAddon();
      // Setup section.
      f_InputGroupAddon11.setText("A");

      return f_InputGroupAddon11;
    }

    /**
     * Getter for f_PanelFooter12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter12() {
      return build_f_PanelFooter12();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter12 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter12.add(get_f_PrettyPre13());

      return f_PanelFooter12;
    }

    /**
     * Getter for f_PrettyPre13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre13() {
      return build_f_PrettyPre13();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre13() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre13 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre13.setHTML(template_html1().asString());
      f_PrettyPre13.addStyleName("lang-xml");

      return f_PrettyPre13;
    }

    /**
     * Getter for f_Panel14 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel14() {
      return build_f_Panel14();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel14 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel14.add(get_f_PanelHeader15());
      f_Panel14.add(get_f_PanelBody17());
      f_Panel14.add(get_f_PanelFooter22());

      return f_Panel14;
    }

    /**
     * Getter for f_PanelHeader15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader15() {
      return build_f_PanelHeader15();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader15 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader15.add(get_f_Heading16());

      return f_PanelHeader15;
    }

    /**
     * Getter for f_Heading16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading16() {
      return build_f_Heading16();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading16 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading16.setText("Icon Addons");

      return f_Heading16;
    }

    /**
     * Getter for f_PanelBody17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody17() {
      return build_f_PanelBody17();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody17 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody17.add(get_f_InputGroup18());

      return f_PanelBody17;
    }

    /**
     * Getter for f_InputGroup18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.InputGroup get_f_InputGroup18() {
      return build_f_InputGroup18();
    }
    private org.gwtbootstrap3.client.ui.InputGroup build_f_InputGroup18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroup f_InputGroup18 = new org.gwtbootstrap3.client.ui.InputGroup();
      // Setup section.
      f_InputGroup18.add(get_f_InputGroupAddon19());
      f_InputGroup18.add(get_f_TextBox20());
      f_InputGroup18.add(get_f_InputGroupAddon21());

      return f_InputGroup18;
    }

    /**
     * Getter for f_InputGroupAddon19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_f_InputGroupAddon19() {
      return build_f_InputGroupAddon19();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_f_InputGroupAddon19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon f_InputGroupAddon19 = new org.gwtbootstrap3.client.ui.InputGroupAddon();
      // Setup section.
      f_InputGroupAddon19.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.USER);

      return f_InputGroupAddon19;
    }

    /**
     * Getter for f_TextBox20 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox20() {
      return build_f_TextBox20();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox20 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox20.setAutoComplete(false);
      f_TextBox20.setPlaceholder("Type here");

      return f_TextBox20;
    }

    /**
     * Getter for f_InputGroupAddon21 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_f_InputGroupAddon21() {
      return build_f_InputGroupAddon21();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_f_InputGroupAddon21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon f_InputGroupAddon21 = new org.gwtbootstrap3.client.ui.InputGroupAddon();
      // Setup section.
      f_InputGroupAddon21.setIconSpin(true);
      f_InputGroupAddon21.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.FACEBOOK);

      return f_InputGroupAddon21;
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
      f_PrettyPre23.setHTML(template_html2().asString());
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
      f_Heading26.setText("Icon and Text Mixin Addons");

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
      f_PanelBody27.add(get_f_InputGroup28());

      return f_PanelBody27;
    }

    /**
     * Getter for f_InputGroup28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.InputGroup get_f_InputGroup28() {
      return build_f_InputGroup28();
    }
    private org.gwtbootstrap3.client.ui.InputGroup build_f_InputGroup28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroup f_InputGroup28 = new org.gwtbootstrap3.client.ui.InputGroup();
      // Setup section.
      f_InputGroup28.add(get_f_InputGroupAddon29());
      f_InputGroup28.add(get_f_TextBox30());
      f_InputGroup28.add(get_f_InputGroupAddon31());

      return f_InputGroup28;
    }

    /**
     * Getter for f_InputGroupAddon29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_f_InputGroupAddon29() {
      return build_f_InputGroupAddon29();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_f_InputGroupAddon29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon f_InputGroupAddon29 = new org.gwtbootstrap3.client.ui.InputGroupAddon();
      // Setup section.
      f_InputGroupAddon29.setText("User");
      f_InputGroupAddon29.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.USER);

      return f_InputGroupAddon29;
    }

    /**
     * Getter for f_TextBox30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox30() {
      return build_f_TextBox30();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox30 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox30.setAutoComplete(false);
      f_TextBox30.setPlaceholder("Type here");

      return f_TextBox30;
    }

    /**
     * Getter for f_InputGroupAddon31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InputGroupAddon get_f_InputGroupAddon31() {
      return build_f_InputGroupAddon31();
    }
    private org.gwtbootstrap3.client.ui.InputGroupAddon build_f_InputGroupAddon31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupAddon f_InputGroupAddon31 = new org.gwtbootstrap3.client.ui.InputGroupAddon();
      // Setup section.
      f_InputGroupAddon31.setText("Facebook");
      f_InputGroupAddon31.setIconPosition(org.gwtbootstrap3.client.ui.constants.IconPosition.RIGHT);
      f_InputGroupAddon31.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.FACEBOOK);

      return f_InputGroupAddon31;
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
      f_Panel34.add(get_f_PanelFooter49());

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
      f_Heading36.setText("Checkboxes and Radio Addons");

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
      f_PanelBody37.add(get_f_Row38());

      return f_PanelBody37;
    }

    /**
     * Getter for f_Row38 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row38() {
      return build_f_Row38();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row38 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row38.add(get_f_Column39());
      f_Row38.add(get_f_Column44());

      return f_Row38;
    }

    /**
     * Getter for f_Column39 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column39() {
      return build_f_Column39();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column39 = new org.gwtbootstrap3.client.ui.Column("MD_6");
      // Setup section.
      f_Column39.add(get_f_InputGroup40());

      return f_Column39;
    }

    /**
     * Getter for f_InputGroup40 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.InputGroup get_f_InputGroup40() {
      return build_f_InputGroup40();
    }
    private org.gwtbootstrap3.client.ui.InputGroup build_f_InputGroup40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroup f_InputGroup40 = new org.gwtbootstrap3.client.ui.InputGroup();
      // Setup section.
      f_InputGroup40.add(get_f_InputGroupButton41());
      f_InputGroup40.add(get_f_TextBox43());

      return f_InputGroup40;
    }

    /**
     * Getter for f_InputGroupButton41 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.InputGroupButton get_f_InputGroupButton41() {
      return build_f_InputGroupButton41();
    }
    private org.gwtbootstrap3.client.ui.InputGroupButton build_f_InputGroupButton41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupButton f_InputGroupButton41 = new org.gwtbootstrap3.client.ui.InputGroupButton();
      // Setup section.
      f_InputGroupButton41.add(get_f_CheckBoxButton42());

      return f_InputGroupButton41;
    }

    /**
     * Getter for f_CheckBoxButton42 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.CheckBoxButton get_f_CheckBoxButton42() {
      return build_f_CheckBoxButton42();
    }
    private org.gwtbootstrap3.client.ui.CheckBoxButton build_f_CheckBoxButton42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBoxButton f_CheckBoxButton42 = new org.gwtbootstrap3.client.ui.CheckBoxButton();
      // Setup section.

      return f_CheckBoxButton42;
    }

    /**
     * Getter for f_TextBox43 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox43() {
      return build_f_TextBox43();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox43 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox43.setAutoComplete(false);

      return f_TextBox43;
    }

    /**
     * Getter for f_Column44 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column44() {
      return build_f_Column44();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column44 = new org.gwtbootstrap3.client.ui.Column("MD_6");
      // Setup section.
      f_Column44.add(get_f_InputGroup45());

      return f_Column44;
    }

    /**
     * Getter for f_InputGroup45 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.InputGroup get_f_InputGroup45() {
      return build_f_InputGroup45();
    }
    private org.gwtbootstrap3.client.ui.InputGroup build_f_InputGroup45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroup f_InputGroup45 = new org.gwtbootstrap3.client.ui.InputGroup();
      // Setup section.
      f_InputGroup45.add(get_f_InputGroupButton46());
      f_InputGroup45.add(get_f_TextBox48());

      return f_InputGroup45;
    }

    /**
     * Getter for f_InputGroupButton46 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.InputGroupButton get_f_InputGroupButton46() {
      return build_f_InputGroupButton46();
    }
    private org.gwtbootstrap3.client.ui.InputGroupButton build_f_InputGroupButton46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupButton f_InputGroupButton46 = new org.gwtbootstrap3.client.ui.InputGroupButton();
      // Setup section.
      f_InputGroupButton46.add(get_f_RadioButton47());

      return f_InputGroupButton46;
    }

    /**
     * Getter for f_RadioButton47 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.RadioButton get_f_RadioButton47() {
      return build_f_RadioButton47();
    }
    private org.gwtbootstrap3.client.ui.RadioButton build_f_RadioButton47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.RadioButton f_RadioButton47 = new org.gwtbootstrap3.client.ui.RadioButton("group");
      // Setup section.

      return f_RadioButton47;
    }

    /**
     * Getter for f_TextBox48 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox48() {
      return build_f_TextBox48();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox48 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox48.setAutoComplete(false);

      return f_TextBox48;
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
      f_PrettyPre50.setHTML(template_html4().asString());
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
      f_Panel51.add(get_f_PanelFooter59());

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
      f_Heading53.setText("Button Addons");

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
      f_PanelBody54.add(get_f_InputGroup55());

      return f_PanelBody54;
    }

    /**
     * Getter for f_InputGroup55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.InputGroup get_f_InputGroup55() {
      return build_f_InputGroup55();
    }
    private org.gwtbootstrap3.client.ui.InputGroup build_f_InputGroup55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroup f_InputGroup55 = new org.gwtbootstrap3.client.ui.InputGroup();
      // Setup section.
      f_InputGroup55.add(get_f_InputGroupButton56());
      f_InputGroup55.add(get_f_TextBox58());

      return f_InputGroup55;
    }

    /**
     * Getter for f_InputGroupButton56 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InputGroupButton get_f_InputGroupButton56() {
      return build_f_InputGroupButton56();
    }
    private org.gwtbootstrap3.client.ui.InputGroupButton build_f_InputGroupButton56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InputGroupButton f_InputGroupButton56 = new org.gwtbootstrap3.client.ui.InputGroupButton();
      // Setup section.
      f_InputGroupButton56.add(get_f_Button57());

      return f_InputGroupButton56;
    }

    /**
     * Getter for f_Button57 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button57() {
      return build_f_Button57();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button57 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button57.setText("Go!");

      return f_Button57;
    }

    /**
     * Getter for f_TextBox58 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox58() {
      return build_f_TextBox58();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox58 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox58.setAutoComplete(false);

      return f_TextBox58;
    }

    /**
     * Getter for f_PanelFooter59 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter59() {
      return build_f_PanelFooter59();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter59 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter59.add(get_f_PrettyPre60());

      return f_PanelFooter59;
    }

    /**
     * Getter for f_PrettyPre60 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre60() {
      return build_f_PrettyPre60();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre60() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre60 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre60.setHTML(template_html5().asString());
      f_PrettyPre60.addStyleName("lang-xml");

      return f_PrettyPre60;
    }
  }
}
