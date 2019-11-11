package org.treblereel.mvp.view.extras;

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

import org.gwtbootstrap3.extras.gallery.client.ui.Gallery;
import org.gwtproject.dom.client.Element;
import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiHandler;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Ben Dol
 */
public class GalleryView extends Composite {

    @UiField
    Gallery gallery;
    @UiField
    Gallery galleryWithControls;
    public GalleryView() {
        initWidget(Binder.INSTANCE.createAndBindUi(this));
    }

    @UiHandler({"delete1", "delete2", "delete3", "delete4", "delete5", "delete6"})
    protected void deleteFirstClick(ClickEvent event) {
        Element element = Element.as(event.getNativeEvent().getEventTarget());
        Element item = element.getParentElement();
        if (item != null) {
            item.getParentElement().removeFromParent();
        }
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, GalleryView> {

        GalleryView.Binder INSTANCE = new GalleryView_BinderImpl();
    }
}