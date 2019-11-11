// Template file: org/treblereel/mvp/view/javascript/TabView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.javascript;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.3")
public class TabView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.javascript.TabView>, org.treblereel.mvp.view.javascript.TabView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("You must have active=\"true\" on the first tab pane, or set it programmatically.")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("You must have active=\"true\" on the first tab pane, or set it programmatically.")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("You must have active=\"true\" on the first tab pane, or set it programmatically.")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:NavTabs&gt;\\n \\s\\s&lt;b:TabListItem active=\"true\" dataTarget=\"#tab1\" text=\"...\" icon=\"CAR\"/&gt;\\n \\s\\s&lt;b:TabListItem dataTarget=\"#tab2\" text=\"...\" icon=\"TRAIN\" iconPosition=\"RIGHT\"/&gt;\\n \\s\\s&lt;b:TabListItem enabled=\"false\" dataTarget=\"#tab3\" text=\"...\" icon=\"SPINNER\" iconPulse=\"true\"/&gt;\\n &lt;/b:NavTabs&gt;\\n &lt;b:TabContent&gt;\\n \\s\\s&lt;b:TabPane active=\"true\" b:id=\"tab1\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;b:TabPane b:id=\"tab2\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;b:TabPane b:id=\"tab3\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n &lt;/b:TabContent&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("To Fade you must have fade=\"true\" on all TabPanes. Also on the first tab you must have active=\"true\" and in=\"true\".")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("To Fade you must have fade=\"true\" on all TabPanes. Also on the first tab you must have active=\"true\" and in=\"true\".")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("To Fade you must have fade=\"true\" on all TabPanes. Also on the first tab you must have active=\"true\" and in=\"true\".")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("&lt;b:NavTabs&gt;\\n \\s\\s&lt;b:TabListItem active=\"true\" dataTarget=\"#tab4\" text=\"...\" badgeText=\"...\"/&gt;\\n \\s\\s&lt;b:TabListItem dataTarget=\"#tab5\" text=\"...\" badgeText=\"...\"/&gt;\\n \\s\\s&lt;b:TabListItem dataTarget=\"#tab6\" text=\"...\" badgeText=\"...\"/&gt;\\n &lt;/b:NavTabs&gt;\\n &lt;b:TabContent&gt;\\n \\s\\s&lt;b:TabPane fade=\"true\" in=\"true\" active=\"true\" b:id=\"tab4\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;b:TabPane fade=\"true\" b:id=\"tab5\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;b:TabPane fade=\"true\" b:id=\"tab6\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n &lt;/b:TabContent&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("Use Buttons to change me!")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("Use Buttons to change me!")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("Use Buttons to change me!")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("&lt;b:NavTabs&gt;\\n \\s\\s&lt;b:TabListItem active=\"true\" dataTarget=\"#tab7\" text=\"...\"/&gt;\\n \\s\\s&lt;b:TabListItem dataTarget=\"#tab8\" text=\"...\"/&gt;\\n \\s\\s&lt;b:TabListItem dataTarget=\"#tab9\" text=\"...\"/&gt;\\n &lt;/b:NavTabs&gt;\\n &lt;b:TabContent&gt;\\n \\s\\s&lt;b:TabPane active=\"true\" b:id=\"tab7\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;b:TabPane b:id=\"tab8\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;b:TabPane b:id=\"tab9\"&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/b:TabPane&gt;\\n &lt;/b:TabContent&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("@UiField\\n TabListItem tabListItem;\\n\\n Click Handler\\n tabListItem.showTab();")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.positionedtabs.PositionedTabs\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("You can change the default position of the tabs (top) by wrapping the NavTabs and TabContent inside a TabPanel and setting the tabPosition on it. <br> <br> The choices of tab position are: LEFT, RIGHT, BELOW, TOP (default). <br> <br> <b>To use this, you must add this inherit to your *.gwt.xml (to inject the custom css needed): </b> <br> <br> <span id='{0}'></span>")
    org.gwtproject.safehtml.shared.SafeHtml html15(String arg0);
     
    @Template("My tabs are on the left!")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("My tabs are on the left!")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("My tabs are on the left!")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("My tabs are on the right!")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
    @Template("My tabs are on the right!")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("My tabs are on the right!")
    org.gwtproject.safehtml.shared.SafeHtml html21();
     
    @Template("My tabs are on the bottom!")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
    @Template("My tabs are on the bottom!")
    org.gwtproject.safehtml.shared.SafeHtml html23();
     
    @Template("My tabs are on the bottom!")
    org.gwtproject.safehtml.shared.SafeHtml html24();
     
    @Template("** Make sure to include a ClearFix after the TabContent to ensure proper heights!")
    org.gwtproject.safehtml.shared.SafeHtml html25();
     
    @Template("&lt;b:TabPanel tabPosition=\"LEFT\"&gt;\\n \\s\\s &lt;b:NavTabs&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem active=\"true\" dataTarget=\"#tab1\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem dataTarget=\"#tab2\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem dataTarget=\"#tab3\" text=\"...\"/&gt;\\n \\s\\s&lt;/b:NavTabs&gt;\\n \\s\\s&lt;b:TabContent&gt;\\n \\s\\s\\s\\s&lt;b:TabPane active=\"true\" b:id=\"tab1\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s\\s\\s&lt;b:TabPane b:id=\"tab2\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s\\s\\s&lt;b:TabPane b:id=\"tab3\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;/b:TabContent&gt;\\n \\s\\s&lt;b.html:ClearFix/&gt;\\n &lt;/b:TabPanel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html26();
     
    @Template("** Make sure to include a ClearFix after the TabContent to ensure proper heights!")
    org.gwtproject.safehtml.shared.SafeHtml html27();
     
    @Template("&lt;b:TabPanel tabPosition=\"RIGHT\"&gt;\\n \\s\\s &lt;b:NavTabs&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem active=\"true\" dataTarget=\"#tab1\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem dataTarget=\"#tab2\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem dataTarget=\"#tab3\" text=\"...\"/&gt;\\n \\s\\s&lt;/b:NavTabs&gt;\\n \\s\\s&lt;b:TabContent&gt;\\n \\s\\s\\s\\s&lt;b:TabPane active=\"true\" b:id=\"tab1\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s\\s\\s&lt;b:TabPane b:id=\"tab2\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s\\s\\s&lt;b:TabPane b:id=\"tab3\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;/b:TabContent&gt;\\n \\s\\s&lt;b.html:ClearFix/&gt;\\n &lt;/b:TabPanel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html28();
     
    @Template("** Make sure to place the NavTabs BELOW the TabContent for BELOW tabs!")
    org.gwtproject.safehtml.shared.SafeHtml html29();
     
    @Template("&lt;b:TabPanel tabPosition=\"BELOW\"&gt;\\n \\s\\s&lt;b:TabContent&gt;\\n \\s\\s\\s\\s&lt;b:TabPane active=\"true\" b:id=\"tab1\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s\\s\\s&lt;b:TabPane b:id=\"tab2\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s\\s\\s&lt;b:TabPane b:id=\"tab3\"&gt;\\n \\s\\s\\s\\s\\s\\s...\\n \\s\\s\\s\\s&lt;/b:TabPane&gt;\\n \\s\\s&lt;/b:TabContent&gt;\\n \\s\\s &lt;b:NavTabs&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem active=\"true\" dataTarget=\"#tab1\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem dataTarget=\"#tab2\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:TabListItem dataTarget=\"#tab3\" text=\"...\"/&gt;\\n \\s\\s&lt;/b:NavTabs&gt;\\n &lt;/b:TabPanel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html30();
     
  }

  Template template = new TabView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.javascript.TabView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.javascript.TabView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleTab7((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleTab8((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleTab9((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.javascript.TabView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
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
    org.gwtproject.safehtml.shared.SafeHtml template_html9() {
      return template.html9();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html10() {
      return template.html10();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html11() {
      return template.html11();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html12() {
      return template.html12();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html13() {
      return template.html13();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html14() {
      return template.html14();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html15() {
      return template.html15(get_domId0());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html16() {
      return template.html16();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html17() {
      return template.html17();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html18() {
      return template.html18();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html19() {
      return template.html19();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html20() {
      return template.html20();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html21() {
      return template.html21();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html22() {
      return template.html22();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html23() {
      return template.html23();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html24() {
      return template.html24();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html25() {
      return template.html25();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html26() {
      return template.html26();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html27() {
      return template.html27();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html28() {
      return template.html28();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html29() {
      return template.html29();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html30() {
      return template.html30();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.TabView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.javascript.TabView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.javascript.TabView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.javascript.TabView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.TabView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.javascript.TabView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.javascript.TabView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel24());
      f_Column2.add(get_f_Panel44());
      f_Column2.add(get_f_Panel64());

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
      f_PageHeader3.setText("Tabs");

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
      f_Panel4.add(get_f_PanelFooter22());

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
      f_PanelBody7.add(get_f_NavTabs8());
      f_PanelBody7.add(get_f_TabContent12());

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
      f_NavTabs8.add(get_f_TabListItem9());
      f_NavTabs8.add(get_f_TabListItem10());
      f_NavTabs8.add(get_f_TabListItem11());

      return f_NavTabs8;
    }

    /**
     * Getter for f_TabListItem9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem9() {
      return build_f_TabListItem9();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem9 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem9.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CAR);
      f_TabListItem9.setActive(true);
      f_TabListItem9.setText("Tab 1");
      f_TabListItem9.setDataTarget("#tab1");

      return f_TabListItem9;
    }

    /**
     * Getter for f_TabListItem10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem10() {
      return build_f_TabListItem10();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem10 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem10.setIconPosition(org.gwtbootstrap3.client.ui.constants.IconPosition.RIGHT);
      f_TabListItem10.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.TRAIN);
      f_TabListItem10.setText("Tab 2");
      f_TabListItem10.setDataTarget("#tab2");

      return f_TabListItem10;
    }

    /**
     * Getter for f_TabListItem11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem11() {
      return build_f_TabListItem11();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem11 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem11.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.SPINNER);
      f_TabListItem11.setText("Tab 3");
      f_TabListItem11.setIconPulse(true);
      f_TabListItem11.setDataTarget("#tab3");
      f_TabListItem11.setEnabled(false);

      return f_TabListItem11;
    }

    /**
     * Getter for f_TabContent12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent12() {
      return build_f_TabContent12();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent12 = new org.gwtbootstrap3.client.ui.TabContent();
      // Setup section.
      f_TabContent12.add(get_f_TabPane13());
      f_TabContent12.add(get_f_TabPane16());
      f_TabContent12.add(get_f_TabPane19());

      return f_TabContent12;
    }

    /**
     * Getter for f_TabPane13 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane13() {
      return build_f_TabPane13();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane13 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane13.add(get_f_Heading14());
      f_TabPane13.add(get_f_Paragraph15());
      f_TabPane13.setActive(true);
      f_TabPane13.setId("tab1");

      return f_TabPane13;
    }

    /**
     * Getter for f_Heading14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading14() {
      return build_f_Heading14();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading14 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading14.setText("Tab 1");

      return f_Heading14;
    }

    /**
     * Getter for f_Paragraph15 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph15() {
      return build_f_Paragraph15();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph15 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph15;
    }

    /**
     * Getter for f_TabPane16 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane16() {
      return build_f_TabPane16();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane16 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane16.add(get_f_Heading17());
      f_TabPane16.add(get_f_Paragraph18());
      f_TabPane16.setId("tab2");

      return f_TabPane16;
    }

    /**
     * Getter for f_Heading17 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading17() {
      return build_f_Heading17();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading17 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading17.setText("Tab 2");

      return f_Heading17;
    }

    /**
     * Getter for f_Paragraph18 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph18() {
      return build_f_Paragraph18();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph18 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.

      return f_Paragraph18;
    }

    /**
     * Getter for f_TabPane19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane19() {
      return build_f_TabPane19();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane19 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane19.add(get_f_Heading20());
      f_TabPane19.add(get_f_Paragraph21());
      f_TabPane19.setId("tab3");

      return f_TabPane19;
    }

    /**
     * Getter for f_Heading20 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading20() {
      return build_f_Heading20();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading20 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading20.setText("Tab 3");

      return f_Heading20;
    }

    /**
     * Getter for f_Paragraph21 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph21() {
      return build_f_Paragraph21();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph21 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      return f_Paragraph21;
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
      f_PrettyPre23.setHTML(template_html4().asString());
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
      f_Panel24.add(get_f_PanelFooter42());

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
      f_Heading26.setText("Fading Content In/Out");

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
      f_PanelBody27.add(get_f_NavTabs28());
      f_PanelBody27.add(get_f_TabContent32());

      return f_PanelBody27;
    }

    /**
     * Getter for f_NavTabs28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs28() {
      return build_f_NavTabs28();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs28 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs28.add(get_f_TabListItem29());
      f_NavTabs28.add(get_f_TabListItem30());
      f_NavTabs28.add(get_f_TabListItem31());

      return f_NavTabs28;
    }

    /**
     * Getter for f_TabListItem29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem29() {
      return build_f_TabListItem29();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem29 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem29.setActive(true);
      f_TabListItem29.setText("Tab 4");
      f_TabListItem29.setDataTarget("#tab4");
      f_TabListItem29.setBadgeText("4");

      return f_TabListItem29;
    }

    /**
     * Getter for f_TabListItem30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem30() {
      return build_f_TabListItem30();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem30 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem30.setText("Tab 5");
      f_TabListItem30.setDataTarget("#tab5");
      f_TabListItem30.setBadgeText("5");

      return f_TabListItem30;
    }

    /**
     * Getter for f_TabListItem31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem31() {
      return build_f_TabListItem31();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem31 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem31.setText("Tab 6");
      f_TabListItem31.setDataTarget("#tab6");
      f_TabListItem31.setBadgeText("6");

      return f_TabListItem31;
    }

    /**
     * Getter for f_TabContent32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent32() {
      return build_f_TabContent32();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent32 = new org.gwtbootstrap3.client.ui.TabContent();
      // Setup section.
      f_TabContent32.add(get_f_TabPane33());
      f_TabContent32.add(get_f_TabPane36());
      f_TabContent32.add(get_f_TabPane39());

      return f_TabContent32;
    }

    /**
     * Getter for f_TabPane33 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane33() {
      return build_f_TabPane33();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane33 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane33.add(get_f_Heading34());
      f_TabPane33.add(get_f_Paragraph35());
      f_TabPane33.setFade(true);
      f_TabPane33.setIn(true);
      f_TabPane33.setActive(true);
      f_TabPane33.setId("tab4");

      return f_TabPane33;
    }

    /**
     * Getter for f_Heading34 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading34() {
      return build_f_Heading34();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading34 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading34.setText("Tab 4");

      return f_Heading34;
    }

    /**
     * Getter for f_Paragraph35 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph35() {
      return build_f_Paragraph35();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph35 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.

      return f_Paragraph35;
    }

    /**
     * Getter for f_TabPane36 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane36() {
      return build_f_TabPane36();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane36 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane36.add(get_f_Heading37());
      f_TabPane36.add(get_f_Paragraph38());
      f_TabPane36.setFade(true);
      f_TabPane36.setId("tab5");

      return f_TabPane36;
    }

    /**
     * Getter for f_Heading37 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading37() {
      return build_f_Heading37();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading37 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading37.setText("Tab 5");

      return f_Heading37;
    }

    /**
     * Getter for f_Paragraph38 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph38() {
      return build_f_Paragraph38();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph38 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.

      return f_Paragraph38;
    }

    /**
     * Getter for f_TabPane39 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane39() {
      return build_f_TabPane39();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane39 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane39.add(get_f_Heading40());
      f_TabPane39.add(get_f_Paragraph41());
      f_TabPane39.setFade(true);
      f_TabPane39.setId("tab6");

      return f_TabPane39;
    }

    /**
     * Getter for f_Heading40 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading40() {
      return build_f_Heading40();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading40 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading40.setText("Tab 6");

      return f_Heading40;
    }

    /**
     * Getter for f_Paragraph41 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph41() {
      return build_f_Paragraph41();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph41 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html7().asString());
      // Setup section.

      return f_Paragraph41;
    }

    /**
     * Getter for f_PanelFooter42 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter42() {
      return build_f_PanelFooter42();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter42 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter42.add(get_f_PrettyPre43());

      return f_PanelFooter42;
    }

    /**
     * Getter for f_PrettyPre43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre43() {
      return build_f_PrettyPre43();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre43() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre43 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre43.setHTML(template_html8().asString());
      f_PrettyPre43.addStyleName("lang-xml");

      return f_PrettyPre43;
    }

    /**
     * Getter for f_Panel44 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel44() {
      return build_f_Panel44();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel44 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel44.add(get_f_PanelHeader45());
      f_Panel44.add(get_f_PanelBody47());
      f_Panel44.add(get_f_PanelFooter59());

      return f_Panel44;
    }

    /**
     * Getter for f_PanelHeader45 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader45() {
      return build_f_PanelHeader45();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader45 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader45.add(get_f_Heading46());

      return f_PanelHeader45;
    }

    /**
     * Getter for f_Heading46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading46() {
      return build_f_Heading46();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading46 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading46.setText("Force Show Tabs");

      return f_Heading46;
    }

    /**
     * Getter for f_PanelBody47 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody47() {
      return build_f_PanelBody47();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody47 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody47.add(get_f_NavTabs48());
      f_PanelBody47.add(get_f_TabContent49());
      f_PanelBody47.add(get_tab7Button());
      f_PanelBody47.add(get_tab8Button());
      f_PanelBody47.add(get_tab9Button());

      return f_PanelBody47;
    }

    /**
     * Getter for f_NavTabs48 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs48() {
      return build_f_NavTabs48();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs48 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs48.add(get_tab7ListItem());
      f_NavTabs48.add(get_tab8ListItem());
      f_NavTabs48.add(get_tab9ListItem());

      return f_NavTabs48;
    }

    /**
     * Getter for tab7ListItem called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_tab7ListItem() {
      return build_tab7ListItem();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_tab7ListItem() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem tab7ListItem = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      tab7ListItem.setText("Tab 7");
      tab7ListItem.setActive(true);
      tab7ListItem.setDataTarget("#tab7");

      this.owner.tab7ListItem = tab7ListItem;

      return tab7ListItem;
    }

    /**
     * Getter for tab8ListItem called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_tab8ListItem() {
      return build_tab8ListItem();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_tab8ListItem() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem tab8ListItem = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      tab8ListItem.setText("Tab 8");
      tab8ListItem.setDataTarget("#tab8");

      this.owner.tab8ListItem = tab8ListItem;

      return tab8ListItem;
    }

    /**
     * Getter for tab9ListItem called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_tab9ListItem() {
      return build_tab9ListItem();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_tab9ListItem() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem tab9ListItem = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      tab9ListItem.setText("Tab 9");
      tab9ListItem.setDataTarget("#tab9");

      this.owner.tab9ListItem = tab9ListItem;

      return tab9ListItem;
    }

    /**
     * Getter for f_TabContent49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent49() {
      return build_f_TabContent49();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent49 = new org.gwtbootstrap3.client.ui.TabContent();
      // Setup section.
      f_TabContent49.add(get_f_TabPane50());
      f_TabContent49.add(get_f_TabPane53());
      f_TabContent49.add(get_f_TabPane56());

      return f_TabContent49;
    }

    /**
     * Getter for f_TabPane50 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane50() {
      return build_f_TabPane50();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane50 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane50.add(get_f_Heading51());
      f_TabPane50.add(get_f_Paragraph52());
      f_TabPane50.setActive(true);
      f_TabPane50.setId("tab7");

      return f_TabPane50;
    }

    /**
     * Getter for f_Heading51 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading51() {
      return build_f_Heading51();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading51 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading51.setText("Tab 7");

      return f_Heading51;
    }

    /**
     * Getter for f_Paragraph52 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph52() {
      return build_f_Paragraph52();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph52 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html9().asString());
      // Setup section.

      return f_Paragraph52;
    }

    /**
     * Getter for f_TabPane53 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane53() {
      return build_f_TabPane53();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane53 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane53.add(get_f_Heading54());
      f_TabPane53.add(get_f_Paragraph55());
      f_TabPane53.setId("tab8");

      return f_TabPane53;
    }

    /**
     * Getter for f_Heading54 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading54() {
      return build_f_Heading54();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading54 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading54.setText("Tab 8");

      return f_Heading54;
    }

    /**
     * Getter for f_Paragraph55 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph55() {
      return build_f_Paragraph55();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph55 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html10().asString());
      // Setup section.

      return f_Paragraph55;
    }

    /**
     * Getter for f_TabPane56 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane56() {
      return build_f_TabPane56();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane56 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane56.add(get_f_Heading57());
      f_TabPane56.add(get_f_Paragraph58());
      f_TabPane56.setId("tab9");

      return f_TabPane56;
    }

    /**
     * Getter for f_Heading57 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading57() {
      return build_f_Heading57();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading57 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading57.setText("Tab 9");

      return f_Heading57;
    }

    /**
     * Getter for f_Paragraph58 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph58() {
      return build_f_Paragraph58();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph58 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html11().asString());
      // Setup section.

      return f_Paragraph58;
    }

    /**
     * Getter for tab7Button called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_tab7Button() {
      return build_tab7Button();
    }
    private org.gwtbootstrap3.client.ui.Button build_tab7Button() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button tab7Button = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      tab7Button.addStyleName("" + get_style().margin() + "");
      tab7Button.setText("Change to Tab 7");
      tab7Button.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      tab7Button.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.tab7Button = tab7Button;

      return tab7Button;
    }

    /**
     * Getter for tab8Button called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_tab8Button() {
      return build_tab8Button();
    }
    private org.gwtbootstrap3.client.ui.Button build_tab8Button() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button tab8Button = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      tab8Button.addStyleName("" + get_style().margin() + "");
      tab8Button.setText("Change to Tab 8");
      tab8Button.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      tab8Button.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.tab8Button = tab8Button;

      return tab8Button;
    }

    /**
     * Getter for tab9Button called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_tab9Button() {
      return build_tab9Button();
    }
    private org.gwtbootstrap3.client.ui.Button build_tab9Button() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button tab9Button = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      tab9Button.addStyleName("" + get_style().margin() + "");
      tab9Button.setText("Change to Tab 9");
      tab9Button.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      tab9Button.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.tab9Button = tab9Button;

      return tab9Button;
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
      f_PanelFooter59.add(get_f_Heading60());
      f_PanelFooter59.add(get_f_PrettyPre61());
      f_PanelFooter59.add(get_f_Heading62());
      f_PanelFooter59.add(get_f_PrettyPre63());

      return f_PanelFooter59;
    }

    /**
     * Getter for f_Heading60 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading60() {
      return build_f_Heading60();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading60 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading60.setText("UiBinder");

      return f_Heading60;
    }

    /**
     * Getter for f_PrettyPre61 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre61() {
      return build_f_PrettyPre61();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre61() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre61 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre61.setHTML(template_html12().asString());
      f_PrettyPre61.addStyleName("lang-xml");

      return f_PrettyPre61;
    }

    /**
     * Getter for f_Heading62 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading62() {
      return build_f_Heading62();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading62 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading62.setText("Java code (on the list item you want to show)");

      return f_Heading62;
    }

    /**
     * Getter for f_PrettyPre63 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre63() {
      return build_f_PrettyPre63();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre63() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre63 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre63.setHTML(template_html13().asString());
      f_PrettyPre63.addStyleName("lang-java");

      return f_PrettyPre63;
    }

    /**
     * Getter for f_Panel64 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel64() {
      return build_f_Panel64();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel64 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel64.add(get_f_PanelHeader65());
      f_Panel64.add(get_f_PanelBody67());
      f_Panel64.add(get_f_PanelFooter122());

      return f_Panel64;
    }

    /**
     * Getter for f_PanelHeader65 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader65() {
      return build_f_PanelHeader65();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader65 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader65.add(get_f_Heading66());

      return f_PanelHeader65;
    }

    /**
     * Getter for f_Heading66 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading66() {
      return build_f_Heading66();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading66 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading66.setText("Positions");

      return f_Heading66;
    }

    /**
     * Getter for f_PanelBody67 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody67() {
      return build_f_PanelBody67();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody67 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody67.add(get_f_Paragraph68());
      f_PanelBody67.add(get_f_Container70());

      return f_PanelBody67;
    }

    /**
     * Getter for f_Paragraph68 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph68() {
      return build_f_Paragraph68();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph68 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html15().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Paragraph68.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Paragraph68.addAndReplaceElement(get_f_PrettyPre69(), get_domId0Element().get());

      return f_Paragraph68;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 6.
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
     * Getter for f_PrettyPre69 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre69() {
      return build_f_PrettyPre69();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre69() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre69 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre69.setHTML(template_html14().asString());
      f_PrettyPre69.addStyleName("lang-xml");

      return f_PrettyPre69;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 6.
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
     * Getter for f_Container70 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Container get_f_Container70() {
      return build_f_Container70();
    }
    private org.gwtbootstrap3.client.ui.Container build_f_Container70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Container f_Container70 = new org.gwtbootstrap3.client.ui.Container();
      // Setup section.
      f_Container70.add(get_f_Row71());
      f_Container70.setFluid(true);
      f_Container70.setMarginTop(10);

      return f_Container70;
    }

    /**
     * Getter for f_Row71 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row71() {
      return build_f_Row71();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row71 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row71.add(get_f_Column72());
      f_Row71.add(get_f_Column89());
      f_Row71.add(get_f_Column106());

      return f_Row71;
    }

    /**
     * Getter for f_Column72 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column72() {
      return build_f_Column72();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column72 = new org.gwtbootstrap3.client.ui.Column("MD_6");
      // Setup section.
      f_Column72.add(get_f_TabPanel73());

      return f_Column72;
    }

    /**
     * Getter for f_TabPanel73 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TabPanel get_f_TabPanel73() {
      return build_f_TabPanel73();
    }
    private org.gwtbootstrap3.client.ui.TabPanel build_f_TabPanel73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPanel f_TabPanel73 = new org.gwtbootstrap3.client.ui.TabPanel();
      // Setup section.
      f_TabPanel73.add(get_f_NavTabs74());
      f_TabPanel73.add(get_f_TabContent78());
      f_TabPanel73.add(get_f_ClearFix88());
      f_TabPanel73.setTabPosition(org.gwtbootstrap3.client.ui.constants.TabPosition.LEFT);

      return f_TabPanel73;
    }

    /**
     * Getter for f_NavTabs74 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs74() {
      return build_f_NavTabs74();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs74() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs74 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs74.add(get_f_TabListItem75());
      f_NavTabs74.add(get_f_TabListItem76());
      f_NavTabs74.add(get_f_TabListItem77());

      return f_NavTabs74;
    }

    /**
     * Getter for f_TabListItem75 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem75() {
      return build_f_TabListItem75();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem75 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem75.setText("Tab 10");
      f_TabListItem75.setActive(true);
      f_TabListItem75.setDataTarget("#tab10");

      return f_TabListItem75;
    }

    /**
     * Getter for f_TabListItem76 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem76() {
      return build_f_TabListItem76();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem76 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem76.setText("Tab 11");
      f_TabListItem76.setDataTarget("#tab11");

      return f_TabListItem76;
    }

    /**
     * Getter for f_TabListItem77 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem77() {
      return build_f_TabListItem77();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem77 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem77.setText("Tab 12");
      f_TabListItem77.setDataTarget("#tab12");

      return f_TabListItem77;
    }

    /**
     * Getter for f_TabContent78 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent78() {
      return build_f_TabContent78();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent78 = new org.gwtbootstrap3.client.ui.TabContent();
      // Setup section.
      f_TabContent78.add(get_f_TabPane79());
      f_TabContent78.add(get_f_TabPane82());
      f_TabContent78.add(get_f_TabPane85());

      return f_TabContent78;
    }

    /**
     * Getter for f_TabPane79 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane79() {
      return build_f_TabPane79();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane79 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane79.add(get_f_Heading80());
      f_TabPane79.add(get_f_Paragraph81());
      f_TabPane79.setActive(true);
      f_TabPane79.setId("tab10");

      return f_TabPane79;
    }

    /**
     * Getter for f_Heading80 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading80() {
      return build_f_Heading80();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading80 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading80.setText("Tab 10");

      return f_Heading80;
    }

    /**
     * Getter for f_Paragraph81 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph81() {
      return build_f_Paragraph81();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph81 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html16().asString());
      // Setup section.

      return f_Paragraph81;
    }

    /**
     * Getter for f_TabPane82 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane82() {
      return build_f_TabPane82();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane82 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane82.add(get_f_Heading83());
      f_TabPane82.add(get_f_Paragraph84());
      f_TabPane82.setId("tab11");

      return f_TabPane82;
    }

    /**
     * Getter for f_Heading83 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading83() {
      return build_f_Heading83();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading83 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading83.setText("Tab 11");

      return f_Heading83;
    }

    /**
     * Getter for f_Paragraph84 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph84() {
      return build_f_Paragraph84();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph84() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph84 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html17().asString());
      // Setup section.

      return f_Paragraph84;
    }

    /**
     * Getter for f_TabPane85 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane85() {
      return build_f_TabPane85();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane85() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane85 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane85.add(get_f_Heading86());
      f_TabPane85.add(get_f_Paragraph87());
      f_TabPane85.setId("tab12");

      return f_TabPane85;
    }

    /**
     * Getter for f_Heading86 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading86() {
      return build_f_Heading86();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading86() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading86 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading86.setText("Tab 12");

      return f_Heading86;
    }

    /**
     * Getter for f_Paragraph87 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph87() {
      return build_f_Paragraph87();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph87() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph87 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html18().asString());
      // Setup section.

      return f_Paragraph87;
    }

    /**
     * Getter for f_ClearFix88 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix88() {
      return build_f_ClearFix88();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix88 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix88;
    }

    /**
     * Getter for f_Column89 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column89() {
      return build_f_Column89();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column89 = new org.gwtbootstrap3.client.ui.Column("MD_6");
      // Setup section.
      f_Column89.add(get_f_TabPanel90());

      return f_Column89;
    }

    /**
     * Getter for f_TabPanel90 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TabPanel get_f_TabPanel90() {
      return build_f_TabPanel90();
    }
    private org.gwtbootstrap3.client.ui.TabPanel build_f_TabPanel90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPanel f_TabPanel90 = new org.gwtbootstrap3.client.ui.TabPanel();
      // Setup section.
      f_TabPanel90.add(get_f_NavTabs91());
      f_TabPanel90.add(get_f_TabContent95());
      f_TabPanel90.add(get_f_ClearFix105());
      f_TabPanel90.setTabPosition(org.gwtbootstrap3.client.ui.constants.TabPosition.RIGHT);

      return f_TabPanel90;
    }

    /**
     * Getter for f_NavTabs91 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs91() {
      return build_f_NavTabs91();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs91 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs91.add(get_f_TabListItem92());
      f_NavTabs91.add(get_f_TabListItem93());
      f_NavTabs91.add(get_f_TabListItem94());

      return f_NavTabs91;
    }

    /**
     * Getter for f_TabListItem92 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem92() {
      return build_f_TabListItem92();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem92() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem92 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem92.setText("Tab 13");
      f_TabListItem92.setActive(true);
      f_TabListItem92.setDataTarget("#tab13");

      return f_TabListItem92;
    }

    /**
     * Getter for f_TabListItem93 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem93() {
      return build_f_TabListItem93();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem93() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem93 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem93.setText("Tab 14");
      f_TabListItem93.setDataTarget("#tab14");

      return f_TabListItem93;
    }

    /**
     * Getter for f_TabListItem94 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem94() {
      return build_f_TabListItem94();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem94() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem94 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem94.setText("Tab 15");
      f_TabListItem94.setDataTarget("#tab15");

      return f_TabListItem94;
    }

    /**
     * Getter for f_TabContent95 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent95() {
      return build_f_TabContent95();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent95() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent95 = new org.gwtbootstrap3.client.ui.TabContent();
      // Setup section.
      f_TabContent95.add(get_f_TabPane96());
      f_TabContent95.add(get_f_TabPane99());
      f_TabContent95.add(get_f_TabPane102());

      return f_TabContent95;
    }

    /**
     * Getter for f_TabPane96 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane96() {
      return build_f_TabPane96();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane96() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane96 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane96.add(get_f_Heading97());
      f_TabPane96.add(get_f_Paragraph98());
      f_TabPane96.setActive(true);
      f_TabPane96.setId("tab13");

      return f_TabPane96;
    }

    /**
     * Getter for f_Heading97 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading97() {
      return build_f_Heading97();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading97() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading97 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading97.setText("Tab 13");

      return f_Heading97;
    }

    /**
     * Getter for f_Paragraph98 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph98() {
      return build_f_Paragraph98();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph98() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph98 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html19().asString());
      // Setup section.

      return f_Paragraph98;
    }

    /**
     * Getter for f_TabPane99 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane99() {
      return build_f_TabPane99();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane99 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane99.add(get_f_Heading100());
      f_TabPane99.add(get_f_Paragraph101());
      f_TabPane99.setId("tab14");

      return f_TabPane99;
    }

    /**
     * Getter for f_Heading100 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading100() {
      return build_f_Heading100();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading100() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading100 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading100.setText("Tab 14");

      return f_Heading100;
    }

    /**
     * Getter for f_Paragraph101 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph101() {
      return build_f_Paragraph101();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph101 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html20().asString());
      // Setup section.

      return f_Paragraph101;
    }

    /**
     * Getter for f_TabPane102 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane102() {
      return build_f_TabPane102();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane102() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane102 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane102.add(get_f_Heading103());
      f_TabPane102.add(get_f_Paragraph104());
      f_TabPane102.setId("tab15");

      return f_TabPane102;
    }

    /**
     * Getter for f_Heading103 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading103() {
      return build_f_Heading103();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading103() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading103 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading103.setText("Tab 15");

      return f_Heading103;
    }

    /**
     * Getter for f_Paragraph104 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph104() {
      return build_f_Paragraph104();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph104() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph104 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html21().asString());
      // Setup section.

      return f_Paragraph104;
    }

    /**
     * Getter for f_ClearFix105 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix105() {
      return build_f_ClearFix105();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix105() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix105 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix105;
    }

    /**
     * Getter for f_Column106 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column106() {
      return build_f_Column106();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column106() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column106 = new org.gwtbootstrap3.client.ui.Column("XS_12");
      // Setup section.
      f_Column106.add(get_f_TabPanel107());

      return f_Column106;
    }

    /**
     * Getter for f_TabPanel107 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TabPanel get_f_TabPanel107() {
      return build_f_TabPanel107();
    }
    private org.gwtbootstrap3.client.ui.TabPanel build_f_TabPanel107() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPanel f_TabPanel107 = new org.gwtbootstrap3.client.ui.TabPanel();
      // Setup section.
      f_TabPanel107.add(get_f_TabContent108());
      f_TabPanel107.add(get_f_NavTabs118());
      f_TabPanel107.setTabPosition(org.gwtbootstrap3.client.ui.constants.TabPosition.BELOW);

      return f_TabPanel107;
    }

    /**
     * Getter for f_TabContent108 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.TabContent get_f_TabContent108() {
      return build_f_TabContent108();
    }
    private org.gwtbootstrap3.client.ui.TabContent build_f_TabContent108() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabContent f_TabContent108 = new org.gwtbootstrap3.client.ui.TabContent();
      // Setup section.
      f_TabContent108.add(get_f_TabPane109());
      f_TabContent108.add(get_f_TabPane112());
      f_TabContent108.add(get_f_TabPane115());

      return f_TabContent108;
    }

    /**
     * Getter for f_TabPane109 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane109() {
      return build_f_TabPane109();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane109() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane109 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane109.add(get_f_Heading110());
      f_TabPane109.add(get_f_Paragraph111());
      f_TabPane109.setActive(true);
      f_TabPane109.setId("tab16");

      return f_TabPane109;
    }

    /**
     * Getter for f_Heading110 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading110() {
      return build_f_Heading110();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading110() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading110 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading110.setText("Tab 16");

      return f_Heading110;
    }

    /**
     * Getter for f_Paragraph111 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph111() {
      return build_f_Paragraph111();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph111() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph111 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html22().asString());
      // Setup section.

      return f_Paragraph111;
    }

    /**
     * Getter for f_TabPane112 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane112() {
      return build_f_TabPane112();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane112() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane112 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane112.add(get_f_Heading113());
      f_TabPane112.add(get_f_Paragraph114());
      f_TabPane112.setId("tab17");

      return f_TabPane112;
    }

    /**
     * Getter for f_Heading113 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading113() {
      return build_f_Heading113();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading113() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading113 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading113.setText("Tab 17");

      return f_Heading113;
    }

    /**
     * Getter for f_Paragraph114 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph114() {
      return build_f_Paragraph114();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph114() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph114 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html23().asString());
      // Setup section.

      return f_Paragraph114;
    }

    /**
     * Getter for f_TabPane115 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabPane get_f_TabPane115() {
      return build_f_TabPane115();
    }
    private org.gwtbootstrap3.client.ui.TabPane build_f_TabPane115() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabPane f_TabPane115 = new org.gwtbootstrap3.client.ui.TabPane();
      // Setup section.
      f_TabPane115.add(get_f_Heading116());
      f_TabPane115.add(get_f_Paragraph117());
      f_TabPane115.setId("tab18");

      return f_TabPane115;
    }

    /**
     * Getter for f_Heading116 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading116() {
      return build_f_Heading116();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading116() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading116 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading116.setText("Tab 18");

      return f_Heading116;
    }

    /**
     * Getter for f_Paragraph117 called 1 times. Type: DEFAULT. Build precedence: 11.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph117() {
      return build_f_Paragraph117();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph117() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph117 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html24().asString());
      // Setup section.

      return f_Paragraph117;
    }

    /**
     * Getter for f_NavTabs118 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.NavTabs get_f_NavTabs118() {
      return build_f_NavTabs118();
    }
    private org.gwtbootstrap3.client.ui.NavTabs build_f_NavTabs118() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.NavTabs f_NavTabs118 = new org.gwtbootstrap3.client.ui.NavTabs();
      // Setup section.
      f_NavTabs118.add(get_f_TabListItem119());
      f_NavTabs118.add(get_f_TabListItem120());
      f_NavTabs118.add(get_f_TabListItem121());

      return f_NavTabs118;
    }

    /**
     * Getter for f_TabListItem119 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem119() {
      return build_f_TabListItem119();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem119() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem119 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem119.setText("Tab 16");
      f_TabListItem119.setActive(true);
      f_TabListItem119.setDataTarget("#tab16");

      return f_TabListItem119;
    }

    /**
     * Getter for f_TabListItem120 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem120() {
      return build_f_TabListItem120();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem120() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem120 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem120.setText("Tab 17");
      f_TabListItem120.setDataTarget("#tab17");

      return f_TabListItem120;
    }

    /**
     * Getter for f_TabListItem121 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.TabListItem get_f_TabListItem121() {
      return build_f_TabListItem121();
    }
    private org.gwtbootstrap3.client.ui.TabListItem build_f_TabListItem121() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TabListItem f_TabListItem121 = new org.gwtbootstrap3.client.ui.TabListItem();
      // Setup section.
      f_TabListItem121.setText("Tab 18");
      f_TabListItem121.setDataTarget("#tab18");

      return f_TabListItem121;
    }

    /**
     * Getter for f_PanelFooter122 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter122() {
      return build_f_PanelFooter122();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter122() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter122 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter122.add(get_f_Heading123());
      f_PanelFooter122.add(get_f_Paragraph124());
      f_PanelFooter122.add(get_f_PrettyPre125());
      f_PanelFooter122.add(get_f_Heading126());
      f_PanelFooter122.add(get_f_Paragraph127());
      f_PanelFooter122.add(get_f_PrettyPre128());
      f_PanelFooter122.add(get_f_Heading129());
      f_PanelFooter122.add(get_f_Paragraph130());
      f_PanelFooter122.add(get_f_PrettyPre131());

      return f_PanelFooter122;
    }

    /**
     * Getter for f_Heading123 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading123() {
      return build_f_Heading123();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading123() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading123 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading123.setText("Left");

      return f_Heading123;
    }

    /**
     * Getter for f_Paragraph124 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph124() {
      return build_f_Paragraph124();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph124() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph124 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html25().asString());
      // Setup section.

      return f_Paragraph124;
    }

    /**
     * Getter for f_PrettyPre125 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre125() {
      return build_f_PrettyPre125();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre125() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre125 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre125.setHTML(template_html26().asString());
      f_PrettyPre125.addStyleName("lang-xml");

      return f_PrettyPre125;
    }

    /**
     * Getter for f_Heading126 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading126() {
      return build_f_Heading126();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading126() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading126 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading126.setText("Right");

      return f_Heading126;
    }

    /**
     * Getter for f_Paragraph127 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph127() {
      return build_f_Paragraph127();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph127() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph127 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html27().asString());
      // Setup section.

      return f_Paragraph127;
    }

    /**
     * Getter for f_PrettyPre128 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre128() {
      return build_f_PrettyPre128();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre128() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre128 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre128.setHTML(template_html28().asString());
      f_PrettyPre128.addStyleName("lang-xml");

      return f_PrettyPre128;
    }

    /**
     * Getter for f_Heading129 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading129() {
      return build_f_Heading129();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading129() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading129 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading129.setText("Below");

      return f_Heading129;
    }

    /**
     * Getter for f_Paragraph130 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph130() {
      return build_f_Paragraph130();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph130() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph130 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html29().asString());
      // Setup section.

      return f_Paragraph130;
    }

    /**
     * Getter for f_PrettyPre131 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre131() {
      return build_f_PrettyPre131();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre131() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre131 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre131.setHTML(template_html30().asString());
      f_PrettyPre131.addStyleName("lang-xml");

      return f_PrettyPre131;
    }
  }
}
