package org.treblereel.mvp.presenter.components;

import org.gwtproject.user.client.ui.Composite;
import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.components.ListGroup;
import org.treblereel.mvp.view.components.MediaObject;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/26/19
 */
public class MediaObjectPresenter implements Presenter {

    private Composite display = new MediaObject();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}