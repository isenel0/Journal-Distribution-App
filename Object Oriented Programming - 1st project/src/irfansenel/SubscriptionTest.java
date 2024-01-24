package irfansenel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubscriptionTest {

	private Subscription subscription;
    private DateInfo dates;
    private PaymentInfo payment;
    private Journal journal;
    private Subscriber subscriber;

    @Before
    public void setUp() {
    	subscriber = new Individual("irfan", "Ataşehir", "1234567890", 12, 2025, 123);
    	journal = new Journal("wwe","1224",0,30.0);
        dates = new DateInfo(8,2023);
        payment = new PaymentInfo(0); 
        subscription = new Subscription(dates, payment, 1, journal, subscriber);
    }

    @Test
    public void testAcceptPayment() {
        subscription.acceptPayment(50);
        assertEquals(50, payment.getReceivedPayment(), 0.001); 
    }

    @Test
    public void testCanSend_True() {
        double price = journal.getIssuePrice() - (journal.getIssuePrice() * payment.getDiscountRatio());
        payment.increasePayment(price);
        assertTrue(subscription.canSend(1)); 
    }

    @Test
    public void testCanSend_False() {
        double price = journal.getIssuePrice() - (journal.getIssuePrice() * payment.getDiscountRatio());
        payment.increasePayment(20);
        assertFalse(subscription.canSend(1)); 
    }

}
