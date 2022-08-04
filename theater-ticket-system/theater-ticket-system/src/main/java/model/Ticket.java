package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Ticket")
@Table(name = "ticket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @SequenceGenerator(name = "ticket_sequence", sequenceName = "ticket_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_sequence")
    @Column(name = "id", updatable = false)
    private Long ticketId;

    @Column(name = "price", nullable = false, columnDefinition = "Decimal(10,2) default '0.00'")
    private Double price;

    @Column(name = "row", nullable = false)
    private int row;

    @Column(name = "seat", nullable = false)
    private int seat;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "event_id")
    private Event event;

}
