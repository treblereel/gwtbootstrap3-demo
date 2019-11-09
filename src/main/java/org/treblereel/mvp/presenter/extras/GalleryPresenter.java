package org.treblereel.mvp.presenter.extras;

import org.gwtproject.user.client.ui.Panel;
import org.treblereel.mvp.presenter.Presenter;
import org.treblereel.mvp.view.extras.GalleryView;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/29/19
 */
public class GalleryPresenter implements Presenter {

    private GalleryView display = new GalleryView();

    @Override
    public void dispatch(Panel container) {
        container.add(display);
    }
}