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

import org.gwtbootstrap3.client.ui.Button;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Joshua Godi
 */
public class PopoverView extends Composite {

    @UiField
    org.gwtbootstrap3.client.ui.Popover forcePopover;
    @UiField
    Button forceShowButton;
    @UiField
    Button forceHideButton;

    public PopoverView() {
        initWidget(PopoverView.Binder.INSTANCE.createAndBindUi(this));
    }

    public void init() {

        forceHideButton.addClickHandler(event -> forcePopover.hide());

        forceShowButton.addClickHandler(event -> forcePopover.show());
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, PopoverView> {

        PopoverView.Binder INSTANCE = new PopoverView_BinderImpl();
    }
}
