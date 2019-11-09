package org.treblereel.mvp.presenter.components;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.components.ButtonGroup;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class ButtonGroupPresenter implements Presenter {

    private Boolean done = false;

    private ButtonGroup display = new ButtonGroup();

    public ButtonGroupPresenter() {
        display.init();
    }

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}