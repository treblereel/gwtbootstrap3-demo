package org.treblereel.mvp.presenter.components;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.components.Alert;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class AlertPresenter implements Presenter {

    private Composite display = new Alert();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}