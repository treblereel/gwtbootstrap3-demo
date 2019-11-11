package org.treblereel.mvp.view;

import org.gwtproject.user.client.ui.VerticalPanel;
import org.gwtproject.user.client.ui.Widget;
import org.treblereel.mvp.Attachable;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public class MenuView extends Attachable {

    VerticalPanel panel = new VerticalPanel();

    public MenuView() {
    }

    @Override
    protected void dispatch(EventHandler handler) {

    }

    @Override
    public Widget asWidget() {
        return panel;
    }
}
