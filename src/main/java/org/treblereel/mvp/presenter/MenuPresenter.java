package org.treblereel.mvp.presenter;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.Attachable;
import org.treblereel.mvp.view.MenuView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public class MenuPresenter implements Presenter {

    private Attachable display = new MenuView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}