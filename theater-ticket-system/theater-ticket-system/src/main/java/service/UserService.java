package service;

import model.Event;
import model.User;
import repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService implements UserServiceInterface{
    private UserRepository userRepository;
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void updateUserInformation(User user) {

    }

    @Override
    public List<Event> getAllVisitedEvent() {
        return null;
    }

    @Override
    public List<Event> getAllVisitedEventsInPastMonth() {
        return null;
    }
}
