package uber.kautilya.machinecoding.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @OneToMany
    private List<Seat> seatList;
    @ManyToOne
    private Theatre theatre;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection //Will result in a separate table with screed_id - feature_ordinal mapping
    private List<Feature> featureList;
}
// We create separate tables for enums