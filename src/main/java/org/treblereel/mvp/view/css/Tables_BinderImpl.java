// Template file: org/treblereel/mvp/view/css/Tables.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.css;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.27")
public class Tables_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.css.Tables>, org.treblereel.mvp.view.css.Tables.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:CellTable bordered=\"true\" condensed=\"true\" striped=\"true\" hover=\"true\" height=\"...\" width=\"...\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("<strong>NOTE: The pagination.rebuild() after adding/removing data from the grid.</strong>")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("// Adding / Removing data\\n pagination.rebuild(simplePager);\\n\\n // Setting the RangeChangeHandler\\n cellTable.addRangeChangeHandler(new RangeChangeEvent.Handler() {\\n \\s\\s@Override\\n \\s\\spublic void onRangeChange(RangeChangeEvent event) {\\n \\s\\s\\s\\spagination.rebuild(simplePager);\\n \\s\\s}\\n });")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:DataGrid bordered=\"true\" condensed=\"true\" striped=\"true\" hover=\"true\" height=\"...\" width=\"...\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("<strong>NOTE: The pagination.rebuild() after adding/removing data from the grid.</strong>")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("// Adding / Removing data\\n pagination.rebuild(simplePager);\\n\\n // Setting the RangeChangeHandler\\n dataGrid.addRangeChangeHandler(new RangeChangeEvent.Handler() {\\n \\s\\s@Override\\n \\s\\spublic void onRangeChange(RangeChangeEvent event) {\\n \\s\\s\\s\\spagination.rebuild(simplePager);\\n \\s\\s}\\n });")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
  }

  Template template = new Tables_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.css.Tables owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.css.Tables owner;


    public Widgets(final org.treblereel.mvp.view.css.Tables owner) {
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
    private org.treblereel.mvp.view.css.Tables_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.css.Tables_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.css.Tables_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.css.Tables_BinderImpl_GenBundleImpl();
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
      f_PageHeader3.setText("Tables");

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
      f_Panel4.add(get_f_PanelFooter8());

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
      f_Heading6.setText("Cell Table");

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
      f_PanelBody7.add(get_cellTable());
      f_PanelBody7.add(get_cellTablePagination());

      return f_PanelBody7;
    }

    /**
     * Getter for cellTable called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.gwt.CellTable get_cellTable() {
      return build_cellTable();
    }
    private org.gwtbootstrap3.client.ui.gwt.CellTable build_cellTable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.CellTable cellTable = owner.cellTable;
      assert cellTable != null : "UiField cellTable with 'provided = true' was null";
      // Setup section.
      cellTable.setStriped(true);
      cellTable.setHover(true);
      cellTable.setWidth("100%");
      cellTable.setCondensed(true);
      cellTable.setBordered(true);
      cellTable.setHeight("300px");

      return cellTable;
    }

    /**
     * Getter for cellTablePagination called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_cellTablePagination() {
      return build_cellTablePagination();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_cellTablePagination() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination cellTablePagination = new org.gwtbootstrap3.client.ui.Pagination();
      // Setup section.

      this.owner.cellTablePagination = cellTablePagination;

      return cellTablePagination;
    }

    /**
     * Getter for f_PanelFooter8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter8() {
      return build_f_PanelFooter8();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter8 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter8.add(get_f_Heading9());
      f_PanelFooter8.add(get_f_PrettyPre10());
      f_PanelFooter8.add(get_f_Heading11());
      f_PanelFooter8.add(get_f_Paragraph12());
      f_PanelFooter8.add(get_f_PrettyPre13());

      return f_PanelFooter8;
    }

    /**
     * Getter for f_Heading9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading9() {
      return build_f_Heading9();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading9 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading9.setText("UiBinder");

      return f_Heading9;
    }

    /**
     * Getter for f_PrettyPre10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre10() {
      return build_f_PrettyPre10();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre10() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre10 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre10.setHTML(template_html1().asString());
      f_PrettyPre10.addStyleName("lang-xml");

      return f_PrettyPre10;
    }

    /**
     * Getter for f_Heading11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading11() {
      return build_f_Heading11();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading11 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading11.setText("Java code");

      return f_Heading11;
    }

    /**
     * Getter for f_Paragraph12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph12() {
      return build_f_Paragraph12();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph12 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.

      return f_Paragraph12;
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
      f_PrettyPre13.setHTML(template_html3().asString());
      f_PrettyPre13.addStyleName("lang-java");

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
      f_Panel14.add(get_f_PanelFooter18());

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
      f_Heading16.setText("Data Grid");

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
      f_PanelBody17.add(get_dataGrid());
      f_PanelBody17.add(get_dataGridPagination());

      return f_PanelBody17;
    }

    /**
     * Getter for dataGrid called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.gwt.DataGrid get_dataGrid() {
      return build_dataGrid();
    }
    private org.gwtbootstrap3.client.ui.gwt.DataGrid build_dataGrid() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.DataGrid dataGrid = owner.dataGrid;
      assert dataGrid != null : "UiField dataGrid with 'provided = true' was null";
      // Setup section.
      dataGrid.setStriped(true);
      dataGrid.setHover(true);
      dataGrid.setWidth("100%");
      dataGrid.setCondensed(true);
      dataGrid.setBordered(true);
      dataGrid.setHeight("300px");

      return dataGrid;
    }

    /**
     * Getter for dataGridPagination called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_dataGridPagination() {
      return build_dataGridPagination();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_dataGridPagination() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination dataGridPagination = new org.gwtbootstrap3.client.ui.Pagination();
      // Setup section.

      this.owner.dataGridPagination = dataGridPagination;

      return dataGridPagination;
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
      f_PanelFooter18.add(get_f_Heading19());
      f_PanelFooter18.add(get_f_PrettyPre20());
      f_PanelFooter18.add(get_f_Heading21());
      f_PanelFooter18.add(get_f_Paragraph22());
      f_PanelFooter18.add(get_f_PrettyPre23());

      return f_PanelFooter18;
    }

    /**
     * Getter for f_Heading19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading19() {
      return build_f_Heading19();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading19 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading19.setText("UiBinder");

      return f_Heading19;
    }

    /**
     * Getter for f_PrettyPre20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre20() {
      return build_f_PrettyPre20();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre20() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre20 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre20.setHTML(template_html4().asString());
      f_PrettyPre20.addStyleName("lang-xml");

      return f_PrettyPre20;
    }

    /**
     * Getter for f_Heading21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading21() {
      return build_f_Heading21();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading21 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading21.setText("Java code");

      return f_Heading21;
    }

    /**
     * Getter for f_Paragraph22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph22() {
      return build_f_Paragraph22();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph22 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.

      return f_Paragraph22;
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
      f_PrettyPre23.setHTML(template_html6().asString());
      f_PrettyPre23.addStyleName("lang-java");

      return f_PrettyPre23;
    }
  }
}
