package org.treblereel.mvp.view.components;

/**
 * This class is generated from org.treblereel.mvp.view.components.SuggestBox_BinderImpl.Template, do not edit manually
 */
public class SuggestBox_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.components.SuggestBox_BinderImpl.Template {
  
  /**
   * @Template("Country")
   */
  public org.gwtproject.safehtml.shared.SafeHtml html1(
  ) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Country");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Country")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Country");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Form&gt;\\n \\s\\s&lt;b:FieldSet&gt;\\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"country\"&gt;Country&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:SuggestBox b:id=\"country\" ui:field=\"country\" /&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\s\\s&lt;/b:FieldSet&gt;\\n &lt;/b:Form&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Form&gt;\\n \\s\\s&lt;b:FieldSet&gt;\\n \\s\\s\\s\\s&lt;b:FormGroup&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:FormLabel for=\"country\"&gt;Country&lt;/b:FormLabel&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:SuggestBox b:id=\"country\" ui:field=\"country\" /&gt;\\n \\s\\s\\s\\s&lt;/b:FormGroup&gt;\\n \\s\\s&lt;/b:FieldSet&gt;\\n &lt;/b:Form&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiField(provided = true)\\n protected SuggestBox country;\\n\\n @Inject\\n public SuggestBoxView(final Binder uiBinder) {\\n\\n \\s\\sMultiWordSuggestOracle oracle = new MultiWordSuggestOracle();\\n \\s\\soracle.addAll(Arrays.asList(COUNTRIES));\\n \\s\\scountry = new SuggestBox(oracle);\\n\\n \\s\\sinitWidget(uiBinder.createAndBindUi(this));\\n\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiField(provided = true)\\n protected SuggestBox country;\\n\\n @Inject\\n public SuggestBoxView(final Binder uiBinder) {\\n\\n \\s\\sMultiWordSuggestOracle oracle = new MultiWordSuggestOracle();\\n \\s\\soracle.addAll(Arrays.asList(COUNTRIES));\\n \\s\\scountry = new SuggestBox(oracle);\\n\\n \\s\\sinitWidget(uiBinder.createAndBindUi(this));\\n\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template(".dropdown-menu .item {\\n \\s\\spadding: 5px;\\n }\\n\\n .dropdown-menu .item-selected {\\n \\s\\sbackground-color: #eee;\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html5(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append(".dropdown-menu .item {\\n \\s\\spadding: 5px;\\n }\\n\\n .dropdown-menu .item-selected {\\n \\s\\sbackground-color: #eee;\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
