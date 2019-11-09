package org.treblereel.mvp.view.css;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class ResponsiveUtilities extends Composite {

    public ResponsiveUtilities() {
        initWidget(ResponsiveUtilities.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, ResponsiveUtilities> {

        ResponsiveUtilities.Binder INSTANCE = new ResponsiveUtilities_BinderImpl();
    }
}
