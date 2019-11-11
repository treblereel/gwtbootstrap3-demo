package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl.Template, do not edit manually
 */
public class BootboxJSView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.BootboxJSView_BinderImpl.Template {
  
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
 * @Template("Bootbox.js")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Bootbox.js");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Current Version Supported: 4.4.0")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Current Version Supported: 4.4.0");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To use Bootbox, you must first add the extras module to your project. In Maven:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To use Bootbox, you must first add the extras module to your project. In Maven:");
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
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.bootbox.Bootbox\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.bootbox.Bootbox\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Then, you can call static method from Bootbox class in GWT client code:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html8(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Then, you can call static method from Bootbox class in GWT client code:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Bootbox.alert(\"Message\");")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Bootbox.alert(\"Message\");");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Select Default Locale:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Select Default Locale:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"localeBox\")\\n void onChangeLanguage(final ChangeEvent event) {\\n \\s\\sString locale = localeBox.getSelectedValue();\\n \\s\\sBootbox.setLocale(BootboxLocale.valueOf(locale));\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"localeBox\")\\n void onChangeLanguage(final ChangeEvent event) {\\n \\s\\sString locale = localeBox.getSelectedValue();\\n \\s\\sBootbox.setLocale(BootboxLocale.valueOf(locale));\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("// Alert\\n @UiHandler(\"alertButton\")\\n void handleAlertButton(ClickEvent event) {\\n \\s\\sBootbox.alert(\"Hello World\");\\n }\\n\\n // Alert With Callback\\n @UiHandler(\"alertCallbackButton\")\\n void handleAlertCallbackButton(ClickEvent event) {\\n \\s\\sBootbox.alert(\"Alert With Callback\", new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Alert Callback\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Alert With Options\\n @UiHandler(\"alertOptionsButton\")\\n void handleAlertOptionsButton(ClickEvent event) {\\n \\s\\sAlertOptions options = AlertOptions.newOptions(\"Alert With Options\");\\n \\s\\soptions.setSize(BootboxSize.LARGE);\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"My Custom Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\sBootbox.alert(options);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html12(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("// Alert\\n @UiHandler(\"alertButton\")\\n void handleAlertButton(ClickEvent event) {\\n \\s\\sBootbox.alert(\"Hello World\");\\n }\\n\\n // Alert With Callback\\n @UiHandler(\"alertCallbackButton\")\\n void handleAlertCallbackButton(ClickEvent event) {\\n \\s\\sBootbox.alert(\"Alert With Callback\", new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Alert Callback\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Alert With Options\\n @UiHandler(\"alertOptionsButton\")\\n void handleAlertOptionsButton(ClickEvent event) {\\n \\s\\sAlertOptions options = AlertOptions.newOptions(\"Alert With Options\");\\n \\s\\soptions.setSize(BootboxSize.LARGE);\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"My Custom Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\sBootbox.alert(options);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"confirmButton\")\\n void handleConfirmButton(ClickEvent event) {\\n \\s\\sBootbox.confirm(\"Hello World\", new ConfirmCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Confirm With Options\\n @UiHandler(\"confirmOptionsButton\")\\n void handleConfirmOptionsButton(ClickEvent event) {\\n \\s\\sConfirmOptions options = ConfirmOptions.newOptions(\"Confirm With Options\");\\n \\s\\soptions.setSize(BootboxSize.SMALL);\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"Custom Confirm Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\soptions.setCallback(new ConfirmCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(final boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\sBootbox.confirm(options);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html13(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"confirmButton\")\\n void handleConfirmButton(ClickEvent event) {\\n \\s\\sBootbox.confirm(\"Hello World\", new ConfirmCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Confirm With Options\\n @UiHandler(\"confirmOptionsButton\")\\n void handleConfirmOptionsButton(ClickEvent event) {\\n \\s\\sConfirmOptions options = ConfirmOptions.newOptions(\"Confirm With Options\");\\n \\s\\soptions.setSize(BootboxSize.SMALL);\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"Custom Confirm Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\soptions.setCallback(new ConfirmCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(final boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\sBootbox.confirm(options);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sBootbox.prompt(\"Hello World\", new PromptCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(String result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Prompt With Options\\n @UiHandler(\"promptOptionsButton\")\\n void handlePromptOptionsButton(ClickEvent event) {\\n \\s\\sPromptOptions options = PromptOptions.newOptions(\"Prompt With Options\");\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"Custom Confirm Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\soptions.setCallback(new PromptCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(final boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\sBootbox.prompt(options);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html14(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sBootbox.prompt(\"Hello World\", new PromptCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(String result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n }\\n\\n // Prompt With Options\\n @UiHandler(\"promptOptionsButton\")\\n void handlePromptOptionsButton(ClickEvent event) {\\n \\s\\sPromptOptions options = PromptOptions.newOptions(\"Prompt With Options\");\\n \\s\\soptions.setAnimate(false);\\n \\s\\soptions.setBackdrop(false);\\n \\s\\soptions.setTitle(\"Custom Confirm Title\");\\n \\s\\soptions.setCloseButton(false);\\n \\s\\soptions.setCallback(new PromptCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback(final boolean result) {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Return: \" + result);\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\sBootbox.prompt(options);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"dialogButton\")\\n void handleDialogButton(ClickEvent event) {\\n \\s\\sDialogOptions options = DialogOptions.newOptions(\"I am a custom dialog\");\\n \\s\\soptions.setTitle(\"Custom title\");\\n \\s\\soptions.setOnEscape(new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"On Escape!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Success!\", ButtonType.SUCCESS.getCssName(), new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Success callback!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Danger!\", ButtonType.DANGER.getCssName(), new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Danger callback!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Click ME!\");\\n \\s\\sBootbox.dialog(options);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html15(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"dialogButton\")\\n void handleDialogButton(ClickEvent event) {\\n \\s\\sDialogOptions options = DialogOptions.newOptions(\"I am a custom dialog\");\\n \\s\\soptions.setTitle(\"Custom title\");\\n \\s\\soptions.setOnEscape(new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"On Escape!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Success!\", ButtonType.SUCCESS.getCssName(), new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Success callback!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Danger!\", ButtonType.DANGER.getCssName(), new SimpleCallback() {\\n \\s\\s\\s\\s@Override\\n \\s\\s\\s\\spublic void callback() {\\n \\s\\s\\s\\s\\s\\sWindow.alert(\"Danger callback!\");\\n \\s\\s\\s\\s}\\n \\s\\s});\\n \\s\\soptions.addButton(\"Click ME!\");\\n \\s\\sBootbox.dialog(options);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
