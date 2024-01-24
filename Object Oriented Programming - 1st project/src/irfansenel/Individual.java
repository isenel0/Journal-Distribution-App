package irfansenel;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Individual extends Subscriber implements Serializable{
private String creditCardNr;
private int expireMonth,expireYear;
private int CCV;
public Individual(String name,String address,String creditCardNr, int expireMonth, int expireYear, int cCV) {
	super(name,address);
	this.creditCardNr = creditCardNr;
	this.expireMonth = expireMonth;
	this.expireYear = expireYear;
	CCV = cCV;
}
public Individual(String name,String address) {
	super(name,address);
}

@Override
public String getBillingInformation() {
	return "Individual [creditCardNr=" + creditCardNr + ", expireMonth=" + expireMonth + ", expireYear=" + expireYear
			+ ", CCV=" + CCV + ", name=" + getName() + ", address=" + getAddress() +"]"; 
}
@Override
public String toString() {
	return super.toString() +"creditCardNr=" + creditCardNr + ", expireMonth=" + expireMonth + ", expireYear=" + expireYear
			+ ", CCV=" + CCV + "]";
}




}
