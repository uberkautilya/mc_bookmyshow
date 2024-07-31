package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private String referenceNumber;
    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;
    private PaymentStatus status;
    private PaymentMode mode;
    private PaymentGateway gateway;
    @ManyToOne
    private Booking booking;
}
