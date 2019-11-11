package org.treblereel.mvp.view.javascript;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
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

import org.gwtbootstrap3.client.shared.event.HideEvent;
import org.gwtbootstrap3.client.shared.event.HideHandler;
import org.gwtbootstrap3.client.shared.event.ShowEvent;
import org.gwtbootstrap3.client.shared.event.ShowHandler;
import org.gwtbootstrap3.client.ui.PanelCollapse;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;
import org.gwtproject.user.window.client.Window;

/**
 * @author Joshua Godi
 */
public class CollapseView extends Composite {

    @UiField
    PanelCollapse collapseOne;

    public CollapseView() {
        initWidget(CollapseView.Binder.INSTANCE.createAndBindUi(this));
    }

    public void init() {
        // Add handlers
        collapseOne.addShowHandler(showEvent -> Window.alert("SHOW ONE"));

        collapseOne.addHideHandler(hideEvent -> Window.alert("HIDE ONE"));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, CollapseView> {

        CollapseView.Binder INSTANCE = new CollapseView_BinderImpl();
    }
}