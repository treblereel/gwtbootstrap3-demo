// Template file: org/treblereel/mvp/view/components/SuggestBox.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.components;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.691")
public class SuggestBox_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.components.SuggestBox>, org.treblereel.mvp.view.components.SuggestBox.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Country")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Country")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("&lt;b:Form&gt;\\n \\s\\s&lt;b:FieldSet&gt;\\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"country\"&gt;Country&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:SuggestBox b:id=\"country\" ui:field=\"country\" /&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\s\\s&lt;/b:FieldSet&gt;\\n &lt;/b:Form&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("@UiField(provided = true)\\n protected SuggestBox country;\\n\\n @Inject\\n public SuggestBoxView(final Binder uiBinder) {\\n\\n \\s\\sMultiWordSuggestOracle oracle = new MultiWordSuggestOracle();\\n \\s\\soracle.addAll(Arrays.asList(COUNTRIES));\\n \\s\\scountry = new SuggestBox(oracle);\\n\\n \\s\\sinitWidget(uiBinder.createAndBindUi(this));\\n\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template(".dropdown-menu .item {\\n \\s\\spadding: 5px;\\n }\\n\\n .dropdown-menu .item-selected {\\n \\s\\sbackground-color: #eee;\\n }")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
  }

  Template template = new SuggestBox_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.components.SuggestBox owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.components.SuggestBox owner;


    public Widgets(final org.treblereel.mvp.view.components.SuggestBox owner) {
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
    private org.treblereel.mvp.view.components.SuggestBox_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.components.SuggestBox_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.components.SuggestBox_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.components.SuggestBox_BinderImpl_GenBundleImpl();
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
      f_PageHeader3.setText("SuggestBox");

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
      f_Panel4.add(get_f_PanelFooter22());

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
      f_PanelBody7.add(get_f_Form8());
      f_PanelBody7.add(get_f_Modal12());
      f_PanelBody7.add(get_f_Button21());

      return f_PanelBody7;
    }

    /**
     * Getter for f_Form8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form8() {
      return build_f_Form8();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form8 = new org.gwtbootstrap3.client.ui.Form();
      // Setup section.
      f_Form8.add(get_f_FieldSet9());

      return f_Form8;
    }

    /**
     * Getter for f_FieldSet9 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FieldSet get_f_FieldSet9() {
      return build_f_FieldSet9();
    }
    private org.gwtbootstrap3.client.ui.FieldSet build_f_FieldSet9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FieldSet f_FieldSet9 = new org.gwtbootstrap3.client.ui.FieldSet();
      // Setup section.
      f_FieldSet9.add(get_f_FormGroup10());

      return f_FieldSet9;
    }

    /**
     * Getter for f_FormGroup10 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup10() {
      return build_f_FormGroup10();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup10 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup10.add(get_f_FormLabel11());
      f_FormGroup10.add(get_country());

      return f_FormGroup10;
    }

    /**
     * Getter for f_FormLabel11 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel11() {
      return build_f_FormLabel11();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel11 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel11.setHTML(template_html1().asString());
      f_FormLabel11.setFor("country");

      return f_FormLabel11;
    }

    /**
     * Getter for country called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.SuggestBox get_country() {
      return build_country();
    }
    private org.gwtbootstrap3.client.ui.SuggestBox build_country() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.SuggestBox country = owner.country;
      assert country != null : "UiField country with 'provided = true' was null";
      // Setup section.
      country.setId("country");

      return country;
    }

    /**
     * Getter for f_Modal12 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Modal get_f_Modal12() {
      return build_f_Modal12();
    }
    private org.gwtbootstrap3.client.ui.Modal build_f_Modal12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Modal f_Modal12 = new org.gwtbootstrap3.client.ui.Modal();
      // Setup section.
      f_Modal12.add(get_f_ModalBody13());
      f_Modal12.add(get_f_ModalFooter18());
      f_Modal12.setFade(true);
      f_Modal12.setDataKeyboard(true);
      f_Modal12.setClosable(true);
      f_Modal12.setId("suggestBoxModal");
      f_Modal12.setTitle("SuggestBox Modal");
      f_Modal12.setDataBackdrop(org.gwtbootstrap3.client.ui.constants.ModalBackdrop.STATIC);

      return f_Modal12;
    }

    /**
     * Getter for f_ModalBody13 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ModalBody get_f_ModalBody13() {
      return build_f_ModalBody13();
    }
    private org.gwtbootstrap3.client.ui.ModalBody build_f_ModalBody13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ModalBody f_ModalBody13 = new org.gwtbootstrap3.client.ui.ModalBody();
      // Setup section.
      f_ModalBody13.add(get_f_Form14());

      return f_ModalBody13;
    }

    /**
     * Getter for f_Form14 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form14() {
      return build_f_Form14();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form14 = new org.gwtbootstrap3.client.ui.Form();
      // Setup section.
      f_Form14.add(get_f_FieldSet15());

      return f_Form14;
    }

    /**
     * Getter for f_FieldSet15 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FieldSet get_f_FieldSet15() {
      return build_f_FieldSet15();
    }
    private org.gwtbootstrap3.client.ui.FieldSet build_f_FieldSet15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FieldSet f_FieldSet15 = new org.gwtbootstrap3.client.ui.FieldSet();
      // Setup section.
      f_FieldSet15.add(get_f_FormGroup16());

      return f_FieldSet15;
    }

    /**
     * Getter for f_FormGroup16 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup16() {
      return build_f_FormGroup16();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup16 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup16.add(get_f_FormLabel17());
      f_FormGroup16.add(get_country2());

      return f_FormGroup16;
    }

    /**
     * Getter for f_FormLabel17 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel17() {
      return build_f_FormLabel17();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel17 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel17.setHTML(template_html2().asString());
      f_FormLabel17.setFor("country");

      return f_FormLabel17;
    }

    /**
     * Getter for country2 called 1 times. Type: DEFAULT. Build precedence: 10.
     */
    private org.gwtbootstrap3.client.ui.SuggestBox get_country2() {
      return build_country2();
    }
    private org.gwtbootstrap3.client.ui.SuggestBox build_country2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.SuggestBox country2 = owner.country2;
      assert country2 != null : "UiField country2 with 'provided = true' was null";
      // Setup section.
      country2.setId("country2");

      return country2;
    }

    /**
     * Getter for f_ModalFooter18 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.ModalFooter get_f_ModalFooter18() {
      return build_f_ModalFooter18();
    }
    private org.gwtbootstrap3.client.ui.ModalFooter build_f_ModalFooter18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ModalFooter f_ModalFooter18 = new org.gwtbootstrap3.client.ui.ModalFooter();
      // Setup section.
      f_ModalFooter18.add(get_f_Button19());
      f_ModalFooter18.add(get_f_Button20());

      return f_ModalFooter18;
    }

    /**
     * Getter for f_Button19 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button19() {
      return build_f_Button19();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button19 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button19.setText("Do something");
      f_Button19.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button19;
    }

    /**
     * Getter for f_Button20 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button20() {
      return build_f_Button20();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button20 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button20.setText("Close");
      f_Button20.setDataDismiss(org.gwtbootstrap3.client.ui.constants.ButtonDismiss.MODAL);
      f_Button20.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);

      return f_Button20;
    }

    /**
     * Getter for f_Button21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button21() {
      return build_f_Button21();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button21 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button21.setText("SuggestBox Modal");
      f_Button21.setSize(org.gwtbootstrap3.client.ui.constants.ButtonSize.LARGE);
      f_Button21.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.MODAL);
      f_Button21.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button21.setDataTarget("#suggestBoxModal");

      return f_Button21;
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
      f_PanelFooter22.add(get_f_Heading24());
      f_PanelFooter22.add(get_f_PrettyPre25());
      f_PanelFooter22.add(get_f_Heading26());
      f_PanelFooter22.add(get_f_PrettyPre27());

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
      f_PrettyPre23.setHTML(template_html3().asString());
      f_PrettyPre23.addStyleName("lang-xml");

      return f_PrettyPre23;
    }

    /**
     * Getter for f_Heading24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading24() {
      return build_f_Heading24();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading24 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading24.setText("Java Code:");

      return f_Heading24;
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
      f_PrettyPre25.setHTML(template_html4().asString());
      f_PrettyPre25.addStyleName("lang-java");

      return f_PrettyPre25;
    }

    /**
     * Getter for f_Heading26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading26() {
      return build_f_Heading26();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading26 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading26.setText("CSS Styling:");

      return f_Heading26;
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
      f_PrettyPre27.setHTML(template_html5().asString());
      f_PrettyPre27.addStyleName("lang-css");

      return f_PrettyPre27;
    }
  }
}
