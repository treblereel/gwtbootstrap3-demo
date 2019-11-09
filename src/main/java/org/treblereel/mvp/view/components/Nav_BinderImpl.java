// Template file: org/treblereel/mvp/view/components/Nav.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.226")
public class Nav_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Nav>, org.treblereel.mvp.view.components.Nav.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:NavTabs&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true\" badgeText=\"...\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem badgeText=\"...\" badgePosition=\"LEFT\"&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem icon=\"...\"&gt;Item 3&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem enabled=\"false\" icon=\"...\" iconPosition=\"RIGHT\"&gt;Item 4&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem pull=\"RIGHT\"&gt;Pulled right&lt;/b:AnchorListItem&gt;\\n &lt;/b:NavTabs&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:NavPills&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true\" badgeText=\"...\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem badgeText=\"...\" badgePosition=\"RIGHT\"&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem icon=\"...\"&gt;Item 3&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem enabled=\"false\" icon=\"...\" iconPosition=\"RIGHT\"&gt;Item 4&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem pull=\"RIGHT\"&gt;Pulled right&lt;/b:AnchorListItem&gt;\\n &lt;/b:NavPills&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:NavPills stacked=\"true\"&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n &lt;/b:NavPills&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:NavTabs justified=\"true\"&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n &lt;/b:NavTabs&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:NavTabs&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\n \\s\\s&lt;b:ListDropDown&gt;\\n \\s\\s\\s\\s&lt;b:AnchorButton dataToggle=\"DROPDOWN\"&gt;Dropdown&lt;/b:AnchorButton&gt;\\n \\s\\s\\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 3&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s&lt;/b:DropDownMenu&gt;\\n \\s\\s&lt;/b:ListDropDown&gt;\\n \\n \\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n &lt;/b:NavTabs&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:NavPills stacked=\"true\"&gt;\\n \\s\\s&lt;b:AnchorListItem icon=\"...\" iconFixedWidth=\"true\" active=\"true\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem icon=\"...\" iconFixedWidth=\"true\"&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s&lt;b:AnchorListItem icon=\"...\" iconFixedWidth=\"true\"&gt;Item 3&lt;/b:AnchorListItem&gt;\\n &lt;/b:NavPills&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
  }

  Template template = new Nav_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Nav owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Nav owner;


    public Widgets(final org.treblereel.mvp.view.components.Nav owner) {
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
    private org.treblereel.mvp.view.components.Nav_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Nav_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Nav_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Nav_BinderImpl_GenBundleImpl();
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
      f_Column2.add(get_f_Panel16());
      f_Column2.add(get_f_Panel28());
      f_Column2.add(get_f_Panel38());
      f_Column2.add(get_f_Panel48());
      f_Column2.add(get_f_Panel75());

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
      f_PageHeader3.setText("Navs");

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
      f_Panel4.add(get_f_PanelFooter14());

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
      f_Heading6.setText("Tabs");

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
      f_PanelBody7.add(get_f_NavTabs8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_NavTabs8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs8() {
      return build_f_NavTabs8();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs8 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs8.add(get_f_AnchorListItem9());
      f_NavTabs8.add(get_f_AnchorListItem10());
      f_NavTabs8.add(get_f_AnchorListItem11());
      f_NavTabs8.add(get_f_AnchorListItem12());
      f_NavTabs8.add(get_f_AnchorListItem13());

      return f_NavTabs8;
    }

    /**
     * Getter for f_AnchorListItem9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem9() {
      return build_f_AnchorListItem9();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem9 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem9.setText("Item 1");
      f_AnchorListItem9.setActive(true);
      f_AnchorListItem9.setBadgeText("1");

      return f_AnchorListItem9;
    }

    /**
     * Getter for f_AnchorListItem10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem10() {
      return build_f_AnchorListItem10();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem10 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem10.setText("Item 2");
      f_AnchorListItem10.setBadgePosition(org.gwtbootstrap3.client.ui.constants.BadgePosition.LEFT);
      f_AnchorListItem10.setBadgeText("2");

      return f_AnchorListItem10;
    }

    /**
     * Getter for f_AnchorListItem11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem11() {
      return build_f_AnchorListItem11();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem11 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem11.setText("Item 3");
      f_AnchorListItem11.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CAR);

      return f_AnchorListItem11;
    }

    /**
     * Getter for f_AnchorListItem12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem12() {
      return build_f_AnchorListItem12();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem12 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem12.setText("Item 4");
      f_AnchorListItem12.setIconPosition(org.gwtbootstrap3.client.ui.constants.IconPosition.RIGHT);
      f_AnchorListItem12.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.TRUCK);
      f_AnchorListItem12.setEnabled(false);

      return f_AnchorListItem12;
    }

    /**
     * Getter for f_AnchorListItem13 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem13() {
      return build_f_AnchorListItem13();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem13 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem13.setText("Pulled right");
      f_AnchorListItem13.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);

      return f_AnchorListItem13;
    }

    /**
     * Getter for f_PanelFooter14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter14() {
      return build_f_PanelFooter14();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter14 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter14.add(get_f_PrettyPre15());

      return f_PanelFooter14;
    }

    /**
     * Getter for f_PrettyPre15 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre15() {
      return build_f_PrettyPre15();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre15() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre15 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre15.setHTML(template_html1().asString());
      f_PrettyPre15.addStyleName("lang-xml");

      return f_PrettyPre15;
    }

    /**
     * Getter for f_Panel16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel16() {
      return build_f_Panel16();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel16 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel16.add(get_f_PanelHeader17());
      f_Panel16.add(get_f_PanelBody19());
      f_Panel16.add(get_f_PanelFooter26());

      return f_Panel16;
    }

    /**
     * Getter for f_PanelHeader17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader17() {
      return build_f_PanelHeader17();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader17 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader17.add(get_f_Heading18());

      return f_PanelHeader17;
    }

    /**
     * Getter for f_Heading18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading18() {
      return build_f_Heading18();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading18 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading18.setText("Pills");

      return f_Heading18;
    }

    /**
     * Getter for f_PanelBody19 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody19() {
      return build_f_PanelBody19();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody19 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody19.add(get_f_NavPills20());

      return f_PanelBody19;
    }

    /**
     * Getter for f_NavPills20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavPills get_f_NavPills20() {
      return build_f_NavPills20();
    }
    private org.gwtbootstrap3.client.ui.NavPills build_f_NavPills20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavPills f_NavPills20 = new org.gwtbootstrap3.client.ui.NavPills();
      // Setup section.
      f_NavPills20.add(get_f_AnchorListItem21());
      f_NavPills20.add(get_f_AnchorListItem22());
      f_NavPills20.add(get_f_AnchorListItem23());
      f_NavPills20.add(get_f_AnchorListItem24());
      f_NavPills20.add(get_f_AnchorListItem25());

      return f_NavPills20;
    }

    /**
     * Getter for f_AnchorListItem21 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem21() {
      return build_f_AnchorListItem21();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem21 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem21.setText("Item 1");
      f_AnchorListItem21.setActive(true);
      f_AnchorListItem21.setBadgeText("1");

      return f_AnchorListItem21;
    }

    /**
     * Getter for f_AnchorListItem22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem22() {
      return build_f_AnchorListItem22();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem22 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem22.setText("Item 2");
      f_AnchorListItem22.setBadgePosition(org.gwtbootstrap3.client.ui.constants.BadgePosition.LEFT);
      f_AnchorListItem22.setBadgeText("2");

      return f_AnchorListItem22;
    }

    /**
     * Getter for f_AnchorListItem23 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem23() {
      return build_f_AnchorListItem23();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem23 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem23.setText("Item 3");
      f_AnchorListItem23.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CAR);

      return f_AnchorListItem23;
    }

    /**
     * Getter for f_AnchorListItem24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem24() {
      return build_f_AnchorListItem24();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem24 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem24.setText("Item 4");
      f_AnchorListItem24.setIconPosition(org.gwtbootstrap3.client.ui.constants.IconPosition.RIGHT);
      f_AnchorListItem24.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.TRUCK);
      f_AnchorListItem24.setEnabled(false);

      return f_AnchorListItem24;
    }

    /**
     * Getter for f_AnchorListItem25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem25() {
      return build_f_AnchorListItem25();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem25 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem25.setText("Pulled right");
      f_AnchorListItem25.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);

      return f_AnchorListItem25;
    }

    /**
     * Getter for f_PanelFooter26 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter26() {
      return build_f_PanelFooter26();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter26 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter26.add(get_f_PrettyPre27());

      return f_PanelFooter26;
    }

    /**
     * Getter for f_PrettyPre27 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre27() {
      return build_f_PrettyPre27();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre27() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre27 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre27.setHTML(template_html2().asString());
      f_PrettyPre27.addStyleName("lang-xml");

      return f_PrettyPre27;
    }

    /**
     * Getter for f_Panel28 called 1 times. Type: DEFAULT. Build precedence: 3.
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
      f_Panel28.add(get_f_PanelFooter36());

      return f_Panel28;
    }

    /**
     * Getter for f_PanelHeader29 called 1 times. Type: DEFAULT. Build precedence: 4.
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
     * Getter for f_Heading30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading30() {
      return build_f_Heading30();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading30 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading30.setText("Stacked Pills");

      return f_Heading30;
    }

    /**
     * Getter for f_PanelBody31 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody31() {
      return build_f_PanelBody31();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody31 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody31.add(get_f_NavPills32());

      return f_PanelBody31;
    }

    /**
     * Getter for f_NavPills32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavPills get_f_NavPills32() {
      return build_f_NavPills32();
    }
    private org.gwtbootstrap3.client.ui.NavPills build_f_NavPills32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavPills f_NavPills32 = new org.gwtbootstrap3.client.ui.NavPills();
      // Setup section.
      f_NavPills32.add(get_f_AnchorListItem33());
      f_NavPills32.add(get_f_AnchorListItem34());
      f_NavPills32.add(get_f_AnchorListItem35());
      f_NavPills32.setStacked(true);

      return f_NavPills32;
    }

    /**
     * Getter for f_AnchorListItem33 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem33() {
      return build_f_AnchorListItem33();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem33 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem33.setText("Item 1");
      f_AnchorListItem33.setActive(true);

      return f_AnchorListItem33;
    }

    /**
     * Getter for f_AnchorListItem34 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem34() {
      return build_f_AnchorListItem34();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem34 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem34.setText("Item 2");

      return f_AnchorListItem34;
    }

    /**
     * Getter for f_AnchorListItem35 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem35() {
      return build_f_AnchorListItem35();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem35 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem35.setText("Item 3");

      return f_AnchorListItem35;
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
      f_PrettyPre37.setHTML(template_html3().asString());
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
      f_Panel38.add(get_f_PanelFooter46());

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
      f_Heading40.setText("Justified Nav");

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
      f_PanelBody41.add(get_f_NavTabs42());

      return f_PanelBody41;
    }

    /**
     * Getter for f_NavTabs42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs42() {
      return build_f_NavTabs42();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs42 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs42.add(get_f_AnchorListItem43());
      f_NavTabs42.add(get_f_AnchorListItem44());
      f_NavTabs42.add(get_f_AnchorListItem45());
      f_NavTabs42.setJustified(true);

      return f_NavTabs42;
    }

    /**
     * Getter for f_AnchorListItem43 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem43() {
      return build_f_AnchorListItem43();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem43 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem43.setText("Item 1");
      f_AnchorListItem43.setActive(true);

      return f_AnchorListItem43;
    }

    /**
     * Getter for f_AnchorListItem44 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem44() {
      return build_f_AnchorListItem44();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem44 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem44.setText("Item 2");

      return f_AnchorListItem44;
    }

    /**
     * Getter for f_AnchorListItem45 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem45() {
      return build_f_AnchorListItem45();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem45 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem45.setText("Item 3");

      return f_AnchorListItem45;
    }

    /**
     * Getter for f_PanelFooter46 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter46() {
      return build_f_PanelFooter46();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter46 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter46.add(get_f_PrettyPre47());

      return f_PanelFooter46;
    }

    /**
     * Getter for f_PrettyPre47 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre47() {
      return build_f_PrettyPre47();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre47() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre47 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre47.setHTML(template_html4().asString());
      f_PrettyPre47.addStyleName("lang-xml");

      return f_PrettyPre47;
    }

    /**
     * Getter for f_Panel48 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel48() {
      return build_f_Panel48();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel48 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel48.add(get_f_PanelHeader49());
      f_Panel48.add(get_f_PanelBody51());
      f_Panel48.add(get_f_PanelFooter73());

      return f_Panel48;
    }

    /**
     * Getter for f_PanelHeader49 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader49() {
      return build_f_PanelHeader49();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader49 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader49.add(get_f_Heading50());

      return f_PanelHeader49;
    }

    /**
     * Getter for f_Heading50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading50() {
      return build_f_Heading50();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading50 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading50.setText("Using Dropdowns");

      return f_Heading50;
    }

    /**
     * Getter for f_PanelBody51 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody51() {
      return build_f_PanelBody51();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody51 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody51.add(get_f_NavTabs52());
      f_PanelBody51.add(get_f_Br62());
      f_PanelBody51.add(get_f_NavPills63());

      return f_PanelBody51;
    }

    /**
     * Getter for f_NavTabs52 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs52() {
      return build_f_NavTabs52();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs52 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs52.add(get_f_AnchorListItem53());
      f_NavTabs52.add(get_f_AnchorListItem54());
      f_NavTabs52.add(get_f_ListDropDown55());
      f_NavTabs52.add(get_f_AnchorListItem61());

      return f_NavTabs52;
    }

    /**
     * Getter for f_AnchorListItem53 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem53() {
      return build_f_AnchorListItem53();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem53 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem53.setText("Item 1");
      f_AnchorListItem53.setActive(true);

      return f_AnchorListItem53;
    }

    /**
     * Getter for f_AnchorListItem54 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem54() {
      return build_f_AnchorListItem54();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem54 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem54.setText("Item 2");

      return f_AnchorListItem54;
    }

    /**
     * Getter for f_ListDropDown55 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown55() {
      return build_f_ListDropDown55();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown55 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown55.add(get_f_AnchorButton56());
      f_ListDropDown55.add(get_f_DropDownMenu57());

      return f_ListDropDown55;
    }

    /**
     * Getter for f_AnchorButton56 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton56() {
      return build_f_AnchorButton56();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton56 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton56.setText("Dropdown");
      f_AnchorButton56.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton56;
    }

    /**
     * Getter for f_DropDownMenu57 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu57() {
      return build_f_DropDownMenu57();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu57 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu57.add(get_f_AnchorListItem58());
      f_DropDownMenu57.add(get_f_AnchorListItem59());
      f_DropDownMenu57.add(get_f_AnchorListItem60());

      return f_DropDownMenu57;
    }

    /**
     * Getter for f_AnchorListItem58 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem58() {
      return build_f_AnchorListItem58();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem58 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem58.setText("Dropdown 1");

      return f_AnchorListItem58;
    }

    /**
     * Getter for f_AnchorListItem59 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem59() {
      return build_f_AnchorListItem59();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem59 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem59.setText("Dropdown 2");

      return f_AnchorListItem59;
    }

    /**
     * Getter for f_AnchorListItem60 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem60() {
      return build_f_AnchorListItem60();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem60 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem60.setText("Dropdown 3");

      return f_AnchorListItem60;
    }

    /**
     * Getter for f_AnchorListItem61 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem61() {
      return build_f_AnchorListItem61();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem61 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem61.setText("Item 3");

      return f_AnchorListItem61;
    }

    /**
     * Getter for f_Br62 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br62() {
      return build_f_Br62();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br62 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br62;
    }

    /**
     * Getter for f_NavPills63 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavPills get_f_NavPills63() {
      return build_f_NavPills63();
    }
    private org.gwtbootstrap3.client.ui.NavPills build_f_NavPills63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavPills f_NavPills63 = new org.gwtbootstrap3.client.ui.NavPills();
      // Setup section.
      f_NavPills63.add(get_f_AnchorListItem64());
      f_NavPills63.add(get_f_AnchorListItem65());
      f_NavPills63.add(get_f_ListDropDown66());
      f_NavPills63.add(get_f_AnchorListItem72());

      return f_NavPills63;
    }

    /**
     * Getter for f_AnchorListItem64 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem64() {
      return build_f_AnchorListItem64();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem64 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem64.setText("Item 1");
      f_AnchorListItem64.setActive(true);

      return f_AnchorListItem64;
    }

    /**
     * Getter for f_AnchorListItem65 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem65() {
      return build_f_AnchorListItem65();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem65 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem65.setText("Item 2");

      return f_AnchorListItem65;
    }

    /**
     * Getter for f_ListDropDown66 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListDropDown get_f_ListDropDown66() {
      return build_f_ListDropDown66();
    }
    private org.gwtbootstrap3.client.ui.ListDropDown build_f_ListDropDown66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListDropDown f_ListDropDown66 = new org.gwtbootstrap3.client.ui.ListDropDown();
      // Setup section.
      f_ListDropDown66.add(get_f_AnchorButton67());
      f_ListDropDown66.add(get_f_DropDownMenu68());

      return f_ListDropDown66;
    }

    /**
     * Getter for f_AnchorButton67 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.AnchorButton get_f_AnchorButton67() {
      return build_f_AnchorButton67();
    }
    private org.gwtbootstrap3.client.ui.AnchorButton build_f_AnchorButton67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorButton f_AnchorButton67 = new org.gwtbootstrap3.client.ui.AnchorButton();
      // Setup section.
      f_AnchorButton67.setText("Dropdown");
      f_AnchorButton67.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.DROPDOWN);

      return f_AnchorButton67;
    }

    /**
     * Getter for f_DropDownMenu68 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.DropDownMenu get_f_DropDownMenu68() {
      return build_f_DropDownMenu68();
    }
    private org.gwtbootstrap3.client.ui.DropDownMenu build_f_DropDownMenu68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.DropDownMenu f_DropDownMenu68 = new org.gwtbootstrap3.client.ui.DropDownMenu();
      // Setup section.
      f_DropDownMenu68.add(get_f_AnchorListItem69());
      f_DropDownMenu68.add(get_f_AnchorListItem70());
      f_DropDownMenu68.add(get_f_AnchorListItem71());

      return f_DropDownMenu68;
    }

    /**
     * Getter for f_AnchorListItem69 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem69() {
      return build_f_AnchorListItem69();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem69 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem69.setText("Dropdown 1");

      return f_AnchorListItem69;
    }

    /**
     * Getter for f_AnchorListItem70 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem70() {
      return build_f_AnchorListItem70();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem70 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem70.setText("Dropdown 2");

      return f_AnchorListItem70;
    }

    /**
     * Getter for f_AnchorListItem71 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem71() {
      return build_f_AnchorListItem71();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem71 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem71.setText("Dropdown 3");

      return f_AnchorListItem71;
    }

    /**
     * Getter for f_AnchorListItem72 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem72() {
      return build_f_AnchorListItem72();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem72 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem72.setText("Item 3");

      return f_AnchorListItem72;
    }

    /**
     * Getter for f_PanelFooter73 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter73() {
      return build_f_PanelFooter73();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter73 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter73.add(get_f_PrettyPre74());

      return f_PanelFooter73;
    }

    /**
     * Getter for f_PrettyPre74 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre74() {
      return build_f_PrettyPre74();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre74() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre74 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre74.setHTML(template_html5().asString());
      f_PrettyPre74.addStyleName("lang-xml");

      return f_PrettyPre74;
    }

    /**
     * Getter for f_Panel75 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel75() {
      return build_f_Panel75();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel75 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel75.add(get_f_PanelHeader76());
      f_Panel75.add(get_f_PanelBody78());
      f_Panel75.add(get_f_PanelFooter83());

      return f_Panel75;
    }

    /**
     * Getter for f_PanelHeader76 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader76() {
      return build_f_PanelHeader76();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader76 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader76.add(get_f_Heading77());

      return f_PanelHeader76;
    }

    /**
     * Getter for f_Heading77 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading77() {
      return build_f_Heading77();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading77 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading77.setText("Navs With Icons And Fixed Width");

      return f_Heading77;
    }

    /**
     * Getter for f_PanelBody78 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody78() {
      return build_f_PanelBody78();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody78 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody78.add(get_f_NavPills79());

      return f_PanelBody78;
    }

    /**
     * Getter for f_NavPills79 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavPills get_f_NavPills79() {
      return build_f_NavPills79();
    }
    private org.gwtbootstrap3.client.ui.NavPills build_f_NavPills79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavPills f_NavPills79 = new org.gwtbootstrap3.client.ui.NavPills();
      // Setup section.
      f_NavPills79.add(get_f_AnchorListItem80());
      f_NavPills79.add(get_f_AnchorListItem81());
      f_NavPills79.add(get_f_AnchorListItem82());
      f_NavPills79.setStacked(true);

      return f_NavPills79;
    }

    /**
     * Getter for f_AnchorListItem80 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem80() {
      return build_f_AnchorListItem80();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem80 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem80.setText("Item 1");
      f_AnchorListItem80.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.BOLT);
      f_AnchorListItem80.setActive(true);
      f_AnchorListItem80.setIconFixedWidth(true);

      return f_AnchorListItem80;
    }

    /**
     * Getter for f_AnchorListItem81 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem81() {
      return build_f_AnchorListItem81();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem81 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem81.setText("Item 2");
      f_AnchorListItem81.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      f_AnchorListItem81.setIconFixedWidth(true);

      return f_AnchorListItem81;
    }

    /**
     * Getter for f_AnchorListItem82 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem82() {
      return build_f_AnchorListItem82();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem82 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem82.setText("Item 3");
      f_AnchorListItem82.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.BARCODE);
      f_AnchorListItem82.setIconFixedWidth(true);

      return f_AnchorListItem82;
    }

    /**
     * Getter for f_PanelFooter83 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter83() {
      return build_f_PanelFooter83();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter83 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter83.add(get_f_PrettyPre84());

      return f_PanelFooter83;
    }

    /**
     * Getter for f_PrettyPre84 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre84() {
      return build_f_PrettyPre84();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre84() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre84 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre84.setHTML(template_html6().asString());
      f_PrettyPre84.addStyleName("lang-xml");

      return f_PrettyPre84;
    }
  }
}
