package service;

import model.Event;
import repository.EventRepository;

public class EventService implements EventServiceInterface{
    private EventRepository eventRepository;
    @Override
    public void createEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public void removeEvent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Event findById(Long id) {
        return findById(id);
    }

    @Override
    public void updateEvent(Event event) {

    }
}
