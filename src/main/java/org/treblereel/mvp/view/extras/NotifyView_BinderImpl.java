// Template file: org/treblereel/mvp/view/extras/NotifyView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.725")
public class NotifyView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.NotifyView>, org.treblereel.mvp.view.extras.NotifyView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Bootstrap Notify")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 3.1.3")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Notify, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.notify.Notify\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Then, you can call static method from Notify class in GWT client code:")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("Notify.notify(\"Message\");")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotify.notify(\"Message\");\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setShowProgressbar(true);\\n \\s\\ssettings.setPauseOnMouseOver(true);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setType(NotifyType.SUCCESS);\\n \\s\\ssettings.setAllowDismiss(false);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setPlacement(NotifyPlacement.TOP_CENTER);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, \"https://github.com/gwtbootstrap3/gwtbootstrap3\", settings);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("You can set different animation when Notify enters screen and when leaves it. Animation can be disabled by using <i>Animation.NO_ANIMATION</i>.")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setAnimation(Animation.TADA, Animation.LIGHTSPEED_OUT);\\n \\s\\ssettings.setOffset(200, 140);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("You can set own Notify template by passing valid HTML structure with proper CSS classes. You can set also this template as default for all new opened Notifies.")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setTemplate(\"&lt;div data-notify=\\\"container\\\" class=\\\"alert\\\" role=\\\"alert\\\"&gt;\"+\\n \\s\\s\"&lt;button type=\\\"button\\\" class=\\\"close\\\" data-notify=\\\"dismiss\\\"&gt;\"+\\n \\s\\s\\s\"&lt;span aria-hidden=\\\"true\\\"&gt;×&lt;/span&gt;\"+\\n \\s\\s\\s\"&lt;span class=\\\"sr-only\\\"&gt;Close&lt;/span&gt;\"+\\n \\s\\s\"&lt;/button&gt;\"+\\n \\s\\s\"&lt;span data-notify=\\\"icon\\\"&gt;&lt;/span&gt;\"+\\n \\s\\s\"&lt;b&gt;&lt;span data-notify=\\\"title\\\"&gt;&lt;/span&gt;&lt;/b&gt;\"+\\n \\s\\s\"&lt;span data-notify=\\\"message\\\"&gt;&lt;/span&gt;\"+\\n \\s\\s\"&lt;a href=\\\"#\\\" data-notify=\\\"url\\\"&gt;&lt;/a&gt;\"+\\n \\s\\s\"&lt;/div&gt;\");\\n \\s\\ssettings.makeDefault();\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
  }

  Template template = new NotifyView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.NotifyView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.NotifyView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleBasicNotify((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleBasicNotifyWithTitleIcon((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleShowProgressbar((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleChangeBackgroundAndDismiss((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handlePositionAndFormatting((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleAnimationAndOffset((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleTemplate((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.NotifyView owner) {
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
    org.gwtproject.safehtml.shared.SafeHtml template_html13() {
      return template.html13();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html14() {
      return template.html14();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html15() {
      return template.html15();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html16() {
      return template.html16();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html17() {
      return template.html17();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html18() {
      return template.html18();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.NotifyView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel23());
      f_Column2.add(get_f_Panel29());
      f_Column2.add(get_f_Panel35());
      f_Column2.add(get_f_Panel41());
      f_Column2.add(get_f_Panel47());
      f_Column2.add(get_f_Panel55());

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
      f_PageHeader3.setText("Notify");

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
      f_Anchor6.setHref("http://bootstrap-notify.remabledesigns.com/");
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
      f_PrettyPre16.addStyleName("lang-java");

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
      f_Panel17.add(get_f_PanelFooter21());

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
      f_Heading19.setText("Basic Notify");

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
      f_PanelBody20.add(get_basicNotify());

      return f_PanelBody20;
    }

    /**
     * Getter for basicNotify called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_basicNotify() {
      return build_basicNotify();
    }
    private org.gwtbootstrap3.client.ui.Button build_basicNotify() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button basicNotify = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      basicNotify.setText("Run Example");
      basicNotify.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      basicNotify.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      basicNotify.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.basicNotify = basicNotify;

      return basicNotify;
    }

    /**
     * Getter for f_PanelFooter21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter21() {
      return build_f_PanelFooter21();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter21 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter21.add(get_f_PrettyPre22());

      return f_PanelFooter21;
    }

    /**
     * Getter for f_PrettyPre22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre22() {
      return build_f_PrettyPre22();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre22() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre22 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre22.setHTML(template_html10().asString());
      f_PrettyPre22.addStyleName("lang-java");

      return f_PrettyPre22;
    }

    /**
     * Getter for f_Panel23 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel23() {
      return build_f_Panel23();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel23 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel23.add(get_f_PanelHeader24());
      f_Panel23.add(get_f_PanelBody26());
      f_Panel23.add(get_f_PanelFooter27());

      return f_Panel23;
    }

    /**
     * Getter for f_PanelHeader24 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader24() {
      return build_f_PanelHeader24();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader24 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader24.add(get_f_Heading25());

      return f_PanelHeader24;
    }

    /**
     * Getter for f_Heading25 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading25() {
      return build_f_Heading25();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading25 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading25.setText("Basic Notify with title and icon");

      return f_Heading25;
    }

    /**
     * Getter for f_PanelBody26 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody26() {
      return build_f_PanelBody26();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody26 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody26.add(get_basicNotifyWithTitleIcon());

      return f_PanelBody26;
    }

    /**
     * Getter for basicNotifyWithTitleIcon called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_basicNotifyWithTitleIcon() {
      return build_basicNotifyWithTitleIcon();
    }
    private org.gwtbootstrap3.client.ui.Button build_basicNotifyWithTitleIcon() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button basicNotifyWithTitleIcon = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      basicNotifyWithTitleIcon.setText("Run Example");
      basicNotifyWithTitleIcon.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      basicNotifyWithTitleIcon.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      basicNotifyWithTitleIcon.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.basicNotifyWithTitleIcon = basicNotifyWithTitleIcon;

      return basicNotifyWithTitleIcon;
    }

    /**
     * Getter for f_PanelFooter27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter27() {
      return build_f_PanelFooter27();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter27 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter27.add(get_f_PrettyPre28());

      return f_PanelFooter27;
    }

    /**
     * Getter for f_PrettyPre28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre28() {
      return build_f_PrettyPre28();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre28() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre28 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre28.setHTML(template_html11().asString());
      f_PrettyPre28.addStyleName("lang-java");

      return f_PrettyPre28;
    }

    /**
     * Getter for f_Panel29 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel29() {
      return build_f_Panel29();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel29 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel29.add(get_f_PanelHeader30());
      f_Panel29.add(get_f_PanelBody32());
      f_Panel29.add(get_f_PanelFooter33());

      return f_Panel29;
    }

    /**
     * Getter for f_PanelHeader30 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader30() {
      return build_f_PanelHeader30();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader30 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader30.add(get_f_Heading31());

      return f_PanelHeader30;
    }

    /**
     * Getter for f_Heading31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading31() {
      return build_f_Heading31();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading31 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading31.setText("Show progress bar");

      return f_Heading31;
    }

    /**
     * Getter for f_PanelBody32 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody32() {
      return build_f_PanelBody32();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody32 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody32.add(get_showProgressbar());

      return f_PanelBody32;
    }

    /**
     * Getter for showProgressbar called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_showProgressbar() {
      return build_showProgressbar();
    }
    private org.gwtbootstrap3.client.ui.Button build_showProgressbar() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button showProgressbar = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      showProgressbar.setText("Run Example");
      showProgressbar.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      showProgressbar.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      showProgressbar.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      return showProgressbar;
    }

    /**
     * Getter for f_PanelFooter33 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter33() {
      return build_f_PanelFooter33();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter33 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter33.add(get_f_PrettyPre34());

      return f_PanelFooter33;
    }

    /**
     * Getter for f_PrettyPre34 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre34() {
      return build_f_PrettyPre34();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre34() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre34 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre34.setHTML(template_html12().asString());
      f_PrettyPre34.addStyleName("lang-java");

      return f_PrettyPre34;
    }

    /**
     * Getter for f_Panel35 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel35() {
      return build_f_Panel35();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel35 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel35.add(get_f_PanelHeader36());
      f_Panel35.add(get_f_PanelBody38());
      f_Panel35.add(get_f_PanelFooter39());

      return f_Panel35;
    }

    /**
     * Getter for f_PanelHeader36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader36() {
      return build_f_PanelHeader36();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader36 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader36.add(get_f_Heading37());

      return f_PanelHeader36;
    }

    /**
     * Getter for f_Heading37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading37() {
      return build_f_Heading37();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading37 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading37.setText("Change style, remove close icon");

      return f_Heading37;
    }

    /**
     * Getter for f_PanelBody38 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody38() {
      return build_f_PanelBody38();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody38 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody38.add(get_changeBackgroundAndDismiss());

      return f_PanelBody38;
    }

    /**
     * Getter for changeBackgroundAndDismiss called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_changeBackgroundAndDismiss() {
      return build_changeBackgroundAndDismiss();
    }
    private org.gwtbootstrap3.client.ui.Button build_changeBackgroundAndDismiss() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button changeBackgroundAndDismiss = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      changeBackgroundAndDismiss.setText("Run Example");
      changeBackgroundAndDismiss.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      changeBackgroundAndDismiss.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      changeBackgroundAndDismiss.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      this.owner.changeBackgroundAndDismiss = changeBackgroundAndDismiss;

      return changeBackgroundAndDismiss;
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
      f_PrettyPre40.setHTML(template_html13().asString());
      f_PrettyPre40.addStyleName("lang-java");

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
      f_Panel41.add(get_f_PanelFooter45());

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
      f_Heading43.setText("Change position and set link");

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
      f_PanelBody44.add(get_positionAndLink());

      return f_PanelBody44;
    }

    /**
     * Getter for positionAndLink called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_positionAndLink() {
      return build_positionAndLink();
    }
    private org.gwtbootstrap3.client.ui.Button build_positionAndLink() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button positionAndLink = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      positionAndLink.setText("Run Example");
      positionAndLink.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      positionAndLink.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      positionAndLink.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      this.owner.positionAndLink = positionAndLink;

      return positionAndLink;
    }

    /**
     * Getter for f_PanelFooter45 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter45() {
      return build_f_PanelFooter45();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter45 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter45.add(get_f_PrettyPre46());

      return f_PanelFooter45;
    }

    /**
     * Getter for f_PrettyPre46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre46() {
      return build_f_PrettyPre46();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre46() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre46 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre46.setHTML(template_html14().asString());
      f_PrettyPre46.addStyleName("lang-java");

      return f_PrettyPre46;
    }

    /**
     * Getter for f_Panel47 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel47() {
      return build_f_Panel47();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel47 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel47.add(get_f_PanelHeader48());
      f_Panel47.add(get_f_PanelBody50());
      f_Panel47.add(get_f_PanelFooter53());

      return f_Panel47;
    }

    /**
     * Getter for f_PanelHeader48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader48() {
      return build_f_PanelHeader48();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader48 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader48.add(get_f_Heading49());

      return f_PanelHeader48;
    }

    /**
     * Getter for f_Heading49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading49() {
      return build_f_Heading49();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading49 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading49.setText("Change animation and set offset");

      return f_Heading49;
    }

    /**
     * Getter for f_PanelBody50 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody50() {
      return build_f_PanelBody50();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody50 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody50.add(get_f_Paragraph51());
      f_PanelBody50.add(get_f_ClearFix52());
      f_PanelBody50.add(get_animationAndOffset());

      return f_PanelBody50;
    }

    /**
     * Getter for f_Paragraph51 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph51() {
      return build_f_Paragraph51();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph51 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html15().asString());
      // Setup section.

      return f_Paragraph51;
    }

    /**
     * Getter for f_ClearFix52 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix52() {
      return build_f_ClearFix52();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix52 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix52;
    }

    /**
     * Getter for animationAndOffset called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_animationAndOffset() {
      return build_animationAndOffset();
    }
    private org.gwtbootstrap3.client.ui.Button build_animationAndOffset() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button animationAndOffset = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      animationAndOffset.setText("Run Example");
      animationAndOffset.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      animationAndOffset.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      animationAndOffset.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

      this.owner.animationAndOffset = animationAndOffset;

      return animationAndOffset;
    }

    /**
     * Getter for f_PanelFooter53 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter53() {
      return build_f_PanelFooter53();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter53 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter53.add(get_f_PrettyPre54());

      return f_PanelFooter53;
    }

    /**
     * Getter for f_PrettyPre54 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre54() {
      return build_f_PrettyPre54();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre54() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre54 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre54.setHTML(template_html16().asString());
      f_PrettyPre54.addStyleName("lang-java");

      return f_PrettyPre54;
    }

    /**
     * Getter for f_Panel55 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel55() {
      return build_f_Panel55();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel55 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel55.add(get_f_PanelHeader56());
      f_Panel55.add(get_f_PanelBody58());
      f_Panel55.add(get_f_PanelFooter61());

      return f_Panel55;
    }

    /**
     * Getter for f_PanelHeader56 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader56() {
      return build_f_PanelHeader56();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader56 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader56.add(get_f_Heading57());

      return f_PanelHeader56;
    }

    /**
     * Getter for f_Heading57 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading57() {
      return build_f_Heading57();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading57 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading57.setText("Own template and make it default");

      return f_Heading57;
    }

    /**
     * Getter for f_PanelBody58 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody58() {
      return build_f_PanelBody58();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody58 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody58.add(get_f_Paragraph59());
      f_PanelBody58.add(get_f_ClearFix60());
      f_PanelBody58.add(get_template());

      return f_PanelBody58;
    }

    /**
     * Getter for f_Paragraph59 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph59() {
      return build_f_Paragraph59();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph59 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html17().asString());
      // Setup section.

      return f_Paragraph59;
    }

    /**
     * Getter for f_ClearFix60 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix60() {
      return build_f_ClearFix60();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix60 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix60;
    }

    /**
     * Getter for template called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_template() {
      return build_template();
    }
    private org.gwtbootstrap3.client.ui.Button build_template() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button template = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      template.setText("Run Example");
      template.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      template.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      template.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

      this.owner.template = template;

      return template;
    }

    /**
     * Getter for f_PanelFooter61 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter61() {
      return build_f_PanelFooter61();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter61 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter61.add(get_f_PrettyPre62());

      return f_PanelFooter61;
    }

    /**
     * Getter for f_PrettyPre62 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre62() {
      return build_f_PrettyPre62();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre62() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre62 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre62.setHTML(template_html18().asString());
      f_PrettyPre62.addStyleName("lang-java");

      return f_PrettyPre62;
    }
  }
}
