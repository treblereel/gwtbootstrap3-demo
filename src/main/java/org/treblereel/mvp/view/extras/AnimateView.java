package org.treblereel.mvp.view.extras;

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
import org.gwtbootstrap3.extras.animate.client.ui.Animate;
import org.gwtbootstrap3.extras.animate.client.ui.constants.Animation;
import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiHandler;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Pavel Zlámal
 */
public class AnimateView extends Composite {

    @UiField
    Button animated;
    @UiField
    Button run;

    public AnimateView() {
        initWidget(AnimateView.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiHandler("animated")
    public void onClickAnim(ClickEvent event) {
        Animate.animate(animated, Animation.RUBBER_BAND);
    }

    @UiHandler("run")
    public void onClick(ClickEvent event) {
        Animate.animate(run, Animation.RUBBER_BAND, 2, 4000);
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, AnimateView> {

        AnimateView.Binder INSTANCE = new AnimateView_BinderImpl();
    }
}
