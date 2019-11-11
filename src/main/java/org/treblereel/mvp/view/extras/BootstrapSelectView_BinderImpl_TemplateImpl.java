package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl.Template, do not edit manually
 */
public class BootstrapSelectView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl.Template {
  
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
 * @Template("Bootstrap Select")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Bootstrap Select");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Current Version Supported: 1.12.4")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Current Version Supported: 1.12.4");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To use Bootstrap Select, you must first add the extras module to your project. In Maven:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To use Bootstrap Select, you must first add the extras module to your project. In Maven:");
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
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.select.Select\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.select.Select\"/&gt;");
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
 * @Template("xmlns:select=\"urn:import:org.gwtbootstrap3.extras.select.client.ui\"")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("xmlns:select=\"urn:import:org.gwtbootstrap3.extras.select.client.ui\"");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Standard select boxes")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Standard select boxes");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Select boxes with optgroups")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Select boxes with optgroups");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Multiple select boxes")
 */
public org.gwtproject.safehtml.shared.SafeHtml html12(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Multiple select boxes");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Standard select boxes --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Select boxes with optgroups --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Multiple select boxes --&gt;\\n &lt;select:MultipleSelect&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html13(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Standard select boxes --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Select boxes with optgroups --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Multiple select boxes --&gt;\\n &lt;select:MultipleSelect&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Add a search input with placeholder --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchPlaceholder=\"Please type something...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Add key words to options to improve their searchability --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchPlaceholder=\"ketchup, mustard, frosting...\"&gt;\\n \\s\\s&lt;select:Option tokens=\"ketchup mustard\" text=\"Hot Dog, Fries and a Soda\"/&gt;\\n \\s\\s&lt;select:Option tokens=\"mustard\" text=\"Burger, Shake and a Smile\"/&gt;\\n \\s\\s&lt;select:Option tokens=\"frosting\" text=\"Sugar, Spice and all things nice\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Enable accent-insensitive search --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchNormalize=\"true\" liveSearchPlaceholder=\"Accent-insensitive search...\"&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dôg, Friés and a Soda\"/&gt;\\n \\s\\s&lt;select:Option text=\"Bûrger, Shakè and à Smîle\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sùgàr, Spiçe ând all thïngs nicé\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Reveal options starting with the searched text --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchStyle=\"STARTS_WITH\" liveSearchPlaceholder=\"Hot, Burger, Sugar...\"&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html14(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Add a search input with placeholder --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchPlaceholder=\"Please type something...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Add key words to options to improve their searchability --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchPlaceholder=\"ketchup, mustard, frosting...\"&gt;\\n \\s\\s&lt;select:Option tokens=\"ketchup mustard\" text=\"Hot Dog, Fries and a Soda\"/&gt;\\n \\s\\s&lt;select:Option tokens=\"mustard\" text=\"Burger, Shake and a Smile\"/&gt;\\n \\s\\s&lt;select:Option tokens=\"frosting\" text=\"Sugar, Spice and all things nice\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Enable accent-insensitive search --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchNormalize=\"true\" liveSearchPlaceholder=\"Accent-insensitive search...\"&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dôg, Friés and a Soda\"/&gt;\\n \\s\\s&lt;select:Option text=\"Bûrger, Shakè and à Smîle\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sùgàr, Spiçe ând all thïngs nicé\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Reveal options starting with the searched text --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchStyle=\"STARTS_WITH\" liveSearchPlaceholder=\"Hot, Burger, Sugar...\"&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Limit the number of options --&gt;\\n &lt;select:MultipleSelect maxOptions=\"2\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- It also works for option groups --&gt;\\n &lt;select:MultipleSelect ui:field=\"maxOptionsSelect\" maxOptions=\"3\"&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\" maxOptions=\"2\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\" maxOptions=\"2\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n &lt;/select:MultipleSelect&gt;\\n\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html15(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Limit the number of options --&gt;\\n &lt;select:MultipleSelect maxOptions=\"2\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- It also works for option groups --&gt;\\n &lt;select:MultipleSelect ui:field=\"maxOptionsSelect\" maxOptions=\"3\"&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\" maxOptions=\"2\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\" maxOptions=\"2\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n &lt;/select:MultipleSelect&gt;\\n\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("// Customize the message displayed when the limit is reached\\n @UiField MultipleSelect maxOptionsSelect;\\n\\n maxOptionsSelect.setMaxOptionsTextHandler(new MaxOptionsTextHandler() {\\n \\s\\s@Override\\n \\s\\spublic String getMaxSelectOptionsText(int maxSelectOptions) {\\n \\s\\s\\s\\s// Or return \"Only {n} options are allowed\";\\n \\s\\s\\s\\sreturn \"Only \" + maxSelectOptions + \" options are allowed\";\\n \\s\\s}\\n \\s\\s@Override\\n \\s\\spublic String getMaxGroupOptionsText(int maxGroupOptions) {\\n \\s\\s\\s\\s// Or return \"No more than {n} options in group\";\\n \\s\\s\\s\\sreturn \"No more than \" + maxGroupOptions + \" options in group\";\\n \\s\\s}\\n });\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html16(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("// Customize the message displayed when the limit is reached\\n @UiField MultipleSelect maxOptionsSelect;\\n\\n maxOptionsSelect.setMaxOptionsTextHandler(new MaxOptionsTextHandler() {\\n \\s\\s@Override\\n \\s\\spublic String getMaxSelectOptionsText(int maxSelectOptions) {\\n \\s\\s\\s\\s// Or return \"Only {n} options are allowed\";\\n \\s\\s\\s\\sreturn \"Only \" + maxSelectOptions + \" options are allowed\";\\n \\s\\s}\\n \\s\\s@Override\\n \\s\\spublic String getMaxGroupOptionsText(int maxGroupOptions) {\\n \\s\\s\\s\\s// Or return \"No more than {n} options in group\";\\n \\s\\s\\s\\sreturn \"No more than \" + maxGroupOptions + \" options in group\";\\n \\s\\s}\\n });\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Set the default placeholder text when nothing is selected --&gt;\\n &lt;select:Select title=\"Choose one of the following...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- It also works for multiple select boxes --&gt;\\n &lt;select:MultipleSelect title=\"Choose one of the following...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html17(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Set the default placeholder text when nothing is selected --&gt;\\n &lt;select:Select title=\"Choose one of the following...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- It also works for multiple select boxes --&gt;\\n &lt;select:MultipleSelect title=\"Choose one of the following...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Set the title attribute on individual options to display alternative text when the option is selected --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\" title=\"Combo 1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\" title=\"Combo 2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\" title=\"Combo 3\"/&gt;\\n &lt;/select:Select&gt;\\n\\n &lt;!-- It also works for multiple select boxes --&gt;\\n &lt;select:MultipleSelect&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\" title=\"Combo 1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\" title=\"Combo 2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\" title=\"Combo 3\"/&gt;\\n &lt;/select:MultipleSelect&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html18(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Set the title attribute on individual options to display alternative text when the option is selected --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\" title=\"Combo 1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\" title=\"Combo 2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\" title=\"Combo 3\"/&gt;\\n &lt;/select:Select&gt;\\n\\n &lt;!-- It also works for multiple select boxes --&gt;\\n &lt;select:MultipleSelect&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\" title=\"Combo 1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\" title=\"Combo 2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\" title=\"Combo 3\"/&gt;\\n &lt;/select:MultipleSelect&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("VALUES")
 */
public org.gwtproject.safehtml.shared.SafeHtml html19(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("VALUES");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("COUNT")
 */
public org.gwtproject.safehtml.shared.SafeHtml html20(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("COUNT");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("STATIC")
 */
public org.gwtproject.safehtml.shared.SafeHtml html21(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("STATIC");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("COUNT &gt; X")
 */
public org.gwtproject.safehtml.shared.SafeHtml html22(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("COUNT &gt; X");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- VALUES: A comma delimited list of selected values (default) --&gt;\\n &lt;!-- COUNT: If one item is selected, then the value is shown, if more than one is selected then the number of selected\\n \\s\\sitems is displayed, eg 2 of 6 selected --&gt;\\n &lt;!-- STATIC: Always show the select title (placeholder), regardless of selection --&gt;\\n &lt;select:MultipleSelect selectedTextFormat=\"VALUES | COUNT | STATIC\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- COUNT &gt; X: Where X is the number of items selected when the display format changes from values to count --&gt;\\n &lt;select:MultipleSelect countSelectedTextFormat=\"2\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html23(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- VALUES: A comma delimited list of selected values (default) --&gt;\\n &lt;!-- COUNT: If one item is selected, then the value is shown, if more than one is selected then the number of selected\\n \\s\\sitems is displayed, eg 2 of 6 selected --&gt;\\n &lt;!-- STATIC: Always show the select title (placeholder), regardless of selection --&gt;\\n &lt;select:MultipleSelect selectedTextFormat=\"VALUES | COUNT | STATIC\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- COUNT &gt; X: Where X is the number of items selected when the display format changes from values to count --&gt;\\n &lt;select:MultipleSelect countSelectedTextFormat=\"2\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Set the button classes --&gt;\\n &lt;select:Select type=\"PRIMARY | INFO | SUCCESS | WARNING | DANGER | DEFAULT\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Or set a custom class name --&gt;\\n &lt;select:Select style=\"btn-default\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html24(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Set the button classes --&gt;\\n &lt;select:Select type=\"PRIMARY | INFO | SUCCESS | WARNING | DANGER | DEFAULT\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Or set a custom class name --&gt;\\n &lt;select:Select style=\"btn-default\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;select:Select showTick=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html25(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;select:Select showTick=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;select:Select showMenuArrow=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html26(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;select:Select showMenuArrow=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option addStyleNames=\"...\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html27(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option addStyleNames=\"...\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- AUTO: The width of the select is automatically adjusted to accommodate the widest option.--&gt;\\n &lt;select:Select selectWidth=\"AUTO\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- FIT: Automatically adjusts the width of the select to the width of its currently selected option. --&gt;\\n &lt;select:Select selectWidth=\"FIT\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- CSS Width: 100px --&gt;\\n &lt;select:Select width=\"100px\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- CSS Width: 75% --&gt;\\n &lt;select:Select width=\"75%\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html28(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- AUTO: The width of the select is automatically adjusted to accommodate the widest option.--&gt;\\n &lt;select:Select selectWidth=\"AUTO\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- FIT: Automatically adjusts the width of the select to the width of its currently selected option. --&gt;\\n &lt;select:Select selectWidth=\"FIT\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- CSS Width: 100px --&gt;\\n &lt;select:Select width=\"100px\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- CSS Width: 75% --&gt;\\n &lt;select:Select width=\"75%\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup icon=\"...\" label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option icon=\"...\" text=\"...\"/&gt;\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html29(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup icon=\"...\" label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option icon=\"...\" text=\"...\"/&gt;\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option content=\"&amp;lt;span class='label label-warning'&amp;gt;...&amp;lt;/span&amp;gt;\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html30(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option content=\"&amp;lt;span class='label label-warning'&amp;gt;...&amp;lt;/span&amp;gt;\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Add subtext to an option or optgroup --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\" subtext=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Show subtext --&gt;\\n &lt;select:Select showSubtext=\"true\"&gt;\\n \\s\\s&lt;select:Option text=\"...\" subtext=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html31(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Add subtext to an option or optgroup --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\" subtext=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Show subtext --&gt;\\n &lt;select:Select showSubtext=\"true\"&gt;\\n \\s\\s&lt;select:Option text=\"...\" subtext=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- AUTO: the menu always opens up to show as many items as the window will allow without being cut off --&gt;\\n &lt;select:Select menuSize=\"AUTO\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- ALL: always show all items. --&gt;\\n &lt;select:Select menuSize=\"ALL\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Choose the maximum number of items to show in the menu. --&gt;\\n &lt;select:Select fixedMenuSize=\"5\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html32(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- AUTO: the menu always opens up to show as many items as the window will allow without being cut off --&gt;\\n &lt;select:Select menuSize=\"AUTO\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- ALL: always show all items. --&gt;\\n &lt;select:Select menuSize=\"ALL\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Choose the maximum number of items to show in the menu. --&gt;\\n &lt;select:Select fixedMenuSize=\"5\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Adds two buttons to the top of the menu - Select All &amp; Deselect All --&gt;\\n &lt;select:MultipleSelect showActionsBox=\"true\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- Customize the text of two buttons --&gt;\\n &lt;select:MultipleSelect showActionsBox=\"true\" selectAllText=\"Check All\" deselectAllText=\"Uncheck All\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html33(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Adds two buttons to the top of the menu - Select All &amp; Deselect All --&gt;\\n &lt;select:MultipleSelect showActionsBox=\"true\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- Customize the text of two buttons --&gt;\\n &lt;select:MultipleSelect showActionsBox=\"true\" selectAllText=\"Check All\" deselectAllText=\"Uncheck All\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s&lt;select:Option divider=\"true\"/&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html34(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s&lt;select:Option divider=\"true\"/&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;select:Select header=\"Select a condiment\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html35(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;select:Select header=\"Select a condiment\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Set to true by default, which automatically determines whether or not the menu should display above or below the select box. --&gt;\\n &lt;!-- false: Never show menu above the select --&gt;\\n &lt;select:Select dropupAuto=\"false\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- If dropupAuto is set to false, manually make the select a dropup menu by adding the .dropup class to the select. --&gt;\\n &lt;select:Select dropupAuto=\"false\" forceDropup=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html36(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Set to true by default, which automatically determines whether or not the menu should display above or below the select box. --&gt;\\n &lt;!-- false: Never show menu above the select --&gt;\\n &lt;select:Select dropupAuto=\"false\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- If dropupAuto is set to false, manually make the select a dropup menu by adding the .dropup class to the select. --&gt;\\n &lt;select:Select dropupAuto=\"false\" forceDropup=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Disabled select box")
 */
public org.gwtproject.safehtml.shared.SafeHtml html37(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Disabled select box");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Disabled option")
 */
public org.gwtproject.safehtml.shared.SafeHtml html38(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Disabled option");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Disabled option group")
 */
public org.gwtproject.safehtml.shared.SafeHtml html39(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Disabled option group");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Disabled select box --&gt;\\n &lt;select:Select enabled=\"false\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Disabled option --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option enabled=\"false\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Disabled option group --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup enabled=\"false\" label=\"...\"&gt;\\n \\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html40(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Disabled select box --&gt;\\n &lt;select:Select enabled=\"false\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Disabled option --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option enabled=\"false\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Disabled option group --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup enabled=\"false\" label=\"...\"&gt;\\n \\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("&lt;!-- Standard Select --&gt;\\n &lt;select:Select ui:field=\"simpleSelect\"&gt;\\n \\s\\s&lt;select:Option text=\"Mustard\" value=\"1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Ketchup\" value=\"2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Relish\"/&gt;\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Multiple Select --&gt;\\n &lt;select:MultipleSelect ui:field=\"multiSelect\"&gt;\\n \\s\\s&lt;select:Option text=\"Mustard\" value=\"1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Ketchup\" value=\"2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Relish\"/&gt;\\n &lt;/select:Select&gt;\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html41(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;!-- Standard Select --&gt;\\n &lt;select:Select ui:field=\"simpleSelect\"&gt;\\n \\s\\s&lt;select:Option text=\"Mustard\" value=\"1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Ketchup\" value=\"2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Relish\"/&gt;\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Multiple Select --&gt;\\n &lt;select:MultipleSelect ui:field=\"multiSelect\"&gt;\\n \\s\\s&lt;select:Option text=\"Mustard\" value=\"1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Ketchup\" value=\"2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Relish\"/&gt;\\n &lt;/select:Select&gt;\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("@UiField Select simpleSelect;\\n @UiField MultipleSelect multiSelect\\n\\n // Enable/Disable\\n simpleSelect.setEnabled(true | false);\\n multiSelect.setEnabled(true | false);\\n\\n // Show/Hide\\n simpleSelect.setVisible(true | false);\\n multiSelect.setVisible(true | false);\\n\\n // Toggle Menu\\n simpleSelect.toggle();\\n multiSelect.toggle();\\n\\n // Get Value\\n // If the \"value\" is not set on an option, the text value is considered as value.\\n String value = simpleSelect.getValue();\\n List&lt;String&gt; values = multiSelect.getValue();\\n\\n // Set Value\\n // If the value to be set is not in the item list, no item will be selected.\\n // If you want to fire ValueChangeEvent, add a second argument \"true\"; it will be fired if\\n // the new value is different than the old one.\\n simpleSelect.setValue(\"2\"[, true]);\\n multiSelect.setValue(Arrays.asList(\"2\", \"Relish\")[, true]);\\n\\n // Render Select\\n simpleSelect.render();\\n multiSelect.render();\\n\\n // Refresh Select\\n simpleSelect.refresh();\\n multiSelect.refresh();\\n\\n // Select/Deselect All (Multiple Only)\\n multiSelect.selectAll();\\n multiSelect.deselectAll();\\n\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html42(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("@UiField Select simpleSelect;\\n @UiField MultipleSelect multiSelect\\n\\n // Enable/Disable\\n simpleSelect.setEnabled(true | false);\\n multiSelect.setEnabled(true | false);\\n\\n // Show/Hide\\n simpleSelect.setVisible(true | false);\\n multiSelect.setVisible(true | false);\\n\\n // Toggle Menu\\n simpleSelect.toggle();\\n multiSelect.toggle();\\n\\n // Get Value\\n // If the \"value\" is not set on an option, the text value is considered as value.\\n String value = simpleSelect.getValue();\\n List&lt;String&gt; values = multiSelect.getValue();\\n\\n // Set Value\\n // If the value to be set is not in the item list, no item will be selected.\\n // If you want to fire ValueChangeEvent, add a second argument \"true\"; it will be fired if\\n // the new value is different than the old one.\\n simpleSelect.setValue(\"2\"[, true]);\\n multiSelect.setValue(Arrays.asList(\"2\", \"Relish\")[, true]);\\n\\n // Render Select\\n simpleSelect.render();\\n multiSelect.render();\\n\\n // Refresh Select\\n simpleSelect.refresh();\\n multiSelect.refresh();\\n\\n // Select/Deselect All (Multiple Only)\\n multiSelect.selectAll();\\n multiSelect.deselectAll();\\n\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
