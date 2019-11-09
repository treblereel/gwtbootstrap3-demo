package org.treblereel.mvp.presenter.components;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.components.Pagination;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/26/19
 */
public class PaginationPresenter implements Presenter {

    private Composite display = new Pagination();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}

