package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.AnimateView_BinderImpl.Template, do not edit manually
 */
public class AnimateView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.AnimateView_BinderImpl.Template {
  
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
 * @Template("Animate.css")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Animate.css");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Current Version Supported: 3.5.2")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Current Version Supported: 3.5.2");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To use Animate, you must first add the extras module to your project. In Maven:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To use Animate, you must first add the extras module to your project. In Maven:");
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
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.animate.Animate\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.animate.Animate\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Animations are CSS based. To animate any object, simply add proper style name to it. In java use enum <i>Animation</i> to get available animation`s class names. Animation starts when Widget is attached to the DOM or new (yet unused) class name is added and runs only once.")
 */
public org.gwtproject.safehtml.shared.SafeHtml html8(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Animations are CSS based. To animate any object, simply add proper style name to it. In java use enum <i>Animation</i> to get available animation`s class names. Animation starts when Widget is attached to the DOM or new (yet unused) class name is added and runs only once.");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("<strong>We strongly recommend to use java class <i>Animate</i> to assign animations to your widgets.</strong>")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("<strong>We strongly recommend to use java class <i>Animate</i> to assign animations to your widgets.</strong>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- UiBinder --&gt;\\n &lt;b:Button text=\"Re-play animation\" ui:field=\"button\" icon=\"PLAY\" type=\"PRIMARY\"/&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- UiBinder --&gt;\\n &lt;b:Button text=\"Re-play animation\" ui:field=\"button\" icon=\"PLAY\" type=\"PRIMARY\"/&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Java\\n @UiField(\"button\")\\n Button button;\\n\\n // Assign animation anywhere in code to start it (waits to start if not attached to the DOM)\\n Animate.animate(button, Animation.RUBBER_BAND);\\n\\n @UiHandler(\"button\")\\n public void onClick(ClickEvent event) {\\n \\s\\s// Restart animation on demand (will stop previous animation)\\n \\s\\sAnimate.animate(run, Animation.RUBBER_BAND);\\n }\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Java\\n @UiField(\"button\")\\n Button button;\\n\\n // Assign animation anywhere in code to start it (waits to start if not attached to the DOM)\\n Animate.animate(button, Animation.RUBBER_BAND);\\n\\n @UiHandler(\"button\")\\n public void onClick(ClickEvent event) {\\n \\s\\s// Restart animation on demand (will stop previous animation)\\n \\s\\sAnimate.animate(run, Animation.RUBBER_BAND);\\n }\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("You can use various static methods from <i>Animate</i> class to customize each animation run. Customizable properties are: <i>repeat, duration</i> and <i>delay</i>. You can also pass custom style name as String to run your own animations.")
 */
public org.gwtproject.safehtml.shared.SafeHtml html12(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("You can use various static methods from <i>Animate</i> class to customize each animation run. Customizable properties are: <i>repeat, duration</i> and <i>delay</i>. You can also pass custom style name as String to run your own animations.");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("<strong>Each run of unique combination of animation and it's settings appends new stylesheet to the DOM.</strong> Don't overuse it with too many different configurations.")
 */
public org.gwtproject.safehtml.shared.SafeHtml html13(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("<strong>Each run of unique combination of animation and it's settings appends new stylesheet to the DOM.</strong> Don't overuse it with too many different configurations.");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- UiBinder --&gt;\\n &lt;b:Button ui:field=\"button\" icon=\"PLAY\" text=\"Run animation\" type=\"PRIMARY\"/&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html14(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- UiBinder --&gt;\\n &lt;b:Button ui:field=\"button\" icon=\"PLAY\" text=\"Run animation\" type=\"PRIMARY\"/&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Java\\n @UiField(\"button\")\\n Button button;\\n\\n @UiHandler(\"button\")\\n public void onClick(ClickEvent event) {\\n \\s\\s// Run animation twice and for 4 second\\n \\s\\sAnimate.animate(button, Animation.RUBBER_BAND, 2, 4000);\\n }\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html15(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Java\\n @UiField(\"button\")\\n Button button;\\n\\n @UiHandler(\"button\")\\n public void onClick(ClickEvent event) {\\n \\s\\s// Run animation twice and for 4 second\\n \\s\\sAnimate.animate(button, Animation.RUBBER_BAND, 2, 4000);\\n }\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Each call of <i>Animate.animate(....)</i> returns String value of used class name. To stop animation in the middle just use:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html16(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Each call of <i>Animate.animate(....)</i> returns String value of used class name. To stop animation in the middle just use:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Animate.stopAnimation(button, myAnimationClassName);\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html17(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Animate.stopAnimation(button, myAnimationClassName);\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("<span id='{0}'></span>")
 */
public org.gwtproject.safehtml.shared.SafeHtml html18(
      java.lang.String arg0) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("<span id='");
  sb.append(org.gwtproject.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
  sb.append("'></span>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("You can also remove animation after it ends, to prevent re-play when widget is re-attached to the DOM (e.g. switching pages in some GWT app)")
 */
public org.gwtproject.safehtml.shared.SafeHtml html19(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("You can also remove animation after it ends, to prevent re-play when widget is re-attached to the DOM (e.g. switching pages in some GWT app)");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Animate.removeAnimationOnEnd(button, myAnimationClassName)\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html20(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Animate.removeAnimationOnEnd(button, myAnimationClassName)\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("<span id='{0}'></span>")
 */
public org.gwtproject.safehtml.shared.SafeHtml html21(
      java.lang.String arg0) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("<span id='");
  sb.append(org.gwtproject.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
  sb.append("'></span>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Using <i>Animation.NO_ANIMATION</i> doesn't remove any animations !! It's just helper value, which can be used when some method requires Animation parameter which you don't have / don't want to use.")
 */
public org.gwtproject.safehtml.shared.SafeHtml html22(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Using <i>Animation.NO_ANIMATION</i> doesn't remove any animations !! It's just helper value, which can be used when some method requires Animation parameter which you don't have / don't want to use.");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
