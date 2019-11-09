package org.treblereel.mvp.presenter.css;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.css.GridSystem;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/22/19
 */
public class GridSystemPresenter implements Presenter {

    private Composite display = new GridSystem();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}