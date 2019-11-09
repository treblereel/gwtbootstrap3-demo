package org.treblereel.mvp.presenter;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.view.generic.MainView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public class MainPresenter implements Presenter {

    private MainView display = new MainView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}
