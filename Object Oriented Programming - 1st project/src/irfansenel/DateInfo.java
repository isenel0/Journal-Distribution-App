package irfansenel;

import java.io.Serializable;

public class DateInfo implements Serializable{
private int startMonth;
private int endMonth;
private int startYear;
public DateInfo(int startMonth, int startYear) {
	this.startMonth = startMonth;
	this.endMonth = startMonth;
	this.startYear = startYear;
}
public int getStartYear() {
	return startYear;
}
public int getStartMonth() {
	return startMonth;
}
@Override
public String toString() {
	return "DateInfo [startMonth=" + startMonth + ", endMonth=" + endMonth + ", startYear=" + startYear + "]";
}

}
