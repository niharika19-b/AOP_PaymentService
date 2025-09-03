package payment.service.event;
import org.springframework.context.ApplicationEvent;

public class PaymentEvent extends ApplicationEvent {

    private final String user;
    private final double amount;

    public PaymentEvent(Object source, String user, double amount) {
        super(source);
        this.user = user;
        this.amount = amount;
    }

    public String getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }
}
