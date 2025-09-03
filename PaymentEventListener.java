package payment.service.event;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentEventListener {

    @EventListener
    public void handlePaymentEvent(PaymentEvent event) {
        System.out.println("Payment event received for user: " + event.getUser() +
                ", amount: $" + event.getAmount());
        
    }
}