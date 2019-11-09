package org.treblereel.mvp.view.components;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class Jumbotron extends Composite {

    public Jumbotron() {
        initWidget(Jumbotron.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, Jumbotron> {

        Jumbotron.Binder INSTANCE = new Jumbotron_BinderImpl();
    }
}