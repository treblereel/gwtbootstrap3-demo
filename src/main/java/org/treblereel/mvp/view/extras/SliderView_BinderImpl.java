// Template file: org/treblereel/mvp/view/extras/SliderView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.48")
public class SliderView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.SliderView>, org.treblereel.mvp.view.extras.SliderView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Bootstrap Slider")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 9.2.0")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("This extra only support modern browsers. Basically, any browser below IE9 is not compatible.")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("To use Slider, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.slider.Slider\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it b3):")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("xmlns:b3=\"urn:import:org.gwtbootstrap3.extras.slider.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("&lt;b3:Slider ui:field=\"mySlider\" min=\"0\" max=\"20\" step=\"1\" value=\"14\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("// Enable/Disable slider\\n mySlider.setEnabled(true);\\n mySlider.setEnabled(false);\\n\\n // Slider enabled?\\n boolean isEnabled = mySlider.isEnabled();\\n\\n // Toggle slider\\n mySlider.toggle();\\n\\n // Get value\\n double value = mySlider.getValue();\\n\\n // Set value\\n mySlider.setValue(10);\\n")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("&lt;b3:RangeSlider ui:field=\"myRangeSlider\" min=\"10\" max=\"1000\" step=\"5\" value=\"[250,450]\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("// Enable/Disable range slider\\n myRangeSlider.setEnabled(true);\\n myRangeSlider.setEnabled(false);\\n\\n // Slider enabled?\\n boolean isEnabled = myRangeSlider.isEnabled();\\n\\n // Toggle range slider\\n myRangeSlider.toggle();\\n\\n // Get value\\n Range value = myRangeSlider.getValue();\\n\\n // Set value\\n myRangeSlider.setValue(new Range(400, 700));\\n")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("&lt;b3:Slider ui:field=\"myVerticalSlider\" min=\"0\" max=\"10\" value=\"5\" orientation=\"VERTICAL\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("// Toggle Reversed\\n myVerticalSlider.setReversed(!myVerticalSlider.isReversed());\\n")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("&lt;b3:Slider min=\"10\" max=\"20\" value=\"15\" handle=\"ROUND\"/&gt;\\n &lt;b3:Slider min=\"10\" max=\"20\" value=\"15\" handle=\"SQUARE\"/&gt;\\n &lt;b3:Slider min=\"10\" max=\"20\" value=\"15\" handle=\"TRIANGLE\"/&gt;\\n &lt;b3:Slider min=\"10\" max=\"20\" value=\"15\" handle=\"CUSTOM\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("&lt;b3:Slider ui:field=“mySlider” min=\"-100.0\" max=\"100.0\" value=\"0\" step=\"5.0\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("mySlider.setFormatter(new FormatterCallback&lt;Double&gt;() {\\n \\s\\s@Override\\n \\s\\spublic String formatTooltip(final Double value) {\\n \\s\\s\\sreturn \"Current value: \" + value;\\n \\s\\s}\\n });\\n")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
    @Template("&lt;b3:RangeSlider ui:field=\"myRangeSlider\" min=\"0\" max=\"100\" step=\"5\" value=\"[20,60]\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("myRangeSlider.setFormatter(new FormatterCallback&lt;Range&gt;() {\\n \\s\\s@Override\\n \\s\\spublic String formatTooltip(final Range range) {\\n \\s\\s\\sreturn \"Range: [\" + range.getMinValue() + \", \" + range.getMaxValue() + \"]\";\\n \\s\\s}\\n });\\n")
    org.gwtproject.safehtml.shared.SafeHtml html21();
     
    @Template("&lt;!-- Slider will instantiate showing 8.12 due to specified precision--&gt;\\n &lt;b3:Slider min=\"0\" max=\"10\" value=\"8.115\" precision=\"2\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
    @Template("&lt;!-- Tooltip: SHOW, ALWAYS, HIDE --&gt;\\n &lt;b3:Slider min=\"0\" max=\"10\" value=\"10\" tooltip=\"SHOW\"/&gt;\\n &lt;b3:Slider min=\"0\" max=\"10\" value=\"10\" tooltip=\"ALWAYS\"/&gt;\\n &lt;b3:Slider min=\"0\" max=\"10\" value=\"10\" tooltip=\"HIDE\"/&gt;\\n\\n &lt;!-- Tooltip Split for Range Sliders --&gt;\\n &lt;b3:RangeSlider min=\"0\" max=\"100\" step=\"5\" value=\"[20,60]\" tooltipSplit=\"true\"/&gt;\\n\\n &lt;!-- Tooltip Position --&gt;\\n &lt;b3:Slider min=\"0\" max=\"10\" value=\"10\" tooltipPosition=\"BOTTOM\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html23();
     
    @Template("&lt;b3:Slider min=\"1000\" max=\"10000000\" value=\"10\" step=\"10\" scale=\"LOGARITHMIC\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html24();
     
    @Template("&lt;b3:Slider ui:field=\"mySlider\" min=\"0\" max=\"100\" step=\"10\" value=\"10\"/&gt;\\n &lt;b3:RangeSlider ui:field=\"myRangeSlider\" min=\"0\" max=\"100\" step=\"10\" value=\"[30,70]\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html25();
     
    @Template("@UiHandler(\"mySlider\")\\n void onSlide(SlideEvent&lt;Double&gt; event) { Double value = event.getValue(); ... }\\n\\n @UiHandler(\"mySlider\")\\n void onSlideStart(SlideStartEvent&lt;Double&gt; event) { Double value = event.getValue(); ... }\\n\\n @UiHandler(\"mySlider\")\\n void onSlideStop(SlideStopEvent&lt;Double&gt; event) { Double value = event.getValue(); ... }\\n\\n @UiHandler(\"mySlider\")\\n void onChange(ValueChangeEvent&lt;Double&gt; event) { Double value = event.getValue(); ... }\\n\\n @UiHandler(\"mySlider\")\\n void onEnabled(SlideEnabledEvent event) { ... }\\n\\n @UiHandler(\"mySlider\")\\n void onDisabled(SlideDisabledEvent event) { ... }\\n\\n @UiHandler(\"myRangeSlider\")\\n void onRangeSlide(SlideEvent&lt;Range&gt; event) { Range range = event.getValue(); ... }\\n\\n @UiHandler(\"myRangeSlider\")\\n void onRangeSlideStart(SlideStartEvent&lt;Range&gt; event) { Range range = event.getValue(); ... }\\n\\n @UiHandler(\"myRangeSlider\")\\n void onRangeSlideStop(SlideStopEvent&lt;Range&gt; event) { Range range = event.getValue(); ... }\\n\\n @UiHandler(\"myRangeSlider\")\\n void onRangeChange(ValueChangeEvent&lt;Range&gt; event) { Range range = event.getValue(); ... }\\n\\n @UiHandler(\"myRangeSlider\")\\n void onRangeEnabled(SlideEnabledEvent event) { ... }\\n\\n @UiHandler(\"myRangeSlider\")\\n void onRangeDisabled(SlideDisabledEvent event) { ... }\\n")
    org.gwtproject.safehtml.shared.SafeHtml html26();
     
  }

  Template template = new SliderView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.SliderView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.SliderView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onEnable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onDisable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onToggle((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onIsEnabled((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onGetValue((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onSetValue((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onRangeDisableEnable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onRangeDisableDisable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onRangeToggle((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onRangeIsEnabled((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onRangeGetValue((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onRangeSetValue((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onVerticalReversed((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onEventRangeToggle((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onEventRangeSetValue((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickclearLogButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.SliderView owner) {
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
    org.gwtproject.safehtml.shared.SafeHtml template_html19() {
      return template.html19();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html20() {
      return template.html20();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html21() {
      return template.html21();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html22() {
      return template.html22();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html23() {
      return template.html23();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html24() {
      return template.html24();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html25() {
      return template.html25();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html26() {
      return template.html26();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.SliderView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.SliderView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.SliderView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.SliderView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 20 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.SliderView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.SliderView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.SliderView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_BlockQuote11());
      f_Column2.add(get_f_Panel19());
      f_Column2.add(get_f_Panel29());
      f_Column2.add(get_f_Panel41());
      f_Column2.add(get_f_Panel51());
      f_Column2.add(get_f_Panel68());
      f_Column2.add(get_f_Panel80());
      f_Column2.add(get_f_Panel87());
      f_Column2.add(get_f_Panel105());
      f_Column2.add(get_f_Panel112());

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
      f_PageHeader3.setText("Slider");

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
      f_Anchor6.setHref("http://seiyria.github.io/bootstrap-slider/");
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
      f_BlockQuote9.add(get_f_Strong10());
      f_BlockQuote9.addStyleName("" + get_style().danger() + "");

      return f_BlockQuote9;
    }

    /**
     * Getter for f_Strong10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong10() {
      return build_f_Strong10();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong10 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong10.setHTML(template_html4().asString());

      return f_Strong10;
    }

    /**
     * Getter for f_BlockQuote11 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.BlockQuote get_f_BlockQuote11() {
      return build_f_BlockQuote11();
    }
    private org.gwtbootstrap3.client.ui.BlockQuote build_f_BlockQuote11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.BlockQuote f_BlockQuote11 = new org.gwtbootstrap3.client.ui.BlockQuote();
      // Setup section.
      f_BlockQuote11.add(get_f_Heading12());
      f_BlockQuote11.add(get_f_Paragraph13());
      f_BlockQuote11.add(get_f_PrettyPre14());
      f_BlockQuote11.add(get_f_Paragraph15());
      f_BlockQuote11.add(get_f_PrettyPre16());
      f_BlockQuote11.add(get_f_Paragraph17());
      f_BlockQuote11.add(get_f_PrettyPre18());
      f_BlockQuote11.addStyleName("" + get_style().danger() + "");

      return f_BlockQuote11;
    }

    /**
     * Getter for f_Heading12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading12() {
      return build_f_Heading12();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading12 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading12.addStyleName("" + get_style().marginFix() + "");
      f_Heading12.setText("Required for use");

      return f_Heading12;
    }

    /**
     * Getter for f_Paragraph13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph13() {
      return build_f_Paragraph13();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph13 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
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
      f_PrettyPre14.setHTML(template_html6().asString());
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
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph15 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html7().asString());
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
      f_PrettyPre16.setHTML(template_html8().asString());
      f_PrettyPre16.addStyleName("lang-xml");

      return f_PrettyPre16;
    }

    /**
     * Getter for f_Paragraph17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph17() {
      return build_f_Paragraph17();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph17 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html9().asString());
      // Setup section.

      return f_Paragraph17;
    }

    /**
     * Getter for f_PrettyPre18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre18() {
      return build_f_PrettyPre18();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre18() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre18 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre18.setHTML(template_html10().asString());
      f_PrettyPre18.addStyleName("lang-xml");

      return f_PrettyPre18;
    }

    /**
     * Getter for f_Panel19 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel19() {
      return build_f_Panel19();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel19 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel19.add(get_f_PanelHeader20());
      f_Panel19.add(get_f_PanelBody22());
      f_Panel19.add(get_f_PanelFooter26());

      return f_Panel19;
    }

    /**
     * Getter for f_PanelHeader20 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader20() {
      return build_f_PanelHeader20();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader20 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader20.add(get_f_Heading21());

      return f_PanelHeader20;
    }

    /**
     * Getter for f_Heading21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading21() {
      return build_f_Heading21();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading21 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading21.setText("Basic Slider");

      return f_Heading21;
    }

    /**
     * Getter for f_PanelBody22 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody22() {
      return build_f_PanelBody22();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody22 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody22.add(get_f_Row23());

      return f_PanelBody22;
    }

    /**
     * Getter for f_Row23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row23() {
      return build_f_Row23();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row23 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row23.add(get_f_Column24());
      f_Row23.add(get_f_Column25());

      return f_Row23;
    }

    /**
     * Getter for f_Column24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column24() {
      return build_f_Column24();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column24 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column24.add(get_basicExample());

      return f_Column24;
    }

    /**
     * Getter for basicExample called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_basicExample() {
      return build_basicExample();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_basicExample() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider basicExample = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 20, 14);
      // Setup section.
      basicExample.setStep(1);

      this.owner.basicExample = basicExample;

      return basicExample;
    }

    /**
     * Getter for f_Column25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column25() {
      return build_f_Column25();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column25 = new org.gwtbootstrap3.client.ui.Column("SM_8");
      // Setup section.
      f_Column25.add(get_enable());
      f_Column25.add(get_disable());
      f_Column25.add(get_isEnabled());
      f_Column25.add(get_toggle());
      f_Column25.add(get_getValue());
      f_Column25.add(get_setValue());

      return f_Column25;
    }

    /**
     * Getter for enable called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_enable() {
      return build_enable();
    }
    private org.gwtbootstrap3.client.ui.Button build_enable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button enable = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      enable.setText("Enable");
      enable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      enable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return enable;
    }

    /**
     * Getter for disable called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_disable() {
      return build_disable();
    }
    private org.gwtbootstrap3.client.ui.Button build_disable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button disable = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      disable.addStyleName("" + get_style().spacing() + "");
      disable.setText("Disable");
      disable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      disable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      return disable;
    }

    /**
     * Getter for isEnabled called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_isEnabled() {
      return build_isEnabled();
    }
    private org.gwtbootstrap3.client.ui.Button build_isEnabled() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button isEnabled = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      isEnabled.addStyleName("" + get_style().spacing() + "");
      isEnabled.setText("isEnabled");
      isEnabled.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      isEnabled.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      return isEnabled;
    }

    /**
     * Getter for toggle called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_toggle() {
      return build_toggle();
    }
    private org.gwtbootstrap3.client.ui.Button build_toggle() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button toggle = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      toggle.addStyleName("" + get_style().spacing() + "");
      toggle.setText("Toggle");
      toggle.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      toggle.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      return toggle;
    }

    /**
     * Getter for getValue called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_getValue() {
      return build_getValue();
    }
    private org.gwtbootstrap3.client.ui.Button build_getValue() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button getValue = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      getValue.addStyleName("" + get_style().spacing() + "");
      getValue.setText("Get Value");
      getValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      getValue.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      return getValue;
    }

    /**
     * Getter for setValue called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_setValue() {
      return build_setValue();
    }
    private org.gwtbootstrap3.client.ui.Button build_setValue() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button setValue = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      setValue.addStyleName("" + get_style().spacing() + "");
      setValue.setText("Set Value");
      setValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      setValue.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

      return setValue;
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
      f_PanelFooter26.add(get_f_PrettyPre27());
      f_PanelFooter26.add(get_f_PrettyPre28());

      return f_PanelFooter26;
    }

    /**
     * Getter for f_PrettyPre27 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre27() {
      return build_f_PrettyPre27();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre27() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre27 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre27.setHTML(template_html11().asString());
      f_PrettyPre27.addStyleName("lang-xml");

      return f_PrettyPre27;
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
      f_PrettyPre28.setHTML(template_html12().asString());
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
      f_Panel29.add(get_f_PanelFooter38());

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
      f_Heading31.setText("Range Slider");

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
      f_PanelBody32.add(get_f_Row33());

      return f_PanelBody32;
    }

    /**
     * Getter for f_Row33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row33() {
      return build_f_Row33();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row33 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row33.add(get_f_Column34());
      f_Row33.add(get_f_Column37());

      return f_Row33;
    }

    /**
     * Getter for f_Column34 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column34() {
      return build_f_Column34();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column34 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column34.add(get_f_Strong35());
      f_Column34.add(get_rangeExample());
      f_Column34.add(get_f_Strong36());

      return f_Column34;
    }

    /**
     * Getter for f_Strong35 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong35() {
      return build_f_Strong35();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong35 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong35.setText("10");

      return f_Strong35;
    }

    /**
     * Getter for rangeExample called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider get_rangeExample() {
      return build_rangeExample();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider build_rangeExample() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.RangeSlider rangeExample = new org.gwtbootstrap3.extras.slider.client.ui.RangeSlider(10, 1000, "[250,450]");
      // Setup section.
      rangeExample.setStep(5);

      this.owner.rangeExample = rangeExample;

      return rangeExample;
    }

    /**
     * Getter for f_Strong36 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong36() {
      return build_f_Strong36();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong36 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong36.setText("1000");

      return f_Strong36;
    }

    /**
     * Getter for f_Column37 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column37() {
      return build_f_Column37();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column37 = new org.gwtbootstrap3.client.ui.Column("SM_8");
      // Setup section.
      f_Column37.add(get_rangeEnable());
      f_Column37.add(get_rangeDisable());
      f_Column37.add(get_rangeIsEnabled());
      f_Column37.add(get_rangeToggle());
      f_Column37.add(get_rangeGetValue());
      f_Column37.add(get_rangeSetValue());

      return f_Column37;
    }

    /**
     * Getter for rangeEnable called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_rangeEnable() {
      return build_rangeEnable();
    }
    private org.gwtbootstrap3.client.ui.Button build_rangeEnable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button rangeEnable = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      rangeEnable.setText("Enable");
      rangeEnable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      rangeEnable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

      return rangeEnable;
    }

    /**
     * Getter for rangeDisable called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_rangeDisable() {
      return build_rangeDisable();
    }
    private org.gwtbootstrap3.client.ui.Button build_rangeDisable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button rangeDisable = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      rangeDisable.addStyleName("" + get_style().spacing() + "");
      rangeDisable.setText("Disable");
      rangeDisable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      rangeDisable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

      return rangeDisable;
    }

    /**
     * Getter for rangeIsEnabled called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_rangeIsEnabled() {
      return build_rangeIsEnabled();
    }
    private org.gwtbootstrap3.client.ui.Button build_rangeIsEnabled() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button rangeIsEnabled = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      rangeIsEnabled.addStyleName("" + get_style().spacing() + "");
      rangeIsEnabled.setText("isEnabled");
      rangeIsEnabled.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      rangeIsEnabled.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10);

      return rangeIsEnabled;
    }

    /**
     * Getter for rangeToggle called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_rangeToggle() {
      return build_rangeToggle();
    }
    private org.gwtbootstrap3.client.ui.Button build_rangeToggle() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button rangeToggle = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      rangeToggle.addStyleName("" + get_style().spacing() + "");
      rangeToggle.setText("Toggle");
      rangeToggle.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      rangeToggle.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);

      return rangeToggle;
    }

    /**
     * Getter for rangeGetValue called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_rangeGetValue() {
      return build_rangeGetValue();
    }
    private org.gwtbootstrap3.client.ui.Button build_rangeGetValue() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button rangeGetValue = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      rangeGetValue.addStyleName("" + get_style().spacing() + "");
      rangeGetValue.setText("Get Value");
      rangeGetValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      rangeGetValue.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11);

      return rangeGetValue;
    }

    /**
     * Getter for rangeSetValue called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_rangeSetValue() {
      return build_rangeSetValue();
    }
    private org.gwtbootstrap3.client.ui.Button build_rangeSetValue() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button rangeSetValue = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      rangeSetValue.addStyleName("" + get_style().spacing() + "");
      rangeSetValue.setText("Set Value");
      rangeSetValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      rangeSetValue.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12);

      return rangeSetValue;
    }

    /**
     * Getter for f_PanelFooter38 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter38() {
      return build_f_PanelFooter38();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter38 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter38.add(get_f_PrettyPre39());
      f_PanelFooter38.add(get_f_PrettyPre40());

      return f_PanelFooter38;
    }

    /**
     * Getter for f_PrettyPre39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre39() {
      return build_f_PrettyPre39();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre39() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre39 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre39.setHTML(template_html13().asString());
      f_PrettyPre39.addStyleName("lang-xml");

      return f_PrettyPre39;
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
      f_PrettyPre40.setHTML(template_html14().asString());
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
      f_Panel41.add(get_f_PanelFooter48());

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
      f_Heading43.setText("Vertical Slider");

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
      f_PanelBody44.add(get_f_Row45());

      return f_PanelBody44;
    }

    /**
     * Getter for f_Row45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row45() {
      return build_f_Row45();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row45 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row45.add(get_f_Column46());
      f_Row45.add(get_f_Column47());

      return f_Row45;
    }

    /**
     * Getter for f_Column46 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column46() {
      return build_f_Column46();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column46 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column46.add(get_verticalExample());

      return f_Column46;
    }

    /**
     * Getter for verticalExample called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_verticalExample() {
      return build_verticalExample();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_verticalExample() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider verticalExample = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 10, 5);
      // Setup section.
      verticalExample.setOrientation(org.gwtbootstrap3.extras.slider.client.ui.base.constants.OrientationType.VERTICAL);

      this.owner.verticalExample = verticalExample;

      return verticalExample;
    }

    /**
     * Getter for f_Column47 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column47() {
      return build_f_Column47();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column47 = new org.gwtbootstrap3.client.ui.Column("SM_8");
      // Setup section.
      f_Column47.add(get_verticalReversed());

      return f_Column47;
    }

    /**
     * Getter for verticalReversed called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_verticalReversed() {
      return build_verticalReversed();
    }
    private org.gwtbootstrap3.client.ui.Button build_verticalReversed() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button verticalReversed = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      verticalReversed.setText("Reverse");
      verticalReversed.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      verticalReversed.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13);

      return verticalReversed;
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
      f_PanelFooter48.add(get_f_PrettyPre50());

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
      f_PrettyPre49.addStyleName("lang-xml");

      return f_PrettyPre49;
    }

    /**
     * Getter for f_PrettyPre50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre50() {
      return build_f_PrettyPre50();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre50() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre50 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre50.setHTML(template_html16().asString());
      f_PrettyPre50.addStyleName("lang-java");

      return f_PrettyPre50;
    }

    /**
     * Getter for f_Panel51 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel51() {
      return build_f_Panel51();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel51 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel51.add(get_f_PanelHeader52());
      f_Panel51.add(get_f_PanelBody54());
      f_Panel51.add(get_f_PanelFooter66());

      return f_Panel51;
    }

    /**
     * Getter for f_PanelHeader52 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader52() {
      return build_f_PanelHeader52();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader52 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader52.add(get_f_Heading53());

      return f_PanelHeader52;
    }

    /**
     * Getter for f_Heading53 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading53() {
      return build_f_Heading53();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading53 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading53.setText("Handle");

      return f_Heading53;
    }

    /**
     * Getter for f_PanelBody54 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody54() {
      return build_f_PanelBody54();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody54 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody54.add(get_f_Row55());

      return f_PanelBody54;
    }

    /**
     * Getter for f_Row55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row55() {
      return build_f_Row55();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row55 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row55.add(get_f_Column56());
      f_Row55.add(get_f_Column61());

      return f_Row55;
    }

    /**
     * Getter for f_Column56 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column56() {
      return build_f_Column56();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column56 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column56.add(get_f_Slider57());
      f_Column56.add(get_f_Br58());
      f_Column56.add(get_f_Br59());
      f_Column56.add(get_f_Slider60());

      return f_Column56;
    }

    /**
     * Getter for f_Slider57 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider57() {
      return build_f_Slider57();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider57() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider57 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(10, 20, 15);
      // Setup section.
      f_Slider57.setHandle(org.gwtbootstrap3.extras.slider.client.ui.base.constants.HandleType.ROUND);

      return f_Slider57;
    }

    /**
     * Getter for f_Br58 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br58() {
      return build_f_Br58();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br58 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br58;
    }

    /**
     * Getter for f_Br59 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br59() {
      return build_f_Br59();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br59 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br59;
    }

    /**
     * Getter for f_Slider60 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider60() {
      return build_f_Slider60();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider60() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider60 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(10, 20, 15);
      // Setup section.
      f_Slider60.setHandle(org.gwtbootstrap3.extras.slider.client.ui.base.constants.HandleType.SQUARE);

      return f_Slider60;
    }

    /**
     * Getter for f_Column61 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column61() {
      return build_f_Column61();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column61 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column61.add(get_f_Slider62());
      f_Column61.add(get_f_Br63());
      f_Column61.add(get_f_Br64());
      f_Column61.add(get_f_Slider65());

      return f_Column61;
    }

    /**
     * Getter for f_Slider62 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider62() {
      return build_f_Slider62();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider62() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider62 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(10, 20, 15);
      // Setup section.
      f_Slider62.setHandle(org.gwtbootstrap3.extras.slider.client.ui.base.constants.HandleType.TRIANGLE);

      return f_Slider62;
    }

    /**
     * Getter for f_Br63 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br63() {
      return build_f_Br63();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br63 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br63;
    }

    /**
     * Getter for f_Br64 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br64() {
      return build_f_Br64();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br64 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br64;
    }

    /**
     * Getter for f_Slider65 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider65() {
      return build_f_Slider65();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider65() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider65 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(10, 20, 15);
      // Setup section.
      f_Slider65.setHandle(org.gwtbootstrap3.extras.slider.client.ui.base.constants.HandleType.CUSTOM);

      return f_Slider65;
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
      f_PrettyPre67.setHTML(template_html17().asString());
      f_PrettyPre67.addStyleName("lang-xml");

      return f_PrettyPre67;
    }

    /**
     * Getter for f_Panel68 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel68() {
      return build_f_Panel68();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel68 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel68.add(get_f_PanelHeader69());
      f_Panel68.add(get_f_PanelBody71());
      f_Panel68.add(get_f_PanelFooter75());

      return f_Panel68;
    }

    /**
     * Getter for f_PanelHeader69 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader69() {
      return build_f_PanelHeader69();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader69 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader69.add(get_f_Heading70());

      return f_PanelHeader69;
    }

    /**
     * Getter for f_Heading70 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading70() {
      return build_f_Heading70();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading70 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading70.setText("Formatter");

      return f_Heading70;
    }

    /**
     * Getter for f_PanelBody71 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody71() {
      return build_f_PanelBody71();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody71 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody71.add(get_f_Row72());

      return f_PanelBody71;
    }

    /**
     * Getter for f_Row72 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row72() {
      return build_f_Row72();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row72 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row72.add(get_f_Column73());
      f_Row72.add(get_f_Column74());

      return f_Row72;
    }

    /**
     * Getter for f_Column73 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column73() {
      return build_f_Column73();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column73 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column73.add(get_formatterExample());

      return f_Column73;
    }

    /**
     * Getter for formatterExample called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_formatterExample() {
      return build_formatterExample();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_formatterExample() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider formatterExample = new org.gwtbootstrap3.extras.slider.client.ui.Slider(-100.0, 100.0, 0);
      // Setup section.
      formatterExample.setStep(5.0);

      this.owner.formatterExample = formatterExample;

      return formatterExample;
    }

    /**
     * Getter for f_Column74 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column74() {
      return build_f_Column74();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column74() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column74 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column74.add(get_rangeFormatterExample());

      return f_Column74;
    }

    /**
     * Getter for rangeFormatterExample called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider get_rangeFormatterExample() {
      return build_rangeFormatterExample();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider build_rangeFormatterExample() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.RangeSlider rangeFormatterExample = new org.gwtbootstrap3.extras.slider.client.ui.RangeSlider(0, 100, "[20,60]");
      // Setup section.
      rangeFormatterExample.setStep(5);

      this.owner.rangeFormatterExample = rangeFormatterExample;

      return rangeFormatterExample;
    }

    /**
     * Getter for f_PanelFooter75 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter75() {
      return build_f_PanelFooter75();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter75 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter75.add(get_f_PrettyPre76());
      f_PanelFooter75.add(get_f_PrettyPre77());
      f_PanelFooter75.add(get_f_PrettyPre78());
      f_PanelFooter75.add(get_f_PrettyPre79());

      return f_PanelFooter75;
    }

    /**
     * Getter for f_PrettyPre76 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre76() {
      return build_f_PrettyPre76();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre76() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre76 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre76.setHTML(template_html18().asString());
      f_PrettyPre76.addStyleName("lang-xml");

      return f_PrettyPre76;
    }

    /**
     * Getter for f_PrettyPre77 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre77() {
      return build_f_PrettyPre77();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre77() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre77 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre77.setHTML(template_html19().asString());
      f_PrettyPre77.addStyleName("lang-java");

      return f_PrettyPre77;
    }

    /**
     * Getter for f_PrettyPre78 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre78() {
      return build_f_PrettyPre78();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre78() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre78 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre78.setHTML(template_html20().asString());
      f_PrettyPre78.addStyleName("lang-xml");

      return f_PrettyPre78;
    }

    /**
     * Getter for f_PrettyPre79 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre79() {
      return build_f_PrettyPre79();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre79() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre79 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre79.setHTML(template_html21().asString());
      f_PrettyPre79.addStyleName("lang-java");

      return f_PrettyPre79;
    }

    /**
     * Getter for f_Panel80 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel80() {
      return build_f_Panel80();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel80 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel80.add(get_f_PanelHeader81());
      f_Panel80.add(get_f_PanelBody83());
      f_Panel80.add(get_f_PanelFooter85());

      return f_Panel80;
    }

    /**
     * Getter for f_PanelHeader81 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader81() {
      return build_f_PanelHeader81();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader81 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader81.add(get_f_Heading82());

      return f_PanelHeader81;
    }

    /**
     * Getter for f_Heading82 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading82() {
      return build_f_Heading82();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading82 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading82.setText("Precision");

      return f_Heading82;
    }

    /**
     * Getter for f_PanelBody83 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody83() {
      return build_f_PanelBody83();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody83 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody83.add(get_f_Slider84());

      return f_PanelBody83;
    }

    /**
     * Getter for f_Slider84 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider84() {
      return build_f_Slider84();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider84() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider84 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 10, 8.115);
      // Setup section.
      f_Slider84.setPrecision(2);

      return f_Slider84;
    }

    /**
     * Getter for f_PanelFooter85 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter85() {
      return build_f_PanelFooter85();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter85() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter85 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter85.add(get_f_PrettyPre86());

      return f_PanelFooter85;
    }

    /**
     * Getter for f_PrettyPre86 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre86() {
      return build_f_PrettyPre86();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre86() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre86 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre86.setHTML(template_html22().asString());
      f_PrettyPre86.addStyleName("lang-xml");

      return f_PrettyPre86;
    }

    /**
     * Getter for f_Panel87 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel87() {
      return build_f_Panel87();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel87() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel87 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel87.add(get_f_PanelHeader88());
      f_Panel87.add(get_f_PanelBody90());
      f_Panel87.add(get_f_PanelFooter103());

      return f_Panel87;
    }

    /**
     * Getter for f_PanelHeader88 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader88() {
      return build_f_PanelHeader88();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader88 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader88.add(get_f_Heading89());

      return f_PanelHeader88;
    }

    /**
     * Getter for f_Heading89 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading89() {
      return build_f_Heading89();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading89 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading89.setText("Tooltip");

      return f_Heading89;
    }

    /**
     * Getter for f_PanelBody90 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody90() {
      return build_f_PanelBody90();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody90 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody90.add(get_f_Row91());
      f_PanelBody90.add(get_f_Row98());

      return f_PanelBody90;
    }

    /**
     * Getter for f_Row91 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row91() {
      return build_f_Row91();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row91 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row91.add(get_f_Column92());
      f_Row91.add(get_f_Column94());
      f_Row91.add(get_f_Column96());

      return f_Row91;
    }

    /**
     * Getter for f_Column92 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column92() {
      return build_f_Column92();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column92() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column92 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column92.add(get_f_Slider93());

      return f_Column92;
    }

    /**
     * Getter for f_Slider93 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider93() {
      return build_f_Slider93();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider93() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider93 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 10, 10);
      // Setup section.
      f_Slider93.setTooltip(org.gwtbootstrap3.extras.slider.client.ui.base.constants.TooltipType.SHOW);

      return f_Slider93;
    }

    /**
     * Getter for f_Column94 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column94() {
      return build_f_Column94();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column94() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column94 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column94.add(get_f_Slider95());

      return f_Column94;
    }

    /**
     * Getter for f_Slider95 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider95() {
      return build_f_Slider95();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider95() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider95 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 10, 10);
      // Setup section.
      f_Slider95.setTooltip(org.gwtbootstrap3.extras.slider.client.ui.base.constants.TooltipType.ALWAYS);

      return f_Slider95;
    }

    /**
     * Getter for f_Column96 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column96() {
      return build_f_Column96();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column96() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column96 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column96.add(get_f_Slider97());

      return f_Column96;
    }

    /**
     * Getter for f_Slider97 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider97() {
      return build_f_Slider97();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider97() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider97 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 10, 10);
      // Setup section.
      f_Slider97.setTooltip(org.gwtbootstrap3.extras.slider.client.ui.base.constants.TooltipType.HIDE);

      return f_Slider97;
    }

    /**
     * Getter for f_Row98 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row98() {
      return build_f_Row98();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row98() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row98 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row98.add(get_f_Column99());
      f_Row98.add(get_f_Column101());

      return f_Row98;
    }

    /**
     * Getter for f_Column99 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column99() {
      return build_f_Column99();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column99 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column99.add(get_f_RangeSlider100());

      return f_Column99;
    }

    /**
     * Getter for f_RangeSlider100 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider get_f_RangeSlider100() {
      return build_f_RangeSlider100();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider build_f_RangeSlider100() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.RangeSlider f_RangeSlider100 = new org.gwtbootstrap3.extras.slider.client.ui.RangeSlider(0, 100, "[20,60]");
      // Setup section.
      f_RangeSlider100.setStep(5);
      f_RangeSlider100.setTooltipSplit(true);

      return f_RangeSlider100;
    }

    /**
     * Getter for f_Column101 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column101() {
      return build_f_Column101();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column101 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column101.add(get_f_Slider102());

      return f_Column101;
    }

    /**
     * Getter for f_Slider102 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider102() {
      return build_f_Slider102();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider102() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider102 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 10, 10);
      // Setup section.
      f_Slider102.setTooltipPosition(org.gwtbootstrap3.extras.slider.client.ui.base.constants.TooltipPosition.BOTTOM);

      return f_Slider102;
    }

    /**
     * Getter for f_PanelFooter103 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter103() {
      return build_f_PanelFooter103();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter103() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter103 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter103.add(get_f_PrettyPre104());

      return f_PanelFooter103;
    }

    /**
     * Getter for f_PrettyPre104 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre104() {
      return build_f_PrettyPre104();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre104() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre104 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre104.setHTML(template_html23().asString());
      f_PrettyPre104.addStyleName("lang-xml");

      return f_PrettyPre104;
    }

    /**
     * Getter for f_Panel105 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel105() {
      return build_f_Panel105();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel105() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel105 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel105.add(get_f_PanelHeader106());
      f_Panel105.add(get_f_PanelBody108());
      f_Panel105.add(get_f_PanelFooter110());

      return f_Panel105;
    }

    /**
     * Getter for f_PanelHeader106 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader106() {
      return build_f_PanelHeader106();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader106() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader106 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader106.add(get_f_Heading107());

      return f_PanelHeader106;
    }

    /**
     * Getter for f_Heading107 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading107() {
      return build_f_Heading107();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading107() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading107 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading107.setText("Logarithmic Scale");

      return f_Heading107;
    }

    /**
     * Getter for f_PanelBody108 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody108() {
      return build_f_PanelBody108();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody108() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody108 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody108.add(get_f_Slider109());

      return f_PanelBody108;
    }

    /**
     * Getter for f_Slider109 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_f_Slider109() {
      return build_f_Slider109();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_f_Slider109() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider f_Slider109 = new org.gwtbootstrap3.extras.slider.client.ui.Slider(1000, 10000000, 10);
      // Setup section.
      f_Slider109.setScale(org.gwtbootstrap3.extras.slider.client.ui.base.constants.ScaleType.LOGARITHMIC);
      f_Slider109.setStep(10);

      return f_Slider109;
    }

    /**
     * Getter for f_PanelFooter110 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter110() {
      return build_f_PanelFooter110();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter110() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter110 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter110.add(get_f_PrettyPre111());

      return f_PanelFooter110;
    }

    /**
     * Getter for f_PrettyPre111 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre111() {
      return build_f_PrettyPre111();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre111() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre111 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre111.setHTML(template_html24().asString());
      f_PrettyPre111.addStyleName("lang-xml");

      return f_PrettyPre111;
    }

    /**
     * Getter for f_Panel112 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel112() {
      return build_f_Panel112();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel112() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel112 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel112.add(get_f_PanelHeader113());
      f_Panel112.add(get_f_PanelBody115());
      f_Panel112.add(get_f_PanelFooter124());

      return f_Panel112;
    }

    /**
     * Getter for f_PanelHeader113 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader113() {
      return build_f_PanelHeader113();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader113() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader113 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader113.add(get_f_Heading114());

      return f_PanelHeader113;
    }

    /**
     * Getter for f_Heading114 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading114() {
      return build_f_Heading114();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading114() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading114 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading114.setText("Events");

      return f_Heading114;
    }

    /**
     * Getter for f_PanelBody115 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody115() {
      return build_f_PanelBody115();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody115() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody115 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody115.add(get_f_Row116());

      return f_PanelBody115;
    }

    /**
     * Getter for f_Row116 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row116() {
      return build_f_Row116();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row116() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row116 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row116.add(get_f_Column117());
      f_Row116.add(get_f_Column120());

      return f_Row116;
    }

    /**
     * Getter for f_Column117 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column117() {
      return build_f_Column117();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column117() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column117 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_5");
      // Setup section.
      f_Column117.add(get_eventExample());
      f_Column117.add(get_eventToggle());
      f_Column117.add(get_eventSetValue());
      f_Column117.add(get_f_Br118());
      f_Column117.add(get_f_Br119());
      f_Column117.add(get_eventRangeExample());
      f_Column117.add(get_eventRangeToggle());
      f_Column117.add(get_eventRangeSetValue());

      return f_Column117;
    }

    /**
     * Getter for eventExample called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.Slider get_eventExample() {
      return build_eventExample();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.Slider build_eventExample() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.Slider eventExample = new org.gwtbootstrap3.extras.slider.client.ui.Slider(0, 100, 10);
      // Setup section.
      eventExample.setStep(10);

      this.owner.eventExample = eventExample;

      return eventExample;
    }

    /**
     * Getter for eventToggle called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_eventToggle() {
      return build_eventToggle();
    }
    private org.gwtbootstrap3.client.ui.Button build_eventToggle() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button eventToggle = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      eventToggle.addStyleName("" + get_style().spacing() + "");
      eventToggle.setText("Toggle");
      eventToggle.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return eventToggle;
    }

    /**
     * Getter for eventSetValue called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_eventSetValue() {
      return build_eventSetValue();
    }
    private org.gwtbootstrap3.client.ui.Button build_eventSetValue() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button eventSetValue = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      eventSetValue.addStyleName("" + get_style().spacing() + "");
      eventSetValue.setText("SetValue");
      eventSetValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return eventSetValue;
    }

    /**
     * Getter for f_Br118 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br118() {
      return build_f_Br118();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br118() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br118 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br118;
    }

    /**
     * Getter for f_Br119 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br119() {
      return build_f_Br119();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br119() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br119 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br119;
    }

    /**
     * Getter for eventRangeExample called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider get_eventRangeExample() {
      return build_eventRangeExample();
    }
    private org.gwtbootstrap3.extras.slider.client.ui.RangeSlider build_eventRangeExample() {
      // Creation section.
      final org.gwtbootstrap3.extras.slider.client.ui.RangeSlider eventRangeExample = new org.gwtbootstrap3.extras.slider.client.ui.RangeSlider(0, 100, "[30,70]");
      // Setup section.
      eventRangeExample.setStep(10);

      this.owner.eventRangeExample = eventRangeExample;

      return eventRangeExample;
    }

    /**
     * Getter for eventRangeToggle called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_eventRangeToggle() {
      return build_eventRangeToggle();
    }
    private org.gwtbootstrap3.client.ui.Button build_eventRangeToggle() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button eventRangeToggle = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      eventRangeToggle.addStyleName("" + get_style().spacing() + "");
      eventRangeToggle.setText("Toggle");
      eventRangeToggle.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      eventRangeToggle.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14);

      return eventRangeToggle;
    }

    /**
     * Getter for eventRangeSetValue called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_eventRangeSetValue() {
      return build_eventRangeSetValue();
    }
    private org.gwtbootstrap3.client.ui.Button build_eventRangeSetValue() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button eventRangeSetValue = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      eventRangeSetValue.addStyleName("" + get_style().spacing() + "");
      eventRangeSetValue.setText("SetValue");
      eventRangeSetValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      eventRangeSetValue.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15);

      return eventRangeSetValue;
    }

    /**
     * Getter for f_Column120 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column120() {
      return build_f_Column120();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column120() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column120 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_7");
      // Setup section.
      f_Column120.add(get_f_Strong121());
      f_Column120.add(get_clearLogButton());
      f_Column120.add(get_f_Div122());
      f_Column120.add(get_f_ScrollPanel123());
      f_Column120.addStyleName("" + get_style().logRow() + "");

      return f_Column120;
    }

    /**
     * Getter for f_Strong121 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong121() {
      return build_f_Strong121();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong121() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong121 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong121.addStyleName("" + get_style().logTitle() + "");
      f_Strong121.setText("Event Log");

      return f_Strong121;
    }

    /**
     * Getter for clearLogButton called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_clearLogButton() {
      return build_clearLogButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_clearLogButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button clearLogButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      clearLogButton.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);
      clearLogButton.setText("Clear Log");
      clearLogButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16);

      return clearLogButton;
    }

    /**
     * Getter for f_Div122 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_f_Div122() {
      return build_f_Div122();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_f_Div122() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div f_Div122 = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      f_Div122.addStyleName("clearfix");

      return f_Div122;
    }

    /**
     * Getter for f_ScrollPanel123 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtproject.user.client.ui.ScrollPanel get_f_ScrollPanel123() {
      return build_f_ScrollPanel123();
    }
    private org.gwtproject.user.client.ui.ScrollPanel build_f_ScrollPanel123() {
      // Creation section.
      final org.gwtproject.user.client.ui.ScrollPanel f_ScrollPanel123 = new org.gwtproject.user.client.ui.ScrollPanel();
      // Setup section.
      f_ScrollPanel123.add(get_logRow());
      f_ScrollPanel123.setHeight("300px");

      return f_ScrollPanel123;
    }

    /**
     * Getter for logRow called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_logRow() {
      return build_logRow();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_logRow() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel logRow = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.

      this.owner.logRow = logRow;

      return logRow;
    }

    /**
     * Getter for f_PanelFooter124 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter124() {
      return build_f_PanelFooter124();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter124() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter124 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter124.add(get_f_PrettyPre125());
      f_PanelFooter124.add(get_f_PrettyPre126());

      return f_PanelFooter124;
    }

    /**
     * Getter for f_PrettyPre125 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre125() {
      return build_f_PrettyPre125();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre125() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre125 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre125.setHTML(template_html25().asString());
      f_PrettyPre125.addStyleName("lang-xml");

      return f_PrettyPre125;
    }

    /**
     * Getter for f_PrettyPre126 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre126() {
      return build_f_PrettyPre126();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre126() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre126 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre126.setHTML(template_html26().asString());
      f_PrettyPre126.addStyleName("lang-java");

      return f_PrettyPre126;
    }
  }
}
