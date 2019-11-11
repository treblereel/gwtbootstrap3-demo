package org.treblereel.mvp.presenter.extras;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.extras.TypeaheadView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class TypeaheadPresenter implements Presenter {

    private TypeaheadView display = new TypeaheadView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}