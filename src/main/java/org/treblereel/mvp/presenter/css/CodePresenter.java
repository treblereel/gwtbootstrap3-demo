package org.treblereel.mvp.presenter.css;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.css.Code;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/21/19
 */
public class CodePresenter implements Presenter {

    private Composite display = new Code();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}
