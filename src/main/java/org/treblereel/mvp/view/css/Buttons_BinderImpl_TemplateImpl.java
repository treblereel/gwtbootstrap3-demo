package org.treblereel.mvp.view.css;

/**
 * This class is generated from org.treblereel.mvp.view.css.Buttons_BinderImpl.Template, do not edit manually
 */
public class Buttons_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.css.Buttons_BinderImpl.Template {
  
  /**
   * @Template("&lt;b:Button type=\"DEFAULT\"/&gt;\\n &lt;b:Button type=\"PRIMARY\"/&gt;\\n &lt;b:Button type=\"SUCCESS\"/&gt;\\n &lt;b:Button type=\"INFO\"/&gt;\\n &lt;b:Button type=\"WARNING\"/&gt;\\n &lt;b:Button type=\"DANGER\"/&gt;\\n &lt;b:Button type=\"LINK\"/&gt;\\n")
   */
  public org.gwtproject.safehtml.shared.SafeHtml html1(
  ) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("&lt;b:Button type=\"DEFAULT\"/&gt;\\n &lt;b:Button type=\"PRIMARY\"/&gt;\\n &lt;b:Button type=\"SUCCESS\"/&gt;\\n &lt;b:Button type=\"INFO\"/&gt;\\n &lt;b:Button type=\"WARNING\"/&gt;\\n &lt;b:Button type=\"DANGER\"/&gt;\\n &lt;b:Button type=\"LINK\"/&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Button type=\"PRIMARY\" size=\"SMALL\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" size=\"LARGE\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" size=\"EXTRA_SMALL\"/&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Button type=\"PRIMARY\" size=\"SMALL\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" size=\"LARGE\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" size=\"EXTRA_SMALL\"/&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Button type=\"PRIMARY\" enabled=\"true\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" enabled=\"false\"/&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Button type=\"PRIMARY\" enabled=\"true\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" enabled=\"false\"/&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Button type=\"PRIMARY\" icon=\"STAR\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" icon=\"STAR\" iconPosition=\"RIGHT\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" icon=\"STAR\" iconSpin=\"true\" iconBordered=\"true\"/&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Button type=\"PRIMARY\" icon=\"STAR\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" icon=\"STAR\" iconPosition=\"RIGHT\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" icon=\"STAR\" iconSpin=\"true\" iconBordered=\"true\"/&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Button type=\"PRIMARY\" badgeText=\"...\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" badgeText=\"...\" badgePosition=\"LEFT\"/&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html5(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Button type=\"PRIMARY\" badgeText=\"...\"/&gt;\\n &lt;b:Button type=\"PRIMARY\" badgeText=\"...\" badgePosition=\"LEFT\"/&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Button dataToggle=\"BUTTON\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html6(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Button dataToggle=\"BUTTON\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Button ui:field=\"button\" text=\"Click me\" dataLoadingText=\"Loading...\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Button ui:field=\"button\" text=\"Click me\" dataLoadingText=\"Loading...\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void onButtonClick(final ClickEvent event) {\\n \\s\\sbutton.state().loading();\\n \\n \\s\\snew Timer() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void run() {\\n \\s\\s\\s\\s\\s\\sbutton.state().reset();\\n \\s\\s\\s\\s}\\n \\s\\s}.schedule(2000);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html8(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void onButtonClick(final ClickEvent event) {\\n \\s\\sbutton.state().loading();\\n \\n \\s\\snew Timer() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void run() {\\n \\s\\s\\s\\s\\s\\sbutton.state().reset();\\n \\s\\s\\s\\s}\\n \\s\\s}.schedule(2000);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Button text=\"Block level button\" block=\"true\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Button text=\"Block level button\" block=\"true\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
