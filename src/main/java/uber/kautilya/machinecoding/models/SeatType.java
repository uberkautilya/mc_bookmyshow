package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * Each theatre has its own nomenclature
 */
@Entity
@Getter
@Setter
public class SeatType extends BaseModel {
    public String value;
}
