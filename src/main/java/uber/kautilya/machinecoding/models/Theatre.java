package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;
    //private List<Screen> screenList;
    //Based on the show, screen is automatically selected - admin chooses this
    @ManyToOne
    private Region region; //Region: Theatre -> 1:M cardinality -> region_id in theatre table
}
