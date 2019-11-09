// Template file: org/treblereel/mvp/view/extras/GalleryView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.976")
public class GalleryView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.GalleryView>, org.treblereel.mvp.view.extras.GalleryView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Bootstrap Image Gallery")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 3.4.2")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Bootstrap Image Gallery, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.gallery.Gallery\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it select):")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("xmlns:gallery=\"urn:import:org.gwtbootstrap3.extras.gallery.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("&lt;gallery:Gallery ui:field=\"gallery\" thumbnailWidth=\"100px\" thumbnailHeight=\"100px\"&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/582/21830878218_f7e24ec74d_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5707/21832711448_02e33b3b3b_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/567/22011206725_9d0b3dc1ae_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/670/22016240921_6fca2b20ce_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5833/21401954003_27f145bc32_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5686/21997628766_9845a40fdc_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5637/21393309814_17ca189d39_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/660/22018439171_06358ee107_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5799/21837884439_b5cfe23d60_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/616/21833374820_2c2a1ee5a7_b.jpg\" /&gt;\\n &lt;gallery:Gallery/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("@UiField Gallery gallery;")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("&lt;gallery:Gallery ui:field=\"gallery\" thumbnailWidth=\"100px\" thumbnailHeight=\"100px\"&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Anchor ui:field=\"delete\" icon=\"CLOSE\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage /&gt;\\n \\s\\s\\s\\s...\\n &lt;gallery:Gallery/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
  }

  Template template = new GalleryView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.GalleryView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.GalleryView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.deleteFirstClick((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.GalleryView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.GalleryView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.GalleryView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.GalleryView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.GalleryView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.GalleryView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.GalleryView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.GalleryView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_BlockQuote9());
      f_Column2.add(get_f_Panel17());
      f_Column2.add(get_f_Panel42());

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
      f_PageHeader3.setText("Bootstrap Image Gallery");

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
      f_BlockQuote4.add(get_f_Strong5());
      f_BlockQuote4.add(get_f_Anchor6());
      f_BlockQuote4.add(get_f_Br7());
      f_BlockQuote4.add(get_f_Strong8());

      return f_BlockQuote4;
    }

    /**
     * Getter for f_Strong5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong5() {
      return build_f_Strong5();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong5 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong5.setHTML(template_html1().asString());

      return f_Strong5;
    }

    /**
     * Getter for f_Anchor6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor6() {
      return build_f_Anchor6();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor6 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor6.setHTML(template_html2().asString());
      f_Anchor6.addStyleName("" + get_style().spacing() + "");
      f_Anchor6.setHref("https://github.com/blueimp/Bootstrap-Image-Gallery");
      f_Anchor6.setTarget("_blank");

      return f_Anchor6;
    }

    /**
     * Getter for f_Br7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br7() {
      return build_f_Br7();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br7 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br7;
    }

    /**
     * Getter for f_Strong8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong8() {
      return build_f_Strong8();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong8 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong8.setHTML(template_html3().asString());

      return f_Strong8;
    }

    /**
     * Getter for f_BlockQuote9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.BlockQuote get_f_BlockQuote9() {
      return build_f_BlockQuote9();
    }
    private org.gwtbootstrap3.client.ui.BlockQuote build_f_BlockQuote9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.BlockQuote f_BlockQuote9 = new org.gwtbootstrap3.client.ui.BlockQuote();
      // Setup section.
      f_BlockQuote9.add(get_f_Heading10());
      f_BlockQuote9.add(get_f_Paragraph11());
      f_BlockQuote9.add(get_f_PrettyPre12());
      f_BlockQuote9.add(get_f_Paragraph13());
      f_BlockQuote9.add(get_f_PrettyPre14());
      f_BlockQuote9.add(get_f_Paragraph15());
      f_BlockQuote9.add(get_f_PrettyPre16());
      f_BlockQuote9.addStyleName("" + get_style().danger() + "");

      return f_BlockQuote9;
    }

    /**
     * Getter for f_Heading10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading10() {
      return build_f_Heading10();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading10 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading10.addStyleName("" + get_style().marginFix() + "");
      f_Heading10.setText("Required for use");

      return f_Heading10;
    }

    /**
     * Getter for f_Paragraph11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph11() {
      return build_f_Paragraph11();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph11 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.

      return f_Paragraph11;
    }

    /**
     * Getter for f_PrettyPre12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre12() {
      return build_f_PrettyPre12();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre12() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre12 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre12.setHTML(template_html5().asString());
      f_PrettyPre12.addStyleName("lang-xml");

      return f_PrettyPre12;
    }

    /**
     * Getter for f_Paragraph13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph13() {
      return build_f_Paragraph13();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph13 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.

      return f_Paragraph13;
    }

    /**
     * Getter for f_PrettyPre14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre14() {
      return build_f_PrettyPre14();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre14() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre14 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre14.setHTML(template_html7().asString());
      f_PrettyPre14.addStyleName("lang-xml");

      return f_PrettyPre14;
    }

    /**
     * Getter for f_Paragraph15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph15() {
      return build_f_Paragraph15();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph15 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html8().asString());
      // Setup section.

      return f_Paragraph15;
    }

    /**
     * Getter for f_PrettyPre16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre16() {
      return build_f_PrettyPre16();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre16() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre16 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre16.setHTML(template_html9().asString());
      f_PrettyPre16.addStyleName("lang-xml");

      return f_PrettyPre16;
    }

    /**
     * Getter for f_Panel17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel17() {
      return build_f_Panel17();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel17 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel17.add(get_f_PanelHeader18());
      f_Panel17.add(get_f_PanelBody20());
      f_Panel17.add(get_f_PanelFooter39());

      return f_Panel17;
    }

    /**
     * Getter for f_PanelHeader18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader18() {
      return build_f_PanelHeader18();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader18 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader18.add(get_f_Heading19());

      return f_PanelHeader18;
    }

    /**
     * Getter for f_Heading19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading19() {
      return build_f_Heading19();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading19 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading19.setText("Basic");

      return f_Heading19;
    }

    /**
     * Getter for f_PanelBody20 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody20() {
      return build_f_PanelBody20();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody20 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody20.add(get_gallery());

      return f_PanelBody20;
    }

    /**
     * Getter for gallery called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.Gallery get_gallery() {
      return build_gallery();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.Gallery build_gallery() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.Gallery gallery = new org.gwtbootstrap3.extras.gallery.client.ui.Gallery();
      // Setup section.
      gallery.add(get_f_GalleryImage21());
      gallery.add(get_f_GalleryImage22());
      gallery.add(get_f_GalleryImage23());
      gallery.add(get_f_GalleryImage24());
      gallery.add(get_f_GalleryImage25());
      gallery.add(get_f_GalleryImage26());
      gallery.add(get_f_GalleryImage27());
      gallery.add(get_f_GalleryImage28());
      gallery.add(get_f_GalleryImage29());
      gallery.add(get_f_GalleryImage30());
      gallery.add(get_f_GalleryImage31());
      gallery.add(get_f_GalleryImage32());
      gallery.add(get_f_GalleryImage33());
      gallery.add(get_f_GalleryImage34());
      gallery.add(get_f_GalleryImage35());
      gallery.add(get_f_GalleryImage36());
      gallery.add(get_f_GalleryImage37());
      gallery.add(get_f_GalleryImage38());
      gallery.setThumbnailWidth("100px");
      gallery.setThumbnailHeight("100px");

      this.owner.gallery = gallery;

      return gallery;
    }

    /**
     * Getter for f_GalleryImage21 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage21() {
      return build_f_GalleryImage21();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage21() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage21 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg");
      // Setup section.

      return f_GalleryImage21;
    }

    /**
     * Getter for f_GalleryImage22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage22() {
      return build_f_GalleryImage22();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage22() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage22 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/582/21830878218_f7e24ec74d_b.jpg");
      // Setup section.

      return f_GalleryImage22;
    }

    /**
     * Getter for f_GalleryImage23 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage23() {
      return build_f_GalleryImage23();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage23() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage23 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5707/21832711448_02e33b3b3b_b.jpg");
      // Setup section.

      return f_GalleryImage23;
    }

    /**
     * Getter for f_GalleryImage24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage24() {
      return build_f_GalleryImage24();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage24() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage24 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/567/22011206725_9d0b3dc1ae_b.jpg");
      // Setup section.

      return f_GalleryImage24;
    }

    /**
     * Getter for f_GalleryImage25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage25() {
      return build_f_GalleryImage25();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage25() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage25 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/670/22016240921_6fca2b20ce_b.jpg");
      // Setup section.

      return f_GalleryImage25;
    }

    /**
     * Getter for f_GalleryImage26 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage26() {
      return build_f_GalleryImage26();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage26() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage26 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5833/21401954003_27f145bc32_b.jpg");
      // Setup section.

      return f_GalleryImage26;
    }

    /**
     * Getter for f_GalleryImage27 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage27() {
      return build_f_GalleryImage27();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage27() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage27 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5686/21997628766_9845a40fdc_b.jpg");
      // Setup section.

      return f_GalleryImage27;
    }

    /**
     * Getter for f_GalleryImage28 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage28() {
      return build_f_GalleryImage28();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage28() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage28 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5637/21393309814_17ca189d39_b.jpg");
      // Setup section.

      return f_GalleryImage28;
    }

    /**
     * Getter for f_GalleryImage29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage29() {
      return build_f_GalleryImage29();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage29() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage29 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/660/22018439171_06358ee107_b.jpg");
      // Setup section.

      return f_GalleryImage29;
    }

    /**
     * Getter for f_GalleryImage30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage30() {
      return build_f_GalleryImage30();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage30() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage30 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5799/21837884439_b5cfe23d60_b.jpg");
      // Setup section.

      return f_GalleryImage30;
    }

    /**
     * Getter for f_GalleryImage31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage31() {
      return build_f_GalleryImage31();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage31() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage31 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/616/21833374820_2c2a1ee5a7_b.jpg");
      // Setup section.

      return f_GalleryImage31;
    }

    /**
     * Getter for f_GalleryImage32 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage32() {
      return build_f_GalleryImage32();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage32() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage32 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5834/21998184436_d4a185b1f3_b.jpg");
      // Setup section.

      return f_GalleryImage32;
    }

    /**
     * Getter for f_GalleryImage33 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage33() {
      return build_f_GalleryImage33();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage33() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage33 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5799/21837884439_b5cfe23d60_b.jpg");
      // Setup section.

      return f_GalleryImage33;
    }

    /**
     * Getter for f_GalleryImage34 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage34() {
      return build_f_GalleryImage34();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage34() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage34 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/699/22010791525_c810cdace3_b.jpg");
      // Setup section.

      return f_GalleryImage34;
    }

    /**
     * Getter for f_GalleryImage35 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage35() {
      return build_f_GalleryImage35();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage35() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage35 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5747/22018426185_b438d4f59e_b.jpg");
      // Setup section.

      return f_GalleryImage35;
    }

    /**
     * Getter for f_GalleryImage36 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage36() {
      return build_f_GalleryImage36();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage36() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage36 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/592/21390068924_ed57f5d9f4_b.jpg");
      // Setup section.

      return f_GalleryImage36;
    }

    /**
     * Getter for f_GalleryImage37 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage37() {
      return build_f_GalleryImage37();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage37() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage37 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5727/21831177010_5f24ca7722_b.jpg");
      // Setup section.

      return f_GalleryImage37;
    }

    /**
     * Getter for f_GalleryImage38 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage38() {
      return build_f_GalleryImage38();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage38() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage38 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/577/22004465542_d9169779ce_b.jpg");
      // Setup section.

      return f_GalleryImage38;
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
      f_PanelFooter39.add(get_f_PrettyPre41());

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
      f_PrettyPre40.setHTML(template_html10().asString());
      f_PrettyPre40.addStyleName("lang-xml");

      return f_PrettyPre40;
    }

    /**
     * Getter for f_PrettyPre41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre41() {
      return build_f_PrettyPre41();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre41() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre41 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre41.setHTML(template_html11().asString());
      f_PrettyPre41.addStyleName("lang-java");

      return f_PrettyPre41;
    }

    /**
     * Getter for f_Panel42 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel42() {
      return build_f_Panel42();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel42 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel42.add(get_f_PanelHeader43());
      f_Panel42.add(get_f_PanelBody45());
      f_Panel42.add(get_f_PanelFooter52());

      return f_Panel42;
    }

    /**
     * Getter for f_PanelHeader43 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader43() {
      return build_f_PanelHeader43();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader43 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader43.add(get_f_Heading44());

      return f_PanelHeader43;
    }

    /**
     * Getter for f_Heading44 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading44() {
      return build_f_Heading44();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading44 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading44.setText("With Controls");

      return f_Heading44;
    }

    /**
     * Getter for f_PanelBody45 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody45() {
      return build_f_PanelBody45();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody45 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody45.add(get_galleryWithControls());

      return f_PanelBody45;
    }

    /**
     * Getter for galleryWithControls called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.Gallery get_galleryWithControls() {
      return build_galleryWithControls();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.Gallery build_galleryWithControls() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.Gallery galleryWithControls = new org.gwtbootstrap3.extras.gallery.client.ui.Gallery();
      // Setup section.
      galleryWithControls.add(get_f_GalleryImage46());
      galleryWithControls.add(get_f_GalleryImage47());
      galleryWithControls.add(get_f_GalleryImage48());
      galleryWithControls.add(get_f_GalleryImage49());
      galleryWithControls.add(get_f_GalleryImage50());
      galleryWithControls.add(get_f_GalleryImage51());
      galleryWithControls.setThumbnailWidth("100px");
      galleryWithControls.setThumbnailHeight("100px");

      this.owner.galleryWithControls = galleryWithControls;

      return galleryWithControls;
    }

    /**
     * Getter for f_GalleryImage46 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage46() {
      return build_f_GalleryImage46();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage46() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage46 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/582/21830878218_f7e24ec74d_b.jpg");
      // Setup section.
      f_GalleryImage46.add(get_delete1());

      return f_GalleryImage46;
    }

    /**
     * Getter for delete1 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_delete1() {
      return build_delete1();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_delete1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor delete1 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      delete1.setColor("white");
      delete1.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CLOSE);
      delete1.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return delete1;
    }

    /**
     * Getter for f_GalleryImage47 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage47() {
      return build_f_GalleryImage47();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage47() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage47 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5707/21832711448_02e33b3b3b_b.jpg");
      // Setup section.
      f_GalleryImage47.add(get_delete2());

      return f_GalleryImage47;
    }

    /**
     * Getter for delete2 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_delete2() {
      return build_delete2();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_delete2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor delete2 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      delete2.setColor("white");
      delete2.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CLOSE);
      delete2.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return delete2;
    }

    /**
     * Getter for f_GalleryImage48 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage48() {
      return build_f_GalleryImage48();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage48() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage48 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg");
      // Setup section.
      f_GalleryImage48.add(get_delete3());

      return f_GalleryImage48;
    }

    /**
     * Getter for delete3 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_delete3() {
      return build_delete3();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_delete3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor delete3 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      delete3.setColor("white");
      delete3.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CLOSE);
      delete3.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return delete3;
    }

    /**
     * Getter for f_GalleryImage49 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage49() {
      return build_f_GalleryImage49();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage49() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage49 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/567/22011206725_9d0b3dc1ae_b.jpg");
      // Setup section.
      f_GalleryImage49.add(get_delete4());

      return f_GalleryImage49;
    }

    /**
     * Getter for delete4 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_delete4() {
      return build_delete4();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_delete4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor delete4 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      delete4.setColor("white");
      delete4.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CLOSE);
      delete4.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return delete4;
    }

    /**
     * Getter for f_GalleryImage50 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage50() {
      return build_f_GalleryImage50();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage50() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage50 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm1.static.flickr.com/670/22016240921_6fca2b20ce_b.jpg");
      // Setup section.
      f_GalleryImage50.add(get_delete5());

      return f_GalleryImage50;
    }

    /**
     * Getter for delete5 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_delete5() {
      return build_delete5();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_delete5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor delete5 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      delete5.setColor("white");
      delete5.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CLOSE);
      delete5.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return delete5;
    }

    /**
     * Getter for f_GalleryImage51 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage get_f_GalleryImage51() {
      return build_f_GalleryImage51();
    }
    private org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage build_f_GalleryImage51() {
      // Creation section.
      final org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage f_GalleryImage51 = new org.gwtbootstrap3.extras.gallery.client.ui.GalleryImage("https://farm6.static.flickr.com/5833/21401954003_27f145bc32_b.jpg");
      // Setup section.
      f_GalleryImage51.add(get_delete6());

      return f_GalleryImage51;
    }

    /**
     * Getter for delete6 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_delete6() {
      return build_delete6();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_delete6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor delete6 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      delete6.setColor("white");
      delete6.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CLOSE);
      delete6.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return delete6;
    }

    /**
     * Getter for f_PanelFooter52 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter52() {
      return build_f_PanelFooter52();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter52 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter52.add(get_f_PrettyPre53());

      return f_PanelFooter52;
    }

    /**
     * Getter for f_PrettyPre53 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre53() {
      return build_f_PrettyPre53();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre53() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre53 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre53.setHTML(template_html12().asString());
      f_PrettyPre53.addStyleName("lang-xml");

      return f_PrettyPre53;
    }
  }
}
