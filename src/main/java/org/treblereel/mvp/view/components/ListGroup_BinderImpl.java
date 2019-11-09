// Template file: org/treblereel/mvp/view/components/ListGroup.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.463")
public class ListGroup_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.ListGroup>, org.treblereel.mvp.view.components.ListGroup.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:ListGroup&gt;\\n \\s\\s&lt;b:ListGroupItem text=\"\"/&gt;\\n \\s\\s&lt;b:ListGroupItem text=\"\"/&gt;\\n \\s\\s&lt;b:ListGroupItem text=\"\"/&gt;\\n &lt;/b:ListGroup&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:ListGroup&gt;\\n \\s\\s&lt;b:ListGroupItem type=\"SUCCESS\" text=\"\"/&gt;\\n \\s\\s&lt;b:ListGroupItem type=\"INFO\" text=\"\"/&gt;\\n \\s\\s&lt;b:ListGroupItem type=\"WARNING\" text=\"\"/&gt;\\n \\s\\s&lt;b:ListGroupItem type=\"DANGER\" text=\"\"/&gt;\\n &lt;/b:ListGroup&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:ListGroup&gt;\\n \\s\\s&lt;b:ListGroupItem text=\"\"&gt;\\n \\s\\s\\s\\s&lt;b:Badge text=\"\"/&gt;\\n \\s\\s&lt;/b:ListGroupItem&gt;\\n \\s\\s&lt;b:ListGroupItem text=\"\"/&gt;\\n \\s\\s\\s\\s&lt;b:Badge text=\"\"/&gt;\\n \\s\\s&lt;/b:ListGroupItem&gt;\\n \\s\\s&lt;b:ListGroupItem text=\"\"/&gt;\\n \\s\\s\\s\\s&lt;b:Badge text=\"\"/&gt;\\n \\s\\s&lt;/b:ListGroupItem&gt;\\n &lt;/b:ListGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;b:LinkedGroup&gt;\\n \\s\\s&lt;b:LinkedGroupItem active=\"true\" text=\"\"/&gt;\\n \\s\\s&lt;b:LinkedGroupItem text=\"\"/&gt;\\n \\s\\s&lt;b:LinkedGroupItem text=\"\"/&gt;\\n &lt;/b:LinkedGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:LinkedGroup&gt;\\n \\s\\s&lt;b:LinkedGroupItem active=\"true\"&gt;\\n \\s\\s\\s\\s&lt;b:Heading size=\"H3\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:LinkedGroupItemText text=\"...\"/&gt;\\n \\s\\s&lt;/b:LinkedGroupItem&gt;\\n \\s\\s&lt;b:LinkedGroupItem&gt;\\n \\s\\s\\s\\s&lt;b:Heading size=\"H3\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:LinkedGroupItemText text=\"...\"/&gt;\\n \\s\\s&lt;/b:LinkedGroupItem&gt;\\n \\s\\s&lt;b:LinkedGroupItem&gt;\\n \\s\\s\\s\\s&lt;b:Heading size=\"H3\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:LinkedGroupItemText text=\"...\"/&gt;\\n \\s\\s&lt;/b:LinkedGroupItem&gt;\\n &lt;/b:LinkedGroup&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
  }

  Template template = new ListGroup_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.ListGroup owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.ListGroup owner;


    public Widgets(final org.treblereel.mvp.view.components.ListGroup owner) {
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
    private org.treblereel.mvp.view.components.ListGroup_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.ListGroup_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.ListGroup_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.ListGroup_BinderImpl_GenBundleImpl();
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
      f_Column2.add(get_f_Panel15());
      f_Column2.add(get_f_Panel26());
      f_Column2.add(get_f_Panel41());
      f_Column2.add(get_f_Panel52());

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
      f_PageHeader3.setText("List Groups");

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
      f_Panel4.add(get_f_PanelFooter13());

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
      f_PanelBody7.add(get_f_ListGroup8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_ListGroup8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ListGroup get_f_ListGroup8() {
      return build_f_ListGroup8();
    }
    private org.gwtbootstrap3.client.ui.ListGroup build_f_ListGroup8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroup f_ListGroup8 = new org.gwtbootstrap3.client.ui.ListGroup();
      // Setup section.
      f_ListGroup8.add(get_f_ListGroupItem9());
      f_ListGroup8.add(get_f_ListGroupItem10());
      f_ListGroup8.add(get_f_ListGroupItem11());
      f_ListGroup8.add(get_f_ListGroupItem12());

      return f_ListGroup8;
    }

    /**
     * Getter for f_ListGroupItem9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem9() {
      return build_f_ListGroupItem9();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem9 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem9.setText("Cras justo odio");

      return f_ListGroupItem9;
    }

    /**
     * Getter for f_ListGroupItem10 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem10() {
      return build_f_ListGroupItem10();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem10 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem10.setText("Dapibus ac facilisis in");

      return f_ListGroupItem10;
    }

    /**
     * Getter for f_ListGroupItem11 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem11() {
      return build_f_ListGroupItem11();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem11 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem11.setText("Morbi leo risus");

      return f_ListGroupItem11;
    }

    /**
     * Getter for f_ListGroupItem12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem12() {
      return build_f_ListGroupItem12();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem12 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem12.setText("Vestibulum at eros");

      return f_ListGroupItem12;
    }

    /**
     * Getter for f_PanelFooter13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter13() {
      return build_f_PanelFooter13();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter13 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter13.add(get_f_PrettyPre14());

      return f_PanelFooter13;
    }

    /**
     * Getter for f_PrettyPre14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre14() {
      return build_f_PrettyPre14();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre14() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre14 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre14.setHTML(template_html1().asString());
      f_PrettyPre14.addStyleName("lang-xml");

      return f_PrettyPre14;
    }

    /**
     * Getter for f_Panel15 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel15() {
      return build_f_Panel15();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel15 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel15.add(get_f_PanelHeader16());
      f_Panel15.add(get_f_PanelBody18());
      f_Panel15.add(get_f_PanelFooter24());

      return f_Panel15;
    }

    /**
     * Getter for f_PanelHeader16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader16() {
      return build_f_PanelHeader16();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader16 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader16.add(get_f_Heading17());

      return f_PanelHeader16;
    }

    /**
     * Getter for f_Heading17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading17() {
      return build_f_Heading17();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading17 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading17.setText("Contextual Classes");

      return f_Heading17;
    }

    /**
     * Getter for f_PanelBody18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody18() {
      return build_f_PanelBody18();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody18 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody18.add(get_f_ListGroup19());

      return f_PanelBody18;
    }

    /**
     * Getter for f_ListGroup19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ListGroup get_f_ListGroup19() {
      return build_f_ListGroup19();
    }
    private org.gwtbootstrap3.client.ui.ListGroup build_f_ListGroup19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroup f_ListGroup19 = new org.gwtbootstrap3.client.ui.ListGroup();
      // Setup section.
      f_ListGroup19.add(get_f_ListGroupItem20());
      f_ListGroup19.add(get_f_ListGroupItem21());
      f_ListGroup19.add(get_f_ListGroupItem22());
      f_ListGroup19.add(get_f_ListGroupItem23());

      return f_ListGroup19;
    }

    /**
     * Getter for f_ListGroupItem20 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem20() {
      return build_f_ListGroupItem20();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem20 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem20.setText("Cras justo odio");
      f_ListGroupItem20.setType(org.gwtbootstrap3.client.ui.constants.ListGroupItemType.SUCCESS);

      return f_ListGroupItem20;
    }

    /**
     * Getter for f_ListGroupItem21 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem21() {
      return build_f_ListGroupItem21();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem21 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem21.setText("Dapibus ac facilisis in");
      f_ListGroupItem21.setType(org.gwtbootstrap3.client.ui.constants.ListGroupItemType.INFO);

      return f_ListGroupItem21;
    }

    /**
     * Getter for f_ListGroupItem22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem22() {
      return build_f_ListGroupItem22();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem22 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem22.setText("Morbi leo risus");
      f_ListGroupItem22.setType(org.gwtbootstrap3.client.ui.constants.ListGroupItemType.WARNING);

      return f_ListGroupItem22;
    }

    /**
     * Getter for f_ListGroupItem23 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem23() {
      return build_f_ListGroupItem23();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem23 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem23.setText("Vestibulum at eros");
      f_ListGroupItem23.setType(org.gwtbootstrap3.client.ui.constants.ListGroupItemType.DANGER);

      return f_ListGroupItem23;
    }

    /**
     * Getter for f_PanelFooter24 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter24() {
      return build_f_PanelFooter24();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter24 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter24.add(get_f_PrettyPre25());

      return f_PanelFooter24;
    }

    /**
     * Getter for f_PrettyPre25 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre25() {
      return build_f_PrettyPre25();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre25() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre25 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre25.setHTML(template_html2().asString());
      f_PrettyPre25.addStyleName("lang-xml");

      return f_PrettyPre25;
    }

    /**
     * Getter for f_Panel26 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel26() {
      return build_f_Panel26();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel26 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel26.add(get_f_PanelHeader27());
      f_Panel26.add(get_f_PanelBody29());
      f_Panel26.add(get_f_PanelFooter39());

      return f_Panel26;
    }

    /**
     * Getter for f_PanelHeader27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader27() {
      return build_f_PanelHeader27();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader27 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader27.add(get_f_Heading28());

      return f_PanelHeader27;
    }

    /**
     * Getter for f_Heading28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading28() {
      return build_f_Heading28();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading28 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading28.setText("With Badges");

      return f_Heading28;
    }

    /**
     * Getter for f_PanelBody29 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody29() {
      return build_f_PanelBody29();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody29 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody29.add(get_f_ListGroup30());

      return f_PanelBody29;
    }

    /**
     * Getter for f_ListGroup30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.ListGroup get_f_ListGroup30() {
      return build_f_ListGroup30();
    }
    private org.gwtbootstrap3.client.ui.ListGroup build_f_ListGroup30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroup f_ListGroup30 = new org.gwtbootstrap3.client.ui.ListGroup();
      // Setup section.
      f_ListGroup30.add(get_f_ListGroupItem31());
      f_ListGroup30.add(get_f_ListGroupItem33());
      f_ListGroup30.add(get_f_ListGroupItem35());
      f_ListGroup30.add(get_f_ListGroupItem37());

      return f_ListGroup30;
    }

    /**
     * Getter for f_ListGroupItem31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem31() {
      return build_f_ListGroupItem31();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem31 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem31.add(get_f_Badge32());
      f_ListGroupItem31.setText("Cras justo odio");

      return f_ListGroupItem31;
    }

    /**
     * Getter for f_Badge32 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Badge get_f_Badge32() {
      return build_f_Badge32();
    }
    private org.gwtbootstrap3.client.ui.Badge build_f_Badge32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Badge f_Badge32 = new org.gwtbootstrap3.client.ui.Badge();
      // Setup section.
      f_Badge32.setText("12");

      return f_Badge32;
    }

    /**
     * Getter for f_ListGroupItem33 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem33() {
      return build_f_ListGroupItem33();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem33 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem33.add(get_f_Badge34());
      f_ListGroupItem33.setText("Dapibus ac facilisis in");

      return f_ListGroupItem33;
    }

    /**
     * Getter for f_Badge34 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Badge get_f_Badge34() {
      return build_f_Badge34();
    }
    private org.gwtbootstrap3.client.ui.Badge build_f_Badge34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Badge f_Badge34 = new org.gwtbootstrap3.client.ui.Badge();
      // Setup section.
      f_Badge34.setText("12");

      return f_Badge34;
    }

    /**
     * Getter for f_ListGroupItem35 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem35() {
      return build_f_ListGroupItem35();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem35 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem35.add(get_f_Badge36());
      f_ListGroupItem35.setText("Morbi leo risus");

      return f_ListGroupItem35;
    }

    /**
     * Getter for f_Badge36 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Badge get_f_Badge36() {
      return build_f_Badge36();
    }
    private org.gwtbootstrap3.client.ui.Badge build_f_Badge36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Badge f_Badge36 = new org.gwtbootstrap3.client.ui.Badge();
      // Setup section.
      f_Badge36.setText("12");

      return f_Badge36;
    }

    /**
     * Getter for f_ListGroupItem37 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListGroupItem get_f_ListGroupItem37() {
      return build_f_ListGroupItem37();
    }
    private org.gwtbootstrap3.client.ui.ListGroupItem build_f_ListGroupItem37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListGroupItem f_ListGroupItem37 = new org.gwtbootstrap3.client.ui.ListGroupItem();
      // Setup section.
      f_ListGroupItem37.add(get_f_Badge38());
      f_ListGroupItem37.setText("Vestibulum at eros");

      return f_ListGroupItem37;
    }

    /**
     * Getter for f_Badge38 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Badge get_f_Badge38() {
      return build_f_Badge38();
    }
    private org.gwtbootstrap3.client.ui.Badge build_f_Badge38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Badge f_Badge38 = new org.gwtbootstrap3.client.ui.Badge();
      // Setup section.
      f_Badge38.setText("12");

      return f_Badge38;
    }

    /**
     * Getter for f_PanelFooter39 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter39() {
      return build_f_PanelFooter39();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter39 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter39.add(get_f_PrettyPre40());

      return f_PanelFooter39;
    }

    /**
     * Getter for f_PrettyPre40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre40() {
      return build_f_PrettyPre40();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre40() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre40 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre40.setHTML(template_html3().asString());
      f_PrettyPre40.addStyleName("lang-xml");

      return f_PrettyPre40;
    }

    /**
     * Getter for f_Panel41 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel41() {
      return build_f_Panel41();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel41 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel41.add(get_f_PanelHeader42());
      f_Panel41.add(get_f_PanelBody44());
      f_Panel41.add(get_f_PanelFooter50());

      return f_Panel41;
    }

    /**
     * Getter for f_PanelHeader42 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader42() {
      return build_f_PanelHeader42();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader42 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader42.add(get_f_Heading43());

      return f_PanelHeader42;
    }

    /**
     * Getter for f_Heading43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading43() {
      return build_f_Heading43();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading43 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading43.setText("Linked Items");

      return f_Heading43;
    }

    /**
     * Getter for f_PanelBody44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody44() {
      return build_f_PanelBody44();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody44 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody44.add(get_f_LinkedGroup45());

      return f_PanelBody44;
    }

    /**
     * Getter for f_LinkedGroup45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroup get_f_LinkedGroup45() {
      return build_f_LinkedGroup45();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroup build_f_LinkedGroup45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroup f_LinkedGroup45 = new org.gwtbootstrap3.client.ui.LinkedGroup();
      // Setup section.
      f_LinkedGroup45.add(get_f_LinkedGroupItem46());
      f_LinkedGroup45.add(get_f_LinkedGroupItem47());
      f_LinkedGroup45.add(get_f_LinkedGroupItem48());
      f_LinkedGroup45.add(get_f_LinkedGroupItem49());

      return f_LinkedGroup45;
    }

    /**
     * Getter for f_LinkedGroupItem46 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItem get_f_LinkedGroupItem46() {
      return build_f_LinkedGroupItem46();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItem build_f_LinkedGroupItem46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItem f_LinkedGroupItem46 = new org.gwtbootstrap3.client.ui.LinkedGroupItem();
      // Setup section.
      f_LinkedGroupItem46.setActive(true);
      f_LinkedGroupItem46.setText("Cras justo odio");

      return f_LinkedGroupItem46;
    }

    /**
     * Getter for f_LinkedGroupItem47 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItem get_f_LinkedGroupItem47() {
      return build_f_LinkedGroupItem47();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItem build_f_LinkedGroupItem47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItem f_LinkedGroupItem47 = new org.gwtbootstrap3.client.ui.LinkedGroupItem();
      // Setup section.
      f_LinkedGroupItem47.setText("Dapibus ac facilisis in");

      return f_LinkedGroupItem47;
    }

    /**
     * Getter for f_LinkedGroupItem48 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItem get_f_LinkedGroupItem48() {
      return build_f_LinkedGroupItem48();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItem build_f_LinkedGroupItem48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItem f_LinkedGroupItem48 = new org.gwtbootstrap3.client.ui.LinkedGroupItem();
      // Setup section.
      f_LinkedGroupItem48.setText("Morbi leo risus");

      return f_LinkedGroupItem48;
    }

    /**
     * Getter for f_LinkedGroupItem49 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItem get_f_LinkedGroupItem49() {
      return build_f_LinkedGroupItem49();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItem build_f_LinkedGroupItem49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItem f_LinkedGroupItem49 = new org.gwtbootstrap3.client.ui.LinkedGroupItem();
      // Setup section.
      f_LinkedGroupItem49.setText("Vestibulum at eros");

      return f_LinkedGroupItem49;
    }

    /**
     * Getter for f_PanelFooter50 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter50() {
      return build_f_PanelFooter50();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter50 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter50.add(get_f_PrettyPre51());

      return f_PanelFooter50;
    }

    /**
     * Getter for f_PrettyPre51 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre51() {
      return build_f_PrettyPre51();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre51() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre51 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre51.setHTML(template_html4().asString());
      f_PrettyPre51.addStyleName("lang-xml");

      return f_PrettyPre51;
    }

    /**
     * Getter for f_Panel52 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel52() {
      return build_f_Panel52();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel52 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel52.add(get_f_PanelHeader53());
      f_Panel52.add(get_f_PanelBody55());
      f_Panel52.add(get_f_PanelFooter66());

      return f_Panel52;
    }

    /**
     * Getter for f_PanelHeader53 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader53() {
      return build_f_PanelHeader53();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader53 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader53.add(get_f_Heading54());

      return f_PanelHeader53;
    }

    /**
     * Getter for f_Heading54 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading54() {
      return build_f_Heading54();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading54 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading54.setText("Custom Content");

      return f_Heading54;
    }

    /**
     * Getter for f_PanelBody55 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody55() {
      return build_f_PanelBody55();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody55 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody55.add(get_f_LinkedGroup56());

      return f_PanelBody55;
    }

    /**
     * Getter for f_LinkedGroup56 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroup get_f_LinkedGroup56() {
      return build_f_LinkedGroup56();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroup build_f_LinkedGroup56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroup f_LinkedGroup56 = new org.gwtbootstrap3.client.ui.LinkedGroup();
      // Setup section.
      f_LinkedGroup56.add(get_f_LinkedGroupItem57());
      f_LinkedGroup56.add(get_f_LinkedGroupItem60());
      f_LinkedGroup56.add(get_f_LinkedGroupItem63());

      return f_LinkedGroup56;
    }

    /**
     * Getter for f_LinkedGroupItem57 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItem get_f_LinkedGroupItem57() {
      return build_f_LinkedGroupItem57();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItem build_f_LinkedGroupItem57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItem f_LinkedGroupItem57 = new org.gwtbootstrap3.client.ui.LinkedGroupItem();
      // Setup section.
      f_LinkedGroupItem57.add(get_f_Heading58());
      f_LinkedGroupItem57.add(get_f_LinkedGroupItemText59());
      f_LinkedGroupItem57.setActive(true);

      return f_LinkedGroupItem57;
    }

    /**
     * Getter for f_Heading58 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading58() {
      return build_f_Heading58();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading58 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading58.setText("Heading");

      return f_Heading58;
    }

    /**
     * Getter for f_LinkedGroupItemText59 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItemText get_f_LinkedGroupItemText59() {
      return build_f_LinkedGroupItemText59();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItemText build_f_LinkedGroupItemText59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItemText f_LinkedGroupItemText59 = new org.gwtbootstrap3.client.ui.LinkedGroupItemText();
      // Setup section.
      f_LinkedGroupItemText59.setText("Insert text here...");

      return f_LinkedGroupItemText59;
    }

    /**
     * Getter for f_LinkedGroupItem60 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItem get_f_LinkedGroupItem60() {
      return build_f_LinkedGroupItem60();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItem build_f_LinkedGroupItem60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItem f_LinkedGroupItem60 = new org.gwtbootstrap3.client.ui.LinkedGroupItem();
      // Setup section.
      f_LinkedGroupItem60.add(get_f_Heading61());
      f_LinkedGroupItem60.add(get_f_LinkedGroupItemText62());

      return f_LinkedGroupItem60;
    }

    /**
     * Getter for f_Heading61 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading61() {
      return build_f_Heading61();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading61 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading61.setText("Heading");

      return f_Heading61;
    }

    /**
     * Getter for f_LinkedGroupItemText62 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItemText get_f_LinkedGroupItemText62() {
      return build_f_LinkedGroupItemText62();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItemText build_f_LinkedGroupItemText62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItemText f_LinkedGroupItemText62 = new org.gwtbootstrap3.client.ui.LinkedGroupItemText();
      // Setup section.
      f_LinkedGroupItemText62.setText("Insert text here...");

      return f_LinkedGroupItemText62;
    }

    /**
     * Getter for f_LinkedGroupItem63 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItem get_f_LinkedGroupItem63() {
      return build_f_LinkedGroupItem63();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItem build_f_LinkedGroupItem63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItem f_LinkedGroupItem63 = new org.gwtbootstrap3.client.ui.LinkedGroupItem();
      // Setup section.
      f_LinkedGroupItem63.add(get_f_Heading64());
      f_LinkedGroupItem63.add(get_f_LinkedGroupItemText65());

      return f_LinkedGroupItem63;
    }

    /**
     * Getter for f_Heading64 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading64() {
      return build_f_Heading64();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading64 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading64.setText("Heading");

      return f_Heading64;
    }

    /**
     * Getter for f_LinkedGroupItemText65 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.LinkedGroupItemText get_f_LinkedGroupItemText65() {
      return build_f_LinkedGroupItemText65();
    }
    private org.gwtbootstrap3.client.ui.LinkedGroupItemText build_f_LinkedGroupItemText65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.LinkedGroupItemText f_LinkedGroupItemText65 = new org.gwtbootstrap3.client.ui.LinkedGroupItemText();
      // Setup section.
      f_LinkedGroupItemText65.setText("Insert text here...");

      return f_LinkedGroupItemText65;
    }

    /**
     * Getter for f_PanelFooter66 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter66() {
      return build_f_PanelFooter66();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter66 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter66.add(get_f_PrettyPre67());

      return f_PanelFooter66;
    }

    /**
     * Getter for f_PrettyPre67 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre67() {
      return build_f_PrettyPre67();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre67() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre67 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre67.setHTML(template_html5().asString());
      f_PrettyPre67.addStyleName("lang-xml");

      return f_PrettyPre67;
    }
  }
}
