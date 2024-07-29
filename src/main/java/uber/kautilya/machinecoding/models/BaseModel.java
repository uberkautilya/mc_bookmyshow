package uber.kautilya.machinecoding.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseModel {
    private int id;
    private Date creationDate;
    private Date modificationDate;
}
