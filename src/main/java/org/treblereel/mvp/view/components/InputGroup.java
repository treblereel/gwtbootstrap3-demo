package org.treblereel.mvp.view.components;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class InputGroup extends Composite {

    public InputGroup() {
        initWidget(InputGroup.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, InputGroup> {

        InputGroup.Binder INSTANCE = new InputGroup_BinderImpl();
    }
}
