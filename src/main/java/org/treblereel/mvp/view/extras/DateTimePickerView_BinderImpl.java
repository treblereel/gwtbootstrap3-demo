// Template file: org/treblereel/mvp/view/extras/DateTimePickerView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.409")
public class DateTimePickerView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.DateTimePickerView>, org.treblereel.mvp.view.extras.DateTimePickerView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Bootstrap DateTimePicker")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 2.3.11")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use the DateTimePicker, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.datetimepicker.DateTimePicker\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it b2):")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("xmlns:b2=\"urn:import:org.gwtbootstrap3.extras.datetimepicker.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("Basic")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("&lt;b2:DateTimePicker/&gt;\\n\\n &lt;b:Modal title=\"...\" closable=\"...\" fade=\"...\" dataBackdrop=\"STATIC\" b:id=\"...\"&gt;\\n\\s\\s&lt;b:ModalBody&gt;\\n \\s\\s&lt;b:ModalBody&gt;\\n \\s\\s\\s\\s&lt;b2:DateTimePicker/&gt;\\n \\s\\s&lt;/b:ModalBody&gt;\\n \\s\\s&lt;b:ModalFooter&gt;\\n \\s\\s\\s\\s&lt;b:Button type=\"DANGER\" dataDismiss=\"MODAL\"&gt;Close&lt;/b:Button&gt;\\n \\s\\s&lt;/b:ModalFooter&gt;\\n &lt;/b:Modal&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("Change the language for the DateTimePicker.")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("&lt;b2:DateTimePicker autoClose=\"true\" language=\"...\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("Change the position of the popup: TOP_LEFT, BOTTOM_LEFT, TOP_RIGHT, BOTTOM_RIGHT(**Default**)")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("The positions seem a bit off to me, but this is how the JS library has it.")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("&lt;b2:DateTimePicker autoClose=\"true\" position=\"...\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("Automatically close the selector after selecting a date.")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("&lt;b2:DateTimePicker autoClose=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("&lt;b2:DateTimePicker showMeridian=\"true\" format=\"mm/dd/yyyy HH:ii P\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
    @Template("&lt;b2:DateTimePicker minView=\"MONTH\" format=\"mm/dd/yyyy\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("With only every 30 minutes available.")
    org.gwtproject.safehtml.shared.SafeHtml html21();
     
    @Template("&lt;b2:DateTimePicker startView=\"DAY\" minView=\"HOUR\" maxView=\"DAY\" format=\"HH:ii P\" formatViewType=\"TIME\"/&gt;\\n\\n &lt;b2:DateTimePicker startView=\"DAY\" minView=\"HOUR\" maxView=\"DAY\" format=\"HH:ii P\" formatViewType=\"TIME\" minuteStep=\"30\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
    @Template("&lt;b2:DateTimePicker highlightToday=\"true\" showTodayButton=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html23();
     
    @Template("&lt;b2:DateTimePicker/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html24();
     
    @Template("")
    org.gwtproject.safehtml.shared.SafeHtml html25();
     
  }

  Template template = new DateTimePickerView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.DateTimePickerView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.DateTimePickerView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleAddRemove((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleClearLog((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleEndDate((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleStartDate((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleGetValue((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleSetValue((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleEnable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handledisable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleReadOnly((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleEditable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleDisableSundays((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleEnableSundays((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleHide((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleShow((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleSetFormat((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.DateTimePickerView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.DateTimePickerView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.DateTimePickerView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.DateTimePickerView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.DateTimePickerView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 8 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.DateTimePickerView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.DateTimePickerView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.DateTimePickerView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel32());
      f_Column2.add(get_f_Panel40());
      f_Column2.add(get_f_Panel49());
      f_Column2.add(get_f_Panel57());
      f_Column2.add(get_f_Panel63());
      f_Column2.add(get_f_Panel70());
      f_Column2.add(get_f_Panel79());
      f_Column2.add(get_f_Panel86());
      f_Column2.add(get_f_Panel96());

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
      f_PageHeader3.setText("DateTimePicker");

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
      f_Anchor6.setHref("http://www.malot.fr/bootstrap-datetimepicker/");
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
      f_Panel17.add(get_f_PanelFooter30());

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
      f_PanelBody20.add(get_f_FormGroup21());
      f_PanelBody20.add(get_modal());
      f_PanelBody20.add(get_f_Button29());

      return f_PanelBody20;
    }

    /**
     * Getter for f_FormGroup21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup21() {
      return build_f_FormGroup21();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup21 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup21.add(get_f_FormLabel22());
      f_FormGroup21.add(get_f_InlineHelpBlock23());
      f_FormGroup21.add(get_f_DateTimePicker24());

      return f_FormGroup21;
    }

    /**
     * Getter for f_FormLabel22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel22() {
      return build_f_FormLabel22();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel22 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel22.setHTML(template_html10().asString());
      f_FormLabel22.setShowRequiredIndicator(true);

      return f_FormLabel22;
    }

    /**
     * Getter for f_InlineHelpBlock23 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.InlineHelpBlock get_f_InlineHelpBlock23() {
      return build_f_InlineHelpBlock23();
    }
    private org.gwtbootstrap3.client.ui.InlineHelpBlock build_f_InlineHelpBlock23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InlineHelpBlock f_InlineHelpBlock23 = new org.gwtbootstrap3.client.ui.InlineHelpBlock();
      // Setup section.
      f_InlineHelpBlock23.setIconType(org.gwtbootstrap3.client.ui.constants.IconType.EXCLAMATION_TRIANGLE);

      return f_InlineHelpBlock23;
    }

    /**
     * Getter for f_DateTimePicker24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker24() {
      return build_f_DateTimePicker24();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker24() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker24 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker24.setAllowBlank(false);
      f_DateTimePicker24.setValidateOnBlur(true);

      return f_DateTimePicker24;
    }

    /**
     * Getter for modal called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Modal get_modal() {
      return build_modal();
    }
    private org.gwtbootstrap3.client.ui.Modal build_modal() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Modal modal = new org.gwtbootstrap3.client.ui.Modal();
      // Setup section.
      modal.add(get_f_ModalBody25());
      modal.add(get_f_ModalFooter27());
      modal.setFade(true);
      modal.setDataKeyboard(true);
      modal.setClosable(true);
      modal.setId("myModal");
      modal.setTitle("DateTimePicker in Modal");
      modal.setDataBackdrop(org.gwtbootstrap3.client.ui.constants.ModalBackdrop.STATIC);

      return modal;
    }

    /**
     * Getter for f_ModalBody25 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ModalBody get_f_ModalBody25() {
      return build_f_ModalBody25();
    }
    private org.gwtbootstrap3.client.ui.ModalBody build_f_ModalBody25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ModalBody f_ModalBody25 = new org.gwtbootstrap3.client.ui.ModalBody();
      // Setup section.
      f_ModalBody25.add(get_f_DateTimePicker26());

      return f_ModalBody25;
    }

    /**
     * Getter for f_DateTimePicker26 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker26() {
      return build_f_DateTimePicker26();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker26() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker26 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.

      return f_DateTimePicker26;
    }

    /**
     * Getter for f_ModalFooter27 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ModalFooter get_f_ModalFooter27() {
      return build_f_ModalFooter27();
    }
    private org.gwtbootstrap3.client.ui.ModalFooter build_f_ModalFooter27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ModalFooter f_ModalFooter27 = new org.gwtbootstrap3.client.ui.ModalFooter();
      // Setup section.
      f_ModalFooter27.add(get_f_Button28());

      return f_ModalFooter27;
    }

    /**
     * Getter for f_Button28 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button28() {
      return build_f_Button28();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button28 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button28.setText("Close");
      f_Button28.setDataDismiss(org.gwtbootstrap3.client.ui.constants.ButtonDismiss.MODAL);
      f_Button28.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);

      return f_Button28;
    }

    /**
     * Getter for f_Button29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button29() {
      return build_f_Button29();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button29 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button29.addStyleName("" + get_style().spacing2() + "");
      f_Button29.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.MODAL);
      f_Button29.setText("DateTimePicker in Modal");
      f_Button29.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button29.setDataTarget("#myModal");

      return f_Button29;
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
      f_PrettyPre31.setHTML(template_html11().asString());
      f_PrettyPre31.addStyleName("lang-xml");

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
      f_Panel32.add(get_f_PanelFooter38());

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
      f_Heading34.setText("Setting Languages");

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
      f_PanelBody35.add(get_f_Paragraph36());
      f_PanelBody35.add(get_f_DateTimePicker37());

      return f_PanelBody35;
    }

    /**
     * Getter for f_Paragraph36 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph36() {
      return build_f_Paragraph36();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph36 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html12().asString());
      // Setup section.

      return f_Paragraph36;
    }

    /**
     * Getter for f_DateTimePicker37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker37() {
      return build_f_DateTimePicker37();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker37() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker37 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker37.setLanguage(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerLanguage.FR);
      f_DateTimePicker37.setAutoClose(true);

      return f_DateTimePicker37;
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
     * Getter for f_Panel40 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel40() {
      return build_f_Panel40();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel40 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel40.add(get_f_PanelHeader41());
      f_Panel40.add(get_f_PanelBody43());
      f_Panel40.add(get_f_PanelFooter47());

      return f_Panel40;
    }

    /**
     * Getter for f_PanelHeader41 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader41() {
      return build_f_PanelHeader41();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader41 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader41.add(get_f_Heading42());

      return f_PanelHeader41;
    }

    /**
     * Getter for f_Heading42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading42() {
      return build_f_Heading42();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading42 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading42.setText("Position");

      return f_Heading42;
    }

    /**
     * Getter for f_PanelBody43 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody43() {
      return build_f_PanelBody43();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody43 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody43.add(get_f_Paragraph44());
      f_PanelBody43.add(get_f_Paragraph45());
      f_PanelBody43.add(get_f_DateTimePicker46());

      return f_PanelBody43;
    }

    /**
     * Getter for f_Paragraph44 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph44() {
      return build_f_Paragraph44();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph44 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html14().asString());
      // Setup section.

      return f_Paragraph44;
    }

    /**
     * Getter for f_Paragraph45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph45() {
      return build_f_Paragraph45();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph45 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html15().asString());
      // Setup section.

      return f_Paragraph45;
    }

    /**
     * Getter for f_DateTimePicker46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker46() {
      return build_f_DateTimePicker46();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker46() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker46 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker46.setPosition(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerPosition.TOP_RIGHT);
      f_DateTimePicker46.setAutoClose(true);

      return f_DateTimePicker46;
    }

    /**
     * Getter for f_PanelFooter47 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter47() {
      return build_f_PanelFooter47();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter47 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter47.add(get_f_PrettyPre48());

      return f_PanelFooter47;
    }

    /**
     * Getter for f_PrettyPre48 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre48() {
      return build_f_PrettyPre48();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre48() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre48 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre48.setHTML(template_html16().asString());
      f_PrettyPre48.addStyleName("lang-xml");

      return f_PrettyPre48;
    }

    /**
     * Getter for f_Panel49 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel49() {
      return build_f_Panel49();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel49 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel49.add(get_f_PanelHeader50());
      f_Panel49.add(get_f_PanelBody52());
      f_Panel49.add(get_f_PanelFooter55());

      return f_Panel49;
    }

    /**
     * Getter for f_PanelHeader50 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader50() {
      return build_f_PanelHeader50();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader50 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader50.add(get_f_Heading51());

      return f_PanelHeader50;
    }

    /**
     * Getter for f_Heading51 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading51() {
      return build_f_Heading51();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading51 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading51.setText("Auto Close");

      return f_Heading51;
    }

    /**
     * Getter for f_PanelBody52 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody52() {
      return build_f_PanelBody52();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody52 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody52.add(get_f_Paragraph53());
      f_PanelBody52.add(get_f_DateTimePicker54());

      return f_PanelBody52;
    }

    /**
     * Getter for f_Paragraph53 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph53() {
      return build_f_Paragraph53();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph53 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html17().asString());
      // Setup section.

      return f_Paragraph53;
    }

    /**
     * Getter for f_DateTimePicker54 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker54() {
      return build_f_DateTimePicker54();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker54() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker54 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker54.setAutoClose(true);

      return f_DateTimePicker54;
    }

    /**
     * Getter for f_PanelFooter55 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter55() {
      return build_f_PanelFooter55();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter55 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter55.add(get_f_PrettyPre56());

      return f_PanelFooter55;
    }

    /**
     * Getter for f_PrettyPre56 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre56() {
      return build_f_PrettyPre56();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre56() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre56 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre56.setHTML(template_html18().asString());
      f_PrettyPre56.addStyleName("lang-xml");

      return f_PrettyPre56;
    }

    /**
     * Getter for f_Panel57 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel57() {
      return build_f_Panel57();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel57 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel57.add(get_f_PanelHeader58());
      f_Panel57.add(get_f_PanelBody60());
      f_Panel57.add(get_f_PanelFooter61());

      return f_Panel57;
    }

    /**
     * Getter for f_PanelHeader58 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader58() {
      return build_f_PanelHeader58();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader58 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader58.add(get_f_Heading59());

      return f_PanelHeader58;
    }

    /**
     * Getter for f_Heading59 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading59() {
      return build_f_Heading59();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading59 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading59.setText("12 Hour Format");

      return f_Heading59;
    }

    /**
     * Getter for f_PanelBody60 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody60() {
      return build_f_PanelBody60();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody60 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody60.add(get_twelveHour());

      return f_PanelBody60;
    }

    /**
     * Getter for twelveHour called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_twelveHour() {
      return build_twelveHour();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_twelveHour() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker twelveHour = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      twelveHour.setShowMeridian(true);
      twelveHour.setFormat("mm/dd/yyyy HH:ii P");

      return twelveHour;
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
      f_PrettyPre62.setHTML(template_html19().asString());
      f_PrettyPre62.addStyleName("lang-xml");

      return f_PrettyPre62;
    }

    /**
     * Getter for f_Panel63 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel63() {
      return build_f_Panel63();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel63 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel63.add(get_f_PanelHeader64());
      f_Panel63.add(get_f_PanelBody66());
      f_Panel63.add(get_f_PanelFooter68());

      return f_Panel63;
    }

    /**
     * Getter for f_PanelHeader64 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader64() {
      return build_f_PanelHeader64();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader64 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader64.add(get_f_Heading65());

      return f_PanelHeader64;
    }

    /**
     * Getter for f_Heading65 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading65() {
      return build_f_Heading65();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading65 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading65.setText("Dates Only");

      return f_Heading65;
    }

    /**
     * Getter for f_PanelBody66 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody66() {
      return build_f_PanelBody66();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody66 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody66.add(get_f_DateTimePicker67());

      return f_PanelBody66;
    }

    /**
     * Getter for f_DateTimePicker67 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker67() {
      return build_f_DateTimePicker67();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker67() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker67 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker67.setFormat("mm/dd/yyyy");
      f_DateTimePicker67.setMinView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.MONTH);

      return f_DateTimePicker67;
    }

    /**
     * Getter for f_PanelFooter68 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter68() {
      return build_f_PanelFooter68();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter68 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter68.add(get_f_PrettyPre69());

      return f_PanelFooter68;
    }

    /**
     * Getter for f_PrettyPre69 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre69() {
      return build_f_PrettyPre69();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre69() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre69 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre69.setHTML(template_html20().asString());
      f_PrettyPre69.addStyleName("lang-xml");

      return f_PrettyPre69;
    }

    /**
     * Getter for f_Panel70 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel70() {
      return build_f_Panel70();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel70 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel70.add(get_f_PanelHeader71());
      f_Panel70.add(get_f_PanelBody73());
      f_Panel70.add(get_f_PanelFooter77());

      return f_Panel70;
    }

    /**
     * Getter for f_PanelHeader71 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader71() {
      return build_f_PanelHeader71();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader71 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader71.add(get_f_Heading72());

      return f_PanelHeader71;
    }

    /**
     * Getter for f_Heading72 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading72() {
      return build_f_Heading72();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading72 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading72.setText("Time Only");

      return f_Heading72;
    }

    /**
     * Getter for f_PanelBody73 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody73() {
      return build_f_PanelBody73();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody73 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody73.add(get_f_DateTimePicker74());
      f_PanelBody73.add(get_f_Paragraph75());
      f_PanelBody73.add(get_f_DateTimePicker76());

      return f_PanelBody73;
    }

    /**
     * Getter for f_DateTimePicker74 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker74() {
      return build_f_DateTimePicker74();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker74() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker74 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker74.setStartView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.DAY);
      f_DateTimePicker74.setFormatViewType(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerFormatViewType.TIME);
      f_DateTimePicker74.setMaxView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.DAY);
      f_DateTimePicker74.setFormat("HH:ii P");
      f_DateTimePicker74.setMinView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.HOUR);

      return f_DateTimePicker74;
    }

    /**
     * Getter for f_Paragraph75 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph75() {
      return build_f_Paragraph75();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph75 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html21().asString());
      // Setup section.
      f_Paragraph75.addStyleName("" + get_style().spacing2() + "");

      return f_Paragraph75;
    }

    /**
     * Getter for f_DateTimePicker76 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker76() {
      return build_f_DateTimePicker76();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker76() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker76 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker76.setStartView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.DAY);
      f_DateTimePicker76.setFormatViewType(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerFormatViewType.TIME);
      f_DateTimePicker76.setMaxView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.DAY);
      f_DateTimePicker76.setFormat("HH:ii P");
      f_DateTimePicker76.setMinuteStep(30);
      f_DateTimePicker76.setMinView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.HOUR);

      return f_DateTimePicker76;
    }

    /**
     * Getter for f_PanelFooter77 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter77() {
      return build_f_PanelFooter77();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter77 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter77.add(get_f_PrettyPre78());

      return f_PanelFooter77;
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
      f_PrettyPre78.setHTML(template_html22().asString());
      f_PrettyPre78.addStyleName("lang-xml");

      return f_PrettyPre78;
    }

    /**
     * Getter for f_Panel79 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel79() {
      return build_f_Panel79();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel79 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel79.add(get_f_PanelHeader80());
      f_Panel79.add(get_f_PanelBody82());
      f_Panel79.add(get_f_PanelFooter84());

      return f_Panel79;
    }

    /**
     * Getter for f_PanelHeader80 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader80() {
      return build_f_PanelHeader80();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader80 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader80.add(get_f_Heading81());

      return f_PanelHeader80;
    }

    /**
     * Getter for f_Heading81 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading81() {
      return build_f_Heading81();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading81 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading81.setText("With Today Button / Today Highlights");

      return f_Heading81;
    }

    /**
     * Getter for f_PanelBody82 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody82() {
      return build_f_PanelBody82();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody82 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody82.add(get_f_DateTimePicker83());

      return f_PanelBody82;
    }

    /**
     * Getter for f_DateTimePicker83 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_f_DateTimePicker83() {
      return build_f_DateTimePicker83();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_f_DateTimePicker83() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker f_DateTimePicker83 = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.
      f_DateTimePicker83.setHighlightToday(true);
      f_DateTimePicker83.setShowTodayButton(true);

      return f_DateTimePicker83;
    }

    /**
     * Getter for f_PanelFooter84 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter84() {
      return build_f_PanelFooter84();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter84() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter84 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter84.add(get_f_PrettyPre85());

      return f_PanelFooter84;
    }

    /**
     * Getter for f_PrettyPre85 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre85() {
      return build_f_PrettyPre85();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre85() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre85 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre85.setHTML(template_html23().asString());
      f_PrettyPre85.addStyleName("lang-xml");

      return f_PrettyPre85;
    }

    /**
     * Getter for f_Panel86 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel86() {
      return build_f_Panel86();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel86() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel86 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel86.add(get_f_PanelHeader87());
      f_Panel86.add(get_f_PanelBody89());
      f_Panel86.add(get_f_PanelFooter93());

      return f_Panel86;
    }

    /**
     * Getter for f_PanelHeader87 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader87() {
      return build_f_PanelHeader87();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader87() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader87 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader87.add(get_f_Heading88());

      return f_PanelHeader87;
    }

    /**
     * Getter for f_Heading88 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading88() {
      return build_f_Heading88();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading88 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading88.setText("Methods");

      return f_Heading88;
    }

    /**
     * Getter for f_PanelBody89 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody89() {
      return build_f_PanelBody89();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody89 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody89.add(get_f_Row90());

      return f_PanelBody89;
    }

    /**
     * Getter for f_Row90 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row90() {
      return build_f_Row90();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row90 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row90.add(get_f_Column91());
      f_Row90.add(get_f_Column92());

      return f_Row90;
    }

    /**
     * Getter for f_Column91 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column91() {
      return build_f_Column91();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column91 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column91.add(get_methods());

      return f_Column91;
    }

    /**
     * Getter for methods called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_methods() {
      return build_methods();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_methods() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker methods = new org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker();
      // Setup section.

      this.owner.methods = methods;

      return methods;
    }

    /**
     * Getter for f_Column92 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column92() {
      return build_f_Column92();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column92() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column92 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column92.add(get_startDate());
      f_Column92.add(get_endDate());
      f_Column92.add(get_getValue());
      f_Column92.add(get_setValue());
      f_Column92.add(get_enable());
      f_Column92.add(get_disable());
      f_Column92.add(get_readonly());
      f_Column92.add(get_editable());
      f_Column92.add(get_disableSundays());
      f_Column92.add(get_enableSundays());
      f_Column92.add(get_hide());
      f_Column92.add(get_show());
      f_Column92.add(get_setFormat());
      f_Column92.addStyleName("" + get_style().buttons() + "");

      return f_Column92;
    }

    /**
     * Getter for startDate called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_startDate() {
      return build_startDate();
    }
    private org.gwtbootstrap3.client.ui.Button build_startDate() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button startDate = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      startDate.setText("Set Start Date");
      startDate.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      startDate.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      this.owner.startDate = startDate;

      return startDate;
    }

    /**
     * Getter for endDate called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_endDate() {
      return build_endDate();
    }
    private org.gwtbootstrap3.client.ui.Button build_endDate() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button endDate = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      endDate.setText("Set End Date");
      endDate.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      endDate.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.endDate = endDate;

      return endDate;
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
      getValue.setText("Get Value");
      getValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      getValue.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      this.owner.getValue = getValue;

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
      setValue.setText("Set Value");
      setValue.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      setValue.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

      this.owner.setValue = setValue;

      return setValue;
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
      enable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

      this.owner.enable = enable;

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
      disable.setText("Disable");
      disable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      disable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

      this.owner.disable = disable;

      return disable;
    }

    /**
     * Getter for readonly called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_readonly() {
      return build_readonly();
    }
    private org.gwtbootstrap3.client.ui.Button build_readonly() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button readonly = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      readonly.setText("Readonly");
      readonly.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      readonly.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);

      this.owner.readonly = readonly;

      return readonly;
    }

    /**
     * Getter for editable called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_editable() {
      return build_editable();
    }
    private org.gwtbootstrap3.client.ui.Button build_editable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button editable = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      editable.setText("Editable");
      editable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      editable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10);

      this.owner.editable = editable;

      return editable;
    }

    /**
     * Getter for disableSundays called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_disableSundays() {
      return build_disableSundays();
    }
    private org.gwtbootstrap3.client.ui.Button build_disableSundays() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button disableSundays = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      disableSundays.setText("Disable Sundays");
      disableSundays.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      disableSundays.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11);

      this.owner.disableSundays = disableSundays;

      return disableSundays;
    }

    /**
     * Getter for enableSundays called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_enableSundays() {
      return build_enableSundays();
    }
    private org.gwtbootstrap3.client.ui.Button build_enableSundays() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button enableSundays = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      enableSundays.setText("Enable Sundays");
      enableSundays.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      enableSundays.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12);

      this.owner.enableSundays = enableSundays;

      return enableSundays;
    }

    /**
     * Getter for hide called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_hide() {
      return build_hide();
    }
    private org.gwtbootstrap3.client.ui.Button build_hide() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button hide = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      hide.setText("Hide");
      hide.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      hide.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13);

      this.owner.hide = hide;

      return hide;
    }

    /**
     * Getter for show called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_show() {
      return build_show();
    }
    private org.gwtbootstrap3.client.ui.Button build_show() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button show = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      show.setText("Show");
      show.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      show.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14);

      this.owner.show = show;

      return show;
    }

    /**
     * Getter for setFormat called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_setFormat() {
      return build_setFormat();
    }
    private org.gwtbootstrap3.client.ui.Button build_setFormat() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button setFormat = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      setFormat.setText("Set Format");
      setFormat.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      setFormat.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15);

      this.owner.setFormat = setFormat;

      return setFormat;
    }

    /**
     * Getter for f_PanelFooter93 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter93() {
      return build_f_PanelFooter93();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter93() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter93 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter93.add(get_f_PrettyPre94());
      f_PanelFooter93.add(get_f_Paragraph95());

      return f_PanelFooter93;
    }

    /**
     * Getter for f_PrettyPre94 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre94() {
      return build_f_PrettyPre94();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre94() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre94 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre94.setHTML(template_html24().asString());
      f_PrettyPre94.addStyleName("lang-xml");

      return f_PrettyPre94;
    }

    /**
     * Getter for f_Paragraph95 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph95() {
      return build_f_Paragraph95();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph95() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph95 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html25().asString());
      // Setup section.
      f_Paragraph95.setEmphasis(org.gwtbootstrap3.client.ui.constants.Emphasis.DANGER);
      f_Paragraph95.setText("** In order to setFormat, you must call box.refresh() after to set on the JS object!");

      return f_Paragraph95;
    }

    /**
     * Getter for f_Panel96 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel96() {
      return build_f_Panel96();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel96() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel96 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel96.add(get_f_PanelHeader97());
      f_Panel96.add(get_f_PanelBody99());

      return f_Panel96;
    }

    /**
     * Getter for f_PanelHeader97 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader97() {
      return build_f_PanelHeader97();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader97() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader97 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader97.add(get_f_Heading98());

      return f_PanelHeader97;
    }

    /**
     * Getter for f_Heading98 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading98() {
      return build_f_Heading98();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading98() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading98 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading98.setText("Events");

      return f_Heading98;
    }

    /**
     * Getter for f_PanelBody99 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody99() {
      return build_f_PanelBody99();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody99 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody99.add(get_f_Row100());

      return f_PanelBody99;
    }

    /**
     * Getter for f_Row100 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row100() {
      return build_f_Row100();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row100() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row100 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row100.add(get_f_Column101());
      f_Row100.add(get_f_Column103());

      return f_Row100;
    }

    /**
     * Getter for f_Column101 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column101() {
      return build_f_Column101();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column101 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_4");
      // Setup section.
      f_Column101.add(get_eventDateTimePickerDiv());
      f_Column101.add(get_f_Div102());

      return f_Column101;
    }

    /**
     * Getter for eventDateTimePickerDiv called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_eventDateTimePickerDiv() {
      return build_eventDateTimePickerDiv();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_eventDateTimePickerDiv() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div eventDateTimePickerDiv = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      eventDateTimePickerDiv.add(get_eventDateTimePicker());
      eventDateTimePickerDiv.setMarginBottom(10);

      this.owner.eventDateTimePickerDiv = eventDateTimePickerDiv;

      return eventDateTimePickerDiv;
    }

    /**
     * Getter for eventDateTimePicker called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_eventDateTimePicker() {
      return build_eventDateTimePicker();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_eventDateTimePicker() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker eventDateTimePicker = owner.eventDateTimePicker;
      assert eventDateTimePicker != null : "UiField eventDateTimePicker with 'provided = true' was null";
      // Setup section.

      return eventDateTimePicker;
    }

    /**
     * Getter for f_Div102 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_f_Div102() {
      return build_f_Div102();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_f_Div102() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div f_Div102 = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      f_Div102.add(get_addRemove());

      return f_Div102;
    }

    /**
     * Getter for addRemove called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Button get_addRemove() {
      return build_addRemove();
    }
    private org.gwtbootstrap3.client.ui.Button build_addRemove() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button addRemove = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      addRemove.setText("Add/Remove");
      addRemove.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      addRemove.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.addRemove = addRemove;

      return addRemove;
    }

    /**
     * Getter for f_Column103 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column103() {
      return build_f_Column103();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column103() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column103 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_8");
      // Setup section.
      f_Column103.add(get_f_Strong104());
      f_Column103.add(get_clearLogButton());
      f_Column103.add(get_logRow());
      f_Column103.addStyleName("" + get_style().logRow() + "");

      return f_Column103;
    }

    /**
     * Getter for f_Strong104 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong104() {
      return build_f_Strong104();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong104() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong104 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong104.addStyleName("" + get_style().logTitle() + "");
      f_Strong104.setText("Event Log");

      return f_Strong104;
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
      clearLogButton.addStyleName("pull-right");
      clearLogButton.setText("Clear Log");
      clearLogButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.clearLogButton = clearLogButton;

      return clearLogButton;
    }

    /**
     * Getter for logRow called 1 times. Type: DEFAULT. Build precedence: 7.
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
  }
}
