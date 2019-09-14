package session03;

public class TacklingLongTasks {

/*
I started working on this program at 11:40.
Current time is 12:00.
There are 12 hours 0 minutes or 720 minutes or 43200 seconds left until the end of the day.
50% of the day has already passed.
You have 50% of the day remaining.
*** SOLVE FOR THIS AT HOME *I spent 0 hours and 20 minutes or 20 minutes or 1200 seconds on developing this program.***
*** SOLVE FOR THIS AT HOME *It took 1.39% of my time.***
*/
	
	public static void main(String[] args) {
		
		int startHour = 11;
		int startMinute = 40;
		
		System.out.println("I started working on this program at " + startHour + ":" + startMinute + ".");
		
		int currentHour = 12;
		int currentMinute = 0;
		String currentHH = "12";
		String currentMM = "00";
		
		System.out.println("Current time is " + currentHH + ":" + currentMM + ".");
		
		// storing total amount of seconds in a day
		int totalDailySeconds = 24 * 60 * 60;
		// calculating for total amount of seconds that passed
		// finding how many seconds passed by hours + how many seconds passed by minutes
		int secondsPassed = (currentHour * 60 * 60) + (currentMinute * 60);

		// storing how many seconds are still left in a day
		int secondsLeft = totalDailySeconds - secondsPassed;
		
		// finding out how many minutes do the remaining seconds make
		int minutesLeft = secondsLeft / 60;
		
		// finding out how many whole hours are left
		int hoursLeft = minutesLeft / 60;
		// finding out how many extra remaining minutes are left
		int extraMinutes = minutesLeft % 60;
		
		System.out.println( "There are " + hoursLeft + " hours " + extraMinutes + " minutes or " +
							minutesLeft + " minutes or " + 
							secondsLeft + " seconds left until the end of the day." );
		
		// finding percentage of passed time
		int percentagePassed = secondsLeft * 100 / totalDailySeconds ;
		
		System.out.println(percentagePassed + "% of the day has already passed.");
		
		// finding remaining percentage
		int remainingPercentage = 100 - percentagePassed;
		System.out.println("You have " + remainingPercentage + "% of the day remaining.");
		
		
		//It took 1.39% of my time.
		int timeItTook = 20 * 60;
		
		int percentageItTook = timeItTook * 100 / totalDailySeconds;
		int secondsOverflow = timeItTook * 100 % totalDailySeconds;
		int percentageOverflow = secondsOverflow * 100 / totalDailySeconds;
		
		System.out.println("It took " + percentageItTook + "." + percentageOverflow + "% of my time.");
	}
	
}



// comment can go anywhere in Java file