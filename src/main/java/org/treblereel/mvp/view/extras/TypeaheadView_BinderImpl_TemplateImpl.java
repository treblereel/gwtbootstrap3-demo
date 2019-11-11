package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl.Template, do not edit manually
 */
public class TypeaheadView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.TypeaheadView_BinderImpl.Template {
  
  /**
   * @Template("Original Library Link:")
   */
  public org.gwtproject.safehtml.shared.SafeHtml html1(
  ) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Original Library Link:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Twitter typeahead.js")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Twitter typeahead.js");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Current Version Supported: 0.10.5")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Current Version Supported: 0.10.5");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To use Twitter typeahead.js, you must first add the extras module to your project. In Maven:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To use Twitter typeahead.js, you must first add the extras module to your project. In Maven:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html5(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html6(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.typeahead.Typeahead\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.typeahead.Typeahead\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it select):")
 */
public org.gwtproject.safehtml.shared.SafeHtml html8(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Last but not least must add this namespace to your *.ui.xml (don't have to name it select):");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("xmlns:typeahead=\"urn:import:org.gwtbootstrap3.extras.typeahead.client.ui\"")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("xmlns:typeahead=\"urn:import:org.gwtbootstrap3.extras.typeahead.client.ui\"");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("final List&lt;Person&gt; persons = new ArrayList&lt;Person&gt;();\\n persons.add(new Person(\"Bill\", 50));\\n persons.add(new Person(\"Bob\", 38));\\n persons.add(new Person(\"Bobak\", 24));\\n persons.add(new Person(\"Dawton\", 27));\\n persons.add(new Person(\"Dinkelstein\", 66));\\n persons.add(new Person(\"Eumon\", 13));\\n persons.add(new Person(\"Gene\", 42));\\n persons.add(new Person(\"Gus\", 31));\\n persons.add(new Person(\"Jebediah\", 57));\\n persons.add(new Person(\"Kirrim\", 73));\\n persons.add(new Person(\"Linus\", 103));\\n persons.add(new Person(\"Mortimer\", 7));\\n persons.add(new Person(\"Walt\", 15));\\n persons.add(new Person(\"Wernher\", 52));\\n \\n List&lt;String&gt; names = new ArrayList&lt;String&gt;();\\n for (Person person : persons) {\\n \\s\\snames.add(person.name);\\n }\\n \\n StringDataset dataset = new StringDataset(data);\\n Typeahead&lt;String&gt; typeahead = new Typeahead&lt;String&gt;(dataset);\\n typeahead.setPlaceholder(\"Enter a name\");\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("final List&lt;Person&gt; persons = new ArrayList&lt;Person&gt;();\\n persons.add(new Person(\"Bill\", 50));\\n persons.add(new Person(\"Bob\", 38));\\n persons.add(new Person(\"Bobak\", 24));\\n persons.add(new Person(\"Dawton\", 27));\\n persons.add(new Person(\"Dinkelstein\", 66));\\n persons.add(new Person(\"Eumon\", 13));\\n persons.add(new Person(\"Gene\", 42));\\n persons.add(new Person(\"Gus\", 31));\\n persons.add(new Person(\"Jebediah\", 57));\\n persons.add(new Person(\"Kirrim\", 73));\\n persons.add(new Person(\"Linus\", 103));\\n persons.add(new Person(\"Mortimer\", 7));\\n persons.add(new Person(\"Walt\", 15));\\n persons.add(new Person(\"Wernher\", 52));\\n \\n List&lt;String&gt; names = new ArrayList&lt;String&gt;();\\n for (Person person : persons) {\\n \\s\\snames.add(person.name);\\n }\\n \\n StringDataset dataset = new StringDataset(data);\\n Typeahead&lt;String&gt; typeahead = new Typeahead&lt;String&gt;(dataset);\\n typeahead.setPlaceholder(\"Enter a name\");\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Typeahead&lt;Person&gt; typeahead = new Typeahead&lt;Person&gt;(new Dataset&lt;Person&gt;() {\\n \\s\\s@Override\\n \\s\\spublic void findMatches(String query, SuggestionCallback&lt;Person&gt; callback) {\\n \\s\\s\\s\\sList&lt;Suggestion&lt;Person&gt;&gt; suggestions = new ArrayList&lt;Suggestion&lt;Person&gt;&gt;();\\n \\s\\s\\s\\sString queryLower = query.toLowerCase();\\n \\s\\s\\s\\sfor (Person person : persons) {\\n \\s\\s\\s\\s\\s\\sString name = person.getName();\\n \\s\\s\\s\\s\\s\\sif (name.toLowerCase().contains(queryLower)) {\\n \\s\\s\\s\\s\\s\\s\\s\\sSuggestion&lt;Person&gt; s = Suggestion.create(name, person, this);\\n \\s\\s\\s\\s\\s\\s\\s\\ssuggestions.add(s);\\n \\s\\s\\s\\s\\s\\s}\\n \\s\\s\\s\\s}\\n \\s\\s\\s\\scallback.execute(suggestions);\\n \\s\\s}\\n });\\n typeahead.setPlaceholder(\"Enter a name\");\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Typeahead&lt;Person&gt; typeahead = new Typeahead&lt;Person&gt;(new Dataset&lt;Person&gt;() {\\n \\s\\s@Override\\n \\s\\spublic void findMatches(String query, SuggestionCallback&lt;Person&gt; callback) {\\n \\s\\s\\s\\sList&lt;Suggestion&lt;Person&gt;&gt; suggestions = new ArrayList&lt;Suggestion&lt;Person&gt;&gt;();\\n \\s\\s\\s\\sString queryLower = query.toLowerCase();\\n \\s\\s\\s\\sfor (Person person : persons) {\\n \\s\\s\\s\\s\\s\\sString name = person.getName();\\n \\s\\s\\s\\s\\s\\sif (name.toLowerCase().contains(queryLower)) {\\n \\s\\s\\s\\s\\s\\s\\s\\sSuggestion&lt;Person&gt; s = Suggestion.create(name, person, this);\\n \\s\\s\\s\\s\\s\\s\\s\\ssuggestions.add(s);\\n \\s\\s\\s\\s\\s\\s}\\n \\s\\s\\s\\s}\\n \\s\\s\\s\\scallback.execute(suggestions);\\n \\s\\s}\\n });\\n typeahead.setPlaceholder(\"Enter a name\");\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("CollectionDataset&lt;Person&gt; dataset = new CollectionDataset&lt;Person&gt;(persons);\\n dataset.setSuggestionTemplate(new SuggestionTemplate&lt;Person&gt;() {\\n \\s\\s@Override\\n \\s\\spublic String render(Suggestion&lt;Person&gt; suggestion) {\\n \\s\\s\\s\\sPerson person = suggestion.getData();\\n \\s\\s\\s\\sreturn \"&lt;strong&gt;\" + person.name + \"&lt;/strong&gt; - \" + person.age + \" years\")\\n \\s\\s}\\n });\\n dataset.setEmptyTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;div style=\\\"color:red;padding:6px 12px\\\"&gt;&lt;strong&gt;Empty, no matches!&lt;/strong&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n dataset.setHeaderTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;span style=\\\"padding:6px 12px\\\"&gt;&lt;i&gt;Header&lt;/i&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n dataset.setFooterTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;span style=\\\"padding:6px 12px\\\"&gt;&lt;i&gt;Footer&lt;/i&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n typeahead = new Typeahead&lt;Person&gt;(dataset);\\n typeahead.setPlaceholder(\"Enter a name\");\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html12(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("CollectionDataset&lt;Person&gt; dataset = new CollectionDataset&lt;Person&gt;(persons);\\n dataset.setSuggestionTemplate(new SuggestionTemplate&lt;Person&gt;() {\\n \\s\\s@Override\\n \\s\\spublic String render(Suggestion&lt;Person&gt; suggestion) {\\n \\s\\s\\s\\sPerson person = suggestion.getData();\\n \\s\\s\\s\\sreturn \"&lt;strong&gt;\" + person.name + \"&lt;/strong&gt; - \" + person.age + \" years\")\\n \\s\\s}\\n });\\n dataset.setEmptyTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;div style=\\\"color:red;padding:6px 12px\\\"&gt;&lt;strong&gt;Empty, no matches!&lt;/strong&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n dataset.setHeaderTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;span style=\\\"padding:6px 12px\\\"&gt;&lt;i&gt;Header&lt;/i&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n dataset.setFooterTemplate(new Template() {\\n \\s\\s@Override\\n \\s\\spublic String render() {\\n \\s\\s\\s\\sreturn \"&lt;span style=\\\"padding:6px 12px\\\"&gt;&lt;i&gt;Footer&lt;/i&gt;&lt;/div&gt;\";\\n \\s\\s}\\n });\\n typeahead = new Typeahead&lt;Person&gt;(dataset);\\n typeahead.setPlaceholder(\"Enter a name\");\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
