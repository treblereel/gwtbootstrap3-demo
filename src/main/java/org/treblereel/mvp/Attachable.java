package org.treblereel.mvp;

import org.gwtproject.event.shared.Event;
import org.gwtproject.user.client.ui.IsWidget;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/20/19
 */
public abstract class Attachable extends Event<Attachable.EventHandler> implements IsWidget {

    public static Event.Type<EventHandler> TYPE = new Event.Type<>();

    @Override
    public Event.Type<EventHandler> getAssociatedType() {
        return TYPE;
    }

    public interface EventHandler {
        void on(Attachable event);
    }

}
