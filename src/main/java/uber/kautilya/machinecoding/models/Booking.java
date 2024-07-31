package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    //Booking: ShowSeat -> 1: M cardinality
    @OneToMany
    private List<ShowSeat> showSeats;
    private int amount;
    //Booking: Payments -> 1: M cardinality
    @OneToMany
    private List<Payment> payments;
    //Many: 1 -> Booking: User
    @ManyToOne
    private User bookedBy;
    private Date bookingDate;
    private BookingStatus status;
}
