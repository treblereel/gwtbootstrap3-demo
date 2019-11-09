package org.treblereel.mvp.presenter.javascript;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.javascript.TabView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class TabPresenter implements Presenter {

    private TabView display = new TabView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}