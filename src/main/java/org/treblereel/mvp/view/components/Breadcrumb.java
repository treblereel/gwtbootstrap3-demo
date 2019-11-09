package org.treblereel.mvp.view.components;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class Breadcrumb extends Composite {

    public Breadcrumb() {
        initWidget(Breadcrumb.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, Breadcrumb> {

        Breadcrumb.Binder INSTANCE = new Breadcrumb_BinderImpl();
    }
}