package org.treblereel.mvp.presenter.components;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.components.Label;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/25/19
 */
public class LabelPresenter implements Presenter {

    private Composite display = new Label();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}
