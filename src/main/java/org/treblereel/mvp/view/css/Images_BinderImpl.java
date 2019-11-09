// Template file: org/treblereel/mvp/view/css/Images.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.css;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.195")
public class Images_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.css.Images>, org.treblereel.mvp.view.css.Images.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Keep in mind that Internet Explorer 8 lacks support for rounded corners.")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Image type=\"ROUNDED\" url=\"...\"/&gt;\\n &lt;b:Image type=\"CIRCLE\" url=\"...\"/&gt;\\n &lt;b:Image type=\"THUMBNAIL\" url=\"...\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
  }

  Template template = new Images_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.css.Images owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.css.Images owner;


    public Widgets(final org.treblereel.mvp.view.css.Images owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html2() {
      return template.html2();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.Images_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.css.Images_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.css.Images_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.css.Images_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 5 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.Images_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.css.Images_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.css.Images_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_BlockQuote4());
      f_Column2.add(get_f_Panel7());

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
      f_PageHeader3.setText("Images");

      return f_PageHeader3;
    }

    /**
     * Getter for f_BlockQuote4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.BlockQuote get_f_BlockQuote4() {
      return build_f_BlockQuote4();
    }
    private org.gwtbootstrap3.client.ui.BlockQuote build_f_BlockQuote4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.BlockQuote f_BlockQuote4 = new org.gwtbootstrap3.client.ui.BlockQuote();
      // Setup section.
      f_BlockQuote4.add(get_f_Heading5());
      f_BlockQuote4.add(get_f_Paragraph6());
      f_BlockQuote4.addStyleName("" + get_style().danger() + "");

      return f_BlockQuote4;
    }

    /**
     * Getter for f_Heading5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading5() {
      return build_f_Heading5();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading5 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading5.addStyleName("" + get_style().marginFix() + "");
      f_Heading5.setText("Cross-browser compatibility");

      return f_Heading5;
    }

    /**
     * Getter for f_Paragraph6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph6() {
      return build_f_Paragraph6();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph6 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph6;
    }

    /**
     * Getter for f_Panel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel7() {
      return build_f_Panel7();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel7 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel7.add(get_f_PanelHeader8());
      f_Panel7.add(get_f_PanelBody10());
      f_Panel7.add(get_f_PanelFooter14());

      return f_Panel7;
    }

    /**
     * Getter for f_PanelHeader8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader8() {
      return build_f_PanelHeader8();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader8 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader8.add(get_f_Heading9());

      return f_PanelHeader8;
    }

    /**
     * Getter for f_Heading9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading9() {
      return build_f_Heading9();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading9 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading9.setText("Basic");

      return f_Heading9;
    }

    /**
     * Getter for f_PanelBody10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody10() {
      return build_f_PanelBody10();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody10 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody10.add(get_f_Image11());
      f_PanelBody10.add(get_f_Image12());
      f_PanelBody10.add(get_f_Image13());

      return f_PanelBody10;
    }

    /**
     * Getter for f_Image11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image11() {
      return build_f_Image11();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image11 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image11.addStyleName("" + get_style().spacing() + "");
      f_Image11.setType(org.gwtbootstrap3.client.ui.constants.ImageType.ROUNDED);
      f_Image11.setUrl("images/test.png");

      return f_Image11;
    }

    /**
     * Getter for f_Image12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image12() {
      return build_f_Image12();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image12 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image12.addStyleName("" + get_style().spacing() + "");
      f_Image12.setType(org.gwtbootstrap3.client.ui.constants.ImageType.CIRCLE);
      f_Image12.setUrl("images/test.png");

      return f_Image12;
    }

    /**
     * Getter for f_Image13 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image13() {
      return build_f_Image13();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image13 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image13.addStyleName("" + get_style().spacing() + "");
      f_Image13.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image13.setUrl("images/test.png");

      return f_Image13;
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
      f_PrettyPre15.setHTML(template_html2().asString());
      f_PrettyPre15.addStyleName("lang-xml");

      return f_PrettyPre15;
    }
  }
}
