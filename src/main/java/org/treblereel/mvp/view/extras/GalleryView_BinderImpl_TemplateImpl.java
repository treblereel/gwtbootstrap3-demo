package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.GalleryView_BinderImpl.Template, do not edit manually
 */
public class GalleryView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.GalleryView_BinderImpl.Template {
  
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
 * @Template("Bootstrap Image Gallery")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Bootstrap Image Gallery");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Current Version Supported: 3.4.2")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Current Version Supported: 3.4.2");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To use Bootstrap Image Gallery, you must first add the extras module to your project. In Maven:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To use Bootstrap Image Gallery, you must first add the extras module to your project. In Maven:");
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
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.gallery.Gallery\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.gallery.Gallery\"/&gt;");
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
 * @Template("xmlns:gallery=\"urn:import:org.gwtbootstrap3.extras.gallery.client.ui\"")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("xmlns:gallery=\"urn:import:org.gwtbootstrap3.extras.gallery.client.ui\"");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;gallery:Gallery ui:field=\"gallery\" thumbnailWidth=\"100px\" thumbnailHeight=\"100px\"&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/582/21830878218_f7e24ec74d_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5707/21832711448_02e33b3b3b_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/567/22011206725_9d0b3dc1ae_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/670/22016240921_6fca2b20ce_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5833/21401954003_27f145bc32_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5686/21997628766_9845a40fdc_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5637/21393309814_17ca189d39_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/660/22018439171_06358ee107_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5799/21837884439_b5cfe23d60_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/616/21833374820_2c2a1ee5a7_b.jpg\" /&gt;\\n &lt;gallery:Gallery/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;gallery:Gallery ui:field=\"gallery\" thumbnailWidth=\"100px\" thumbnailHeight=\"100px\"&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/582/21830878218_f7e24ec74d_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5707/21832711448_02e33b3b3b_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/567/22011206725_9d0b3dc1ae_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/670/22016240921_6fca2b20ce_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5833/21401954003_27f145bc32_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5686/21997628766_9845a40fdc_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5637/21393309814_17ca189d39_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/660/22018439171_06358ee107_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm6.static.flickr.com/5799/21837884439_b5cfe23d60_b.jpg\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/616/21833374820_2c2a1ee5a7_b.jpg\" /&gt;\\n &lt;gallery:Gallery/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiField Gallery gallery;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiField Gallery gallery;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;gallery:Gallery ui:field=\"gallery\" thumbnailWidth=\"100px\" thumbnailHeight=\"100px\"&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Anchor ui:field=\"delete\" icon=\"CLOSE\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage /&gt;\\n \\s\\s\\s\\s...\\n &lt;gallery:Gallery/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html12(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;gallery:Gallery ui:field=\"gallery\" thumbnailWidth=\"100px\" thumbnailHeight=\"100px\"&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage url=\"https://farm1.static.flickr.com/655/21391422043_68c98789bf_b.jpg\"&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:Anchor ui:field=\"delete\" icon=\"CLOSE\" /&gt;\\n \\s\\s\\s\\s&lt;gallery:GalleryImage /&gt;\\n \\s\\s\\s\\s...\\n &lt;gallery:Gallery/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
