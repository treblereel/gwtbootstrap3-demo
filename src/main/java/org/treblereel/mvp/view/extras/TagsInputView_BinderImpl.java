// Template file: org/treblereel/mvp/view/extras/TagsInputView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:51.776")
public class TagsInputView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.TagsInputView>, org.treblereel.mvp.view.extras.TagsInputView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Tags Input")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 0.8.0")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Tags Input, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.tagsinput.TagsInput\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("If you want to use typeahead functionalty, then you also need to inherit Typeahead module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.typeahead.Typeahead\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it select):")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("xmlns:tagsinput=\"urn:import:org.gwtbootstrap3.extras.tagsinput.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("&lt;tagsinput:TagsInput ui:field=\"markupTagsInput\" value=\"Belgrade,Amsterdam,Washington\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("@UiField TagsInput markupTagsInput;\\n \\n List&lt;String&gt; tags = new ArrayList&lt;String&gt;();\\n tags.add(\"Sydney\");\\n tags.add(\"Beijing\");\\n tags.add(\"Cairo\");\\n \\n for(String tag : tags) {\\n \\s\\s\\s\\smarkupTagsInput.add(tag);\\n }\\n")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("Use a <code>&lt;select multiple /&gt;</code> as your input for a tags input, to gain true multivalue support.")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("Instead of comma separated string, the values will be set in an array. Existing <code>&lt;option /&gt;</code> elements will automatically be set as tags. This makes it also possible to create tags containing a comma.")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("&lt;tagsinput:MVTagsInput ui:field=\"multiValueTagsInput\" value=\"Belgrade,Amsterdam,Washington\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("@UiField MVTagsInput multiValueTagsInput;\\n \\n List&lt;String&gt; tags = new ArrayList&lt;String&gt;();\\n tags.add(\"Sydney\");\\n tags.add(\"Beijing\");\\n tags.add(\"Cairo\");\\n \\n multiValueTagsInput.add(tags);\\n")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("Twitter typeahead.js widget")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("Typeahead is implemented using <span id='{0}'></span>. An example of using this is shown below.")
    org.gwtproject.safehtml.shared.SafeHtml html19(String arg0);
     
    @Template("final List&lt;String&gt; suggestions = new ArrayList&lt;String&gt;();\\n suggestions.add(\"Belgrade\");\\n suggestions.add(\"Amsterdam\");\\n suggestions.add(\"London\");\\n suggestions.add(\"Paris\");\\n suggestions.add(\"Washington\");\\n suggestions.add(\"New York\");\\n suggestions.add(\"Los Angeles\");\\n suggestions.add(\"Sydney\");\\n suggestions.add(\"Melbourne\");\\n suggestions.add(\"Canberra\");\\n suggestions.add(\"Beijing\");\\n suggestions.add(\"New Delhi\");\\n suggestions.add(\"Kathmandu\");\\n suggestions.add(\"Cairo\");\\n suggestions.add(\"Cape Town\");\\n suggestions.add(\"Kinshasa\");\\n \\n StringDataset dataset = new StringDataset(suggestions);\\n \\n typeaheadTagsInput.setDatasets(dataset);\\n typeaheadTagsInput.reconfigure();\\n typeaheadTagsInput.setTypeahead(suggestions);\\n")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("Instead of just adding strings as tags, bind objects to your tags.")
    org.gwtproject.safehtml.shared.SafeHtml html21();
     
    @Template("TagsInput comes with predefined classes which uses Strings for tags. However, it is possible to bind any Java or JavaScript object as tag.")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
    @Template("In order to properly process items, it is required to implement and set callbacks which returns <i>itemValue</i> and <i>itemText</i>. Callbacks are instances of <code>ItemValueCallback</code> and <code>ItemTextCallback</code>.")
    org.gwtproject.safehtml.shared.SafeHtml html23();
     
    @Template("&lt;tagsinputbase:SingleValueTagsInput ui:field=\"joTagsInput\" /&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html24();
     
    @Template("Objects that are used as items can be of any Java class. In this example, <code>Item</code> is simple class with <code>String</code> and <code>Integer</code> fields with getters and setters.")
    org.gwtproject.safehtml.shared.SafeHtml html25();
     
    @Template("final ItemValueCallback&lt;Item&gt; cbValue = new ItemValueCallback&lt;Item&gt;() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic String getItemValue(Item item) {\\n \\s\\s\\s\\s\\s\\s\\s\\sreturn item.getValue().toString();\\n \\s\\s\\s\\s}\\n };\\n \\n final ItemTextCallback&lt;Item&gt; cbText = new ItemTextCallback&lt;Item&gt;() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic String getItemText(Item item) {\\n \\s\\s\\s\\s\\s\\s\\s\\sreturn item.getText();\\n \\s\\s\\s\\s}\\n };\\n \\n joTagsInput.setItemValue(cbValue);\\n joTagsInput.setItemText(cbText);\\n joTagsInput.reconfigure();\\n")
    org.gwtproject.safehtml.shared.SafeHtml html26();
     
    @Template("List&lt;Item&gt; tags = new ArrayList&lt;Item&gt;();\\n tags.add(new Item(\"Belgrade\", 1));\\n tags.add(new Item(\"Amsterdam\", 2));\\n tags.add(new Item(\"London\", 3));\\n joTagsInput.add(tags);\\n")
    org.gwtproject.safehtml.shared.SafeHtml html27();
     
    @Template("List&lt;Item&gt; suggestions = new ArrayList&lt;Item&gt;();\\n suggestions.add(new Item(\"Belgrade\", 4));\\n suggestions.add(new Item(\"Athens\", 5));\\n CollectionDataset&lt;Item&gt; dataset = new CollectionDataset&lt;Item&gt;(suggestions) {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic String getValue(Item datum) {\\n \\s\\s\\s\\s\\s\\s\\s\\sreturn datum != null ? datum.getText() : \"\";\\n \\s\\s\\s\\s}\\n };\\n joTagsInput.setDatasets(dataset);\\n")
    org.gwtproject.safehtml.shared.SafeHtml html28();
     
    @Template("&lt;tagsinput:TagsInput ui:field=\"categoryTagsInput\" value=\"Belgrade,Amsterdam,Washington\"/&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html29();
     
    @Template("@UiField TagsInput categoryTagsInput;\\n \\n categoryTagsInput.setTagClass(new TagClassCallback&lt;String&gt;() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic String getTagClass(String item) {\\n \\s\\s\\s\\s\\s\\s\\s\\sswitch(item) {\\n \\s\\s\\s\\s\\s\\s\\s\\scase \"Belgrade\": return \"label label-primary\";\\n \\s\\s\\s\\s\\s\\s\\s\\scase \"Amsterdam\": return \"label label-danger label-important\";\\n \\s\\s\\s\\s\\s\\s\\s\\scase \"Washington\": return \"label label-success\";\\n \\s\\s\\s\\s\\s\\s\\s\\scase \"Sydney\": return \"label label-default\";\\n \\s\\s\\s\\s\\s\\s\\s\\scase \"Beijing\": return \"label label-warning\";\\n \\s\\s\\s\\s\\s\\s\\s\\scase \"Cairo\": return \"label label-info\";\\n \\s\\s\\s\\s\\s\\s\\s\\sdefault: return \"label label-info\";\\n \\s\\s\\s\\s\\s\\s\\s\\s}\\n \\s\\s\\s\\s}\\n });\\n categoryTagsInput.reconfigure();\\n")
    org.gwtproject.safehtml.shared.SafeHtml html30();
     
  }

  Template template = new TagsInputView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.TagsInputView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.TagsInputView owner;


    public Widgets(final org.treblereel.mvp.view.extras.TagsInputView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 6
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 6
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
      return template.html19(get_domId0());
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
    org.gwtproject.safehtml.shared.SafeHtml template_html27() {
      return template.html27();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html28() {
      return template.html28();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html29() {
      return template.html29();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html30() {
      return template.html30();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.TagsInputView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.TagsInputView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.TagsInputView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.TagsInputView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.TagsInputView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.TagsInputView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.TagsInputView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel19());
      f_Column2.add(get_f_Panel28());
      f_Column2.add(get_f_Panel39());
      f_Column2.add(get_f_Panel47());
      f_Column2.add(get_f_Panel65());

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
      f_PageHeader3.setText("Tags Input");

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
      f_Anchor6.setHref("https://github.com/bootstrap-tagsinput/bootstrap-tagsinput");
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
      f_BlockQuote9.add(get_f_Paragraph17());
      f_BlockQuote9.add(get_f_PrettyPre18());
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
     * Getter for f_Paragraph17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph17() {
      return build_f_Paragraph17();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph17 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html10().asString());
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
      f_PrettyPre18.setHTML(template_html11().asString());
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
      f_Panel19.add(get_f_PanelFooter23());

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
      f_Heading21.setText("Markup");

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
      f_PanelBody22.add(get_markupTagsInput());

      return f_PanelBody22;
    }

    /**
     * Getter for markupTagsInput called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput get_markupTagsInput() {
      return build_markupTagsInput();
    }
    private org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput build_markupTagsInput() {
      // Creation section.
      final org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput markupTagsInput = new org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput();
      // Setup section.
      markupTagsInput.setValue("Belgrade,Amsterdam,Washington");

      this.owner.markupTagsInput = markupTagsInput;

      return markupTagsInput;
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
      f_PanelFooter23.add(get_f_Heading24());
      f_PanelFooter23.add(get_f_PrettyPre25());
      f_PanelFooter23.add(get_f_Heading26());
      f_PanelFooter23.add(get_f_PrettyPre27());

      return f_PanelFooter23;
    }

    /**
     * Getter for f_Heading24 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading24() {
      return build_f_Heading24();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading24 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading24.setText("UiBinder");

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
      f_PrettyPre25.setHTML(template_html12().asString());
      f_PrettyPre25.addStyleName("lang-xml");

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
      final org.gwtbootstrap3.client.ui.Heading f_Heading26 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading26.setText("Java code");

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
      f_PrettyPre27.setHTML(template_html13().asString());
      f_PrettyPre27.addStyleName("lang-java");

      return f_PrettyPre27;
    }

    /**
     * Getter for f_Panel28 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel28() {
      return build_f_Panel28();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel28 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel28.add(get_f_PanelHeader29());
      f_Panel28.add(get_f_PanelBody33());
      f_Panel28.add(get_f_PanelFooter34());

      return f_Panel28;
    }

    /**
     * Getter for f_PanelHeader29 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader29() {
      return build_f_PanelHeader29();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader29 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader29.add(get_f_Heading30());
      f_PanelHeader29.add(get_f_Paragraph31());
      f_PanelHeader29.add(get_f_Paragraph32());

      return f_PanelHeader29;
    }

    /**
     * Getter for f_Heading30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading30() {
      return build_f_Heading30();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading30 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading30.setText("True multi value");

      return f_Heading30;
    }

    /**
     * Getter for f_Paragraph31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph31() {
      return build_f_Paragraph31();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph31 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html14().asString());
      // Setup section.

      return f_Paragraph31;
    }

    /**
     * Getter for f_Paragraph32 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph32() {
      return build_f_Paragraph32();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph32 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html15().asString());
      // Setup section.

      return f_Paragraph32;
    }

    /**
     * Getter for f_PanelBody33 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody33() {
      return build_f_PanelBody33();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody33 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody33.add(get_multiValueTagsInput());

      return f_PanelBody33;
    }

    /**
     * Getter for multiValueTagsInput called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.tagsinput.client.ui.MVTagsInput get_multiValueTagsInput() {
      return build_multiValueTagsInput();
    }
    private org.gwtbootstrap3.extras.tagsinput.client.ui.MVTagsInput build_multiValueTagsInput() {
      // Creation section.
      final org.gwtbootstrap3.extras.tagsinput.client.ui.MVTagsInput multiValueTagsInput = new org.gwtbootstrap3.extras.tagsinput.client.ui.MVTagsInput();
      // Setup section.
      multiValueTagsInput.setValue("Belgrade,Amsterdam,Washington");

      this.owner.multiValueTagsInput = multiValueTagsInput;

      return multiValueTagsInput;
    }

    /**
     * Getter for f_PanelFooter34 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter34() {
      return build_f_PanelFooter34();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter34 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter34.add(get_f_Heading35());
      f_PanelFooter34.add(get_f_PrettyPre36());
      f_PanelFooter34.add(get_f_Heading37());
      f_PanelFooter34.add(get_f_PrettyPre38());

      return f_PanelFooter34;
    }

    /**
     * Getter for f_Heading35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading35() {
      return build_f_Heading35();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading35 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading35.setText("UiBinder");

      return f_Heading35;
    }

    /**
     * Getter for f_PrettyPre36 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre36() {
      return build_f_PrettyPre36();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre36() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre36 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre36.setHTML(template_html16().asString());
      f_PrettyPre36.addStyleName("lang-xml");

      return f_PrettyPre36;
    }

    /**
     * Getter for f_Heading37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading37() {
      return build_f_Heading37();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading37 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading37.setText("Java code");

      return f_Heading37;
    }

    /**
     * Getter for f_PrettyPre38 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre38() {
      return build_f_PrettyPre38();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre38() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre38 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre38.setHTML(template_html17().asString());
      f_PrettyPre38.addStyleName("lang-java");

      return f_PrettyPre38;
    }

    /**
     * Getter for f_Panel39 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel39() {
      return build_f_Panel39();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel39() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel39 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel39.add(get_f_PanelHeader40());
      f_Panel39.add(get_f_PanelBody44());
      f_Panel39.add(get_f_PanelFooter45());

      return f_Panel39;
    }

    /**
     * Getter for f_PanelHeader40 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader40() {
      return build_f_PanelHeader40();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader40() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader40 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader40.add(get_f_Heading41());
      f_PanelHeader40.add(get_f_Paragraph42());

      return f_PanelHeader40;
    }

    /**
     * Getter for f_Heading41 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading41() {
      return build_f_Heading41();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading41() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading41 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading41.setText("Typeahead");

      return f_Heading41;
    }

    /**
     * Getter for f_Paragraph42 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph42() {
      return build_f_Paragraph42();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph42() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph42 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html19().asString());
      // Setup section.

      {
        // Attach section.
        org.gwtproject.uibinder.client.UiBinderUtil.TempAttachment __attachRecord__ = org.gwtproject.uibinder.client.UiBinderUtil.attachToDom(f_Paragraph42.getElement());

        get_domId0Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_Paragraph42.addAndReplaceElement(get_f_Anchor43(), get_domId0Element().get());

      return f_Paragraph42;
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
     * Getter for f_Anchor43 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor43() {
      return build_f_Anchor43();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor43() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor43 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor43.setHTML(template_html18().asString());
      f_Anchor43.setHref("http://127.0.0.1:8888/GwtBootstrap3Demo.html#typeahead");

      return f_Anchor43;
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
     * Getter for f_PanelBody44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody44() {
      return build_f_PanelBody44();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody44 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody44.add(get_typeaheadTagsInput());

      return f_PanelBody44;
    }

    /**
     * Getter for typeaheadTagsInput called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput get_typeaheadTagsInput() {
      return build_typeaheadTagsInput();
    }
    private org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput build_typeaheadTagsInput() {
      // Creation section.
      final org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput typeaheadTagsInput = new org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput();
      // Setup section.

      this.owner.typeaheadTagsInput = typeaheadTagsInput;

      return typeaheadTagsInput;
    }

    /**
     * Getter for f_PanelFooter45 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter45() {
      return build_f_PanelFooter45();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter45() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter45 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter45.add(get_f_PrettyPre46());

      return f_PanelFooter45;
    }

    /**
     * Getter for f_PrettyPre46 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre46() {
      return build_f_PrettyPre46();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre46() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre46 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre46.setHTML(template_html20().asString());
      f_PrettyPre46.addStyleName("lang-java");

      return f_PrettyPre46;
    }

    /**
     * Getter for f_Panel47 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel47() {
      return build_f_Panel47();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel47() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel47 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel47.add(get_f_PanelHeader48());
      f_Panel47.add(get_f_PanelBody53());
      f_Panel47.add(get_f_PanelFooter54());

      return f_Panel47;
    }

    /**
     * Getter for f_PanelHeader48 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader48() {
      return build_f_PanelHeader48();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader48() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader48 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader48.add(get_f_Heading49());
      f_PanelHeader48.add(get_f_Paragraph50());
      f_PanelHeader48.add(get_f_Paragraph51());
      f_PanelHeader48.add(get_f_Paragraph52());

      return f_PanelHeader48;
    }

    /**
     * Getter for f_Heading49 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading49() {
      return build_f_Heading49();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading49 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading49.setText("Objects as tags");

      return f_Heading49;
    }

    /**
     * Getter for f_Paragraph50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph50() {
      return build_f_Paragraph50();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph50() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph50 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html21().asString());
      // Setup section.

      return f_Paragraph50;
    }

    /**
     * Getter for f_Paragraph51 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph51() {
      return build_f_Paragraph51();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph51 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html22().asString());
      // Setup section.

      return f_Paragraph51;
    }

    /**
     * Getter for f_Paragraph52 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph52() {
      return build_f_Paragraph52();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph52 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html23().asString());
      // Setup section.

      return f_Paragraph52;
    }

    /**
     * Getter for f_PanelBody53 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody53() {
      return build_f_PanelBody53();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody53 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody53.add(get_joTagsInput());

      return f_PanelBody53;
    }

    /**
     * Getter for joTagsInput called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.tagsinput.client.ui.base.SingleValueTagsInput get_joTagsInput() {
      return build_joTagsInput();
    }
    private org.gwtbootstrap3.extras.tagsinput.client.ui.base.SingleValueTagsInput build_joTagsInput() {
      // Creation section.
      final org.gwtbootstrap3.extras.tagsinput.client.ui.base.SingleValueTagsInput joTagsInput = new org.gwtbootstrap3.extras.tagsinput.client.ui.base.SingleValueTagsInput();
      // Setup section.

      this.owner.joTagsInput = joTagsInput;

      return joTagsInput;
    }

    /**
     * Getter for f_PanelFooter54 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter54() {
      return build_f_PanelFooter54();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter54 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter54.add(get_f_Heading55());
      f_PanelFooter54.add(get_f_PrettyPre56());
      f_PanelFooter54.add(get_f_Heading57());
      f_PanelFooter54.add(get_f_Paragraph58());
      f_PanelFooter54.add(get_f_Heading59());
      f_PanelFooter54.add(get_f_PrettyPre60());
      f_PanelFooter54.add(get_f_Heading61());
      f_PanelFooter54.add(get_f_PrettyPre62());
      f_PanelFooter54.add(get_f_Heading63());
      f_PanelFooter54.add(get_f_PrettyPre64());

      return f_PanelFooter54;
    }

    /**
     * Getter for f_Heading55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading55() {
      return build_f_Heading55();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading55 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading55.setText("UiBinder");

      return f_Heading55;
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
      f_PrettyPre56.setHTML(template_html24().asString());
      f_PrettyPre56.addStyleName("lang-xml");

      return f_PrettyPre56;
    }

    /**
     * Getter for f_Heading57 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading57() {
      return build_f_Heading57();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading57() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading57 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading57.setText("Java code");

      return f_Heading57;
    }

    /**
     * Getter for f_Paragraph58 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph58() {
      return build_f_Paragraph58();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph58() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph58 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html25().asString());
      // Setup section.

      return f_Paragraph58;
    }

    /**
     * Getter for f_Heading59 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading59() {
      return build_f_Heading59();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading59() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading59 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading59.setText("Setting callbacks");

      return f_Heading59;
    }

    /**
     * Getter for f_PrettyPre60 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre60() {
      return build_f_PrettyPre60();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre60() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre60 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre60.setHTML(template_html26().asString());
      f_PrettyPre60.addStyleName("lang-java");

      return f_PrettyPre60;
    }

    /**
     * Getter for f_Heading61 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading61() {
      return build_f_Heading61();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading61 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading61.setText("Adding objects as tags");

      return f_Heading61;
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
      f_PrettyPre62.setHTML(template_html27().asString());
      f_PrettyPre62.addStyleName("lang-java");

      return f_PrettyPre62;
    }

    /**
     * Getter for f_Heading63 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading63() {
      return build_f_Heading63();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading63() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading63 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H5);
      // Setup section.
      f_Heading63.setText("Adding objects as suggestions");

      return f_Heading63;
    }

    /**
     * Getter for f_PrettyPre64 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre64() {
      return build_f_PrettyPre64();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre64() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre64 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre64.setHTML(template_html28().asString());
      f_PrettyPre64.addStyleName("lang-java");

      return f_PrettyPre64;
    }

    /**
     * Getter for f_Panel65 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel65() {
      return build_f_Panel65();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel65() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel65 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel65.add(get_f_PanelHeader66());
      f_Panel65.add(get_f_PanelBody68());
      f_Panel65.add(get_f_PanelFooter69());

      return f_Panel65;
    }

    /**
     * Getter for f_PanelHeader66 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader66() {
      return build_f_PanelHeader66();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader66 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader66.add(get_f_Heading67());

      return f_PanelHeader66;
    }

    /**
     * Getter for f_Heading67 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading67() {
      return build_f_Heading67();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading67() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading67 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading67.setText("Categorizing tags");

      return f_Heading67;
    }

    /**
     * Getter for f_PanelBody68 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody68() {
      return build_f_PanelBody68();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody68() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody68 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody68.add(get_categoryTagsInput());

      return f_PanelBody68;
    }

    /**
     * Getter for categoryTagsInput called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput get_categoryTagsInput() {
      return build_categoryTagsInput();
    }
    private org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput build_categoryTagsInput() {
      // Creation section.
      final org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput categoryTagsInput = new org.gwtbootstrap3.extras.tagsinput.client.ui.TagsInput();
      // Setup section.
      categoryTagsInput.setValue("Belgrade,Amsterdam,Washington");

      this.owner.categoryTagsInput = categoryTagsInput;

      return categoryTagsInput;
    }

    /**
     * Getter for f_PanelFooter69 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter69() {
      return build_f_PanelFooter69();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter69() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter69 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter69.add(get_f_Heading70());
      f_PanelFooter69.add(get_f_PrettyPre71());
      f_PanelFooter69.add(get_f_Heading72());
      f_PanelFooter69.add(get_f_PrettyPre73());

      return f_PanelFooter69;
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
      f_Heading70.setText("UiBinder");

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
      f_PrettyPre71.setHTML(template_html29().asString());
      f_PrettyPre71.addStyleName("lang-xml");

      return f_PrettyPre71;
    }

    /**
     * Getter for f_Heading72 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading72() {
      return build_f_Heading72();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading72() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading72 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading72.setText("Java code");

      return f_Heading72;
    }

    /**
     * Getter for f_PrettyPre73 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre73() {
      return build_f_PrettyPre73();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre73() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre73 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre73.setHTML(template_html30().asString());
      f_PrettyPre73.addStyleName("lang-java");

      return f_PrettyPre73;
    }
  }
}
