package org.treblereel.mvp.view.components;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class Alert extends Composite {

    @UiField
    org.gwtbootstrap3.client.ui.Alert dismissibleAlert;

    public Alert() {
        initWidget(Binder.INSTANCE.createAndBindUi(this));

        //dismissibleAlert.addCloseHandler(evt -> Window.alert("CLOSE FIRED"));
        //dismissibleAlert.addClosedHandler(evt -> Window.alert("CLOSED FIRED"));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, Alert> {

        Alert.Binder INSTANCE = new Alert_BinderImpl();
    }
}
