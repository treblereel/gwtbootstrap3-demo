// Template file: org/treblereel/MainMenu.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.379")
public class MainMenu_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.MainMenu>, org.treblereel.MainMenu.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("GwtBootstrap3 J2CL Port v1.0-SNAPSHOT")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
  }

  Template template = new MainMenu_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.MainMenu owner) {


    return new Widgets(owner).get_f_ScrollPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.MainMenu owner;


    public Widgets(final org.treblereel.MainMenu owner) {
      this.owner = owner;
      build_nameTokens();  // more than one getter call detected. Type: IMPORTED, precedence: 1
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.MainMenu_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.MainMenu_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.MainMenu_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.MainMenu_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for nameTokens called 52 times. Type: IMPORTED. Build precedence: 1.
     */
    private org.treblereel.place.NameTokens nameTokens;
    private org.treblereel.place.NameTokens get_nameTokens() {
      return nameTokens;
    }
    private org.treblereel.place.NameTokens build_nameTokens() {
      // Creation section.
      nameTokens = new org.treblereel.place.NameTokens();
      // Setup section.

      return nameTokens;
    }

    /**
     * Getter for f_ScrollPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtproject.user.client.ui.ScrollPanel get_f_ScrollPanel1() {
      return build_f_ScrollPanel1();
    }
    private org.gwtproject.user.client.ui.ScrollPanel build_f_ScrollPanel1() {
      // Creation section.
      final org.gwtproject.user.client.ui.ScrollPanel f_ScrollPanel1 = new org.gwtproject.user.client.ui.ScrollPanel();
      // Setup section.
      f_ScrollPanel1.add(get_f_Container2());

      return f_ScrollPanel1;
    }

    /**
     * Getter for f_Container2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container2() {
      return build_f_Container2();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container2 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container2.add(get_f_Navbar3());
      f_Container2.add(get_contentContainer());

      return f_Container2;
    }

    /**
     * Getter for f_Navbar3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Navbar get_f_Navbar3() {
      return build_f_Navbar3();
    }
    private org.gwtbootstrap3.client.ui.Navbar build_f_Navbar3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Navbar f_Navbar3 = new org.gwtbootstrap3.client.ui.Navbar();
      // Setup section.
      f_Navbar3.add(get_f_Container4());
      f_Navbar3.setPosition(org.gwtbootstrap3.client.ui.constants.NavbarPosition.FIXED_TOP);

      return f_Navbar3;
    }

    /**
     * Getter for f_Container4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container4() {
      return build_f_Container4();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container4 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container4.add(get_f_NavbarHeader5());
      f_Container4.add(get_navbarCollapse());

      return f_Container4;
    }

    /**
     * Getter for f_NavbarHeader5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarHeader get_f_NavbarHeader5() {
      return build_f_NavbarHeader5();
    }
    private org.gwtbootstrap3.client.ui.NavbarHeader build_f_NavbarHeader5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarHeader f_NavbarHeader5 = new org.gwtbootstrap3.client.ui.NavbarHeader();
      // Setup section.
      f_NavbarHeader5.add(get_brand());
      f_NavbarHeader5.add(get_f_NavbarCollapseButton6());

      return f_NavbarHeader5;
    }

    /**
     * Getter for brand called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarBrand get_brand() {
      return build_brand();
    }
    private org.gwtbootstrap3.client.ui.NavbarBrand build_brand() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarBrand brand = new org.gwtbootstrap3.client.ui.NavbarBrand();
      // Setup section.
      brand.setHTML(template_html1().asString());
      brand.setTargetHistoryToken("" + get_nameTokens().getHome() + "");

      return brand;
    }

    /**
     * Getter for f_NavbarCollapseButton6 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton get_f_NavbarCollapseButton6() {
      return build_f_NavbarCollapseButton6();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapseButton build_f_NavbarCollapseButton6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapseButton f_NavbarCollapseButton6 = new org.gwtbootstrap3.client.ui.NavbarCollapseButton();
      // Setup section.
      f_NavbarCollapseButton6.setDataTarget("#navbar-collapse");

      return f_NavbarCollapseButton6;
    }

    /**
     * Getter for navbarCollapse called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavbarCollapse get_navbarCollapse() {
      return build_navbarCollapse();
    }
    private org.gwtbootstrap3.client.ui.NavbarCollapse build_navbarCollapse() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarCollapse navbarCollapse = new org.gwtbootstrap3.client.ui.NavbarCollapse();
      // Setup section.
      navbarCollapse.add(get_f_NavbarNav7());
      navbarCollapse.setId("navbar-collapse");

      this.owner.navbarCollapse = navbarCollapse;

      return navbarCollapse;
    }

    /**
     * Getter for f_NavbarNav7 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.NavbarNav get_f_NavbarNav7() {
      return build_f_NavbarNav7();
    }
    private org.gwtbootstrap3.client.ui.NavbarNav build_f_NavbarNav7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavbarNav f_NavbarNav7 = new org.gwtbootstrap3.client.ui.NavbarNav();
      // Setup section.
      f_NavbarNav7.add(get_f_AnchorListItem8());
      f_NavbarNav7.add(get_f_ListDropDown9());
      f_NavbarNav7.add(get_f_ListDropDown20());
      f_NavbarNav7.add(get_f_ListDropDown44());
      f_NavbarNav7.add(get_f_ListDropDown53());
      f_NavbarNav7.add(get_f_ListDropDown71());
      f_NavbarNav7.add(get_f_AnchorListItem76());

      return f_NavbarNav7;
    }

    /**
     * Getter for f_AnchorListItem8 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem8() {
      return build_f_AnchorListItem8();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem8 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem8.setTargetHistoryToken("" + get_nameTokens().getSetup() + "");
      f_AnchorListItem8.setText("Setup");

      return f_AnchorListItem8;
    }

    /**
     * Getter for f_ListDropDown9 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown9() {
      return build_f_ListDropDown9();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown9 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown9.add(get_f_AnchorButton10());
      f_ListDropDown9.add(get_f_DropDownMenu11());

      return f_ListDropDown9;
    }

    /**
     * Getter for f_AnchorButton10 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton10() {
      return build_f_AnchorButton10();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton10 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton10.setText("CSS");
      f_AnchorButton10.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton10;
    }

    /**
     * Getter for f_DropDownMenu11 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu11() {
      return build_f_DropDownMenu11();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu11 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu11.add(get_f_AnchorListItem12());
      f_DropDownMenu11.add(get_f_AnchorListItem13());
      f_DropDownMenu11.add(get_f_AnchorListItem14());
      f_DropDownMenu11.add(get_f_AnchorListItem15());
      f_DropDownMenu11.add(get_f_AnchorListItem16());
      f_DropDownMenu11.add(get_f_AnchorListItem17());
      f_DropDownMenu11.add(get_f_AnchorListItem18());
      f_DropDownMenu11.add(get_f_AnchorListItem19());

      return f_DropDownMenu11;
    }

    /**
     * Getter for f_AnchorListItem12 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem12() {
      return build_f_AnchorListItem12();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem12 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem12.setText("Buttons");
      f_AnchorListItem12.setTargetHistoryToken("" + get_nameTokens().getButtons() + "");

      return f_AnchorListItem12;
    }

    /**
     * Getter for f_AnchorListItem13 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem13() {
      return build_f_AnchorListItem13();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem13 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem13.setText("Code");
      f_AnchorListItem13.setTargetHistoryToken("" + get_nameTokens().getCode() + "");

      return f_AnchorListItem13;
    }

    /**
     * Getter for f_AnchorListItem14 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem14() {
      return build_f_AnchorListItem14();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem14 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem14.setText("Forms");
      f_AnchorListItem14.setTargetHistoryToken("" + get_nameTokens().getForms() + "");

      return f_AnchorListItem14;
    }

    /**
     * Getter for f_AnchorListItem15 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem15() {
      return build_f_AnchorListItem15();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem15 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem15.setText("Grid System");
      f_AnchorListItem15.setTargetHistoryToken("" + get_nameTokens().getGridSystem() + "");

      return f_AnchorListItem15;
    }

    /**
     * Getter for f_AnchorListItem16 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem16() {
      return build_f_AnchorListItem16();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem16 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem16.setText("Images");
      f_AnchorListItem16.setTargetHistoryToken("" + get_nameTokens().getImages() + "");

      return f_AnchorListItem16;
    }

    /**
     * Getter for f_AnchorListItem17 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem17() {
      return build_f_AnchorListItem17();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem17 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem17.setText("Responsive Utilities");
      f_AnchorListItem17.setTargetHistoryToken("" + get_nameTokens().getResponsiveUtilities() + "");

      return f_AnchorListItem17;
    }

    /**
     * Getter for f_AnchorListItem18 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem18() {
      return build_f_AnchorListItem18();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem18 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem18.setText("Tables");
      f_AnchorListItem18.setTargetHistoryToken("" + get_nameTokens().getTables() + "");

      return f_AnchorListItem18;
    }

    /**
     * Getter for f_AnchorListItem19 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem19() {
      return build_f_AnchorListItem19();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem19 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem19.setText("Typography");
      f_AnchorListItem19.setTargetHistoryToken("" + get_nameTokens().getTypography() + "");

      return f_AnchorListItem19;
    }

    /**
     * Getter for f_ListDropDown20 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown20() {
      return build_f_ListDropDown20();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown20 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown20.add(get_f_AnchorButton21());
      f_ListDropDown20.add(get_f_DropDownMenu22());

      return f_ListDropDown20;
    }

    /**
     * Getter for f_AnchorButton21 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton21() {
      return build_f_AnchorButton21();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton21 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton21.setText("Components");
      f_AnchorButton21.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton21;
    }

    /**
     * Getter for f_DropDownMenu22 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu22() {
      return build_f_DropDownMenu22();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu22 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu22.add(get_f_AnchorListItem23());
      f_DropDownMenu22.add(get_f_AnchorListItem24());
      f_DropDownMenu22.add(get_f_AnchorListItem25());
      f_DropDownMenu22.add(get_f_AnchorListItem26());
      f_DropDownMenu22.add(get_f_AnchorListItem27());
      f_DropDownMenu22.add(get_f_AnchorListItem28());
      f_DropDownMenu22.add(get_f_AnchorListItem29());
      f_DropDownMenu22.add(get_f_AnchorListItem30());
      f_DropDownMenu22.add(get_f_AnchorListItem31());
      f_DropDownMenu22.add(get_f_AnchorListItem32());
      f_DropDownMenu22.add(get_f_AnchorListItem33());
      f_DropDownMenu22.add(get_f_AnchorListItem34());
      f_DropDownMenu22.add(get_f_AnchorListItem35());
      f_DropDownMenu22.add(get_f_AnchorListItem36());
      f_DropDownMenu22.add(get_f_AnchorListItem37());
      f_DropDownMenu22.add(get_f_AnchorListItem38());
      f_DropDownMenu22.add(get_f_AnchorListItem39());
      f_DropDownMenu22.add(get_f_AnchorListItem40());
      f_DropDownMenu22.add(get_f_AnchorListItem41());
      f_DropDownMenu22.add(get_f_AnchorListItem42());
      f_DropDownMenu22.add(get_f_AnchorListItem43());

      return f_DropDownMenu22;
    }

    /**
     * Getter for f_AnchorListItem23 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem23() {
      return build_f_AnchorListItem23();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem23 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem23.setText("Alerts");
      f_AnchorListItem23.setTargetHistoryToken("" + get_nameTokens().getAlerts() + "");

      return f_AnchorListItem23;
    }

    /**
     * Getter for f_AnchorListItem24 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem24() {
      return build_f_AnchorListItem24();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem24 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem24.setText("Badges");
      f_AnchorListItem24.setTargetHistoryToken("" + get_nameTokens().getBadges() + "");

      return f_AnchorListItem24;
    }

    /**
     * Getter for f_AnchorListItem25 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem25() {
      return build_f_AnchorListItem25();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem25 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem25.setText("Breadcrumbs");
      f_AnchorListItem25.setTargetHistoryToken("" + get_nameTokens().getBreadcrumbs() + "");

      return f_AnchorListItem25;
    }

    /**
     * Getter for f_AnchorListItem26 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem26() {
      return build_f_AnchorListItem26();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem26 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem26.setText("Button Dropdowns");
      f_AnchorListItem26.setTargetHistoryToken("" + get_nameTokens().getButtonDropdowns() + "");

      return f_AnchorListItem26;
    }

    /**
     * Getter for f_AnchorListItem27 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem27() {
      return build_f_AnchorListItem27();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem27 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem27.setText("Button Groups");
      f_AnchorListItem27.setTargetHistoryToken("" + get_nameTokens().getButtonGroups() + "");

      return f_AnchorListItem27;
    }

    /**
     * Getter for f_AnchorListItem28 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem28() {
      return build_f_AnchorListItem28();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem28 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem28.setText("Dropdowns");
      f_AnchorListItem28.setTargetHistoryToken("" + get_nameTokens().getDropdowns() + "");

      return f_AnchorListItem28;
    }

    /**
     * Getter for f_AnchorListItem29 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem29() {
      return build_f_AnchorListItem29();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem29 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem29.setText("Icons");
      f_AnchorListItem29.setTargetHistoryToken("" + get_nameTokens().getIcons() + "");

      return f_AnchorListItem29;
    }

    /**
     * Getter for f_AnchorListItem30 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem30() {
      return build_f_AnchorListItem30();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem30 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem30.setText("Input Groups");
      f_AnchorListItem30.setTargetHistoryToken("" + get_nameTokens().getInputGroups() + "");

      return f_AnchorListItem30;
    }

    /**
     * Getter for f_AnchorListItem31 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem31() {
      return build_f_AnchorListItem31();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem31 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem31.setText("Jumbotron");
      f_AnchorListItem31.setTargetHistoryToken("" + get_nameTokens().getJumbotron() + "");

      return f_AnchorListItem31;
    }

    /**
     * Getter for f_AnchorListItem32 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem32() {
      return build_f_AnchorListItem32();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem32 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem32.setText("Labels");
      f_AnchorListItem32.setTargetHistoryToken("" + get_nameTokens().getLabels() + "");

      return f_AnchorListItem32;
    }

    /**
     * Getter for f_AnchorListItem33 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem33() {
      return build_f_AnchorListItem33();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem33 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem33.setText("List Group");
      f_AnchorListItem33.setTargetHistoryToken("" + get_nameTokens().getListGroup() + "");

      return f_AnchorListItem33;
    }

    /**
     * Getter for f_AnchorListItem34 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem34() {
      return build_f_AnchorListItem34();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem34 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem34.setText("Media Objects");
      f_AnchorListItem34.setTargetHistoryToken("" + get_nameTokens().getMediaObjects() + "");

      return f_AnchorListItem34;
    }

    /**
     * Getter for f_AnchorListItem35 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem35() {
      return build_f_AnchorListItem35();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem35 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem35.setText("Navbar");
      f_AnchorListItem35.setTargetHistoryToken("" + get_nameTokens().getNavbar() + "");

      return f_AnchorListItem35;
    }

    /**
     * Getter for f_AnchorListItem36 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem36() {
      return build_f_AnchorListItem36();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem36 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem36.setText("Navs");
      f_AnchorListItem36.setTargetHistoryToken("" + get_nameTokens().getNavs() + "");

      return f_AnchorListItem36;
    }

    /**
     * Getter for f_AnchorListItem37 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem37() {
      return build_f_AnchorListItem37();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem37 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem37.setText("Page Header");
      f_AnchorListItem37.setTargetHistoryToken("" + get_nameTokens().getPageHeader() + "");

      return f_AnchorListItem37;
    }

    /**
     * Getter for f_AnchorListItem38 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem38() {
      return build_f_AnchorListItem38();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem38 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem38.setText("Pagination");
      f_AnchorListItem38.setTargetHistoryToken("" + get_nameTokens().getPagination() + "");

      return f_AnchorListItem38;
    }

    /**
     * Getter for f_AnchorListItem39 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem39() {
      return build_f_AnchorListItem39();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem39 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem39.setText("Panels");
      f_AnchorListItem39.setTargetHistoryToken("" + get_nameTokens().getPanels() + "");

      return f_AnchorListItem39;
    }

    /**
     * Getter for f_AnchorListItem40 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem40() {
      return build_f_AnchorListItem40();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem40 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem40.setText("Progress Bars");
      f_AnchorListItem40.setTargetHistoryToken("" + get_nameTokens().getProgressBars() + "");

      return f_AnchorListItem40;
    }

    /**
     * Getter for f_AnchorListItem41 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem41() {
      return build_f_AnchorListItem41();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem41 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem41.setText("SuggestBox");
      f_AnchorListItem41.setTargetHistoryToken("" + get_nameTokens().getSuggestBox() + "");

      return f_AnchorListItem41;
    }

    /**
     * Getter for f_AnchorListItem42 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem42() {
      return build_f_AnchorListItem42();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem42 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem42.setText("Thumbnails");
      f_AnchorListItem42.setTargetHistoryToken("" + get_nameTokens().getThumbnails() + "");

      return f_AnchorListItem42;
    }

    /**
     * Getter for f_AnchorListItem43 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem43() {
      return build_f_AnchorListItem43();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem43 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem43.setText("Wells");
      f_AnchorListItem43.setTargetHistoryToken("" + get_nameTokens().getWells() + "");

      return f_AnchorListItem43;
    }

    /**
     * Getter for f_ListDropDown44 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown44() {
      return build_f_ListDropDown44();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown44 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown44.add(get_f_AnchorButton45());
      f_ListDropDown44.add(get_f_DropDownMenu46());

      return f_ListDropDown44;
    }

    /**
     * Getter for f_AnchorButton45 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton45() {
      return build_f_AnchorButton45();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton45 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton45.setText("JavaScript");
      f_AnchorButton45.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton45;
    }

    /**
     * Getter for f_DropDownMenu46 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu46() {
      return build_f_DropDownMenu46();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu46 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu46.add(get_f_AnchorListItem47());
      f_DropDownMenu46.add(get_f_AnchorListItem48());
      f_DropDownMenu46.add(get_f_AnchorListItem49());
      f_DropDownMenu46.add(get_f_AnchorListItem50());
      f_DropDownMenu46.add(get_f_AnchorListItem51());
      f_DropDownMenu46.add(get_f_AnchorListItem52());

      return f_DropDownMenu46;
    }

    /**
     * Getter for f_AnchorListItem47 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem47() {
      return build_f_AnchorListItem47();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem47 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem47.setText("Carousel");
      f_AnchorListItem47.setTargetHistoryToken("" + get_nameTokens().getCarousel() + "");

      return f_AnchorListItem47;
    }

    /**
     * Getter for f_AnchorListItem48 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem48() {
      return build_f_AnchorListItem48();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem48 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem48.setText("Collapse");
      f_AnchorListItem48.setTargetHistoryToken("" + get_nameTokens().getCollapse() + "");

      return f_AnchorListItem48;
    }

    /**
     * Getter for f_AnchorListItem49 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem49() {
      return build_f_AnchorListItem49();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem49 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem49.setText("Modals");
      f_AnchorListItem49.setTargetHistoryToken("" + get_nameTokens().getModals() + "");

      return f_AnchorListItem49;
    }

    /**
     * Getter for f_AnchorListItem50 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem50() {
      return build_f_AnchorListItem50();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem50 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem50.setText("Popover");
      f_AnchorListItem50.setTargetHistoryToken("" + get_nameTokens().getPopover() + "");

      return f_AnchorListItem50;
    }

    /**
     * Getter for f_AnchorListItem51 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem51() {
      return build_f_AnchorListItem51();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem51 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem51.setText("Tabs");
      f_AnchorListItem51.setTargetHistoryToken("" + get_nameTokens().getTabs() + "");

      return f_AnchorListItem51;
    }

    /**
     * Getter for f_AnchorListItem52 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem52() {
      return build_f_AnchorListItem52();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem52 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem52.setText("Tooltips");
      f_AnchorListItem52.setTargetHistoryToken("" + get_nameTokens().getTooltips() + "");

      return f_AnchorListItem52;
    }

    /**
     * Getter for f_ListDropDown53 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown53() {
      return build_f_ListDropDown53();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown53 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown53.add(get_f_AnchorButton54());
      f_ListDropDown53.add(get_f_DropDownMenu55());

      return f_ListDropDown53;
    }

    /**
     * Getter for f_AnchorButton54 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton54() {
      return build_f_AnchorButton54();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton54 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton54.setText("Extras");
      f_AnchorButton54.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton54;
    }

    /**
     * Getter for f_DropDownMenu55 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu55() {
      return build_f_DropDownMenu55();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu55 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu55.add(get_f_AnchorListItem56());
      f_DropDownMenu55.add(get_f_AnchorListItem57());
      f_DropDownMenu55.add(get_f_AnchorListItem58());
      f_DropDownMenu55.add(get_f_AnchorListItem59());
      f_DropDownMenu55.add(get_f_AnchorListItem60());
      f_DropDownMenu55.add(get_f_AnchorListItem61());
      f_DropDownMenu55.add(get_f_AnchorListItem62());
      f_DropDownMenu55.add(get_f_AnchorListItem63());
      f_DropDownMenu55.add(get_f_AnchorListItem64());
      f_DropDownMenu55.add(get_f_AnchorListItem65());
      f_DropDownMenu55.add(get_f_AnchorListItem66());
      f_DropDownMenu55.add(get_f_AnchorListItem67());
      f_DropDownMenu55.add(get_f_AnchorListItem68());
      f_DropDownMenu55.add(get_f_AnchorListItem69());
      f_DropDownMenu55.add(get_f_AnchorListItem70());

      return f_DropDownMenu55;
    }

    /**
     * Getter for f_AnchorListItem56 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem56() {
      return build_f_AnchorListItem56();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem56 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem56.setText("Animate");
      f_AnchorListItem56.setTargetHistoryToken("" + get_nameTokens().getAnimate() + "");

      return f_AnchorListItem56;
    }

    /**
     * Getter for f_AnchorListItem57 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem57() {
      return build_f_AnchorListItem57();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem57 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem57.setText("Bootbox");
      f_AnchorListItem57.setTargetHistoryToken("" + get_nameTokens().getBootbox() + "");

      return f_AnchorListItem57;
    }

    /**
     * Getter for f_AnchorListItem58 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem58() {
      return build_f_AnchorListItem58();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem58 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem58.setText("Cards");
      f_AnchorListItem58.setTargetHistoryToken("" + get_nameTokens().getCard() + "");

      return f_AnchorListItem58;
    }

    /**
     * Getter for f_AnchorListItem59 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem59() {
      return build_f_AnchorListItem59();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem59 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem59.setText("DatePicker");
      f_AnchorListItem59.setTargetHistoryToken("" + get_nameTokens().getDatePicker() + "");

      return f_AnchorListItem59;
    }

    /**
     * Getter for f_AnchorListItem60 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem60() {
      return build_f_AnchorListItem60();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem60 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem60.setText("DateTimePicker");
      f_AnchorListItem60.setTargetHistoryToken("" + get_nameTokens().getDatetimePicker() + "");

      return f_AnchorListItem60;
    }

    /**
     * Getter for f_AnchorListItem61 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem61() {
      return build_f_AnchorListItem61();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem61 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem61.setText("FullCalendar");
      f_AnchorListItem61.setTargetHistoryToken("" + get_nameTokens().getFullCalendar() + "");

      return f_AnchorListItem61;
    }

    /**
     * Getter for f_AnchorListItem62 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem62() {
      return build_f_AnchorListItem62();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem62 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem62.setText("Gallery");
      f_AnchorListItem62.setTargetHistoryToken("" + get_nameTokens().getGallery() + "");

      return f_AnchorListItem62;
    }

    /**
     * Getter for f_AnchorListItem63 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem63() {
      return build_f_AnchorListItem63();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem63 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem63.setText("InputTags");
      f_AnchorListItem63.setTargetHistoryToken("" + get_nameTokens().getTagsInput() + "");

      return f_AnchorListItem63;
    }

    /**
     * Getter for f_AnchorListItem64 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem64() {
      return build_f_AnchorListItem64();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem64 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem64.setText("Notify");
      f_AnchorListItem64.setTargetHistoryToken("" + get_nameTokens().getNotify() + "");

      return f_AnchorListItem64;
    }

    /**
     * Getter for f_AnchorListItem65 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem65() {
      return build_f_AnchorListItem65();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem65 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem65.setText("Select");
      f_AnchorListItem65.setTargetHistoryToken("" + get_nameTokens().getSelect() + "");

      return f_AnchorListItem65;
    }

    /**
     * Getter for f_AnchorListItem66 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem66() {
      return build_f_AnchorListItem66();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem66 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem66.setText("Slider");
      f_AnchorListItem66.setTargetHistoryToken("" + get_nameTokens().getSlider() + "");

      return f_AnchorListItem66;
    }

    /**
     * Getter for f_AnchorListItem67 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem67() {
      return build_f_AnchorListItem67();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem67 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem67.setText("Summernote");
      f_AnchorListItem67.setTargetHistoryToken("" + get_nameTokens().getSummernote() + "");

      return f_AnchorListItem67;
    }

    /**
     * Getter for f_AnchorListItem68 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem68() {
      return build_f_AnchorListItem68();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem68 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem68.setText("ToggleSwitch");
      f_AnchorListItem68.setTargetHistoryToken("" + get_nameTokens().getToggleSwitch() + "");

      return f_AnchorListItem68;
    }

    /**
     * Getter for f_AnchorListItem69 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem69() {
      return build_f_AnchorListItem69();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem69 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem69.setText("Typeahead");
      f_AnchorListItem69.setTargetHistoryToken("" + get_nameTokens().getTypeahead() + "");

      return f_AnchorListItem69;
    }

    /**
     * Getter for f_AnchorListItem70 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem70() {
      return build_f_AnchorListItem70();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem70 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem70.setText("Offline");
      f_AnchorListItem70.setTargetHistoryToken("" + get_nameTokens().getOffline() + "");

      return f_AnchorListItem70;
    }

    /**
     * Getter for f_ListDropDown71 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown71() {
      return build_f_ListDropDown71();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown71 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown71.add(get_f_AnchorButton72());
      f_ListDropDown71.add(get_f_DropDownMenu73());

      return f_ListDropDown71;
    }

    /**
     * Getter for f_AnchorButton72 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton72() {
      return build_f_AnchorButton72();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton72 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton72.setText("View Javadoc");
      f_AnchorButton72.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton72;
    }

    /**
     * Getter for f_DropDownMenu73 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu73() {
      return build_f_DropDownMenu73();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu73 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu73.add(get_f_AnchorListItem74());
      f_DropDownMenu73.add(get_f_AnchorListItem75());

      return f_DropDownMenu73;
    }

    /**
     * Getter for f_AnchorListItem74 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem74() {
      return build_f_AnchorListItem74();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem74() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem74 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem74.setText("GwtBootstrap3");
      f_AnchorListItem74.setHref("apidocs/index.html");

      return f_AnchorListItem74;
    }

    /**
     * Getter for f_AnchorListItem75 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem75() {
      return build_f_AnchorListItem75();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem75 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem75.setText("GwtBootstrap3-Extras");
      f_AnchorListItem75.setHref("extras-apidocs/index.html");

      return f_AnchorListItem75;
    }

    /**
     * Getter for f_AnchorListItem76 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem76() {
      return build_f_AnchorListItem76();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem76 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem76.setText("Fork on GitHub");
      f_AnchorListItem76.setHref("https://github.com/treblereel");

      return f_AnchorListItem76;
    }

    /**
     * Getter for contentContainer called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtproject.user.client.ui.SimplePanel get_contentContainer() {
      return build_contentContainer();
    }
    private org.gwtproject.user.client.ui.SimplePanel build_contentContainer() {
      // Creation section.
      final org.gwtproject.user.client.ui.SimplePanel contentContainer = new org.gwtproject.user.client.ui.SimplePanel();
      // Setup section.

      this.owner.contentContainer = contentContainer;

      return contentContainer;
    }
  }
}
