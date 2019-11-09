package org.treblereel.mvp.presenter.extras;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.extras.BootboxJSView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class BootboxJSPresenter implements Presenter {

    private BootboxJSView display = new BootboxJSView();

    public BootboxJSPresenter() {
        display.init();
    }

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}