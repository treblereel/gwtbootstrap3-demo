// Template file: org/treblereel/mvp/view/extras/SummernoteView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.619")
public class SummernoteView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.SummernoteView>, org.treblereel.mvp.view.extras.SummernoteView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Summernote")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 0.8.2")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Summernote, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.summernote.Summernote\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it summer):")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("xmlns:summer=\"urn:import:org.gwtbootstrap3.extras.summernote.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("&lt;summer:Summernote/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("<p>This is an Air-mode editable area.</p> <ul> <li>Select a text to reveal the toolbar.</li> <li>Edit rich document on-the-fly, so elastic!</li> </ul> <p>End of air-mode area</p>")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("&lt;summer:Summernote airMode=\"true\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("&lt;summer:Summernote ui:field=\"customNote\" defaultHeight=\"100\" minHeight=\"50\" maxHeight=\"150\"\\n \\s\\shasFocus=\"true\" placeholder=\"This is a placeholder.\" disableDragAndDrop=\"true\"\\n \\s\\sshortcuts=\"false\" showToolbar=\"false\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("&lt;summer:Summernote ui:field=\"customToolbar\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("customToolbar.setFontNames(SummernoteFontName.HELVETICA_NEUE, SummernoteFontName.VERDANA, SummernoteFontName.ARIAL);\\n customToolbar.setToolbar(new Toolbar()\\n \\s\\s.addGroup(ToolbarButton.FONT_NAME, ToolbarButton.FONT_SIZE)\\n \\s\\s.addGroup(ToolbarButton.UNDO, ToolbarButton.REDO)\\n \\s\\s.addGroup(ToolbarButton.CODE_VIEW)\\n \\s\\s.addGroup(ToolbarButton.TABLE));\\n")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("&lt;summer:Summernote ui:field=\"apiTest\" code=\"This is the initial code &amp;lt;b&amp;gt;before&amp;lt;/b&amp;gt; the editor is attached to DOM.\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("// Set Code\\n apiTest.setCode(\"&lt;b&gt;This is custom code. &lt;/b&gt;&lt;u&gt;OH YA&lt;/u&gt;\");\\n\\n // Get Code\\n Window.alert(apiTest.getCode());\\n\\n // Is Empty\\n Window.alert(apiTest.isEmpty());\\n\\n // Enable\\n apiTest.setEnabled(true);\\n\\n // Disable\\n apiTest.setEnabled(false);\\n\\n // Reset\\n apiTest.reset();\\n\\n // Clear\\n apiTest.clear();")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("Select Language:")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("&lt;summer:Summernote ui:field=\"languageNote\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
    @Template("// Default language is: EN_US\\n languageNote.setLanguage(SummernoteLanguage.FR_FR);\\n languageNote.reconfigure();")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("&lt;summer:Summernote ui:field=\"hintWords\" showToolbar=\"false\"\\n \\s\\placeholder=\"Type with apple, orange, watermelon, and lemon\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html21();
     
    @Template("hintWords.setHint(\"\\\\b(\\\\w{1,})$\", new DefaultHintHandler() {\\n \\s\\sList&lt;String&gt; words = new ArrayList&lt;&gt;(Arrays.asList(\"apple\", \"orange\", \"watermelon\", \"lemon\"));\\n \\s\\s@Override\\n \\s\\spublic String[] onSearch(String keyword) {\\n \\s\\s\\s\\sList&lt;String&gt; result = new ArrayList&lt;&gt;(0);\\n \\s\\s\\s\\sfor (String word : words) {\\n \\s\\s\\s\\s\\s\\sif (word.indexOf(keyword) == 0)\\n \\s\\s\\s\\s\\s\\s\\s\\sresult.add(word);\\n \\s\\s\\s\\s}\\n \\s\\s\\s\\sreturn result.toArray(new String[0]);\\n });\\n")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
    @Template("&lt;summer:Summernote ui:field=\"hintEmoji\" showToolbar=\"false\"\\n \\s\\placeholder=\"Type starting with : then any alphabet\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html23();
     
    @Template("https://api.github.com/emojis")
    org.gwtproject.safehtml.shared.SafeHtml html24();
     
    @Template("final JSONObject emojiUrls = JSONParser.parseStrict(emojiUrlsText).isObject();\\n hintEmoji.setHint(\":([\\\\-+\\\\w]+)$\", new DefaultHintHandler() {\\n \\s\\s@Override\\n \\s\\spublic String[] onSearch(String keyword) {\\n \\s\\s\\s\\sList&lt;String&gt; result = new ArrayList&lt;&gt;(0);\\n \\s\\s\\s\\sfor (String key : emojiUrls.keySet()) {\\n \\s\\s\\s\\s\\s\\sif (key.indexOf(keyword) == 0)\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\sresult.add(key);\\n \\s\\s\\s\\s}\\n \\s\\s\\s\\sreturn result.toArray(new String[0]);\\n \\s\\s}\\n\\n \\s\\s@Override\\n \\s\\spublic String getTemplate(String item) {\\n \\s\\s\\s\\sString url = emojiUrls.get(item).isString().stringValue();\\n \\s\\s\\s\\sreturn \"&lt;img src=\\\"\" + url + \"\\\" style=\\\"width:20px\\\"/&gt; :\" + item + \":\";\\n \\s\\s}\\n\\n \\s\\s@Override\\n \\s\\spublic Node getContent(String item) {\\n \\s\\s\\s\\sString url = emojiUrls.get(item).isString().stringValue();\\n \\s\\s\\s\\sImageElement img = Document.get().createImageElement();\\n \\s\\s\\s\\simg.setSrc(url);\\n \\s\\s\\s\\simg.getStyle().setWidth(20, Unit.PX);\\n \\s\\s\\s\\sreturn img;\\n \\s\\s}\\n });\\n")
    org.gwtproject.safehtml.shared.SafeHtml html25();
     
  }

  Template template = new SummernoteView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.SummernoteView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.SummernoteView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.setCode((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.getCode((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.clear((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.isEmpty((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.enable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.disable((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.reset((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.handleClearLog((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new org.gwtproject.event.dom.client.ChangeHandler() {
      public void onChange(org.gwtproject.event.dom.client.ChangeEvent event) {
        owner.onChangeLanguage((org.gwtproject.event.dom.client.ChangeEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteInitHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteInitHandler() {
      public void onSummernoteInit(org.gwtbootstrap3.extras.summernote.client.event.SummernoteInitEvent event) {
        owner.onSummernoteInit((org.gwtbootstrap3.extras.summernote.client.event.SummernoteInitEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteEnterHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteEnterHandler() {
      public void onSummernoteEnter(org.gwtbootstrap3.extras.summernote.client.event.SummernoteEnterEvent event) {
        owner.onSummernoteEnter((org.gwtbootstrap3.extras.summernote.client.event.SummernoteEnterEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteFocusHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteFocusHandler() {
      public void onSummernoteFocus(org.gwtbootstrap3.extras.summernote.client.event.SummernoteFocusEvent event) {
        owner.onSummernoteFocus((org.gwtbootstrap3.extras.summernote.client.event.SummernoteFocusEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteBlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteBlurHandler() {
      public void onSummernoteBlur(org.gwtbootstrap3.extras.summernote.client.event.SummernoteBlurEvent event) {
        owner.onSummernoteBlur((org.gwtbootstrap3.extras.summernote.client.event.SummernoteBlurEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyUpHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyUpHandler() {
      public void onSummernoteKeyUp(org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyUpEvent event) {
        owner.onSummernoteKeyUp((org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyUpEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyDownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyDownHandler() {
      public void onSummnernoteKeyDown(org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyDownEvent event) {
        owner.onSummernoteKeyDown((org.gwtbootstrap3.extras.summernote.client.event.SummernoteKeyDownEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernotePasteHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16 = new org.gwtbootstrap3.extras.summernote.client.event.SummernotePasteHandler() {
      public void onSummernotePaste(org.gwtbootstrap3.extras.summernote.client.event.SummernotePasteEvent event) {
        owner.onSummernotePaste((org.gwtbootstrap3.extras.summernote.client.event.SummernotePasteEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteImageUploadHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames17 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteImageUploadHandler() {
      public void onSummernoteImageUpload(org.gwtbootstrap3.extras.summernote.client.event.SummernoteImageUploadEvent event) {
        owner.onSummernoteImageUpload((org.gwtbootstrap3.extras.summernote.client.event.SummernoteImageUploadEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.summernote.client.event.SummernoteChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames18 = new org.gwtbootstrap3.extras.summernote.client.event.SummernoteChangeHandler() {
      public void onSummernoteChange(org.gwtbootstrap3.extras.summernote.client.event.SummernoteChangeEvent event) {
        owner.onSummernoteChange((org.gwtbootstrap3.extras.summernote.client.event.SummernoteChangeEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.SummernoteView owner) {
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
    private org.treblereel.mvp.view.extras.SummernoteView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.SummernoteView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.SummernoteView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.SummernoteView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 13 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.SummernoteView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.SummernoteView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.SummernoteView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel25());
      f_Column2.add(get_f_Panel35());
      f_Column2.add(get_f_Panel42());
      f_Column2.add(get_f_Panel51());
      f_Column2.add(get_f_Panel60());
      f_Column2.add(get_f_Panel72());
      f_Column2.add(get_f_Panel81());
      f_Column2.add(get_f_Panel93());

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
      f_PageHeader3.setText("Summernote WYSIWYG Editor");

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
      f_Anchor6.addStyleName("" + get_style().spacing2() + "");
      f_Anchor6.setHref("http://summernote.org/");
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
      f_Panel17.add(get_f_PanelFooter22());

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
      f_PanelBody20.add(get_f_Summernote21());

      return f_PanelBody20;
    }

    /**
     * Getter for f_Summernote21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_f_Summernote21() {
      return build_f_Summernote21();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_f_Summernote21() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote f_Summernote21 = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.

      return f_Summernote21;
    }

    /**
     * Getter for f_PanelFooter22 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter22() {
      return build_f_PanelFooter22();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter22 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter22.add(get_f_Heading23());
      f_PanelFooter22.add(get_f_PrettyPre24());

      return f_PanelFooter22;
    }

    /**
     * Getter for f_Heading23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading23() {
      return build_f_Heading23();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading23 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading23.setText("UiBinder");

      return f_Heading23;
    }

    /**
     * Getter for f_PrettyPre24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre24() {
      return build_f_PrettyPre24();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre24() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre24 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre24.setHTML(template_html10().asString());
      f_PrettyPre24.addStyleName("lang-xml");

      return f_PrettyPre24;
    }

    /**
     * Getter for f_Panel25 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel25() {
      return build_f_Panel25();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel25 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel25.add(get_f_PanelHeader26());
      f_Panel25.add(get_f_PanelBody28());
      f_Panel25.add(get_f_PanelFooter32());

      return f_Panel25;
    }

    /**
     * Getter for f_PanelHeader26 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader26() {
      return build_f_PanelHeader26();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader26 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader26.add(get_f_Heading27());

      return f_PanelHeader26;
    }

    /**
     * Getter for f_Heading27 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading27() {
      return build_f_Heading27();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading27 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading27.setText("Air Mode");

      return f_Heading27;
    }

    /**
     * Getter for f_PanelBody28 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody28() {
      return build_f_PanelBody28();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody28 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody28.add(get_f_Alert29());
      f_PanelBody28.add(get_airMode());

      return f_PanelBody28;
    }

    /**
     * Getter for f_Alert29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_f_Alert29() {
      return build_f_Alert29();
    }
    private org.gwtbootstrap3.client.ui.Alert build_f_Alert29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert f_Alert29 = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      f_Alert29.add(get_f_Text30());
      f_Alert29.setType(org.gwtbootstrap3.client.ui.constants.AlertType.INFO);

      return f_Alert29;
    }

    /**
     * Getter for f_Text30 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text30() {
      return build_f_Text30();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text30 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text30.setText("Air-mode gives clearer interface with hidden toolbar. To reveal toolbar, select a text where you want to shape up.");

      return f_Text30;
    }

    /**
     * Getter for airMode called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_airMode() {
      return build_airMode();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_airMode() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote airMode = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.
      airMode.add(get_f_HTML31());
      airMode.setAirMode(true);

      return airMode;
    }

    /**
     * Getter for f_HTML31 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtproject.user.client.ui.HTML get_f_HTML31() {
      return build_f_HTML31();
    }
    private org.gwtproject.user.client.ui.HTML build_f_HTML31() {
      // Creation section.
      final org.gwtproject.user.client.ui.HTML f_HTML31 = new org.gwtproject.user.client.ui.HTML();
      // Setup section.
      f_HTML31.setHTML(template_html11().asString());

      return f_HTML31;
    }

    /**
     * Getter for f_PanelFooter32 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter32() {
      return build_f_PanelFooter32();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter32 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter32.add(get_f_Heading33());
      f_PanelFooter32.add(get_f_PrettyPre34());

      return f_PanelFooter32;
    }

    /**
     * Getter for f_Heading33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading33() {
      return build_f_Heading33();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading33 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading33.setText("UiBinder");

      return f_Heading33;
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
      f_PrettyPre34.addStyleName("lang-xml");

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
      f_Heading37.setText("Editor Customization");

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
      f_PanelBody38.add(get_customNote());

      return f_PanelBody38;
    }

    /**
     * Getter for customNote called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_customNote() {
      return build_customNote();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_customNote() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote customNote = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.
      customNote.setShowToolbar(false);
      customNote.setMinHeight(50);
      customNote.setMaxHeight(150);
      customNote.setDefaultHeight(100);
      customNote.setDisableDragAndDrop(true);
      customNote.setShortcuts(false);
      customNote.setPlaceholder("This is a placeholder.");
      customNote.setHasFocus(true);

      return customNote;
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
      f_PanelFooter39.add(get_f_Heading40());
      f_PanelFooter39.add(get_f_PrettyPre41());

      return f_PanelFooter39;
    }

    /**
     * Getter for f_Heading40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading40() {
      return build_f_Heading40();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading40 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading40.setText("UiBinder");

      return f_Heading40;
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
      f_PrettyPre41.setHTML(template_html13().asString());
      f_PrettyPre41.addStyleName("lang-xml");

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
      f_Panel42.add(get_f_PanelFooter46());

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
      f_Heading44.setText("Toolbar Customization");

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
      f_PanelBody45.add(get_customToolbar());

      return f_PanelBody45;
    }

    /**
     * Getter for customToolbar called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_customToolbar() {
      return build_customToolbar();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_customToolbar() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote customToolbar = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.

      this.owner.customToolbar = customToolbar;

      return customToolbar;
    }

    /**
     * Getter for f_PanelFooter46 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter46() {
      return build_f_PanelFooter46();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter46 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter46.add(get_f_Heading47());
      f_PanelFooter46.add(get_f_PrettyPre48());
      f_PanelFooter46.add(get_f_Heading49());
      f_PanelFooter46.add(get_f_PrettyPre50());

      return f_PanelFooter46;
    }

    /**
     * Getter for f_Heading47 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading47() {
      return build_f_Heading47();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading47 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading47.setText("UiBinder");

      return f_Heading47;
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
      f_PrettyPre48.setHTML(template_html14().asString());
      f_PrettyPre48.addStyleName("lang-xml");

      return f_PrettyPre48;
    }

    /**
     * Getter for f_Heading49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading49() {
      return build_f_Heading49();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading49 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading49.setText("Java code");

      return f_Heading49;
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
      f_PrettyPre50.setHTML(template_html15().asString());
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
      f_Panel51.add(get_f_PanelFooter55());

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
      f_Heading53.setText("API");

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
      f_PanelBody54.add(get_apiTest());
      f_PanelBody54.add(get_setCode());
      f_PanelBody54.add(get_getCode());
      f_PanelBody54.add(get_clear());
      f_PanelBody54.add(get_isEmpty());
      f_PanelBody54.add(get_enable());
      f_PanelBody54.add(get_disable());
      f_PanelBody54.add(get_reset());

      return f_PanelBody54;
    }

    /**
     * Getter for apiTest called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_apiTest() {
      return build_apiTest();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_apiTest() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote apiTest = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.
      apiTest.setCode("This is the initial code <b>before</b> the editor is attached to DOM.");

      this.owner.apiTest = apiTest;

      return apiTest;
    }

    /**
     * Getter for setCode called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_setCode() {
      return build_setCode();
    }
    private org.gwtbootstrap3.client.ui.Button build_setCode() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button setCode = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      setCode.setText("Set Code");
      setCode.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      setCode.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      return setCode;
    }

    /**
     * Getter for getCode called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_getCode() {
      return build_getCode();
    }
    private org.gwtbootstrap3.client.ui.Button build_getCode() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button getCode = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      getCode.addStyleName("" + get_style().spacing2() + "");
      getCode.setText("Get Code");
      getCode.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      getCode.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      return getCode;
    }

    /**
     * Getter for clear called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_clear() {
      return build_clear();
    }
    private org.gwtbootstrap3.client.ui.Button build_clear() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button clear = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      clear.addStyleName("" + get_style().spacing2() + "");
      clear.setText("Clear");
      clear.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      clear.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      return clear;
    }

    /**
     * Getter for isEmpty called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_isEmpty() {
      return build_isEmpty();
    }
    private org.gwtbootstrap3.client.ui.Button build_isEmpty() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button isEmpty = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      isEmpty.addStyleName("" + get_style().spacing2() + "");
      isEmpty.setText("Is Empty");
      isEmpty.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      isEmpty.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      return isEmpty;
    }

    /**
     * Getter for enable called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_enable() {
      return build_enable();
    }
    private org.gwtbootstrap3.client.ui.Button build_enable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button enable = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      enable.addStyleName("" + get_style().spacing2() + "");
      enable.setText("Enable");
      enable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      enable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      return enable;
    }

    /**
     * Getter for disable called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_disable() {
      return build_disable();
    }
    private org.gwtbootstrap3.client.ui.Button build_disable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button disable = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      disable.addStyleName("" + get_style().spacing2() + "");
      disable.setText("Disable");
      disable.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      disable.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

      return disable;
    }

    /**
     * Getter for reset called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_reset() {
      return build_reset();
    }
    private org.gwtbootstrap3.client.ui.Button build_reset() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button reset = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      reset.addStyleName("" + get_style().spacing2() + "");
      reset.setText("Reset");
      reset.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      reset.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

      return reset;
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
      f_PanelFooter55.add(get_f_Heading56());
      f_PanelFooter55.add(get_f_PrettyPre57());
      f_PanelFooter55.add(get_f_Heading58());
      f_PanelFooter55.add(get_f_PrettyPre59());

      return f_PanelFooter55;
    }

    /**
     * Getter for f_Heading56 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading56() {
      return build_f_Heading56();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading56 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading56.setText("UiBinder");

      return f_Heading56;
    }

    /**
     * Getter for f_PrettyPre57 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre57() {
      return build_f_PrettyPre57();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre57() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre57 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre57.setHTML(template_html16().asString());
      f_PrettyPre57.addStyleName("lang-xml");

      return f_PrettyPre57;
    }

    /**
     * Getter for f_Heading58 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading58() {
      return build_f_Heading58();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading58 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading58.setText("Java code");

      return f_Heading58;
    }

    /**
     * Getter for f_PrettyPre59 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre59() {
      return build_f_PrettyPre59();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre59() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre59 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre59.setHTML(template_html17().asString());
      f_PrettyPre59.addStyleName("lang-java");

      return f_PrettyPre59;
    }

    /**
     * Getter for f_Panel60 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel60() {
      return build_f_Panel60();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel60 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel60.add(get_f_PanelHeader61());
      f_Panel60.add(get_f_PanelBody63());
      f_Panel60.add(get_f_PanelFooter67());

      return f_Panel60;
    }

    /**
     * Getter for f_PanelHeader61 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader61() {
      return build_f_PanelHeader61();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader61 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader61.add(get_f_Heading62());

      return f_PanelHeader61;
    }

    /**
     * Getter for f_Heading62 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading62() {
      return build_f_Heading62();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading62 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading62.setText("Language Support");

      return f_Heading62;
    }

    /**
     * Getter for f_PanelBody63 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody63() {
      return build_f_PanelBody63();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody63 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody63.add(get_languageNote());
      f_PanelBody63.add(get_f_Form64());

      return f_PanelBody63;
    }

    /**
     * Getter for languageNote called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_languageNote() {
      return build_languageNote();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_languageNote() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote languageNote = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.

      this.owner.languageNote = languageNote;

      return languageNote;
    }

    /**
     * Getter for f_Form64 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form64() {
      return build_f_Form64();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form64 = new org.gwtbootstrap3.client.ui.Form();
      // Setup section.
      f_Form64.add(get_f_FormGroup65());
      f_Form64.setType(org.gwtbootstrap3.client.ui.constants.FormType.INLINE);

      return f_Form64;
    }

    /**
     * Getter for f_FormGroup65 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup65() {
      return build_f_FormGroup65();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup65 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup65.add(get_f_FormLabel66());
      f_FormGroup65.add(get_languageBox());

      return f_FormGroup65;
    }

    /**
     * Getter for f_FormLabel66 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel66() {
      return build_f_FormLabel66();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel66 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel66.setHTML(template_html18().asString());
      f_FormLabel66.setFor("languageBox");

      return f_FormLabel66;
    }

    /**
     * Getter for languageBox called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_languageBox() {
      return build_languageBox();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_languageBox() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox languageBox = new org.gwtbootstrap3.client.ui.ListBox();
      // Setup section.
      languageBox.addStyleName("" + get_style().spacing2() + "");
      languageBox.setId("languageBox");
      languageBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);

      this.owner.languageBox = languageBox;

      return languageBox;
    }

    /**
     * Getter for f_PanelFooter67 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter67() {
      return build_f_PanelFooter67();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter67 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter67.add(get_f_Heading68());
      f_PanelFooter67.add(get_f_PrettyPre69());
      f_PanelFooter67.add(get_f_Heading70());
      f_PanelFooter67.add(get_f_PrettyPre71());

      return f_PanelFooter67;
    }

    /**
     * Getter for f_Heading68 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading68() {
      return build_f_Heading68();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading68 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading68.setText("UiBinder");

      return f_Heading68;
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
      f_PrettyPre69.setHTML(template_html19().asString());
      f_PrettyPre69.addStyleName("lang-xml");

      return f_PrettyPre69;
    }

    /**
     * Getter for f_Heading70 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading70() {
      return build_f_Heading70();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading70 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading70.setText("Java code");

      return f_Heading70;
    }

    /**
     * Getter for f_PrettyPre71 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre71() {
      return build_f_PrettyPre71();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre71() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre71 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre71.setHTML(template_html20().asString());
      f_PrettyPre71.addStyleName("lang-java");

      return f_PrettyPre71;
    }

    /**
     * Getter for f_Panel72 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel72() {
      return build_f_Panel72();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel72 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel72.add(get_f_PanelHeader73());
      f_Panel72.add(get_f_PanelBody75());
      f_Panel72.add(get_f_PanelFooter76());

      return f_Panel72;
    }

    /**
     * Getter for f_PanelHeader73 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader73() {
      return build_f_PanelHeader73();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader73 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader73.add(get_f_Heading74());

      return f_PanelHeader73;
    }

    /**
     * Getter for f_Heading74 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading74() {
      return build_f_Heading74();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading74() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading74 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading74.setText("Hint for words");

      return f_Heading74;
    }

    /**
     * Getter for f_PanelBody75 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody75() {
      return build_f_PanelBody75();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody75 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody75.add(get_hintWords());

      return f_PanelBody75;
    }

    /**
     * Getter for hintWords called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_hintWords() {
      return build_hintWords();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_hintWords() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote hintWords = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.
      hintWords.setShowToolbar(false);
      hintWords.setPlaceholder("Type with apple, orange, watermelon, and lemon");

      this.owner.hintWords = hintWords;

      return hintWords;
    }

    /**
     * Getter for f_PanelFooter76 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter76() {
      return build_f_PanelFooter76();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter76 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter76.add(get_f_Heading77());
      f_PanelFooter76.add(get_f_PrettyPre78());
      f_PanelFooter76.add(get_f_Heading79());
      f_PanelFooter76.add(get_f_PrettyPre80());

      return f_PanelFooter76;
    }

    /**
     * Getter for f_Heading77 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading77() {
      return build_f_Heading77();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading77 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading77.setText("UiBinder");

      return f_Heading77;
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
      f_PrettyPre78.setHTML(template_html21().asString());
      f_PrettyPre78.addStyleName("lang-xml");

      return f_PrettyPre78;
    }

    /**
     * Getter for f_Heading79 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading79() {
      return build_f_Heading79();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading79 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading79.setText("Java code");

      return f_Heading79;
    }

    /**
     * Getter for f_PrettyPre80 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre80() {
      return build_f_PrettyPre80();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre80() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre80 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre80.setHTML(template_html22().asString());
      f_PrettyPre80.addStyleName("lang-java");

      return f_PrettyPre80;
    }

    /**
     * Getter for f_Panel81 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel81() {
      return build_f_Panel81();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel81 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel81.add(get_f_PanelHeader82());
      f_Panel81.add(get_f_PanelBody84());
      f_Panel81.add(get_f_PanelFooter85());

      return f_Panel81;
    }

    /**
     * Getter for f_PanelHeader82 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader82() {
      return build_f_PanelHeader82();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader82 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader82.add(get_f_Heading83());

      return f_PanelHeader82;
    }

    /**
     * Getter for f_Heading83 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading83() {
      return build_f_Heading83();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading83 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading83.setText("Hint for emoji");

      return f_Heading83;
    }

    /**
     * Getter for f_PanelBody84 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody84() {
      return build_f_PanelBody84();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody84() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody84 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody84.add(get_hintEmoji());

      return f_PanelBody84;
    }

    /**
     * Getter for hintEmoji called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_hintEmoji() {
      return build_hintEmoji();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_hintEmoji() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote hintEmoji = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.
      hintEmoji.setShowToolbar(false);
      hintEmoji.setPlaceholder("Type starting with : then any alphabet");

      this.owner.hintEmoji = hintEmoji;

      return hintEmoji;
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
      f_PanelFooter85.add(get_f_Heading86());
      f_PanelFooter85.add(get_f_PrettyPre87());
      f_PanelFooter85.add(get_f_Heading88());
      f_PanelFooter85.add(get_f_Alert89());
      f_PanelFooter85.add(get_f_PrettyPre92());

      return f_PanelFooter85;
    }

    /**
     * Getter for f_Heading86 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading86() {
      return build_f_Heading86();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading86() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading86 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading86.setText("UiBinder");

      return f_Heading86;
    }

    /**
     * Getter for f_PrettyPre87 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre87() {
      return build_f_PrettyPre87();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre87() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre87 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre87.setHTML(template_html23().asString());
      f_PrettyPre87.addStyleName("lang-xml");

      return f_PrettyPre87;
    }

    /**
     * Getter for f_Heading88 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading88() {
      return build_f_Heading88();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading88 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading88.setText("Java code");

      return f_Heading88;
    }

    /**
     * Getter for f_Alert89 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Alert get_f_Alert89() {
      return build_f_Alert89();
    }
    private org.gwtbootstrap3.client.ui.Alert build_f_Alert89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Alert f_Alert89 = new org.gwtbootstrap3.client.ui.Alert();
      // Setup section.
      f_Alert89.add(get_f_Text90());
      f_Alert89.add(get_f_Anchor91());
      f_Alert89.setType(org.gwtbootstrap3.client.ui.constants.AlertType.INFO);

      return f_Alert89;
    }

    /**
     * Getter for f_Text90 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text90() {
      return build_f_Text90();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text90 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text90.setText("emojiUrlsText is JSON response of:");

      return f_Text90;
    }

    /**
     * Getter for f_Anchor91 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor91() {
      return build_f_Anchor91();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor91() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor91 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor91.setHTML(template_html24().asString());
      f_Anchor91.addStyleName("" + get_style().spacing2() + "");
      f_Anchor91.setHref("https://api.github.com/emojis");
      f_Anchor91.setTarget("_blank");

      return f_Anchor91;
    }

    /**
     * Getter for f_PrettyPre92 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre92() {
      return build_f_PrettyPre92();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre92() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre92 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre92.setHTML(template_html25().asString());
      f_PrettyPre92.addStyleName("lang-java");

      return f_PrettyPre92;
    }

    /**
     * Getter for f_Panel93 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel93() {
      return build_f_Panel93();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel93() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel93 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel93.add(get_f_PanelHeader94());
      f_Panel93.add(get_f_PanelBody96());

      return f_Panel93;
    }

    /**
     * Getter for f_PanelHeader94 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader94() {
      return build_f_PanelHeader94();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader94() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader94 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader94.add(get_f_Heading95());

      return f_PanelHeader94;
    }

    /**
     * Getter for f_Heading95 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading95() {
      return build_f_Heading95();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading95() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading95 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading95.setText("Events");

      return f_Heading95;
    }

    /**
     * Getter for f_PanelBody96 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody96() {
      return build_f_PanelBody96();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody96() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody96 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody96.add(get_f_Row97());

      return f_PanelBody96;
    }

    /**
     * Getter for f_Row97 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row97() {
      return build_f_Row97();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row97() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row97 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row97.add(get_f_Column98());
      f_Row97.add(get_f_Column99());

      return f_Row97;
    }

    /**
     * Getter for f_Column98 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column98() {
      return build_f_Column98();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column98() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column98 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_8");
      // Setup section.
      f_Column98.add(get_events());

      return f_Column98;
    }

    /**
     * Getter for events called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote get_events() {
      return build_events();
    }
    private org.gwtbootstrap3.extras.summernote.client.ui.Summernote build_events() {
      // Creation section.
      final org.gwtbootstrap3.extras.summernote.client.ui.Summernote events = new org.gwtbootstrap3.extras.summernote.client.ui.Summernote();
      // Setup section.
      events.setDefaultHeight(100);
      events.addSummernoteInitHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10);
      events.addSummernoteEnterHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11);
      events.addSummernoteFocusHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12);
      events.addSummernoteBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13);
      events.addSummernoteKeyUpHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14);
      events.addSummernoteKeyDownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15);
      events.addSummernotePasteHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16);
      events.addSummernoteImageUploadHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames17);
      events.addSummernoteChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames18);

      this.owner.events = events;

      return events;
    }

    /**
     * Getter for f_Column99 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column99() {
      return build_f_Column99();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column99 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_4");
      // Setup section.
      f_Column99.add(get_f_Strong100());
      f_Column99.add(get_clearLogButton());
      f_Column99.add(get_logRow());
      f_Column99.addStyleName("" + get_style().logRow() + "");

      return f_Column99;
    }

    /**
     * Getter for f_Strong100 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong100() {
      return build_f_Strong100();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong100() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong100 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong100.addStyleName("" + get_style().logTitle() + "");
      f_Strong100.setText("Event Log");

      return f_Strong100;
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
      clearLogButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

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
