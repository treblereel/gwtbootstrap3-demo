// Template file: org/treblereel/mvp/view/extras/FullCalendarView.ui.xml
// .ui.xml template last modified: 1571163470000
package org.treblereel.mvp.view.extras;


@javax.annotation.Generated(value="org.gwtproject.uibinder.processor.UiBinderProcessor", date="2019-10-15T20:17:52.165")
public class FullCalendarView_BinderImpl implements org.gwtproject.uibinder.client.UiBinder<org.gwtproject.user.client.ui.Widget, org.treblereel.mvp.view.extras.FullCalendarView>, org.treblereel.mvp.view.extras.FullCalendarView.Binder {

  interface Template extends org.gwtproject.safehtml.client.SafeHtmlTemplates {
    @Template("Original Library Link:")
    org.gwtproject.safehtml.shared.SafeHtml html1();
     
    @Template("FullCalendar")
    org.gwtproject.safehtml.shared.SafeHtml html2();
     
    @Template("Current Version Supported: 2.3.1")
    org.gwtproject.safehtml.shared.SafeHtml html3();
     
    @Template("To use FullCalendar, you must first add the extras module to your project. In Maven:")
    org.gwtproject.safehtml.shared.SafeHtml html4();
     
    @Template("&lt;dependency&gt;\\n \\s\\s\\s\\s&lt;groupId&gt;org.gwtbootstrap3&lt;/groupId&gt;\\n \\s\\s\\s\\s&lt;artifactId&gt;gwtbootstrap3-extras&lt;/artifactId&gt;\\n \\s\\s\\s\\s&lt;version&gt;VERSION&lt;/version&gt;\\n \\s\\s\\s\\s&lt;scope&gt;provided&lt;/scope&gt;\\n &lt;/dependency&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html5();
     
    @Template("Then you need to inherit the following GWT Module <strong>additionally</strong> to any GwtBootstrap3 module into your *.gwt.xml of your project:")
    org.gwtproject.safehtml.shared.SafeHtml html6();
     
    @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.fullcalendar.FullCalendar\"/&gt;")
    org.gwtproject.safehtml.shared.SafeHtml html7();
     
    @Template("To see the most simple example, create a FullCalendar with only the minimal parameters:")
    org.gwtproject.safehtml.shared.SafeHtml html8();
     
    @Template("...\\n FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.agendaWeek,false);\\n fc.addLoadHandler(new LoadHandler() {\\n @Override\\n public void onLoad(LoadEvent event) {\\n addEvents();//example code below...\\n }\\n });\\n ...\\n someContainerWidget.add(fc);\\n ...\\n ...\\n //add some events to the calendar manually/randomly...\\n protected void addEvents() {\\n for (int i = 0; i 15; i++) {\\n Event calEvent = new Event(\"id:\" + i, \"This is Event: \" + i);\\n int day = Random.nextInt(10);\\n Date start = new Date();\\n CalendarUtil.addDaysToDate(start, -1 * day);\\n calEvent.setStart(start);\\n if( i % 3 == 0 ){\\n calEvent.setAllDay(true);\\n }else{\\n Date d = new Date(start.getTime());\\n d.setHours(d.getHours() + 1); calEvent.setEnd(d);\\n }\\n fc.addEvent(calEvent);\\n }\\n }\\n")
    org.gwtproject.safehtml.shared.SafeHtml html9();
     
