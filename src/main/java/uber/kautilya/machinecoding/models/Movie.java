package uber.kautilya.machinecoding.models;

import java.util.List;

public class Movie extends BaseModel {
    private String title;
    private String director;
    private String year;

    private String genre;
    private List<String> actors;
    private List<Language> languages;
}
