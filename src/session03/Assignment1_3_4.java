package session03;

public class Assignment1_3_4 {

	public static void main(String[] args) {
/*
I started working on this program at 11:40.
Current time is 12:00.
There are 12 hours 0 minutes or 720 minutes or 43200 seconds left until the end of the day.
50% of the day has already passed.
You have 50% of the day remaining.
I spent 0 hours and 20 minutes or 20 minutes or 1200 seconds on developing this program.
It took 1.39% of my time.
 */
		
		int currentHour = 12;
		int currentMinute = 00;
		int totalDailySeconds = 24 * 60 * 60;
		int totalDailyMinutes = 24 * 60;
		int totalCurrentSeconds = currentHour * 60 * 60 + currentMinute * 60;
		double totalLeftSeconds = totalDailySeconds - totalCurrentSeconds;
		double totalMinutesLeft = totalLeftSeconds / 60;
		double hoursLeft = totalMinutesLeft / 60;
		double minutesLeft = totalMinutesLeft % 60;
		double percentageLeft = hoursLeft * 100 / 24;
		double percentageRemain = 100 - percentageLeft;

		int startHour = 11;
		int startMinute = 40;
		int startTotalSeconds = startHour * 60 * 60 + startMinute * 60;
		int differenceSeconds = totalCurrentSeconds - startTotalSeconds;
		double differenceMinutes = differenceSeconds / 60;
		double differenceHour = differenceMinutes / 60;
		double percentageDifference = (differenceMinutes / totalDailyMinutes) * 100;

		System.out.println("");
		System.out.println("I started working on this program at " + startHour + ":" + startMinute);
		System.out.println("Current time is " + currentHour + ":" + currentMinute);
		System.out.println("There are " + hoursLeft + " hours and " + minutesLeft + " minutes or " + totalMinutesLeft
				+ " minutes or " + totalLeftSeconds + " seconds left until the end of the day.");

		System.out.println(percentageLeft + "%" + " of the day has already passed.");
		System.out.println("You have " + percentageRemain + "% of the day remaining.");
		System.out.println("I spent " + differenceHour + " hours and " + differenceMinutes + " minutes or "
				+ differenceSeconds + " seconds on developing this program.");
		System.out.println("It took " + percentageDifference + "% of my time.");
	}
}
