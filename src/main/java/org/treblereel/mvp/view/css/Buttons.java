package org.treblereel.mvp.view.css;

import org.gwtbootstrap3.client.ui.Button;
import org.gwtproject.event.dom.client.ClickEvent;
import org.gwtproject.timer.client.Timer;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiHandler;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/21/19
 */
public class Buttons extends Composite {

    @UiField
    Button button;

    public Buttons() {
        initWidget(Binder.INSTANCE.createAndBindUi(this));
    }

    @UiHandler("button")
    public void onButtonClick(final ClickEvent event) {
        button.state().loading();

        new Timer() {
            @Override
            public void run() {
                button.state().reset();
            }
        }.schedule(2000);
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, Buttons> {

        Buttons.Binder INSTANCE = new Buttons_BinderImpl();
    }
}
