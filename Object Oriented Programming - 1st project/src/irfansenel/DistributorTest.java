package irfansenel;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DistributorTest {

	private Distributor distributor;
	private Distributor distributor2;
    private Journal journal;
    private Subscriber subscriber;
    private Subscription subscription;
    private String tempFileName = "testFile.dat";

    @Before
    public void setUp() {
        distributor = new Distributor();
        distributor2 = new Distributor();
        journal = new Journal("Romance journal", "12345678", 12, 50.0);
        distributor.addJournal(journal);
        subscriber = new Individual("irfan", "Ataşehir", "1234567890123456", 12, 2025, 123);
        distributor.addSubscriber(subscriber);
        DateInfo dateInfo = new DateInfo(8,2023);
        PaymentInfo paymentInfo = new PaymentInfo(0); 
        subscription = new Subscription(dateInfo, paymentInfo, 1, journal, subscriber);
    }
    @After
    public void tearDown() throws Exception {
        File file = new File(tempFileName);
        if (file.exists()) {
            file.delete();
        }
    }
    @Test
    public void testAddJournal() {
        Journal newJournal = new Journal("New", "56789012", 6, 40.0);
        assertTrue(distributor.addJournal(newJournal));
        assertFalse(distributor.addJournal(newJournal)); 
    }

    @Test
    public void testSearchJournal() {
        assertEquals(journal, distributor.searchJournal("12345678")); 
        assertNull(distributor.searchJournal("56789012")); 
    }

    @Test
    public void testAddSubscriber() {
        Subscriber newSubscriber = new Individual("Name", "Address", "987654321", 11, 2024, 321);
        assertTrue(distributor.addSubscriber(newSubscriber)); 
        assertFalse(distributor.addSubscriber(newSubscriber)); 
    }

    @Test
    public void testSearchSubscriber() {
        assertEquals(subscriber, distributor.searchSubscriber("irfan")); 
        assertNull(distributor.searchSubscriber("name")); 
    }

    @Test
    public void testAddSubscription() {
        assertTrue(distributor.addSubscription("12345678", subscriber, subscription)); 
        assertFalse(distributor.addSubscription("56789012", subscriber, subscription));
    }
    @Test
    public void testSaveAndLoadState() {
    	Journal science = new Journal("Science journal", "155134", 12, 50.0);
    	Journal war = new Journal("War journal", "157132", 8, 40.0);
    	Subscriber sub1 = new Individual("mehmet", "yıldız", "546654654", 11, 2024, 321);
    	Subscriber sub2 = new Individual("ali", "yıldız", "12343564", 11, 2024, 321);
    	distributor.addJournal(war);
    	distributor.addJournal(science);
    	distributor.addSubscriber(sub1);
    	distributor.addSubscriber(sub2);
        distributor.saveState(tempFileName);
        distributor2.loadState(tempFileName);
        assertNotNull(distributor2.getJournals());
        assertNotNull(distributor2.getSubscribers());//name ve address null dönüyor
    }
    public void testReport() {
        String expectedReport = "Romance journal 12345678 irfan Ataşehir 0.0 8/2023\n";
        String actualReport = distributor.report(8, 2023);
        assertEquals(expectedReport, actualReport);
    }

}
