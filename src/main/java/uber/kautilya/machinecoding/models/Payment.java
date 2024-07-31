package uber.kautilya.machinecoding.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;
    private String referenceNumber;
    private Date paymentDate;
    private PaymentStatus status;
    private PaymentMode mode;
    private PaymentGateway gateway;
    private Booking booking;
}
