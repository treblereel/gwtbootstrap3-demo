// Template file: org/treblereel/mvp/view/components/ButtonDropdown.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.359")
public class ButtonDropdown_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.ButtonDropdown>, org.treblereel.mvp.view.components.ButtonDropdown.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:ButtonGroup&gt;\\n \\s\\s&lt;b:Button dataToggle=\"DROPDOWN\" text=\"...\" type=\"...\" toggleCaret=\"true|false\"/&gt;\\n \\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;/b:DropDownMenu&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:ButtonGroup&gt;\\n \\s\\s&lt;b:Button&gt;Split Dropdown&lt;/b:Button&gt;\\n \\s\\s&lt;b:Button dataToggle=\"DROPDOWN\"/&gt;\\n \\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;/b:DropDownMenu&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:ButtonGroup dropUp=\"true\"&gt;\\n \\s\\s&lt;b:Button dataToggle=\"DROPDOWN\"&gt;Dropup&lt;/b:Button&gt;\\n \\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;/b:DropDownMenu&gt;\\n &lt;/b:ButtonGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
  }

  Template template = new ButtonDropdown_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.ButtonDropdown owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.ButtonDropdown owner;


    public Widgets(final org.treblereel.mvp.view.components.ButtonDropdown owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.ButtonDropdown_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.ButtonDropdown_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.ButtonDropdown_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.ButtonDropdown_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 8 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.ButtonDropdown_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.components.ButtonDropdown_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.components.ButtonDropdown_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel40());
      f_Column2.add(get_f_Panel53());

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
      f_PageHeader3.setText("Button Dropdowns");

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
      f_Panel4.add(get_f_PanelFooter38());

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
      f_PanelBody7.add(get_f_ButtonGroup13());
      f_PanelBody7.add(get_f_ButtonGroup18());
      f_PanelBody7.add(get_f_ButtonGroup23());
      f_PanelBody7.add(get_f_ButtonGroup28());
      f_PanelBody7.add(get_f_ButtonGroup33());

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
      f_ButtonGroup8.add(get_f_DropDownMenu10());
      f_ButtonGroup8.addStyleName("" + get_style().spacing() + "");

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
      f_Button9.setText("Default (no caret)");
      f_Button9.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      f_Button9.setToggleCaret(false);

      return f_Button9;
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
      f_DropDownMenu10.add(get_f_AnchorListItem11());
      f_DropDownMenu10.add(get_f_AnchorListItem12());

      return f_DropDownMenu10;
    }

    /**
     * Getter for f_AnchorListItem11 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem11() {
      return build_f_AnchorListItem11();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem11 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem11.setText("Item 1");

      return f_AnchorListItem11;
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
      f_AnchorListItem12.setText("Item 2");

      return f_AnchorListItem12;
    }

    /**
     * Getter for f_ButtonGroup13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup13() {
      return build_f_ButtonGroup13();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup13 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup13.add(get_f_Button14());
      f_ButtonGroup13.add(get_f_DropDownMenu15());
      f_ButtonGroup13.addStyleName("" + get_style().spacing() + "");

      return f_ButtonGroup13;
    }

    /**
     * Getter for f_Button14 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button14() {
      return build_f_Button14();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button14 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button14.setText("Primary");
      f_Button14.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      f_Button14.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button14;
    }

    /**
     * Getter for f_DropDownMenu15 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu15() {
      return build_f_DropDownMenu15();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu15 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu15.add(get_f_AnchorListItem16());
      f_DropDownMenu15.add(get_f_AnchorListItem17());

      return f_DropDownMenu15;
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
      f_AnchorListItem16.setText("Item 1");

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
      f_AnchorListItem17.setText("Item 2");

      return f_AnchorListItem17;
    }

    /**
     * Getter for f_ButtonGroup18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup18() {
      return build_f_ButtonGroup18();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup18 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup18.add(get_f_Button19());
      f_ButtonGroup18.add(get_f_DropDownMenu20());
      f_ButtonGroup18.addStyleName("" + get_style().spacing() + "");

      return f_ButtonGroup18;
    }

    /**
     * Getter for f_Button19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button19() {
      return build_f_Button19();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button19 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button19.setText("Success");
      f_Button19.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      f_Button19.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.SUCCESS);

      return f_Button19;
    }

    /**
     * Getter for f_DropDownMenu20 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu20() {
      return build_f_DropDownMenu20();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu20 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu20.add(get_f_AnchorListItem21());
      f_DropDownMenu20.add(get_f_AnchorListItem22());

      return f_DropDownMenu20;
    }

    /**
     * Getter for f_AnchorListItem21 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem21() {
      return build_f_AnchorListItem21();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem21 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem21.setText("Item 1");

      return f_AnchorListItem21;
    }

    /**
     * Getter for f_AnchorListItem22 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem22() {
      return build_f_AnchorListItem22();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem22 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem22.setText("Item 2");

      return f_AnchorListItem22;
    }

    /**
     * Getter for f_ButtonGroup23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup23() {
      return build_f_ButtonGroup23();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup23 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup23.add(get_f_Button24());
      f_ButtonGroup23.add(get_f_DropDownMenu25());
      f_ButtonGroup23.addStyleName("" + get_style().spacing() + "");

      return f_ButtonGroup23;
    }

    /**
     * Getter for f_Button24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button24() {
      return build_f_Button24();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button24 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button24.setText("Info");
      f_Button24.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      f_Button24.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.INFO);

      return f_Button24;
    }

    /**
     * Getter for f_DropDownMenu25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu25() {
      return build_f_DropDownMenu25();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu25 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu25.add(get_f_AnchorListItem26());
      f_DropDownMenu25.add(get_f_AnchorListItem27());

      return f_DropDownMenu25;
    }

    /**
     * Getter for f_AnchorListItem26 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem26() {
      return build_f_AnchorListItem26();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem26 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem26.setText("Item 1");

      return f_AnchorListItem26;
    }

    /**
     * Getter for f_AnchorListItem27 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem27() {
      return build_f_AnchorListItem27();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem27 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem27.setText("Item 2");

      return f_AnchorListItem27;
    }

    /**
     * Getter for f_ButtonGroup28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup28() {
      return build_f_ButtonGroup28();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup28 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup28.add(get_f_Button29());
      f_ButtonGroup28.add(get_f_DropDownMenu30());
      f_ButtonGroup28.addStyleName("" + get_style().spacing() + "");

      return f_ButtonGroup28;
    }

    /**
     * Getter for f_Button29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button29() {
      return build_f_Button29();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button29 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button29.setText("Warning");
      f_Button29.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      f_Button29.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.WARNING);

      return f_Button29;
    }

    /**
     * Getter for f_DropDownMenu30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu30() {
      return build_f_DropDownMenu30();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu30 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu30.add(get_f_AnchorListItem31());
      f_DropDownMenu30.add(get_f_AnchorListItem32());

      return f_DropDownMenu30;
    }

    /**
     * Getter for f_AnchorListItem31 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem31() {
      return build_f_AnchorListItem31();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem31 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem31.setText("Item 1");

      return f_AnchorListItem31;
    }

    /**
     * Getter for f_AnchorListItem32 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem32() {
      return build_f_AnchorListItem32();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem32 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem32.setText("Item 2");

      return f_AnchorListItem32;
    }

    /**
     * Getter for f_ButtonGroup33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup33() {
      return build_f_ButtonGroup33();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup33 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup33.add(get_f_Button34());
      f_ButtonGroup33.add(get_f_DropDownMenu35());
      f_ButtonGroup33.addStyleName("" + get_style().spacing() + "");

      return f_ButtonGroup33;
    }

    /**
     * Getter for f_Button34 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button34() {
      return build_f_Button34();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button34 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button34.setText("Danger");
      f_Button34.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);
      f_Button34.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);

      return f_Button34;
    }

    /**
     * Getter for f_DropDownMenu35 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu35() {
      return build_f_DropDownMenu35();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu35 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu35.add(get_f_AnchorListItem36());
      f_DropDownMenu35.add(get_f_AnchorListItem37());

      return f_DropDownMenu35;
    }

    /**
     * Getter for f_AnchorListItem36 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem36() {
      return build_f_AnchorListItem36();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem36 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem36.setText("Item 1");

      return f_AnchorListItem36;
    }

    /**
     * Getter for f_AnchorListItem37 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem37() {
      return build_f_AnchorListItem37();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem37 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem37.setText("Item 2");

      return f_AnchorListItem37;
    }

    /**
     * Getter for f_PanelFooter38 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter38() {
      return build_f_PanelFooter38();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter38 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter38.add(get_f_PrettyPre39());

      return f_PanelFooter38;
    }

    /**
     * Getter for f_PrettyPre39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre39() {
      return build_f_PrettyPre39();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre39() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre39 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre39.setHTML(template_html1().asString());
      f_PrettyPre39.addStyleName("lang-xml");

      return f_PrettyPre39;
    }

    /**
     * Getter for f_Panel40 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel40() {
      return build_f_Panel40();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel40 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel40.add(get_f_PanelHeader41());
      f_Panel40.add(get_f_PanelBody43());
      f_Panel40.add(get_f_PanelFooter51());

      return f_Panel40;
    }

    /**
     * Getter for f_PanelHeader41 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader41() {
      return build_f_PanelHeader41();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader41 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader41.add(get_f_Heading42());

      return f_PanelHeader41;
    }

    /**
     * Getter for f_Heading42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading42() {
      return build_f_Heading42();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading42 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading42.setText("Split");

      return f_Heading42;
    }

    /**
     * Getter for f_PanelBody43 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody43() {
      return build_f_PanelBody43();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody43 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody43.add(get_f_ButtonGroup44());

      return f_PanelBody43;
    }

    /**
     * Getter for f_ButtonGroup44 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup44() {
      return build_f_ButtonGroup44();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup44 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup44.add(get_f_Button45());
      f_ButtonGroup44.add(get_f_Button46());
      f_ButtonGroup44.add(get_f_DropDownMenu47());
      f_ButtonGroup44.addStyleName("" + get_style().spacing() + "");

      return f_ButtonGroup44;
    }

    /**
     * Getter for f_Button45 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button45() {
      return build_f_Button45();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button45 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button45.setText("Split Dropdown");

      return f_Button45;
    }

    /**
     * Getter for f_Button46 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button46() {
      return build_f_Button46();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button46 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button46.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_Button46;
    }

    /**
     * Getter for f_DropDownMenu47 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu47() {
      return build_f_DropDownMenu47();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu47 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu47.add(get_f_AnchorListItem48());
      f_DropDownMenu47.add(get_f_AnchorListItem49());
      f_DropDownMenu47.add(get_f_AnchorListItem50());

      return f_DropDownMenu47;
    }

    /**
     * Getter for f_AnchorListItem48 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem48() {
      return build_f_AnchorListItem48();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem48 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem48.setText("Item 1");

      return f_AnchorListItem48;
    }

    /**
     * Getter for f_AnchorListItem49 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem49() {
      return build_f_AnchorListItem49();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem49 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem49.setText("Item 2");

      return f_AnchorListItem49;
    }

    /**
     * Getter for f_AnchorListItem50 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem50() {
      return build_f_AnchorListItem50();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem50 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem50.setText("Item 3");

      return f_AnchorListItem50;
    }

    /**
     * Getter for f_PanelFooter51 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter51() {
      return build_f_PanelFooter51();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter51 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter51.add(get_f_PrettyPre52());

      return f_PanelFooter51;
    }

    /**
     * Getter for f_PrettyPre52 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre52() {
      return build_f_PrettyPre52();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre52() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre52 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre52.setHTML(template_html2().asString());
      f_PrettyPre52.addStyleName("lang-xml");

      return f_PrettyPre52;
    }

    /**
     * Getter for f_Panel53 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel53() {
      return build_f_Panel53();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel53 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel53.add(get_f_PanelHeader54());
      f_Panel53.add(get_f_PanelBody56());
      f_Panel53.add(get_f_PanelFooter63());

      return f_Panel53;
    }

    /**
     * Getter for f_PanelHeader54 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader54() {
      return build_f_PanelHeader54();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader54 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader54.add(get_f_Heading55());

      return f_PanelHeader54;
    }

    /**
     * Getter for f_Heading55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading55() {
      return build_f_Heading55();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading55 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading55.setText("Dropup");

      return f_Heading55;
    }

    /**
     * Getter for f_PanelBody56 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody56() {
      return build_f_PanelBody56();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody56 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody56.add(get_f_ButtonGroup57());

      return f_PanelBody56;
    }

    /**
     * Getter for f_ButtonGroup57 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ButtonGroup get_f_ButtonGroup57() {
      return build_f_ButtonGroup57();
    }
    private org.gwtbootstrap3.client.ui.ButtonGroup build_f_ButtonGroup57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ButtonGroup f_ButtonGroup57 = new org.gwtbootstrap3.client.ui.ButtonGroup();
      // Setup section.
      f_ButtonGroup57.add(get_f_Button58());
      f_ButtonGroup57.add(get_f_DropDownMenu59());
      f_ButtonGroup57.addStyleName("" + get_style().spacing() + "");
      f_ButtonGroup57.setDropUp(true);

      return f_ButtonGroup57;
    }

    /**
     * Getter for f_Button58 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button58() {
      return build_f_Button58();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button58 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button58.setText("Dropup");
      f_Button58.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_Button58;
    }

    /**
     * Getter for f_DropDownMenu59 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu59() {
      return build_f_DropDownMenu59();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu59 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu59.add(get_f_AnchorListItem60());
      f_DropDownMenu59.add(get_f_AnchorListItem61());
      f_DropDownMenu59.add(get_f_AnchorListItem62());

      return f_DropDownMenu59;
    }

    /**
     * Getter for f_AnchorListItem60 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem60() {
      return build_f_AnchorListItem60();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem60 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem60.setText("Item 1");

      return f_AnchorListItem60;
    }

    /**
     * Getter for f_AnchorListItem61 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem61() {
      return build_f_AnchorListItem61();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem61 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem61.setText("Item 2");

      return f_AnchorListItem61;
    }

    /**
     * Getter for f_AnchorListItem62 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem62() {
      return build_f_AnchorListItem62();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem62 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem62.setText("Item 3");

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
      f_PrettyPre64.setHTML(template_html3().asString());
      f_PrettyPre64.addStyleName("lang-xml");

      return f_PrettyPre64;
    }
  }
}
