package org.treblereel;

import elemental2.dom.DomGlobal;
import org.gwtbootstrap3.client.GwtBootstrap3EntryPoint;
import org.gwtbootstrap3.client.ui.html.Div;
import org.gwtbootstrap3.extras.animate.client.AnimateEntryPoint;
import org.gwtbootstrap3.extras.bootbox.client.BootboxEntryPoint;
import org.gwtbootstrap3.extras.card.client.CardEntryPoint;
import org.gwtbootstrap3.extras.datepicker.client.DatePickerEntryPoint;
import org.gwtbootstrap3.extras.datetimepicker.client.DateTimePickerEntryPoint;
import org.gwtbootstrap3.extras.fullcalendar.client.FullCalendarEntryPoint;
import org.gwtbootstrap3.extras.gallery.client.GalleryEntryPoint;
import org.gwtbootstrap3.extras.notify.client.NotifyEntryPoint;
import org.gwtbootstrap3.extras.select.client.SelectEntryPoint;
import org.gwtbootstrap3.extras.slider.client.SliderEntryPoint;
import org.gwtbootstrap3.extras.summernote.client.SummernoteEntryPoint;
import org.gwtbootstrap3.extras.tagsinput.client.TagsInputEntryPoint;
import org.gwtbootstrap3.extras.toggleswitch.client.ToggleSwitchEntryPoint;
import org.gwtbootstrap3.extras.typeahead.client.TypeaheadEntryPoint;
import org.gwtproject.core.client.EntryPoint;
import org.gwtproject.dom.style.shared.Unit;
import org.gwtproject.user.client.ui.RootPanel;
import org.gwtproject.user.client.ui.VerticalPanel;

public class App implements EntryPoint {

    public void onModuleLoad() {
        DomGlobal.console.log("onModuleLoad");

        new GwtBootstrap3EntryPoint().onModuleLoad();
        new AnimateEntryPoint().onModuleLoad();
        new BootboxEntryPoint().onModuleLoad();
        new CardEntryPoint().onModuleLoad();
        new DatePickerEntryPoint().onModuleLoad();
        new DateTimePickerEntryPoint().onModuleLoad();
        new FullCalendarEntryPoint().onModuleLoad();
        new GalleryEntryPoint().onModuleLoad();
        new NotifyEntryPoint().onModuleLoad();
        new SelectEntryPoint().onModuleLoad();
        new SliderEntryPoint().onModuleLoad();
        new SummernoteEntryPoint().onModuleLoad();
        new TagsInputEntryPoint().onModuleLoad();
        new ToggleSwitchEntryPoint().onModuleLoad();
        new TypeaheadEntryPoint().onModuleLoad();

        org.gwtproject.user.client.ui.Panel rootPanel = new VerticalPanel();
        org.gwtproject.user.client.ui.Panel container = new Div();
        container.getElement().setClassName("container");
        container.getElement().getStyle().setMarginLeft(10, Unit.PCT);
        rootPanel.add(new org.treblereel.MainMenu());
        rootPanel.add(container);

        RootPanel.get().add(rootPanel);
        AppController appController = new AppController();

        appController.dispatch(container);

    }
}
