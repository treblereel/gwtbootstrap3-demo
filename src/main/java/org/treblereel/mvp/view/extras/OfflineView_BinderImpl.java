// Template file: org/treblereel/mvp/view/extras/OfflineView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.589")
public class OfflineView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.OfflineView>, org.treblereel.mvp.view.extras.OfflineView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("To use Offline, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("<p>Web applications consist of web pages that need to be downloaded from a network and for this to happen there must be a network connection. However there are many instances when users cannot connect to a network due to reasons beyond their control. HTML5 provides the ability to access the web application even without a network connection using the<b>cache manifest</b>. <br> <a href='http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5'> http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5 </a> </p> <p>The entire web application (css, javascript, resources etc) can be downloaded and stored locally so that offline support is possible - in addition this may improve perceived speed of your web application by making all resources instantly available from local storage. </p> <p>Unfortunately, the GWT compiler automatically generates lots of css and javascript files that are different after every compile (the file names are crypto hashed) and so the <b>cache manifest</b> needs to reflect this new set of files each time. </p> <p>The Offline linker performs this task of generating a valid cache manifest every time you compile. </p>")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Static resources that are needed (outside of the compile unit) require specific inclusion. These files would typically be index.html, css files or any resources not included within the GWT application. These files are included through the cachemanifest_static_files property added to your module.gwt.xml file.")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;extend-configuration-property name=\"cachemanifest_static_files\" value=\"index.html\" /&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("To activate the linker, the following configuration is included in your GWT module definition (module.gwt.xml file) as follows:")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;\\n &lt;add-linker name=\"offline\" /&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("Finally, include the cache manifest file within the html page that loads your GWT application, as follows:")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("&lt;!doctype html&gt;\\n &lt;html manifest=\"&lt;modulename&gt;/appcache.manifest\"&gt;\\n ....\\n &lt;/html&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
  }

  Template template = new OfflineView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.OfflineView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.OfflineView owner;


    public Widgets(final org.treblereel.mvp.view.extras.OfflineView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.OfflineView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.OfflineView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.OfflineView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.OfflineView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.OfflineView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.OfflineView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.OfflineView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel10());
      f_Column2.add(get_f_Panel16());

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
      f_PageHeader3.setText("Offline");

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
      f_BlockQuote4.add(get_f_PrettyPre7());
      f_BlockQuote4.add(get_f_Paragraph8());
      f_BlockQuote4.add(get_f_PrettyPre9());
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
      f_Heading5.setText("Required for use");

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
     * Getter for f_PrettyPre7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre7() {
      return build_f_PrettyPre7();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre7() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre7 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre7.setHTML(template_html2().asString());
      f_PrettyPre7.addStyleName("lang-xml");

      return f_PrettyPre7;
    }

    /**
     * Getter for f_Paragraph8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph8() {
      return build_f_Paragraph8();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph8 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      return f_Paragraph8;
    }

    /**
     * Getter for f_PrettyPre9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre9() {
      return build_f_PrettyPre9();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre9() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre9 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre9.setHTML(template_html4().asString());
      f_PrettyPre9.addStyleName("lang-xml");

      return f_PrettyPre9;
    }

    /**
     * Getter for f_Panel10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel10() {
      return build_f_Panel10();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel10 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel10.add(get_f_PanelHeader11());
      f_Panel10.add(get_f_PanelBody13());
      f_Panel10.add(get_f_PanelFooter15());

      return f_Panel10;
    }

    /**
     * Getter for f_PanelHeader11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader11() {
      return build_f_PanelHeader11();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader11 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader11.add(get_f_Heading12());

      return f_PanelHeader11;
    }

    /**
     * Getter for f_Heading12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading12() {
      return build_f_Heading12();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading12 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading12.setText("What is Offline?");

      return f_Heading12;
    }

    /**
     * Getter for f_PanelBody13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody13() {
      return build_f_PanelBody13();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody13 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody13.add(get_f_HTMLPanel14());

      return f_PanelBody13;
    }

    /**
     * Getter for f_HTMLPanel14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.gwt.HTMLPanel get_f_HTMLPanel14() {
      return build_f_HTMLPanel14();
    }
    private org.gwtbootstrap3.client.ui.gwt.HTMLPanel build_f_HTMLPanel14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.HTMLPanel f_HTMLPanel14 = new org.gwtbootstrap3.client.ui.gwt.HTMLPanel(template_html5().asString());
      // Setup section.

      return f_HTMLPanel14;
    }

    /**
     * Getter for f_PanelFooter15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter15() {
      return build_f_PanelFooter15();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter15 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.

      return f_PanelFooter15;
    }

    /**
     * Getter for f_Panel16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel16() {
      return build_f_Panel16();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel16 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel16.add(get_f_PanelHeader17());
      f_Panel16.add(get_f_PanelBody19());
      f_Panel16.add(get_f_PanelFooter26());

      return f_Panel16;
    }

    /**
     * Getter for f_PanelHeader17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader17() {
      return build_f_PanelHeader17();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader17 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader17.add(get_f_Heading18());

      return f_PanelHeader17;
    }

    /**
     * Getter for f_Heading18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading18() {
      return build_f_Heading18();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading18 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading18.setText("How to configure?");

      return f_Heading18;
    }

    /**
     * Getter for f_PanelBody19 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody19() {
      return build_f_PanelBody19();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody19 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody19.add(get_f_Paragraph20());
      f_PanelBody19.add(get_f_PrettyPre21());
      f_PanelBody19.add(get_f_Paragraph22());
      f_PanelBody19.add(get_f_PrettyPre23());
      f_PanelBody19.add(get_f_Paragraph24());
      f_PanelBody19.add(get_f_PrettyPre25());

      return f_PanelBody19;
    }

    /**
     * Getter for f_Paragraph20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph20() {
      return build_f_Paragraph20();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph20 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.

      return f_Paragraph20;
    }

    /**
     * Getter for f_PrettyPre21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre21() {
      return build_f_PrettyPre21();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre21() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre21 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre21.setHTML(template_html7().asString());
      f_PrettyPre21.addStyleName("lang-xml");

      return f_PrettyPre21;
    }

    /**
     * Getter for f_Paragraph22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph22() {
      return build_f_Paragraph22();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph22 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html8().asString());
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
      f_PrettyPre23.setHTML(template_html9().asString());
      f_PrettyPre23.addStyleName("lang-xml");

      return f_PrettyPre23;
    }

    /**
     * Getter for f_Paragraph24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph24() {
      return build_f_Paragraph24();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph24 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html10().asString());
      // Setup section.

      return f_Paragraph24;
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
      f_PrettyPre25.setHTML(template_html11().asString());
      f_PrettyPre25.addStyleName("lang-xml");

      return f_PrettyPre25;
    }

    /**
     * Getter for f_PanelFooter26 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter26() {
      return build_f_PanelFooter26();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter26 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.

      return f_PanelFooter26;
    }
  }
}
