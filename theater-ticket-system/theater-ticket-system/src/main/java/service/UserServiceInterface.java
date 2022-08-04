package service;

import model.Event;
import model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    void createUser(User user);

    void deleteUser(Long id);

    Optional<User> findById(Long id);

    void updateUserInformation(User user);

    /**
     * Return all visited events
     */
    List<Event> getAllVisitedEvent();

    /**
     * Return all visited events for the past month
     */
    List<Event> getAllVisitedEventsInPastMonth();
}
