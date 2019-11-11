package org.treblereel.mvp.presenter.components;

import org.gwtproject.user.client.ui.Composite;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.components.Panel;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/26/19
 */
public class PanelPresenter implements Presenter {

    private Composite display = new Panel();

    @Override
    public void dispatch(org.gwtproject.user.client.ui.Panel container) {
        container.add(display);
    }
}
