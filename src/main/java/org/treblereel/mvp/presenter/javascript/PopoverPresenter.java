package org.treblereel.mvp.presenter.javascript;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.javascript.PopoverView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class PopoverPresenter implements Presenter {

    private PopoverView display = new PopoverView();

    public PopoverPresenter() {
        display.init();
    }

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}
