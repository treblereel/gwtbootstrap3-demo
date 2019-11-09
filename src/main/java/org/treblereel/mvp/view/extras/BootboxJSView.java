package org.treblereel.mvp.view.extras;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2016 GwtBootstrap3
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.gwtbootstrap3.client.ui.ListBox;
import org.gwtbootstrap3.client.ui.constants.ButtonType;
import org.gwtbootstrap3.extras.bootbox.client.Bootbox;
import org.gwtbootstrap3.extras.bootbox.client.callback.SimpleCallback;
import org.gwtbootstrap3.extras.bootbox.client.options.AlertOptions;
import org.gwtbootstrap3.extras.bootbox.client.options.BootboxLocale;
import org.gwtbootstrap3.extras.bootbox.client.options.BootboxSize;
import org.gwtbootstrap3.extras.bootbox.client.options.ConfirmOptions;
import org.gwtbootstrap3.extras.bootbox.client.options.DialogOptions;
import org.gwtbootstrap3.extras.bootbox.client.options.PromptOptions;
import org.gwtproject.event.dom.client.ChangeEvent;
import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiHandler;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;
import org.gwtproject.user.window.client.Window;

/**
 * @author lyhcode
 */
public class BootboxJSView extends Composite {

    @UiField
    ListBox localeBox;

    public BootboxJSView() {
        initWidget(BootboxJSView.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiHandler("localeBox")
    void onChangeLanguage(final ChangeEvent event) {
        String locale = localeBox.getSelectedValue();
        Bootbox.setLocale(BootboxLocale.valueOf(locale).getLocale());
    }

    @UiHandler("alertButton")
    void handleAlertButton(final ClickEvent event) {
        Bootbox.alert("Hello World");
    }

    @UiHandler("alertCallbackButton")
    void handleAlertCallbackButton(final ClickEvent event) {
        Bootbox.alert("Alert With Callback", new SimpleCallback() {
            @Override
            public void callback() {
                Window.alert("My Alert Callback");
            }
        });
    }

    @UiHandler("alertOptionsButton")
    void handleAlertOptionsButton(final ClickEvent event) {
        AlertOptions options = AlertOptions.newOptions("Alert With Options");
        options.setSize(BootboxSize.LARGE);
        options.setAnimate(false);
        options.setBackdrop(false);
        options.setTitle("Custome Alert Title");
        options.setCloseButton(false);
        Bootbox.alert(options);
    }

    @UiHandler("confirmButton")
    void handleConfirmButton(final ClickEvent event) {
        Bootbox.confirm("Hello World", result -> Window.alert("Return: " + result));
    }

    @UiHandler("confirmOptionsButton")
    void handleConfirmOptionsButton(final ClickEvent event) {
        ConfirmOptions options = ConfirmOptions.newOptions("Confirm With Options");
        options.setSize(BootboxSize.SMALL);
        options.setAnimate(false);
        options.setBackdrop(false);
        options.setTitle("Custome Confirm Title");
        options.setCloseButton(false);
        options.setCallback(result -> Window.alert("Return: " + result));
        Bootbox.confirm(options);
    }

    @UiHandler("promptButton")
    void handlePromptButton(final ClickEvent event) {
        Bootbox.prompt("Hello World", result -> Window.alert("Return: " + result));
    }

    @UiHandler("promptOptionsButton")
    void handlePromptOptionsButton(final ClickEvent event) {
        PromptOptions options = PromptOptions.newOptions("Prompt With Options");
        options.setAnimate(false);
        options.setBackdrop(false);
        options.setTitle("Custome Prompt Title");
        options.setCloseButton(false);
        options.setCallback(result -> Window.alert("Return: " + result));
        Bootbox.prompt(options);
    }

    @UiHandler("dialogButton")
    void handleDialogButton(ClickEvent event) {
        DialogOptions options = DialogOptions.newOptions("I am a custom dialog");
        options.setTitle("Custom title");
        options.setOnEscape(() -> Window.alert("On Escape!"));

        options.addButton("Success!", ButtonType.SUCCESS.getCssName(), () -> Window.alert("Success callback!"));
        options.addButton("Danger!", ButtonType.DANGER.getCssName(), () -> Window.alert("Danger callback!"));
        options.addButton("Click ME!");
        Bootbox.dialog(options);
    }

    public void init() {
        // Populate locales
        for (BootboxLocale locale : BootboxLocale.values()) {
            localeBox.addItem(locale.getLocale(), locale.name());
        }
        localeBox.setSelectedIndex(BootboxLocale.getDefault().ordinal());
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, BootboxJSView> {

        BootboxJSView.Binder INSTANCE = new BootboxJSView_BinderImpl();
    }
}
