package uber.kautilya.machinecoding.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String title;
    private String director;
    private String year;

    private String genre;
    @ElementCollection
    private List<String> actors;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Language> languages;
}
