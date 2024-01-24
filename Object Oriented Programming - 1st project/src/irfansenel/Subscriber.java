package irfansenel;

import java.io.Serializable;

public abstract class Subscriber implements Serializable{
protected String name,address;

public Subscriber(String name, String address) {
	this.name = name;
	this.address = address;
}
public Subscriber() {
	
}
public abstract String getBillingInformation();

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Subscriber [name=" + name + ", address=" + address + "]";
}
}
