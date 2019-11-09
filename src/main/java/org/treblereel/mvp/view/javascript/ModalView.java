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
import org.gwtbootstrap3.client.ui.Modal;
import org.gwtbootstrap3.client.ui.ModalBody;
import org.gwtbootstrap3.client.ui.ModalFooter;
import org.gwtbootstrap3.client.ui.html.Paragraph;
import org.gwtbootstrap3.client.ui.html.Span;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Joshua Godi
 */
public class ModalView extends Composite {

    @UiField
    Modal eventModal;
    @UiField
    Button clearLogButton;
    @UiField
    FlowPanel logRow;
    @UiField
    Button createModal;

    public ModalView() {
        initWidget(ModalView.Binder.INSTANCE.createAndBindUi(this));
    }

    public void init() {

        clearLogButton.addClickHandler(event -> logRow.clear());

        eventModal.addHideHandler(evt -> {
            final Paragraph logEntry = new Paragraph();
            logEntry.setText("Hide event fired! (UiBinder Modal)");
            logRow.add(logEntry);
        });

        eventModal.addHiddenHandler(evt -> {
            final Paragraph logEntry = new Paragraph();
            logEntry.setText("Hidden event fired! (UiBinder Modal)");
            logRow.add(logEntry);
        });

        eventModal.addShowHandler(evt -> {
            final Paragraph logEntry = new Paragraph();
            logEntry.setText("Show event fired! (UiBinder Modal)");
            logRow.add(logEntry);
        });

        eventModal.addShownHandler(evt -> {
            final Paragraph logEntry = new Paragraph();
            logEntry.setText("Shown event fired! (UiBinder Modal)");
            logRow.add(logEntry);
        });

        createModal.addClickHandler(event -> {
            final Modal modal = new Modal();
            modal.setTitle("Java Created Modal");
            modal.setClosable(true);
            modal.setRemoveOnHide(true);

            modal.addHideHandler(evt -> {
                final Paragraph logEntry = new Paragraph();
                logEntry.setText("Hide event fired! (Java Created Modal)");
                logRow.add(logEntry);
            });

            modal.addHiddenHandler(evt -> {
                final Paragraph logEntry = new Paragraph();
                logEntry.setText("Hidden event fired! (Java Created Modal)");
                logRow.add(logEntry);
            });

            modal.addShowHandler(evt -> {
                final Paragraph logEntry = new Paragraph();
                logEntry.setText("Show event fired! (Java Created Modal)");
                logRow.add(logEntry);
            });

            modal.addShownHandler(evt -> {
                final Paragraph logEntry = new Paragraph();
                logEntry.setText("Shown event fired! (Java Created Modal)");
                logRow.add(logEntry);
            });

            final ModalBody modalBody = new ModalBody();
            modalBody.add(new Span("Create in Java Code!"));

            final ModalFooter modalFooter = new ModalFooter();
            modalFooter.add(new Button("Click ME!", event1 -> {
                final Paragraph logEntry = new Paragraph();
                logEntry.setText("Click Event from Modal! (Java Created Modal)");
                logRow.add(logEntry);
            }));

            modal.add(modalBody);
            modal.add(modalFooter);

            modal.show();
        });
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, ModalView> {

        ModalView.Binder INSTANCE = new ModalView_BinderImpl();
    }
}