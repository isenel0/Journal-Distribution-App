package irfansenel;

import java.io.Serializable;

public class PaymentInfo implements Serializable{
private final double discountRatio = 0.2;
private double receivedPayment;
public PaymentInfo(double receivedPayment) {
	this.receivedPayment = receivedPayment;
}
public void increasePayment(double amount) {
	receivedPayment += amount;
}
public double getReceivedPayment() {
	return receivedPayment;
}
public double getDiscountRatio() {
	return discountRatio;
}
@Override
public String toString() {
	String value = String.valueOf(receivedPayment);
	return  value;
}
public void setReceivedPayment(double receivedPayment) {
	this.receivedPayment = receivedPayment;
}

}
