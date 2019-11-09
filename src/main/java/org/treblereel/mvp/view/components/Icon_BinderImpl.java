// Template file: org/treblereel/mvp/view/components/Icon.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.563")
public class Icon_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Icon>, org.treblereel.mvp.view.components.Icon.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("For available icons please check out: <a href='http://fontawesome.io/cheatsheet/'>Font Awesome Cheat Sheet</a>")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Any widget that uses icons will have the properties to spin/pulse/flip/rotate/etc..")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("<span id='{0}'></span> Icon With Text")
    org.gwtproject.safehtml.shared.SafeHtml html3(String arg0);
     
    @Template("With Anchor")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:Icon type=\"...\"/&gt;\\n\\n &lt;b.html:Span&gt;\\n \\s\\s&lt;b:Icon type=\"...\"/&gt;\\n \\s\\s&lt;...&gt;\\n &lt;/b.html:Span&gt;\\n\\n &lt;b:Anchor icon=\"...\" iconSpin=\"true\" text=\"...\"/&gt;\\n\\n &lt;b:Anchor icon=\"...\" iconSpin=\"true\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("&lt;b:Icon type=\"...\" size=\"LARGE\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"TIMES2\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"TIMES3\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"TIMES4\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"TIMES5\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;b:Icon type=\"CIRCLE_O_NOTCH\" size=\"TIMES3\" spin=\"true\"/&gt;\\n &lt;b:Icon type=\"REFRESH\" size=\"TIMES3\" spin=\"true\"/&gt;\\n &lt;b:Icon type=\"COG\" size=\"TIMES3\" spin=\"true\"/&gt;\\n &lt;b:Icon type=\"SPINNER\" size=\"TIMES3\" spin=\"true\"/&gt;\\n &lt;b:Icon type=\"SPINNER\" size=\"TIMES3\" pulse=\"true\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("&lt;b:Icon type=\"...\" size=\"LARGE\" rotate=\"ROTATE_90\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"LARGE\" rotate=\"ROTATE_180\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"LARGE\" rotate=\"ROTATE_270\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"LARGE\" flip=\"HORIZONTAL\"/&gt;\\n &lt;b:Icon type=\"...\" size=\"LARGE\" flip=\"VERTICAL\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("&lt;b:IconStack&gt;\\n \\s\\s&lt;b:Icon type=\"SQUARE_O\" stackBase=\"true\"/&gt;\\n \\s\\s&lt;b:Icon type=\"TWITTER\" stackTop=\"true\"/&gt;\\n &lt;/b:IconStack&gt;\\n &lt;b:IconStack size=\"LARGE\"&gt;\\n \\s\\s&lt;b:Icon type=\"SQUARE\" stackBase=\"true\"/&gt;\\n \\s\\s&lt;b:Icon type=\"TERMINAL\" stackTop=\"true\" inverse=\"true\"/&gt;\\n &lt;/b:IconStack&gt;\\n &lt;b:IconStack size=\"TIMES3\"&gt;\\n \\s\\s&lt;b:Icon type=\"CAMERA\" stackTop=\"true\"/&gt;\\n \\s\\s&lt;b:Icon type=\"BAN\" stackBase=\"true\" emphasis=\"DANGER\"/&gt;\\n &lt;/b:IconStack&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("<span id='{0}'></span> Vertically aligned icons")
    org.gwtproject.safehtml.shared.SafeHtml html10(String arg0);
     
    @Template("<span id='{0}'></span> Vertically aligned icons")
    org.gwtproject.safehtml.shared.SafeHtml html11(String arg0);
     
    @Template("<span id='{0}'></span> Vertically aligned icons")
    org.gwtproject.safehtml.shared.SafeHtml html12(String arg0);
     
    @Template("&lt;b.html:Span&gt;\\n \\s\\s&lt;b:Icon type=\"...\" fixedWidth=\"true\"/&gt;\\n \\s\\sVertically aligned icons\\n &lt;/b.html:Span&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
  }

  Template template = new Icon_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Icon owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Icon owner;


    public Widgets(final org.treblereel.mvp.view.components.Icon owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
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
      return template.html10(get_domId1());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html11() {
      return template.html11(get_domId2());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html12() {
      return template.html12(get_domId3());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html13() {
      return template.html13();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Icon_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Icon_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Icon_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Icon_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 13 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Icon_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.components.Icon_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.components.Icon_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel4());
      f_Column2.add(get_f_Panel10());
      f_Column2.add(get_f_Panel24());
      f_Column2.add(get_f_Panel35());
      f_Column2.add(get_f_Panel46());
      f_Column2.add(get_f_Panel57());
      f_Column2.add(get_f_Panel72());

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
      f_PageHeader3.setText("Icons");
      f_PageHeader3.setSubText("Support for FontAwesome Icons (version 4.7.0)");

      return f_PageHeader3;
    }

    /**
     * Getter for f_Panel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel4() {
      return build_f_Panel4();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel4 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel4.add(get_f_PanelHeader5());
      f_Panel4.add(get_f_PanelBody7());

      return f_Panel4;
    }

    /**
     * Getter for f_PanelHeader5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader5() {
      return build_f_PanelHeader5();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader5 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader5.add(get_f_Heading6());

      return f_PanelHeader5;
    }

    /**
     * Getter for f_Heading6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading6() {
      return build_f_Heading6();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading6 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading6.setText("Available Icons");

      return f_Heading6;
    }

    /**
     * Getter for f_PanelBody7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody7() {
      return build_f_PanelBody7();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody7 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody7.add(get_f_Paragraph8());
      f_PanelBody7.add(get_f_Paragraph9());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Paragraph8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph8() {
      return build_f_Paragraph8();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph8 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph8;
    }

    /**
     * Getter for f_Paragraph9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph9() {
      return build_f_Paragraph9();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph9 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.

      return f_Paragraph9;
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
      f_Panel10.add(get_f_PanelFooter22());

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
      f_Heading12.setText("Basic Use");

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
      f_PanelBody13.add(get_f_Icon14());
      f_PanelBody13.add(get_f_ClearFix15());
      f_PanelBody13.add(get_f_Span16());
      f_PanelBody13.add(get_f_Br18());
      f_PanelBody13.add(get_f_Anchor19());
      f_PanelBody13.add(get_f_Br20());
      f_PanelBody13.add(get_f_Anchor21());

      return f_PanelBody13;
    }

    /**
     * Getter for f_Icon14 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon14() {
      return build_f_Icon14();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon14 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.

      return f_Icon14;
    }

    /**
     * Getter for f_ClearFix15 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix15() {
      return build_f_ClearFix15();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix15 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix15;
    }

    /**
     * Getter for f_Span16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span16() {
      return build_f_Span16();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span16 = new org.gwtbootstrap3.client.ui.html.Span(template_html3().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Span16.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Span16.addAndReplaceElement(get_f_Icon17(), get_domId0Element().get());

      return f_Span16;
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
     * Getter for f_Icon17 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon17() {
      return build_f_Icon17();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon17 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.

      return f_Icon17;
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
     * Getter for f_Br18 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br18() {
      return build_f_Br18();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br18 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br18;
    }

    /**
     * Getter for f_Anchor19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor19() {
      return build_f_Anchor19();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor19 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor19.setHTML(template_html4().asString());
      f_Anchor19.setIconSpin(true);
      f_Anchor19.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.HEART);

      return f_Anchor19;
    }

    /**
     * Getter for f_Br20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br20() {
      return build_f_Br20();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br20 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br20;
    }

    /**
     * Getter for f_Anchor21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor21() {
      return build_f_Anchor21();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor21 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor21.setIconSpin(true);
      f_Anchor21.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.HEART);

      return f_Anchor21;
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
      f_PrettyPre23.setHTML(template_html5().asString());
      f_PrettyPre23.addStyleName("lang-xml");

      return f_PrettyPre23;
    }

    /**
     * Getter for f_Panel24 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel24() {
      return build_f_Panel24();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel24 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel24.add(get_f_PanelHeader25());
      f_Panel24.add(get_f_PanelBody27());
      f_Panel24.add(get_f_PanelFooter33());

      return f_Panel24;
    }

    /**
     * Getter for f_PanelHeader25 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader25() {
      return build_f_PanelHeader25();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader25 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader25.add(get_f_Heading26());

      return f_PanelHeader25;
    }

    /**
     * Getter for f_Heading26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading26() {
      return build_f_Heading26();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading26 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading26.setText("Larger Icons");

      return f_Heading26;
    }

    /**
     * Getter for f_PanelBody27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody27() {
      return build_f_PanelBody27();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody27 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody27.add(get_f_Icon28());
      f_PanelBody27.add(get_f_Icon29());
      f_PanelBody27.add(get_f_Icon30());
      f_PanelBody27.add(get_f_Icon31());
      f_PanelBody27.add(get_f_Icon32());

      return f_PanelBody27;
    }

    /**
     * Getter for f_Icon28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon28() {
      return build_f_Icon28();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon28 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.
      f_Icon28.addStyleName("" + get_style().spacing() + "");
      f_Icon28.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      return f_Icon28;
    }

    /**
     * Getter for f_Icon29 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon29() {
      return build_f_Icon29();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon29 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.
      f_Icon29.addStyleName("" + get_style().spacing() + "");
      f_Icon29.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES2);

      return f_Icon29;
    }

    /**
     * Getter for f_Icon30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon30() {
      return build_f_Icon30();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon30 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.
      f_Icon30.addStyleName("" + get_style().spacing() + "");
      f_Icon30.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES3);

      return f_Icon30;
    }

    /**
     * Getter for f_Icon31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon31() {
      return build_f_Icon31();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon31 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.
      f_Icon31.addStyleName("" + get_style().spacing() + "");
      f_Icon31.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES4);

      return f_Icon31;
    }

    /**
     * Getter for f_Icon32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon32() {
      return build_f_Icon32();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon32 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.
      f_Icon32.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES5);

      return f_Icon32;
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
      f_PrettyPre34.setHTML(template_html6().asString());
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
      f_Panel35.add(get_f_PanelFooter44());

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
      f_Heading37.setText("Animation");

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
      f_PanelBody38.add(get_f_Icon39());
      f_PanelBody38.add(get_f_Icon40());
      f_PanelBody38.add(get_f_Icon41());
      f_PanelBody38.add(get_f_Icon42());
      f_PanelBody38.add(get_f_Icon43());

      return f_PanelBody38;
    }

    /**
     * Getter for f_Icon39 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon39() {
      return build_f_Icon39();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon39 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.CIRCLE_O_NOTCH);
      // Setup section.
      f_Icon39.addStyleName("" + get_style().spacing() + "");
      f_Icon39.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES3);
      f_Icon39.setSpin(true);

      return f_Icon39;
    }

    /**
     * Getter for f_Icon40 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon40() {
      return build_f_Icon40();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon40 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.REFRESH);
      // Setup section.
      f_Icon40.addStyleName("" + get_style().spacing() + "");
      f_Icon40.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES3);
      f_Icon40.setSpin(true);

      return f_Icon40;
    }

    /**
     * Getter for f_Icon41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon41() {
      return build_f_Icon41();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon41 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.COG);
      // Setup section.
      f_Icon41.addStyleName("" + get_style().spacing() + "");
      f_Icon41.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES3);
      f_Icon41.setSpin(true);

      return f_Icon41;
    }

    /**
     * Getter for f_Icon42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon42() {
      return build_f_Icon42();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon42 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.SPINNER);
      // Setup section.
      f_Icon42.addStyleName("" + get_style().spacing() + "");
      f_Icon42.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES3);
      f_Icon42.setSpin(true);

      return f_Icon42;
    }

    /**
     * Getter for f_Icon43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon43() {
      return build_f_Icon43();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon43 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.SPINNER);
      // Setup section.
      f_Icon43.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES3);
      f_Icon43.setPulse(true);

      return f_Icon43;
    }

    /**
     * Getter for f_PanelFooter44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter44() {
      return build_f_PanelFooter44();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter44 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter44.add(get_f_PrettyPre45());

      return f_PanelFooter44;
    }

    /**
     * Getter for f_PrettyPre45 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre45() {
      return build_f_PrettyPre45();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre45() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre45 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre45.setHTML(template_html7().asString());
      f_PrettyPre45.addStyleName("lang-xml");

      return f_PrettyPre45;
    }

    /**
     * Getter for f_Panel46 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel46() {
      return build_f_Panel46();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel46 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel46.add(get_f_PanelHeader47());
      f_Panel46.add(get_f_PanelBody49());
      f_Panel46.add(get_f_PanelFooter55());

      return f_Panel46;
    }

    /**
     * Getter for f_PanelHeader47 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader47() {
      return build_f_PanelHeader47();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader47 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader47.add(get_f_Heading48());

      return f_PanelHeader47;
    }

    /**
     * Getter for f_Heading48 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading48() {
      return build_f_Heading48();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading48 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading48.setText("Rotated & Flipped");

      return f_Heading48;
    }

    /**
     * Getter for f_PanelBody49 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody49() {
      return build_f_PanelBody49();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody49 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody49.add(get_f_Icon50());
      f_PanelBody49.add(get_f_Icon51());
      f_PanelBody49.add(get_f_Icon52());
      f_PanelBody49.add(get_f_Icon53());
      f_PanelBody49.add(get_f_Icon54());

      return f_PanelBody49;
    }

    /**
     * Getter for f_Icon50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon50() {
      return build_f_Icon50();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon50 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.FLAG_O);
      // Setup section.
      f_Icon50.addStyleName("" + get_style().spacing() + "");
      f_Icon50.setRotate(org.gwtbootstrap3.client.ui.constants.IconRotate.ROTATE_90);
      f_Icon50.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      return f_Icon50;
    }

    /**
     * Getter for f_Icon51 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon51() {
      return build_f_Icon51();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon51 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.FLAG_O);
      // Setup section.
      f_Icon51.addStyleName("" + get_style().spacing() + "");
      f_Icon51.setRotate(org.gwtbootstrap3.client.ui.constants.IconRotate.ROTATE_180);
      f_Icon51.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      return f_Icon51;
    }

    /**
     * Getter for f_Icon52 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon52() {
      return build_f_Icon52();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon52 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.FLAG_O);
      // Setup section.
      f_Icon52.addStyleName("" + get_style().spacing() + "");
      f_Icon52.setRotate(org.gwtbootstrap3.client.ui.constants.IconRotate.ROTATE_270);
      f_Icon52.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      return f_Icon52;
    }

    /**
     * Getter for f_Icon53 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon53() {
      return build_f_Icon53();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon53 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.FLAG_O);
      // Setup section.
      f_Icon53.addStyleName("" + get_style().spacing() + "");
      f_Icon53.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);
      f_Icon53.setFlip(org.gwtbootstrap3.client.ui.constants.IconFlip.HORIZONTAL);

      return f_Icon53;
    }

    /**
     * Getter for f_Icon54 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon54() {
      return build_f_Icon54();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon54 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.FLAG_O);
      // Setup section.
      f_Icon54.addStyleName("" + get_style().spacing() + "");
      f_Icon54.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);
      f_Icon54.setFlip(org.gwtbootstrap3.client.ui.constants.IconFlip.VERTICAL);

      return f_Icon54;
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
      f_PrettyPre56.setHTML(template_html8().asString());
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
      f_Panel57.add(get_f_PanelFooter70());

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
      f_Heading59.setText("Stacked Icons");

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
      f_PanelBody60.add(get_f_IconStack61());
      f_PanelBody60.add(get_f_IconStack64());
      f_PanelBody60.add(get_f_IconStack67());

      return f_PanelBody60;
    }

    /**
     * Getter for f_IconStack61 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.IconStack get_f_IconStack61() {
      return build_f_IconStack61();
    }
    private org.gwtbootstrap3.client.ui.IconStack build_f_IconStack61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.IconStack f_IconStack61 = new org.gwtbootstrap3.client.ui.IconStack();
      // Setup section.
      f_IconStack61.add(get_f_Icon62());
      f_IconStack61.add(get_f_Icon63());

      return f_IconStack61;
    }

    /**
     * Getter for f_Icon62 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon62() {
      return build_f_Icon62();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon62() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon62 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.SQUARE_O);
      // Setup section.
      f_Icon62.setStackBase(true);

      return f_Icon62;
    }

    /**
     * Getter for f_Icon63 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon63() {
      return build_f_Icon63();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon63 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.TWITTER);
      // Setup section.
      f_Icon63.setStackTop(true);

      return f_Icon63;
    }

    /**
     * Getter for f_IconStack64 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.IconStack get_f_IconStack64() {
      return build_f_IconStack64();
    }
    private org.gwtbootstrap3.client.ui.IconStack build_f_IconStack64() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.IconStack f_IconStack64 = new org.gwtbootstrap3.client.ui.IconStack();
      // Setup section.
      f_IconStack64.add(get_f_Icon65());
      f_IconStack64.add(get_f_Icon66());
      f_IconStack64.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.LARGE);

      return f_IconStack64;
    }

    /**
     * Getter for f_Icon65 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon65() {
      return build_f_Icon65();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon65 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.SQUARE);
      // Setup section.
      f_Icon65.setStackBase(true);

      return f_Icon65;
    }

    /**
     * Getter for f_Icon66 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon66() {
      return build_f_Icon66();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon66 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.TERMINAL);
      // Setup section.
      f_Icon66.setInverse(true);
      f_Icon66.setStackTop(true);

      return f_Icon66;
    }

    /**
     * Getter for f_IconStack67 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.IconStack get_f_IconStack67() {
      return build_f_IconStack67();
    }
    private org.gwtbootstrap3.client.ui.IconStack build_f_IconStack67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.IconStack f_IconStack67 = new org.gwtbootstrap3.client.ui.IconStack();
      // Setup section.
      f_IconStack67.add(get_f_Icon68());
      f_IconStack67.add(get_f_Icon69());
      f_IconStack67.setSize(org.gwtbootstrap3.client.ui.constants.IconSize.TIMES3);

      return f_IconStack67;
    }

    /**
     * Getter for f_Icon68 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon68() {
      return build_f_Icon68();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon68 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.CAMERA);
      // Setup section.
      f_Icon68.setStackTop(true);

      return f_Icon68;
    }

    /**
     * Getter for f_Icon69 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon69() {
      return build_f_Icon69();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon69 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.BAN);
      // Setup section.
      f_Icon69.setEmphasis(org.gwtbootstrap3.client.ui.constants.Emphasis.DANGER);
      f_Icon69.setStackBase(true);

      return f_Icon69;
    }

    /**
     * Getter for f_PanelFooter70 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter70() {
      return build_f_PanelFooter70();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter70 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter70.add(get_f_PrettyPre71());

      return f_PanelFooter70;
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
      f_PrettyPre71.setHTML(template_html9().asString());
      f_PrettyPre71.addStyleName("lang-xml");

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
      f_Panel72.add(get_f_PanelFooter84());

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
      f_Heading74.setText("Fixed Width Icons");

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
      f_PanelBody75.add(get_f_Span76());
      f_PanelBody75.add(get_f_ClearFix78());
      f_PanelBody75.add(get_f_Span79());
      f_PanelBody75.add(get_f_ClearFix81());
      f_PanelBody75.add(get_f_Span82());

      return f_PanelBody75;
    }

    /**
     * Getter for f_Span76 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span76() {
      return build_f_Span76();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span76 = new org.gwtbootstrap3.client.ui.html.Span(template_html10().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Span76.getElement());

        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Span76.addAndReplaceElement(get_f_Icon77(), get_domId1Element().get());

      return f_Span76;
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
     * Getter for f_Icon77 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon77() {
      return build_f_Icon77();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon77 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.GEAR);
      // Setup section.
      f_Icon77.setFixedWidth(true);

      return f_Icon77;
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
     * Getter for f_ClearFix78 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix78() {
      return build_f_ClearFix78();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix78 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix78;
    }

    /**
     * Getter for f_Span79 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span79() {
      return build_f_Span79();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span79 = new org.gwtbootstrap3.client.ui.html.Span(template_html11().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Span79.getElement());

        get_domId2Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Span79.addAndReplaceElement(get_f_Icon80(), get_domId2Element().get());

      return f_Span79;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 6.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = org.gwtproject.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for f_Icon80 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon80() {
      return build_f_Icon80();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon80 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.BOLT);
      // Setup section.
      f_Icon80.setFixedWidth(true);

      return f_Icon80;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtproject.uibinder.client.LazyDomElement domId2Element;
    private org.gwtproject.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private org.gwtproject.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new org.gwtproject.uibinder.client.LazyDomElement<org.gwtproject.dom.client.Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }

    /**
     * Getter for f_ClearFix81 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.ClearFix get_f_ClearFix81() {
      return build_f_ClearFix81();
    }
    private org.gwtbootstrap3.client.ui.html.ClearFix build_f_ClearFix81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.ClearFix f_ClearFix81 = new org.gwtbootstrap3.client.ui.html.ClearFix();
      // Setup section.

      return f_ClearFix81;
    }

    /**
     * Getter for f_Span82 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Span get_f_Span82() {
      return build_f_Span82();
    }
    private org.gwtbootstrap3.client.ui.html.Span build_f_Span82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Span f_Span82 = new org.gwtbootstrap3.client.ui.html.Span(template_html12().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Span82.getElement());

        get_domId3Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Span82.addAndReplaceElement(get_f_Icon83(), get_domId3Element().get());

      return f_Span82;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 6.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = org.gwtproject.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for f_Icon83 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon83() {
      return build_f_Icon83();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon83 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.BARCODE);
      // Setup section.
      f_Icon83.setFixedWidth(true);

      return f_Icon83;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtproject.uibinder.client.LazyDomElement domId3Element;
    private org.gwtproject.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private org.gwtproject.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new org.gwtproject.uibinder.client.LazyDomElement<org.gwtproject.dom.client.Element>(get_domId3());
      // Setup section.

      return domId3Element;
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
      f_PrettyPre85.setHTML(template_html13().asString());
      f_PrettyPre85.addStyleName("lang-xml");

      return f_PrettyPre85;
    }
  }
}
