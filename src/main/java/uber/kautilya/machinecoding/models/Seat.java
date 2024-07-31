package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int seatNumber;
    private int row;
    private int column;
    @ManyToOne
    private SeatType seatType;
}
