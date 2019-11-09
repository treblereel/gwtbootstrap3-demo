package org.treblereel.mvp.view.extras;

/**
 * This class is generated from org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl.Template, do not edit manually
 */
public class FullCalendarView_BinderImpl_TemplateImpl implements org.treblereel.mvp.view.extras.FullCalendarView_BinderImpl.Template {
  
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
 * @Template("FullCalendar")
 */
public org.gwtproject.safehtml.shared.SafeHtml html2(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("FullCalendar");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Current Version Supported: 2.3.1")
 */
public org.gwtproject.safehtml.shared.SafeHtml html3(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Current Version Supported: 2.3.1");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To use FullCalendar, you must first add the extras module to your project. In Maven:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html4(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To use FullCalendar, you must first add the extras module to your project. In Maven:");
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
 * @Template("&lt;inherits name=\"org.gwtbootstrap3.extras.fullcalendar.FullCalendar\"/&gt;")
 */
public org.gwtproject.safehtml.shared.SafeHtml html7(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("&lt;inherits name=\"org.gwtbootstrap3.extras.fullcalendar.FullCalendar\"/&gt;");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("To see the most simple example, create a FullCalendar with only the minimal parameters:")
 */
public org.gwtproject.safehtml.shared.SafeHtml html8(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("To see the most simple example, create a FullCalendar with only the minimal parameters:");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("...\\n FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.agendaWeek,false);\\n fc.addLoadHandler(new LoadHandler() {\\n @Override\\n public void onLoad(LoadEvent event) {\\n addEvents();//example code below...\\n }\\n });\\n ...\\n someContainerWidget.add(fc);\\n ...\\n ...\\n //add some events to the calendar manually/randomly...\\n protected void addEvents() {\\n for (int i = 0; i 15; i++) {\\n Event calEvent = new Event(\"id:\" + i, \"This is Event: \" + i);\\n int day = Random.nextInt(10);\\n Date start = new Date();\\n CalendarUtil.addDaysToDate(start, -1 * day);\\n calEvent.setStart(start);\\n if( i % 3 == 0 ){\\n calEvent.setAllDay(true);\\n }else{\\n Date d = new Date(start.getTime());\\n d.setHours(d.getHours() + 1); calEvent.setEnd(d);\\n }\\n fc.addEvent(calEvent);\\n }\\n }\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html9(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("...\\n FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.agendaWeek,false);\\n fc.addLoadHandler(new LoadHandler() {\\n @Override\\n public void onLoad(LoadEvent event) {\\n addEvents();//example code below...\\n }\\n });\\n ...\\n someContainerWidget.add(fc);\\n ...\\n ...\\n //add some events to the calendar manually/randomly...\\n protected void addEvents() {\\n for (int i = 0; i 15; i++) {\\n Event calEvent = new Event(\"id:\" + i, \"This is Event: \" + i);\\n int day = Random.nextInt(10);\\n Date start = new Date();\\n CalendarUtil.addDaysToDate(start, -1 * day);\\n calEvent.setStart(start);\\n if( i % 3 == 0 ){\\n calEvent.setAllDay(true);\\n }else{\\n Date d = new Date(start.getTime());\\n d.setHours(d.getHours() + 1); calEvent.setEnd(d);\\n }\\n fc.addEvent(calEvent);\\n }\\n }\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("...\\n CalendarConfig config = new CalendarConfig();\\n ClickAndHoverConfig clickHover = new ClickAndHoverConfig(new ClickAndHoverEventCallback() {\\n @Override\\n public void eventMouseover(JavaScriptObject calendarEvent,NativeEvent event, JavaScriptObject viewObject) {\\n }\\n @Override\\n public void eventMouseout(JavaScriptObject calendarEvent,NativeEvent event, JavaScriptObject viewObject) {\\n }\\n @Override\\n public void eventClick(JavaScriptObject calendarEvent, NativeEvent event,JavaScriptObject viewObject) {\\n Event calEvent = new Event(calendarEvent);\\n System.out.println(\"id \" + calEvent.getId() + \" start: \" + calEvent.getStart() + \" end: \" + calEvent.getEnd() + \" all day: \" + calEvent.isAllDay());\\n if (Window.confirm(\"Delete '\" + calEvent.getTitle() + \"'?\")) configuringCalendar.removeEvent(calEvent.getId());\\n Window.alert(calEvent.getTitle());\\n }\\n @Override\\n public void dayClick(JavaScriptObject moment, NativeEvent event,JavaScriptObject viewObject) {\\n }\\n });\\n config.setClickHoverConfig(clickHover);\\n SelectConfig selectConfig = new SelectConfig(new SelectEventCallback() {\\n \\n \\s@Override\\n \\spublic void select(JavaScriptObject start, JavaScriptObject end, NativeEvent event, JavaScriptObject viewObject) {\\n \\s\\sEvent tempEvent = new Event(\"\" + System.currentTimeMillis(), \"New event\");\\n \\s\\stempEvent.setStart(start);\\n \\s\\stempEvent.setEnd(end);\\n \\s\\sif (tempEvent.getEnd().getHours() == tempEvent.getStart().getHours() &amp;&amp; tempEvent.getEnd().getMinutes() == tempEvent.getStart().getMinutes())\\n \\s\\s\\stempEvent.setAllDay(true);\\n \\s\\sif (Window.confirm(\"Create event?\")) {\\n \\s\\s\\sconfiguringCalendar.unselect();\\n \\s\\sconfiguringCalendar.addEvent(tempEvent);\\n \\s\\s}\\n \\s}\\n \\n \\s@Override\\n \\spublic void unselect(JavaScriptObject viewObject, NativeEvent event) {\\n \\s\\s// System.out.println(\"unselect\");\\n \\s}\\n });\\n config.setSelectConfig(selectConfig);\\n DragAndResizeConfig dr = new DragAndResizeConfig(new DragAndResizeCallback() {\\n @Override\\n public void eventResizeStop(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventResizeStop\");\\n } @Override\\n public void eventResizeStart(JavaScriptObject calendarEvent,NativeEvent nativeEvent) { //System.out.println(\"eventResizeStart\");\\n } @Override\\n public void eventResize(JavaScriptObject calendarEvent, JavaScriptObject revertFunction,NativeEvent nativeEvent) {\\n //System.out.println(\"eventResize\");\\n }\\n @Override\\n public void eventDrop(JavaScriptObject calendarEvent, JavaScriptObject revertFunction,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDrop\");\\n Event evt = new Event(calendarEvent);\\n System.out.println(\"eventDrop: \" + evt.getStartFromYearMonthDay());\\n }\\n @Override\\n public void eventDragStop(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDragStop\");\\n } @Override\\n public void eventDragStart(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDragStart\");\\n }\\n });\\n config.setDragResizeConfig(dr);\\n GeneralDisplay gd = new GeneralDisplay();\\n config.setGeneralDisplay(gd);\\n FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.agendaWeek,config,true);\\n fc.addLoadHandler(new LoadHandler() {\\n @Override\\n public void onLoad(LoadEvent event) {\\n addEvents();//see code below\\n }\\n });\\n ...\\n someContainerWidget.add(fc);\\n ...\\n //add some events to the calendar manually/randomly...\\n protected void addEvents() {\\n for (int i = 0; i 15; i++) {\\n Event calEvent = new Event(\"id:\" + i, \"This is Event: \" + i);\\n int day = Random.nextInt(10);\\n Date start = new Date();\\n CalendarUtil.addDaysToDate(start, -1 * day);\\n calEvent.setStart(start);\\n if( i % 3 == 0 ){\\n calEvent.setAllDay(true);\\n }else{\\n Date d = new Date(start.getTime());\\n d.setHours(d.getHours() + 1);\\n calEvent.setEnd(d);\\n }\\n fc.addEvent(calEvent);\\n }\\n }\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html10(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("...\\n CalendarConfig config = new CalendarConfig();\\n ClickAndHoverConfig clickHover = new ClickAndHoverConfig(new ClickAndHoverEventCallback() {\\n @Override\\n public void eventMouseover(JavaScriptObject calendarEvent,NativeEvent event, JavaScriptObject viewObject) {\\n }\\n @Override\\n public void eventMouseout(JavaScriptObject calendarEvent,NativeEvent event, JavaScriptObject viewObject) {\\n }\\n @Override\\n public void eventClick(JavaScriptObject calendarEvent, NativeEvent event,JavaScriptObject viewObject) {\\n Event calEvent = new Event(calendarEvent);\\n System.out.println(\"id \" + calEvent.getId() + \" start: \" + calEvent.getStart() + \" end: \" + calEvent.getEnd() + \" all day: \" + calEvent.isAllDay());\\n if (Window.confirm(\"Delete '\" + calEvent.getTitle() + \"'?\")) configuringCalendar.removeEvent(calEvent.getId());\\n Window.alert(calEvent.getTitle());\\n }\\n @Override\\n public void dayClick(JavaScriptObject moment, NativeEvent event,JavaScriptObject viewObject) {\\n }\\n });\\n config.setClickHoverConfig(clickHover);\\n SelectConfig selectConfig = new SelectConfig(new SelectEventCallback() {\\n \\n \\s@Override\\n \\spublic void select(JavaScriptObject start, JavaScriptObject end, NativeEvent event, JavaScriptObject viewObject) {\\n \\s\\sEvent tempEvent = new Event(\"\" + System.currentTimeMillis(), \"New event\");\\n \\s\\stempEvent.setStart(start);\\n \\s\\stempEvent.setEnd(end);\\n \\s\\sif (tempEvent.getEnd().getHours() == tempEvent.getStart().getHours() &amp;&amp; tempEvent.getEnd().getMinutes() == tempEvent.getStart().getMinutes())\\n \\s\\s\\stempEvent.setAllDay(true);\\n \\s\\sif (Window.confirm(\"Create event?\")) {\\n \\s\\s\\sconfiguringCalendar.unselect();\\n \\s\\sconfiguringCalendar.addEvent(tempEvent);\\n \\s\\s}\\n \\s}\\n \\n \\s@Override\\n \\spublic void unselect(JavaScriptObject viewObject, NativeEvent event) {\\n \\s\\s// System.out.println(\"unselect\");\\n \\s}\\n });\\n config.setSelectConfig(selectConfig);\\n DragAndResizeConfig dr = new DragAndResizeConfig(new DragAndResizeCallback() {\\n @Override\\n public void eventResizeStop(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventResizeStop\");\\n } @Override\\n public void eventResizeStart(JavaScriptObject calendarEvent,NativeEvent nativeEvent) { //System.out.println(\"eventResizeStart\");\\n } @Override\\n public void eventResize(JavaScriptObject calendarEvent, JavaScriptObject revertFunction,NativeEvent nativeEvent) {\\n //System.out.println(\"eventResize\");\\n }\\n @Override\\n public void eventDrop(JavaScriptObject calendarEvent, JavaScriptObject revertFunction,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDrop\");\\n Event evt = new Event(calendarEvent);\\n System.out.println(\"eventDrop: \" + evt.getStartFromYearMonthDay());\\n }\\n @Override\\n public void eventDragStop(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDragStop\");\\n } @Override\\n public void eventDragStart(JavaScriptObject calendarEvent,NativeEvent nativeEvent) {\\n //System.out.println(\"eventDragStart\");\\n }\\n });\\n config.setDragResizeConfig(dr);\\n GeneralDisplay gd = new GeneralDisplay();\\n config.setGeneralDisplay(gd);\\n FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.agendaWeek,config,true);\\n fc.addLoadHandler(new LoadHandler() {\\n @Override\\n public void onLoad(LoadEvent event) {\\n addEvents();//see code below\\n }\\n });\\n ...\\n someContainerWidget.add(fc);\\n ...\\n //add some events to the calendar manually/randomly...\\n protected void addEvents() {\\n for (int i = 0; i 15; i++) {\\n Event calEvent = new Event(\"id:\" + i, \"This is Event: \" + i);\\n int day = Random.nextInt(10);\\n Date start = new Date();\\n CalendarUtil.addDaysToDate(start, -1 * day);\\n calEvent.setStart(start);\\n if( i % 3 == 0 ){\\n calEvent.setAllDay(true);\\n }else{\\n Date d = new Date(start.getTime());\\n d.setHours(d.getHours() + 1);\\n calEvent.setEnd(d);\\n }\\n fc.addEvent(calEvent);\\n }\\n }\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("CalendarConfig config = new CalendarConfig();\\n config.setLangauge(Language.Spanish); FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.month,config,true);\\n ...\\n someContainerWidget.add(fc);\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html11(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("CalendarConfig config = new CalendarConfig();\\n config.setLangauge(Language.Spanish); FullCalendar fc = new FullCalendar(\"some_unique_id\",ViewOption.month,config,true);\\n ...\\n someContainerWidget.add(fc);\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}


/**
 * @Template("Event lunch = new Event(\"some_event_id\", \"Business lunch\");\\n ...\\n lunch.setConstraint(\"businessHours\");\\n fc.addEvent(lunch);\\n ...\\n \\n Event available = new Event(\"availableForMeeting\", \"\");\\n ...\\n available.setRendering(\"background\");\\n available.setBackgroundColor(\"#8FDF82\");\\n fc.addEvent(available);\\n ...\\n \\n Event meeting = new Event(\"some_event_id\", \"Meeting\");\\n ...\\n meeting.setConstraint(\"availableForMeeting\");\\n meeting.setBackgroundColor(\"#257e4a\");\\n fc.addEvent(meeting);\\n ...\\n \\n Event blocked = new Event(\"some_event_id\", \"\");\\n ...\\n blocked.setAllDay(true);\\n blocked.setOverlap(false);\\n blocked.setRendering(\"background\");\\n blocked.setBackgroundColor(\"#ff9f89\");\\n fc.addEvent(blocked); ...\\n")
 */
public org.gwtproject.safehtml.shared.SafeHtml html12(
) {
  StringBuilder sb = new java.lang.StringBuilder();
  sb.append("Event lunch = new Event(\"some_event_id\", \"Business lunch\");\\n ...\\n lunch.setConstraint(\"businessHours\");\\n fc.addEvent(lunch);\\n ...\\n \\n Event available = new Event(\"availableForMeeting\", \"\");\\n ...\\n available.setRendering(\"background\");\\n available.setBackgroundColor(\"#8FDF82\");\\n fc.addEvent(available);\\n ...\\n \\n Event meeting = new Event(\"some_event_id\", \"Meeting\");\\n ...\\n meeting.setConstraint(\"availableForMeeting\");\\n meeting.setBackgroundColor(\"#257e4a\");\\n fc.addEvent(meeting);\\n ...\\n \\n Event blocked = new Event(\"some_event_id\", \"\");\\n ...\\n blocked.setAllDay(true);\\n blocked.setOverlap(false);\\n blocked.setRendering(\"background\");\\n blocked.setBackgroundColor(\"#ff9f89\");\\n fc.addEvent(blocked); ...\\n");
return new org.gwtproject.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}

}
