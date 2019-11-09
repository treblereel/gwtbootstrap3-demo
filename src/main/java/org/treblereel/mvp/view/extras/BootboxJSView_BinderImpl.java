// Template file: org/treblereel/mvp/view/extras/BootboxJSView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.241")
public class BootboxJSView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.BootboxJSView>, org.treblereel.mvp.view.extras.BootboxJSView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Bootbox.js")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 4.4.0")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Bootbox, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.bootbox.Bootbox\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Then, you can call static method from Bootbox class in GWT client code:")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("Bootbox.alert(\"Message\");")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("Select Default Locale:")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("@UiHandler(\"localeBox\")\\n void onChangeLanguage(final ChangeEvent event) {\\n \\s\\sString locale = localeBox.getSelectedValue();\\n \\s\\sBootbox.setLocale(BootboxLocale.valueOf(locale));\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("// Alert\\n @UiHandler(\"alertButton\")\\n void handleAlertButton(ClickEvent event) {\\n \\s\\sBootbox.alert(\"Hello World\");\\n }\\n\\n // Alert With Callback\\n @UiHandler(\"alertCallbackButton\")\\n void handleAlertCallbackButton(ClickEvent event) {\\n \\s\\sBootbox.alert(\"Alert With Callback\", new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Alert Callback\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Alert With Options\\n @UiHandler(\"alertOptionsButton\")\\n void handleAlertOptionsButton(ClickEvent event) {\\n \\s\\sAlertOptions options = AlertOptions.newOptions(\"Alert With Options\");\\n \\s\\soptions.setSize(BootboxSize.LARGE);\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"My Custom Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\sBootbox.alert(options);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("@UiHandler(\"confirmButton\")\\n void handleConfirmButton(ClickEvent event) {\\n \\s\\sBootbox.confirm(\"Hello World\", new ConfirmCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Confirm With Options\\n @UiHandler(\"confirmOptionsButton\")\\n void handleConfirmOptionsButton(ClickEvent event) {\\n \\s\\sConfirmOptions options = ConfirmOptions.newOptions(\"Confirm With Options\");\\n \\s\\soptions.setSize(BootboxSize.SMALL);\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"Custom Confirm Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\soptions.setCallback(new ConfirmCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(final boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\sBootbox.confirm(options);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sBootbox.prompt(\"Hello World\", new PromptCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(String result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Prompt With Options\\n @UiHandler(\"promptOptionsButton\")\\n void handlePromptOptionsButton(ClickEvent event) {\\n \\s\\sPromptOptions options = PromptOptions.newOptions(\"Prompt With Options\");\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"Custom Confirm Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\soptions.setCallback(new PromptCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(final boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\sBootbox.prompt(options);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("@UiHandler(\"dialogButton\")\\n void handleDialogButton(ClickEvent event) {\\n \\s\\sDialogOptions options = DialogOptions.newOptions(\"I am a custom dialog\");\\n \\s\\soptions.setTitle(\"Custom title\");\\n \\s\\soptions.setOnEscape(new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"On Escape!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Success!\", ButtonType.SUCCESS.getCssName(), new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Success callback!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Danger!\", ButtonType.DANGER.getCssName(), new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Danger callback!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Click ME!\");\\n \\s\\sBootbox.dialog(options);\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
  }

  Template template = new BootboxJSView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.BootboxJSView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.BootboxJSView owner;


    final org.gwtproject.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ChangeHandler() {
      public void onChange(org.gwtproject.event.dom.client.ChangeEvent event) {
        owner.onChangeLanguage((org.gwtproject.event.dom.client.ChangeEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleAlertButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleAlertCallbackButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleAlertOptionsButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleConfirmButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleConfirmOptionsButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handlePromptButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handlePromptOptionsButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleDialogButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.BootboxJSView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 8 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel26());
      f_Column2.add(get_f_Panel32());
      f_Column2.add(get_f_Panel38());
      f_Column2.add(get_f_Panel44());

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
      f_PageHeader3.setText("Bootbox");

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
      f_Anchor6.setHref("http://bootboxjs.com/");
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
      f_Panel17.add(get_f_PanelFooter24());

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
      f_Heading19.setText("Default Locale");

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
      f_PanelBody20.add(get_f_Form21());

      return f_PanelBody20;
    }

    /**
     * Getter for f_Form21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form21() {
      return build_f_Form21();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form21 = new org.gwtbootstrap3.client.ui.Form();
      // Setup section.
      f_Form21.add(get_f_FormGroup22());
      f_Form21.setType(org.gwtbootstrap3.client.ui.constants.FormType.INLINE);

      return f_Form21;
    }

    /**
     * Getter for f_FormGroup22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup22() {
      return build_f_FormGroup22();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup22 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup22.add(get_f_FormLabel23());
      f_FormGroup22.add(get_localeBox());

      return f_FormGroup22;
    }

    /**
     * Getter for f_FormLabel23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel23() {
      return build_f_FormLabel23();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel23 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel23.setHTML(template_html10().asString());
      f_FormLabel23.setFor("localeBox");

      return f_FormLabel23;
    }

    /**
     * Getter for localeBox called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_localeBox() {
      return build_localeBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_localeBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox localeBox = new org.gwtbootstrap3.client.ui.ListBox();
      // Setup section.
      localeBox.addStyleName("" + get_style().spacing() + "");
      localeBox.setId("localeBox");
      localeBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.localeBox = localeBox;

      return localeBox;
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
      f_PrettyPre25.setHTML(template_html11().asString());
      f_PrettyPre25.addStyleName("lang-java");

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
      f_Panel26.add(get_f_PanelFooter30());

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
      f_Heading28.setText("Alert");

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
      f_PanelBody29.add(get_alertButton());
      f_PanelBody29.add(get_alertCallbackButton());
      f_PanelBody29.add(get_alertOptionsButton());

      return f_PanelBody29;
    }

    /**
     * Getter for alertButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_alertButton() {
      return build_alertButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_alertButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button alertButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      alertButton.setText("Alert");
      alertButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      alertButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      alertButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      return alertButton;
    }

    /**
     * Getter for alertCallbackButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_alertCallbackButton() {
      return build_alertCallbackButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_alertCallbackButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button alertCallbackButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      alertCallbackButton.setText("Alert With Callback");
      alertCallbackButton.addStyleName("" + get_style().spacing() + "");
      alertCallbackButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      alertCallbackButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      alertCallbackButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      return alertCallbackButton;
    }

    /**
     * Getter for alertOptionsButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_alertOptionsButton() {
      return build_alertOptionsButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_alertOptionsButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button alertOptionsButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      alertOptionsButton.setText("Alert With Options");
      alertOptionsButton.addStyleName("" + get_style().spacing() + "");
      alertOptionsButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      alertOptionsButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      alertOptionsButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      return alertOptionsButton;
    }

    /**
     * Getter for f_PanelFooter30 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter30() {
      return build_f_PanelFooter30();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter30 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter30.add(get_f_PrettyPre31());

      return f_PanelFooter30;
    }

    /**
     * Getter for f_PrettyPre31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre31() {
      return build_f_PrettyPre31();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre31() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre31 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre31.setHTML(template_html12().asString());
      f_PrettyPre31.addStyleName("lang-java");

      return f_PrettyPre31;
    }

    /**
     * Getter for f_Panel32 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel32() {
      return build_f_Panel32();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel32 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel32.add(get_f_PanelHeader33());
      f_Panel32.add(get_f_PanelBody35());
      f_Panel32.add(get_f_PanelFooter36());

      return f_Panel32;
    }

    /**
     * Getter for f_PanelHeader33 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader33() {
      return build_f_PanelHeader33();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader33 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader33.add(get_f_Heading34());

      return f_PanelHeader33;
    }

    /**
     * Getter for f_Heading34 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading34() {
      return build_f_Heading34();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading34 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading34.setText("Confirm");

      return f_Heading34;
    }

    /**
     * Getter for f_PanelBody35 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody35() {
      return build_f_PanelBody35();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody35 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody35.add(get_confirmButton());
      f_PanelBody35.add(get_confirmOptionsButton());

      return f_PanelBody35;
    }

    /**
     * Getter for confirmButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_confirmButton() {
      return build_confirmButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_confirmButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button confirmButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      confirmButton.setText("Confirm");
      confirmButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      confirmButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      confirmButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      return confirmButton;
    }

    /**
     * Getter for confirmOptionsButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_confirmOptionsButton() {
      return build_confirmOptionsButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_confirmOptionsButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button confirmOptionsButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      confirmOptionsButton.setText("Confirm With Options");
      confirmOptionsButton.addStyleName("" + get_style().spacing() + "");
      confirmOptionsButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      confirmOptionsButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      confirmOptionsButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

      return confirmOptionsButton;
    }

    /**
     * Getter for f_PanelFooter36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter36() {
      return build_f_PanelFooter36();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter36 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter36.add(get_f_PrettyPre37());

      return f_PanelFooter36;
    }

    /**
     * Getter for f_PrettyPre37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre37() {
      return build_f_PrettyPre37();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre37() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre37 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre37.setHTML(template_html13().asString());
      f_PrettyPre37.addStyleName("lang-java");

      return f_PrettyPre37;
    }

    /**
     * Getter for f_Panel38 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel38() {
      return build_f_Panel38();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel38 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel38.add(get_f_PanelHeader39());
      f_Panel38.add(get_f_PanelBody41());
      f_Panel38.add(get_f_PanelFooter42());

      return f_Panel38;
    }

    /**
     * Getter for f_PanelHeader39 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader39() {
      return build_f_PanelHeader39();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader39 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader39.add(get_f_Heading40());

      return f_PanelHeader39;
    }

    /**
     * Getter for f_Heading40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading40() {
      return build_f_Heading40();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading40 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading40.setText("Prompt");

      return f_Heading40;
    }

    /**
     * Getter for f_PanelBody41 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody41() {
      return build_f_PanelBody41();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody41 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody41.add(get_promptButton());
      f_PanelBody41.add(get_promptOptionsButton());

      return f_PanelBody41;
    }

    /**
     * Getter for promptButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_promptButton() {
      return build_promptButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_promptButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button promptButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      promptButton.setText("Prompt");
      promptButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      promptButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      promptButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

      return promptButton;
    }

    /**
     * Getter for promptOptionsButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_promptOptionsButton() {
      return build_promptOptionsButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_promptOptionsButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button promptOptionsButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      promptOptionsButton.setText("Prompt With Options");
      promptOptionsButton.addStyleName("" + get_style().spacing() + "");
      promptOptionsButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      promptOptionsButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      promptOptionsButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

      return promptOptionsButton;
    }

    /**
     * Getter for f_PanelFooter42 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter42() {
      return build_f_PanelFooter42();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter42 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter42.add(get_f_PrettyPre43());

      return f_PanelFooter42;
    }

    /**
     * Getter for f_PrettyPre43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre43() {
      return build_f_PrettyPre43();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre43() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre43 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre43.setHTML(template_html14().asString());
      f_PrettyPre43.addStyleName("lang-java");

      return f_PrettyPre43;
    }

    /**
     * Getter for f_Panel44 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel44() {
      return build_f_Panel44();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel44 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel44.add(get_f_PanelHeader45());
      f_Panel44.add(get_f_PanelBody47());
      f_Panel44.add(get_f_PanelFooter48());

      return f_Panel44;
    }

    /**
     * Getter for f_PanelHeader45 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader45() {
      return build_f_PanelHeader45();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader45 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader45.add(get_f_Heading46());

      return f_PanelHeader45;
    }

    /**
     * Getter for f_Heading46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading46() {
      return build_f_Heading46();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading46 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading46.setText("Custom Dialog");

      return f_Heading46;
    }

    /**
     * Getter for f_PanelBody47 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody47() {
      return build_f_PanelBody47();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody47 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody47.add(get_dialogButton());

      return f_PanelBody47;
    }

    /**
     * Getter for dialogButton called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_dialogButton() {
      return build_dialogButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_dialogButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button dialogButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      dialogButton.setText("Custom Dialog");
      dialogButton.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      dialogButton.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      dialogButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);

      return dialogButton;
    }

    /**
     * Getter for f_PanelFooter48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter48() {
      return build_f_PanelFooter48();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter48 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter48.add(get_f_PrettyPre49());

      return f_PanelFooter48;
    }

    /**
     * Getter for f_PrettyPre49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre49() {
      return build_f_PrettyPre49();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre49() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre49 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre49.setHTML(template_html15().asString());
      f_PrettyPre49.addStyleName("lang-java");

      return f_PrettyPre49;
    }
  }
}
