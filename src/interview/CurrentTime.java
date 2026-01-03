package interview;

import java.time.LocalTime;

public class CurrentTime {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		int hour = localTime.getHour();
		int minutes = localTime.getMinute();
		int seconds = localTime.getSecond();
		System.out.println(localTime+"\n"+hour+"\n"+minutes+"\n"+seconds);

	}

}
