// Template file: org/treblereel/mvp/view/extras/AnimateView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.207")
public class AnimateView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.AnimateView>, org.treblereel.mvp.view.extras.AnimateView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Animate.css")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 3.5.2")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Animate, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.animate.Animate\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Animations are CSS based. To animate any object, simply add proper style name to it. In java use enum <i>Animation</i> to get available animation`s class names. Animation starts when Widget is attached to the DOM or new (yet unused) class name is added and runs only once.")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("<strong>We strongly recommend to use java class <i>Animate</i> to assign animations to your widgets.</strong>")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("&lt;!-- UiBinder --&gt;\\n &lt;b:Button text=\"Re-play animation\" ui:field=\"button\" icon=\"PLAY\" type=\"PRIMARY\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("Java\\n @UiField(\"button\")\\n Button button;\\n\\n // Assign animation anywhere in code to start it (waits to start if not attached to the DOM)\\n Animate.animate(button, Animation.RUBBER_BAND);\\n\\n @UiHandler(\"button\")\\n public void onClick(ClickEvent event) {\\n \\s\\s// Restart animation on demand (will stop previous animation)\\n \\s\\sAnimate.animate(run, Animation.RUBBER_BAND);\\n }\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("You can use various static methods from <i>Animate</i> class to customize each animation run. Customizable properties are: <i>repeat, duration</i> and <i>delay</i>. You can also pass custom style name as String to run your own animations.")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("<strong>Each run of unique combination of animation and it's settings appends new stylesheet to the DOM.</strong> Don't overuse it with too many different configurations.")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("&lt;!-- UiBinder --&gt;\\n &lt;b:Button ui:field=\"button\" icon=\"PLAY\" text=\"Run animation\" type=\"PRIMARY\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("Java\\n @UiField(\"button\")\\n Button button;\\n\\n @UiHandler(\"button\")\\n public void onClick(ClickEvent event) {\\n \\s\\s// Run animation twice and for 4 second\\n \\s\\sAnimate.animate(button, Animation.RUBBER_BAND, 2, 4000);\\n }\\n")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("Each call of <i>Animate.animate(....)</i> returns String value of used class name. To stop animation in the middle just use:")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("Animate.stopAnimation(button, myAnimationClassName);\\n")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("<span id='{0}'></span>")
    org.gwtproject.safehtml.shared.SafeHtml html18(String arg0);
     
    @Template("You can also remove animation after it ends, to prevent re-play when widget is re-attached to the DOM (e.g. switching pages in some GWT app)")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
    @Template("Animate.removeAnimationOnEnd(button, myAnimationClassName)\\n")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("<span id='{0}'></span>")
    org.gwtproject.safehtml.shared.SafeHtml html21(String arg0);
     
    @Template("Using <i>Animation.NO_ANIMATION</i> doesn't remove any animations !! It's just helper value, which can be used when some method requires Animation parameter which you don't have / don't want to use.")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
  }

  Template template = new AnimateView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.AnimateView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.AnimateView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickAnim((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClick((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.AnimateView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
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
      return template.html18(get_domId0());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html19() {
      return template.html19();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html20() {
      return template.html20();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html21() {
      return template.html21(get_domId1());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html22() {
      return template.html22();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.AnimateView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.AnimateView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.AnimateView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.AnimateView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.AnimateView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.AnimateView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.AnimateView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel15());
      f_Column2.add(get_f_Panel25());
      f_Column2.add(get_f_Panel35());

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
      f_PageHeader3.setText("Animate");

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
      f_Anchor6.setHref("http://daneden.github.io/animate.css/");
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
     * Getter for f_Panel15 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel15() {
      return build_f_Panel15();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel15 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel15.add(get_f_PanelHeader16());
      f_Panel15.add(get_f_PanelBody18());
      f_Panel15.add(get_f_PanelFooter22());

      return f_Panel15;
    }

    /**
     * Getter for f_PanelHeader16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader16() {
      return build_f_PanelHeader16();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader16 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader16.add(get_f_Heading17());

      return f_PanelHeader16;
    }

    /**
     * Getter for f_Heading17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading17() {
      return build_f_Heading17();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading17 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading17.setText("Using animations");

      return f_Heading17;
    }

    /**
     * Getter for f_PanelBody18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody18() {
      return build_f_PanelBody18();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody18 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody18.add(get_f_Paragraph19());
      f_PanelBody18.add(get_f_Paragraph20());
      f_PanelBody18.add(get_f_ClearFix21());
      f_PanelBody18.add(get_animated());

      return f_PanelBody18;
    }

    /**
     * Getter for f_Paragraph19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph19() {
      return build_f_Paragraph19();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph19 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html8().asString());
      // Setup section.

      return f_Paragraph19;
    }

    /**
     * Getter for f_Paragraph20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph20() {
      return build_f_Paragraph20();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph20 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html9().asString());
      // Setup section.

      return f_Paragraph20;
    }

    /**
     * Getter for f_ClearFix21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix21() {
      return build_f_ClearFix21();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix21 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix21;
    }

    /**
     * Getter for animated called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_animated() {
      return build_animated();
    }
    private org.gwtbootstrap3.client.ui.Button build_animated() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button animated = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      animated.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      animated.setText("Re-play animation");
      animated.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      animated.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.animated = animated;

      return animated;
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
      f_PanelFooter22.add(get_f_PrettyPre23());
      f_PanelFooter22.add(get_f_PrettyPre24());

      return f_PanelFooter22;
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
      f_PrettyPre23.setHTML(template_html10().asString());
      f_PrettyPre23.addStyleName("lang-xml");

      return f_PrettyPre23;
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
      f_PrettyPre24.setHTML(template_html11().asString());
      f_PrettyPre24.addStyleName("lang-java");

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
      f_Heading27.setText("Customizing animations");

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
      f_PanelBody28.add(get_f_Paragraph29());
      f_PanelBody28.add(get_f_Paragraph30());
      f_PanelBody28.add(get_f_ClearFix31());
      f_PanelBody28.add(get_run());

      return f_PanelBody28;
    }

    /**
     * Getter for f_Paragraph29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph29() {
      return build_f_Paragraph29();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph29 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html12().asString());
      // Setup section.

      return f_Paragraph29;
    }

    /**
     * Getter for f_Paragraph30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph30() {
      return build_f_Paragraph30();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph30 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html13().asString());
      // Setup section.

      return f_Paragraph30;
    }

    /**
     * Getter for f_ClearFix31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix31() {
      return build_f_ClearFix31();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix31 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix31;
    }

    /**
     * Getter for run called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_run() {
      return build_run();
    }
    private org.gwtbootstrap3.client.ui.Button build_run() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button run = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      run.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      run.setText("Run animation");
      run.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      run.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.run = run;

      return run;
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
      f_PanelFooter32.add(get_f_PrettyPre33());
      f_PanelFooter32.add(get_f_PrettyPre34());

      return f_PanelFooter32;
    }

    /**
     * Getter for f_PrettyPre33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre33() {
      return build_f_PrettyPre33();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre33() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre33 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre33.setHTML(template_html14().asString());
      f_PrettyPre33.addStyleName("lang-xml");

      return f_PrettyPre33;
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
      f_PrettyPre34.setHTML(template_html15().asString());
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
      f_Heading37.setText("Stopping animations");

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
      f_PanelBody38.add(get_f_Paragraph39());
      f_PanelBody38.add(get_f_ClearFix40());
      f_PanelBody38.add(get_f_Paragraph41());
      f_PanelBody38.add(get_f_ClearFix43());
      f_PanelBody38.add(get_f_Paragraph44());
      f_PanelBody38.add(get_f_ClearFix45());
      f_PanelBody38.add(get_f_Paragraph46());
      f_PanelBody38.add(get_f_Paragraph48());
      f_PanelBody38.add(get_f_ClearFix49());

      return f_PanelBody38;
    }

    /**
     * Getter for f_Paragraph39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph39() {
      return build_f_Paragraph39();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph39 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html16().asString());
      // Setup section.

      return f_Paragraph39;
    }

    /**
     * Getter for f_ClearFix40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix40() {
      return build_f_ClearFix40();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix40 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix40;
    }

    /**
     * Getter for f_Paragraph41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph41() {
      return build_f_Paragraph41();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph41 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html18().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Paragraph41.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Paragraph41.addAndReplaceElement(get_f_PrettyPre42(), get_domId0Element().get());

      return f_Paragraph41;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 6.
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
     * Getter for f_PrettyPre42 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre42() {
      return build_f_PrettyPre42();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre42() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre42 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre42.setHTML(template_html17().asString());
      f_PrettyPre42.addStyleName("lang-java");

      return f_PrettyPre42;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 6.
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

    /**
     * Getter for f_ClearFix43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix43() {
      return build_f_ClearFix43();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix43 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix43;
    }

    /**
     * Getter for f_Paragraph44 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph44() {
      return build_f_Paragraph44();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph44 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html19().asString());
      // Setup section.

      return f_Paragraph44;
    }

    /**
     * Getter for f_ClearFix45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix45() {
      return build_f_ClearFix45();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix45 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix45;
    }

    /**
     * Getter for f_Paragraph46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph46() {
      return build_f_Paragraph46();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph46 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html21().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Paragraph46.getElement());

        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Paragraph46.addAndReplaceElement(get_f_PrettyPre47(), get_domId1Element().get());

      return f_Paragraph46;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 6.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = org.gwtproject.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for f_PrettyPre47 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre47() {
      return build_f_PrettyPre47();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre47() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre47 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre47.setHTML(template_html20().asString());
      f_PrettyPre47.addStyleName("lang-java");

      return f_PrettyPre47;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtproject.uibinder.client.LazyDomElement domId1Element;
    private org.gwtproject.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private org.gwtproject.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new org.gwtproject.uibinder.client.LazyDomElement<org.gwtproject.dom.client.Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for f_Paragraph48 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph48() {
      return build_f_Paragraph48();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph48 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html22().asString());
      // Setup section.

      return f_Paragraph48;
    }

    /**
     * Getter for f_ClearFix49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix49() {
      return build_f_ClearFix49();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix49 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix49;
    }
  }
}
