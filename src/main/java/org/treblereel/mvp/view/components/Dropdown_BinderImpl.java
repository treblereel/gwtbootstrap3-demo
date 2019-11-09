// Template file: org/treblereel/mvp/view/components/Dropdown.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.451")
public class Dropdown_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Dropdown>, org.treblereel.mvp.view.components.Dropdown.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Click to toggle dropdown")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:DropDown&gt;\\n \\s\\s&lt;b:Anchor dataToggle=\"DROPDOWN\"&gt;Click to toggle dropdown&lt;/b:Anchor&gt;\\n \\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s&lt;b:DropDownHeader&gt;Header 1&lt;/b:DropDownHeader&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Action 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem icon=\"CAMERA\"&gt;Action 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:Divider/&gt;\\n \\s\\s\\s\\s&lt;b:DropDownHeader&gt;Header 2&lt;/b:DropDownHeader&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem icon=\"CREDIT_CARD\" iconPosition=\"RIGHT\" iconSpin=\"true\"&gt;Action 3&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem enabled=\"false\"&gt;Action 4 (disabled)&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;/b:DropDownMenu&gt;\\n &lt;/b:DropDown&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
  }

  Template template = new Dropdown_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Dropdown owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Dropdown owner;


    public Widgets(final org.treblereel.mvp.view.components.Dropdown owner) {
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
    private org.treblereel.mvp.view.components.Dropdown_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Dropdown_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Dropdown_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Dropdown_BinderImpl_GenBundleImpl();
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
      f_PageHeader3.setText("Dropdowns");

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
      f_Panel4.add(get_f_PanelFooter18());

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
      f_PanelBody7.add(get_f_DropDown8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_DropDown8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.DropDown get_f_DropDown8() {
      return build_f_DropDown8();
    }
    private org.gwtbootstrap3.client.ui.DropDown build_f_DropDown8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDown f_DropDown8 = new org.gwtbootstrap3.client.ui.DropDown();
      // Setup section.
      f_DropDown8.add(get_f_Anchor9());
      f_DropDown8.add(get_f_DropDownMenu10());

      return f_DropDown8;
    }

    /**
     * Getter for f_Anchor9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor9() {
      return build_f_Anchor9();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor9 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor9.setHTML(template_html1().asString());
      f_Anchor9.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_Anchor9;
    }

    /**
     * Getter for f_DropDownMenu10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu10() {
      return build_f_DropDownMenu10();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu10 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu10.add(get_f_DropDownHeader11());
      f_DropDownMenu10.add(get_f_AnchorListItem12());
      f_DropDownMenu10.add(get_f_AnchorListItem13());
      f_DropDownMenu10.add(get_f_Divider14());
      f_DropDownMenu10.add(get_f_DropDownHeader15());
      f_DropDownMenu10.add(get_f_AnchorListItem16());
      f_DropDownMenu10.add(get_f_AnchorListItem17());

      return f_DropDownMenu10;
    }

    /**
     * Getter for f_DropDownHeader11 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.DropDownHeader get_f_DropDownHeader11() {
      return build_f_DropDownHeader11();
    }
    private org.gwtbootstrap3.client.ui.DropDownHeader build_f_DropDownHeader11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownHeader f_DropDownHeader11 = new org.gwtbootstrap3.client.ui.DropDownHeader();
      // Setup section.
      f_DropDownHeader11.setText("Header 1");

      return f_DropDownHeader11;
    }

    /**
     * Getter for f_AnchorListItem12 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem12() {
      return build_f_AnchorListItem12();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem12 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem12.setText("Action 1");

      return f_AnchorListItem12;
    }

    /**
     * Getter for f_AnchorListItem13 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem13() {
      return build_f_AnchorListItem13();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem13 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem13.setText("Action 2");
      f_AnchorListItem13.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CAMERA);

      return f_AnchorListItem13;
    }

    /**
     * Getter for f_Divider14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Divider get_f_Divider14() {
      return build_f_Divider14();
    }
    private org.gwtbootstrap3.client.ui.Divider build_f_Divider14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Divider f_Divider14 = new org.gwtbootstrap3.client.ui.Divider();
      // Setup section.

      return f_Divider14;
    }

    /**
     * Getter for f_DropDownHeader15 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.DropDownHeader get_f_DropDownHeader15() {
      return build_f_DropDownHeader15();
    }
    private org.gwtbootstrap3.client.ui.DropDownHeader build_f_DropDownHeader15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownHeader f_DropDownHeader15 = new org.gwtbootstrap3.client.ui.DropDownHeader();
      // Setup section.
      f_DropDownHeader15.setText("Header 2");

      return f_DropDownHeader15;
    }

    /**
     * Getter for f_AnchorListItem16 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem16() {
      return build_f_AnchorListItem16();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem16 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem16.setText("Action 3");
      f_AnchorListItem16.setIconSpin(true);
      f_AnchorListItem16.setIconPosition(org.gwtbootstrap3.client.ui.constants.IconPosition.RIGHT);
      f_AnchorListItem16.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CREDIT_CARD);

      return f_AnchorListItem16;
    }

    /**
     * Getter for f_AnchorListItem17 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem17() {
      return build_f_AnchorListItem17();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem17 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem17.setText("Action 4 (disabled)");
      f_AnchorListItem17.setEnabled(false);

      return f_AnchorListItem17;
    }

    /**
     * Getter for f_PanelFooter18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter18() {
      return build_f_PanelFooter18();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter18 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter18.add(get_f_PrettyPre19());

      return f_PanelFooter18;
    }

    /**
     * Getter for f_PrettyPre19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre19() {
      return build_f_PrettyPre19();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre19() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre19 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre19.setHTML(template_html2().asString());
      f_PrettyPre19.addStyleName("lang-xml");

      return f_PrettyPre19;
    }
  }
}
