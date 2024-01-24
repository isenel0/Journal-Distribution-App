package irfansenel;

import java.io.Serializable;

public class Corporation extends Subscriber implements Serializable {
private int bankCode;
private String bankName;
private int issueDay,issueMonth,issueYear;
private int accountNumber;
public Corporation(String name,String address,int bankCode, String bankName, int issueDay, int issueMonth, int issueYear, int accountNumber) {
	super(name,address);
	this.bankCode = bankCode;
	this.bankName = bankName;
	this.issueDay = issueDay;
	this.issueMonth = issueMonth;
	this.issueYear = issueYear;
	this.accountNumber = accountNumber;
}
@Override
public String getBillingInformation() {
	return "Corporation [bankCode=" + bankCode + ", bankName=" + bankName + ", issueDay=" + issueDay + ", issueMonth="
			+ issueMonth + ", issueYear=" + issueYear + ", accountNumber=" + accountNumber + ", name=" + getName() + ", address=" +getAddress() + "]";
}
@Override
public String toString() {
	return super.toString() + "Corporation [bankCode=" + bankCode + ", bankName=" + bankName + ", issueDay=" + issueDay + ", issueMonth="
			+ issueMonth + ", issueYear=" + issueYear + ", accountNumber=" + accountNumber + "]";
}


}