    @Template("...\\n CalendarConfig config = new CalendarConfig();\\n ClickAndHoverConfig clickHover = new ClickAndHoverConfig(new ClickAndHoverEventCallback() {\\n @Override\\n public void eventMouseover(JavaScriptObject calendarEvent,NativeEvent event, JavaScriptObject viewObject) {\\n }\\n @Override\\n public void eventMouseout(JavaScriptObject calendarEvent,NativeEvent event, JavaScriptObject viewObject) {\\n }\\n @Override\\n public void eventClick(JavaScriptObject calendarEvent, NativeEvent event,JavaScriptObject viewObject) {\\n Event calEvent = new Event(calendarEvent);\\n System.out.println(\"id \" + calEvent.getId() + \" start: \" + calEvent.getStart() + \" end: \" + calEvent.getEnd() + \" all day: \" + calEvent.isAllDay());\\n if (Window.confirm(\"Delete '\" + calEvent.getTitle() + \"'?\")) configuringCalendar.removeEvent(calEvent.getId());\\n Window.alert(calEvent.getTitle());\\n }\\n @Override\\n public void dayClick(JavaScriptObject moment, NativeEvent event,JavaScriptObject viewObject) {\\n }\\n });\\n config.setClickHoverConfig(clickHover);\\n SelectConfig selectConfig = new SelectConfig(new SelectEventCallback() {\\n \\n \\s@Override\\n \\spublic void select(JavaScriptObject start, JavaScriptObject end, NativeEvent event, JavaScriptObject viewObject) {\\n \\s\\sEvent tempEvent = new Event(\"\" + System.currentTimeMillis(), \"New event\");\\n \\s\\stempEvent.setStart(start);\\n \\s\\stempEvent.setEnd(end);\\n \\s\\sif (tempEvent.getEnd().getHours() == tempEvent.getStart().getHours() &amp;&amp; tempEvent.getEnd().getMinutes() == tempEvent.getStart().getMinutes())\\n \\s\\s\\stempEvent.setAllDay(true);\\n \\s\\sif (Window.confirm(\"Create event?\")) {\\n \\s\\s\\sconfiguringCalendar.unselect();\\n \\s\\sconfiguringCalendar.addEvent(tempEvent);\\n \\s\\s}\\n \\s}\\n \\n \\s@Override\\n \\spublic void unselect(JavaScriptObject viewObject, NativeEvent event) {\\n \\s\\s// System.out.println(\"unselect\");\\n \\s}\\n });\\n config.setSelectConfig(selectConfig);\\n DragAndResizeConfig dr = new DragAndResizeConfig(new DragAndResizeCallback() {\\n @Override\\n public void eventResizeStop(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventResizeStop\");\\n } @Override\\n public void eventResizeStart(JavaScriptObject calendarEvent,NativeEvent nativeEvent) { //System.out.println(\"eventResizeStart\");\\n } @Override\\n public void eventResize(JavaScriptObject calendarEvent, JavaScriptObject revertFunction,NativeEvent nativeEvent) {\\n //System.out.println(\"eventResize\");\\n }\\n @Override\\n public void eventDrop(JavaScriptObject calendarEvent, JavaScriptObject revertFunction,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDrop\");\\n Event evt = new Event(calendarEvent);\\n System.out.println(\"eventDrop: \" + evt.getStartFromYearMonthDay());\\n }\\n @Override\\n public void eventDragStop(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDragStop\");\\n } @Override\\n public void eventDragStart(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDragStart\");\\n }\\n });\\n config.setDragResizeConfig(dr);\\n GeneralDisplay gd = new GeneralDisplay();\\n config.setGeneralDisplay(gd);\\n FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.agendaWeek,config,true);\\n fc.addLoadHandler(new LoadHandler() {\\n @Override\\n public void onLoad(LoadEvent event) {\\n addEvents();//see code below\\n }\\n });\\n ...\\n someContainerWidget.add(fc);\\n ...\\n //add some events to the calendar manually/randomly...\\n protected void addEvents() {\\n for (int i = 0; i 15; i++) {\\n Event calEvent = new Event(\"id:\" + i, \"This is Event: \" + i);\\n int day = Random.nextInt(10);\\n Date start = new Date();\\n CalendarUtil.addDaysToDate(start, -1 * day);\\n calEvent.setStart(start);\\n if( i % 3 == 0 ){\\n calEvent.setAllDay(true);\\n }else{\\n Date d = new Date(start.getTime());\\n d.setHours(d.getHours() + 1);\\n calEvent.setEnd(d);\\n }\\n fc.addEvent(calEvent);\\n }\\n }\\n")
    org.gwtproject.safehtml.shared.SafeHtml html10();
     
    @Template("CalendarConfig config = new CalendarConfig();\\n config.setLangauge(Language.Spanish); FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.month,config,true);\\n ...\\n someContainerWidget.add(fc);\\n")
    org.gwtproject.safehtml.shared.SafeHtml html11();
     
    @Template("Event lunch = new Event(\"some_event_id\", \"Business lunch\");\\n ...\\n lunch.setConstraint(\"businessHours\");\\n fc.addEvent(lunch);\\n ...\\n \\n Event available = new Event(\"availableForMeeting\", \"\");\\n ...\\n available.setRendering(\"background\");\\n available.setBackgroundColor(\"#8FDF82\");\\n fc.addEvent(available);\\n ...\\n \\n Event meeting = new Event(\"some_event_id\", \"Meeting\");\\n ...\\n meeting.setConstraint(\"availableForMeeting\");\\n meeting.setBackgroundColor(\"#257e4a\");\\n fc.addEvent(meeting);\\n ...\\n \\n Event blocked = new Event(\"some_event_id\", \"\");\\n ...\\n blocked.setAllDay(true);\\n blocked.setOverlap(false);\\n blocked.setRendering(\"background\");\\n blocked.setBackgroundColor(\"#ff9f89\");\\n fc.addEvent(blocked); ...\\n")
    org.gwtproject.safehtml.shared.SafeHtml html12();
     
  }

