package org.treblereel.mvp.view.components;

/**
 * This class is generated from org.treblereel.mvp.view.components.Badge_BinderImpl.Template, do not edit manually
 */
public class Badge_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.components.Badge_BinderImpl.Template {
  
  /**
   * @Template("<a href='#'>Deleted Items <span id='{0}'></span> </a>")
   */
  public org.gwtproject.safehtml.shared.SafeHtml html1(
        java.lang.String arg0) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<a href='#'>Deleted Items <span id='");
    sb.append(org.gwtproject.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span> </a>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;a href=\"#\"&gt;Deleted Items\\n \\s\\s&lt;b:Badge text=\"...\"/&gt;\\n &lt;/a&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;a href=\"#\"&gt;Deleted Items\\n \\s\\s&lt;b:Badge text=\"...\"/&gt;\\n &lt;/a&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("unread")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("unread");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("<a href='#'>Inbox <span id='{0}'></span> </a>")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
      java.lang.String arg0) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("<a href='#'>Inbox <span id='");
  sb.append(org.gwtproject.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
  sb.append("'></span> </a>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;a href=\"#\"&gt;Inbox\\n \\s\\s&lt;b:Badge&gt;\\n \\s\\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n \\s\\s\\s&lt;b:Icon type=\"ENVELOPE\"/&gt;\\n \\s\\s\\s&lt;b.html:Italic&gt;unread&lt;/b.html:Italic&gt;\\n \\s\\s&lt;/b:Badge&gt;\\n &lt;/a&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html5(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;a href=\"#\"&gt;Inbox\\n \\s\\s&lt;b:Badge&gt;\\n \\s\\s\\s&lt;b.html:Text text=\"...\"/&gt;\\n \\s\\s\\s&lt;b:Icon type=\"ENVELOPE\"/&gt;\\n \\s\\s\\s&lt;b.html:Italic&gt;unread&lt;/b.html:Italic&gt;\\n \\s\\s&lt;/b:Badge&gt;\\n &lt;/a&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
