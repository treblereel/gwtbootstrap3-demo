// Template file: org/treblereel/mvp/view/components/Pagination.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.187")
public class Pagination_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Pagination>, org.treblereel.mvp.view.components.Pagination.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:Pagination&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true/false\" enabled=\"true/false\" text=\"...\" icon=\"...\"&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true/false\" enabled=\"true/false\" text=\"...\" icon=\"...\"&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true/false\" enabled=\"true/false\" text=\"...\" icon=\"...\"&gt;\\n &lt;/b:Pagination&gt;\\n\\n &lt;b:Pagination paginationSize=\"SMALL/LARGE\"&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true/false\" enabled=\"true/false\" text=\"...\" icon=\"...\"&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true/false\" enabled=\"true/false\" text=\"...\" icon=\"...\"&gt;\\n \\s\\s&lt;b:AnchorListItem active=\"true/false\" enabled=\"true/false\" text=\"...\" icon=\"...\"&gt;\\n &lt;/b:Pagination&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Pager/&gt;\\n\\n &lt;b:Pager previousText=\"...\" nextText=\"...\"/&gt;\\n\\n &lt;b:Pager previousText=\"...\" previousIcon=\"...\" nextText=\"...\" nextIcon=\"...\"/&gt;\\n\\n &lt;b:Pager previousText=\"...\" previousIcon=\"...\" nextText=\"...\" nextIcon=\"...\" alignToSides=\"true/false\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
  }

  Template template = new Pagination_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Pagination owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Pagination owner;


    public Widgets(final org.treblereel.mvp.view.components.Pagination owner) {
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
    private org.treblereel.mvp.view.components.Pagination_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Pagination_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Pagination_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Pagination_BinderImpl_GenBundleImpl();
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
      f_Column2.add(get_f_Panel27());

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
      f_PageHeader3.setText("Pagination");

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
      f_Panel4.add(get_f_PanelFooter25());

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
      f_PanelBody7.add(get_f_Pagination8());
      f_PanelBody7.add(get_f_ClearFix13());
      f_PanelBody7.add(get_f_Pagination14());
      f_PanelBody7.add(get_f_ClearFix19());
      f_PanelBody7.add(get_f_Pagination20());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Pagination8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_f_Pagination8() {
      return build_f_Pagination8();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_f_Pagination8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination f_Pagination8 = new org.gwtbootstrap3.client.ui.Pagination();
      // Setup section.
      f_Pagination8.add(get_f_AnchorListItem9());
      f_Pagination8.add(get_f_AnchorListItem10());
      f_Pagination8.add(get_f_AnchorListItem11());
      f_Pagination8.add(get_f_AnchorListItem12());

      return f_Pagination8;
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
      f_AnchorListItem9.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_LEFT);

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
      f_AnchorListItem10.setText("1");

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
      f_AnchorListItem11.setText("2");

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
      f_AnchorListItem12.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_RIGHT);

      return f_AnchorListItem12;
    }

    /**
     * Getter for f_ClearFix13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix13() {
      return build_f_ClearFix13();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix13 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix13;
    }

    /**
     * Getter for f_Pagination14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_f_Pagination14() {
      return build_f_Pagination14();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_f_Pagination14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination f_Pagination14 = new org.gwtbootstrap3.client.ui.Pagination();
      // Setup section.
      f_Pagination14.add(get_f_AnchorListItem15());
      f_Pagination14.add(get_f_AnchorListItem16());
      f_Pagination14.add(get_f_AnchorListItem17());
      f_Pagination14.add(get_f_AnchorListItem18());
      f_Pagination14.setPaginationSize(org.gwtbootstrap3.client.ui.constants.PaginationSize.SMALL);

      return f_Pagination14;
    }

    /**
     * Getter for f_AnchorListItem15 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem15() {
      return build_f_AnchorListItem15();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem15 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem15.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_LEFT);

      return f_AnchorListItem15;
    }

    /**
     * Getter for f_AnchorListItem16 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem16() {
      return build_f_AnchorListItem16();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem16 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem16.setText("1");

      return f_AnchorListItem16;
    }

    /**
     * Getter for f_AnchorListItem17 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem17() {
      return build_f_AnchorListItem17();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem17 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem17.setText("2");

      return f_AnchorListItem17;
    }

    /**
     * Getter for f_AnchorListItem18 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.AnchorListItem get_f_AnchorListItem18() {
      return build_f_AnchorListItem18();
    }
    private org.gwtbootstrap3.client.ui.AnchorListItem build_f_AnchorListItem18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.AnchorListItem f_AnchorListItem18 = new org.gwtbootstrap3.client.ui.AnchorListItem();
      // Setup section.
      f_AnchorListItem18.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_RIGHT);

      return f_AnchorListItem18;
    }

    /**
     * Getter for f_ClearFix19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix19() {
      return build_f_ClearFix19();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix19 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix19;
    }

    /**
     * Getter for f_Pagination20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_f_Pagination20() {
      return build_f_Pagination20();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_f_Pagination20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination f_Pagination20 = new org.gwtbootstrap3.client.ui.Pagination();
      // Setup section.
      f_Pagination20.add(get_f_AnchorListItem21());
      f_Pagination20.add(get_f_AnchorListItem22());
      f_Pagination20.add(get_f_AnchorListItem23());
      f_Pagination20.add(get_f_AnchorListItem24());
      f_Pagination20.setPaginationSize(org.gwtbootstrap3.client.ui.constants.PaginationSize.LARGE);

      return f_Pagination20;
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
      f_AnchorListItem21.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_LEFT);

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
      f_AnchorListItem22.setText("1");

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
      f_AnchorListItem23.setText("2");

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
      f_AnchorListItem24.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_RIGHT);

      return f_AnchorListItem24;
    }

    /**
     * Getter for f_PanelFooter25 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter25() {
      return build_f_PanelFooter25();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter25 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter25.add(get_f_PrettyPre26());

      return f_PanelFooter25;
    }

    /**
     * Getter for f_PrettyPre26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre26() {
      return build_f_PrettyPre26();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre26() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre26 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre26.setHTML(template_html1().asString());
      f_PrettyPre26.addStyleName("lang-xml");

      return f_PrettyPre26;
    }

    /**
     * Getter for f_Panel27 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel27() {
      return build_f_Panel27();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel27 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel27.add(get_f_PanelHeader28());
      f_Panel27.add(get_f_PanelBody30());
      f_Panel27.add(get_f_PanelFooter38());

      return f_Panel27;
    }

    /**
     * Getter for f_PanelHeader28 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader28() {
      return build_f_PanelHeader28();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader28 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader28.add(get_f_Heading29());

      return f_PanelHeader28;
    }

    /**
     * Getter for f_Heading29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading29() {
      return build_f_Heading29();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading29 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading29.setText("Pager");

      return f_Heading29;
    }

    /**
     * Getter for f_PanelBody30 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody30() {
      return build_f_PanelBody30();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody30 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody30.add(get_f_Pager31());
      f_PanelBody30.add(get_f_ClearFix32());
      f_PanelBody30.add(get_f_Pager33());
      f_PanelBody30.add(get_f_ClearFix34());
      f_PanelBody30.add(get_f_Pager35());
      f_PanelBody30.add(get_f_ClearFix36());
      f_PanelBody30.add(get_f_Pager37());

      return f_PanelBody30;
    }

    /**
     * Getter for f_Pager31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pager get_f_Pager31() {
      return build_f_Pager31();
    }
    private org.gwtbootstrap3.client.ui.Pager build_f_Pager31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pager f_Pager31 = new org.gwtbootstrap3.client.ui.Pager();
      // Setup section.

      return f_Pager31;
    }

    /**
     * Getter for f_ClearFix32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix32() {
      return build_f_ClearFix32();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix32 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix32;
    }

    /**
     * Getter for f_Pager33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pager get_f_Pager33() {
      return build_f_Pager33();
    }
    private org.gwtbootstrap3.client.ui.Pager build_f_Pager33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pager f_Pager33 = new org.gwtbootstrap3.client.ui.Pager();
      // Setup section.
      f_Pager33.setPreviousText("Older");
      f_Pager33.setNextText("Newer");

      return f_Pager33;
    }

    /**
     * Getter for f_ClearFix34 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix34() {
      return build_f_ClearFix34();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix34 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix34;
    }

    /**
     * Getter for f_Pager35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pager get_f_Pager35() {
      return build_f_Pager35();
    }
    private org.gwtbootstrap3.client.ui.Pager build_f_Pager35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pager f_Pager35 = new org.gwtbootstrap3.client.ui.Pager();
      // Setup section.
      f_Pager35.setPreviousIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_LEFT);
      f_Pager35.setPreviousText("Older");
      f_Pager35.setNextText("Newer");
      f_Pager35.setNextIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_RIGHT);

      return f_Pager35;
    }

    /**
     * Getter for f_ClearFix36 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix36() {
      return build_f_ClearFix36();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix36 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix36;
    }

    /**
     * Getter for f_Pager37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pager get_f_Pager37() {
      return build_f_Pager37();
    }
    private org.gwtbootstrap3.client.ui.Pager build_f_Pager37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pager f_Pager37 = new org.gwtbootstrap3.client.ui.Pager();
      // Setup section.
      f_Pager37.setAlignToSides(true);
      f_Pager37.setPreviousIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_LEFT);
      f_Pager37.setPreviousText("Older");
      f_Pager37.setNextText("Newer");
      f_Pager37.setNextIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANGLE_DOUBLE_RIGHT);

      return f_Pager37;
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
      f_PrettyPre39.setHTML(template_html2().asString());
      f_PrettyPre39.addStyleName("lang-xml");

      return f_PrettyPre39;
    }
  }
}
