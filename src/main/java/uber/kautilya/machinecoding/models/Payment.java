package uber.kautilya.machinecoding.models;

import jakarta.persistence.*;
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
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus status;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode mode;
    @Enumerated(EnumType.ORDINAL)
    private PaymentGateway gateway;
    @ManyToOne
    private Booking booking;
}
