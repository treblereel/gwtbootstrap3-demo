package org.treblereel.mvp.view.css;

import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.FormGroup;
import org.gwtbootstrap3.client.ui.PageHeader;
import org.gwtbootstrap3.client.ui.constants.ValidationState;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/21/19
 */
public class Forms extends Composite {

    @UiField
    FormGroup formGroup;
    @UiField
    Button none;
    @UiField
    Button success;
    @UiField
    Button warning;
    @UiField
    Button error;

    public Forms() {
        initWidget(Binder.INSTANCE.createAndBindUi(this));

        none.addClickHandler(event -> formGroup.setValidationState(ValidationState.NONE));

        success.addClickHandler(event -> formGroup.setValidationState(ValidationState.SUCCESS));

        warning.addClickHandler(event -> formGroup.setValidationState(ValidationState.WARNING));

        error.addClickHandler(event -> formGroup.setValidationState(ValidationState.ERROR));

        new PageHeader().setText("");
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, Forms> {

        Binder INSTANCE = new Forms_BinderImpl();
    }
}
