package org.treblereel.mvp.presenter.css;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.css.ResponsiveUtilities;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class ResponsiveUtilitiesPresenter implements Presenter {

    private Composite display = new ResponsiveUtilities();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}
