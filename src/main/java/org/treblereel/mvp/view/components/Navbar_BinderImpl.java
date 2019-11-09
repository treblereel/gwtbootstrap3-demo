// Template file: org/treblereel/mvp/view/components/Navbar.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.578")
public class Navbar_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Navbar>, org.treblereel.mvp.view.components.Navbar.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Brand")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("John Snow")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Signed in as <span id='{0}'></span>")
    org.gwtproject.safehtml.shared.SafeHtml html3(String arg0);
     
    @Template("&lt;b:Navbar&gt;\\n \\s\\s&lt;b:NavbarHeader&gt;\\n \\s\\s\\s\\s&lt;b:NavbarBrand&gt;Brand&lt;/b:NavbarBrand&gt;\\n \\s\\s\\s\\s&lt;b:NavbarCollapseButton dataTarget=\"#navbar-collapse\"/&gt;\\n \\s\\s&lt;/b:NavbarHeader&gt;\\n \\n \\s\\s&lt;b:NavbarCollapse b:id=\"navbar-collapse\"&gt;\\n \\s\\s\\s\\s&lt;b:NavbarNav&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem active=\"true\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n \\n \\s\\s\\s\\s\\s\\s&lt;b:ListDropDown&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorButton dataToggle=\"DROPDOWN\"&gt;Dropdown&lt;/b:AnchorButton&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 3&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;/b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:ListDropDown&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarNav&gt;\\n \\n \\s\\s\\s\\s&lt;b:NavbarForm pull=\"LEFT\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox placeholder=\"Search\" addStyleNames=\"col-lg-8\"/&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarForm&gt;\\n \\n \\s\\s\\s\\s&lt;b:NavbarText pull=\"RIGHT\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b.html:Span&gt;Signed in as\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:NavbarLink&gt;John Snow&lt;/b:NavbarLink&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b.html:Span&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarText&gt;\\n \\s\\s&lt;/b:NavbarCollapse&gt;\\n &lt;/b:Navbar&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
  }

  Template template = new Navbar_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Navbar owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Navbar owner;


    public Widgets(final org.treblereel.mvp.view.components.Navbar owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 9
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 9
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html2() {
      return template.html2();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html3() {
      return template.html3(get_domId0());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html4() {
      return template.html4();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Navbar_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Navbar_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Navbar_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Navbar_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Navbar_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private org.treblereel.mvp.view.components.Navbar_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final org.treblereel.mvp.view.components.Navbar_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_PageHeader3.setText("Navbar");

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
      f_Panel4.add(get_f_PanelFooter28());

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
      f_PanelBody7.add(get_f_Navbar8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Navbar8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Navbar get_f_Navbar8() {
      return build_f_Navbar8();
    }
    private org.gwtbootstrap3.client.ui.Navbar build_f_Navbar8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Navbar f_Navbar8 = new org.gwtbootstrap3.client.ui.Navbar();
      // Setup section.
      f_Navbar8.add(get_f_NavbarHeader9());
      f_Navbar8.add(get_f_NavbarCollapse12());
      f_Navbar8.addStyleName("" + get_style().marginFix() + "");

      return f_Navbar8;
    }

    /**
     * Getter for f_NavbarHeader9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarHeader get_f_NavbarHeader9() {
      return build_f_NavbarHeader9();
    }
    private org.gwtbootstrap3.client.ui.NavbarHeader build_f_NavbarHeader9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarHeader f_NavbarHeader9 = new org.gwtbootstrap3.client.ui.NavbarHeader();
      // Setup section.
      f_NavbarHeader9.add(get_f_NavbarBrand10());
      f_NavbarHeader9.add(get_f_NavbarCollapseButton11());

      return f_NavbarHeader9;
    }

    /**
     * Getter for f_NavbarBrand10 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_f_NavbarBrand10() {
      return build_f_NavbarBrand10();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_f_NavbarBrand10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand f_NavbarBrand10 = new org.gwtbootstrap3.client.ui.NavbarBrand();
      // Setup section.
      f_NavbarBrand10.setHTML(template_html1().asString());

      return f_NavbarBrand10;
    }

    /**
     * Getter for f_NavbarCollapseButton11 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton get_f_NavbarCollapseButton11() {
      return build_f_NavbarCollapseButton11();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton build_f_NavbarCollapseButton11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapseButton f_NavbarCollapseButton11 = new org.gwtbootstrap3.client.ui.NavbarCollapseButton();
      // Setup section.
      f_NavbarCollapseButton11.setDataTarget("#navbar-collapse2");

      return f_NavbarCollapseButton11;
    }

    /**
     * Getter for f_NavbarCollapse12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapse get_f_NavbarCollapse12() {
      return build_f_NavbarCollapse12();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapse build_f_NavbarCollapse12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapse f_NavbarCollapse12 = new org.gwtbootstrap3.client.ui.NavbarCollapse();
      // Setup section.
      f_NavbarCollapse12.add(get_f_NavbarNav13());
      f_NavbarCollapse12.add(get_f_NavbarForm23());
      f_NavbarCollapse12.add(get_f_NavbarText25());
      f_NavbarCollapse12.setId("navbar-collapse2");

      return f_NavbarCollapse12;
    }

    /**
     * Getter for f_NavbarNav13 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.NavbarNav get_f_NavbarNav13() {
      return build_f_NavbarNav13();
    }
    private org.gwtbootstrap3.client.ui.NavbarNav build_f_NavbarNav13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarNav f_NavbarNav13 = new org.gwtbootstrap3.client.ui.NavbarNav();
      // Setup section.
      f_NavbarNav13.add(get_f_AnchorListItem14());
      f_NavbarNav13.add(get_f_AnchorListItem15());
      f_NavbarNav13.add(get_f_AnchorListItem16());
      f_NavbarNav13.add(get_f_ListDropDown17());

      return f_NavbarNav13;
    }

    /**
     * Getter for f_AnchorListItem14 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem14() {
      return build_f_AnchorListItem14();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem14 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem14.setText("Item 1");
      f_AnchorListItem14.setActive(true);

      return f_AnchorListItem14;
    }

    /**
     * Getter for f_AnchorListItem15 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem15() {
      return build_f_AnchorListItem15();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem15 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem15.setText("Item 2");

      return f_AnchorListItem15;
    }

    /**
     * Getter for f_AnchorListItem16 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem16() {
      return build_f_AnchorListItem16();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem16 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem16.setText("Item 3");

      return f_AnchorListItem16;
    }

    /**
     * Getter for f_ListDropDown17 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown17() {
      return build_f_ListDropDown17();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown17 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown17.add(get_f_AnchorButton18());
      f_ListDropDown17.add(get_f_DropDownMenu19());

      return f_ListDropDown17;
    }

    /**
     * Getter for f_AnchorButton18 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton18() {
      return build_f_AnchorButton18();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton18 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton18.setText("Dropdown");
      f_AnchorButton18.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton18;
    }

    /**
     * Getter for f_DropDownMenu19 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu19() {
      return build_f_DropDownMenu19();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu19 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu19.add(get_f_AnchorListItem20());
      f_DropDownMenu19.add(get_f_AnchorListItem21());
      f_DropDownMenu19.add(get_f_AnchorListItem22());

      return f_DropDownMenu19;
    }

    /**
     * Getter for f_AnchorListItem20 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem20() {
      return build_f_AnchorListItem20();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem20 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem20.setText("Dropdown 1");

      return f_AnchorListItem20;
    }

    /**
     * Getter for f_AnchorListItem21 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem21() {
      return build_f_AnchorListItem21();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem21 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem21.setText("Dropdown 2");

      return f_AnchorListItem21;
    }

    /**
     * Getter for f_AnchorListItem22 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem22() {
      return build_f_AnchorListItem22();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem22 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem22.setText("Dropdown 3");

      return f_AnchorListItem22;
    }

    /**
     * Getter for f_NavbarForm23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.NavbarForm get_f_NavbarForm23() {
      return build_f_NavbarForm23();
    }
    private org.gwtbootstrap3.client.ui.NavbarForm build_f_NavbarForm23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarForm f_NavbarForm23 = new org.gwtbootstrap3.client.ui.NavbarForm();
      // Setup section.
      f_NavbarForm23.add(get_f_TextBox24());
      f_NavbarForm23.setPull(org.gwtbootstrap3.client.ui.constants.Pull.LEFT);

      return f_NavbarForm23;
    }

    /**
     * Getter for f_TextBox24 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox24() {
      return build_f_TextBox24();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox24 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox24.addStyleName("col-lg-8");
      f_TextBox24.setPlaceholder("Search");

      return f_TextBox24;
    }

    /**
     * Getter for f_NavbarText25 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.NavbarText get_f_NavbarText25() {
      return build_f_NavbarText25();
    }
    private org.gwtbootstrap3.client.ui.NavbarText build_f_NavbarText25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarText f_NavbarText25 = new org.gwtbootstrap3.client.ui.NavbarText();
      // Setup section.
      f_NavbarText25.add(get_f_Span26());
      f_NavbarText25.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);

      return f_NavbarText25;
    }

    /**
     * Getter for f_Span26 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span26() {
      return build_f_Span26();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span26 = new org.gwtbootstrap3.client.ui.html.Span(template_html3().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Span26.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Span26.addAndReplaceElement(get_f_NavbarLink27(), get_domId0Element().get());

      return f_Span26;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 9.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = org.gwtproject.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for f_NavbarLink27 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.NavbarLink get_f_NavbarLink27() {
      return build_f_NavbarLink27();
    }
    private org.gwtbootstrap3.client.ui.NavbarLink build_f_NavbarLink27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarLink f_NavbarLink27 = new org.gwtbootstrap3.client.ui.NavbarLink();
      // Setup section.
      f_NavbarLink27.setHTML(template_html2().asString());

      return f_NavbarLink27;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtproject.uibinder.client.LazyDomElement domId0Element;
    private org.gwtproject.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private org.gwtproject.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new org.gwtproject.uibinder.client.LazyDomElement<org.gwtproject.dom.client.Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for f_PanelFooter28 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter28() {
      return build_f_PanelFooter28();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter28 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter28.add(get_f_PrettyPre29());

      return f_PanelFooter28;
    }

    /**
     * Getter for f_PrettyPre29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre29() {
      return build_f_PrettyPre29();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre29() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre29 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre29.setHTML(template_html4().asString());
      f_PrettyPre29.addStyleName("lang-xml");

      return f_PrettyPre29;
    }
  }
}
