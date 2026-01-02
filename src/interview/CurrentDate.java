package interview;

import java.time.LocalDate;
import java.time.Month;

public class CurrentDate {
	//This line added through Eclipse

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		int currentDate = localDate.getDayOfMonth();
		int currentMonth = localDate.getMonthValue();
		Month month = localDate.getMonth();
		int currentYear = localDate.getYear();
		LocalDate tommorowDate = localDate.plusDays(1);
		int nextDay = tommorowDate.getDayOfMonth();
		System.out.println("Current Date is: "+currentDate);
		System.out.println("Current Month is: "+currentMonth);
		System.out.println("Current Year is: "+currentYear);
		System.out.println("Current  is: "+localDate);
		System.out.println("Tomorrow Date is : "+tommorowDate);
		System.out.println("NextDay is:"+nextDay);
		System.out.println("Month is: "+month);

	}

}
