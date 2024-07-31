package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;
}
/*
1 ShowSeat: 1 Show
1 Show can be referenced in multiple ShowSeat objects

show1: Seat1 Booked
Show1: Seat2 Booked
Show1: Seat3 Available

The same seat is present in many showSeats
 */