  Template template = new FullCalendarView_BinderImpl_TemplateImpl();


  public org.gwtproject.user.client.ui.Widget createAndBindUi(final org.treblereel.mvp.view.extras.FullCalendarView owner) {


    return new Widgets(owner).get_f_Row1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.treblereel.mvp.view.extras.FullCalendarView owner;


    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.backgroundEvents((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.localization((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    final org.gwtproject.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new org.gwtproject.event.dom.client.ClickHandler() {
      public void onClick(org.gwtproject.event.dom.client.ClickEvent event) {
        owner.configuring((org.gwtproject.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final org.treblereel.mvp.view.extras.FullCalendarView owner) {
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

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = new org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl_GenBundleImpl();
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl_GenCss_style style;
    private org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl_GenCss_style build_style() {
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
      f_Column2.add(get_f_Panel24());
      f_Column2.add(get_f_Panel31());

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
      f_PageHeader3.setText("FullCalendar");

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
      f_Anchor6.setHref("http://arshaw.com/fullcalendar/");
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
      f_PrettyPre16.addStyleName("lang-java");

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
      f_Panel17.add(get_f_PanelFooter22());

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
      f_Heading19.setText("Configuring and Event Handling");

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
      f_PanelBody20.add(get_configuring());
      f_PanelBody20.add(get_f_Br21());
      f_PanelBody20.add(get_configuringPanel());

      return f_PanelBody20;
    }

    /**
     * Getter for configuring called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_configuring() {
      return build_configuring();
    }
    private org.gwtbootstrap3.client.ui.Button build_configuring() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button configuring = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      configuring.setText("Run Example");
      configuring.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      configuring.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      configuring.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

      this.owner.configuring = configuring;

      return configuring;
    }

    /**
     * Getter for f_Br21 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br21() {
      return build_f_Br21();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br21() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br21 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br21;
    }

    /**
     * Getter for configuringPanel called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.gwt.FlowPanel get_configuringPanel() {
      return build_configuringPanel();
    }
    private org.gwtbootstrap3.client.ui.gwt.FlowPanel build_configuringPanel() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.FlowPanel configuringPanel = new org.gwtbootstrap3.client.ui.gwt.FlowPanel();
      // Setup section.

      this.owner.configuringPanel = configuringPanel;

      return configuringPanel;
    }

    /**
     * Getter for f_PanelFooter22 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter22() {
      return build_f_PanelFooter22();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter22() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter22 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter22.add(get_f_PrettyPre23());

      return f_PanelFooter22;
    }

    /**
     * Getter for f_PrettyPre23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre23() {
      return build_f_PrettyPre23();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre23() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre23 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre23.setHTML(template_html10().asString());
      f_PrettyPre23.addStyleName("lang-java");

      return f_PrettyPre23;
    }

    /**
     * Getter for f_Panel24 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel24() {
      return build_f_Panel24();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel24() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel24 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel24.add(get_f_PanelHeader25());
      f_Panel24.add(get_f_PanelBody27());
      f_Panel24.add(get_f_PanelFooter29());

      return f_Panel24;
    }

    /**
     * Getter for f_PanelHeader25 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader25() {
      return build_f_PanelHeader25();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader25() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader25 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader25.add(get_f_Heading26());

      return f_PanelHeader25;
    }

    /**
     * Getter for f_Heading26 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading26() {
      return build_f_Heading26();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading26() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading26 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading26.setText("Localization");

      return f_Heading26;
    }

    /**
     * Getter for f_PanelBody27 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody27() {
      return build_f_PanelBody27();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody27() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody27 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody27.add(get_localization());
      f_PanelBody27.add(get_f_Br28());
      f_PanelBody27.add(get_localizationPanel());

      return f_PanelBody27;
    }

    /**
     * Getter for localization called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_localization() {
      return build_localization();
    }
    private org.gwtbootstrap3.client.ui.Button build_localization() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button localization = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      localization.setText("Run Example");
      localization.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      localization.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      localization.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

      this.owner.localization = localization;

      return localization;
    }

    /**
     * Getter for f_Br28 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br28() {
      return build_f_Br28();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br28() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br28 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br28;
    }

    /**
     * Getter for localizationPanel called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.gwt.FlowPanel get_localizationPanel() {
      return build_localizationPanel();
    }
    private org.gwtbootstrap3.client.ui.gwt.FlowPanel build_localizationPanel() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.FlowPanel localizationPanel = new org.gwtbootstrap3.client.ui.gwt.FlowPanel();
      // Setup section.

      this.owner.localizationPanel = localizationPanel;

      return localizationPanel;
    }

    /**
     * Getter for f_PanelFooter29 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter29() {
      return build_f_PanelFooter29();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter29() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter29 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter29.add(get_f_PrettyPre30());

      return f_PanelFooter29;
    }

    /**
     * Getter for f_PrettyPre30 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre30() {
      return build_f_PrettyPre30();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre30() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre30 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre30.setHTML(template_html11().asString());
      f_PrettyPre30.addStyleName("lang-java");

      return f_PrettyPre30;
    }

    /**
     * Getter for f_Panel31 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel31() {
      return build_f_Panel31();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel31() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel31 = new org.gwtbootstrap3.client.ui.Panel();
      // Setup section.
      f_Panel31.add(get_f_PanelHeader32());
      f_Panel31.add(get_f_PanelBody34());
      f_Panel31.add(get_f_PanelFooter36());

      return f_Panel31;
    }

    /**
     * Getter for f_PanelHeader32 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader32() {
      return build_f_PanelHeader32();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader32() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader32 = new org.gwtbootstrap3.client.ui.PanelHeader();
      // Setup section.
      f_PanelHeader32.add(get_f_Heading33());

      return f_PanelHeader32;
    }

    /**
     * Getter for f_Heading33 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading33() {
      return build_f_Heading33();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading33() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading33 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading33.setText("Background events");

      return f_Heading33;
    }

    /**
     * Getter for f_PanelBody34 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody34() {
      return build_f_PanelBody34();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody34() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody34 = new org.gwtbootstrap3.client.ui.PanelBody();
      // Setup section.
      f_PanelBody34.add(get_backgroundEvents());
      f_PanelBody34.add(get_f_Br35());
      f_PanelBody34.add(get_backgroundEventsPanel());

      return f_PanelBody34;
    }

    /**
     * Getter for backgroundEvents called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.Button get_backgroundEvents() {
      return build_backgroundEvents();
    }
    private org.gwtbootstrap3.client.ui.Button build_backgroundEvents() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button backgroundEvents = new org.gwtbootstrap3.client.ui.Button();
      // Setup section.
      backgroundEvents.setText("Run Example");
      backgroundEvents.setIcon(org.gwtbootstrap3.client.ui.constants.IconType.PLAY);
      backgroundEvents.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      backgroundEvents.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.backgroundEvents = backgroundEvents;

      return backgroundEvents;
    }

    /**
     * Getter for f_Br35 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.html.Br get_f_Br35() {
      return build_f_Br35();
    }
    private org.gwtbootstrap3.client.ui.html.Br build_f_Br35() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.html.Br f_Br35 = new org.gwtbootstrap3.client.ui.html.Br();
      // Setup section.

      return f_Br35;
    }

    /**
     * Getter for backgroundEventsPanel called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.gwtbootstrap3.client.ui.gwt.FlowPanel get_backgroundEventsPanel() {
      return build_backgroundEventsPanel();
    }
    private org.gwtbootstrap3.client.ui.gwt.FlowPanel build_backgroundEventsPanel() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.FlowPanel backgroundEventsPanel = new org.gwtbootstrap3.client.ui.gwt.FlowPanel();
      // Setup section.

      this.owner.backgroundEventsPanel = backgroundEventsPanel;

      return backgroundEventsPanel;
    }

    /**
     * Getter for f_PanelFooter36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter36() {
      return build_f_PanelFooter36();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter36() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter36 = new org.gwtbootstrap3.client.ui.PanelFooter();
      // Setup section.
      f_PanelFooter36.add(get_f_PrettyPre37());

      return f_PanelFooter36;
    }

    /**
     * Getter for f_PrettyPre37 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private org.treblereel.ui.PrettyPre get_f_PrettyPre37() {
      return build_f_PrettyPre37();
    }
    private org.treblereel.ui.PrettyPre build_f_PrettyPre37() {
      // Creation section.
      final org.treblereel.ui.PrettyPre f_PrettyPre37 = new org.treblereel.ui.PrettyPre();
      // Setup section.
      f_PrettyPre37.setHTML(template_html12().asString());
      f_PrettyPre37.addStyleName("lang-java");

      return f_PrettyPre37;
    }
  }
}
