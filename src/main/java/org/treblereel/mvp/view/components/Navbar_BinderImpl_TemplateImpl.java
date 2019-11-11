package org.treblereel.mvp.view.components;

/**
 * This class is generated from org.treblereel.mvp.view.components.Navbar_BinderImpl.Template, do not edit manually
 */
public class Navbar_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.components.Navbar_BinderImpl.Template {
  
  /**
   * @Template("Brand")
   */
  public org.gwtproject.safehtml.shared.SafeHtml html1(
  ) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("Brand");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("John Snow")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("John Snow");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Signed in as <span id='{0}'></span>")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
      java.lang.String arg0) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Signed in as <span id='");
  sb.append(org.gwtproject.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
  sb.append("'></span>");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;b:Navbar&gt;\\n \\s\\s&lt;b:NavbarHeader&gt;\\n \\s\\s\\s\\s&lt;b:NavbarBrand&gt;Brand&lt;/b:NavbarBrand&gt;\\n \\s\\s\\s\\s&lt;b:NavbarCollapseButton dataTarget=\"#navbar-collapse\"/&gt;\\n \\s\\s&lt;/b:NavbarHeader&gt;\\n \\n \\s\\s&lt;b:NavbarCollapse b:id=\"navbar-collapse\"&gt;\\n \\s\\s\\s\\s&lt;b:NavbarNav&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem active=\"true\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n \\n \\s\\s\\s\\s\\s\\s&lt;b:ListDropDown&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorButton dataToggle=\"DROPDOWN\"&gt;Dropdown&lt;/b:AnchorButton&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 3&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;/b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:ListDropDown&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarNav&gt;\\n \\n \\s\\s\\s\\s&lt;b:NavbarForm pull=\"LEFT\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox placeholder=\"Search\" addStyleNames=\"col-lg-8\"/&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarForm&gt;\\n \\n \\s\\s\\s\\s&lt;b:NavbarText pull=\"RIGHT\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b.html:Span&gt;Signed in as\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:NavbarLink&gt;John Snow&lt;/b:NavbarLink&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b.html:Span&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarText&gt;\\n \\s\\s&lt;/b:NavbarCollapse&gt;\\n &lt;/b:Navbar&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;b:Navbar&gt;\\n \\s\\s&lt;b:NavbarHeader&gt;\\n \\s\\s\\s\\s&lt;b:NavbarBrand&gt;Brand&lt;/b:NavbarBrand&gt;\\n \\s\\s\\s\\s&lt;b:NavbarCollapseButton dataTarget=\"#navbar-collapse\"/&gt;\\n \\s\\s&lt;/b:NavbarHeader&gt;\\n \\n \\s\\s&lt;b:NavbarCollapse b:id=\"navbar-collapse\"&gt;\\n \\s\\s\\s\\s&lt;b:NavbarNav&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem active=\"true\"&gt;Item 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Item 3&lt;/b:AnchorListItem&gt;\\n \\n \\s\\s\\s\\s\\s\\s&lt;b:ListDropDown&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorButton dataToggle=\"DROPDOWN\"&gt;Dropdown&lt;/b:AnchorButton&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 1&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 2&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s\\s\\s&lt;b:AnchorListItem&gt;Dropdown 3&lt;/b:AnchorListItem&gt;\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;/b:DropDownMenu&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b:ListDropDown&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarNav&gt;\\n \\n \\s\\s\\s\\s&lt;b:NavbarForm pull=\"LEFT\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b:TextBox placeholder=\"Search\" addStyleNames=\"col-lg-8\"/&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarForm&gt;\\n \\n \\s\\s\\s\\s&lt;b:NavbarText pull=\"RIGHT\"&gt;\\n \\s\\s\\s\\s\\s\\s&lt;b.html:Span&gt;Signed in as\\n \\s\\s\\s\\s\\s\\s\\s\\s&lt;b:NavbarLink&gt;John Snow&lt;/b:NavbarLink&gt;\\n \\s\\s\\s\\s\\s\\s&lt;/b.html:Span&gt;\\n \\s\\s\\s\\s&lt;/b:NavbarText&gt;\\n \\s\\s&lt;/b:NavbarCollapse&gt;\\n &lt;/b:Navbar&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
