package org.treblereel;

import org.gwtbootstrap3.client.ui.NavbarCollapse;
import org.gwtproject.uibinder.client.UiBinder;
import org.gwtproject.uibinder.client.UiField;
import org.gwtproject.uibinder.client.UiTemplate;
import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.IsWidget;
import org.gwtproject.user.client.ui.SimplePanel;
import org.gwtproject.user.client.ui.Widget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public class MainMenu extends Composite {

    @UiField
    SimplePanel contentContainer;
    @UiField
    NavbarCollapse navbarCollapse;

    public MainMenu() {
        initWidget(Binder.INSTANCE.createAndBindUi(this));
    }

    public NavbarCollapse getNavbarCollapse() {
        return navbarCollapse;
    }

    @UiTemplate
    interface Binder extends UiBinder<Widget, MainMenu> {

        Binder INSTANCE = new MainMenu_BinderImpl();
    }
}
