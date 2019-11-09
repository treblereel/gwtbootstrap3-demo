// Template file: org/treblereel/mvp/view/components/Thumbnail.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.667")
public class Thumbnail_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.Thumbnail>, org.treblereel.mvp.view.components.Thumbnail.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("&lt;b:ThumbnailLink&gt;\\n \\s\\s&lt;b:Image url=\"...\" type=\"...\"/&gt;\\n &lt;/b:ThumbnailLink&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;b:ThumbnailPanel&gt;\\n \\s\\s&lt;b:Image url=\"...\" type=\"...\"/&gt;\\n \\s\\s&lt;b:Caption&gt;\\n \\s\\s\\s\\s&lt;b:Heading size=\"...\" text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b.html:Paragraph text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:Button text=\"...\"/&gt;\\n \\s\\s&lt;/b:Caption&gt;\\n &lt;/b:ThumbnailPanel&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
  }

  Template template = new Thumbnail_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.Thumbnail owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.Thumbnail owner;


    public Widgets(final org.treblereel.mvp.view.components.Thumbnail owner) {
      this.owner = owner;
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.Thumbnail_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.Thumbnail_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.Thumbnail_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.Thumbnail_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
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
      f_Column2.add(get_f_Panel23());

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
      f_PageHeader3.setText("Thumbnails");

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
      f_Panel4.add(get_f_PanelFooter21());

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
      f_Heading6.setText("As Links");

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
      f_PanelBody7.add(get_f_Row8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Row8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row8() {
      return build_f_Row8();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row8 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row8.add(get_f_Column9());
      f_Row8.add(get_f_Column12());
      f_Row8.add(get_f_Column15());
      f_Row8.add(get_f_Column18());

      return f_Row8;
    }

    /**
     * Getter for f_Column9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column9() {
      return build_f_Column9();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column9 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_3");
      // Setup section.
      f_Column9.add(get_f_ThumbnailLink10());

      return f_Column9;
    }

    /**
     * Getter for f_ThumbnailLink10 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailLink get_f_ThumbnailLink10() {
      return build_f_ThumbnailLink10();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailLink build_f_ThumbnailLink10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailLink f_ThumbnailLink10 = new org.gwtbootstrap3.client.ui.ThumbnailLink();
      // Setup section.
      f_ThumbnailLink10.add(get_f_Image11());

      return f_ThumbnailLink10;
    }

    /**
     * Getter for f_Image11 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image11() {
      return build_f_Image11();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image11 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image11.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image11.setUrl("images/test.png");

      return f_Image11;
    }

    /**
     * Getter for f_Column12 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column12() {
      return build_f_Column12();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column12 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_3");
      // Setup section.
      f_Column12.add(get_f_ThumbnailLink13());

      return f_Column12;
    }

    /**
     * Getter for f_ThumbnailLink13 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailLink get_f_ThumbnailLink13() {
      return build_f_ThumbnailLink13();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailLink build_f_ThumbnailLink13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailLink f_ThumbnailLink13 = new org.gwtbootstrap3.client.ui.ThumbnailLink();
      // Setup section.
      f_ThumbnailLink13.add(get_f_Image14());

      return f_ThumbnailLink13;
    }

    /**
     * Getter for f_Image14 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image14() {
      return build_f_Image14();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image14 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image14.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image14.setUrl("images/test.png");

      return f_Image14;
    }

    /**
     * Getter for f_Column15 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column15() {
      return build_f_Column15();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column15 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_3");
      // Setup section.
      f_Column15.add(get_f_ThumbnailLink16());

      return f_Column15;
    }

    /**
     * Getter for f_ThumbnailLink16 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailLink get_f_ThumbnailLink16() {
      return build_f_ThumbnailLink16();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailLink build_f_ThumbnailLink16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailLink f_ThumbnailLink16 = new org.gwtbootstrap3.client.ui.ThumbnailLink();
      // Setup section.
      f_ThumbnailLink16.add(get_f_Image17());

      return f_ThumbnailLink16;
    }

    /**
     * Getter for f_Image17 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image17() {
      return build_f_Image17();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image17 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image17.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image17.setUrl("images/test.png");

      return f_Image17;
    }

    /**
     * Getter for f_Column18 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column18() {
      return build_f_Column18();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column18 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_3");
      // Setup section.
      f_Column18.add(get_f_ThumbnailLink19());

      return f_Column18;
    }

    /**
     * Getter for f_ThumbnailLink19 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailLink get_f_ThumbnailLink19() {
      return build_f_ThumbnailLink19();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailLink build_f_ThumbnailLink19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailLink f_ThumbnailLink19 = new org.gwtbootstrap3.client.ui.ThumbnailLink();
      // Setup section.
      f_ThumbnailLink19.add(get_f_Image20());

      return f_ThumbnailLink19;
    }

    /**
     * Getter for f_Image20 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image20() {
      return build_f_Image20();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image20 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image20.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image20.setUrl("images/test.png");

      return f_Image20;
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
      f_PrettyPre22.setHTML(template_html1().asString());
      f_PrettyPre22.addStyleName("lang-xml");

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
      f_Panel23.add(get_f_PanelFooter49());

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
      f_Heading25.setText("Custom Content");

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
      f_PanelBody26.add(get_f_Row27());

      return f_PanelBody26;
    }

    /**
     * Getter for f_Row27 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row27() {
      return build_f_Row27();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row27 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row27.add(get_f_Column28());
      f_Row27.add(get_f_Column35());
      f_Row27.add(get_f_Column42());

      return f_Row27;
    }

    /**
     * Getter for f_Column28 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column28() {
      return build_f_Column28();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column28 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_4");
      // Setup section.
      f_Column28.add(get_f_ThumbnailPanel29());

      return f_Column28;
    }

    /**
     * Getter for f_ThumbnailPanel29 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailPanel get_f_ThumbnailPanel29() {
      return build_f_ThumbnailPanel29();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailPanel build_f_ThumbnailPanel29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailPanel f_ThumbnailPanel29 = new org.gwtbootstrap3.client.ui.ThumbnailPanel();
      // Setup section.
      f_ThumbnailPanel29.add(get_f_Image30());
      f_ThumbnailPanel29.add(get_f_Caption31());

      return f_ThumbnailPanel29;
    }

    /**
     * Getter for f_Image30 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image30() {
      return build_f_Image30();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image30 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image30.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image30.setUrl("images/test.png");

      return f_Image30;
    }

    /**
     * Getter for f_Caption31 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Caption get_f_Caption31() {
      return build_f_Caption31();
    }
    private org.gwtbootstrap3.client.ui.Caption build_f_Caption31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Caption f_Caption31 = new org.gwtbootstrap3.client.ui.Caption();
      // Setup section.
      f_Caption31.add(get_f_Heading32());
      f_Caption31.add(get_f_Paragraph33());
      f_Caption31.add(get_f_Button34());

      return f_Caption31;
    }

    /**
     * Getter for f_Heading32 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading32() {
      return build_f_Heading32();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading32 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading32.setText("Heading");

      return f_Heading32;
    }

    /**
     * Getter for f_Paragraph33 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph33() {
      return build_f_Paragraph33();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph33 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.
      f_Paragraph33.setText("Content here...");

      return f_Paragraph33;
    }

    /**
     * Getter for f_Button34 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button34() {
      return build_f_Button34();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button34 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button34.setText("Button");

      return f_Button34;
    }

    /**
     * Getter for f_Column35 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column35() {
      return build_f_Column35();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column35 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_4");
      // Setup section.
      f_Column35.add(get_f_ThumbnailPanel36());

      return f_Column35;
    }

    /**
     * Getter for f_ThumbnailPanel36 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailPanel get_f_ThumbnailPanel36() {
      return build_f_ThumbnailPanel36();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailPanel build_f_ThumbnailPanel36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailPanel f_ThumbnailPanel36 = new org.gwtbootstrap3.client.ui.ThumbnailPanel();
      // Setup section.
      f_ThumbnailPanel36.add(get_f_Image37());
      f_ThumbnailPanel36.add(get_f_Caption38());

      return f_ThumbnailPanel36;
    }

    /**
     * Getter for f_Image37 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image37() {
      return build_f_Image37();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image37 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image37.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image37.setUrl("images/test.png");

      return f_Image37;
    }

    /**
     * Getter for f_Caption38 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Caption get_f_Caption38() {
      return build_f_Caption38();
    }
    private org.gwtbootstrap3.client.ui.Caption build_f_Caption38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Caption f_Caption38 = new org.gwtbootstrap3.client.ui.Caption();
      // Setup section.
      f_Caption38.add(get_f_Heading39());
      f_Caption38.add(get_f_Paragraph40());
      f_Caption38.add(get_f_Button41());

      return f_Caption38;
    }

    /**
     * Getter for f_Heading39 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading39() {
      return build_f_Heading39();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading39 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading39.setText("Heading");

      return f_Heading39;
    }

    /**
     * Getter for f_Paragraph40 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph40() {
      return build_f_Paragraph40();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph40 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.
      f_Paragraph40.setText("Content here...");

      return f_Paragraph40;
    }

    /**
     * Getter for f_Button41 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button41() {
      return build_f_Button41();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button41 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button41.setText("Button");

      return f_Button41;
    }

    /**
     * Getter for f_Column42 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column42() {
      return build_f_Column42();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column42 = new org.gwtbootstrap3.client.ui.Column("SM_6 MD_4");
      // Setup section.
      f_Column42.add(get_f_ThumbnailPanel43());

      return f_Column42;
    }

    /**
     * Getter for f_ThumbnailPanel43 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ThumbnailPanel get_f_ThumbnailPanel43() {
      return build_f_ThumbnailPanel43();
    }
    private org.gwtbootstrap3.client.ui.ThumbnailPanel build_f_ThumbnailPanel43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ThumbnailPanel f_ThumbnailPanel43 = new org.gwtbootstrap3.client.ui.ThumbnailPanel();
      // Setup section.
      f_ThumbnailPanel43.add(get_f_Image44());
      f_ThumbnailPanel43.add(get_f_Caption45());

      return f_ThumbnailPanel43;
    }

    /**
     * Getter for f_Image44 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Image get_f_Image44() {
      return build_f_Image44();
    }
    private org.gwtbootstrap3.client.ui.Image build_f_Image44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Image f_Image44 = new org.gwtbootstrap3.client.ui.Image();
      // Setup section.
      f_Image44.setType(org.gwtbootstrap3.client.ui.constants.ImageType.THUMBNAIL);
      f_Image44.setUrl("images/test.png");

      return f_Image44;
    }

    /**
     * Getter for f_Caption45 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Caption get_f_Caption45() {
      return build_f_Caption45();
    }
    private org.gwtbootstrap3.client.ui.Caption build_f_Caption45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Caption f_Caption45 = new org.gwtbootstrap3.client.ui.Caption();
      // Setup section.
      f_Caption45.add(get_f_Heading46());
      f_Caption45.add(get_f_Paragraph47());
      f_Caption45.add(get_f_Button48());

      return f_Caption45;
    }

    /**
     * Getter for f_Heading46 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading46() {
      return build_f_Heading46();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading46 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading46.setText("Heading");

      return f_Heading46;
    }

    /**
     * Getter for f_Paragraph47 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph47() {
      return build_f_Paragraph47();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph47 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.
      f_Paragraph47.setText("Content here...");

      return f_Paragraph47;
    }

    /**
     * Getter for f_Button48 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button48() {
      return build_f_Button48();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button48 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button48.setText("Button");

      return f_Button48;
    }

    /**
     * Getter for f_PanelFooter49 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter49() {
      return build_f_PanelFooter49();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter49 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter49.add(get_f_PrettyPre50());

      return f_PanelFooter49;
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
      f_PrettyPre50.setHTML(template_html5().asString());
      f_PrettyPre50.addStyleName("lang-xml");

      return f_PrettyPre50;
    }
  }
}
