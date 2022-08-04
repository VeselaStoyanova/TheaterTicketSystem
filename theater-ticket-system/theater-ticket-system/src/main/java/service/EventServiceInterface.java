package service;

import model.Event;

public interface EventServiceInterface {
    void createEvent(Event event);

    void removeEvent(Long id);

    Event findById(Long id);

    void updateEvent(Event event);
}
