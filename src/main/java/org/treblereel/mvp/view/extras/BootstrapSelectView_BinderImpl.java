// Template file: org/treblereel/mvp/view/extras/BootstrapSelectView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.103")
public class BootstrapSelectView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.BootstrapSelectView>, org.treblereel.mvp.view.extras.BootstrapSelectView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("Bootstrap Select")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 1.12.4")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use Bootstrap Select, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.select.Select\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("Last but not least must add this namespace to your *.ui.xml (don't have to name it select):")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("xmlns:select=\"urn:import:org.gwtbootstrap3.extras.select.client.ui\"")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("Standard select boxes")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("Select boxes with optgroups")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("Multiple select boxes")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
    @Template("&lt;!-- Standard select boxes --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Select boxes with optgroups --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Multiple select boxes --&gt;\\n &lt;select:MultipleSelect&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html13();
     
    @Template("&lt;!-- Add a search input with placeholder --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchPlaceholder=\"Please type something...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Add key words to options to improve their searchability --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchPlaceholder=\"ketchup, mustard, frosting...\"&gt;\\n \\s\\s&lt;select:Option tokens=\"ketchup mustard\" text=\"Hot Dog, Fries and a Soda\"/&gt;\\n \\s\\s&lt;select:Option tokens=\"mustard\" text=\"Burger, Shake and a Smile\"/&gt;\\n \\s\\s&lt;select:Option tokens=\"frosting\" text=\"Sugar, Spice and all things nice\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Enable accent-insensitive search --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchNormalize=\"true\" liveSearchPlaceholder=\"Accent-insensitive search...\"&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dôg, Friés and a Soda\"/&gt;\\n \\s\\s&lt;select:Option text=\"Bûrger, Shakè and à Smîle\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sùgàr, Spiçe ând all thïngs nicé\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Reveal options starting with the searched text --&gt;\\n &lt;select:Select liveSearch=\"true\" liveSearchStyle=\"STARTS_WITH\" liveSearchPlaceholder=\"Hot, Burger, Sugar...\"&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html14();
     
    @Template("&lt;!-- Limit the number of options --&gt;\\n &lt;select:MultipleSelect maxOptions=\"2\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- It also works for option groups --&gt;\\n &lt;select:MultipleSelect ui:field=\"maxOptionsSelect\" maxOptions=\"3\"&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\" maxOptions=\"2\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s&lt;select:OptGroup label=\"...\" maxOptions=\"2\"&gt;\\n \\s\\s\\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s\\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n &lt;/select:MultipleSelect&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html15();
     
    @Template("// Customize the message displayed when the limit is reached\\n @UiField MultipleSelect maxOptionsSelect;\\n\\n maxOptionsSelect.setMaxOptionsTextHandler(new MaxOptionsTextHandler() {\\n \\s\\s@Override\\n \\s\\spublic String getMaxSelectOptionsText(int maxSelectOptions) {\\n \\s\\s\\s\\s// Or return \"Only {n} options are allowed\";\\n \\s\\s\\s\\sreturn \"Only \" + maxSelectOptions + \" options are allowed\";\\n \\s\\s}\\n \\s\\s@Override\\n \\s\\spublic String getMaxGroupOptionsText(int maxGroupOptions) {\\n \\s\\s\\s\\s// Or return \"No more than {n} options in group\";\\n \\s\\s\\s\\sreturn \"No more than \" + maxGroupOptions + \" options in group\";\\n \\s\\s}\\n });\\n")
    org.gwtproject.safehtml.shared.SafeHtml html16();
     
    @Template("&lt;!-- Set the default placeholder text when nothing is selected --&gt;\\n &lt;select:Select title=\"Choose one of the following...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- It also works for multiple select boxes --&gt;\\n &lt;select:MultipleSelect title=\"Choose one of the following...\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html17();
     
    @Template("&lt;!-- Set the title attribute on individual options to display alternative text when the option is selected --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\" title=\"Combo 1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\" title=\"Combo 2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\" title=\"Combo 3\"/&gt;\\n &lt;/select:Select&gt;\\n\\n &lt;!-- It also works for multiple select boxes --&gt;\\n &lt;select:MultipleSelect&gt;\\n \\s\\s&lt;select:Option text=\"Hot Dog, Fries and a Soda\" title=\"Combo 1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Burger, Shake and a Smile\" title=\"Combo 2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Sugar, Spice and all things nice\" title=\"Combo 3\"/&gt;\\n &lt;/select:MultipleSelect&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html18();
     
    @Template("VALUES")
    org.gwtproject.safehtml.shared.SafeHtml html19();
     
    @Template("COUNT")
    org.gwtproject.safehtml.shared.SafeHtml html20();
     
    @Template("STATIC")
    org.gwtproject.safehtml.shared.SafeHtml html21();
     
    @Template("COUNT &gt; X")
    org.gwtproject.safehtml.shared.SafeHtml html22();
     
    @Template("&lt;!-- VALUES: A comma delimited list of selected values (default) --&gt;\\n &lt;!-- COUNT: If one item is selected, then the value is shown, if more than one is selected then the number of selected\\n \\s\\sitems is displayed, eg 2 of 6 selected --&gt;\\n &lt;!-- STATIC: Always show the select title (placeholder), regardless of selection --&gt;\\n &lt;select:MultipleSelect selectedTextFormat=\"VALUES | COUNT | STATIC\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- COUNT &gt; X: Where X is the number of items selected when the display format changes from values to count --&gt;\\n &lt;select:MultipleSelect countSelectedTextFormat=\"2\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html23();
     
    @Template("&lt;!-- Set the button classes --&gt;\\n &lt;select:Select type=\"PRIMARY | INFO | SUCCESS | WARNING | DANGER | DEFAULT\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Or set a custom class name --&gt;\\n &lt;select:Select style=\"btn-default\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html24();
     
    @Template("&lt;select:Select showTick=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html25();
     
    @Template("&lt;select:Select showMenuArrow=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html26();
     
    @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option addStyleNames=\"...\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html27();
     
    @Template("&lt;!-- AUTO: The width of the select is automatically adjusted to accommodate the widest option.--&gt;\\n &lt;select:Select selectWidth=\"AUTO\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- FIT: Automatically adjusts the width of the select to the width of its currently selected option. --&gt;\\n &lt;select:Select selectWidth=\"FIT\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- CSS Width: 100px --&gt;\\n &lt;select:Select width=\"100px\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- CSS Width: 75% --&gt;\\n &lt;select:Select width=\"75%\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html28();
     
    @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup icon=\"...\" label=\"...\"&gt;\\n \\s\\s\\s\\s&lt;select:Option icon=\"...\" text=\"...\"/&gt;\\n \\s\\s&lt;/select:OptGroup&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html29();
     
    @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option content=\"&amp;lt;span class='label label-warning'&amp;gt;...&amp;lt;/span&amp;gt;\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html30();
     
    @Template("&lt;!-- Add subtext to an option or optgroup --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\" subtext=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Show subtext --&gt;\\n &lt;select:Select showSubtext=\"true\"&gt;\\n \\s\\s&lt;select:Option text=\"...\" subtext=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html31();
     
    @Template("&lt;!-- AUTO: the menu always opens up to show as many items as the window will allow without being cut off --&gt;\\n &lt;select:Select menuSize=\"AUTO\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- ALL: always show all items. --&gt;\\n &lt;select:Select menuSize=\"ALL\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Choose the maximum number of items to show in the menu. --&gt;\\n &lt;select:Select fixedMenuSize=\"5\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html32();
     
    @Template("&lt;!-- Adds two buttons to the top of the menu - Select All &amp; Deselect All --&gt;\\n &lt;select:MultipleSelect showActionsBox=\"true\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n\\n &lt;!-- Customize the text of two buttons --&gt;\\n &lt;select:MultipleSelect showActionsBox=\"true\" selectAllText=\"Check All\" deselectAllText=\"Uncheck All\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:MultipleSelect&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html33();
     
    @Template("&lt;select:Select&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s&lt;select:Option divider=\"true\"/&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html34();
     
    @Template("&lt;select:Select header=\"Select a condiment\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html35();
     
    @Template("&lt;!-- Set to true by default, which automatically determines whether or not the menu should display above or below the select box. --&gt;\\n &lt;!-- false: Never show menu above the select --&gt;\\n &lt;select:Select dropupAuto=\"false\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- If dropupAuto is set to false, manually make the select a dropup menu by adding the .dropup class to the select. --&gt;\\n &lt;select:Select dropupAuto=\"false\" forceDropup=\"true\"&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html36();
     
    @Template("Disabled select box")
    org.gwtproject.safehtml.shared.SafeHtml html37();
     
    @Template("Disabled option")
    org.gwtproject.safehtml.shared.SafeHtml html38();
     
    @Template("Disabled option group")
    org.gwtproject.safehtml.shared.SafeHtml html39();
     
    @Template("&lt;!-- Disabled select box --&gt;\\n &lt;select:Select enabled=\"false\"&gt;\\n \\s\\s&lt;select:Option text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Disabled option --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:Option enabled=\"false\" text=\"...\"/&gt;\\n \\s\\s...\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Disabled option group --&gt;\\n &lt;select:Select&gt;\\n \\s\\s&lt;select:OptGroup enabled=\"false\" label=\"...\"&gt;\\n \\s\\s...\\n \\s\\s&lt;/select:OptGroup&gt;\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html40();
     
    @Template("&lt;!-- Standard Select --&gt;\\n &lt;select:Select ui:field=\"simpleSelect\"&gt;\\n \\s\\s&lt;select:Option text=\"Mustard\" value=\"1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Ketchup\" value=\"2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Relish\"/&gt;\\n &lt;/select:Select&gt;\\n\\n &lt;!-- Multiple Select --&gt;\\n &lt;select:MultipleSelect ui:field=\"multiSelect\"&gt;\\n \\s\\s&lt;select:Option text=\"Mustard\" value=\"1\"/&gt;\\n \\s\\s&lt;select:Option text=\"Ketchup\" value=\"2\"/&gt;\\n \\s\\s&lt;select:Option text=\"Relish\"/&gt;\\n &lt;/select:Select&gt;\\n")
    org.gwtproject.safehtml.shared.SafeHtml html41();
     
    @Template("@UiField Select simpleSelect;\\n @UiField MultipleSelect multiSelect\\n\\n // Enable/Disable\\n simpleSelect.setEnabled(true | false);\\n multiSelect.setEnabled(true | false);\\n\\n // Show/Hide\\n simpleSelect.setVisible(true | false);\\n multiSelect.setVisible(true | false);\\n\\n // Toggle Menu\\n simpleSelect.toggle();\\n multiSelect.toggle();\\n\\n // Get Value\\n // If the \"value\" is not set on an option, the text value is considered as value.\\n String value = simpleSelect.getValue();\\n List&lt;String&gt; values = multiSelect.getValue();\\n\\n // Set Value\\n // If the value to be set is not in the item list, no item will be selected.\\n // If you want to fire ValueChangeEvent, add a second argument \"true\"; it will be fired if\\n // the new value is different than the old one.\\n simpleSelect.setValue(\"2\"[, true]);\\n multiSelect.setValue(Arrays.asList(\"2\", \"Relish\")[, true]);\\n\\n // Render Select\\n simpleSelect.render();\\n multiSelect.render();\\n\\n // Refresh Select\\n simpleSelect.refresh();\\n multiSelect.refresh();\\n\\n // Select/Deselect All (Multiple Only)\\n multiSelect.selectAll();\\n multiSelect.deselectAll();\\n\\n")
    org.gwtproject.safehtml.shared.SafeHtml html42();
     
  }

  Template template = new BootstrapSelectView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.BootstrapSelectView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.BootstrapSelectView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickDisableEnableSimple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickShowHideSimple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickToggleSimple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickGetValueSimple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickSetValueSimple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickRenderedSimple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickRefreshSimple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.LoadedHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new org.gwtbootstrap3.extras.select.client.ui.event.LoadedHandler() {
      public void onLoaded(org.gwtbootstrap3.extras.select.client.ui.event.LoadedEvent event) {
        owner.onLoadedSimpleSelect((org.gwtbootstrap3.extras.select.client.ui.event.LoadedEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.ShowHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new org.gwtbootstrap3.extras.select.client.ui.event.ShowHandler() {
      public void onShow(org.gwtbootstrap3.extras.select.client.ui.event.ShowEvent event) {
        owner.onShowSimple((org.gwtbootstrap3.extras.select.client.ui.event.ShowEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.ShownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10 = new org.gwtbootstrap3.extras.select.client.ui.event.ShownHandler() {
      public void onShown(org.gwtbootstrap3.extras.select.client.ui.event.ShownEvent event) {
        owner.onShownSimple((org.gwtbootstrap3.extras.select.client.ui.event.ShownEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.HideHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11 = new org.gwtbootstrap3.extras.select.client.ui.event.HideHandler() {
      public void onHide(org.gwtbootstrap3.extras.select.client.ui.event.HideEvent event) {
        owner.onHideSimple((org.gwtbootstrap3.extras.select.client.ui.event.HideEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.HiddenHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12 = new org.gwtbootstrap3.extras.select.client.ui.event.HiddenHandler() {
      public void onHidden(org.gwtbootstrap3.extras.select.client.ui.event.HiddenEvent event) {
        owner.onHiddenSimple((org.gwtbootstrap3.extras.select.client.ui.event.HiddenEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.RenderedHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13 = new org.gwtbootstrap3.extras.select.client.ui.event.RenderedHandler() {
      public void onRendered(org.gwtbootstrap3.extras.select.client.ui.event.RenderedEvent event) {
        owner.onRenderSimple((org.gwtbootstrap3.extras.select.client.ui.event.RenderedEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.RefreshedHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14 = new org.gwtbootstrap3.extras.select.client.ui.event.RefreshedHandler() {
      public void onRefreshed(org.gwtbootstrap3.extras.select.client.ui.event.RefreshedEvent event) {
        owner.onRefrechSimple((org.gwtbootstrap3.extras.select.client.ui.event.RefreshedEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickDisableEnableMultiple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickShowHideMultiple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames17 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickToggleMultiple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames18 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickGetValueMultiple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames19 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickSetValueMultiple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames20 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickRenderMultiple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames21 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickrRefreshMultiple((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames22 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickSelectAll((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames23 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickDeselectAll((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.LoadedHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames24 = new org.gwtbootstrap3.extras.select.client.ui.event.LoadedHandler() {
      public void onLoaded(org.gwtbootstrap3.extras.select.client.ui.event.LoadedEvent event) {
        owner.onLoadedMultiple((org.gwtbootstrap3.extras.select.client.ui.event.LoadedEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.ShowHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames25 = new org.gwtbootstrap3.extras.select.client.ui.event.ShowHandler() {
      public void onShow(org.gwtbootstrap3.extras.select.client.ui.event.ShowEvent event) {
        owner.onShowMultiple((org.gwtbootstrap3.extras.select.client.ui.event.ShowEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.ShownHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames26 = new org.gwtbootstrap3.extras.select.client.ui.event.ShownHandler() {
      public void onShown(org.gwtbootstrap3.extras.select.client.ui.event.ShownEvent event) {
        owner.onShownMultiple((org.gwtbootstrap3.extras.select.client.ui.event.ShownEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.HideHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames27 = new org.gwtbootstrap3.extras.select.client.ui.event.HideHandler() {
      public void onHide(org.gwtbootstrap3.extras.select.client.ui.event.HideEvent event) {
        owner.onHideMultiple((org.gwtbootstrap3.extras.select.client.ui.event.HideEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.HiddenHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames28 = new org.gwtbootstrap3.extras.select.client.ui.event.HiddenHandler() {
      public void onHidden(org.gwtbootstrap3.extras.select.client.ui.event.HiddenEvent event) {
        owner.onHiddenMultiple((org.gwtbootstrap3.extras.select.client.ui.event.HiddenEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.RenderedHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames29 = new org.gwtbootstrap3.extras.select.client.ui.event.RenderedHandler() {
      public void onRendered(org.gwtbootstrap3.extras.select.client.ui.event.RenderedEvent event) {
        owner.onRenderMultiple((org.gwtbootstrap3.extras.select.client.ui.event.RenderedEvent) event);
      }
    };

    final org.gwtbootstrap3.extras.select.client.ui.event.RefreshedHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames30 = new org.gwtbootstrap3.extras.select.client.ui.event.RefreshedHandler() {
      public void onRefreshed(org.gwtbootstrap3.extras.select.client.ui.event.RefreshedEvent event) {
        owner.onRefreshMultiple((org.gwtbootstrap3.extras.select.client.ui.event.RefreshedEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames31 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.onClickclearLogButton((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.BootstrapSelectView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    org.gwtproject.safehtml.shared.SafeHtml template_html1() {
      return template.html1();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html2() {
      return template.html2();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html3() {
      return template.html3();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html4() {
      return template.html4();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html5() {
      return template.html5();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html6() {
      return template.html6();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html7() {
      return template.html7();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html8() {
      return template.html8();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html9() {
      return template.html9();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html10() {
      return template.html10();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html11() {
      return template.html11();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html12() {
      return template.html12();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html13() {
      return template.html13();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html14() {
      return template.html14();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html15() {
      return template.html15();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html16() {
      return template.html16();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html17() {
      return template.html17();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html18() {
      return template.html18();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html19() {
      return template.html19();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html20() {
      return template.html20();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html21() {
      return template.html21();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html22() {
      return template.html22();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html23() {
      return template.html23();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html24() {
      return template.html24();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html25() {
      return template.html25();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html26() {
      return template.html26();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html27() {
      return template.html27();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html28() {
      return template.html28();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html29() {
      return template.html29();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html30() {
      return template.html30();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html31() {
      return template.html31();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html32() {
      return template.html32();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html33() {
      return template.html33();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html34() {
      return template.html34();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html35() {
      return template.html35();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html36() {
      return template.html36();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html37() {
      return template.html37();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html38() {
      return template.html38();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html39() {
      return template.html39();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html40() {
      return template.html40();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html41() {
      return template.html41();
    }
    org.gwtproject.safehtml.shared.SafeHtml template_html42() {
      return template.html42();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 27 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.BootstrapSelectView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();

      return style;
    }

    /**
     * Getter for f_Row1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row1() {
      return build_f_Row1();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row1() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row1 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row1.add(get_f_Column2());

      return f_Row1;
    }

    /**
     * Getter for f_Column2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column2() {
      return build_f_Column2();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column2 = new org.gwtbootstrap3.client.ui.Column("XS_12");
      // Setup section.
      f_Column2.add(get_f_PageHeader3());
      f_Column2.add(get_f_BlockQuote4());
      f_Column2.add(get_f_BlockQuote9());
      f_Column2.add(get_f_Panel17());
      f_Column2.add(get_f_Panel51());
      f_Column2.add(get_f_Panel78());
      f_Column2.add(get_f_Panel101());
      f_Column2.add(get_f_Panel118());
      f_Column2.add(get_f_Panel135());
      f_Column2.add(get_f_Panel171());
      f_Column2.add(get_f_Panel213());
      f_Column2.add(get_f_Panel223());
      f_Column2.add(get_f_Panel233());
      f_Column2.add(get_f_Panel243());
      f_Column2.add(get_f_Panel285());
      f_Column2.add(get_f_Panel296());
      f_Column2.add(get_f_Panel307());
      f_Column2.add(get_f_Panel326());
      f_Column2.add(get_f_Panel395());
      f_Column2.add(get_f_Panel412());
      f_Column2.add(get_f_Panel423());
      f_Column2.add(get_f_Panel434());
      f_Column2.add(get_f_Panel451());
      f_Column2.add(get_f_Panel485());

      return f_Column2;
    }

    /**
     * Getter for f_PageHeader3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.PageHeader get_f_PageHeader3() {
      return build_f_PageHeader3();
    }
    private org.gwtbootstrap3.client.ui.PageHeader build_f_PageHeader3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PageHeader f_PageHeader3 = new org.gwtbootstrap3.client.ui.PageHeader();
      // Setup section.
      f_PageHeader3.setText("Bootstrap Select");

      return f_PageHeader3;
    }

    /**
     * Getter for f_BlockQuote4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.BlockQuote get_f_BlockQuote4() {
      return build_f_BlockQuote4();
    }
    private org.gwtbootstrap3.client.ui.BlockQuote build_f_BlockQuote4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.BlockQuote f_BlockQuote4 = new org.gwtbootstrap3.client.ui.BlockQuote();
      // Setup section.
      f_BlockQuote4.add(get_f_Strong5());
      f_BlockQuote4.add(get_f_Anchor6());
      f_BlockQuote4.add(get_f_Br7());
      f_BlockQuote4.add(get_f_Strong8());

      return f_BlockQuote4;
    }

    /**
     * Getter for f_Strong5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong5() {
      return build_f_Strong5();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong5 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong5.setHTML(template_html1().asString());

      return f_Strong5;
    }

    /**
     * Getter for f_Anchor6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Anchor get_f_Anchor6() {
      return build_f_Anchor6();
    }
    private org.gwtbootstrap3.client.ui.Anchor build_f_Anchor6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Anchor f_Anchor6 = new org.gwtbootstrap3.client.ui.Anchor();
      // Setup section.
      f_Anchor6.setHTML(template_html2().asString());
      f_Anchor6.addStyleName("" + get_style().spacing() + "");
      f_Anchor6.setHref("http://silviomoreto.github.io/bootstrap-select");
      f_Anchor6.setTarget("_blank");

      return f_Anchor6;
    }

    /**
     * Getter for f_Br7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br7() {
      return build_f_Br7();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br7 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br7;
    }

    /**
     * Getter for f_Strong8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong8() {
      return build_f_Strong8();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong8 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong8.setHTML(template_html3().asString());

      return f_Strong8;
    }

    /**
     * Getter for f_BlockQuote9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.BlockQuote get_f_BlockQuote9() {
      return build_f_BlockQuote9();
    }
    private org.gwtbootstrap3.client.ui.BlockQuote build_f_BlockQuote9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.BlockQuote f_BlockQuote9 = new org.gwtbootstrap3.client.ui.BlockQuote();
      // Setup section.
      f_BlockQuote9.add(get_f_Heading10());
      f_BlockQuote9.add(get_f_Paragraph11());
      f_BlockQuote9.add(get_f_PrettyPre12());
      f_BlockQuote9.add(get_f_Paragraph13());
      f_BlockQuote9.add(get_f_PrettyPre14());
      f_BlockQuote9.add(get_f_Paragraph15());
      f_BlockQuote9.add(get_f_PrettyPre16());
      f_BlockQuote9.addStyleName("" + get_style().danger() + "");

      return f_BlockQuote9;
    }

    /**
     * Getter for f_Heading10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading10() {
      return build_f_Heading10();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading10 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading10.addStyleName("" + get_style().marginFix() + "");
      f_Heading10.setText("Required for use");

      return f_Heading10;
    }

    /**
     * Getter for f_Paragraph11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph11() {
      return build_f_Paragraph11();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph11 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html4().asString());
      // Setup section.

      return f_Paragraph11;
    }

    /**
     * Getter for f_PrettyPre12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre12() {
      return build_f_PrettyPre12();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre12() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre12 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre12.setHTML(template_html5().asString());
      f_PrettyPre12.addStyleName("lang-xml");

      return f_PrettyPre12;
    }

    /**
     * Getter for f_Paragraph13 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph13() {
      return build_f_Paragraph13();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph13 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html6().asString());
      // Setup section.

      return f_Paragraph13;
    }

    /**
     * Getter for f_PrettyPre14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre14() {
      return build_f_PrettyPre14();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre14() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre14 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre14.setHTML(template_html7().asString());
      f_PrettyPre14.addStyleName("lang-xml");

      return f_PrettyPre14;
    }

    /**
     * Getter for f_Paragraph15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.html.Paragraph get_f_Paragraph15() {
      return build_f_Paragraph15();
    }
    private org.gwtbootstrap3.client.ui.html.Paragraph build_f_Paragraph15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Paragraph f_Paragraph15 = new org.gwtbootstrap3.client.ui.html.Paragraph(template_html8().asString());
      // Setup section.

      return f_Paragraph15;
    }

    /**
     * Getter for f_PrettyPre16 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre16() {
      return build_f_PrettyPre16();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre16() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre16 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre16.setHTML(template_html9().asString());
      f_PrettyPre16.addStyleName("lang-xml");

      return f_PrettyPre16;
    }

    /**
     * Getter for f_Panel17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel17() {
      return build_f_Panel17();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel17 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel17.add(get_f_PanelHeader18());
      f_Panel17.add(get_f_PanelBody20());
      f_Panel17.add(get_f_PanelFooter49());

      return f_Panel17;
    }

    /**
     * Getter for f_PanelHeader18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader18() {
      return build_f_PanelHeader18();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader18 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader18.add(get_f_Heading19());

      return f_PanelHeader18;
    }

    /**
     * Getter for f_Heading19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading19() {
      return build_f_Heading19();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading19 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading19.setText("Basic");

      return f_Heading19;
    }

    /**
     * Getter for f_PanelBody20 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody20() {
      return build_f_PanelBody20();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody20() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody20 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody20.add(get_f_Row21());
      f_PanelBody20.add(get_f_Row28());

      return f_PanelBody20;
    }

    /**
     * Getter for f_Row21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row21() {
      return build_f_Row21();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row21 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row21.add(get_f_Column22());
      f_Row21.add(get_f_Column24());
      f_Row21.add(get_f_Column26());

      return f_Row21;
    }

    /**
     * Getter for f_Column22 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column22() {
      return build_f_Column22();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column22 = new org.gwtbootstrap3.client.ui.Column("XS_4");
      // Setup section.
      f_Column22.add(get_f_FormLabel23());

      return f_Column22;
    }

    /**
     * Getter for f_FormLabel23 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel23() {
      return build_f_FormLabel23();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel23() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel23 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel23.setHTML(template_html10().asString());
      f_FormLabel23.setFor("basic1");

      return f_FormLabel23;
    }

    /**
     * Getter for f_Column24 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column24() {
      return build_f_Column24();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column24 = new org.gwtbootstrap3.client.ui.Column("XS_4");
      // Setup section.
      f_Column24.add(get_f_FormLabel25());

      return f_Column24;
    }

    /**
     * Getter for f_FormLabel25 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel25() {
      return build_f_FormLabel25();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel25 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel25.setHTML(template_html11().asString());
      f_FormLabel25.setFor("basic2");

      return f_FormLabel25;
    }

    /**
     * Getter for f_Column26 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column26() {
      return build_f_Column26();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column26 = new org.gwtbootstrap3.client.ui.Column("XS_4");
      // Setup section.
      f_Column26.add(get_f_FormLabel27());

      return f_Column26;
    }

    /**
     * Getter for f_FormLabel27 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel27() {
      return build_f_FormLabel27();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel27 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel27.setHTML(template_html12().asString());
      f_FormLabel27.setFor("basic3");

      return f_FormLabel27;
    }

    /**
     * Getter for f_Row28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row28() {
      return build_f_Row28();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row28 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row28.add(get_f_Column29());
      f_Row28.add(get_f_Column34());
      f_Row28.add(get_f_Column44());

      return f_Row28;
    }

    /**
     * Getter for f_Column29 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column29() {
      return build_f_Column29();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column29 = new org.gwtbootstrap3.client.ui.Column("XS_4");
      // Setup section.
      f_Column29.add(get_f_Select30());

      return f_Column29;
    }

    /**
     * Getter for f_Select30 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select30() {
      return build_f_Select30();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select30() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select30 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select30.add(get_f_Option31());
      f_Select30.add(get_f_Option32());
      f_Select30.add(get_f_Option33());
      f_Select30.setId("basic1");

      return f_Select30;
    }

    /**
     * Getter for f_Option31 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option31() {
      return build_f_Option31();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option31() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option31 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option31.setText("Mustard");

      return f_Option31;
    }

    /**
     * Getter for f_Option32 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option32() {
      return build_f_Option32();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option32() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option32 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option32.setText("Ketchup");

      return f_Option32;
    }

    /**
     * Getter for f_Option33 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option33() {
      return build_f_Option33();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option33() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option33 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option33.setText("Relish");

      return f_Option33;
    }

    /**
     * Getter for f_Column34 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column34() {
      return build_f_Column34();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column34 = new org.gwtbootstrap3.client.ui.Column("XS_4");
      // Setup section.
      f_Column34.add(get_f_Select35());

      return f_Column34;
    }

    /**
     * Getter for f_Select35 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select35() {
      return build_f_Select35();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select35() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select35 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select35.add(get_f_OptGroup36());
      f_Select35.add(get_f_OptGroup40());
      f_Select35.setId("basic2");

      return f_Select35;
    }

    /**
     * Getter for f_OptGroup36 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup get_f_OptGroup36() {
      return build_f_OptGroup36();
    }
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup build_f_OptGroup36() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.OptGroup f_OptGroup36 = new org.gwtbootstrap3.extras.select.client.ui.OptGroup();
      // Setup section.
      f_OptGroup36.add(get_f_Option37());
      f_OptGroup36.add(get_f_Option38());
      f_OptGroup36.add(get_f_Option39());
      f_OptGroup36.setLabel("Picnic");

      return f_OptGroup36;
    }

    /**
     * Getter for f_Option37 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option37() {
      return build_f_Option37();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option37() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option37 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option37.setText("Mustard");

      return f_Option37;
    }

    /**
     * Getter for f_Option38 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option38() {
      return build_f_Option38();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option38() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option38 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option38.setText("Ketchup");

      return f_Option38;
    }

    /**
     * Getter for f_Option39 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option39() {
      return build_f_Option39();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option39() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option39 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option39.setText("Relish");

      return f_Option39;
    }

    /**
     * Getter for f_OptGroup40 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup get_f_OptGroup40() {
      return build_f_OptGroup40();
    }
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup build_f_OptGroup40() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.OptGroup f_OptGroup40 = new org.gwtbootstrap3.extras.select.client.ui.OptGroup();
      // Setup section.
      f_OptGroup40.add(get_f_Option41());
      f_OptGroup40.add(get_f_Option42());
      f_OptGroup40.add(get_f_Option43());
      f_OptGroup40.setLabel("Camping");

      return f_OptGroup40;
    }

    /**
     * Getter for f_Option41 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option41() {
      return build_f_Option41();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option41() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option41 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option41.setText("Tent");

      return f_Option41;
    }

    /**
     * Getter for f_Option42 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option42() {
      return build_f_Option42();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option42() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option42 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option42.setText("Flashlight");

      return f_Option42;
    }

    /**
     * Getter for f_Option43 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option43() {
      return build_f_Option43();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option43() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option43 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option43.setText("Toilet Paper");

      return f_Option43;
    }

    /**
     * Getter for f_Column44 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column44() {
      return build_f_Column44();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column44() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column44 = new org.gwtbootstrap3.client.ui.Column("XS_4");
      // Setup section.
      f_Column44.add(get_f_MultipleSelect45());

      return f_Column44;
    }

    /**
     * Getter for f_MultipleSelect45 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect45() {
      return build_f_MultipleSelect45();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect45() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect45 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect45.add(get_f_Option46());
      f_MultipleSelect45.add(get_f_Option47());
      f_MultipleSelect45.add(get_f_Option48());
      f_MultipleSelect45.setId("basic3");

      return f_MultipleSelect45;
    }

    /**
     * Getter for f_Option46 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option46() {
      return build_f_Option46();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option46() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option46 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option46.setText("Mustard");

      return f_Option46;
    }

    /**
     * Getter for f_Option47 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option47() {
      return build_f_Option47();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option47() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option47 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option47.setText("Ketchup");

      return f_Option47;
    }

    /**
     * Getter for f_Option48 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option48() {
      return build_f_Option48();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option48() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option48 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option48.setText("Relish");

      return f_Option48;
    }

    /**
     * Getter for f_PanelFooter49 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter49() {
      return build_f_PanelFooter49();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter49() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter49 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter49.add(get_f_PrettyPre50());

      return f_PanelFooter49;
    }

    /**
     * Getter for f_PrettyPre50 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre50() {
      return build_f_PrettyPre50();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre50() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre50 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre50.setHTML(template_html13().asString());
      f_PrettyPre50.addStyleName("lang-xml");

      return f_PrettyPre50;
    }

    /**
     * Getter for f_Panel51 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel51() {
      return build_f_Panel51();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel51() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel51 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel51.add(get_f_PanelHeader52());
      f_Panel51.add(get_f_PanelBody54());
      f_Panel51.add(get_f_PanelFooter76());

      return f_Panel51;
    }

    /**
     * Getter for f_PanelHeader52 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader52() {
      return build_f_PanelHeader52();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader52() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader52 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader52.add(get_f_Heading53());

      return f_PanelHeader52;
    }

    /**
     * Getter for f_Heading53 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading53() {
      return build_f_Heading53();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading53() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading53 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading53.setText("Live Search");

      return f_Heading53;
    }

    /**
     * Getter for f_PanelBody54 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody54() {
      return build_f_PanelBody54();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody54() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody54 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody54.add(get_f_Row55());

      return f_PanelBody54;
    }

    /**
     * Getter for f_Row55 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row55() {
      return build_f_Row55();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row55() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row55 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row55.add(get_f_Column56());
      f_Row55.add(get_f_Column61());
      f_Row55.add(get_f_Column66());
      f_Row55.add(get_f_Column71());

      return f_Row55;
    }

    /**
     * Getter for f_Column56 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column56() {
      return build_f_Column56();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column56() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column56 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column56.add(get_f_Select57());

      return f_Column56;
    }

    /**
     * Getter for f_Select57 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select57() {
      return build_f_Select57();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select57() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select57 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select57.add(get_f_Option58());
      f_Select57.add(get_f_Option59());
      f_Select57.add(get_f_Option60());
      f_Select57.setLiveSearchPlaceholder("Please type something...");
      f_Select57.setLiveSearch(true);

      return f_Select57;
    }

    /**
     * Getter for f_Option58 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option58() {
      return build_f_Option58();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option58() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option58 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option58.setText("Hot Dog, Fries and a Soda");

      return f_Option58;
    }

    /**
     * Getter for f_Option59 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option59() {
      return build_f_Option59();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option59() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option59 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option59.setText("Burger, Shake and a Smile");

      return f_Option59;
    }

    /**
     * Getter for f_Option60 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option60() {
      return build_f_Option60();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option60() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option60 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option60.setText("Sugar, Spice and all things nice");

      return f_Option60;
    }

    /**
     * Getter for f_Column61 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column61() {
      return build_f_Column61();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column61() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column61 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column61.add(get_f_Select62());

      return f_Column61;
    }

    /**
     * Getter for f_Select62 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select62() {
      return build_f_Select62();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select62() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select62 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select62.add(get_f_Option63());
      f_Select62.add(get_f_Option64());
      f_Select62.add(get_f_Option65());
      f_Select62.setLiveSearchPlaceholder("ketchup, mustard, frosting...");
      f_Select62.setLiveSearch(true);

      return f_Select62;
    }

    /**
     * Getter for f_Option63 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option63() {
      return build_f_Option63();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option63() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option63 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option63.setTokens("ketchup mustard");
      f_Option63.setText("Hot Dog, Fries and a Soda");

      return f_Option63;
    }

    /**
     * Getter for f_Option64 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option64() {
      return build_f_Option64();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option64() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option64 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option64.setTokens("mustard");
      f_Option64.setText("Burger, Shake and a Smile");

      return f_Option64;
    }

    /**
     * Getter for f_Option65 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option65() {
      return build_f_Option65();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option65() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option65 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option65.setTokens("frosting");
      f_Option65.setText("Sugar, Spice and all things nice");

      return f_Option65;
    }

    /**
     * Getter for f_Column66 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column66() {
      return build_f_Column66();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column66() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column66 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column66.add(get_f_Select67());

      return f_Column66;
    }

    /**
     * Getter for f_Select67 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select67() {
      return build_f_Select67();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select67() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select67 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select67.add(get_f_Option68());
      f_Select67.add(get_f_Option69());
      f_Select67.add(get_f_Option70());
      f_Select67.setLiveSearchPlaceholder("Accent-insensitive search...");
      f_Select67.setLiveSearchNormalize(true);
      f_Select67.setLiveSearch(true);

      return f_Select67;
    }

    /**
     * Getter for f_Option68 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option68() {
      return build_f_Option68();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option68() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option68 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option68.setText("Hot Dôg, Friés and a Soda");

      return f_Option68;
    }

    /**
     * Getter for f_Option69 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option69() {
      return build_f_Option69();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option69() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option69 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option69.setText("Bûrger, Shakè and à Smîle");

      return f_Option69;
    }

    /**
     * Getter for f_Option70 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option70() {
      return build_f_Option70();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option70() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option70 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option70.setText("Sùgàr, Spiçe ând all thïngs nicé");

      return f_Option70;
    }

    /**
     * Getter for f_Column71 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column71() {
      return build_f_Column71();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column71() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column71 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column71.add(get_f_Select72());

      return f_Column71;
    }

    /**
     * Getter for f_Select72 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select72() {
      return build_f_Select72();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select72() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select72 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select72.add(get_f_Option73());
      f_Select72.add(get_f_Option74());
      f_Select72.add(get_f_Option75());
      f_Select72.setLiveSearchPlaceholder("Hot, Burger, Sugar...");
      f_Select72.setLiveSearch(true);
      f_Select72.setLiveSearchStyle(org.gwtbootstrap3.extras.select.client.ui.constants.LiveSearchStyle.STARTS_WITH);

      return f_Select72;
    }

    /**
     * Getter for f_Option73 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option73() {
      return build_f_Option73();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option73() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option73 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option73.setText("Hot Dog, Fries and a Soda");

      return f_Option73;
    }

    /**
     * Getter for f_Option74 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option74() {
      return build_f_Option74();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option74() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option74 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option74.setText("Burger, Shake and a Smile");

      return f_Option74;
    }

    /**
     * Getter for f_Option75 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option75() {
      return build_f_Option75();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option75() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option75 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option75.setText("Sugar, Spice and all things nice");

      return f_Option75;
    }

    /**
     * Getter for f_PanelFooter76 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter76() {
      return build_f_PanelFooter76();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter76() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter76 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter76.add(get_f_PrettyPre77());

      return f_PanelFooter76;
    }

    /**
     * Getter for f_PrettyPre77 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre77() {
      return build_f_PrettyPre77();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre77() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre77 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre77.setHTML(template_html14().asString());
      f_PrettyPre77.addStyleName("lang-xml");

      return f_PrettyPre77;
    }

    /**
     * Getter for f_Panel78 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel78() {
      return build_f_Panel78();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel78() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel78 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel78.add(get_f_PanelHeader79());
      f_Panel78.add(get_f_PanelBody81());
      f_Panel78.add(get_f_PanelFooter97());

      return f_Panel78;
    }

    /**
     * Getter for f_PanelHeader79 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader79() {
      return build_f_PanelHeader79();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader79() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader79 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader79.add(get_f_Heading80());

      return f_PanelHeader79;
    }

    /**
     * Getter for f_Heading80 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading80() {
      return build_f_Heading80();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading80() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading80 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading80.setText("Limit the number of selections");

      return f_Heading80;
    }

    /**
     * Getter for f_PanelBody81 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody81() {
      return build_f_PanelBody81();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody81() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody81 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody81.add(get_f_Row82());

      return f_PanelBody81;
    }

    /**
     * Getter for f_Row82 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row82() {
      return build_f_Row82();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row82() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row82 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row82.add(get_f_Column83());
      f_Row82.add(get_f_Column88());

      return f_Row82;
    }

    /**
     * Getter for f_Column83 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column83() {
      return build_f_Column83();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column83() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column83 = new org.gwtbootstrap3.client.ui.Column("XS_6");
      // Setup section.
      f_Column83.add(get_f_MultipleSelect84());

      return f_Column83;
    }

    /**
     * Getter for f_MultipleSelect84 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect84() {
      return build_f_MultipleSelect84();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect84() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect84 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect84.add(get_f_Option85());
      f_MultipleSelect84.add(get_f_Option86());
      f_MultipleSelect84.add(get_f_Option87());
      f_MultipleSelect84.setMaxOptions(2);

      return f_MultipleSelect84;
    }

    /**
     * Getter for f_Option85 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option85() {
      return build_f_Option85();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option85() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option85 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option85.setText("Mustard");

      return f_Option85;
    }

    /**
     * Getter for f_Option86 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option86() {
      return build_f_Option86();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option86() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option86 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option86.setText("Ketchup");

      return f_Option86;
    }

    /**
     * Getter for f_Option87 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option87() {
      return build_f_Option87();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option87() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option87 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option87.setText("Relish");

      return f_Option87;
    }

    /**
     * Getter for f_Column88 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column88() {
      return build_f_Column88();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column88() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column88 = new org.gwtbootstrap3.client.ui.Column("XS_6");
      // Setup section.
      f_Column88.add(get_maxOptionsSelect());

      return f_Column88;
    }

    /**
     * Getter for maxOptionsSelect called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_maxOptionsSelect() {
      return build_maxOptionsSelect();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_maxOptionsSelect() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect maxOptionsSelect = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      maxOptionsSelect.add(get_f_OptGroup89());
      maxOptionsSelect.add(get_f_OptGroup93());
      maxOptionsSelect.setMaxOptions(2);

      this.owner.maxOptionsSelect = maxOptionsSelect;

      return maxOptionsSelect;
    }

    /**
     * Getter for f_OptGroup89 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup get_f_OptGroup89() {
      return build_f_OptGroup89();
    }
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup build_f_OptGroup89() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.OptGroup f_OptGroup89 = new org.gwtbootstrap3.extras.select.client.ui.OptGroup();
      // Setup section.
      f_OptGroup89.add(get_f_Option90());
      f_OptGroup89.add(get_f_Option91());
      f_OptGroup89.add(get_f_Option92());
      f_OptGroup89.setMaxOptions(3);
      f_OptGroup89.setLabel("Condiments");

      return f_OptGroup89;
    }

    /**
     * Getter for f_Option90 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option90() {
      return build_f_Option90();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option90() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option90 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option90.setText("Mustard");

      return f_Option90;
    }

    /**
     * Getter for f_Option91 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option91() {
      return build_f_Option91();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option91() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option91 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option91.setText("Ketchup");

      return f_Option91;
    }

    /**
     * Getter for f_Option92 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option92() {
      return build_f_Option92();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option92() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option92 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option92.setText("Relish");

      return f_Option92;
    }

    /**
     * Getter for f_OptGroup93 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup get_f_OptGroup93() {
      return build_f_OptGroup93();
    }
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup build_f_OptGroup93() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.OptGroup f_OptGroup93 = new org.gwtbootstrap3.extras.select.client.ui.OptGroup();
      // Setup section.
      f_OptGroup93.add(get_f_Option94());
      f_OptGroup93.add(get_f_Option95());
      f_OptGroup93.add(get_f_Option96());
      f_OptGroup93.setMaxOptions(2);
      f_OptGroup93.setLabel("Breads");

      return f_OptGroup93;
    }

    /**
     * Getter for f_Option94 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option94() {
      return build_f_Option94();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option94() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option94 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option94.setText("Plain");

      return f_Option94;
    }

    /**
     * Getter for f_Option95 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option95() {
      return build_f_Option95();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option95() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option95 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option95.setText("Steamed");

      return f_Option95;
    }

    /**
     * Getter for f_Option96 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option96() {
      return build_f_Option96();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option96() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option96 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option96.setText("Toasted");

      return f_Option96;
    }

    /**
     * Getter for f_PanelFooter97 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter97() {
      return build_f_PanelFooter97();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter97() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter97 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter97.add(get_f_PrettyPre98());
      f_PanelFooter97.add(get_f_Heading99());
      f_PanelFooter97.add(get_f_PrettyPre100());

      return f_PanelFooter97;
    }

    /**
     * Getter for f_PrettyPre98 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre98() {
      return build_f_PrettyPre98();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre98() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre98 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre98.setHTML(template_html15().asString());
      f_PrettyPre98.addStyleName("lang-xml");

      return f_PrettyPre98;
    }

    /**
     * Getter for f_Heading99 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading99() {
      return build_f_Heading99();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading99() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading99 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading99.setText("Java Code");

      return f_Heading99;
    }

    /**
     * Getter for f_PrettyPre100 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre100() {
      return build_f_PrettyPre100();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre100() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre100 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre100.setHTML(template_html16().asString());
      f_PrettyPre100.addStyleName("lang-java");

      return f_PrettyPre100;
    }

    /**
     * Getter for f_Panel101 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel101() {
      return build_f_Panel101();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel101() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel101 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel101.add(get_f_PanelHeader102());
      f_Panel101.add(get_f_PanelBody104());
      f_Panel101.add(get_f_PanelFooter116());

      return f_Panel101;
    }

    /**
     * Getter for f_PanelHeader102 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader102() {
      return build_f_PanelHeader102();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader102() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader102 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader102.add(get_f_Heading103());

      return f_PanelHeader102;
    }

    /**
     * Getter for f_Heading103 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading103() {
      return build_f_Heading103();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading103() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading103 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading103.setText("Placeholder");

      return f_Heading103;
    }

    /**
     * Getter for f_PanelBody104 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody104() {
      return build_f_PanelBody104();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody104() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody104 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody104.add(get_f_Row105());

      return f_PanelBody104;
    }

    /**
     * Getter for f_Row105 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row105() {
      return build_f_Row105();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row105() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row105 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row105.add(get_f_Column106());
      f_Row105.add(get_f_Column111());

      return f_Row105;
    }

    /**
     * Getter for f_Column106 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column106() {
      return build_f_Column106();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column106() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column106 = new org.gwtbootstrap3.client.ui.Column("XS_6");
      // Setup section.
      f_Column106.add(get_f_Select107());

      return f_Column106;
    }

    /**
     * Getter for f_Select107 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select107() {
      return build_f_Select107();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select107() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select107 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select107.add(get_f_Option108());
      f_Select107.add(get_f_Option109());
      f_Select107.add(get_f_Option110());
      f_Select107.setTitle("Choose one of the following...");

      return f_Select107;
    }

    /**
     * Getter for f_Option108 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option108() {
      return build_f_Option108();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option108() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option108 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option108.setText("Mustard");

      return f_Option108;
    }

    /**
     * Getter for f_Option109 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option109() {
      return build_f_Option109();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option109() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option109 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option109.setText("Ketchup");

      return f_Option109;
    }

    /**
     * Getter for f_Option110 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option110() {
      return build_f_Option110();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option110() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option110 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option110.setText("Relish");

      return f_Option110;
    }

    /**
     * Getter for f_Column111 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column111() {
      return build_f_Column111();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column111() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column111 = new org.gwtbootstrap3.client.ui.Column("XS_6");
      // Setup section.
      f_Column111.add(get_f_MultipleSelect112());

      return f_Column111;
    }

    /**
     * Getter for f_MultipleSelect112 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect112() {
      return build_f_MultipleSelect112();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect112() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect112 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect112.add(get_f_Option113());
      f_MultipleSelect112.add(get_f_Option114());
      f_MultipleSelect112.add(get_f_Option115());
      f_MultipleSelect112.setTitle("Choose one of the following...");

      return f_MultipleSelect112;
    }

    /**
     * Getter for f_Option113 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option113() {
      return build_f_Option113();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option113() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option113 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option113.setText("Mustard");

      return f_Option113;
    }

    /**
     * Getter for f_Option114 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option114() {
      return build_f_Option114();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option114() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option114 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option114.setText("Ketchup");

      return f_Option114;
    }

    /**
     * Getter for f_Option115 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option115() {
      return build_f_Option115();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option115() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option115 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option115.setText("Relish");

      return f_Option115;
    }

    /**
     * Getter for f_PanelFooter116 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter116() {
      return build_f_PanelFooter116();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter116() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter116 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter116.add(get_f_PrettyPre117());

      return f_PanelFooter116;
    }

    /**
     * Getter for f_PrettyPre117 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre117() {
      return build_f_PrettyPre117();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre117() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre117 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre117.setHTML(template_html17().asString());
      f_PrettyPre117.addStyleName("lang-xml");

      return f_PrettyPre117;
    }

    /**
     * Getter for f_Panel118 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel118() {
      return build_f_Panel118();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel118() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel118 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel118.add(get_f_PanelHeader119());
      f_Panel118.add(get_f_PanelBody121());
      f_Panel118.add(get_f_PanelFooter133());

      return f_Panel118;
    }

    /**
     * Getter for f_PanelHeader119 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader119() {
      return build_f_PanelHeader119();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader119() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader119 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader119.add(get_f_Heading120());

      return f_PanelHeader119;
    }

    /**
     * Getter for f_Heading120 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading120() {
      return build_f_Heading120();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading120() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading120 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading120.setText("Selected Text");

      return f_Heading120;
    }

    /**
     * Getter for f_PanelBody121 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody121() {
      return build_f_PanelBody121();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody121() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody121 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody121.add(get_f_Row122());

      return f_PanelBody121;
    }

    /**
     * Getter for f_Row122 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row122() {
      return build_f_Row122();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row122() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row122 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row122.add(get_f_Column123());
      f_Row122.add(get_f_Column128());

      return f_Row122;
    }

    /**
     * Getter for f_Column123 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column123() {
      return build_f_Column123();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column123() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column123 = new org.gwtbootstrap3.client.ui.Column("XS_6");
      // Setup section.
      f_Column123.add(get_f_Select124());

      return f_Column123;
    }

    /**
     * Getter for f_Select124 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select124() {
      return build_f_Select124();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select124() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select124 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select124.add(get_f_Option125());
      f_Select124.add(get_f_Option126());
      f_Select124.add(get_f_Option127());

      return f_Select124;
    }

    /**
     * Getter for f_Option125 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option125() {
      return build_f_Option125();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option125() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option125 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option125.setText("Hot Dog, Fries and a Soda");
      f_Option125.setTitle("Combo 1");

      return f_Option125;
    }

    /**
     * Getter for f_Option126 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option126() {
      return build_f_Option126();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option126() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option126 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option126.setText("Burger, Shake and a Smile");
      f_Option126.setTitle("Combo 2");

      return f_Option126;
    }

    /**
     * Getter for f_Option127 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option127() {
      return build_f_Option127();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option127() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option127 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option127.setText("Sugar, Spice and all things nice");
      f_Option127.setTitle("Combo 3");

      return f_Option127;
    }

    /**
     * Getter for f_Column128 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column128() {
      return build_f_Column128();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column128() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column128 = new org.gwtbootstrap3.client.ui.Column("XS_6");
      // Setup section.
      f_Column128.add(get_f_MultipleSelect129());

      return f_Column128;
    }

    /**
     * Getter for f_MultipleSelect129 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect129() {
      return build_f_MultipleSelect129();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect129() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect129 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect129.add(get_f_Option130());
      f_MultipleSelect129.add(get_f_Option131());
      f_MultipleSelect129.add(get_f_Option132());

      return f_MultipleSelect129;
    }

    /**
     * Getter for f_Option130 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option130() {
      return build_f_Option130();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option130() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option130 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option130.setText("Hot Dog, Fries and a Soda");
      f_Option130.setTitle("Combo 1");

      return f_Option130;
    }

    /**
     * Getter for f_Option131 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option131() {
      return build_f_Option131();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option131() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option131 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option131.setText("Burger, Shake and a Smile");
      f_Option131.setTitle("Combo 2");

      return f_Option131;
    }

    /**
     * Getter for f_Option132 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option132() {
      return build_f_Option132();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option132() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option132 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option132.setText("Sugar, Spice and all things nice");
      f_Option132.setTitle("Combo 3");

      return f_Option132;
    }

    /**
     * Getter for f_PanelFooter133 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter133() {
      return build_f_PanelFooter133();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter133() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter133 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter133.add(get_f_PrettyPre134());

      return f_PanelFooter133;
    }

    /**
     * Getter for f_PrettyPre134 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre134() {
      return build_f_PrettyPre134();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre134() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre134 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre134.setHTML(template_html18().asString());
      f_PrettyPre134.addStyleName("lang-xml");

      return f_PrettyPre134;
    }

    /**
     * Getter for f_Panel135 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel135() {
      return build_f_Panel135();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel135() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel135 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel135.add(get_f_PanelHeader136());
      f_Panel135.add(get_f_PanelBody138());
      f_Panel135.add(get_f_PanelFooter169());

      return f_Panel135;
    }

    /**
     * Getter for f_PanelHeader136 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader136() {
      return build_f_PanelHeader136();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader136() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader136 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader136.add(get_f_Heading137());

      return f_PanelHeader136;
    }

    /**
     * Getter for f_Heading137 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading137() {
      return build_f_Heading137();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading137() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading137 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading137.setText("Selected Text Format (Multiple Only)");

      return f_Heading137;
    }

    /**
     * Getter for f_PanelBody138 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody138() {
      return build_f_PanelBody138();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody138() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody138 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody138.add(get_f_Row139());
      f_PanelBody138.add(get_f_Row148());

      return f_PanelBody138;
    }

    /**
     * Getter for f_Row139 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row139() {
      return build_f_Row139();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row139() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row139 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row139.add(get_f_Column140());
      f_Row139.add(get_f_Column142());
      f_Row139.add(get_f_Column144());
      f_Row139.add(get_f_Column146());

      return f_Row139;
    }

    /**
     * Getter for f_Column140 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column140() {
      return build_f_Column140();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column140() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column140 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column140.add(get_f_FormLabel141());

      return f_Column140;
    }

    /**
     * Getter for f_FormLabel141 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel141() {
      return build_f_FormLabel141();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel141() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel141 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel141.setHTML(template_html19().asString());
      f_FormLabel141.setFor("selectedTextFormat1");

      return f_FormLabel141;
    }

    /**
     * Getter for f_Column142 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column142() {
      return build_f_Column142();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column142() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column142 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column142.add(get_f_FormLabel143());

      return f_Column142;
    }

    /**
     * Getter for f_FormLabel143 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel143() {
      return build_f_FormLabel143();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel143() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel143 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel143.setHTML(template_html20().asString());
      f_FormLabel143.setFor("selectedTextFormat2");

      return f_FormLabel143;
    }

    /**
     * Getter for f_Column144 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column144() {
      return build_f_Column144();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column144() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column144 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column144.add(get_f_FormLabel145());

      return f_Column144;
    }

    /**
     * Getter for f_FormLabel145 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel145() {
      return build_f_FormLabel145();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel145() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel145 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel145.setHTML(template_html21().asString());
      f_FormLabel145.setFor("selectedTextFormat3");

      return f_FormLabel145;
    }

    /**
     * Getter for f_Column146 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column146() {
      return build_f_Column146();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column146() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column146 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column146.add(get_f_FormLabel147());

      return f_Column146;
    }

    /**
     * Getter for f_FormLabel147 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel147() {
      return build_f_FormLabel147();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel147() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel147 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel147.setHTML(template_html22().asString());
      f_FormLabel147.setFor("selectedTextFormat4");

      return f_FormLabel147;
    }

    /**
     * Getter for f_Row148 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row148() {
      return build_f_Row148();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row148() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row148 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row148.add(get_f_Column149());
      f_Row148.add(get_f_Column154());
      f_Row148.add(get_f_Column159());
      f_Row148.add(get_f_Column164());

      return f_Row148;
    }

    /**
     * Getter for f_Column149 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column149() {
      return build_f_Column149();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column149() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column149 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column149.add(get_f_MultipleSelect150());

      return f_Column149;
    }

    /**
     * Getter for f_MultipleSelect150 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect150() {
      return build_f_MultipleSelect150();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect150() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect150 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect150.add(get_f_Option151());
      f_MultipleSelect150.add(get_f_Option152());
      f_MultipleSelect150.add(get_f_Option153());
      f_MultipleSelect150.setSelectedTextFormat(org.gwtbootstrap3.extras.select.client.ui.constants.SelectedTextFormat.VALUES);
      f_MultipleSelect150.setId("selectedTextFormat1");

      return f_MultipleSelect150;
    }

    /**
     * Getter for f_Option151 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option151() {
      return build_f_Option151();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option151() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option151 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option151.setText("Mustard");

      return f_Option151;
    }

    /**
     * Getter for f_Option152 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option152() {
      return build_f_Option152();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option152() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option152 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option152.setText("Ketchup");

      return f_Option152;
    }

    /**
     * Getter for f_Option153 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option153() {
      return build_f_Option153();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option153() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option153 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option153.setText("Relish");

      return f_Option153;
    }

    /**
     * Getter for f_Column154 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column154() {
      return build_f_Column154();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column154() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column154 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column154.add(get_f_MultipleSelect155());

      return f_Column154;
    }

    /**
     * Getter for f_MultipleSelect155 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect155() {
      return build_f_MultipleSelect155();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect155() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect155 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect155.add(get_f_Option156());
      f_MultipleSelect155.add(get_f_Option157());
      f_MultipleSelect155.add(get_f_Option158());
      f_MultipleSelect155.setSelectedTextFormat(org.gwtbootstrap3.extras.select.client.ui.constants.SelectedTextFormat.COUNT);
      f_MultipleSelect155.setId("selectedTextFormat2");

      return f_MultipleSelect155;
    }

    /**
     * Getter for f_Option156 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option156() {
      return build_f_Option156();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option156() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option156 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option156.setText("Mustard");

      return f_Option156;
    }

    /**
     * Getter for f_Option157 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option157() {
      return build_f_Option157();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option157() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option157 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option157.setText("Ketchup");

      return f_Option157;
    }

    /**
     * Getter for f_Option158 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option158() {
      return build_f_Option158();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option158() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option158 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option158.setText("Relish");

      return f_Option158;
    }

    /**
     * Getter for f_Column159 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column159() {
      return build_f_Column159();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column159() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column159 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column159.add(get_f_MultipleSelect160());

      return f_Column159;
    }

    /**
     * Getter for f_MultipleSelect160 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect160() {
      return build_f_MultipleSelect160();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect160() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect160 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect160.add(get_f_Option161());
      f_MultipleSelect160.add(get_f_Option162());
      f_MultipleSelect160.add(get_f_Option163());
      f_MultipleSelect160.setSelectedTextFormat(org.gwtbootstrap3.extras.select.client.ui.constants.SelectedTextFormat.STATIC);
      f_MultipleSelect160.setId("selectedTextFormat3");

      return f_MultipleSelect160;
    }

    /**
     * Getter for f_Option161 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option161() {
      return build_f_Option161();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option161() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option161 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option161.setText("Mustard");

      return f_Option161;
    }

    /**
     * Getter for f_Option162 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option162() {
      return build_f_Option162();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option162() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option162 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option162.setText("Ketchup");

      return f_Option162;
    }

    /**
     * Getter for f_Option163 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option163() {
      return build_f_Option163();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option163() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option163 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option163.setText("Relish");

      return f_Option163;
    }

    /**
     * Getter for f_Column164 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column164() {
      return build_f_Column164();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column164() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column164 = new org.gwtbootstrap3.client.ui.Column("XS_3");
      // Setup section.
      f_Column164.add(get_f_MultipleSelect165());

      return f_Column164;
    }

    /**
     * Getter for f_MultipleSelect165 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect165() {
      return build_f_MultipleSelect165();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect165() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect165 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect165.add(get_f_Option166());
      f_MultipleSelect165.add(get_f_Option167());
      f_MultipleSelect165.add(get_f_Option168());
      f_MultipleSelect165.setCountSelectedTextFormat(2);
      f_MultipleSelect165.setId("selectedTextFormat4");

      return f_MultipleSelect165;
    }

    /**
     * Getter for f_Option166 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option166() {
      return build_f_Option166();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option166() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option166 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option166.setText("Mustard");

      return f_Option166;
    }

    /**
     * Getter for f_Option167 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option167() {
      return build_f_Option167();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option167() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option167 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option167.setText("Ketchup");

      return f_Option167;
    }

    /**
     * Getter for f_Option168 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option168() {
      return build_f_Option168();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option168() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option168 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option168.setText("Relish");

      return f_Option168;
    }

    /**
     * Getter for f_PanelFooter169 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter169() {
      return build_f_PanelFooter169();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter169() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter169 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter169.add(get_f_PrettyPre170());

      return f_PanelFooter169;
    }

    /**
     * Getter for f_PrettyPre170 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre170() {
      return build_f_PrettyPre170();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre170() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre170 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre170.setHTML(template_html23().asString());
      f_PrettyPre170.addStyleName("lang-xml");

      return f_PrettyPre170;
    }

    /**
     * Getter for f_Panel171 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel171() {
      return build_f_Panel171();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel171() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel171 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel171.add(get_f_PanelHeader172());
      f_Panel171.add(get_f_PanelBody174());
      f_Panel171.add(get_f_PanelFooter211());

      return f_Panel171;
    }

    /**
     * Getter for f_PanelHeader172 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader172() {
      return build_f_PanelHeader172();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader172() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader172 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader172.add(get_f_Heading173());

      return f_PanelHeader172;
    }

    /**
     * Getter for f_Heading173 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading173() {
      return build_f_Heading173();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading173() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading173 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading173.setText("Button classes");

      return f_Heading173;
    }

    /**
     * Getter for f_PanelBody174 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody174() {
      return build_f_PanelBody174();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody174() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody174 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody174.add(get_f_Row175());

      return f_PanelBody174;
    }

    /**
     * Getter for f_Row175 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row175() {
      return build_f_Row175();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row175() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row175 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row175.add(get_f_Column176());
      f_Row175.add(get_f_Column182());
      f_Row175.add(get_f_Column188());
      f_Row175.add(get_f_Column194());
      f_Row175.add(get_f_Column200());
      f_Row175.add(get_f_Column206());

      return f_Row175;
    }

    /**
     * Getter for f_Column176 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column176() {
      return build_f_Column176();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column176() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column176 = new org.gwtbootstrap3.client.ui.Column("SM_2");
      // Setup section.
      f_Column176.add(get_f_Select177());

      return f_Column176;
    }

    /**
     * Getter for f_Select177 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select177() {
      return build_f_Select177();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select177() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select177 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select177.add(get_f_Option178());
      f_Select177.add(get_f_Option179());
      f_Select177.add(get_f_Option180());
      f_Select177.add(get_f_Option181());
      f_Select177.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Select177;
    }

    /**
     * Getter for f_Option178 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option178() {
      return build_f_Option178();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option178() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option178 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option178.setText("PRIMARY");

      return f_Option178;
    }

    /**
     * Getter for f_Option179 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option179() {
      return build_f_Option179();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option179() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option179 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option179.setText("Mustard");

      return f_Option179;
    }

    /**
     * Getter for f_Option180 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option180() {
      return build_f_Option180();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option180() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option180 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option180.setText("Ketchup");

      return f_Option180;
    }

    /**
     * Getter for f_Option181 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option181() {
      return build_f_Option181();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option181() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option181 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option181.setText("Relish");

      return f_Option181;
    }

    /**
     * Getter for f_Column182 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column182() {
      return build_f_Column182();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column182() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column182 = new org.gwtbootstrap3.client.ui.Column("SM_2");
      // Setup section.
      f_Column182.add(get_f_Select183());

      return f_Column182;
    }

    /**
     * Getter for f_Select183 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select183() {
      return build_f_Select183();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select183() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select183 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select183.add(get_f_Option184());
      f_Select183.add(get_f_Option185());
      f_Select183.add(get_f_Option186());
      f_Select183.add(get_f_Option187());
      f_Select183.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.INFO);

      return f_Select183;
    }

    /**
     * Getter for f_Option184 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option184() {
      return build_f_Option184();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option184() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option184 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option184.setText("INFO");

      return f_Option184;
    }

    /**
     * Getter for f_Option185 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option185() {
      return build_f_Option185();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option185() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option185 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option185.setText("Mustard");

      return f_Option185;
    }

    /**
     * Getter for f_Option186 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option186() {
      return build_f_Option186();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option186() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option186 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option186.setText("Ketchup");

      return f_Option186;
    }

    /**
     * Getter for f_Option187 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option187() {
      return build_f_Option187();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option187() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option187 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option187.setText("Relish");

      return f_Option187;
    }

    /**
     * Getter for f_Column188 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column188() {
      return build_f_Column188();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column188() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column188 = new org.gwtbootstrap3.client.ui.Column("SM_2");
      // Setup section.
      f_Column188.add(get_f_Select189());

      return f_Column188;
    }

    /**
     * Getter for f_Select189 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select189() {
      return build_f_Select189();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select189() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select189 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select189.add(get_f_Option190());
      f_Select189.add(get_f_Option191());
      f_Select189.add(get_f_Option192());
      f_Select189.add(get_f_Option193());
      f_Select189.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.SUCCESS);

      return f_Select189;
    }

    /**
     * Getter for f_Option190 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option190() {
      return build_f_Option190();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option190() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option190 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option190.setText("SUCCESS");

      return f_Option190;
    }

    /**
     * Getter for f_Option191 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option191() {
      return build_f_Option191();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option191() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option191 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option191.setText("Mustard");

      return f_Option191;
    }

    /**
     * Getter for f_Option192 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option192() {
      return build_f_Option192();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option192() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option192 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option192.setText("Ketchup");

      return f_Option192;
    }

    /**
     * Getter for f_Option193 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option193() {
      return build_f_Option193();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option193() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option193 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option193.setText("Relish");

      return f_Option193;
    }

    /**
     * Getter for f_Column194 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column194() {
      return build_f_Column194();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column194() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column194 = new org.gwtbootstrap3.client.ui.Column("SM_2");
      // Setup section.
      f_Column194.add(get_f_Select195());

      return f_Column194;
    }

    /**
     * Getter for f_Select195 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select195() {
      return build_f_Select195();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select195() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select195 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select195.add(get_f_Option196());
      f_Select195.add(get_f_Option197());
      f_Select195.add(get_f_Option198());
      f_Select195.add(get_f_Option199());
      f_Select195.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.WARNING);

      return f_Select195;
    }

    /**
     * Getter for f_Option196 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option196() {
      return build_f_Option196();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option196() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option196 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option196.setText("WARNING");

      return f_Option196;
    }

    /**
     * Getter for f_Option197 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option197() {
      return build_f_Option197();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option197() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option197 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option197.setText("Mustard");

      return f_Option197;
    }

    /**
     * Getter for f_Option198 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option198() {
      return build_f_Option198();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option198() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option198 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option198.setText("Ketchup");

      return f_Option198;
    }

    /**
     * Getter for f_Option199 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option199() {
      return build_f_Option199();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option199() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option199 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option199.setText("Relish");

      return f_Option199;
    }

    /**
     * Getter for f_Column200 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column200() {
      return build_f_Column200();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column200() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column200 = new org.gwtbootstrap3.client.ui.Column("SM_2");
      // Setup section.
      f_Column200.add(get_f_Select201());

      return f_Column200;
    }

    /**
     * Getter for f_Select201 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select201() {
      return build_f_Select201();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select201() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select201 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select201.add(get_f_Option202());
      f_Select201.add(get_f_Option203());
      f_Select201.add(get_f_Option204());
      f_Select201.add(get_f_Option205());
      f_Select201.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);

      return f_Select201;
    }

    /**
     * Getter for f_Option202 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option202() {
      return build_f_Option202();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option202() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option202 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option202.setText("DANGER");

      return f_Option202;
    }

    /**
     * Getter for f_Option203 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option203() {
      return build_f_Option203();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option203() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option203 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option203.setText("Mustard");

      return f_Option203;
    }

    /**
     * Getter for f_Option204 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option204() {
      return build_f_Option204();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option204() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option204 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option204.setText("Ketchup");

      return f_Option204;
    }

    /**
     * Getter for f_Option205 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option205() {
      return build_f_Option205();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option205() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option205 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option205.setText("Relish");

      return f_Option205;
    }

    /**
     * Getter for f_Column206 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column206() {
      return build_f_Column206();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column206() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column206 = new org.gwtbootstrap3.client.ui.Column("SM_2");
      // Setup section.
      f_Column206.add(get_f_Select207());

      return f_Column206;
    }

    /**
     * Getter for f_Select207 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select207() {
      return build_f_Select207();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select207() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select207 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select207.add(get_f_Option208());
      f_Select207.add(get_f_Option209());
      f_Select207.add(get_f_Option210());
      f_Select207.setStyle("btn-default");
      f_Select207.setTitle("btn-default");

      return f_Select207;
    }

    /**
     * Getter for f_Option208 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option208() {
      return build_f_Option208();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option208() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option208 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option208.setText("Mustard");

      return f_Option208;
    }

    /**
     * Getter for f_Option209 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option209() {
      return build_f_Option209();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option209() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option209 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option209.setText("Ketchup");

      return f_Option209;
    }

    /**
     * Getter for f_Option210 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option210() {
      return build_f_Option210();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option210() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option210 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option210.setText("Relish");

      return f_Option210;
    }

    /**
     * Getter for f_PanelFooter211 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter211() {
      return build_f_PanelFooter211();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter211() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter211 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter211.add(get_f_PrettyPre212());

      return f_PanelFooter211;
    }

    /**
     * Getter for f_PrettyPre212 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre212() {
      return build_f_PrettyPre212();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre212() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre212 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre212.setHTML(template_html24().asString());
      f_PrettyPre212.addStyleName("lang-xml");

      return f_PrettyPre212;
    }

    /**
     * Getter for f_Panel213 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel213() {
      return build_f_Panel213();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel213() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel213 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel213.add(get_f_PanelHeader214());
      f_Panel213.add(get_f_PanelBody216());
      f_Panel213.add(get_f_PanelFooter221());

      return f_Panel213;
    }

    /**
     * Getter for f_PanelHeader214 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader214() {
      return build_f_PanelHeader214();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader214() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader214 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader214.add(get_f_Heading215());

      return f_PanelHeader214;
    }

    /**
     * Getter for f_Heading215 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading215() {
      return build_f_Heading215();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading215() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading215 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading215.setText("Checkmark on selected option (Standard Only)");

      return f_Heading215;
    }

    /**
     * Getter for f_PanelBody216 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody216() {
      return build_f_PanelBody216();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody216() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody216 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody216.add(get_f_Select217());

      return f_PanelBody216;
    }

    /**
     * Getter for f_Select217 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select217() {
      return build_f_Select217();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select217() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select217 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select217.add(get_f_Option218());
      f_Select217.add(get_f_Option219());
      f_Select217.add(get_f_Option220());
      f_Select217.setShowTick(true);

      return f_Select217;
    }

    /**
     * Getter for f_Option218 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option218() {
      return build_f_Option218();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option218() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option218 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option218.setText("Mustard");

      return f_Option218;
    }

    /**
     * Getter for f_Option219 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option219() {
      return build_f_Option219();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option219() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option219 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option219.setText("Ketchup");

      return f_Option219;
    }

    /**
     * Getter for f_Option220 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option220() {
      return build_f_Option220();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option220() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option220 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option220.setText("Relish");

      return f_Option220;
    }

    /**
     * Getter for f_PanelFooter221 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter221() {
      return build_f_PanelFooter221();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter221() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter221 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter221.add(get_f_PrettyPre222());

      return f_PanelFooter221;
    }

    /**
     * Getter for f_PrettyPre222 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre222() {
      return build_f_PrettyPre222();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre222() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre222 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre222.setHTML(template_html25().asString());
      f_PrettyPre222.addStyleName("lang-xml");

      return f_PrettyPre222;
    }

    /**
     * Getter for f_Panel223 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel223() {
      return build_f_Panel223();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel223() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel223 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel223.add(get_f_PanelHeader224());
      f_Panel223.add(get_f_PanelBody226());
      f_Panel223.add(get_f_PanelFooter231());

      return f_Panel223;
    }

    /**
     * Getter for f_PanelHeader224 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader224() {
      return build_f_PanelHeader224();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader224() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader224 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader224.add(get_f_Heading225());

      return f_PanelHeader224;
    }

    /**
     * Getter for f_Heading225 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading225() {
      return build_f_Heading225();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading225() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading225 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading225.setText("Menu Arrow");

      return f_Heading225;
    }

    /**
     * Getter for f_PanelBody226 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody226() {
      return build_f_PanelBody226();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody226() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody226 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody226.add(get_f_Select227());

      return f_PanelBody226;
    }

    /**
     * Getter for f_Select227 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select227() {
      return build_f_Select227();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select227() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select227 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select227.add(get_f_Option228());
      f_Select227.add(get_f_Option229());
      f_Select227.add(get_f_Option230());
      f_Select227.setShowMenuArrow(true);

      return f_Select227;
    }

    /**
     * Getter for f_Option228 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option228() {
      return build_f_Option228();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option228() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option228 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option228.setText("Mustard");

      return f_Option228;
    }

    /**
     * Getter for f_Option229 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option229() {
      return build_f_Option229();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option229() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option229 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option229.setText("Ketchup");

      return f_Option229;
    }

    /**
     * Getter for f_Option230 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option230() {
      return build_f_Option230();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option230() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option230 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option230.setText("Relish");

      return f_Option230;
    }

    /**
     * Getter for f_PanelFooter231 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter231() {
      return build_f_PanelFooter231();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter231() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter231 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter231.add(get_f_PrettyPre232());

      return f_PanelFooter231;
    }

    /**
     * Getter for f_PrettyPre232 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre232() {
      return build_f_PrettyPre232();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre232() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre232 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre232.setHTML(template_html26().asString());
      f_PrettyPre232.addStyleName("lang-xml");

      return f_PrettyPre232;
    }

    /**
     * Getter for f_Panel233 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel233() {
      return build_f_Panel233();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel233() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel233 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel233.add(get_f_PanelHeader234());
      f_Panel233.add(get_f_PanelBody236());
      f_Panel233.add(get_f_PanelFooter241());

      return f_Panel233;
    }

    /**
     * Getter for f_PanelHeader234 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader234() {
      return build_f_PanelHeader234();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader234() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader234 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader234.add(get_f_Heading235());

      return f_PanelHeader234;
    }

    /**
     * Getter for f_Heading235 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading235() {
      return build_f_Heading235();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading235() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading235 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading235.setText("Style individual options");

      return f_Heading235;
    }

    /**
     * Getter for f_PanelBody236 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody236() {
      return build_f_PanelBody236();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody236() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody236 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody236.add(get_f_Select237());

      return f_PanelBody236;
    }

    /**
     * Getter for f_Select237 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select237() {
      return build_f_Select237();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select237() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select237 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select237.add(get_f_Option238());
      f_Select237.add(get_f_Option239());
      f_Select237.add(get_f_Option240());

      return f_Select237;
    }

    /**
     * Getter for f_Option238 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option238() {
      return build_f_Option238();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option238() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option238 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option238.setText("Mustard");

      return f_Option238;
    }

    /**
     * Getter for f_Option239 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option239() {
      return build_f_Option239();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option239() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option239 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option239.addStyleName("" + get_style().special() + "");
      f_Option239.setText("Ketchup");

      return f_Option239;
    }

    /**
     * Getter for f_Option240 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option240() {
      return build_f_Option240();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option240() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option240 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option240.setText("Relish");

      return f_Option240;
    }

    /**
     * Getter for f_PanelFooter241 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter241() {
      return build_f_PanelFooter241();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter241() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter241 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter241.add(get_f_PrettyPre242());

      return f_PanelFooter241;
    }

    /**
     * Getter for f_PrettyPre242 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre242() {
      return build_f_PrettyPre242();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre242() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre242 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre242.setHTML(template_html27().asString());
      f_PrettyPre242.addStyleName("lang-xml");

      return f_PrettyPre242;
    }

    /**
     * Getter for f_Panel243 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel243() {
      return build_f_Panel243();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel243() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel243 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel243.add(get_f_PanelHeader244());
      f_Panel243.add(get_f_PanelBody246());
      f_Panel243.add(get_f_PanelFooter283());

      return f_Panel243;
    }

    /**
     * Getter for f_PanelHeader244 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader244() {
      return build_f_PanelHeader244();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader244() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader244 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader244.add(get_f_Heading245());

      return f_PanelHeader244;
    }

    /**
     * Getter for f_Heading245 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading245() {
      return build_f_Heading245();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading245() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading245 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading245.setText("Width");

      return f_Heading245;
    }

    /**
     * Getter for f_PanelBody246 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody246() {
      return build_f_PanelBody246();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody246() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody246 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody246.add(get_f_Row247());
      f_PanelBody246.add(get_f_Row256());
      f_PanelBody246.add(get_f_Row265());
      f_PanelBody246.add(get_f_Row274());

      return f_PanelBody246;
    }

    /**
     * Getter for f_Row247 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row247() {
      return build_f_Row247();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row247() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row247 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row247.add(get_f_Column248());
      f_Row247.add(get_f_Column250());
      f_Row247.addStyleName("" + get_style().bottom() + "");

      return f_Row247;
    }

    /**
     * Getter for f_Column248 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column248() {
      return build_f_Column248();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column248() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column248 = new org.gwtbootstrap3.client.ui.Column("SM_1");
      // Setup section.
      f_Column248.add(get_f_FormLabel249());

      return f_Column248;
    }

    /**
     * Getter for f_FormLabel249 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel249() {
      return build_f_FormLabel249();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel249() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel249 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel249.setFor("widthAuto");
      f_FormLabel249.setText("AUTO");

      return f_FormLabel249;
    }

    /**
     * Getter for f_Column250 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column250() {
      return build_f_Column250();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column250() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column250 = new org.gwtbootstrap3.client.ui.Column("SM_11");
      // Setup section.
      f_Column250.add(get_f_Select251());

      return f_Column250;
    }

    /**
     * Getter for f_Select251 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select251() {
      return build_f_Select251();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select251() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select251 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select251.add(get_f_Option252());
      f_Select251.add(get_f_Option253());
      f_Select251.add(get_f_Option254());
      f_Select251.add(get_f_Option255());
      f_Select251.setSelectWidth(org.gwtbootstrap3.extras.select.client.ui.constants.SelectWidth.AUTO);
      f_Select251.setId("widthAuto");

      return f_Select251;
    }

    /**
     * Getter for f_Option252 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option252() {
      return build_f_Option252();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option252() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option252 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option252.setText("Mustard");

      return f_Option252;
    }

    /**
     * Getter for f_Option253 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option253() {
      return build_f_Option253();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option253() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option253 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option253.setText("Ketchup");

      return f_Option253;
    }

    /**
     * Getter for f_Option254 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option254() {
      return build_f_Option254();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option254() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option254 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option254.setText("Relish");

      return f_Option254;
    }

    /**
     * Getter for f_Option255 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option255() {
      return build_f_Option255();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option255() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option255 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option255.setText("All of the above (and much, much more!)");

      return f_Option255;
    }

    /**
     * Getter for f_Row256 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row256() {
      return build_f_Row256();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row256() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row256 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row256.add(get_f_Column257());
      f_Row256.add(get_f_Column259());
      f_Row256.addStyleName("" + get_style().bottom() + "");

      return f_Row256;
    }

    /**
     * Getter for f_Column257 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column257() {
      return build_f_Column257();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column257() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column257 = new org.gwtbootstrap3.client.ui.Column("SM_1");
      // Setup section.
      f_Column257.add(get_f_FormLabel258());

      return f_Column257;
    }

    /**
     * Getter for f_FormLabel258 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel258() {
      return build_f_FormLabel258();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel258() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel258 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel258.setFor("widthFit");
      f_FormLabel258.setText("FIT");

      return f_FormLabel258;
    }

    /**
     * Getter for f_Column259 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column259() {
      return build_f_Column259();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column259() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column259 = new org.gwtbootstrap3.client.ui.Column("SM_11");
      // Setup section.
      f_Column259.add(get_f_Select260());

      return f_Column259;
    }

    /**
     * Getter for f_Select260 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select260() {
      return build_f_Select260();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select260() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select260 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select260.add(get_f_Option261());
      f_Select260.add(get_f_Option262());
      f_Select260.add(get_f_Option263());
      f_Select260.add(get_f_Option264());
      f_Select260.setSelectWidth(org.gwtbootstrap3.extras.select.client.ui.constants.SelectWidth.FIT);
      f_Select260.setId("widthFit");

      return f_Select260;
    }

    /**
     * Getter for f_Option261 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option261() {
      return build_f_Option261();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option261() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option261 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option261.setText("Mustard");

      return f_Option261;
    }

    /**
     * Getter for f_Option262 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option262() {
      return build_f_Option262();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option262() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option262 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option262.setText("Ketchup");

      return f_Option262;
    }

    /**
     * Getter for f_Option263 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option263() {
      return build_f_Option263();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option263() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option263 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option263.setText("Relish");

      return f_Option263;
    }

    /**
     * Getter for f_Option264 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option264() {
      return build_f_Option264();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option264() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option264 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option264.setText("All of the above (and much, much more!)");

      return f_Option264;
    }

    /**
     * Getter for f_Row265 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row265() {
      return build_f_Row265();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row265() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row265 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row265.add(get_f_Column266());
      f_Row265.add(get_f_Column268());
      f_Row265.addStyleName("" + get_style().bottom() + "");

      return f_Row265;
    }

    /**
     * Getter for f_Column266 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column266() {
      return build_f_Column266();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column266() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column266 = new org.gwtbootstrap3.client.ui.Column("SM_1");
      // Setup section.
      f_Column266.add(get_f_FormLabel267());

      return f_Column266;
    }

    /**
     * Getter for f_FormLabel267 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel267() {
      return build_f_FormLabel267();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel267() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel267 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel267.setFor("width100px");
      f_FormLabel267.setText("100px");

      return f_FormLabel267;
    }

    /**
     * Getter for f_Column268 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column268() {
      return build_f_Column268();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column268() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column268 = new org.gwtbootstrap3.client.ui.Column("SM_11");
      // Setup section.
      f_Column268.add(get_f_Select269());

      return f_Column268;
    }

    /**
     * Getter for f_Select269 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select269() {
      return build_f_Select269();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select269() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select269 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select269.add(get_f_Option270());
      f_Select269.add(get_f_Option271());
      f_Select269.add(get_f_Option272());
      f_Select269.add(get_f_Option273());
      f_Select269.setWidth("100px");
      f_Select269.setId("width100px");

      return f_Select269;
    }

    /**
     * Getter for f_Option270 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option270() {
      return build_f_Option270();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option270() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option270 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option270.setText("Mustard");

      return f_Option270;
    }

    /**
     * Getter for f_Option271 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option271() {
      return build_f_Option271();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option271() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option271 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option271.setText("Ketchup");

      return f_Option271;
    }

    /**
     * Getter for f_Option272 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option272() {
      return build_f_Option272();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option272() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option272 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option272.setText("Relish");

      return f_Option272;
    }

    /**
     * Getter for f_Option273 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option273() {
      return build_f_Option273();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option273() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option273 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option273.setText("All of the above (and much, much more!)");

      return f_Option273;
    }

    /**
     * Getter for f_Row274 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row274() {
      return build_f_Row274();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row274() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row274 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row274.add(get_f_Column275());
      f_Row274.add(get_f_Column277());

      return f_Row274;
    }

    /**
     * Getter for f_Column275 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column275() {
      return build_f_Column275();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column275() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column275 = new org.gwtbootstrap3.client.ui.Column("SM_1");
      // Setup section.
      f_Column275.add(get_f_FormLabel276());

      return f_Column275;
    }

    /**
     * Getter for f_FormLabel276 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel276() {
      return build_f_FormLabel276();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel276() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel276 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel276.setFor("width75pc");
      f_FormLabel276.setText("75%");

      return f_FormLabel276;
    }

    /**
     * Getter for f_Column277 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column277() {
      return build_f_Column277();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column277() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column277 = new org.gwtbootstrap3.client.ui.Column("SM_11");
      // Setup section.
      f_Column277.add(get_f_Select278());

      return f_Column277;
    }

    /**
     * Getter for f_Select278 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select278() {
      return build_f_Select278();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select278() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select278 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select278.add(get_f_Option279());
      f_Select278.add(get_f_Option280());
      f_Select278.add(get_f_Option281());
      f_Select278.add(get_f_Option282());
      f_Select278.setWidth("75%");
      f_Select278.setId("width75pc");

      return f_Select278;
    }

    /**
     * Getter for f_Option279 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option279() {
      return build_f_Option279();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option279() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option279 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option279.setText("Mustard");

      return f_Option279;
    }

    /**
     * Getter for f_Option280 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option280() {
      return build_f_Option280();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option280() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option280 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option280.setText("Ketchup");

      return f_Option280;
    }

    /**
     * Getter for f_Option281 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option281() {
      return build_f_Option281();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option281() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option281 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option281.setText("Relish");

      return f_Option281;
    }

    /**
     * Getter for f_Option282 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option282() {
      return build_f_Option282();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option282() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option282 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option282.setText("All of the above (and much, much more!)");

      return f_Option282;
    }

    /**
     * Getter for f_PanelFooter283 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter283() {
      return build_f_PanelFooter283();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter283() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter283 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter283.add(get_f_PrettyPre284());

      return f_PanelFooter283;
    }

    /**
     * Getter for f_PrettyPre284 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre284() {
      return build_f_PrettyPre284();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre284() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre284 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre284.setHTML(template_html28().asString());
      f_PrettyPre284.addStyleName("lang-xml");

      return f_PrettyPre284;
    }

    /**
     * Getter for f_Panel285 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel285() {
      return build_f_Panel285();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel285() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel285 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel285.add(get_f_PanelHeader286());
      f_Panel285.add(get_f_PanelBody288());
      f_Panel285.add(get_f_PanelFooter294());

      return f_Panel285;
    }

    /**
     * Getter for f_PanelHeader286 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader286() {
      return build_f_PanelHeader286();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader286() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader286 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader286.add(get_f_Heading287());

      return f_PanelHeader286;
    }

    /**
     * Getter for f_Heading287 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading287() {
      return build_f_Heading287();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading287() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading287 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading287.setText("Icons");

      return f_Heading287;
    }

    /**
     * Getter for f_PanelBody288 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody288() {
      return build_f_PanelBody288();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody288() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody288 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody288.add(get_f_Select289());

      return f_PanelBody288;
    }

    /**
     * Getter for f_Select289 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select289() {
      return build_f_Select289();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select289() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select289 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select289.add(get_f_OptGroup290());

      return f_Select289;
    }

    /**
     * Getter for f_OptGroup290 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup get_f_OptGroup290() {
      return build_f_OptGroup290();
    }
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup build_f_OptGroup290() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.OptGroup f_OptGroup290 = new org.gwtbootstrap3.extras.select.client.ui.OptGroup();
      // Setup section.
      f_OptGroup290.add(get_f_Option291());
      f_OptGroup290.add(get_f_Option292());
      f_OptGroup290.add(get_f_Option293());
      f_OptGroup290.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.CODE_FORK);
      f_OptGroup290.setLabel("Picnic");

      return f_OptGroup290;
    }

    /**
     * Getter for f_Option291 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option291() {
      return build_f_Option291();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option291() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option291 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option291.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.AMBULANCE);
      f_Option291.setText("Mustard");

      return f_Option291;
    }

    /**
     * Getter for f_Option292 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option292() {
      return build_f_Option292();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option292() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option292 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option292.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.ANDROID);
      f_Option292.setText("Ketchup");

      return f_Option292;
    }

    /**
     * Getter for f_Option293 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option293() {
      return build_f_Option293();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option293() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option293 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option293.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.FIGHTER_JET);
      f_Option293.setText("Relish");

      return f_Option293;
    }

    /**
     * Getter for f_PanelFooter294 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter294() {
      return build_f_PanelFooter294();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter294() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter294 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter294.add(get_f_PrettyPre295());

      return f_PanelFooter294;
    }

    /**
     * Getter for f_PrettyPre295 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre295() {
      return build_f_PrettyPre295();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre295() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre295 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre295.setHTML(template_html29().asString());
      f_PrettyPre295.addStyleName("lang-xml");

      return f_PrettyPre295;
    }

    /**
     * Getter for f_Panel296 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel296() {
      return build_f_Panel296();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel296() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel296 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel296.add(get_f_PanelHeader297());
      f_Panel296.add(get_f_PanelBody299());
      f_Panel296.add(get_f_PanelFooter305());

      return f_Panel296;
    }

    /**
     * Getter for f_PanelHeader297 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader297() {
      return build_f_PanelHeader297();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader297() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader297 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader297.add(get_f_Heading298());

      return f_PanelHeader297;
    }

    /**
     * Getter for f_Heading298 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading298() {
      return build_f_Heading298();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading298() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading298 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading298.setText("Custom content");

      return f_Heading298;
    }

    /**
     * Getter for f_PanelBody299 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody299() {
      return build_f_PanelBody299();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody299() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody299 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody299.add(get_f_Select300());

      return f_PanelBody299;
    }

    /**
     * Getter for f_Select300 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select300() {
      return build_f_Select300();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select300() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select300 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select300.add(get_f_Option301());
      f_Select300.add(get_f_Option302());
      f_Select300.add(get_f_Option303());
      f_Select300.add(get_f_Option304());

      return f_Select300;
    }

    /**
     * Getter for f_Option301 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option301() {
      return build_f_Option301();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option301() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option301 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option301.setText("Mustard");
      f_Option301.setContent("<span class='label label-warning'>Mustard</span>");

      return f_Option301;
    }

    /**
     * Getter for f_Option302 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option302() {
      return build_f_Option302();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option302() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option302 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option302.setText("Ketchup");
      f_Option302.setContent("<span class='label label-danger'>Ketchup</span>");

      return f_Option302;
    }

    /**
     * Getter for f_Option303 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option303() {
      return build_f_Option303();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option303() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option303 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option303.setText("Relish");
      f_Option303.setContent("<span class='label label-success'>Relish</span>");

      return f_Option303;
    }

    /**
     * Getter for f_Option304 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option304() {
      return build_f_Option304();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option304() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option304 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option304.setText("Mayonnaise");
      f_Option304.setContent("<span class='label label-info'>Mayonnaise</span>");

      return f_Option304;
    }

    /**
     * Getter for f_PanelFooter305 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter305() {
      return build_f_PanelFooter305();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter305() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter305 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter305.add(get_f_PrettyPre306());

      return f_PanelFooter305;
    }

    /**
     * Getter for f_PrettyPre306 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre306() {
      return build_f_PrettyPre306();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre306() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre306 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre306.setHTML(template_html30().asString());
      f_PrettyPre306.addStyleName("lang-xml");

      return f_PrettyPre306;
    }

    /**
     * Getter for f_Panel307 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel307() {
      return build_f_Panel307();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel307() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel307 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel307.add(get_f_PanelHeader308());
      f_Panel307.add(get_f_PanelBody310());
      f_Panel307.add(get_f_PanelFooter324());

      return f_Panel307;
    }

    /**
     * Getter for f_PanelHeader308 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader308() {
      return build_f_PanelHeader308();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader308() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader308 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader308.add(get_f_Heading309());

      return f_PanelHeader308;
    }

    /**
     * Getter for f_Heading309 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading309() {
      return build_f_Heading309();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading309() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading309 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading309.setText("Subtext");

      return f_Heading309;
    }

    /**
     * Getter for f_PanelBody310 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody310() {
      return build_f_PanelBody310();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody310() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody310 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody310.add(get_f_Row311());

      return f_PanelBody310;
    }

    /**
     * Getter for f_Row311 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row311() {
      return build_f_Row311();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row311() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row311 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row311.add(get_f_Column312());
      f_Row311.add(get_f_Column318());

      return f_Row311;
    }

    /**
     * Getter for f_Column312 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column312() {
      return build_f_Column312();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column312() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column312 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column312.add(get_f_Select313());

      return f_Column312;
    }

    /**
     * Getter for f_Select313 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select313() {
      return build_f_Select313();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select313() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select313 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select313.add(get_f_Option314());
      f_Select313.add(get_f_Option315());
      f_Select313.add(get_f_Option316());
      f_Select313.add(get_f_Option317());

      return f_Select313;
    }

    /**
     * Getter for f_Option314 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option314() {
      return build_f_Option314();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option314() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option314 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option314.setSubtext("French's");
      f_Option314.setText("Mustard");

      return f_Option314;
    }

    /**
     * Getter for f_Option315 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option315() {
      return build_f_Option315();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option315() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option315 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option315.setSubtext("Heinz");
      f_Option315.setText("Ketchup");

      return f_Option315;
    }

    /**
     * Getter for f_Option316 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option316() {
      return build_f_Option316();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option316() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option316 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option316.setSubtext("Sweet");
      f_Option316.setText("Relish");

      return f_Option316;
    }

    /**
     * Getter for f_Option317 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option317() {
      return build_f_Option317();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option317() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option317 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option317.setSubtext("Miracle Whip");
      f_Option317.setText("Mayonnaise");

      return f_Option317;
    }

    /**
     * Getter for f_Column318 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column318() {
      return build_f_Column318();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column318() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column318 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column318.add(get_f_Select319());

      return f_Column318;
    }

    /**
     * Getter for f_Select319 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select319() {
      return build_f_Select319();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select319() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select319 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select319.add(get_f_Option320());
      f_Select319.add(get_f_Option321());
      f_Select319.add(get_f_Option322());
      f_Select319.add(get_f_Option323());
      f_Select319.setShowSubtext(true);

      return f_Select319;
    }

    /**
     * Getter for f_Option320 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option320() {
      return build_f_Option320();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option320() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option320 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option320.setSubtext("French's");
      f_Option320.setText("Mustard");

      return f_Option320;
    }

    /**
     * Getter for f_Option321 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option321() {
      return build_f_Option321();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option321() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option321 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option321.setSubtext("Heinz");
      f_Option321.setText("Ketchup");

      return f_Option321;
    }

    /**
     * Getter for f_Option322 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option322() {
      return build_f_Option322();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option322() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option322 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option322.setSubtext("Sweet");
      f_Option322.setText("Relish");

      return f_Option322;
    }

    /**
     * Getter for f_Option323 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option323() {
      return build_f_Option323();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option323() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option323 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option323.setSubtext("Miracle Whip");
      f_Option323.setText("Mayonnaise");

      return f_Option323;
    }

    /**
     * Getter for f_PanelFooter324 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter324() {
      return build_f_PanelFooter324();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter324() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter324 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter324.add(get_f_PrettyPre325());

      return f_PanelFooter324;
    }

    /**
     * Getter for f_PrettyPre325 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre325() {
      return build_f_PrettyPre325();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre325() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre325 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre325.setHTML(template_html31().asString());
      f_PrettyPre325.addStyleName("lang-xml");

      return f_PrettyPre325;
    }

    /**
     * Getter for f_Panel326 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel326() {
      return build_f_Panel326();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel326() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel326 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel326.add(get_f_PanelHeader327());
      f_Panel326.add(get_f_PanelBody329());
      f_Panel326.add(get_f_PanelFooter393());

      return f_Panel326;
    }

    /**
     * Getter for f_PanelHeader327 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader327() {
      return build_f_PanelHeader327();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader327() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader327 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader327.add(get_f_Heading328());

      return f_PanelHeader327;
    }

    /**
     * Getter for f_Heading328 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading328() {
      return build_f_Heading328();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading328() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading328 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading328.setText("Menu size");

      return f_Heading328;
    }

    /**
     * Getter for f_PanelBody329 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody329() {
      return build_f_PanelBody329();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody329() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody329 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody329.add(get_f_Row330());

      return f_PanelBody329;
    }

    /**
     * Getter for f_Row330 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row330() {
      return build_f_Row330();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row330() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row330 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row330.add(get_f_Column331());
      f_Row330.add(get_f_Column357());
      f_Row330.add(get_f_Column383());

      return f_Row330;
    }

    /**
     * Getter for f_Column331 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column331() {
      return build_f_Column331();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column331() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column331 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column331.add(get_f_Select332());

      return f_Column331;
    }

    /**
     * Getter for f_Select332 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select332() {
      return build_f_Select332();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select332() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select332 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select332.add(get_f_Option333());
      f_Select332.add(get_f_Option334());
      f_Select332.add(get_f_Option335());
      f_Select332.add(get_f_Option336());
      f_Select332.add(get_f_Option337());
      f_Select332.add(get_f_Option338());
      f_Select332.add(get_f_Option339());
      f_Select332.add(get_f_Option340());
      f_Select332.add(get_f_Option341());
      f_Select332.add(get_f_Option342());
      f_Select332.add(get_f_Option343());
      f_Select332.add(get_f_Option344());
      f_Select332.add(get_f_Option345());
      f_Select332.add(get_f_Option346());
      f_Select332.add(get_f_Option347());
      f_Select332.add(get_f_Option348());
      f_Select332.add(get_f_Option349());
      f_Select332.add(get_f_Option350());
      f_Select332.add(get_f_Option351());
      f_Select332.add(get_f_Option352());
      f_Select332.add(get_f_Option353());
      f_Select332.add(get_f_Option354());
      f_Select332.add(get_f_Option355());
      f_Select332.add(get_f_Option356());
      f_Select332.setMenuSize(org.gwtbootstrap3.extras.select.client.ui.constants.MenuSize.AUTO);
      f_Select332.setTitle("menuSize: AUTO");

      return f_Select332;
    }

    /**
     * Getter for f_Option333 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option333() {
      return build_f_Option333();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option333() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option333 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option333.setText("Mustard");

      return f_Option333;
    }

    /**
     * Getter for f_Option334 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option334() {
      return build_f_Option334();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option334() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option334 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option334.setText("Ketchup");

      return f_Option334;
    }

    /**
     * Getter for f_Option335 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option335() {
      return build_f_Option335();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option335() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option335 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option335.setText("Relish");

      return f_Option335;
    }

    /**
     * Getter for f_Option336 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option336() {
      return build_f_Option336();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option336() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option336 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option336.setText("Mayonnaise");

      return f_Option336;
    }

    /**
     * Getter for f_Option337 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option337() {
      return build_f_Option337();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option337() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option337 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option337.setText("Barbecue Sauce");

      return f_Option337;
    }

    /**
     * Getter for f_Option338 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option338() {
      return build_f_Option338();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option338() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option338 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option338.setText("Salad Dressing");

      return f_Option338;
    }

    /**
     * Getter for f_Option339 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option339() {
      return build_f_Option339();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option339() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option339 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option339.setText("Tabasco");

      return f_Option339;
    }

    /**
     * Getter for f_Option340 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option340() {
      return build_f_Option340();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option340() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option340 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option340.setText("Salsa");

      return f_Option340;
    }

    /**
     * Getter for f_Option341 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option341() {
      return build_f_Option341();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option341() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option341 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option341.setText("Mustard");

      return f_Option341;
    }

    /**
     * Getter for f_Option342 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option342() {
      return build_f_Option342();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option342() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option342 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option342.setText("Ketchup");

      return f_Option342;
    }

    /**
     * Getter for f_Option343 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option343() {
      return build_f_Option343();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option343() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option343 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option343.setText("Relish");

      return f_Option343;
    }

    /**
     * Getter for f_Option344 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option344() {
      return build_f_Option344();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option344() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option344 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option344.setText("Mayonnaise");

      return f_Option344;
    }

    /**
     * Getter for f_Option345 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option345() {
      return build_f_Option345();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option345() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option345 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option345.setText("Barbecue Sauce");

      return f_Option345;
    }

    /**
     * Getter for f_Option346 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option346() {
      return build_f_Option346();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option346() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option346 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option346.setText("Salad Dressing");

      return f_Option346;
    }

    /**
     * Getter for f_Option347 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option347() {
      return build_f_Option347();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option347() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option347 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option347.setText("Tabasco");

      return f_Option347;
    }

    /**
     * Getter for f_Option348 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option348() {
      return build_f_Option348();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option348() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option348 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option348.setText("Salsa");

      return f_Option348;
    }

    /**
     * Getter for f_Option349 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option349() {
      return build_f_Option349();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option349() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option349 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option349.setText("Mustard");

      return f_Option349;
    }

    /**
     * Getter for f_Option350 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option350() {
      return build_f_Option350();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option350() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option350 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option350.setText("Ketchup");

      return f_Option350;
    }

    /**
     * Getter for f_Option351 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option351() {
      return build_f_Option351();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option351() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option351 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option351.setText("Relish");

      return f_Option351;
    }

    /**
     * Getter for f_Option352 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option352() {
      return build_f_Option352();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option352() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option352 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option352.setText("Mayonnaise");

      return f_Option352;
    }

    /**
     * Getter for f_Option353 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option353() {
      return build_f_Option353();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option353() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option353 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option353.setText("Barbecue Sauce");

      return f_Option353;
    }

    /**
     * Getter for f_Option354 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option354() {
      return build_f_Option354();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option354() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option354 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option354.setText("Salad Dressing");

      return f_Option354;
    }

    /**
     * Getter for f_Option355 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option355() {
      return build_f_Option355();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option355() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option355 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option355.setText("Tabasco");

      return f_Option355;
    }

    /**
     * Getter for f_Option356 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option356() {
      return build_f_Option356();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option356() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option356 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option356.setText("Salsa");

      return f_Option356;
    }

    /**
     * Getter for f_Column357 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column357() {
      return build_f_Column357();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column357() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column357 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column357.add(get_f_Select358());

      return f_Column357;
    }

    /**
     * Getter for f_Select358 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select358() {
      return build_f_Select358();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select358() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select358 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select358.add(get_f_Option359());
      f_Select358.add(get_f_Option360());
      f_Select358.add(get_f_Option361());
      f_Select358.add(get_f_Option362());
      f_Select358.add(get_f_Option363());
      f_Select358.add(get_f_Option364());
      f_Select358.add(get_f_Option365());
      f_Select358.add(get_f_Option366());
      f_Select358.add(get_f_Option367());
      f_Select358.add(get_f_Option368());
      f_Select358.add(get_f_Option369());
      f_Select358.add(get_f_Option370());
      f_Select358.add(get_f_Option371());
      f_Select358.add(get_f_Option372());
      f_Select358.add(get_f_Option373());
      f_Select358.add(get_f_Option374());
      f_Select358.add(get_f_Option375());
      f_Select358.add(get_f_Option376());
      f_Select358.add(get_f_Option377());
      f_Select358.add(get_f_Option378());
      f_Select358.add(get_f_Option379());
      f_Select358.add(get_f_Option380());
      f_Select358.add(get_f_Option381());
      f_Select358.add(get_f_Option382());
      f_Select358.setMenuSize(org.gwtbootstrap3.extras.select.client.ui.constants.MenuSize.ALL);
      f_Select358.setTitle("menuSize: ALL");

      return f_Select358;
    }

    /**
     * Getter for f_Option359 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option359() {
      return build_f_Option359();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option359() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option359 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option359.setText("Mustard");

      return f_Option359;
    }

    /**
     * Getter for f_Option360 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option360() {
      return build_f_Option360();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option360() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option360 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option360.setText("Ketchup");

      return f_Option360;
    }

    /**
     * Getter for f_Option361 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option361() {
      return build_f_Option361();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option361() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option361 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option361.setText("Relish");

      return f_Option361;
    }

    /**
     * Getter for f_Option362 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option362() {
      return build_f_Option362();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option362() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option362 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option362.setText("Mayonnaise");

      return f_Option362;
    }

    /**
     * Getter for f_Option363 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option363() {
      return build_f_Option363();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option363() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option363 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option363.setText("Barbecue Sauce");

      return f_Option363;
    }

    /**
     * Getter for f_Option364 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option364() {
      return build_f_Option364();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option364() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option364 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option364.setText("Salad Dressing");

      return f_Option364;
    }

    /**
     * Getter for f_Option365 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option365() {
      return build_f_Option365();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option365() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option365 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option365.setText("Tabasco");

      return f_Option365;
    }

    /**
     * Getter for f_Option366 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option366() {
      return build_f_Option366();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option366() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option366 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option366.setText("Salsa");

      return f_Option366;
    }

    /**
     * Getter for f_Option367 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option367() {
      return build_f_Option367();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option367() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option367 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option367.setText("Mustard");

      return f_Option367;
    }

    /**
     * Getter for f_Option368 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option368() {
      return build_f_Option368();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option368() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option368 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option368.setText("Ketchup");

      return f_Option368;
    }

    /**
     * Getter for f_Option369 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option369() {
      return build_f_Option369();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option369() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option369 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option369.setText("Relish");

      return f_Option369;
    }

    /**
     * Getter for f_Option370 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option370() {
      return build_f_Option370();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option370() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option370 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option370.setText("Mayonnaise");

      return f_Option370;
    }

    /**
     * Getter for f_Option371 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option371() {
      return build_f_Option371();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option371() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option371 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option371.setText("Barbecue Sauce");

      return f_Option371;
    }

    /**
     * Getter for f_Option372 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option372() {
      return build_f_Option372();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option372() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option372 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option372.setText("Salad Dressing");

      return f_Option372;
    }

    /**
     * Getter for f_Option373 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option373() {
      return build_f_Option373();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option373() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option373 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option373.setText("Tabasco");

      return f_Option373;
    }

    /**
     * Getter for f_Option374 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option374() {
      return build_f_Option374();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option374() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option374 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option374.setText("Salsa");

      return f_Option374;
    }

    /**
     * Getter for f_Option375 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option375() {
      return build_f_Option375();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option375() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option375 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option375.setText("Mustard");

      return f_Option375;
    }

    /**
     * Getter for f_Option376 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option376() {
      return build_f_Option376();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option376() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option376 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option376.setText("Ketchup");

      return f_Option376;
    }

    /**
     * Getter for f_Option377 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option377() {
      return build_f_Option377();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option377() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option377 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option377.setText("Relish");

      return f_Option377;
    }

    /**
     * Getter for f_Option378 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option378() {
      return build_f_Option378();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option378() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option378 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option378.setText("Mayonnaise");

      return f_Option378;
    }

    /**
     * Getter for f_Option379 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option379() {
      return build_f_Option379();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option379() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option379 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option379.setText("Barbecue Sauce");

      return f_Option379;
    }

    /**
     * Getter for f_Option380 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option380() {
      return build_f_Option380();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option380() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option380 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option380.setText("Salad Dressing");

      return f_Option380;
    }

    /**
     * Getter for f_Option381 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option381() {
      return build_f_Option381();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option381() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option381 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option381.setText("Tabasco");

      return f_Option381;
    }

    /**
     * Getter for f_Option382 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option382() {
      return build_f_Option382();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option382() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option382 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option382.setText("Salsa");

      return f_Option382;
    }

    /**
     * Getter for f_Column383 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column383() {
      return build_f_Column383();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column383() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column383 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column383.add(get_f_Select384());

      return f_Column383;
    }

    /**
     * Getter for f_Select384 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select384() {
      return build_f_Select384();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select384() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select384 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select384.add(get_f_Option385());
      f_Select384.add(get_f_Option386());
      f_Select384.add(get_f_Option387());
      f_Select384.add(get_f_Option388());
      f_Select384.add(get_f_Option389());
      f_Select384.add(get_f_Option390());
      f_Select384.add(get_f_Option391());
      f_Select384.add(get_f_Option392());
      f_Select384.setFixedMenuSize(5);
      f_Select384.setTitle("fixedMenuSize: 5");

      return f_Select384;
    }

    /**
     * Getter for f_Option385 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option385() {
      return build_f_Option385();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option385() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option385 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option385.setText("Mustard");

      return f_Option385;
    }

    /**
     * Getter for f_Option386 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option386() {
      return build_f_Option386();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option386() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option386 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option386.setText("Ketchup");

      return f_Option386;
    }

    /**
     * Getter for f_Option387 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option387() {
      return build_f_Option387();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option387() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option387 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option387.setText("Relish");

      return f_Option387;
    }

    /**
     * Getter for f_Option388 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option388() {
      return build_f_Option388();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option388() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option388 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option388.setText("Mayonnaise");

      return f_Option388;
    }

    /**
     * Getter for f_Option389 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option389() {
      return build_f_Option389();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option389() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option389 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option389.setText("Barbecue Sauce");

      return f_Option389;
    }

    /**
     * Getter for f_Option390 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option390() {
      return build_f_Option390();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option390() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option390 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option390.setText("Salad Dressing");

      return f_Option390;
    }

    /**
     * Getter for f_Option391 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option391() {
      return build_f_Option391();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option391() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option391 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option391.setText("Tabasco");

      return f_Option391;
    }

    /**
     * Getter for f_Option392 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option392() {
      return build_f_Option392();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option392() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option392 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option392.setText("Salsa");

      return f_Option392;
    }

    /**
     * Getter for f_PanelFooter393 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter393() {
      return build_f_PanelFooter393();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter393() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter393 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter393.add(get_f_PrettyPre394());

      return f_PanelFooter393;
    }

    /**
     * Getter for f_PrettyPre394 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre394() {
      return build_f_PrettyPre394();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre394() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre394 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre394.setHTML(template_html32().asString());
      f_PrettyPre394.addStyleName("lang-xml");

      return f_PrettyPre394;
    }

    /**
     * Getter for f_Panel395 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel395() {
      return build_f_Panel395();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel395() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel395 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel395.add(get_f_PanelHeader396());
      f_Panel395.add(get_f_PanelBody398());
      f_Panel395.add(get_f_PanelFooter410());

      return f_Panel395;
    }

    /**
     * Getter for f_PanelHeader396 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader396() {
      return build_f_PanelHeader396();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader396() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader396 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader396.add(get_f_Heading397());

      return f_PanelHeader396;
    }

    /**
     * Getter for f_Heading397 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading397() {
      return build_f_Heading397();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading397() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading397 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading397.setText("Select/deselect all options");

      return f_Heading397;
    }

    /**
     * Getter for f_PanelBody398 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody398() {
      return build_f_PanelBody398();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody398() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody398 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody398.add(get_f_Row399());

      return f_PanelBody398;
    }

    /**
     * Getter for f_Row399 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row399() {
      return build_f_Row399();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row399() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row399 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row399.add(get_f_Column400());
      f_Row399.add(get_f_Column405());

      return f_Row399;
    }

    /**
     * Getter for f_Column400 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column400() {
      return build_f_Column400();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column400() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column400 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column400.add(get_f_MultipleSelect401());

      return f_Column400;
    }

    /**
     * Getter for f_MultipleSelect401 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect401() {
      return build_f_MultipleSelect401();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect401() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect401 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect401.add(get_f_Option402());
      f_MultipleSelect401.add(get_f_Option403());
      f_MultipleSelect401.add(get_f_Option404());
      f_MultipleSelect401.setShowActionsBox(true);

      return f_MultipleSelect401;
    }

    /**
     * Getter for f_Option402 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option402() {
      return build_f_Option402();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option402() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option402 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option402.setText("Mustard");

      return f_Option402;
    }

    /**
     * Getter for f_Option403 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option403() {
      return build_f_Option403();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option403() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option403 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option403.setText("Ketchup");

      return f_Option403;
    }

    /**
     * Getter for f_Option404 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option404() {
      return build_f_Option404();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option404() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option404 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option404.setText("Relish");

      return f_Option404;
    }

    /**
     * Getter for f_Column405 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column405() {
      return build_f_Column405();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column405() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column405 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column405.add(get_f_MultipleSelect406());

      return f_Column405;
    }

    /**
     * Getter for f_MultipleSelect406 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_f_MultipleSelect406() {
      return build_f_MultipleSelect406();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_f_MultipleSelect406() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect f_MultipleSelect406 = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      f_MultipleSelect406.add(get_f_Option407());
      f_MultipleSelect406.add(get_f_Option408());
      f_MultipleSelect406.add(get_f_Option409());
      f_MultipleSelect406.setSelectAllText("Check All");
      f_MultipleSelect406.setDeselectAllText("Uncheck All");
      f_MultipleSelect406.setShowActionsBox(true);

      return f_MultipleSelect406;
    }

    /**
     * Getter for f_Option407 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option407() {
      return build_f_Option407();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option407() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option407 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option407.setText("Mustard");

      return f_Option407;
    }

    /**
     * Getter for f_Option408 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option408() {
      return build_f_Option408();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option408() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option408 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option408.setText("Ketchup");

      return f_Option408;
    }

    /**
     * Getter for f_Option409 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option409() {
      return build_f_Option409();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option409() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option409 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option409.setText("Relish");

      return f_Option409;
    }

    /**
     * Getter for f_PanelFooter410 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter410() {
      return build_f_PanelFooter410();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter410() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter410 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter410.add(get_f_PrettyPre411());

      return f_PanelFooter410;
    }

    /**
     * Getter for f_PrettyPre411 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre411() {
      return build_f_PrettyPre411();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre411() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre411 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre411.setHTML(template_html33().asString());
      f_PrettyPre411.addStyleName("lang-xml");

      return f_PrettyPre411;
    }

    /**
     * Getter for f_Panel412 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel412() {
      return build_f_Panel412();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel412() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel412 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel412.add(get_f_PanelHeader413());
      f_Panel412.add(get_f_PanelBody415());
      f_Panel412.add(get_f_PanelFooter421());

      return f_Panel412;
    }

    /**
     * Getter for f_PanelHeader413 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader413() {
      return build_f_PanelHeader413();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader413() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader413 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader413.add(get_f_Heading414());

      return f_PanelHeader413;
    }

    /**
     * Getter for f_Heading414 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading414() {
      return build_f_Heading414();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading414() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading414 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading414.setText("Divider");

      return f_Heading414;
    }

    /**
     * Getter for f_PanelBody415 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody415() {
      return build_f_PanelBody415();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody415() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody415 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody415.add(get_f_Select416());

      return f_PanelBody415;
    }

    /**
     * Getter for f_Select416 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select416() {
      return build_f_Select416();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select416() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select416 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select416.add(get_f_Option417());
      f_Select416.add(get_f_Option418());
      f_Select416.add(get_f_Option419());
      f_Select416.add(get_f_Option420());

      return f_Select416;
    }

    /**
     * Getter for f_Option417 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option417() {
      return build_f_Option417();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option417() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option417 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option417.setText("Mustard");

      return f_Option417;
    }

    /**
     * Getter for f_Option418 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option418() {
      return build_f_Option418();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option418() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option418 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option418.setDivider(true);

      return f_Option418;
    }

    /**
     * Getter for f_Option419 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option419() {
      return build_f_Option419();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option419() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option419 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option419.setText("Ketchup");

      return f_Option419;
    }

    /**
     * Getter for f_Option420 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option420() {
      return build_f_Option420();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option420() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option420 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option420.setText("Relish");

      return f_Option420;
    }

    /**
     * Getter for f_PanelFooter421 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter421() {
      return build_f_PanelFooter421();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter421() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter421 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter421.add(get_f_PrettyPre422());

      return f_PanelFooter421;
    }

    /**
     * Getter for f_PrettyPre422 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre422() {
      return build_f_PrettyPre422();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre422() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre422 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre422.setHTML(template_html34().asString());
      f_PrettyPre422.addStyleName("lang-xml");

      return f_PrettyPre422;
    }

    /**
     * Getter for f_Panel423 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel423() {
      return build_f_Panel423();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel423() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel423 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel423.add(get_f_PanelHeader424());
      f_Panel423.add(get_f_PanelBody426());
      f_Panel423.add(get_f_PanelFooter432());

      return f_Panel423;
    }

    /**
     * Getter for f_PanelHeader424 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader424() {
      return build_f_PanelHeader424();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader424() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader424 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader424.add(get_f_Heading425());

      return f_PanelHeader424;
    }

    /**
     * Getter for f_Heading425 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading425() {
      return build_f_Heading425();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading425() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading425 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading425.setText("Menu header");

      return f_Heading425;
    }

    /**
     * Getter for f_PanelBody426 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody426() {
      return build_f_PanelBody426();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody426() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody426 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody426.add(get_f_Select427());

      return f_PanelBody426;
    }

    /**
     * Getter for f_Select427 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select427() {
      return build_f_Select427();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select427() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select427 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select427.add(get_f_Option428());
      f_Select427.add(get_f_Option429());
      f_Select427.add(get_f_Option430());
      f_Select427.add(get_f_Option431());
      f_Select427.setHeader("Select a condiment");

      return f_Select427;
    }

    /**
     * Getter for f_Option428 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option428() {
      return build_f_Option428();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option428() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option428 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option428.setSubtext("French's");
      f_Option428.setText("Mustard");

      return f_Option428;
    }

    /**
     * Getter for f_Option429 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option429() {
      return build_f_Option429();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option429() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option429 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option429.setSubtext("Heinz");
      f_Option429.setText("Ketchup");

      return f_Option429;
    }

    /**
     * Getter for f_Option430 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option430() {
      return build_f_Option430();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option430() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option430 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option430.setSubtext("Sweet");
      f_Option430.setText("Relish");

      return f_Option430;
    }

    /**
     * Getter for f_Option431 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option431() {
      return build_f_Option431();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option431() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option431 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option431.setSubtext("Miracle Whip");
      f_Option431.setText("Mayonnaise");

      return f_Option431;
    }

    /**
     * Getter for f_PanelFooter432 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter432() {
      return build_f_PanelFooter432();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter432() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter432 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter432.add(get_f_PrettyPre433());

      return f_PanelFooter432;
    }

    /**
     * Getter for f_PrettyPre433 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre433() {
      return build_f_PrettyPre433();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre433() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre433 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre433.setHTML(template_html35().asString());
      f_PrettyPre433.addStyleName("lang-xml");

      return f_PrettyPre433;
    }

    /**
     * Getter for f_Panel434 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel434() {
      return build_f_Panel434();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel434() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel434 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel434.add(get_f_PanelHeader435());
      f_Panel434.add(get_f_PanelBody437());
      f_Panel434.add(get_f_PanelFooter449());

      return f_Panel434;
    }

    /**
     * Getter for f_PanelHeader435 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader435() {
      return build_f_PanelHeader435();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader435() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader435 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader435.add(get_f_Heading436());

      return f_PanelHeader435;
    }

    /**
     * Getter for f_Heading436 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading436() {
      return build_f_Heading436();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading436() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading436 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading436.setText("Dropup menu");

      return f_Heading436;
    }

    /**
     * Getter for f_PanelBody437 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody437() {
      return build_f_PanelBody437();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody437() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody437 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody437.add(get_f_Row438());

      return f_PanelBody437;
    }

    /**
     * Getter for f_Row438 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row438() {
      return build_f_Row438();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row438() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row438 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row438.add(get_f_Column439());
      f_Row438.add(get_f_Column444());

      return f_Row438;
    }

    /**
     * Getter for f_Column439 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column439() {
      return build_f_Column439();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column439() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column439 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column439.add(get_f_Select440());

      return f_Column439;
    }

    /**
     * Getter for f_Select440 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select440() {
      return build_f_Select440();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select440() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select440 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select440.add(get_f_Option441());
      f_Select440.add(get_f_Option442());
      f_Select440.add(get_f_Option443());
      f_Select440.setDropupAuto(false);

      return f_Select440;
    }

    /**
     * Getter for f_Option441 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option441() {
      return build_f_Option441();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option441() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option441 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option441.setText("Mustard");

      return f_Option441;
    }

    /**
     * Getter for f_Option442 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option442() {
      return build_f_Option442();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option442() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option442 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option442.setText("Ketchup");

      return f_Option442;
    }

    /**
     * Getter for f_Option443 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option443() {
      return build_f_Option443();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option443() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option443 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option443.setText("Relish");

      return f_Option443;
    }

    /**
     * Getter for f_Column444 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column444() {
      return build_f_Column444();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column444() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column444 = new org.gwtbootstrap3.client.ui.Column("SM_6");
      // Setup section.
      f_Column444.add(get_f_Select445());

      return f_Column444;
    }

    /**
     * Getter for f_Select445 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select445() {
      return build_f_Select445();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select445() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select445 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select445.add(get_f_Option446());
      f_Select445.add(get_f_Option447());
      f_Select445.add(get_f_Option448());
      f_Select445.setForceDropup(true);
      f_Select445.setDropupAuto(false);

      return f_Select445;
    }

    /**
     * Getter for f_Option446 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option446() {
      return build_f_Option446();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option446() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option446 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option446.setText("Mustard");

      return f_Option446;
    }

    /**
     * Getter for f_Option447 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option447() {
      return build_f_Option447();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option447() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option447 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option447.setText("Ketchup");

      return f_Option447;
    }

    /**
     * Getter for f_Option448 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option448() {
      return build_f_Option448();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option448() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option448 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option448.setText("Relish");

      return f_Option448;
    }

    /**
     * Getter for f_PanelFooter449 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter449() {
      return build_f_PanelFooter449();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter449() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter449 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter449.add(get_f_PrettyPre450());

      return f_PanelFooter449;
    }

    /**
     * Getter for f_PrettyPre450 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre450() {
      return build_f_PrettyPre450();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre450() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre450 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre450.setHTML(template_html36().asString());
      f_PrettyPre450.addStyleName("lang-xml");

      return f_PrettyPre450;
    }

    /**
     * Getter for f_Panel451 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel451() {
      return build_f_Panel451();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel451() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel451 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel451.add(get_f_PanelHeader452());
      f_Panel451.add(get_f_PanelBody454());
      f_Panel451.add(get_f_PanelFooter483());

      return f_Panel451;
    }

    /**
     * Getter for f_PanelHeader452 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader452() {
      return build_f_PanelHeader452();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader452() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader452 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader452.add(get_f_Heading453());

      return f_PanelHeader452;
    }

    /**
     * Getter for f_Heading453 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading453() {
      return build_f_Heading453();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading453() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading453 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading453.setText("Disabled");

      return f_Heading453;
    }

    /**
     * Getter for f_PanelBody454 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody454() {
      return build_f_PanelBody454();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody454() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody454 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody454.add(get_f_Row455());
      f_PanelBody454.add(get_f_Row462());

      return f_PanelBody454;
    }

    /**
     * Getter for f_Row455 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row455() {
      return build_f_Row455();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row455() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row455 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row455.add(get_f_Column456());
      f_Row455.add(get_f_Column458());
      f_Row455.add(get_f_Column460());

      return f_Row455;
    }

    /**
     * Getter for f_Column456 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column456() {
      return build_f_Column456();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column456() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column456 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column456.add(get_f_FormLabel457());

      return f_Column456;
    }

    /**
     * Getter for f_FormLabel457 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel457() {
      return build_f_FormLabel457();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel457() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel457 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel457.setHTML(template_html37().asString());
      f_FormLabel457.setFor("disabled1");

      return f_FormLabel457;
    }

    /**
     * Getter for f_Column458 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column458() {
      return build_f_Column458();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column458() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column458 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column458.add(get_f_FormLabel459());

      return f_Column458;
    }

    /**
     * Getter for f_FormLabel459 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel459() {
      return build_f_FormLabel459();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel459() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel459 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel459.setHTML(template_html38().asString());
      f_FormLabel459.setFor("disabled2");

      return f_FormLabel459;
    }

    /**
     * Getter for f_Column460 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column460() {
      return build_f_Column460();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column460() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column460 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column460.add(get_f_FormLabel461());

      return f_Column460;
    }

    /**
     * Getter for f_FormLabel461 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.FormLabel get_f_FormLabel461() {
      return build_f_FormLabel461();
    }
    private org.gwtbootstrap3.client.ui.FormLabel build_f_FormLabel461() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.FormLabel f_FormLabel461 = new org.gwtbootstrap3.client.ui.FormLabel();
      // Setup section.
      f_FormLabel461.setHTML(template_html39().asString());
      f_FormLabel461.setFor("disabled3");

      return f_FormLabel461;
    }

    /**
     * Getter for f_Row462 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row462() {
      return build_f_Row462();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row462() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row462 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row462.add(get_f_Column463());
      f_Row462.add(get_f_Column468());
      f_Row462.add(get_f_Column473());

      return f_Row462;
    }

    /**
     * Getter for f_Column463 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column463() {
      return build_f_Column463();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column463() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column463 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column463.add(get_f_Select464());

      return f_Column463;
    }

    /**
     * Getter for f_Select464 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select464() {
      return build_f_Select464();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select464() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select464 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select464.add(get_f_Option465());
      f_Select464.add(get_f_Option466());
      f_Select464.add(get_f_Option467());
      f_Select464.setId("disabled1");
      f_Select464.setEnabled(false);

      return f_Select464;
    }

    /**
     * Getter for f_Option465 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option465() {
      return build_f_Option465();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option465() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option465 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option465.setText("Mustard");

      return f_Option465;
    }

    /**
     * Getter for f_Option466 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option466() {
      return build_f_Option466();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option466() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option466 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option466.setText("Ketchup");

      return f_Option466;
    }

    /**
     * Getter for f_Option467 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option467() {
      return build_f_Option467();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option467() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option467 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option467.setText("Relish");

      return f_Option467;
    }

    /**
     * Getter for f_Column468 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column468() {
      return build_f_Column468();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column468() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column468 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column468.add(get_f_Select469());

      return f_Column468;
    }

    /**
     * Getter for f_Select469 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select469() {
      return build_f_Select469();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select469() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select469 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select469.add(get_f_Option470());
      f_Select469.add(get_f_Option471());
      f_Select469.add(get_f_Option472());
      f_Select469.setId("disabled2");

      return f_Select469;
    }

    /**
     * Getter for f_Option470 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option470() {
      return build_f_Option470();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option470() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option470 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option470.setText("Mustard");
      f_Option470.setEnabled(false);

      return f_Option470;
    }

    /**
     * Getter for f_Option471 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option471() {
      return build_f_Option471();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option471() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option471 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option471.setText("Ketchup");

      return f_Option471;
    }

    /**
     * Getter for f_Option472 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option472() {
      return build_f_Option472();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option472() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option472 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option472.setText("Relish");

      return f_Option472;
    }

    /**
     * Getter for f_Column473 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column473() {
      return build_f_Column473();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column473() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column473 = new org.gwtbootstrap3.client.ui.Column("SM_4");
      // Setup section.
      f_Column473.add(get_f_Select474());

      return f_Column473;
    }

    /**
     * Getter for f_Select474 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_f_Select474() {
      return build_f_Select474();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_f_Select474() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select f_Select474 = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      f_Select474.add(get_f_OptGroup475());
      f_Select474.add(get_f_OptGroup479());
      f_Select474.setId("disabled3");

      return f_Select474;
    }

    /**
     * Getter for f_OptGroup475 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup get_f_OptGroup475() {
      return build_f_OptGroup475();
    }
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup build_f_OptGroup475() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.OptGroup f_OptGroup475 = new org.gwtbootstrap3.extras.select.client.ui.OptGroup();
      // Setup section.
      f_OptGroup475.add(get_f_Option476());
      f_OptGroup475.add(get_f_Option477());
      f_OptGroup475.add(get_f_Option478());
      f_OptGroup475.setLabel("Picnic");
      f_OptGroup475.setEnabled(false);

      return f_OptGroup475;
    }

    /**
     * Getter for f_Option476 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option476() {
      return build_f_Option476();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option476() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option476 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option476.setText("Mustard");

      return f_Option476;
    }

    /**
     * Getter for f_Option477 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option477() {
      return build_f_Option477();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option477() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option477 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option477.setText("Ketchup");

      return f_Option477;
    }

    /**
     * Getter for f_Option478 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option478() {
      return build_f_Option478();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option478() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option478 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option478.setText("Relish");

      return f_Option478;
    }

    /**
     * Getter for f_OptGroup479 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup get_f_OptGroup479() {
      return build_f_OptGroup479();
    }
    private org.gwtbootstrap3.extras.select.client.ui.OptGroup build_f_OptGroup479() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.OptGroup f_OptGroup479 = new org.gwtbootstrap3.extras.select.client.ui.OptGroup();
      // Setup section.
      f_OptGroup479.add(get_f_Option480());
      f_OptGroup479.add(get_f_Option481());
      f_OptGroup479.add(get_f_Option482());
      f_OptGroup479.setLabel("Camping");

      return f_OptGroup479;
    }

    /**
     * Getter for f_Option480 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option480() {
      return build_f_Option480();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option480() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option480 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option480.setText("Tent");

      return f_Option480;
    }

    /**
     * Getter for f_Option481 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option481() {
      return build_f_Option481();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option481() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option481 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option481.setText("Flashlight");

      return f_Option481;
    }

    /**
     * Getter for f_Option482 called 1 times. Type: DEFAULT. Build precedence: 9.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option482() {
      return build_f_Option482();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option482() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option482 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option482.setText("Toilet Paper");

      return f_Option482;
    }

    /**
     * Getter for f_PanelFooter483 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter483() {
      return build_f_PanelFooter483();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter483() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter483 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter483.add(get_f_PrettyPre484());

      return f_PanelFooter483;
    }

    /**
     * Getter for f_PrettyPre484 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre484() {
      return build_f_PrettyPre484();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre484() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre484 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre484.setHTML(template_html40().asString());
      f_PrettyPre484.addStyleName("lang-xml");

      return f_PrettyPre484;
    }

    /**
     * Getter for f_Panel485 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel485() {
      return build_f_Panel485();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel485() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel485 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel485.add(get_f_PanelHeader486());
      f_Panel485.add(get_f_PanelBody488());
      f_Panel485.add(get_f_PanelFooter512());

      return f_Panel485;
    }

    /**
     * Getter for f_PanelHeader486 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader486() {
      return build_f_PanelHeader486();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader486() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader486 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader486.add(get_f_Heading487());

      return f_PanelHeader486;
    }

    /**
     * Getter for f_Heading487 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading487() {
      return build_f_Heading487();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading487() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading487 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading487.setText("API and events");

      return f_Heading487;
    }

    /**
     * Getter for f_PanelBody488 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody488() {
      return build_f_PanelBody488();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody488() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody488 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody488.add(get_f_Row489());
      f_PanelBody488.add(get_f_Row495());
      f_PanelBody488.add(get_f_Row503());

      return f_PanelBody488;
    }

    /**
     * Getter for f_Row489 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row489() {
      return build_f_Row489();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row489() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row489 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row489.add(get_f_Column490());
      f_Row489.add(get_f_Column494());
      f_Row489.addStyleName("" + get_style().bottom() + "");

      return f_Row489;
    }

    /**
     * Getter for f_Column490 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column490() {
      return build_f_Column490();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column490() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column490 = new org.gwtbootstrap3.client.ui.Column("SM_3");
      // Setup section.
      f_Column490.add(get_simpleSelect());

      return f_Column490;
    }

    /**
     * Getter for simpleSelect called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Select get_simpleSelect() {
      return build_simpleSelect();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Select build_simpleSelect() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Select simpleSelect = new org.gwtbootstrap3.extras.select.client.ui.Select();
      // Setup section.
      simpleSelect.add(get_f_Option491());
      simpleSelect.add(get_f_Option492());
      simpleSelect.add(get_f_Option493());
      simpleSelect.setShowSubtext(true);
      simpleSelect.setTitle("Please select...");
      simpleSelect.addLoadedHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);
      simpleSelect.addShowHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);
      simpleSelect.addShownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10);
      simpleSelect.addHideHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11);
      simpleSelect.addHiddenHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12);
      simpleSelect.addRenderedHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13);
      simpleSelect.addRefreshedHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14);

      this.owner.simpleSelect = simpleSelect;

      return simpleSelect;
    }

    /**
     * Getter for f_Option491 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option491() {
      return build_f_Option491();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option491() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option491 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option491.setSubtext("value=1");
      f_Option491.setText("Mustard");
      f_Option491.setValue("1");

      return f_Option491;
    }

    /**
     * Getter for f_Option492 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option492() {
      return build_f_Option492();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option492() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option492 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option492.setSubtext("value=2");
      f_Option492.setText("Ketchup");
      f_Option492.setValue("2");

      return f_Option492;
    }

    /**
     * Getter for f_Option493 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option493() {
      return build_f_Option493();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option493() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option493 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option493.setText("Relish");

      return f_Option493;
    }

    /**
     * Getter for f_Column494 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column494() {
      return build_f_Column494();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column494() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column494 = new org.gwtbootstrap3.client.ui.Column("SM_9");
      // Setup section.
      f_Column494.add(get_disableEnableSimple());
      f_Column494.add(get_showHideSimple());
      f_Column494.add(get_toggleSimple());
      f_Column494.add(get_getValueSimple());
      f_Column494.add(get_setValueSimple());
      f_Column494.add(get_renderedSimple());
      f_Column494.add(get_refreshSimple());

      return f_Column494;
    }

    /**
     * Getter for disableEnableSimple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_disableEnableSimple() {
      return build_disableEnableSimple();
    }
    private org.gwtbootstrap3.client.ui.Button build_disableEnableSimple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button disableEnableSimple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      disableEnableSimple.addStyleName("" + get_style().spacing() + "");
      disableEnableSimple.setText("Disable");
      disableEnableSimple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      disableEnableSimple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.disableEnableSimple = disableEnableSimple;

      return disableEnableSimple;
    }

    /**
     * Getter for showHideSimple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_showHideSimple() {
      return build_showHideSimple();
    }
    private org.gwtbootstrap3.client.ui.Button build_showHideSimple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button showHideSimple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      showHideSimple.addStyleName("" + get_style().spacing() + "");
      showHideSimple.setText("Hide");
      showHideSimple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      showHideSimple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.showHideSimple = showHideSimple;

      return showHideSimple;
    }

    /**
     * Getter for toggleSimple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_toggleSimple() {
      return build_toggleSimple();
    }
    private org.gwtbootstrap3.client.ui.Button build_toggleSimple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button toggleSimple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      toggleSimple.addStyleName("" + get_style().spacing() + "");
      toggleSimple.setText("Toggle");
      toggleSimple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      toggleSimple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      return toggleSimple;
    }

    /**
     * Getter for getValueSimple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_getValueSimple() {
      return build_getValueSimple();
    }
    private org.gwtbootstrap3.client.ui.Button build_getValueSimple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button getValueSimple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      getValueSimple.addStyleName("" + get_style().spacing() + "");
      getValueSimple.setText("Get Value");
      getValueSimple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      getValueSimple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

      return getValueSimple;
    }

    /**
     * Getter for setValueSimple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_setValueSimple() {
      return build_setValueSimple();
    }
    private org.gwtbootstrap3.client.ui.Button build_setValueSimple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button setValueSimple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      setValueSimple.addStyleName("" + get_style().spacing() + "");
      setValueSimple.setText("Set Value");
      setValueSimple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      setValueSimple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

      this.owner.setValueSimple = setValueSimple;

      return setValueSimple;
    }

    /**
     * Getter for renderedSimple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_renderedSimple() {
      return build_renderedSimple();
    }
    private org.gwtbootstrap3.client.ui.Button build_renderedSimple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button renderedSimple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      renderedSimple.addStyleName("" + get_style().spacing() + "");
      renderedSimple.setText("Render");
      renderedSimple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      renderedSimple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

      return renderedSimple;
    }

    /**
     * Getter for refreshSimple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_refreshSimple() {
      return build_refreshSimple();
    }
    private org.gwtbootstrap3.client.ui.Button build_refreshSimple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button refreshSimple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      refreshSimple.addStyleName("" + get_style().spacing() + "");
      refreshSimple.setText("Refresh");
      refreshSimple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      refreshSimple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

      return refreshSimple;
    }

    /**
     * Getter for f_Row495 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row495() {
      return build_f_Row495();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row495() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row495 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row495.add(get_f_Column496());
      f_Row495.add(get_f_Column502());
      f_Row495.addStyleName("" + get_style().bottom() + "");

      return f_Row495;
    }

    /**
     * Getter for f_Column496 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column496() {
      return build_f_Column496();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column496() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column496 = new org.gwtbootstrap3.client.ui.Column("SM_3");
      // Setup section.
      f_Column496.add(get_multiSelect());
      f_Column496.add(get_f_Br500());
      f_Column496.add(get_f_Br501());

      return f_Column496;
    }

    /**
     * Getter for multiSelect called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect get_multiSelect() {
      return build_multiSelect();
    }
    private org.gwtbootstrap3.extras.select.client.ui.MultipleSelect build_multiSelect() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.MultipleSelect multiSelect = new org.gwtbootstrap3.extras.select.client.ui.MultipleSelect();
      // Setup section.
      multiSelect.add(get_f_Option497());
      multiSelect.add(get_f_Option498());
      multiSelect.add(get_f_Option499());
      multiSelect.addLoadedHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames24);
      multiSelect.addShowHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames25);
      multiSelect.addShownHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames26);
      multiSelect.addHideHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames27);
      multiSelect.addHiddenHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames28);
      multiSelect.addRenderedHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames29);
      multiSelect.addRefreshedHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames30);

      this.owner.multiSelect = multiSelect;

      return multiSelect;
    }

    /**
     * Getter for f_Option497 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option497() {
      return build_f_Option497();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option497() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option497 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option497.setSubtext("value=1");
      f_Option497.setText("Mustard");
      f_Option497.setTitle("Mustard (value=1)");
      f_Option497.setValue("1");

      return f_Option497;
    }

    /**
     * Getter for f_Option498 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option498() {
      return build_f_Option498();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option498() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option498 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option498.setSubtext("value=2");
      f_Option498.setText("Ketchup");
      f_Option498.setTitle("Ketchup (value=2)");
      f_Option498.setValue("2");

      return f_Option498;
    }

    /**
     * Getter for f_Option499 called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtbootstrap3.extras.select.client.ui.Option get_f_Option499() {
      return build_f_Option499();
    }
    private org.gwtbootstrap3.extras.select.client.ui.Option build_f_Option499() {
      // Creation section.
      final org.gwtbootstrap3.extras.select.client.ui.Option f_Option499 = new org.gwtbootstrap3.extras.select.client.ui.Option();
      // Setup section.
      f_Option499.setText("Relish");

      return f_Option499;
    }

    /**
     * Getter for f_Br500 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br500() {
      return build_f_Br500();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br500() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br500 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br500;
    }

    /**
     * Getter for f_Br501 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br501() {
      return build_f_Br501();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br501() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br501 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br501;
    }

    /**
     * Getter for f_Column502 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column502() {
      return build_f_Column502();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column502() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column502 = new org.gwtbootstrap3.client.ui.Column("SM_9");
      // Setup section.
      f_Column502.add(get_disableEnableMultiple());
      f_Column502.add(get_showHideMultiple());
      f_Column502.add(get_toggleMultiple());
      f_Column502.add(get_getValueMultiple());
      f_Column502.add(get_setValueMultiple());
      f_Column502.add(get_renderMultiple());
      f_Column502.add(get_refreshMultiple());
      f_Column502.add(get_selectAll());
      f_Column502.add(get_deselectAll());

      return f_Column502;
    }

    /**
     * Getter for disableEnableMultiple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_disableEnableMultiple() {
      return build_disableEnableMultiple();
    }
    private org.gwtbootstrap3.client.ui.Button build_disableEnableMultiple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button disableEnableMultiple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      disableEnableMultiple.addStyleName("" + get_style().spacing() + "");
      disableEnableMultiple.setText("Disable");
      disableEnableMultiple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      disableEnableMultiple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15);

      this.owner.disableEnableMultiple = disableEnableMultiple;

      return disableEnableMultiple;
    }

    /**
     * Getter for showHideMultiple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_showHideMultiple() {
      return build_showHideMultiple();
    }
    private org.gwtbootstrap3.client.ui.Button build_showHideMultiple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button showHideMultiple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      showHideMultiple.addStyleName("" + get_style().spacing() + "");
      showHideMultiple.setText("Hide");
      showHideMultiple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      showHideMultiple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16);

      this.owner.showHideMultiple = showHideMultiple;

      return showHideMultiple;
    }

    /**
     * Getter for toggleMultiple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_toggleMultiple() {
      return build_toggleMultiple();
    }
    private org.gwtbootstrap3.client.ui.Button build_toggleMultiple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button toggleMultiple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      toggleMultiple.addStyleName("" + get_style().spacing() + "");
      toggleMultiple.setText("Toggle");
      toggleMultiple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      toggleMultiple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames17);

      return toggleMultiple;
    }

    /**
     * Getter for getValueMultiple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_getValueMultiple() {
      return build_getValueMultiple();
    }
    private org.gwtbootstrap3.client.ui.Button build_getValueMultiple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button getValueMultiple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      getValueMultiple.addStyleName("" + get_style().spacing() + "");
      getValueMultiple.setText("Get Value");
      getValueMultiple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      getValueMultiple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames18);

      return getValueMultiple;
    }

    /**
     * Getter for setValueMultiple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_setValueMultiple() {
      return build_setValueMultiple();
    }
    private org.gwtbootstrap3.client.ui.Button build_setValueMultiple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button setValueMultiple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      setValueMultiple.addStyleName("" + get_style().spacing() + "");
      setValueMultiple.setText("Set Values");
      setValueMultiple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      setValueMultiple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames19);

      this.owner.setValueMultiple = setValueMultiple;

      return setValueMultiple;
    }

    /**
     * Getter for renderMultiple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_renderMultiple() {
      return build_renderMultiple();
    }
    private org.gwtbootstrap3.client.ui.Button build_renderMultiple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button renderMultiple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      renderMultiple.addStyleName("" + get_style().spacing() + "");
      renderMultiple.setText("Render");
      renderMultiple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      renderMultiple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames20);

      return renderMultiple;
    }

    /**
     * Getter for refreshMultiple called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_refreshMultiple() {
      return build_refreshMultiple();
    }
    private org.gwtbootstrap3.client.ui.Button build_refreshMultiple() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button refreshMultiple = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      refreshMultiple.addStyleName("" + get_style().spacing() + "");
      refreshMultiple.setText("Refresh");
      refreshMultiple.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      refreshMultiple.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames21);

      return refreshMultiple;
    }

    /**
     * Getter for selectAll called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_selectAll() {
      return build_selectAll();
    }
    private org.gwtbootstrap3.client.ui.Button build_selectAll() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button selectAll = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      selectAll.addStyleName("" + get_style().spacing() + "");
      selectAll.setText("Select All");
      selectAll.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      selectAll.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames22);

      return selectAll;
    }

    /**
     * Getter for deselectAll called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_deselectAll() {
      return build_deselectAll();
    }
    private org.gwtbootstrap3.client.ui.Button build_deselectAll() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button deselectAll = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      deselectAll.addStyleName("" + get_style().spacing() + "");
      deselectAll.setText("Deselect All");
      deselectAll.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      deselectAll.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames23);

      this.owner.deselectAll = deselectAll;

      return deselectAll;
    }

    /**
     * Getter for f_Row503 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Row get_f_Row503() {
      return build_f_Row503();
    }
    private org.gwtbootstrap3.client.ui.Row build_f_Row503() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Row f_Row503 = new org.gwtbootstrap3.client.ui.Row();
      // Setup section.
      f_Row503.add(get_f_Column504());
      f_Row503.add(get_f_Column508());

      return f_Row503;
    }

    /**
     * Getter for f_Column504 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column504() {
      return build_f_Column504();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column504() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column504 = new org.gwtbootstrap3.client.ui.Column("SM_3");
      // Setup section.
      f_Column504.add(get_f_Br505());
      f_Column504.add(get_f_Br506());
      f_Column504.add(get_f_Br507());

      return f_Column504;
    }

    /**
     * Getter for f_Br505 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br505() {
      return build_f_Br505();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br505() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br505 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br505;
    }

    /**
     * Getter for f_Br506 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br506() {
      return build_f_Br506();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br506() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br506 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br506;
    }

    /**
     * Getter for f_Br507 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br507() {
      return build_f_Br507();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br507() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br507 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br507;
    }

    /**
     * Getter for f_Column508 called 1 times. Type: DEFAULT. Build precedence: 6.
     */
    private org.gwtbootstrap3.client.ui.Column get_f_Column508() {
      return build_f_Column508();
    }
    private org.gwtbootstrap3.client.ui.Column build_f_Column508() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Column f_Column508 = new org.gwtbootstrap3.client.ui.Column("SM_9");
      // Setup section.
      f_Column508.add(get_f_Strong509());
      f_Column508.add(get_clearLogButton());
      f_Column508.add(get_f_Div510());
      f_Column508.add(get_f_ScrollPanel511());
      f_Column508.addStyleName("" + get_style().logRow() + "");

      return f_Column508;
    }

    /**
     * Getter for f_Strong509 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Strong get_f_Strong509() {
      return build_f_Strong509();
    }
    private org.gwtbootstrap3.client.ui.html.Strong build_f_Strong509() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Strong f_Strong509 = new org.gwtbootstrap3.client.ui.html.Strong();
      // Setup section.
      f_Strong509.addStyleName("" + get_style().logTitle() + "");
      f_Strong509.setText("Event Log");

      return f_Strong509;
    }

    /**
     * Getter for clearLogButton called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.Button get_clearLogButton() {
      return build_clearLogButton();
    }
    private org.gwtbootstrap3.client.ui.Button build_clearLogButton() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button clearLogButton = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      clearLogButton.setPull(org.gwtbootstrap3.client.ui.constants.Pull.RIGHT);
      clearLogButton.setText("Clear Log");
      clearLogButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames31);

      return clearLogButton;
    }

    /**
     * Getter for f_Div510 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtbootstrap3.client.ui.html.Div get_f_Div510() {
      return build_f_Div510();
    }
    private org.gwtbootstrap3.client.ui.html.Div build_f_Div510() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Div f_Div510 = new org.gwtbootstrap3.client.ui.html.Div();
      // Setup section.
      f_Div510.addStyleName("clearfix");

      return f_Div510;
    }

    /**
     * Getter for f_ScrollPanel511 called 1 times. Type: DEFAULT. Build precedence: 7.
     */
    private org.gwtproject.user.client.ui.ScrollPanel get_f_ScrollPanel511() {
      return build_f_ScrollPanel511();
    }
    private org.gwtproject.user.client.ui.ScrollPanel build_f_ScrollPanel511() {
      // Creation section.
      final org.gwtproject.user.client.ui.ScrollPanel f_ScrollPanel511 = new org.gwtproject.user.client.ui.ScrollPanel();
      // Setup section.
      f_ScrollPanel511.add(get_logRow());
      f_ScrollPanel511.setHeight("300px");

      return f_ScrollPanel511;
    }

    /**
     * Getter for logRow called 1 times. Type: DEFAULT. Build precedence: 8.
     */
    private org.gwtproject.user.client.ui.FlowPanel get_logRow() {
      return build_logRow();
    }
    private org.gwtproject.user.client.ui.FlowPanel build_logRow() {
      // Creation section.
      final org.gwtproject.user.client.ui.FlowPanel logRow = new org.gwtproject.user.client.ui.FlowPanel();
      // Setup section.

      this.owner.logRow = logRow;

      return logRow;
    }

    /**
     * Getter for f_PanelFooter512 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter512() {
      return build_f_PanelFooter512();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter512() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter512 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter512.add(get_f_Heading513());
      f_PanelFooter512.add(get_f_PrettyPre514());
      f_PanelFooter512.add(get_f_Heading515());
      f_PanelFooter512.add(get_f_PrettyPre516());

      return f_PanelFooter512;
    }

    /**
     * Getter for f_Heading513 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading513() {
      return build_f_Heading513();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading513() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading513 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading513.setText("UiBinder");

      return f_Heading513;
    }

    /**
     * Getter for f_PrettyPre514 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre514() {
      return build_f_PrettyPre514();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre514() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre514 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre514.setHTML(template_html41().asString());
      f_PrettyPre514.addStyleName("lang-xml");

      return f_PrettyPre514;
    }

    /**
     * Getter for f_Heading515 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading515() {
      return build_f_Heading515();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading515() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading515 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H4);
      // Setup section.
      f_Heading515.setText("Java code");

      return f_Heading515;
    }

    /**
     * Getter for f_PrettyPre516 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre516() {
      return build_f_PrettyPre516();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre516() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre516 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre516.setHTML(template_html42().asString());
      f_PrettyPre516.addStyleName("lang-java");

      return f_PrettyPre516;
    }
  }
}
