// Template file: org/treblereel/mvp/view/javascript/CarouselView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.javascript;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.818")
public class CarouselView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.javascript.CarouselView>, org.treblereel.mvp.view.javascript.CarouselView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("<b>Transition animations not supported in Internet Explorer 8 &amp; 9 </b> <br> Bootstrap exclusively uses CSS3 for its animations, but Internet Explorer 8 &amp; 9 don't support the necessary CSS properties. Thus, there are no slide transition animations when using these browsers. We have intentionally decided not to include jQuery-based fallbacks for the transitions.")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;b:Carousel b:id=\"carousel-basic\"&gt;\\n \\s\\s&lt;b:CarouselIndicators&gt;\\n \\s\\s\\s\\s&lt;b:CarouselIndicator dataTarget=\"#carousel-basic\" dataSlideTo=\"0\" active=\"true\"/&gt;\\n \\s\\s\\s\\s&lt;b:CarouselIndicator dataTarget=\"#carousel-basic\" dataSlideTo=\"1\"/&gt;\\n \\s\\s\\s\\s&lt;b:CarouselIndicator dataTarget=\"#carousel-basic\" dataSlideTo=\"2\"/&gt;\\n \\s\\s&lt;/b:CarouselIndicators&gt;\\n \\s\\s&lt;b:CarouselInner&gt;\\n \\s\\s\\s\\s&lt;b:CarouselSlide active=\"true\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Image url=\".../&gt;\\n \\s\\s\\s\\s&lt;/b:CarouselSlide&gt;\\n \\s\\s&lt;/b:CarouselInner&gt;\\n \\s\\s&lt;b:CarouselControl href=\"#carousel-basic\" prev=\"true\" text=\"Previous\" iconType=\"...\"/&gt;\\n \\s\\s&lt;b:CarouselControl href=\"#carousel-basic\" next=\"true\" text=\"Next\" iconType=\"...\"/&gt;\\n &lt;/b:Carousel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:Carousel b:id=\"carousel-captions\"&gt;\\n \\s\\s&lt;b:CarouselIndicators&gt;\\n \\s\\s\\s\\s&lt;b:CarouselIndicator dataTarget=\"#carousel-captions\" dataSlideTo=\"0\" active=\"true\"/&gt;\\n \\s\\s\\s\\s&lt;b:CarouselIndicator dataTarget=\"#carousel-captions\" dataSlideTo=\"1\"/&gt;\\n \\s\\s\\s\\s&lt;b:CarouselIndicator dataTarget=\"#carousel-captions\" dataSlideTo=\"2\"/&gt;\\n \\s\\s&lt;/b:CarouselIndicators&gt;\\n \\s\\s&lt;b:CarouselInner&gt;\\n \\s\\s\\s\\s&lt;b:CarouselSlide active=\"true\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Image url=\".../&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:CarouselCaption&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"...\" text=\"...\"/&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b.html:Paragraph text=\"...\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:CarouselCaption&gt;\\n \\s\\s\\s\\s&lt;/b:CarouselSlide&gt;\\n \\s\\s&lt;/b:CarouselInner&gt;\\n \\s\\s&lt;b:CarouselControl href=\"#carousel-captions\" prev=\"true\" text=\"Previous\" iconType=\"...\"/&gt;\\n \\s\\s&lt;b:CarouselControl href=\"#carousel-captions\" next=\"true\" text=\"Next\" iconType=\"...\"/&gt;\\n &lt;/b:Carousel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
  }

  Template template = new CarouselView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.javascript.CarouselView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.javascript.CarouselView owner;


    public Widgets(final org.treblereel.mvp.view.javascript.CarouselView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
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
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.CarouselView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.javascript.CarouselView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.javascript.CarouselView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.javascript.CarouselView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.javascript.CarouselView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.javascript.CarouselView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.javascript.CarouselView_BinderImpl_GenCss_style build_style() {
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
      f_PageHeader3.setText("Carousel");

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
      f_Panel7.add(get_f_PanelFooter25());

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
      f_PanelBody10.add(get_f_Carousel11());

      return f_PanelBody10;
    }

    /**
     * Getter for f_Carousel11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Carousel get_f_Carousel11() {
      return build_f_Carousel11();
    }
    private org.gwtbootstrap3.client.ui.Carousel build_f_Carousel11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Carousel f_Carousel11 = new org.gwtbootstrap3.client.ui.Carousel();
      // Setup section.
      f_Carousel11.add(get_f_CarouselIndicators12());
      f_Carousel11.add(get_f_CarouselInner16());
      f_Carousel11.add(get_f_CarouselControl23());
      f_Carousel11.add(get_f_CarouselControl24());
      f_Carousel11.setId("carousel-basic");

      return f_Carousel11;
    }

    /**
     * Getter for f_CarouselIndicators12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicators get_f_CarouselIndicators12() {
      return build_f_CarouselIndicators12();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicators build_f_CarouselIndicators12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicators f_CarouselIndicators12 = new org.gwtbootstrap3.client.ui.CarouselIndicators();
      // Setup section.
      f_CarouselIndicators12.add(get_f_CarouselIndicator13());
      f_CarouselIndicators12.add(get_f_CarouselIndicator14());
      f_CarouselIndicators12.add(get_f_CarouselIndicator15());

      return f_CarouselIndicators12;
    }

    /**
     * Getter for f_CarouselIndicator13 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicator get_f_CarouselIndicator13() {
      return build_f_CarouselIndicator13();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicator build_f_CarouselIndicator13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicator f_CarouselIndicator13 = new org.gwtbootstrap3.client.ui.CarouselIndicator();
      // Setup section.
      f_CarouselIndicator13.setDataSlideTo("0");
      f_CarouselIndicator13.setActive(true);
      f_CarouselIndicator13.setDataTarget("#carousel-basic");

      return f_CarouselIndicator13;
    }

    /**
     * Getter for f_CarouselIndicator14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicator get_f_CarouselIndicator14() {
      return build_f_CarouselIndicator14();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicator build_f_CarouselIndicator14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicator f_CarouselIndicator14 = new org.gwtbootstrap3.client.ui.CarouselIndicator();
      // Setup section.
      f_CarouselIndicator14.setDataSlideTo("1");
      f_CarouselIndicator14.setDataTarget("#carousel-basic");

      return f_CarouselIndicator14;
    }

    /**
     * Getter for f_CarouselIndicator15 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicator get_f_CarouselIndicator15() {
      return build_f_CarouselIndicator15();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicator build_f_CarouselIndicator15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicator f_CarouselIndicator15 = new org.gwtbootstrap3.client.ui.CarouselIndicator();
      // Setup section.
      f_CarouselIndicator15.setDataSlideTo("2");
      f_CarouselIndicator15.setDataTarget("#carousel-basic");

      return f_CarouselIndicator15;
    }

    /**
     * Getter for f_CarouselInner16 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselInner get_f_CarouselInner16() {
      return build_f_CarouselInner16();
    }
    private org.gwtbootstrap3.client.ui.CarouselInner build_f_CarouselInner16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselInner f_CarouselInner16 = new org.gwtbootstrap3.client.ui.CarouselInner();
      // Setup section.
      f_CarouselInner16.add(get_f_CarouselSlide17());
      f_CarouselInner16.add(get_f_CarouselSlide19());
      f_CarouselInner16.add(get_f_CarouselSlide21());

      return f_CarouselInner16;
    }

    /**
     * Getter for f_CarouselSlide17 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselSlide get_f_CarouselSlide17() {
      return build_f_CarouselSlide17();
    }
    private org.gwtbootstrap3.client.ui.CarouselSlide build_f_CarouselSlide17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselSlide f_CarouselSlide17 = new org.gwtbootstrap3.client.ui.CarouselSlide();
      // Setup section.
      f_CarouselSlide17.add(get_f_Image18());
      f_CarouselSlide17.setActive(true);

      return f_CarouselSlide17;
    }

    /**
     * Getter for f_Image18 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image18() {
      return build_f_Image18();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image18 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image18.setWidth("100%");
      f_Image18.setUrl("images/carousel1.png");

      return f_Image18;
    }

    /**
     * Getter for f_CarouselSlide19 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselSlide get_f_CarouselSlide19() {
      return build_f_CarouselSlide19();
    }
    private org.gwtbootstrap3.client.ui.CarouselSlide build_f_CarouselSlide19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselSlide f_CarouselSlide19 = new org.gwtbootstrap3.client.ui.CarouselSlide();
      // Setup section.
      f_CarouselSlide19.add(get_f_Image20());

      return f_CarouselSlide19;
    }

    /**
     * Getter for f_Image20 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image20() {
      return build_f_Image20();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image20 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image20.setWidth("100%");
      f_Image20.setUrl("images/carousel2.png");

      return f_Image20;
    }

    /**
     * Getter for f_CarouselSlide21 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselSlide get_f_CarouselSlide21() {
      return build_f_CarouselSlide21();
    }
    private org.gwtbootstrap3.client.ui.CarouselSlide build_f_CarouselSlide21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselSlide f_CarouselSlide21 = new org.gwtbootstrap3.client.ui.CarouselSlide();
      // Setup section.
      f_CarouselSlide21.add(get_f_Image22());

      return f_CarouselSlide21;
    }

    /**
     * Getter for f_Image22 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image22() {
      return build_f_Image22();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image22 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image22.setWidth("100%");
      f_Image22.setUrl("images/carousel3.png");

      return f_Image22;
    }

    /**
     * Getter for f_CarouselControl23 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselControl get_f_CarouselControl23() {
      return build_f_CarouselControl23();
    }
    private org.gwtbootstrap3.client.ui.CarouselControl build_f_CarouselControl23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselControl f_CarouselControl23 = new org.gwtbootstrap3.client.ui.CarouselControl();
      // Setup section.
      f_CarouselControl23.setPrev(true);
      f_CarouselControl23.setIconType(org.gwtbootstrap3.client.ui.constants.IconType.CHEVRON_CIRCLE_LEFT);
      f_CarouselControl23.setText("Previous");
      f_CarouselControl23.setHref("#carousel-basic");

      return f_CarouselControl23;
    }

    /**
     * Getter for f_CarouselControl24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselControl get_f_CarouselControl24() {
      return build_f_CarouselControl24();
    }
    private org.gwtbootstrap3.client.ui.CarouselControl build_f_CarouselControl24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselControl f_CarouselControl24 = new org.gwtbootstrap3.client.ui.CarouselControl();
      // Setup section.
      f_CarouselControl24.setNext(true);
      f_CarouselControl24.setIconType(org.gwtbootstrap3.client.ui.constants.IconType.CHEVRON_CIRCLE_RIGHT);
      f_CarouselControl24.setText("Next");
      f_CarouselControl24.setHref("#carousel-basic");

      return f_CarouselControl24;
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
      f_PrettyPre26.setHTML(template_html2().asString());
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
      f_Panel27.add(get_f_PanelFooter54());

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
      f_Heading29.setText("With Captions");

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
      f_PanelBody30.add(get_f_Carousel31());

      return f_PanelBody30;
    }

    /**
     * Getter for f_Carousel31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Carousel get_f_Carousel31() {
      return build_f_Carousel31();
    }
    private org.gwtbootstrap3.client.ui.Carousel build_f_Carousel31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Carousel f_Carousel31 = new org.gwtbootstrap3.client.ui.Carousel();
      // Setup section.
      f_Carousel31.add(get_f_CarouselIndicators32());
      f_Carousel31.add(get_f_CarouselInner36());
      f_Carousel31.add(get_f_CarouselControl52());
      f_Carousel31.add(get_f_CarouselControl53());
      f_Carousel31.setId("carousel-captions");

      return f_Carousel31;
    }

    /**
     * Getter for f_CarouselIndicators32 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicators get_f_CarouselIndicators32() {
      return build_f_CarouselIndicators32();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicators build_f_CarouselIndicators32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicators f_CarouselIndicators32 = new org.gwtbootstrap3.client.ui.CarouselIndicators();
      // Setup section.
      f_CarouselIndicators32.add(get_f_CarouselIndicator33());
      f_CarouselIndicators32.add(get_f_CarouselIndicator34());
      f_CarouselIndicators32.add(get_f_CarouselIndicator35());

      return f_CarouselIndicators32;
    }

    /**
     * Getter for f_CarouselIndicator33 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicator get_f_CarouselIndicator33() {
      return build_f_CarouselIndicator33();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicator build_f_CarouselIndicator33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicator f_CarouselIndicator33 = new org.gwtbootstrap3.client.ui.CarouselIndicator();
      // Setup section.
      f_CarouselIndicator33.setDataSlideTo("0");
      f_CarouselIndicator33.setActive(true);
      f_CarouselIndicator33.setDataTarget("#carousel-captions");

      return f_CarouselIndicator33;
    }

    /**
     * Getter for f_CarouselIndicator34 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicator get_f_CarouselIndicator34() {
      return build_f_CarouselIndicator34();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicator build_f_CarouselIndicator34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicator f_CarouselIndicator34 = new org.gwtbootstrap3.client.ui.CarouselIndicator();
      // Setup section.
      f_CarouselIndicator34.setDataSlideTo("1");
      f_CarouselIndicator34.setDataTarget("#carousel-captions");

      return f_CarouselIndicator34;
    }

    /**
     * Getter for f_CarouselIndicator35 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselIndicator get_f_CarouselIndicator35() {
      return build_f_CarouselIndicator35();
    }
    private org.gwtbootstrap3.client.ui.CarouselIndicator build_f_CarouselIndicator35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselIndicator f_CarouselIndicator35 = new org.gwtbootstrap3.client.ui.CarouselIndicator();
      // Setup section.
      f_CarouselIndicator35.setDataSlideTo("2");
      f_CarouselIndicator35.setDataTarget("#carousel-captions");

      return f_CarouselIndicator35;
    }

    /**
     * Getter for f_CarouselInner36 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselInner get_f_CarouselInner36() {
      return build_f_CarouselInner36();
    }
    private org.gwtbootstrap3.client.ui.CarouselInner build_f_CarouselInner36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselInner f_CarouselInner36 = new org.gwtbootstrap3.client.ui.CarouselInner();
      // Setup section.
      f_CarouselInner36.add(get_f_CarouselSlide37());
      f_CarouselInner36.add(get_f_CarouselSlide42());
      f_CarouselInner36.add(get_f_CarouselSlide47());

      return f_CarouselInner36;
    }

    /**
     * Getter for f_CarouselSlide37 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselSlide get_f_CarouselSlide37() {
      return build_f_CarouselSlide37();
    }
    private org.gwtbootstrap3.client.ui.CarouselSlide build_f_CarouselSlide37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselSlide f_CarouselSlide37 = new org.gwtbootstrap3.client.ui.CarouselSlide();
      // Setup section.
      f_CarouselSlide37.add(get_f_Image38());
      f_CarouselSlide37.add(get_f_CarouselCaption39());
      f_CarouselSlide37.setActive(true);

      return f_CarouselSlide37;
    }

    /**
     * Getter for f_Image38 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image38() {
      return build_f_Image38();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image38 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image38.setWidth("100%");
      f_Image38.setUrl("images/carousel1.png");

      return f_Image38;
    }

    /**
     * Getter for f_CarouselCaption39 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.CarouselCaption get_f_CarouselCaption39() {
      return build_f_CarouselCaption39();
    }
    private org.gwtbootstrap3.client.ui.CarouselCaption build_f_CarouselCaption39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselCaption f_CarouselCaption39 = new org.gwtbootstrap3.client.ui.CarouselCaption();
      // Setup section.
      f_CarouselCaption39.add(get_f_Heading40());
      f_CarouselCaption39.add(get_f_Paragraph41());

      return f_CarouselCaption39;
    }

    /**
     * Getter for f_Heading40 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading40() {
      return build_f_Heading40();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading40 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading40.setText("Slide 1");

      return f_Heading40;
    }

    /**
     * Getter for f_Paragraph41 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph41() {
      return build_f_Paragraph41();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph41 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.
      f_Paragraph41.setText("Caption!");

      return f_Paragraph41;
    }

    /**
     * Getter for f_CarouselSlide42 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselSlide get_f_CarouselSlide42() {
      return build_f_CarouselSlide42();
    }
    private org.gwtbootstrap3.client.ui.CarouselSlide build_f_CarouselSlide42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselSlide f_CarouselSlide42 = new org.gwtbootstrap3.client.ui.CarouselSlide();
      // Setup section.
      f_CarouselSlide42.add(get_f_Image43());
      f_CarouselSlide42.add(get_f_CarouselCaption44());

      return f_CarouselSlide42;
    }

    /**
     * Getter for f_Image43 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image43() {
      return build_f_Image43();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image43 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image43.setWidth("100%");
      f_Image43.setUrl("images/carousel2.png");

      return f_Image43;
    }

    /**
     * Getter for f_CarouselCaption44 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.CarouselCaption get_f_CarouselCaption44() {
      return build_f_CarouselCaption44();
    }
    private org.gwtbootstrap3.client.ui.CarouselCaption build_f_CarouselCaption44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselCaption f_CarouselCaption44 = new org.gwtbootstrap3.client.ui.CarouselCaption();
      // Setup section.
      f_CarouselCaption44.add(get_f_Heading45());
      f_CarouselCaption44.add(get_f_Paragraph46());

      return f_CarouselCaption44;
    }

    /**
     * Getter for f_Heading45 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading45() {
      return build_f_Heading45();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading45 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading45.setText("Slide 2");

      return f_Heading45;
    }

    /**
     * Getter for f_Paragraph46 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph46() {
      return build_f_Paragraph46();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph46 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.
      f_Paragraph46.setText("Caption!");

      return f_Paragraph46;
    }

    /**
     * Getter for f_CarouselSlide47 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.CarouselSlide get_f_CarouselSlide47() {
      return build_f_CarouselSlide47();
    }
    private org.gwtbootstrap3.client.ui.CarouselSlide build_f_CarouselSlide47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselSlide f_CarouselSlide47 = new org.gwtbootstrap3.client.ui.CarouselSlide();
      // Setup section.
      f_CarouselSlide47.add(get_f_Image48());
      f_CarouselSlide47.add(get_f_CarouselCaption49());

      return f_CarouselSlide47;
    }

    /**
     * Getter for f_Image48 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image48() {
      return build_f_Image48();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image48 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image48.setWidth("100%");
      f_Image48.setUrl("images/carousel3.png");

      return f_Image48;
    }

    /**
     * Getter for f_CarouselCaption49 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.CarouselCaption get_f_CarouselCaption49() {
      return build_f_CarouselCaption49();
    }
    private org.gwtbootstrap3.client.ui.CarouselCaption build_f_CarouselCaption49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselCaption f_CarouselCaption49 = new org.gwtbootstrap3.client.ui.CarouselCaption();
      // Setup section.
      f_CarouselCaption49.add(get_f_Heading50());
      f_CarouselCaption49.add(get_f_Paragraph51());

      return f_CarouselCaption49;
    }

    /**
     * Getter for f_Heading50 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading50() {
      return build_f_Heading50();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading50 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading50.setText("Slide 3");

      return f_Heading50;
    }

    /**
     * Getter for f_Paragraph51 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph51() {
      return build_f_Paragraph51();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph51 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.
      f_Paragraph51.setText("Caption!");

      return f_Paragraph51;
    }

    /**
     * Getter for f_CarouselControl52 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselControl get_f_CarouselControl52() {
      return build_f_CarouselControl52();
    }
    private org.gwtbootstrap3.client.ui.CarouselControl build_f_CarouselControl52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselControl f_CarouselControl52 = new org.gwtbootstrap3.client.ui.CarouselControl();
      // Setup section.
      f_CarouselControl52.setPrev(true);
      f_CarouselControl52.setIconType(org.gwtbootstrap3.client.ui.constants.IconType.CHEVRON_CIRCLE_LEFT);
      f_CarouselControl52.setText("Previous");
      f_CarouselControl52.setHref("#carousel-captions");

      return f_CarouselControl52;
    }

    /**
     * Getter for f_CarouselControl53 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.CarouselControl get_f_CarouselControl53() {
      return build_f_CarouselControl53();
    }
    private org.gwtbootstrap3.client.ui.CarouselControl build_f_CarouselControl53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CarouselControl f_CarouselControl53 = new org.gwtbootstrap3.client.ui.CarouselControl();
      // Setup section.
      f_CarouselControl53.setNext(true);
      f_CarouselControl53.setIconType(org.gwtbootstrap3.client.ui.constants.IconType.CHEVRON_CIRCLE_RIGHT);
      f_CarouselControl53.setText("Next");
      f_CarouselControl53.setHref("#carousel-captions");

      return f_CarouselControl53;
    }

    /**
     * Getter for f_PanelFooter54 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter54() {
      return build_f_PanelFooter54();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter54 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter54.add(get_f_PrettyPre55());

      return f_PanelFooter54;
    }

    /**
     * Getter for f_PrettyPre55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre55() {
      return build_f_PrettyPre55();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre55() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre55 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre55.setHTML(template_html6().asString());
      f_PrettyPre55.addStyleName("lang-xml");

      return f_PrettyPre55;
    }
  }
}
