package org.treblereel.mvp.presenter;

import org.gwtproject.user.client.ui.Panel;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public interface Presenter {

    void dispatch(final Panel container);
}

