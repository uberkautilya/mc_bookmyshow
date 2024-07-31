package uber.kautilya.machinecoding.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Region extends BaseModel {
    private String name;
    /*
    The use case for this is low. Choosing region to get theatre list available - not very common
    Perhaps, other pathways to achieve the same are possible
    private List<Theatre> theatreList;
    */
}
