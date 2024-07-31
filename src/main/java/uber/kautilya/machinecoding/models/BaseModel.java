package uber.kautilya.machinecoding.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass //Keep all attributes in all subclasses, while maintaining them private
public class BaseModel {
    @Id
    private int id;
    private Date creationDate;
    private Date modificationDate;
}
/*
Hibernate ORM: Focus oon the implementation of certain methods with will work with the database -> Object to SQL, SQL to Object
Spring Data JPA: Like an interface contract met satisfied the Hibernate. Hibernate implements the methods specified by JPA.
 */