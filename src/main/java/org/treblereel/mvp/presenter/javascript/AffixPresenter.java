package org.treblereel.mvp.presenter.javascript;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.javascript.AffixView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class AffixPresenter implements Presenter {

    private Composite display = new AffixView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}