package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.NotifyView_BinderImpl.Template, do not edit manually
 */
public class NotifyView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.NotifyView_BinderImpl.Template {
  
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
 * @Template("Bootstrap Notify")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Bootstrap Notify");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Current Version Supported: 3.1.3")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Current Version Supported: 3.1.3");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To use Notify, you must first add the extras module to your project. In Maven:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To use Notify, you must first add the extras module to your project. In Maven:");
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
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.notify.Notify\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.notify.Notify\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Then, you can call static method from Notify class in GWT client code:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html8(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Then, you can call static method from Notify class in GWT client code:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Notify.notify(\"Message\");")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Notify.notify(\"Message\");");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotify.notify(\"Message\");\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotify.notify(\"Message\");\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setShowProgressbar(true);\\n \\s\\ssettings.setPauseOnMouseOver(true);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html12(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setShowProgressbar(true);\\n \\s\\ssettings.setPauseOnMouseOver(true);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setType(NotifyType.SUCCESS);\\n \\s\\ssettings.setAllowDismiss(false);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html13(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setType(NotifyType.SUCCESS);\\n \\s\\ssettings.setAllowDismiss(false);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setPlacement(NotifyPlacement.TOP_CENTER);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, \"https://github.com/gwtbootstrap3/gwtbootstrap3\", settings);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html14(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setPlacement(NotifyPlacement.TOP_CENTER);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, \"https://github.com/gwtbootstrap3/gwtbootstrap3\", settings);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("You can set different animation when Notify enters screen and when leaves it. Animation can be disabled by using <i>Animation.NO_ANIMATION</i>.")
 */
public org.gwtproject.safehtml.shared.SafeHtml html15(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("You can set different animation when Notify enters screen and when leaves it. Animation can be disabled by using <i>Animation.NO_ANIMATION</i>.");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setAnimation(Animation.TADA, Animation.LIGHTSPEED_OUT);\\n \\s\\ssettings.setOffset(200, 140);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html16(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setAnimation(Animation.TADA, Animation.LIGHTSPEED_OUT);\\n \\s\\ssettings.setOffset(200, 140);\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O, settings);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("You can set own Notify template by passing valid HTML structure with proper CSS classes. You can set also this template as default for all new opened Notifies.")
 */
public org.gwtproject.safehtml.shared.SafeHtml html17(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("You can set own Notify template by passing valid HTML structure with proper CSS classes. You can set also this template as default for all new opened Notifies.");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setTemplate(\"&lt;div data-notify=\\\"container\\\" class=\\\"alert\\\" role=\\\"alert\\\"&gt;\"+\\n \\s\\s\"&lt;button type=\\\"button\\\" class=\\\"close\\\" data-notify=\\\"dismiss\\\"&gt;\"+\\n \\s\\s\\s\"&lt;span aria-hidden=\\\"true\\\"&gt;×&lt;/span&gt;\"+\\n \\s\\s\\s\"&lt;span class=\\\"sr-only\\\"&gt;Close&lt;/span&gt;\"+\\n \\s\\s\"&lt;/button&gt;\"+\\n \\s\\s\"&lt;span data-notify=\\\"icon\\\"&gt;&lt;/span&gt;\"+\\n \\s\\s\"&lt;b&gt;&lt;span data-notify=\\\"title\\\"&gt;&lt;/span&gt;&lt;/b&gt;\"+\\n \\s\\s\"&lt;span data-notify=\\\"message\\\"&gt;&lt;/span&gt;\"+\\n \\s\\s\"&lt;a href=\\\"#\\\" data-notify=\\\"url\\\"&gt;&lt;/a&gt;\"+\\n \\s\\s\"&lt;/div&gt;\");\\n \\s\\ssettings.makeDefault();\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O);\\n }")
 */
public org.gwtproject.safehtml.shared.SafeHtml html18(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiHandler(\"button\")\\n public void handleButton(ClickEvent event) {\\n \\s\\sNotifySettings settings = NotifySettings.newSettings();\\n \\s\\ssettings.setTemplate(\"&lt;div data-notify=\\\"container\\\" class=\\\"alert\\\" role=\\\"alert\\\"&gt;\"+\\n \\s\\s\"&lt;button type=\\\"button\\\" class=\\\"close\\\" data-notify=\\\"dismiss\\\"&gt;\"+\\n \\s\\s\\s\"&lt;span aria-hidden=\\\"true\\\"&gt;×&lt;/span&gt;\"+\\n \\s\\s\\s\"&lt;span class=\\\"sr-only\\\"&gt;Close&lt;/span&gt;\"+\\n \\s\\s\"&lt;/button&gt;\"+\\n \\s\\s\"&lt;span data-notify=\\\"icon\\\"&gt;&lt;/span&gt;\"+\\n \\s\\s\"&lt;b&gt;&lt;span data-notify=\\\"title\\\"&gt;&lt;/span&gt;&lt;/b&gt;\"+\\n \\s\\s\"&lt;span data-notify=\\\"message\\\"&gt;&lt;/span&gt;\"+\\n \\s\\s\"&lt;a href=\\\"#\\\" data-notify=\\\"url\\\"&gt;&lt;/a&gt;\"+\\n \\s\\s\"&lt;/div&gt;\");\\n \\s\\ssettings.makeDefault();\\n \\s\\sNotify.notify(\"Title\", \"Message\", IconType.SMILE_O);\\n }");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
