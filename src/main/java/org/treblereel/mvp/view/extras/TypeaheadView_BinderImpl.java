// Template file: org/treblereel/mvp/view/extras/TypeaheadView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.319")
public class TypeaheadView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.TypeaheadView>, org.treblereel.mvp.view.extras.TypeaheadView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Twitter typeahead.js")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 0.10.5")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Twitter typeahead.js, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.typeahead.Typeahead\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it select):")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("xmlns:typeahead=\"urn:import:org.gwtbootstrap3.extras.typeahead.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("final List&lt;Person&gt; persons = new ArrayList&lt;Person&gt;();\\n persons.add(new Person(\"Bill\", 50));\\n persons.add(new Person(\"Bob\", 38));\\n persons.add(new Person(\"Bobak\", 24));\\n persons.add(new Person(\"Dawton\", 27));\\n persons.add(new Person(\"Dinkelstein\", 66));\\n persons.add(new Person(\"Eumon\", 13));\\n persons.add(new Person(\"Gene\", 42));\\n persons.add(new Person(\"Gus\", 31));\\n persons.add(new Person(\"Jebediah\", 57));\\n persons.add(new Person(\"Kirrim\", 73));\\n persons.add(new Person(\"Linus\", 103));\\n persons.add(new Person(\"Mortimer\", 7));\\n persons.add(new Person(\"Walt\", 15));\\n persons.add(new Person(\"Wernher\", 52));\\n \\n List&lt;String&gt; names = new ArrayList&lt;String&gt;();\\n for (Person person : persons) {\\n \\s\\snames.add(person.name);\\n }\\n \\n StringDataset dataset = new StringDataset(data);\\n Typeahead&lt;String&gt; typeahead = new Typeahead&lt;String&gt;(dataset);\\n typeahead.setPlaceholder(\"Enter a name\");\\n")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("Typeahead&lt;Person&gt; typeahead = new Typeahead&lt;Person&gt;(new Dataset&lt;Person&gt;() {\\n \\s\\s@Override\\n \\s\\spublic void findMatches(String query, SuggestionCallback&lt;Person&gt; callback) {\\n \\s\\s\\s\\sList&lt;Suggestion&lt;Person&gt;&gt; suggestions = new ArrayList&lt;Suggestion&lt;Person&gt;&gt;();\\n \\s\\s\\s\\sString queryLower = query.toLowerCase();\\n \\s\\s\\s\\sfor (Person person : persons) {\\n \\s\\s\\s\\s\\s\\sString name = person.getName();\\n \\s\\s\\s\\s\\s\\sif (name.toLowerCase().contains(queryLower)) {\\n \\s\\s\\s\\s\\s\\s\\s\\sSuggestion&lt;Person&gt; s = Suggestion.create(name, person, this);\\n \\s\\s\\s\\s\\s\\s\\s\\ssuggestions.add(s);\\n \\s\\s\\s\\s\\s\\s}\\n \\s\\s\\s\\s}\\n \\s\\s\\s\\scallback.execute(suggestions);\\n \\s\\s}\\n });\\n typeahead.setPlaceholder(\"Enter a name\");\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("CollectionDataset&lt;Person&gt; dataset = new CollectionDataset&lt;Person&gt;(persons);\\n dataset.setSuggestionTemplate(new SuggestionTemplate&lt;Person&gt;() {\\n \\s\\s@Override\\n \\s\\spublic String render(Suggestion&lt;Person&gt; suggestion) {\\n \\s\\s\\s\\sPerson person = suggestion.getData();\\n \\s\\s\\s\\sreturn \"&lt;strong&gt;\" + person.name + \"&lt;/strong&gt; - \" + person.age + \" years\")\\n \\s\\s}\\n });\\n dataset.setEmptyTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;div style=\\\"color:red;padding:6px 12px\\\"&gt;&lt;strong&gt;Empty, no matches!&lt;/strong&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n dataset.setHeaderTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;span style=\\\"padding:6px 12px\\\"&gt;&lt;i&gt;Header&lt;/i&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n dataset.setFooterTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;span style=\\\"padding:6px 12px\\\"&gt;&lt;i&gt;Footer&lt;/i&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n typeahead = new Typeahead&lt;Person&gt;(dataset);\\n typeahead.setPlaceholder(\"Enter a name\");\\n")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
  }

  Template template = new TypeaheadView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.TypeaheadView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.TypeaheadView owner;


    public Widgets(final org.treblereel.mvp.view.extras.TypeaheadView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel23());
      f_Column2.add(get_f_Panel29());
      f_Column2.add(get_f_Panel33());

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
      f_PageHeader3.setText("Twitter typeahead.js");

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
      f_Anchor6.setHref("https://github.com/twitter/typeahead.js");
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
      f_Panel17.add(get_f_PanelFooter21());

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
      f_Heading19.setText("Static");

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
      f_PanelBody20.add(get_staticTypeahead());

      return f_PanelBody20;
    }

    /**
     * Getter for staticTypeahead called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead get_staticTypeahead() {
      return build_staticTypeahead();
    }
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead build_staticTypeahead() {
      // Creation section.
      final org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead staticTypeahead = owner.staticTypeahead;
      assert staticTypeahead != null : "UiField staticTypeahead with 'provided = true' was null";
      // Setup section.

      return staticTypeahead;
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
      f_PrettyPre22.setHTML(template_html10().asString());
      f_PrettyPre22.addStyleName("lang-java");

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
      f_Panel23.add(get_f_PanelFooter27());

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
      f_Heading25.setText("Async");

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
      f_PanelBody26.add(get_asyncTypeahead());

      return f_PanelBody26;
    }

    /**
     * Getter for asyncTypeahead called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead get_asyncTypeahead() {
      return build_asyncTypeahead();
    }
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead build_asyncTypeahead() {
      // Creation section.
      final org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead asyncTypeahead = owner.asyncTypeahead;
      assert asyncTypeahead != null : "UiField asyncTypeahead with 'provided = true' was null";
      // Setup section.

      return asyncTypeahead;
    }

    /**
     * Getter for f_PanelFooter27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter27() {
      return build_f_PanelFooter27();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter27 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter27.add(get_f_PrettyPre28());

      return f_PanelFooter27;
    }

    /**
     * Getter for f_PrettyPre28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre28() {
      return build_f_PrettyPre28();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre28() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre28 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre28.setHTML(template_html11().asString());
      f_PrettyPre28.addStyleName("lang-java");

      return f_PrettyPre28;
    }

    /**
     * Getter for f_Panel29 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel29() {
      return build_f_Panel29();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel29 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel29.add(get_f_PanelHeader30());
      f_Panel29.add(get_f_PanelBody32());

      return f_Panel29;
    }

    /**
     * Getter for f_PanelHeader30 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader30() {
      return build_f_PanelHeader30();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader30() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader30 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader30.add(get_f_Heading31());

      return f_PanelHeader30;
    }

    /**
     * Getter for f_Heading31 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading31() {
      return build_f_Heading31();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading31 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading31.setText("Highlight");

      return f_Heading31;
    }

    /**
     * Getter for f_PanelBody32 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody32() {
      return build_f_PanelBody32();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody32 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody32.add(get_highlightTypeahead());

      return f_PanelBody32;
    }

    /**
     * Getter for highlightTypeahead called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead get_highlightTypeahead() {
      return build_highlightTypeahead();
    }
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead build_highlightTypeahead() {
      // Creation section.
      final org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead highlightTypeahead = owner.highlightTypeahead;
      assert highlightTypeahead != null : "UiField highlightTypeahead with 'provided = true' was null";
      // Setup section.

      return highlightTypeahead;
    }

    /**
     * Getter for f_Panel33 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel33() {
      return build_f_Panel33();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel33 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel33.add(get_f_PanelHeader34());
      f_Panel33.add(get_f_PanelBody36());
      f_Panel33.add(get_f_PanelFooter37());

      return f_Panel33;
    }

    /**
     * Getter for f_PanelHeader34 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader34() {
      return build_f_PanelHeader34();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader34 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader34.add(get_f_Heading35());

      return f_PanelHeader34;
    }

    /**
     * Getter for f_Heading35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading35() {
      return build_f_Heading35();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading35 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading35.setText("Templates");

      return f_Heading35;
    }

    /**
     * Getter for f_PanelBody36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody36() {
      return build_f_PanelBody36();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody36 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody36.add(get_templateTypeahead());

      return f_PanelBody36;
    }

    /**
     * Getter for templateTypeahead called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead get_templateTypeahead() {
      return build_templateTypeahead();
    }
    private org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead build_templateTypeahead() {
      // Creation section.
      final org.gwtbootstrap3.extras.typeahead.client.ui.Typeahead templateTypeahead = owner.templateTypeahead;
      assert templateTypeahead != null : "UiField templateTypeahead with 'provided = true' was null";
      // Setup section.

      return templateTypeahead;
    }

    /**
     * Getter for f_PanelFooter37 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter37() {
      return build_f_PanelFooter37();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter37() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter37 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter37.add(get_f_PrettyPre38());

      return f_PanelFooter37;
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
      f_PrettyPre38.setHTML(template_html12().asString());
      f_PrettyPre38.addStyleName("lang-java");

      return f_PrettyPre38;
    }
  }
}
