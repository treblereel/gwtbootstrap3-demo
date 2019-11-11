package org.treblereel.mvp.view.components;

import org.gwtbootstrap3.client.ui.RadioButton;
import org.gwtbootstrap3.client.ui.html.Paragraph;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.FlowPanel;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class ButtonGroup extends Composite {

    @UiField
    RadioButton button1;

    @UiField
    RadioButton button2;

    @UiField
    RadioButton button3;

    @UiField
    FlowPanel log;

    public ButtonGroup() {
        initWidget(ButtonGroup.Binder.INSTANCE.createAndBindUi(this));
    }

    public void init() {
        button1.addValueChangeHandler(event -> log("Value of button1 changed to: " + event.getValue().toString()));

        button2.addValueChangeHandler(event -> log("Value of button2 changed to: " + event.getValue().toString()));

        button3.addValueChangeHandler(event -> log("Value of button3 changed to: " + event.getValue().toString()));
    }

    private void log(final String msg) {
        final Paragraph p = new Paragraph();
        p.setText(msg);
        log.add(p);
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, ButtonGroup> {

        ButtonGroup.Binder INSTANCE = new ButtonGroup_BinderImpl();
    }
}
