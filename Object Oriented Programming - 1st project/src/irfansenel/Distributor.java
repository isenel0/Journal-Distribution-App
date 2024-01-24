package irfansenel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class Distributor implements Serializable{
private Hashtable<String,Journal> journals = new Hashtable<String,Journal>();
private Vector<Subscriber> subscribers = new Vector<Subscriber>();
public Distributor() {
	
} 
public boolean addJournal(Journal j) {
	String issn = j.getIssn();
	if(journals.containsKey(issn)) {
		return false;
	}
	journals.put(issn, j);
	return true;
}
public Journal searchJournal(String issn) {
	return journals.get(issn);
}
public boolean addSubscriber(Subscriber s) {
	if(subscribers.contains(s)) {
		return false;
	}else {
		subscribers.add(s);
		return true;
	}
}
public Subscriber searchSubscriber(String name) {
	for(Subscriber s : subscribers) {
		if(s.getName().equals(name)) {
			return s;
		}
	}
	return null;
}
public boolean addSubscription(String issn,Subscriber subscriber,Subscription sp){
	int flag=0;
	int flag2 = 0;
    Journal j = searchJournal(issn);
    Subscriber s = searchSubscriber(subscriber.getName());
    if(j != sp.getJournal() || s != sp.getSubscriber()) {
    	return false;
    }
    for(Journal journal : journals.values()) {
    	if(journal.equals(j) && subscribers.contains(s)) {
    		flag2 = 1;
    	     if(journal.subscriptions.contains(sp)) {
    	    	 flag = 1;
    	     }
    	}
    }
	if(flag == 1) {
		sp.setCopies(sp.getCopies() + 1);
		return true;
	}else if (flag == 0 && flag2 == 1){
		j.addSubscription(sp);
		return true;
	}else {
		return false;
	}
}
public String listAllSendingOrders(int month,int year) {
	int startYear,startMonth;
	int dateCheck = 0;
	String message = "";
	for(Journal j : journals.values()) {
		for(Subscription sub : j.subscriptions) {
			startYear = sub.getDates().getStartYear();
			startMonth = sub.getDates().getStartMonth();
		    if(startMonth <= month && year == startYear) {
		    	dateCheck = 1;
		    }else if(startMonth >= month && year == startYear + 1) {
		    	dateCheck = 1;
		    }else {
		    	dateCheck = 0;
		    }
		    if(sub.canSend(month) && dateCheck == 1) {
		    	message += "Journal:" + j.getName() + " to Subscriber: " + sub.getSubscriber().getName();
		    	message += "\n";
		    }
	}
}
	return message;
}
public String listSendingOrders(String issn,int month,int year) {
	int startMonth,startYear;
	int dateCheck = 0;
	String message = "";
	Journal j = searchJournal(issn);
	for(Subscription sub : j.subscriptions) {
		startYear = sub.getDates().getStartYear();
		startMonth = sub.getDates().getStartMonth();
	    if(startMonth <= month && year == startYear) {
	    	dateCheck = 1;
	    }else if(startMonth >= month && year == startYear + 1) {
	    	dateCheck = 1;
	    }else {
	    	dateCheck = 0;
	    }
	    if(sub.canSend(month) && dateCheck == 1) {
	    	message += "Journal:" + j.getName() + " to Subscriber: " + sub.getSubscriber().getName();
	    	message += "\n";
	    }
}
	return message;
}
public String listIncompletePayments(int month,int year) {
	int startYear,startMonth;
	int dateCheck = 0;
	String message = "";
	for(Journal j : journals.values()) {
		for(Subscription sub : j.subscriptions) {
			startYear = sub.getDates().getStartYear();
			startMonth = sub.getDates().getStartMonth();
		    if(startMonth <= month && year == startYear) {
		    	dateCheck = 1;
		    }else if(startMonth >= month && year == startYear + 1) {
		    	dateCheck = 1;
		    }else {
		    	dateCheck = 0;
		    }
		    if(!sub.canSend(month) && dateCheck == 1) {
		    	message += "Journal:" + j.getName() + " to Subscriber: " + sub.getSubscriber().getName();
		    	message += "\n";
		    }
	}
}
	return message;
	
}
public String listSubs(String subscriberName) {
	String message = "";
	Subscriber s = searchSubscriber(subscriberName);
	for(Journal j : journals.values()) {
		for(Subscription sub : j.subscriptions) {
			if(s.equals(sub.getSubscriber())) {
				message += "Journal: " + j.getName() + " to subscriber: " + sub.getSubscriber().getName() + ". Starting date: " + sub.getDates().getStartMonth() + "/" + sub.getDates().getStartYear();
				message += "\n";
			}
		}
	}
	return message;
}
public String listSubscriptions(String issn) {
    Journal j = searchJournal(issn);
    String message ="";
    for(Subscription sub : j.subscriptions) {
    	message += "Journal: " + j.getName() + " to subscriber: " + sub.getSubscriber().getName() + ". Starting date: " + sub.getDates().getStartMonth() + "/" + sub.getDates().getStartYear();
    	message += "\n";
    }
	return message;
}
public void saveState(String filename) {
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
        oos.writeObject(journals);
        oos.writeObject(subscribers);
    } catch (Exception e) {
        System.err.println("Dosya kaydedilirken bir hata oluştu: " + e.getMessage());
    }
}
@SuppressWarnings("unchecked")
public void loadState(String filename) {
	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
        journals = (Hashtable<String, Journal>) ois.readObject();
        subscribers = (Vector<Subscriber>) ois.readObject();
    } catch (Exception e) {
        System.err.println("Dosya yüklenirken bir hata oluştu: " + e.getMessage());
    }
}

public Hashtable<String, Journal> getJournals() {
	return journals;
}
public Vector<Subscriber> getSubscribers() {
	return subscribers;
}
public String report(int month,int year) {
	int startYear,startMonth;
	int dateCheck = 0;
	String message = "";
	for(Journal j : journals.values()) {
		for(Subscription sub : j.subscriptions) {
			startYear = sub.getDates().getStartYear();
			startMonth = sub.getDates().getStartMonth();
		    if(startMonth <= month && year == startYear) {
		    	dateCheck = 1;
		    }else if(startMonth >= month && year == startYear + 1) {
		    	dateCheck = 1;
		    }else {
		    	dateCheck = 0;
		    }
		    if(sub.canSend(month) && dateCheck == 1) {
		    	message +=j.getName()+ " " + j.getIssn() +" "+sub.getSubscriber().getName()+ " " +sub.getSubscriber().getAddress() +" "+sub.getPayment().toString()+" " +sub.getDates().getStartMonth() +"/"+sub.getDates().getStartYear();
		    	message += "\n";
		    }
	}
}
	return message;	
}
}
