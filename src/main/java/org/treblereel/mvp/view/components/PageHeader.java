package org.treblereel.mvp.view.components;

import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/26/19
 */
public class PageHeader extends Composite {

    public PageHeader() {
        initWidget(PageHeader.Binder.INSTANCE.createAndBindUi(this));
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, PageHeader> {

        PageHeader.Binder INSTANCE = new PageHeader_BinderImpl();
    }
}
