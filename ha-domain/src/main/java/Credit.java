import java.util.UUID;

/**
 * Credit.
 * Entity for table ha_credits
 *
 * @author Mihail_Sevryugin
 */
public class Credit {
    private UUID creditId;
    private Double limit;// лимит по кредиту
    private String interestRate;// процентная ставка
}
