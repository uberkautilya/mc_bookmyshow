package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "users") //MySQL reserves the name 'user'
public class User extends BaseModel {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    @OneToMany
    private List<Booking> bookings;
}

