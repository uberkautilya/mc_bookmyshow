package uber.kautilya.machinecoding.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass //Keep all attributes in all subclasses, while maintaining them private
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreatedDate
    private Date creationDate;
    @LastModifiedDate
    private Date modificationDate;
}
/*
Hibernate ORM: Focus oon the implementation of certain methods with will work with the database -> Object to SQL, SQL to Object
Spring Data JPA: Like an interface contract met satisfied the Hibernate. Hibernate implements the methods specified by JPA.
 */