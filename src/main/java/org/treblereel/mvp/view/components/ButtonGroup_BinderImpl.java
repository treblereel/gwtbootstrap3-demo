// Template file: org/treblereel/mvp/view/components/ButtonGroup.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.711")
public class ButtonGroup_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.ButtonGroup>, org.treblereel.mvp.view.components.ButtonGroup.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:ButtonGroup&gt;\\n \\s\\s&lt;b:Button&gt;Button 1&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;Button 2&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;Button 3&lt;/b:Button&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:ButtonGroup size=\"LARGE\"&gt;\\n \\s\\s&lt;b:Button&gt;Large 1&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;Large 2&lt;/b:Button&gt;\\n &lt;b:ButtonGroup&gt;\\n \\n &lt;b:ButtonGroup&gt;\\n \\s\\s&lt;b:Button&gt;Default 1&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;Default 2&lt;/b:Button&gt;\\n &lt;b:ButtonGroup&gt;\\n \\n &lt;b:ButtonGroup size=\"SMALL\"&gt;\\n \\s\\s&lt;b:Button&gt;Small 1&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;Small 2&lt;/b:Button&gt;\\n &lt;b:ButtonGroup&gt;\\n \\n &lt;b:ButtonGroup size=\"EXTRA_SMALL\"&gt;\\n \\s\\s&lt;b:Button&gt;Extra Small 1&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;Extra Small 2&lt;/b:Button&gt;\\n &lt;b:ButtonGroup&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:ButtonToolBar&gt;\\n \\s\\s&lt;b:ButtonGroup&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;1&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;2&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;3&lt;/b:Button&gt;\\n \\s\\s&lt;/b:ButtonGroup&gt;\\n \\n \\s\\s&lt;b:ButtonGroup&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;4&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;5&lt;/b:Button&gt;\\n \\s\\s&lt;/b:ButtonGroup&gt;\\n \\n \\s\\s&lt;b:ButtonGroup&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;6&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;7&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button&gt;8&lt;/b:Button&gt;\\n \\s\\s&lt;/b:ButtonGroup&gt;\\n &lt;/b:ButtonToolBar&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:ButtonGroup&gt;\\n \\s\\s&lt;b:Button&gt;1&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;2&lt;/b:Button&gt;\\n \\s\\s&lt;b:ButtonGroup&gt;\\n \\s\\s\\s\\s&lt;b:Button dataToggle=\"DROPDOWN\"&gt;Dropdown&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;3&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;4&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;/b:DropDownMenu&gt;\\n \\s\\s&lt;/b:ButtonGroup&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:VerticalButtonGroup&gt;\\n \\s\\s&lt;b:Button&gt;1&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;2&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;3&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button&gt;4&lt;/b:Button&gt;\\n &lt;/b:VerticalButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:ButtonGroup justified=\"true\"&gt;\\n \\s\\s&lt;b:AnchorButton&gt;Button 1&lt;/b:AnchorButton&gt;\\n \\s\\s&lt;b:AnchorButton&gt;Button 2&lt;/b:AnchorButton&gt;\\n \\s\\s&lt;b:AnchorButton&gt;Button 3&lt;/b:AnchorButton&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;b:ButtonGroup dataToggle=\"BUTTONS\"&gt;\\n \\s\\s&lt;b:CheckBoxButton active=\"true\"&gt;Option 1&lt;/b:CheckBoxButton&gt;\\n \\s\\s&lt;b:CheckBoxButton&gt;Option 2&lt;/b:CheckBoxButton&gt;\\n \\s\\s&lt;b:CheckBoxButton&gt;Option 3&lt;/b:CheckBoxButton&gt;\\n \\s\\s&lt;b:CheckBoxButton enabled=\"false\"&gt;Option 4&lt;/b:CheckBoxButton&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("&lt;b:ButtonGroup dataToggle=\"BUTTONS\"&gt;\\n \\s\\s&lt;b:RadioButton name=\"groupName\"&gt;Option 1&lt;/b:RadioButton&gt;\\n \\s\\s&lt;b:RadioButton name=\"groupName\" active=\"true\"&gt;Option 2&lt;/b:RadioButton&gt;\\n \\s\\s&lt;b:RadioButton name=\"groupName\"&gt;Option 3&lt;/b:RadioButton&gt;\\n \\s\\s&lt;b:RadioButton name=\"groupName\" enabled=\"false\"&gt;Option 4&lt;/b:RadioButton&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
  }

  Template template = new ButtonGroup_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.ButtonGroup owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.ButtonGroup owner;


    public Widgets(final org.treblereel.mvp.view.components.ButtonGroup owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.ButtonGroup_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.ButtonGroup_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.ButtonGroup_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.ButtonGroup_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.ButtonGroup_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.treblereel.mvp.view.components.ButtonGroup_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.treblereel.mvp.view.components.ButtonGroup_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_Column2.add(get_f_Panel14());
      f_Column2.add(get_f_Panel33());
      f_Column2.add(get_f_Panel51());
      f_Column2.add(get_f_Panel65());
      f_Column2.add(get_f_Panel76());
      f_Column2.add(get_f_Panel86());
      f_Column2.add(get_f_Panel97());

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
      f_PageHeader3.setText("Button Groups");

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
      f_PanelBody7.add(get_f_ButtonGroup8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_ButtonGroup8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup8() {
      return build_f_ButtonGroup8();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup8 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup8.add(get_f_Button9());
      f_ButtonGroup8.add(get_f_Button10());
      f_ButtonGroup8.add(get_f_Button11());

      return f_ButtonGroup8;
    }

    /**
     * Getter for f_Button9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button9() {
      return build_f_Button9();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button9 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button9.setText("Button 1");

      return f_Button9;
    }

    /**
     * Getter for f_Button10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button10() {
      return build_f_Button10();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button10 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button10.setText("Button 2");

      return f_Button10;
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
      f_Button11.setText("Button 3");

      return f_Button11;
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
      f_Panel14.add(get_f_PanelFooter31());

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
      f_Heading16.setText("Size");

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
      f_PanelBody17.add(get_f_ButtonToolBar18());

      return f_PanelBody17;
    }

    /**
     * Getter for f_ButtonToolBar18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonToolBar get_f_ButtonToolBar18() {
      return build_f_ButtonToolBar18();
    }
    private org.gwtbootstrap3.client.ui.ButtonToolBar build_f_ButtonToolBar18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonToolBar f_ButtonToolBar18 = new org.gwtbootstrap3.client.ui.ButtonToolBar();
      // Setup section.
      f_ButtonToolBar18.add(get_f_ButtonGroup19());
      f_ButtonToolBar18.add(get_f_ButtonGroup22());
      f_ButtonToolBar18.add(get_f_ButtonGroup25());
      f_ButtonToolBar18.add(get_f_ButtonGroup28());

      return f_ButtonToolBar18;
    }

    /**
     * Getter for f_ButtonGroup19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup19() {
      return build_f_ButtonGroup19();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup19 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup19.add(get_f_Button20());
      f_ButtonGroup19.add(get_f_Button21());
      f_ButtonGroup19.setSize(org.gwtbootstrap3.client.ui.constants.ButtonGroupSize.LARGE);

      return f_ButtonGroup19;
    }

    /**
     * Getter for f_Button20 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button20() {
      return build_f_Button20();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button20 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button20.setText("Large 1");

      return f_Button20;
    }

    /**
     * Getter for f_Button21 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button21() {
      return build_f_Button21();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button21 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button21.setText("Large 2");

      return f_Button21;
    }

    /**
     * Getter for f_ButtonGroup22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup22() {
      return build_f_ButtonGroup22();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup22 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup22.add(get_f_Button23());
      f_ButtonGroup22.add(get_f_Button24());

      return f_ButtonGroup22;
    }

    /**
     * Getter for f_Button23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button23() {
      return build_f_Button23();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button23 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button23.setText("Default 1");

      return f_Button23;
    }

    /**
     * Getter for f_Button24 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button24() {
      return build_f_Button24();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button24 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button24.setText("Default 2");

      return f_Button24;
    }

    /**
     * Getter for f_ButtonGroup25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup25() {
      return build_f_ButtonGroup25();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup25 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup25.add(get_f_Button26());
      f_ButtonGroup25.add(get_f_Button27());
      f_ButtonGroup25.setSize(org.gwtbootstrap3.client.ui.constants.ButtonGroupSize.SMALL);

      return f_ButtonGroup25;
    }

    /**
     * Getter for f_Button26 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button26() {
      return build_f_Button26();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button26 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button26.setText("Small 1");

      return f_Button26;
    }

    /**
     * Getter for f_Button27 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button27() {
      return build_f_Button27();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button27 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button27.setText("Small 2");

      return f_Button27;
    }

    /**
     * Getter for f_ButtonGroup28 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup28() {
      return build_f_ButtonGroup28();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup28 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup28.add(get_f_Button29());
      f_ButtonGroup28.add(get_f_Button30());
      f_ButtonGroup28.setSize(org.gwtbootstrap3.client.ui.constants.ButtonGroupSize.EXTRA_SMALL);

      return f_ButtonGroup28;
    }

    /**
     * Getter for f_Button29 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button29() {
      return build_f_Button29();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button29 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button29.setText("Extra Small 1");

      return f_Button29;
    }

    /**
     * Getter for f_Button30 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button30() {
      return build_f_Button30();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button30 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button30.setText("Extra Small 2");

      return f_Button30;
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
      f_PrettyPre32.setHTML(template_html2().asString());
      f_PrettyPre32.addStyleName("lang-xml");

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
      f_Panel33.add(get_f_PanelFooter49());

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
      f_Heading35.setText("Multiple");

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
      f_PanelBody36.add(get_f_ButtonToolBar37());

      return f_PanelBody36;
    }

    /**
     * Getter for f_ButtonToolBar37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonToolBar get_f_ButtonToolBar37() {
      return build_f_ButtonToolBar37();
    }
    private org.gwtbootstrap3.client.ui.ButtonToolBar build_f_ButtonToolBar37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonToolBar f_ButtonToolBar37 = new org.gwtbootstrap3.client.ui.ButtonToolBar();
      // Setup section.
      f_ButtonToolBar37.add(get_f_ButtonGroup38());
      f_ButtonToolBar37.add(get_f_ButtonGroup42());
      f_ButtonToolBar37.add(get_f_ButtonGroup45());

      return f_ButtonToolBar37;
    }

    /**
     * Getter for f_ButtonGroup38 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup38() {
      return build_f_ButtonGroup38();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup38 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup38.add(get_f_Button39());
      f_ButtonGroup38.add(get_f_Button40());
      f_ButtonGroup38.add(get_f_Button41());

      return f_ButtonGroup38;
    }

    /**
     * Getter for f_Button39 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button39() {
      return build_f_Button39();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button39 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button39.setText("1");

      return f_Button39;
    }

    /**
     * Getter for f_Button40 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button40() {
      return build_f_Button40();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button40 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button40.setText("2");

      return f_Button40;
    }

    /**
     * Getter for f_Button41 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button41() {
      return build_f_Button41();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button41 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button41.setText("3");

      return f_Button41;
    }

    /**
     * Getter for f_ButtonGroup42 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup42() {
      return build_f_ButtonGroup42();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup42 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup42.add(get_f_Button43());
      f_ButtonGroup42.add(get_f_Button44());

      return f_ButtonGroup42;
    }

    /**
     * Getter for f_Button43 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button43() {
      return build_f_Button43();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button43 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button43.setText("4");

      return f_Button43;
    }

    /**
     * Getter for f_Button44 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button44() {
      return build_f_Button44();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button44 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button44.setText("5");

      return f_Button44;
    }

    /**
     * Getter for f_ButtonGroup45 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup45() {
      return build_f_ButtonGroup45();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup45 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup45.add(get_f_Button46());
      f_ButtonGroup45.add(get_f_Button47());
      f_ButtonGroup45.add(get_f_Button48());

      return f_ButtonGroup45;
    }

    /**
     * Getter for f_Button46 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button46() {
      return build_f_Button46();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button46 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button46.setText("6");

      return f_Button46;
    }

    /**
     * Getter for f_Button47 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button47() {
      return build_f_Button47();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button47 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button47.setText("7");

      return f_Button47;
    }

    /**
     * Getter for f_Button48 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button48() {
      return build_f_Button48();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button48 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button48.setText("8");

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
      f_PrettyPre50.setHTML(template_html3().asString());
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
      f_Panel51.add(get_f_PanelFooter63());

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
      f_Heading53.setText("Nested");

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
      f_PanelBody54.add(get_f_ButtonGroup55());

      return f_PanelBody54;
    }

    /**
     * Getter for f_ButtonGroup55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup55() {
      return build_f_ButtonGroup55();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup55 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup55.add(get_f_Button56());
      f_ButtonGroup55.add(get_f_Button57());
      f_ButtonGroup55.add(get_f_ButtonGroup58());

      return f_ButtonGroup55;
    }

    /**
     * Getter for f_Button56 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button56() {
      return build_f_Button56();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button56 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button56.setText("1");

      return f_Button56;
    }

    /**
     * Getter for f_Button57 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button57() {
      return build_f_Button57();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button57 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button57.setText("2");

      return f_Button57;
    }

    /**
     * Getter for f_ButtonGroup58 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup58() {
      return build_f_ButtonGroup58();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup58 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup58.add(get_f_Button59());
      f_ButtonGroup58.add(get_f_DropDownMenu60());

      return f_ButtonGroup58;
    }

    /**
     * Getter for f_Button59 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button59() {
      return build_f_Button59();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button59 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button59.setText("Dropdown");
      f_Button59.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_Button59;
    }

    /**
     * Getter for f_DropDownMenu60 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu60() {
      return build_f_DropDownMenu60();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu60 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu60.add(get_f_AnchorListItem61());
      f_DropDownMenu60.add(get_f_AnchorListItem62());

      return f_DropDownMenu60;
    }

    /**
     * Getter for f_AnchorListItem61 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem61() {
      return build_f_AnchorListItem61();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem61 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem61.setText("3");

      return f_AnchorListItem61;
    }

    /**
     * Getter for f_AnchorListItem62 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem62() {
      return build_f_AnchorListItem62();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem62 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem62.setText("4");

      return f_AnchorListItem62;
    }

    /**
     * Getter for f_PanelFooter63 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter63() {
      return build_f_PanelFooter63();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter63 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter63.add(get_f_PrettyPre64());

      return f_PanelFooter63;
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
      f_PrettyPre64.setHTML(template_html4().asString());
      f_PrettyPre64.addStyleName("lang-xml");

      return f_PrettyPre64;
    }

    /**
     * Getter for f_Panel65 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel65() {
      return build_f_Panel65();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel65 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel65.add(get_f_PanelHeader66());
      f_Panel65.add(get_f_PanelBody68());
      f_Panel65.add(get_f_PanelFooter74());

      return f_Panel65;
    }

    /**
     * Getter for f_PanelHeader66 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader66() {
      return build_f_PanelHeader66();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader66 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader66.add(get_f_Heading67());

      return f_PanelHeader66;
    }

    /**
     * Getter for f_Heading67 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading67() {
      return build_f_Heading67();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading67 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading67.setText("Vertical");

      return f_Heading67;
    }

    /**
     * Getter for f_PanelBody68 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody68() {
      return build_f_PanelBody68();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody68 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody68.add(get_f_VerticalButtonGroup69());

      return f_PanelBody68;
    }

    /**
     * Getter for f_VerticalButtonGroup69 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.VerticalButtonGroup get_f_VerticalButtonGroup69() {
      return build_f_VerticalButtonGroup69();
    }
    private org.gwtbootstrap3.client.ui.VerticalButtonGroup build_f_VerticalButtonGroup69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.VerticalButtonGroup f_VerticalButtonGroup69 = new org.gwtbootstrap3.client.ui.VerticalButtonGroup();
      // Setup section.
      f_VerticalButtonGroup69.add(get_f_Button70());
      f_VerticalButtonGroup69.add(get_f_Button71());
      f_VerticalButtonGroup69.add(get_f_Button72());
      f_VerticalButtonGroup69.add(get_f_Button73());

      return f_VerticalButtonGroup69;
    }

    /**
     * Getter for f_Button70 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button70() {
      return build_f_Button70();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button70 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button70.setText("1");

      return f_Button70;
    }

    /**
     * Getter for f_Button71 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button71() {
      return build_f_Button71();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button71 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button71.setText("2");

      return f_Button71;
    }

    /**
     * Getter for f_Button72 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button72() {
      return build_f_Button72();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button72 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button72.setText("3");

      return f_Button72;
    }

    /**
     * Getter for f_Button73 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button73() {
      return build_f_Button73();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button73 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button73.setText("4");

      return f_Button73;
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
      f_PrettyPre75.setHTML(template_html5().asString());
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
      f_Panel76.add(get_f_PanelFooter84());

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
      f_Heading78.setText("Justified");

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
      f_PanelBody79.add(get_f_ButtonGroup80());

      return f_PanelBody79;
    }

    /**
     * Getter for f_ButtonGroup80 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup80() {
      return build_f_ButtonGroup80();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup80 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup80.add(get_f_AnchorButton81());
      f_ButtonGroup80.add(get_f_AnchorButton82());
      f_ButtonGroup80.add(get_f_AnchorButton83());
      f_ButtonGroup80.setJustified(true);

      return f_ButtonGroup80;
    }

    /**
     * Getter for f_AnchorButton81 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton81() {
      return build_f_AnchorButton81();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton81 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton81.setText("Button 1");

      return f_AnchorButton81;
    }

    /**
     * Getter for f_AnchorButton82 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton82() {
      return build_f_AnchorButton82();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton82 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton82.setText("Button 2");

      return f_AnchorButton82;
    }

    /**
     * Getter for f_AnchorButton83 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton83() {
      return build_f_AnchorButton83();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton83 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton83.setText("Button 3");

      return f_AnchorButton83;
    }

    /**
     * Getter for f_PanelFooter84 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter84() {
      return build_f_PanelFooter84();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter84() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter84 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter84.add(get_f_PrettyPre85());

      return f_PanelFooter84;
    }

    /**
     * Getter for f_PrettyPre85 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre85() {
      return build_f_PrettyPre85();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre85() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre85 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre85.setHTML(template_html6().asString());
      f_PrettyPre85.addStyleName("lang-xml");

      return f_PrettyPre85;
    }

    /**
     * Getter for f_Panel86 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel86() {
      return build_f_Panel86();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel86() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel86 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel86.add(get_f_PanelHeader87());
      f_Panel86.add(get_f_PanelBody89());
      f_Panel86.add(get_f_PanelFooter95());

      return f_Panel86;
    }

    /**
     * Getter for f_PanelHeader87 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader87() {
      return build_f_PanelHeader87();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader87() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader87 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader87.add(get_f_Heading88());

      return f_PanelHeader87;
    }

    /**
     * Getter for f_Heading88 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading88() {
      return build_f_Heading88();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading88 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading88.setText("Checkbox buttons");

      return f_Heading88;
    }

    /**
     * Getter for f_PanelBody89 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody89() {
      return build_f_PanelBody89();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody89 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody89.add(get_f_ButtonGroup90());

      return f_PanelBody89;
    }

    /**
     * Getter for f_ButtonGroup90 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup90() {
      return build_f_ButtonGroup90();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup90 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup90.add(get_f_CheckBoxButton91());
      f_ButtonGroup90.add(get_f_CheckBoxButton92());
      f_ButtonGroup90.add(get_f_CheckBoxButton93());
      f_ButtonGroup90.add(get_f_CheckBoxButton94());
      f_ButtonGroup90.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.BUTTONS);

      return f_ButtonGroup90;
    }

    /**
     * Getter for f_CheckBoxButton91 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CheckBoxButton get_f_CheckBoxButton91() {
      return build_f_CheckBoxButton91();
    }
    private org.gwtbootstrap3.client.ui.CheckBoxButton build_f_CheckBoxButton91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBoxButton f_CheckBoxButton91 = new org.gwtbootstrap3.client.ui.CheckBoxButton();
      // Setup section.
      f_CheckBoxButton91.setText("Option 1");
      f_CheckBoxButton91.setActive(true);

      return f_CheckBoxButton91;
    }

    /**
     * Getter for f_CheckBoxButton92 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CheckBoxButton get_f_CheckBoxButton92() {
      return build_f_CheckBoxButton92();
    }
    private org.gwtbootstrap3.client.ui.CheckBoxButton build_f_CheckBoxButton92() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBoxButton f_CheckBoxButton92 = new org.gwtbootstrap3.client.ui.CheckBoxButton();
      // Setup section.
      f_CheckBoxButton92.setText("Option 2");

      return f_CheckBoxButton92;
    }

    /**
     * Getter for f_CheckBoxButton93 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CheckBoxButton get_f_CheckBoxButton93() {
      return build_f_CheckBoxButton93();
    }
    private org.gwtbootstrap3.client.ui.CheckBoxButton build_f_CheckBoxButton93() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBoxButton f_CheckBoxButton93 = new org.gwtbootstrap3.client.ui.CheckBoxButton();
      // Setup section.
      f_CheckBoxButton93.setText("Option 3");

      return f_CheckBoxButton93;
    }

    /**
     * Getter for f_CheckBoxButton94 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CheckBoxButton get_f_CheckBoxButton94() {
      return build_f_CheckBoxButton94();
    }
    private org.gwtbootstrap3.client.ui.CheckBoxButton build_f_CheckBoxButton94() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBoxButton f_CheckBoxButton94 = new org.gwtbootstrap3.client.ui.CheckBoxButton();
      // Setup section.
      f_CheckBoxButton94.setText("Option 4");
      f_CheckBoxButton94.setEnabled(false);

      return f_CheckBoxButton94;
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
      f_PrettyPre96.setHTML(template_html7().asString());
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
      f_Heading99.setText("Radio buttons");

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
      f_PanelBody100.add(get_f_Row101());

      return f_PanelBody100;
    }

    /**
     * Getter for f_Row101 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row101() {
      return build_f_Row101();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row101 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row101.add(get_f_Column102());
      f_Row101.add(get_f_Column105());

      return f_Row101;
    }

    /**
     * Getter for f_Column102 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column102() {
      return build_f_Column102();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column102() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column102 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_4");
      // Setup section.
      f_Column102.add(get_f_ButtonGroup103());

      return f_Column102;
    }

    /**
     * Getter for f_ButtonGroup103 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup103() {
      return build_f_ButtonGroup103();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup103() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup103 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup103.add(get_button1());
      f_ButtonGroup103.add(get_button2());
      f_ButtonGroup103.add(get_button3());
      f_ButtonGroup103.add(get_f_RadioButton104());
      f_ButtonGroup103.setName("groupName");
      f_ButtonGroup103.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.BUTTONS);

      return f_ButtonGroup103;
    }

    /**
     * Getter for button1 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.RadioButton get_button1() {
      return build_button1();
    }
    private org.gwtbootstrap3.client.ui.RadioButton build_button1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.RadioButton button1 = new org.gwtbootstrap3.client.ui.RadioButton("groupName");
      // Setup section.
      button1.setText("Option 1");

      this.owner.button1 = button1;

      return button1;
    }

    /**
     * Getter for button2 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.RadioButton get_button2() {
      return build_button2();
    }
    private org.gwtbootstrap3.client.ui.RadioButton build_button2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.RadioButton button2 = new org.gwtbootstrap3.client.ui.RadioButton("groupName");
      // Setup section.
      button2.setText("Option 2");
      button2.setActive(true);

      this.owner.button2 = button2;

      return button2;
    }

    /**
     * Getter for button3 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.RadioButton get_button3() {
      return build_button3();
    }
    private org.gwtbootstrap3.client.ui.RadioButton build_button3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.RadioButton button3 = new org.gwtbootstrap3.client.ui.RadioButton("groupName");
      // Setup section.
      button3.setText("Option 3");

      this.owner.button3 = button3;

      return button3;
    }

    /**
     * Getter for f_RadioButton104 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.RadioButton get_f_RadioButton104() {
      return build_f_RadioButton104();
    }
    private org.gwtbootstrap3.client.ui.RadioButton build_f_RadioButton104() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.RadioButton f_RadioButton104 = new org.gwtbootstrap3.client.ui.RadioButton("groupName");
      // Setup section.
      f_RadioButton104.setText("Option 4");
      f_RadioButton104.setEnabled(false);

      return f_RadioButton104;
    }

    /**
     * Getter for f_Column105 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column105() {
      return build_f_Column105();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column105() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column105 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_8");
      // Setup section.
      f_Column105.add(get_log());

      return f_Column105;
    }

    /**
     * Getter for log called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_log() {
      return build_log();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_log() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel log = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      log.addStyleName("" + get_style().log() + "");

      this.owner.log = log;

      return log;
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
      f_PrettyPre107.setHTML(template_html8().asString());
      f_PrettyPre107.addStyleName("lang-xml");

      return f_PrettyPre107;
    }
  }
}
