package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    private Screen screen;
    private Movie movie;
    private Date startTime;
    private int duration;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
}
