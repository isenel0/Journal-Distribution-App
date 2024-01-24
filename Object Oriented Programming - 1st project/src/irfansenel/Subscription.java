package irfansenel;
import java.io.Serializable;

public class Subscription implements Serializable {
private final DateInfo dates;
private PaymentInfo payment;
private int copies;
private final Journal journal;
private final Subscriber subscriber;
public Subscription(DateInfo dates, PaymentInfo payment, int copies, Journal journal, Subscriber subscriber) {
	this.dates = dates;
	this.payment = payment;
	this.copies = copies;
	this.journal = journal;
	this.subscriber = subscriber;
}
public void acceptPayment(double amount) {
	payment.increasePayment(amount);
}
public boolean canSend(int issueMonth) {
   double price = journal.getIssuePrice() - (journal.getIssuePrice() * payment.getDiscountRatio());
   if(payment.getReceivedPayment() >= price){
	   return true;
   }else {
	   return false;
   }
}
public Journal getJournal() {
	return journal;
}
public Subscriber getSubscriber() {
	return subscriber;
}
public void setCopies(int copies) {
	this.copies = copies;
}
public int getCopies() {
	return copies;
}
public DateInfo getDates() {
	return dates;
}
@Override
public String toString() {
	return "Subscription [dates=" + dates.toString() + ", payment=" + payment.toString() + ", copies=" + copies + ", journal=" + journal.toString()
			+ ", subscriber=" + subscriber.toString() + "]";
}
public PaymentInfo getPayment() {
	return payment;
}


}
