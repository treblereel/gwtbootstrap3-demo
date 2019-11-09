package org.treblereel.mvp.presenter.extras;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.extras.SliderView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class SliderPresenter implements Presenter {

    private SliderView display = new SliderView();

    public SliderPresenter() {
         display.init();
    }

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}