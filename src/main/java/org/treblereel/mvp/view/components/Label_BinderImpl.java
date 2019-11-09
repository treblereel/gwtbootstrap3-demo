// Template file: org/treblereel/mvp/view/components/Label.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.541")
public class Label_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Label>, org.treblereel.mvp.view.components.Label.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:Label text=\"...\"/&gt;\\n &lt;b:Label text=\"...\" type=\"PRIMARY\"/&gt;\\n &lt;b:Label text=\"...\" type=\"SUCCESS\"/&gt;\\n &lt;b:Label text=\"...\" type=\"INFO\"/&gt;\\n &lt;b:Label text=\"...\" type=\"WARNING\"/&gt;\\n &lt;b:Label text=\"...\" type=\"DANGER\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
  }

  Template template = new Label_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Label owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Label owner;


    public Widgets(final org.treblereel.mvp.view.components.Label owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Label_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Label_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Label_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Label_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 6 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Label_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.components.Label_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.components.Label_BinderImpl_GenCss_style build_style() {
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
      f_PageHeader3.setText("Labels");

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
      f_PanelBody7.add(get_f_Label8());
      f_PanelBody7.add(get_f_Label9());
      f_PanelBody7.add(get_f_Label10());
      f_PanelBody7.add(get_f_Label11());
      f_PanelBody7.add(get_f_Label12());
      f_PanelBody7.add(get_f_Label13());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Label8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Label get_f_Label8() {
      return build_f_Label8();
    }
    private org.gwtbootstrap3.client.ui.Label build_f_Label8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label f_Label8 = new org.gwtbootstrap3.client.ui.Label();
      // Setup section.
      f_Label8.addStyleName("" + get_style().spacing() + "");
      f_Label8.setText("Default");

      return f_Label8;
    }

    /**
     * Getter for f_Label9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Label get_f_Label9() {
      return build_f_Label9();
    }
    private org.gwtbootstrap3.client.ui.Label build_f_Label9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label f_Label9 = new org.gwtbootstrap3.client.ui.Label();
      // Setup section.
      f_Label9.addStyleName("" + get_style().spacing() + "");
      f_Label9.setText("Primary");
      f_Label9.setType(org.gwtbootstrap3.client.ui.constants.LabelType.PRIMARY);

      return f_Label9;
    }

    /**
     * Getter for f_Label10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Label get_f_Label10() {
      return build_f_Label10();
    }
    private org.gwtbootstrap3.client.ui.Label build_f_Label10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label f_Label10 = new org.gwtbootstrap3.client.ui.Label();
      // Setup section.
      f_Label10.addStyleName("" + get_style().spacing() + "");
      f_Label10.setText("Success");
      f_Label10.setType(org.gwtbootstrap3.client.ui.constants.LabelType.SUCCESS);

      return f_Label10;
    }

    /**
     * Getter for f_Label11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Label get_f_Label11() {
      return build_f_Label11();
    }
    private org.gwtbootstrap3.client.ui.Label build_f_Label11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label f_Label11 = new org.gwtbootstrap3.client.ui.Label();
      // Setup section.
      f_Label11.addStyleName("" + get_style().spacing() + "");
      f_Label11.setText("Info");
      f_Label11.setType(org.gwtbootstrap3.client.ui.constants.LabelType.INFO);

      return f_Label11;
    }

    /**
     * Getter for f_Label12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Label get_f_Label12() {
      return build_f_Label12();
    }
    private org.gwtbootstrap3.client.ui.Label build_f_Label12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label f_Label12 = new org.gwtbootstrap3.client.ui.Label();
      // Setup section.
      f_Label12.addStyleName("" + get_style().spacing() + "");
      f_Label12.setText("Warning");
      f_Label12.setType(org.gwtbootstrap3.client.ui.constants.LabelType.WARNING);

      return f_Label12;
    }

    /**
     * Getter for f_Label13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Label get_f_Label13() {
      return build_f_Label13();
    }
    private org.gwtbootstrap3.client.ui.Label build_f_Label13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Label f_Label13 = new org.gwtbootstrap3.client.ui.Label();
      // Setup section.
      f_Label13.addStyleName("" + get_style().spacing() + "");
      f_Label13.setText("Danger");
      f_Label13.setType(org.gwtbootstrap3.client.ui.constants.LabelType.DANGER);

      return f_Label13;
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
  }
}
