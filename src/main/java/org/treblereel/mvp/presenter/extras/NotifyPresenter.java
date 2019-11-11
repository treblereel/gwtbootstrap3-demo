package org.treblereel.mvp.presenter.extras;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.extras.NotifyView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class NotifyPresenter implements Presenter {

    private NotifyView display = new NotifyView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}