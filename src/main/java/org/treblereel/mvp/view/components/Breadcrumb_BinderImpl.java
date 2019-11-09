// Template file: org/treblereel/mvp/view/components/Breadcrumb.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.365")
public class Breadcrumb_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Breadcrumb>, org.treblereel.mvp.view.components.Breadcrumb.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:Breadcrumbs&gt;\\n \\s\\s&lt;b:AnchorListItem text=\"...\"&gt;\\n \\s\\s&lt;b:AnchorListItem text=\"...\"&gt;\\n \\s\\s&lt;b:AnchorListItem text=\"...\"&gt;\\n &lt;/b:Breadcrumbs&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
  }

  Template template = new Breadcrumb_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Breadcrumb owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Breadcrumb owner;


    public Widgets(final org.treblereel.mvp.view.components.Breadcrumb owner) {
      this.owner = owner;
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Breadcrumb_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Breadcrumb_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Breadcrumb_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Breadcrumb_BinderImpl_GenBundleImpl();
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
      f_PageHeader3.setText("Breadcrumbs");

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
      f_PanelBody7.add(get_f_Breadcrumbs8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Breadcrumbs8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Breadcrumbs get_f_Breadcrumbs8() {
      return build_f_Breadcrumbs8();
    }
    private org.gwtbootstrap3.client.ui.Breadcrumbs build_f_Breadcrumbs8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Breadcrumbs f_Breadcrumbs8 = new org.gwtbootstrap3.client.ui.Breadcrumbs();
      // Setup section.
      f_Breadcrumbs8.add(get_f_AnchorListItem9());
      f_Breadcrumbs8.add(get_f_AnchorListItem10());
      f_Breadcrumbs8.add(get_f_AnchorListItem11());

      return f_Breadcrumbs8;
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
      f_AnchorListItem9.setText("One");

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
      f_AnchorListItem10.setText("Two");

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
      f_AnchorListItem11.setText("Three");

      return f_AnchorListItem11;
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
  }
}
