import java.util.UUID;

/**
 * CreditOffer.
 * Entity for table ha_credit_offers
 *
 * @author Mihail_Sevryugin
 */
public class CreditOffer {
    private UUID creditOfferId;
    private Client clientId;
    private Credit creditId;
    private Double creditAmount;// сумма кредита
    private PaymentSchedule paymentScheduleId;
}
