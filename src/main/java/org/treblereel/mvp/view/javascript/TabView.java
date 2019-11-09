package org.treblereel.mvp.view.javascript;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
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

import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.TabListItem;
import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiHandler;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author godi
 */
public class TabView extends Composite {

    @UiField
    TabListItem tab7ListItem;
    @UiField
    TabListItem tab8ListItem;
    @UiField
    TabListItem tab9ListItem;
    @UiField
    Button tab7Button;
    @UiField
    Button tab8Button;
    @UiField
    Button tab9Button;

    public TabView() {
        initWidget(TabView.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiHandler("tab7Button")
    public void handleTab7(final ClickEvent event) {
        tab7ListItem.showTab();
    }

    @UiHandler("tab8Button")
    public void handleTab8(final ClickEvent event) {
        tab8ListItem.showTab();
    }

    @UiHandler("tab9Button")
    public void handleTab9(final ClickEvent event) {
        tab9ListItem.showTab();
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, TabView> {

        TabView.Binder INSTANCE = new TabView_BinderImpl();
    }
}
