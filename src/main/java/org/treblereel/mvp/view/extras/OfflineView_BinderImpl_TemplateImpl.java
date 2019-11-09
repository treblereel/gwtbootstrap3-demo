package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.OfflineView_BinderImpl.Template, do not edit manually
 */
public class OfflineView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.OfflineView_BinderImpl.Template {
  
  /**
   * @Template("To use Offline, you must first add the extras module to your project. In Maven:")
   */
  public org.gwtproject.safehtml.shared.SafeHtml html1(
  ) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("To use Offline, you must first add the extras module to your project. In Maven:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("<p>Web applications consist of web pages that need to be downloaded from a network and for this to happen there must be a network connection. However there are many instances when users cannot connect to a network due to reasons beyond their control. HTML5 provides the ability to access the web application even without a network connection using the<b>cache manifest</b>. <br> <a href='http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5'> http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5 </a> </p> <p>The entire web application (css, javascript, resources etc) can be downloaded and stored locally so that offline support is possible - in addition this may improve perceived speed of your web application by making all resources instantly available from local storage. </p> <p>Unfortunately, the GWT compiler automatically generates lots of css and javascript files that are different after every compile (the file names are crypto hashed) and so the <b>cache manifest</b> needs to reflect this new set of files each time. </p> <p>The Offline linker performs this task of generating a valid cache manifest every time you compile. </p>")
 */
public org.gwtproject.safehtml.shared.SafeHtml html5(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("<p>Web applications consist of web pages that need to be downloaded from a network and for this to happen there must be a network connection. However there are many instances when users cannot connect to a network due to reasons beyond their control. HTML5 provides the ability to access the web application even without a network connection using the<b>cache manifest</b>. <br> <a href='http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5'> http://en.wikipedia.org/wiki/Cache_manifest_in_HTML5 </a> </p> <p>The entire web application (css, javascript, resources etc) can be downloaded and stored locally so that offline support is possible - in addition this may improve perceived speed of your web application by making all resources instantly available from local storage. </p> <p>Unfortunately, the GWT compiler automatically generates lots of css and javascript files that are different after every compile (the file names are crypto hashed) and so the <b>cache manifest</b> needs to reflect this new set of files each time. </p> <p>The Offline linker performs this task of generating a valid cache manifest every time you compile. </p>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Static resources that are needed (outside of the compile unit) require specific inclusion. These files would typically be index.html, css files or any resources not included within the GWT application. These files are included through the cachemanifest_static_files property added to your module.gwt.xml file.")
 */
public org.gwtproject.safehtml.shared.SafeHtml html6(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Static resources that are needed (outside of the compile unit) require specific inclusion. These files would typically be index.html, css files or any resources not included within the GWT application. These files are included through the cachemanifest_static_files property added to your module.gwt.xml file.");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;extend-configuration-property name=\"cachemanifest_static_files\" value=\"index.html\" /&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;extend-configuration-property name=\"cachemanifest_static_files\" value=\"index.html\" /&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To activate the linker, the following configuration is included in your GWT module definition (module.gwt.xml file) as follows:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html8(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To activate the linker, the following configuration is included in your GWT module definition (module.gwt.xml file) as follows:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;\\n &lt;add-linker name=\"offline\" /&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.cachemanifest.Offline\"/&gt;\\n &lt;add-linker name=\"offline\" /&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Finally, include the cache manifest file within the html page that loads your GWT application, as follows:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Finally, include the cache manifest file within the html page that loads your GWT application, as follows:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!doctype html&gt;\\n &lt;html manifest=\"&lt;modulename&gt;/appcache.manifest\"&gt;\\n ....\\n &lt;/html&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!doctype html&gt;\\n &lt;html manifest=\"&lt;modulename&gt;/appcache.manifest\"&gt;\\n ....\\n &lt;/html&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
