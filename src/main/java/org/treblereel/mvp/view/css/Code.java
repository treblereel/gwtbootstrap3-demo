package org.treblereel.mvp.view.css;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/21/19
 */
public class Code extends Composite {

    public Code() {
        initWidget(Binder.INSTANCE.createAndBindUi(this));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, Code> {
        Binder INSTANCE = new Code_BinderImpl();
    }
}
