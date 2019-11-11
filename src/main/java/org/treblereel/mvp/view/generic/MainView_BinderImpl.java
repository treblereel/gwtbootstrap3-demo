// Template file: org/treblereel/mvp/view/generic/MainView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.generic;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.865")
public class MainView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.generic.MainView>, org.treblereel.mvp.view.generic.MainView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("A <a href='http://gwtproject.org/'>GWT3/J2CL</a> wrapper for <a href='http://getbootstrap.com/'>Bootstrap</a>")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Support my work on GWT3 via PayPal")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("This is the demo for <a href='https://github.com/treblereel/gwtbootstrap3'>GwtBootstrap3</a> version 1.0-SNAPSHOT. <br> <br> <br> <br> <br> <br> <span id='{0}'></span> <a href='https://www.paypal.me/treblereels/150'> <img alt='Support my GWT3 progress via PayPal' src='https://qph.fs.quoracdn.net/main-qimg-7feb81f45db5bd355683bc19b3c7ee00.webp'> </a>")
    org.gwtproject.safehtml.shared.SafeHtml html3(String arg0);
     
  }

  Template template = new MainView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.generic.MainView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.generic.MainView owner;


    public Widgets(final org.treblereel.mvp.view.generic.MainView owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 5
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 5
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.generic.MainView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.generic.MainView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.generic.MainView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.generic.MainView_BinderImpl_GenBundleImpl();
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
      f_Column2.add(get_f_Jumbotron3());

      return f_Column2;
    }

    /**
     * Getter for f_Jumbotron3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Jumbotron get_f_Jumbotron3() {
      return build_f_Jumbotron3();
    }
    private org.gwtbootstrap3.client.ui.Jumbotron build_f_Jumbotron3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Jumbotron f_Jumbotron3 = new org.gwtbootstrap3.client.ui.Jumbotron();
      // Setup section.
      f_Jumbotron3.add(get_f_Heading4());
      f_Jumbotron3.add(get_f_Paragraph5());
      f_Jumbotron3.add(get_f_Paragraph6());

      return f_Jumbotron3;
    }

    /**
     * Getter for f_Heading4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading4() {
      return build_f_Heading4();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading4 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H1);
      // Setup section.
      f_Heading4.setText("Demo for GwtBootstrap3");

      return f_Heading4;
    }

    /**
     * Getter for f_Paragraph5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph5() {
      return build_f_Paragraph5();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph5 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph5;
    }

    /**
     * Getter for f_Paragraph6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph6() {
      return build_f_Paragraph6();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph6 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Paragraph6.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Paragraph6.addAndReplaceElement(get_f_Paragraph7(), get_domId0Element().get());

      return f_Paragraph6;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 5.
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
     * Getter for f_Paragraph7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph7() {
      return build_f_Paragraph7();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph7 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.

      return f_Paragraph7;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 5.
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
  }
}
