package org.treblereel.mvp.presenter.javascript;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.javascript.CollapseView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class CollapsePresenter implements Presenter {

    private CollapseView display = new CollapseView();

    public CollapsePresenter() {
        display.init();
    }

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}
