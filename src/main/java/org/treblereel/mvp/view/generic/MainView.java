package org.treblereel.mvp.view.generic;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class MainView extends Composite {

    public MainView() {
        initWidget(MainView.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, MainView> {

        MainView.Binder INSTANCE = new MainView_BinderImpl();
    }
}
