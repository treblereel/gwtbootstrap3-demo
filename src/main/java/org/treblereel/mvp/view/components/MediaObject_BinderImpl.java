// Template file: org/treblereel/mvp/view/components/MediaObject.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.35")
public class MediaObject_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.MediaObject>, org.treblereel.mvp.view.components.MediaObject.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Content Here!")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Content Here!")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Content Here!")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("Content Here!")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("Content Here!")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Content Here!")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;b:MediaList&gt;\\n \\s\\s&lt;b:ListItem&gt;\\n \\s\\s\\s\\s&lt;b:ImageAnchor asMediaObject=\"true\" pull=\"LEFT\" url=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;b:MediaBody&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Heading size=\"...\" text=\"...\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b.html:Paragraph text=\"...\"/&gt;\\n \\s\\s\\s\\s&lt;/b:MediaBody&gt;\\n \\s\\s&lt;/b:ListItem&gt;\\n &lt;/b:MediaList&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
  }

  Template template = new MediaObject_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.MediaObject owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.MediaObject owner;


    public Widgets(final org.treblereel.mvp.view.components.MediaObject owner) {
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
    org.gwtproject.safehtml.shared.SafeHtml template_html6() {
      return template.html6();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html7() {
      return template.html7();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.components.MediaObject_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.MediaObject_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.MediaObject_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.MediaObject_BinderImpl_GenBundleImpl();
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
      f_PageHeader3.setText("Media Objects");

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
      f_Panel4.add(get_f_PanelFooter39());

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
      f_PanelBody7.add(get_f_MediaList8());

      return f_PanelBody7;
    }

    /**
     * Getter for f_MediaList8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.MediaList get_f_MediaList8() {
      return build_f_MediaList8();
    }
    private org.gwtbootstrap3.client.ui.MediaList build_f_MediaList8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.MediaList f_MediaList8 = new org.gwtbootstrap3.client.ui.MediaList();
      // Setup section.
      f_MediaList8.add(get_f_ListItem9());
      f_MediaList8.add(get_f_ListItem14());
      f_MediaList8.add(get_f_ListItem19());
      f_MediaList8.add(get_f_ListItem24());
      f_MediaList8.add(get_f_ListItem29());
      f_MediaList8.add(get_f_ListItem34());

      return f_MediaList8;
    }

    /**
     * Getter for f_ListItem9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListItem get_f_ListItem9() {
      return build_f_ListItem9();
    }
    private org.gwtbootstrap3.client.ui.ListItem build_f_ListItem9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListItem f_ListItem9 = new org.gwtbootstrap3.client.ui.ListItem();
      // Setup section.
      f_ListItem9.add(get_f_ImageAnchor10());
      f_ListItem9.add(get_f_MediaBody11());

      return f_ListItem9;
    }

    /**
     * Getter for f_ImageAnchor10 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ImageAnchor get_f_ImageAnchor10() {
      return build_f_ImageAnchor10();
    }
    private org.gwtbootstrap3.client.ui.ImageAnchor build_f_ImageAnchor10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ImageAnchor f_ImageAnchor10 = new org.gwtbootstrap3.client.ui.ImageAnchor();
      // Setup section.
      f_ImageAnchor10.setPull(org.gwtbootstrap3.client.ui.constants.Pull.LEFT);
      f_ImageAnchor10.setUrl("images/media_object.png");
      f_ImageAnchor10.setAsMediaObject(true);

      return f_ImageAnchor10;
    }

    /**
     * Getter for f_MediaBody11 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.MediaBody get_f_MediaBody11() {
      return build_f_MediaBody11();
    }
    private org.gwtbootstrap3.client.ui.MediaBody build_f_MediaBody11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.MediaBody f_MediaBody11 = new org.gwtbootstrap3.client.ui.MediaBody();
      // Setup section.
      f_MediaBody11.add(get_f_Heading12());
      f_MediaBody11.add(get_f_Paragraph13());

      return f_MediaBody11;
    }

    /**
     * Getter for f_Heading12 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading12() {
      return build_f_Heading12();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading12 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading12.setText("Media Heading");

      return f_Heading12;
    }

    /**
     * Getter for f_Paragraph13 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph13() {
      return build_f_Paragraph13();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph13 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html1().asString());
      // Setup section.

      return f_Paragraph13;
    }

    /**
     * Getter for f_ListItem14 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListItem get_f_ListItem14() {
      return build_f_ListItem14();
    }
    private org.gwtbootstrap3.client.ui.ListItem build_f_ListItem14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListItem f_ListItem14 = new org.gwtbootstrap3.client.ui.ListItem();
      // Setup section.
      f_ListItem14.add(get_f_ImageAnchor15());
      f_ListItem14.add(get_f_MediaBody16());

      return f_ListItem14;
    }

    /**
     * Getter for f_ImageAnchor15 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ImageAnchor get_f_ImageAnchor15() {
      return build_f_ImageAnchor15();
    }
    private org.gwtbootstrap3.client.ui.ImageAnchor build_f_ImageAnchor15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ImageAnchor f_ImageAnchor15 = new org.gwtbootstrap3.client.ui.ImageAnchor();
      // Setup section.
      f_ImageAnchor15.setPull(org.gwtbootstrap3.client.ui.constants.Pull.LEFT);
      f_ImageAnchor15.setUrl("images/media_object.png");
      f_ImageAnchor15.setAsMediaObject(true);

      return f_ImageAnchor15;
    }

    /**
     * Getter for f_MediaBody16 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.MediaBody get_f_MediaBody16() {
      return build_f_MediaBody16();
    }
    private org.gwtbootstrap3.client.ui.MediaBody build_f_MediaBody16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.MediaBody f_MediaBody16 = new org.gwtbootstrap3.client.ui.MediaBody();
      // Setup section.
      f_MediaBody16.add(get_f_Heading17());
      f_MediaBody16.add(get_f_Paragraph18());

      return f_MediaBody16;
    }

    /**
     * Getter for f_Heading17 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading17() {
      return build_f_Heading17();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading17 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading17.setText("Media Heading");

      return f_Heading17;
    }

    /**
     * Getter for f_Paragraph18 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph18() {
      return build_f_Paragraph18();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph18 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html2().asString());
      // Setup section.

      return f_Paragraph18;
    }

    /**
     * Getter for f_ListItem19 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListItem get_f_ListItem19() {
      return build_f_ListItem19();
    }
    private org.gwtbootstrap3.client.ui.ListItem build_f_ListItem19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListItem f_ListItem19 = new org.gwtbootstrap3.client.ui.ListItem();
      // Setup section.
      f_ListItem19.add(get_f_ImageAnchor20());
      f_ListItem19.add(get_f_MediaBody21());

      return f_ListItem19;
    }

    /**
     * Getter for f_ImageAnchor20 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ImageAnchor get_f_ImageAnchor20() {
      return build_f_ImageAnchor20();
    }
    private org.gwtbootstrap3.client.ui.ImageAnchor build_f_ImageAnchor20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ImageAnchor f_ImageAnchor20 = new org.gwtbootstrap3.client.ui.ImageAnchor();
      // Setup section.
      f_ImageAnchor20.setPull(org.gwtbootstrap3.client.ui.constants.Pull.LEFT);
      f_ImageAnchor20.setUrl("images/media_object.png");
      f_ImageAnchor20.setAsMediaObject(true);

      return f_ImageAnchor20;
    }

    /**
     * Getter for f_MediaBody21 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.MediaBody get_f_MediaBody21() {
      return build_f_MediaBody21();
    }
    private org.gwtbootstrap3.client.ui.MediaBody build_f_MediaBody21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.MediaBody f_MediaBody21 = new org.gwtbootstrap3.client.ui.MediaBody();
      // Setup section.
      f_MediaBody21.add(get_f_Heading22());
      f_MediaBody21.add(get_f_Paragraph23());

      return f_MediaBody21;
    }

    /**
     * Getter for f_Heading22 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading22() {
      return build_f_Heading22();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading22 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading22.setText("Media Heading");

      return f_Heading22;
    }

    /**
     * Getter for f_Paragraph23 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph23() {
      return build_f_Paragraph23();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph23 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html3().asString());
      // Setup section.

      return f_Paragraph23;
    }

    /**
     * Getter for f_ListItem24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListItem get_f_ListItem24() {
      return build_f_ListItem24();
    }
    private org.gwtbootstrap3.client.ui.ListItem build_f_ListItem24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListItem f_ListItem24 = new org.gwtbootstrap3.client.ui.ListItem();
      // Setup section.
      f_ListItem24.add(get_f_ImageAnchor25());
      f_ListItem24.add(get_f_MediaBody26());

      return f_ListItem24;
    }

    /**
     * Getter for f_ImageAnchor25 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ImageAnchor get_f_ImageAnchor25() {
      return build_f_ImageAnchor25();
    }
    private org.gwtbootstrap3.client.ui.ImageAnchor build_f_ImageAnchor25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ImageAnchor f_ImageAnchor25 = new org.gwtbootstrap3.client.ui.ImageAnchor();
      // Setup section.
      f_ImageAnchor25.setPull(org.gwtbootstrap3.client.ui.constants.Pull.LEFT);
      f_ImageAnchor25.setUrl("images/media_object.png");
      f_ImageAnchor25.setAsMediaObject(true);

      return f_ImageAnchor25;
    }

    /**
     * Getter for f_MediaBody26 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.MediaBody get_f_MediaBody26() {
      return build_f_MediaBody26();
    }
    private org.gwtbootstrap3.client.ui.MediaBody build_f_MediaBody26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.MediaBody f_MediaBody26 = new org.gwtbootstrap3.client.ui.MediaBody();
      // Setup section.
      f_MediaBody26.add(get_f_Heading27());
      f_MediaBody26.add(get_f_Paragraph28());

      return f_MediaBody26;
    }

    /**
     * Getter for f_Heading27 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading27() {
      return build_f_Heading27();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading27 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading27.setText("Media Heading");

      return f_Heading27;
    }

    /**
     * Getter for f_Paragraph28 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph28() {
      return build_f_Paragraph28();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph28 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.

      return f_Paragraph28;
    }

    /**
     * Getter for f_ListItem29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListItem get_f_ListItem29() {
      return build_f_ListItem29();
    }
    private org.gwtbootstrap3.client.ui.ListItem build_f_ListItem29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListItem f_ListItem29 = new org.gwtbootstrap3.client.ui.ListItem();
      // Setup section.
      f_ListItem29.add(get_f_ImageAnchor30());
      f_ListItem29.add(get_f_MediaBody31());

      return f_ListItem29;
    }

    /**
     * Getter for f_ImageAnchor30 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ImageAnchor get_f_ImageAnchor30() {
      return build_f_ImageAnchor30();
    }
    private org.gwtbootstrap3.client.ui.ImageAnchor build_f_ImageAnchor30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ImageAnchor f_ImageAnchor30 = new org.gwtbootstrap3.client.ui.ImageAnchor();
      // Setup section.
      f_ImageAnchor30.setPull(org.gwtbootstrap3.client.ui.constants.Pull.LEFT);
      f_ImageAnchor30.setUrl("images/media_object.png");
      f_ImageAnchor30.setAsMediaObject(true);

      return f_ImageAnchor30;
    }

    /**
     * Getter for f_MediaBody31 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.MediaBody get_f_MediaBody31() {
      return build_f_MediaBody31();
    }
    private org.gwtbootstrap3.client.ui.MediaBody build_f_MediaBody31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.MediaBody f_MediaBody31 = new org.gwtbootstrap3.client.ui.MediaBody();
      // Setup section.
      f_MediaBody31.add(get_f_Heading32());
      f_MediaBody31.add(get_f_Paragraph33());

      return f_MediaBody31;
    }

    /**
     * Getter for f_Heading32 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading32() {
      return build_f_Heading32();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading32 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading32.setText("Media Heading");

      return f_Heading32;
    }

    /**
     * Getter for f_Paragraph33 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph33() {
      return build_f_Paragraph33();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph33 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html5().asString());
      // Setup section.

      return f_Paragraph33;
    }

    /**
     * Getter for f_ListItem34 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ListItem get_f_ListItem34() {
      return build_f_ListItem34();
    }
    private org.gwtbootstrap3.client.ui.ListItem build_f_ListItem34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListItem f_ListItem34 = new org.gwtbootstrap3.client.ui.ListItem();
      // Setup section.
      f_ListItem34.add(get_f_ImageAnchor35());
      f_ListItem34.add(get_f_MediaBody36());

      return f_ListItem34;
    }

    /**
     * Getter for f_ImageAnchor35 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.ImageAnchor get_f_ImageAnchor35() {
      return build_f_ImageAnchor35();
    }
    private org.gwtbootstrap3.client.ui.ImageAnchor build_f_ImageAnchor35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ImageAnchor f_ImageAnchor35 = new org.gwtbootstrap3.client.ui.ImageAnchor();
      // Setup section.
      f_ImageAnchor35.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);
      f_ImageAnchor35.setUrl("images/media_object.png");
      f_ImageAnchor35.setAsMediaObject(true);

      return f_ImageAnchor35;
    }

    /**
     * Getter for f_MediaBody36 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.MediaBody get_f_MediaBody36() {
      return build_f_MediaBody36();
    }
    private org.gwtbootstrap3.client.ui.MediaBody build_f_MediaBody36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.MediaBody f_MediaBody36 = new org.gwtbootstrap3.client.ui.MediaBody();
      // Setup section.
      f_MediaBody36.add(get_f_Heading37());
      f_MediaBody36.add(get_f_Paragraph38());

      return f_MediaBody36;
    }

    /**
     * Getter for f_Heading37 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading37() {
      return build_f_Heading37();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading37 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading37.setText("Media Heading");

      return f_Heading37;
    }

    /**
     * Getter for f_Paragraph38 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph38() {
      return build_f_Paragraph38();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph38 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.

      return f_Paragraph38;
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
      f_PrettyPre40.setHTML(template_html7().asString());
      f_PrettyPre40.addStyleName("lang-xml");

      return f_PrettyPre40;
    }
  }
}
