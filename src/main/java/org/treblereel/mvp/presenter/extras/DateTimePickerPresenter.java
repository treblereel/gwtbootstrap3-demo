package org.treblereel.mvp.presenter.extras;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.extras.DateTimePickerView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class DateTimePickerPresenter implements Presenter {

    private DateTimePickerView display = new DateTimePickerView();

    public DateTimePickerPresenter() {
        display.init();
    }

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}