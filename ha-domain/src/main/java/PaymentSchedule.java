import java.time.LocalDate;
import java.util.UUID;

/**
 * PaymentSchedule.
 * Entity for table ha_payments_schedule
 *
 * @author Mihail_Sevryugin
 */

public class PaymentSchedule {
    private UUID paymentScheduleId;
    private LocalDate paymentDate;// дата платежа
    private Double PaymentAmount;// сумма платежа
    private Double repaymentLoanAmount;// сумма гашения тела кредита
    private Double interestRepaymentAmount;// сумма гашения процентов
}
