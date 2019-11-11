// Template file: org/treblereel/mvp/view/components/Badge.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.177")
public class Badge_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Badge>, org.treblereel.mvp.view.components.Badge.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("<a href='#'>Deleted Items <span id='{0}'></span> </a>")
    org.gwtproject.safehtml.shared.SafeHtml html1(String arg0);
     
    @Template("&lt;a href=\"#\"&gt;Deleted Items\\n \\s\\s&lt;b:Badge text=\"...\"/&gt;\\n &lt;/a&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("unread")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("<a href='#'>Inbox <span id='{0}'></span> </a>")
    org.gwtproject.safehtml.shared.SafeHtml html4(String arg0);
     
    @Template("&lt;a href=\"#\"&gt;Inbox\\n \\s\\s&lt;b:Badge&gt;\\n \\s\\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n \\s\\s\\s&lt;b:Icon type=\"ENVELOPE\"/&gt;\\n \\s\\s\\s&lt;b.html:Italic&gt;unread&lt;/b.html:Italic&gt;\\n \\s\\s&lt;/b:Badge&gt;\\n &lt;/a&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
  }

  Template template = new Badge_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Badge owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Badge owner;


    public Widgets(final org.treblereel.mvp.view.components.Badge owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 7
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 7
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 7
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 7
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1(get_domId0());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html2() {
      return template.html2();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html3() {
      return template.html3();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html4() {
      return template.html4(get_domId1());
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html5() {
      return template.html5();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Badge_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Badge_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Badge_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Badge_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Badge_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.components.Badge_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.components.Badge_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel13());

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
      f_PageHeader3.setText("Badges");

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
      f_Panel4.add(get_f_PanelFooter11());

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
      f_Heading6.setText("Basic");

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
      f_PanelBody7.add(get_f_FlowPanel8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_FlowPanel8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel8() {
      return build_f_FlowPanel8();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel8() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel8 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel8.add(get_f_HTMLPanel9());
      f_FlowPanel8.addStyleName("" + get_style().labels() + "");

      return f_FlowPanel8;
    }

    /**
     * Getter for f_HTMLPanel9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtproject.user.client.ui.HTMLPanel get_f_HTMLPanel9() {
      return build_f_HTMLPanel9();
    }
    private org.gwtproject.user.client.ui.HTMLPanel build_f_HTMLPanel9() {
      // Creation section.
      final org.gwtproject.user.client.ui.HTMLPanel f_HTMLPanel9 = new org.gwtproject.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_HTMLPanel9.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel9.addAndReplaceElement(get_f_Badge10(), get_domId0Element().get());

      return f_HTMLPanel9;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 7.
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
     * Getter for f_Badge10 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Badge get_f_Badge10() {
      return build_f_Badge10();
    }
    private org.gwtbootstrap3.client.ui.Badge build_f_Badge10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Badge f_Badge10 = new org.gwtbootstrap3.client.ui.Badge();
      // Setup section.
      f_Badge10.setText("42");

      return f_Badge10;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 7.
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
     * Getter for f_PanelFooter11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter11() {
      return build_f_PanelFooter11();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter11 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter11.add(get_f_PrettyPre12());

      return f_PanelFooter11;
    }

    /**
     * Getter for f_PrettyPre12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre12() {
      return build_f_PrettyPre12();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre12() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre12 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre12.setHTML(template_html2().asString());
      f_PrettyPre12.addStyleName("lang-xml");

      return f_PrettyPre12;
    }

    /**
     * Getter for f_Panel13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel13() {
      return build_f_Panel13();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel13 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel13.add(get_f_PanelHeader14());
      f_Panel13.add(get_f_PanelBody16());
      f_Panel13.add(get_f_PanelFooter23());

      return f_Panel13;
    }

    /**
     * Getter for f_PanelHeader14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader14() {
      return build_f_PanelHeader14();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader14 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader14.add(get_f_Heading15());

      return f_PanelHeader14;
    }

    /**
     * Getter for f_Heading15 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading15() {
      return build_f_Heading15();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading15 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading15.setText("Advanced");

      return f_Heading15;
    }

    /**
     * Getter for f_PanelBody16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody16() {
      return build_f_PanelBody16();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody16 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody16.add(get_f_FlowPanel17());

      return f_PanelBody16;
    }

    /**
     * Getter for f_FlowPanel17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel17() {
      return build_f_FlowPanel17();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel17() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel17 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel17.add(get_f_HTMLPanel18());
      f_FlowPanel17.addStyleName("" + get_style().labels() + "");

      return f_FlowPanel17;
    }

    /**
     * Getter for f_HTMLPanel18 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtproject.user.client.ui.HTMLPanel get_f_HTMLPanel18() {
      return build_f_HTMLPanel18();
    }
    private org.gwtproject.user.client.ui.HTMLPanel build_f_HTMLPanel18() {
      // Creation section.
      final org.gwtproject.user.client.ui.HTMLPanel f_HTMLPanel18 = new org.gwtproject.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_HTMLPanel18.getElement());

        get_domId1Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel18.addAndReplaceElement(get_f_Badge19(), get_domId1Element().get());

      return f_HTMLPanel18;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 7.
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
     * Getter for f_Badge19 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Badge get_f_Badge19() {
      return build_f_Badge19();
    }
    private org.gwtbootstrap3.client.ui.Badge build_f_Badge19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Badge f_Badge19 = new org.gwtbootstrap3.client.ui.Badge();
      // Setup section.
      f_Badge19.add(get_f_Text20());
      f_Badge19.add(get_f_Icon21());
      f_Badge19.add(get_f_Italic22());

      return f_Badge19;
    }

    /**
     * Getter for f_Text20 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Text get_f_Text20() {
      return build_f_Text20();
    }
    private org.gwtbootstrap3.client.ui.html.Text build_f_Text20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Text f_Text20 = new org.gwtbootstrap3.client.ui.html.Text();
      // Setup section.
      f_Text20.setText("12");

      return f_Text20;
    }

    /**
     * Getter for f_Icon21 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Icon get_f_Icon21() {
      return build_f_Icon21();
    }
    private org.gwtbootstrap3.client.ui.Icon build_f_Icon21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Icon f_Icon21 = new org.gwtbootstrap3.client.ui.Icon(org.gwtbootstrap3.client.ui.constants.IconType.ENVELOPE);
      // Setup section.

      return f_Icon21;
    }

    /**
     * Getter for f_Italic22 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Italic get_f_Italic22() {
      return build_f_Italic22();
    }
    private org.gwtbootstrap3.client.ui.html.Italic build_f_Italic22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Italic f_Italic22 = new org.gwtbootstrap3.client.ui.html.Italic();
      // Setup section.
      f_Italic22.setHTML(template_html3().asString());

      return f_Italic22;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 7.
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
     * Getter for f_PanelFooter23 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter23() {
      return build_f_PanelFooter23();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter23 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter23.add(get_f_PrettyPre24());

      return f_PanelFooter23;
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
      f_PrettyPre24.setHTML(template_html5().asString());
      f_PrettyPre24.addStyleName("lang-xml");

      return f_PrettyPre24;
    }
  }
}
