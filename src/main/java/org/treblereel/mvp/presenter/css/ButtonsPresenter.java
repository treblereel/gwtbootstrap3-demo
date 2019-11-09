package org.treblereel.mvp.presenter.css;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.css.Buttons;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/21/19
 */
public class ButtonsPresenter implements Presenter {

    private Composite display = new Buttons();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}
