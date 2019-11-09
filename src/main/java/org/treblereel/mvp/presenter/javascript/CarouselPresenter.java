package org.treblereel.mvp.presenter.javascript;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.javascript.CarouselView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class CarouselPresenter implements Presenter {

    private Composite display = new CarouselView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}