package irfansenel;

import java.io.Serializable;
import java.util.Vector;

public class Journal implements Serializable {
 private String name,issn;
 private int frequency ;
 private double issuePrice;
 public Vector<Subscription> subscriptions;
public Journal(String name, String issn, int frequency, double issuePrice) {
	this.name = name;
	this.issn = issn;
	this.frequency = frequency;
	this.issuePrice = issuePrice;
	subscriptions = new Vector<Subscription>();
}
public Journal() {
}
public double getIssuePrice() {
	return issuePrice;
}
public String getIssn() {
	return issn;
}
public void addSubscription(Subscription s){
     subscriptions.add(s);
}
@Override
public String toString() {
	return "Journal = [name=" + name + ", issn=" + issn + ", frequency=" + frequency + ", issuePrice=" + issuePrice
			+ ", subscriptions=" + subscriptions + "]";
}
public String getName() {
	return name;
}

}	
