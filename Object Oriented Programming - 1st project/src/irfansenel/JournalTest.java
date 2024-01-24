package irfansenel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JournalTest {

	    private Journal journal;
	    private Subscription subscription;
	    @Before
	    public void setUp() {
	    	Subscriber subscriber = new Individual("irfan", "Ataşehir", "1234567890", 12, 2025, 123);
	    	journal = new Journal("wwe","1224",0,30.0);
	        DateInfo dates = new DateInfo(8,2023);
	        PaymentInfo payment = new PaymentInfo(10); 
	        subscription = new Subscription(dates, payment, 1, journal, subscriber);
	    }
	    @Test
	    public void testGetIssuePrice() {
	        assertEquals(30.0, journal.getIssuePrice(), 0.001); 
	    }

	    @Test
	    public void testGetIssn() {
	        assertEquals("1224", journal.getIssn());
	    }

	    @Test
	    public void testAddSubscription() {
	        int initialSize = journal.subscriptions.size();
	        journal.addSubscription(subscription); 
	        assertEquals(initialSize + 1, journal.subscriptions.size()); 
	        assertTrue(journal.subscriptions.contains(subscription));
	    }

}
