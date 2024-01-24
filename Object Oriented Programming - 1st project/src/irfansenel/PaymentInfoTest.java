package irfansenel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaymentInfoTest {

	private PaymentInfo paymentInfo;

    @Before
    public void setUp() {
        paymentInfo = new PaymentInfo(100);  
    }

    @Test
    public void testGetReceivedPayment() {
        assertEquals(100, paymentInfo.getReceivedPayment(), 0.001);
    }

    @Test
    public void testGetDiscountRatio() {
        assertEquals(5, paymentInfo.getDiscountRatio(), 0.001); 
    }

    @Test
    public void testIncreasePayment() {
        paymentInfo.increasePayment(50);
        assertEquals(150, paymentInfo.getReceivedPayment(), 0.001); 
    }

}
