package payment.service.service;
import payment.service.event.PaymentEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    private final ApplicationEventPublisher eventPublisher;

    public PaymentService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void processPayment(String user, double amount) {
        System.out.println("Processing payment of $" + amount + " for user: " + user);
        // Simulate payment processing logic here

        // Publish payment event
        PaymentEvent event = new PaymentEvent(this, user, amount);
        eventPublisher.publishEvent(event);
    }
}
