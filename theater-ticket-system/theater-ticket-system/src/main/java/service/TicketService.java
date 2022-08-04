package service;

import model.Event;
import model.Ticket;
import model.User;
import repository.TicketRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class TicketService implements TicketServiceInterface{
    private TicketRepository ticketRepository;
    @Override
    public void createTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    @Override
    public void removeTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public void updateTicketById(Ticket id) {

    }

    @Override
    public List<Ticket> findAllTicketsByUser(User id) {
        return null;
    }

    @Override
    public List<Ticket> findAllTicketByEvent(Event event) {
        return null;
    }

    @Override
    public List<Event> findAllEventsBetweenDates(LocalDate from, LocalDate to) {
        return null;
    }
}
