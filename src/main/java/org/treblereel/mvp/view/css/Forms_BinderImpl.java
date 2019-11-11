// Template file: org/treblereel/mvp/view/css/Forms.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.css;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.643")
public class Forms_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.css.Forms>, org.treblereel.mvp.view.css.Forms.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Email")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("email@example.example")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Password")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("Name")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("Input with warning")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Input with error")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("Input with success / Disabled")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("&lt;b:Form&gt;\\n \\s\\s&lt;b:FieldSet&gt;\\n \\s\\s\\s\\s&lt;b:Legend&gt;Sample form&lt;/b:Legend&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formEmail\"&gt;Email&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormControlStatic b:id=\"formEmail\"&gt;email@example.example&lt;/b:FormControlStatic&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formPassword\"&gt;Password&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Input type=\"PASSWORD\" b:id=\"formPassword\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formName\"&gt;Name&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox placeholder=\"blabla\" b:id=\"formName\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup validationState=\"WARNING\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formWarning\"&gt;Input with warning&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox b:id=\"formWarning\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:HelpBlock text=\"\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup validationState=\"ERROR\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formError\"&gt;Input with error&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox b:id=\"formError\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup validationState=\"SUCCESS\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formSuccess\"&gt;Input with success&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox b:id=\"formSuccess\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:Button&gt;Send&lt;/b:Button&gt;\\n \\s\\s&lt;/b:FieldSet&gt;\\n &lt;/b:Form&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("Field Label")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("&lt;b:Form&gt;\\n \\s\\s&lt;b:FieldSet&gt;\\n \\s\\s\\s\\s&lt;b:FormGroup ui:field=\"formGroup\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formSuccess\"&gt;Field Label&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox b:id=\"formSuccess\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\s\\s\\s\\s&lt;b:Button type=\"PRIMARY\"&gt;None&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button type=\"PRIMARY\"&gt;Success&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button type=\"PRIMARY\"&gt;Warning&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;b:Button type=\"PRIMARY\"&gt;Error&lt;/b:Button&gt;\\n \\s\\s&lt;/b:FieldSet&gt;\\n &lt;/b:Form&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("@UiField\\n FormGroup formGroup;\\n\\n // Click Handlers (depending on what button is clicked)\\n formGroup.setValidationState(ValidationState.NONE)\\n formGroup.setValidationState(ValidationState.SUCCESS)\\n formGroup.setValidationState(ValidationState.WARNING)\\n formGroup.setValidationState(ValidationState.ERROR)\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("Sample form")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("&lt;b:Form type=\"INLINE\"&gt;\\n \\s\\s&lt;b:FieldSet&gt;\\n \\s\\s\\s\\s&lt;b:Legend&gt;Sample form&lt;/b:Legend&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox placeholder=\"Enter email\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Input type=\"PASSWORD\" placeholder=\"Enter password\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:InlineCheckBox text=\"Remember me\"/&gt; &lt;b:InlineCheckBox text=\"Another check box\"/&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:Button&gt;Send&lt;/b:Button&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\s\\s&lt;/b:FieldSet&gt;\\n &lt;/b:Form&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("Sample form")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("Email")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("email@example.example")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("Name")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("Country")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("&lt;b:Form type=\"HORIZONTAL\"&gt;\\n \\s\\s&lt;b:FieldSet&gt;\\n \\s\\s\\s\\s&lt;b:Legend&gt;Sample form&lt;/b:Legend&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formEmail\" addStyleNames=\"col-lg-2\"&gt;Email&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;g:FlowPanel addStyleNames=\"col-lg-10\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:FormControlStatic b:id=\"formEmail\"&gt;email@example.example&lt;/b:FormControlStatic&gt;\\n \\s\\s\\s\\s&lt;/g:FlowPanel&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formName\" addStyleNames=\"col-lg-2\"&gt;Name&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;g:FlowPanel addStyleNames=\"col-lg-10\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:TextBox placeholder=\"blabla\" b:id=\"formName\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/g:FlowPanel&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"formCountry\" addStyleNames=\"col-lg-2\"&gt;Country&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;g:FlowPanel addStyleNames=\"col-lg-10\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:ListBox b:id=\"formCountry\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;g:item&gt;USA&lt;/g:item&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;g:item&gt;Germany&lt;/g:item&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;g:item&gt;Other&lt;/g:item&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;/b:ListBox&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/g:FlowPanel&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;g:FlowPanel addStyleNames=\"col-lg-offset-2 col-lg-10\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:CheckBox text=\"Remember me\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/g:FlowPanel&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;g:FlowPanel addStyleNames=\"col-lg-offset-2 col-lg-10\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:InlineRadio name=\"radio1\" formValue=\"value1\" text=\"Radio 1\"/&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:InlineRadio name=\"radio1\" formValue=\"value2\" text=\"Radio 2\"/&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:InlineRadio name=\"radio1\" formValue=\"value3\" text=\"Radio 3\"/&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/g:FlowPanel&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;g:FlowPanel addStyleNames=\"col-lg-offset-2 col-lg-10\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Button&gt;Send&lt;/b:Button&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/g:FlowPanel&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\s\\s&lt;/b:FieldSet&gt;\\n &lt;/b:Form&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
  }

  Template template = new Forms_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.css.Forms owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.css.Forms owner;


    public Widgets(final org.treblereel.mvp.view.css.Forms owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.Forms_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.css.Forms_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.css.Forms_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.css.Forms_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.css.Forms_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.css.Forms_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.css.Forms_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel32());
      f_Column2.add(get_f_Panel45());
      f_Column2.add(get_f_Panel63());

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
      f_PageHeader3.setText("Forms");
      f_PageHeader3.setSubText("form control widgets");

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
      f_Panel4.add(get_f_PanelFooter30());

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
      f_FieldSet9.add(get_f_FormGroup13());
      f_FieldSet9.add(get_f_FormGroup16());
      f_FieldSet9.add(get_f_FormGroup19());
      f_FieldSet9.add(get_f_FormGroup23());
      f_FieldSet9.add(get_f_FormGroup26());
      f_FieldSet9.add(get_f_Button29());

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
      f_FormGroup10.add(get_f_FormControlStatic12());

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
      f_FormLabel11.setFor("formEmail");

      return f_FormLabel11;
    }

    /**
     * Getter for f_FormControlStatic12 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormControlStatic get_f_FormControlStatic12() {
      return build_f_FormControlStatic12();
    }
    private org.gwtbootstrap3.client.ui.FormControlStatic build_f_FormControlStatic12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormControlStatic f_FormControlStatic12 = new org.gwtbootstrap3.client.ui.FormControlStatic();
      // Setup section.
      f_FormControlStatic12.setHTML(template_html2().asString());
      f_FormControlStatic12.setId("formEmail");

      return f_FormControlStatic12;
    }

    /**
     * Getter for f_FormGroup13 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup13() {
      return build_f_FormGroup13();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup13 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup13.add(get_f_FormLabel14());
      f_FormGroup13.add(get_f_Input15());

      return f_FormGroup13;
    }

    /**
     * Getter for f_FormLabel14 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel14() {
      return build_f_FormLabel14();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel14 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel14.setHTML(template_html3().asString());
      f_FormLabel14.setFor("formPassword");

      return f_FormLabel14;
    }

    /**
     * Getter for f_Input15 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Input get_f_Input15() {
      return build_f_Input15();
    }
    private org.gwtbootstrap3.client.ui.Input build_f_Input15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Input f_Input15 = new org.gwtbootstrap3.client.ui.Input(org.gwtbootstrap3.client.ui.constants.InputType.PASSWORD);
      // Setup section.
      f_Input15.setId("formPassword");

      return f_Input15;
    }

    /**
     * Getter for f_FormGroup16 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup16() {
      return build_f_FormGroup16();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup16 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup16.add(get_f_FormLabel17());
      f_FormGroup16.add(get_f_TextBox18());

      return f_FormGroup16;
    }

    /**
     * Getter for f_FormLabel17 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel17() {
      return build_f_FormLabel17();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel17 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel17.setHTML(template_html4().asString());
      f_FormLabel17.setFor("formName");

      return f_FormLabel17;
    }

    /**
     * Getter for f_TextBox18 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox18() {
      return build_f_TextBox18();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox18 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox18.setPlaceholder("blabla");
      f_TextBox18.setId("formName");

      return f_TextBox18;
    }

    /**
     * Getter for f_FormGroup19 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup19() {
      return build_f_FormGroup19();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup19 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup19.add(get_f_FormLabel20());
      f_FormGroup19.add(get_f_TextBox21());
      f_FormGroup19.add(get_f_HelpBlock22());
      f_FormGroup19.setValidationState(org.gwtbootstrap3.client.ui.constants.ValidationState.WARNING);

      return f_FormGroup19;
    }

    /**
     * Getter for f_FormLabel20 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel20() {
      return build_f_FormLabel20();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel20 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel20.setHTML(template_html5().asString());
      f_FormLabel20.setFor("formWarning");

      return f_FormLabel20;
    }

    /**
     * Getter for f_TextBox21 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox21() {
      return build_f_TextBox21();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox21 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox21.setId("formWarning");

      return f_TextBox21;
    }

    /**
     * Getter for f_HelpBlock22 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.HelpBlock get_f_HelpBlock22() {
      return build_f_HelpBlock22();
    }
    private org.gwtbootstrap3.client.ui.HelpBlock build_f_HelpBlock22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.HelpBlock f_HelpBlock22 = new org.gwtbootstrap3.client.ui.HelpBlock();
      // Setup section.
      f_HelpBlock22.setText("Form inline help here");

      return f_HelpBlock22;
    }

    /**
     * Getter for f_FormGroup23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup23() {
      return build_f_FormGroup23();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup23 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup23.add(get_f_FormLabel24());
      f_FormGroup23.add(get_f_TextBox25());
      f_FormGroup23.setValidationState(org.gwtbootstrap3.client.ui.constants.ValidationState.ERROR);

      return f_FormGroup23;
    }

    /**
     * Getter for f_FormLabel24 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel24() {
      return build_f_FormLabel24();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel24 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel24.setHTML(template_html6().asString());
      f_FormLabel24.setFor("formError");

      return f_FormLabel24;
    }

    /**
     * Getter for f_TextBox25 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox25() {
      return build_f_TextBox25();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox25 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox25.setId("formError");

      return f_TextBox25;
    }

    /**
     * Getter for f_FormGroup26 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup26() {
      return build_f_FormGroup26();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup26 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup26.add(get_f_FormLabel27());
      f_FormGroup26.add(get_f_TextBox28());
      f_FormGroup26.setValidationState(org.gwtbootstrap3.client.ui.constants.ValidationState.SUCCESS);

      return f_FormGroup26;
    }

    /**
     * Getter for f_FormLabel27 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel27() {
      return build_f_FormLabel27();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel27 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel27.setHTML(template_html7().asString());
      f_FormLabel27.setFor("formSuccess");

      return f_FormLabel27;
    }

    /**
     * Getter for f_TextBox28 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox28() {
      return build_f_TextBox28();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox28 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox28.setId("formSuccess");
      f_TextBox28.setEnabled(false);

      return f_TextBox28;
    }

    /**
     * Getter for f_Button29 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button29() {
      return build_f_Button29();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button29 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button29.setText("Send");

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
      f_PrettyPre31.setHTML(template_html8().asString());
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
      f_Panel32.add(get_f_PanelFooter40());

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
      f_Heading34.setText("Changing Validation");

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
      f_PanelBody35.add(get_f_Form36());

      return f_PanelBody35;
    }

    /**
     * Getter for f_Form36 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form36() {
      return build_f_Form36();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form36 = new org.gwtbootstrap3.client.ui.Form();
      // Setup section.
      f_Form36.add(get_f_FieldSet37());

      return f_Form36;
    }

    /**
     * Getter for f_FieldSet37 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FieldSet get_f_FieldSet37() {
      return build_f_FieldSet37();
    }
    private org.gwtbootstrap3.client.ui.FieldSet build_f_FieldSet37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FieldSet f_FieldSet37 = new org.gwtbootstrap3.client.ui.FieldSet();
      // Setup section.
      f_FieldSet37.add(get_formGroup());
      f_FieldSet37.add(get_none());
      f_FieldSet37.add(get_success());
      f_FieldSet37.add(get_warning());
      f_FieldSet37.add(get_error());

      return f_FieldSet37;
    }

    /**
     * Getter for formGroup called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_formGroup() {
      return build_formGroup();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_formGroup() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup formGroup = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      formGroup.add(get_f_FormLabel38());
      formGroup.add(get_f_TextBox39());

      this.owner.formGroup = formGroup;

      return formGroup;
    }

    /**
     * Getter for f_FormLabel38 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel38() {
      return build_f_FormLabel38();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel38() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel38 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel38.setHTML(template_html9().asString());
      f_FormLabel38.setFor("formSuccess");

      return f_FormLabel38;
    }

    /**
     * Getter for f_TextBox39 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox39() {
      return build_f_TextBox39();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox39 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox39.setId("formSuccess");

      return f_TextBox39;
    }

    /**
     * Getter for none called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_none() {
      return build_none();
    }
    private org.gwtbootstrap3.client.ui.Button build_none() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button none = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      none.setText("None");
      none.addStyleName("" + get_style().marginRight() + "");
      none.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      this.owner.none = none;

      return none;
    }

    /**
     * Getter for success called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_success() {
      return build_success();
    }
    private org.gwtbootstrap3.client.ui.Button build_success() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button success = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      success.setText("Success");
      success.addStyleName("" + get_style().marginRight() + "");
      success.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      this.owner.success = success;

      return success;
    }

    /**
     * Getter for warning called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_warning() {
      return build_warning();
    }
    private org.gwtbootstrap3.client.ui.Button build_warning() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button warning = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      warning.setText("Warning");
      warning.addStyleName("" + get_style().marginRight() + "");
      warning.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      this.owner.warning = warning;

      return warning;
    }

    /**
     * Getter for error called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_error() {
      return build_error();
    }
    private org.gwtbootstrap3.client.ui.Button build_error() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button error = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      error.setText("Error");
      error.addStyleName("" + get_style().marginRight() + "");
      error.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      this.owner.error = error;

      return error;
    }

    /**
     * Getter for f_PanelFooter40 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter40() {
      return build_f_PanelFooter40();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter40 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter40.add(get_f_Heading41());
      f_PanelFooter40.add(get_f_PrettyPre42());
      f_PanelFooter40.add(get_f_Heading43());
      f_PanelFooter40.add(get_f_PrettyPre44());

      return f_PanelFooter40;
    }

    /**
     * Getter for f_Heading41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading41() {
      return build_f_Heading41();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading41 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading41.setText("UiBinder Code");

      return f_Heading41;
    }

    /**
     * Getter for f_PrettyPre42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre42() {
      return build_f_PrettyPre42();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre42() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre42 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre42.setHTML(template_html10().asString());
      f_PrettyPre42.addStyleName("lang-xml");

      return f_PrettyPre42;
    }

    /**
     * Getter for f_Heading43 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading43() {
      return build_f_Heading43();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading43 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading43.setText("Java code");

      return f_Heading43;
    }

    /**
     * Getter for f_PrettyPre44 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre44() {
      return build_f_PrettyPre44();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre44() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre44 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre44.setHTML(template_html11().asString());
      f_PrettyPre44.addStyleName("lang-java");

      return f_PrettyPre44;
    }

    /**
     * Getter for f_Panel45 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel45() {
      return build_f_Panel45();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel45 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel45.add(get_f_PanelHeader46());
      f_Panel45.add(get_f_PanelBody48());
      f_Panel45.add(get_f_PanelFooter61());

      return f_Panel45;
    }

    /**
     * Getter for f_PanelHeader46 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader46() {
      return build_f_PanelHeader46();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader46() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader46 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader46.add(get_f_Heading47());

      return f_PanelHeader46;
    }

    /**
     * Getter for f_Heading47 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading47() {
      return build_f_Heading47();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading47 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading47.setText("Inline");

      return f_Heading47;
    }

    /**
     * Getter for f_PanelBody48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody48() {
      return build_f_PanelBody48();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody48 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody48.add(get_f_Form49());

      return f_PanelBody48;
    }

    /**
     * Getter for f_Form49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form49() {
      return build_f_Form49();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form49 = new org.gwtbootstrap3.client.ui.Form();
      // Setup section.
      f_Form49.add(get_f_FieldSet50());
      f_Form49.setType(org.gwtbootstrap3.client.ui.constants.FormType.INLINE);

      return f_Form49;
    }

    /**
     * Getter for f_FieldSet50 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FieldSet get_f_FieldSet50() {
      return build_f_FieldSet50();
    }
    private org.gwtbootstrap3.client.ui.FieldSet build_f_FieldSet50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FieldSet f_FieldSet50 = new org.gwtbootstrap3.client.ui.FieldSet();
      // Setup section.
      f_FieldSet50.add(get_f_Legend51());
      f_FieldSet50.add(get_f_FormGroup52());
      f_FieldSet50.add(get_f_FormGroup54());
      f_FieldSet50.add(get_f_FormGroup56());
      f_FieldSet50.add(get_f_FormGroup59());

      return f_FieldSet50;
    }

    /**
     * Getter for f_Legend51 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Legend get_f_Legend51() {
      return build_f_Legend51();
    }
    private org.gwtbootstrap3.client.ui.Legend build_f_Legend51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Legend f_Legend51 = new org.gwtbootstrap3.client.ui.Legend();
      // Setup section.
      f_Legend51.setHTML(template_html12().asString());

      return f_Legend51;
    }

    /**
     * Getter for f_FormGroup52 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup52() {
      return build_f_FormGroup52();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup52 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup52.add(get_f_TextBox53());

      return f_FormGroup52;
    }

    /**
     * Getter for f_TextBox53 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox53() {
      return build_f_TextBox53();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox53 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox53.setPlaceholder("Enter email");

      return f_TextBox53;
    }

    /**
     * Getter for f_FormGroup54 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup54() {
      return build_f_FormGroup54();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup54 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup54.add(get_f_Input55());

      return f_FormGroup54;
    }

    /**
     * Getter for f_Input55 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Input get_f_Input55() {
      return build_f_Input55();
    }
    private org.gwtbootstrap3.client.ui.Input build_f_Input55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Input f_Input55 = new org.gwtbootstrap3.client.ui.Input(org.gwtbootstrap3.client.ui.constants.InputType.PASSWORD);
      // Setup section.
      f_Input55.setPlaceholder("Enter password");

      return f_Input55;
    }

    /**
     * Getter for f_FormGroup56 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup56() {
      return build_f_FormGroup56();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup56 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup56.add(get_f_InlineCheckBox57());
      f_FormGroup56.add(get_f_InlineCheckBox58());

      return f_FormGroup56;
    }

    /**
     * Getter for f_InlineCheckBox57 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.InlineCheckBox get_f_InlineCheckBox57() {
      return build_f_InlineCheckBox57();
    }
    private org.gwtbootstrap3.client.ui.InlineCheckBox build_f_InlineCheckBox57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InlineCheckBox f_InlineCheckBox57 = new org.gwtbootstrap3.client.ui.InlineCheckBox();
      // Setup section.
      f_InlineCheckBox57.setText("Remember me");

      return f_InlineCheckBox57;
    }

    /**
     * Getter for f_InlineCheckBox58 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.InlineCheckBox get_f_InlineCheckBox58() {
      return build_f_InlineCheckBox58();
    }
    private org.gwtbootstrap3.client.ui.InlineCheckBox build_f_InlineCheckBox58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InlineCheckBox f_InlineCheckBox58 = new org.gwtbootstrap3.client.ui.InlineCheckBox();
      // Setup section.
      f_InlineCheckBox58.setText("Another check box");

      return f_InlineCheckBox58;
    }

    /**
     * Getter for f_FormGroup59 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup59() {
      return build_f_FormGroup59();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup59 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup59.add(get_f_Button60());

      return f_FormGroup59;
    }

    /**
     * Getter for f_Button60 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button60() {
      return build_f_Button60();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button60() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button60 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button60.setText("Send");

      return f_Button60;
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
      f_PrettyPre62.setHTML(template_html13().asString());
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
      f_Panel63.add(get_f_PanelFooter93());

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
      f_Heading65.setText("Horizontal");

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
      f_PanelBody66.add(get_f_Form67());

      return f_PanelBody66;
    }

    /**
     * Getter for f_Form67 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Form get_f_Form67() {
      return build_f_Form67();
    }
    private org.gwtbootstrap3.client.ui.Form build_f_Form67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Form f_Form67 = new org.gwtbootstrap3.client.ui.Form();
      // Setup section.
      f_Form67.add(get_f_FieldSet68());
      f_Form67.setType(org.gwtbootstrap3.client.ui.constants.FormType.HORIZONTAL);

      return f_Form67;
    }

    /**
     * Getter for f_FieldSet68 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.FieldSet get_f_FieldSet68() {
      return build_f_FieldSet68();
    }
    private org.gwtbootstrap3.client.ui.FieldSet build_f_FieldSet68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FieldSet f_FieldSet68 = new org.gwtbootstrap3.client.ui.FieldSet();
      // Setup section.
      f_FieldSet68.add(get_f_Legend69());
      f_FieldSet68.add(get_f_FormGroup70());
      f_FieldSet68.add(get_f_FormGroup74());
      f_FieldSet68.add(get_f_FormGroup78());
      f_FieldSet68.add(get_f_FormGroup82());
      f_FieldSet68.add(get_f_FormGroup85());
      f_FieldSet68.add(get_f_FormGroup90());

      return f_FieldSet68;
    }

    /**
     * Getter for f_Legend69 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Legend get_f_Legend69() {
      return build_f_Legend69();
    }
    private org.gwtbootstrap3.client.ui.Legend build_f_Legend69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Legend f_Legend69 = new org.gwtbootstrap3.client.ui.Legend();
      // Setup section.
      f_Legend69.setHTML(template_html14().asString());

      return f_Legend69;
    }

    /**
     * Getter for f_FormGroup70 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup70() {
      return build_f_FormGroup70();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup70() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup70 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup70.add(get_f_FormLabel71());
      f_FormGroup70.add(get_f_FlowPanel72());

      return f_FormGroup70;
    }

    /**
     * Getter for f_FormLabel71 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel71() {
      return build_f_FormLabel71();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel71 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel71.setHTML(template_html15().asString());
      f_FormLabel71.addStyleName("col-lg-2");
      f_FormLabel71.setFor("formEmail");

      return f_FormLabel71;
    }

    /**
     * Getter for f_FlowPanel72 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel72() {
      return build_f_FlowPanel72();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel72() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel72 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel72.add(get_f_FormControlStatic73());
      f_FlowPanel72.addStyleName("col-lg-10");

      return f_FlowPanel72;
    }

    /**
     * Getter for f_FormControlStatic73 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.FormControlStatic get_f_FormControlStatic73() {
      return build_f_FormControlStatic73();
    }
    private org.gwtbootstrap3.client.ui.FormControlStatic build_f_FormControlStatic73() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormControlStatic f_FormControlStatic73 = new org.gwtbootstrap3.client.ui.FormControlStatic();
      // Setup section.
      f_FormControlStatic73.setHTML(template_html16().asString());
      f_FormControlStatic73.setId("formEmail");

      return f_FormControlStatic73;
    }

    /**
     * Getter for f_FormGroup74 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup74() {
      return build_f_FormGroup74();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup74() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup74 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup74.add(get_f_FormLabel75());
      f_FormGroup74.add(get_f_FlowPanel76());

      return f_FormGroup74;
    }

    /**
     * Getter for f_FormLabel75 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel75() {
      return build_f_FormLabel75();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel75() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel75 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel75.setHTML(template_html17().asString());
      f_FormLabel75.addStyleName("col-lg-2");
      f_FormLabel75.setFor("formName");

      return f_FormLabel75;
    }

    /**
     * Getter for f_FlowPanel76 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel76() {
      return build_f_FlowPanel76();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel76() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel76 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel76.add(get_f_TextBox77());
      f_FlowPanel76.addStyleName("col-lg-10");

      return f_FlowPanel76;
    }

    /**
     * Getter for f_TextBox77 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.TextBox get_f_TextBox77() {
      return build_f_TextBox77();
    }
    private org.gwtbootstrap3.client.ui.TextBox build_f_TextBox77() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.TextBox f_TextBox77 = new org.gwtbootstrap3.client.ui.TextBox();
      // Setup section.
      f_TextBox77.setPlaceholder("blabla");
      f_TextBox77.setId("formName");

      return f_TextBox77;
    }

    /**
     * Getter for f_FormGroup78 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup78() {
      return build_f_FormGroup78();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup78 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup78.add(get_f_FormLabel79());
      f_FormGroup78.add(get_f_FlowPanel80());

      return f_FormGroup78;
    }

    /**
     * Getter for f_FormLabel79 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel79() {
      return build_f_FormLabel79();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel79 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel79.setHTML(template_html18().asString());
      f_FormLabel79.addStyleName("col-lg-2");
      f_FormLabel79.setFor("formCountry");

      return f_FormLabel79;
    }

    /**
     * Getter for f_FlowPanel80 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel80() {
      return build_f_FlowPanel80();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel80() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel80 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel80.add(get_f_ListBox81());
      f_FlowPanel80.addStyleName("col-lg-10");

      return f_FlowPanel80;
    }

    /**
     * Getter for f_ListBox81 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.ListBox get_f_ListBox81() {
      return build_f_ListBox81();
    }
    private org.gwtbootstrap3.client.ui.ListBox build_f_ListBox81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ListBox f_ListBox81 = new org.gwtbootstrap3.client.ui.ListBox();
      // Setup section.
      f_ListBox81.addItem("USA");
      f_ListBox81.addItem("Germany");
      f_ListBox81.addItem("Other");
      f_ListBox81.setId("formCountry");

      return f_ListBox81;
    }

    /**
     * Getter for f_FormGroup82 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup82() {
      return build_f_FormGroup82();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup82 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup82.add(get_f_FlowPanel83());

      return f_FormGroup82;
    }

    /**
     * Getter for f_FlowPanel83 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel83() {
      return build_f_FlowPanel83();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel83() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel83 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel83.add(get_f_CheckBox84());
      f_FlowPanel83.addStyleName("col-lg-offset-2");
      f_FlowPanel83.addStyleName("col-lg-10");

      return f_FlowPanel83;
    }

    /**
     * Getter for f_CheckBox84 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.CheckBox get_f_CheckBox84() {
      return build_f_CheckBox84();
    }
    private org.gwtbootstrap3.client.ui.CheckBox build_f_CheckBox84() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.CheckBox f_CheckBox84 = new org.gwtbootstrap3.client.ui.CheckBox();
      // Setup section.
      f_CheckBox84.setText("Remember me");

      return f_CheckBox84;
    }

    /**
     * Getter for f_FormGroup85 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup85() {
      return build_f_FormGroup85();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup85() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup85 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup85.add(get_f_FlowPanel86());

      return f_FormGroup85;
    }

    /**
     * Getter for f_FlowPanel86 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel86() {
      return build_f_FlowPanel86();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel86() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel86 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel86.add(get_f_InlineRadio87());
      f_FlowPanel86.add(get_f_InlineRadio88());
      f_FlowPanel86.add(get_f_InlineRadio89());
      f_FlowPanel86.addStyleName("col-lg-offset-2");
      f_FlowPanel86.addStyleName("col-lg-10");

      return f_FlowPanel86;
    }

    /**
     * Getter for f_InlineRadio87 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.InlineRadio get_f_InlineRadio87() {
      return build_f_InlineRadio87();
    }
    private org.gwtbootstrap3.client.ui.InlineRadio build_f_InlineRadio87() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InlineRadio f_InlineRadio87 = new org.gwtbootstrap3.client.ui.InlineRadio("radio1");
      // Setup section.
      f_InlineRadio87.setText("Radio 1");
      f_InlineRadio87.setFormValue("value1");

      return f_InlineRadio87;
    }

    /**
     * Getter for f_InlineRadio88 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.InlineRadio get_f_InlineRadio88() {
      return build_f_InlineRadio88();
    }
    private org.gwtbootstrap3.client.ui.InlineRadio build_f_InlineRadio88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InlineRadio f_InlineRadio88 = new org.gwtbootstrap3.client.ui.InlineRadio("radio1");
      // Setup section.
      f_InlineRadio88.setText("Radio 2");
      f_InlineRadio88.setFormValue("value2");

      return f_InlineRadio88;
    }

    /**
     * Getter for f_InlineRadio89 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.InlineRadio get_f_InlineRadio89() {
      return build_f_InlineRadio89();
    }
    private org.gwtbootstrap3.client.ui.InlineRadio build_f_InlineRadio89() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.InlineRadio f_InlineRadio89 = new org.gwtbootstrap3.client.ui.InlineRadio("radio1");
      // Setup section.
      f_InlineRadio89.setText("Radio 3");
      f_InlineRadio89.setFormValue("value3");

      return f_InlineRadio89;
    }

    /**
     * Getter for f_FormGroup90 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormGroup get_f_FormGroup90() {
      return build_f_FormGroup90();
    }
    private org.gwtbootstrap3.client.ui.FormGroup build_f_FormGroup90() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormGroup f_FormGroup90 = new org.gwtbootstrap3.client.ui.FormGroup();
      // Setup section.
      f_FormGroup90.add(get_f_FlowPanel91());

      return f_FormGroup90;
    }

    /**
     * Getter for f_FlowPanel91 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_f_FlowPanel91() {
      return build_f_FlowPanel91();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_f_FlowPanel91() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel f_FlowPanel91 = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.
      f_FlowPanel91.add(get_f_Button92());
      f_FlowPanel91.addStyleName("col-lg-offset-2");
      f_FlowPanel91.addStyleName("col-lg-10");

      return f_FlowPanel91;
    }

    /**
     * Getter for f_Button92 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button92() {
      return build_f_Button92();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button92() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button92 = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      f_Button92.setText("Send");

      return f_Button92;
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
      f_PrettyPre94.setHTML(template_html19().asString());
      f_PrettyPre94.addStyleName("lang-xml");

      return f_PrettyPre94;
    }
  }
}
