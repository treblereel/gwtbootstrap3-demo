package org.treblereel.mvp.presenter.generic;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.generic.MainView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public class MainPresenter implements Presenter {

    private Composite display = new MainView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}