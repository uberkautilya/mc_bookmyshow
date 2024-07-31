package uber.kautilya.machinecoding.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen extends BaseModel {
    private String name;
    private List<Seat> seatList;
    private Theatre theatre;
    private List<Feature> featureList;
}
