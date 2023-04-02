import java.util.Scanner;
class TimeFormat
{
	int seconds;
	int minutes;
	int hours;
	int remainingSeconds;
	String formattedTime = "";
	Scanner sc = new Scanner(System.in);
	
	void timeFormat()
	{
		System.out.println("Enter the time in seconds: ");
		this.seconds = sc.nextInt();
		this.hours = this.seconds / 3600;
		this.seconds -= this.hours * 3600;
		this.minutes = this.seconds / 60;
		this.seconds -= this.minutes * 60;
		this.remainingSeconds = this.seconds;
		if(this.hours < 10)
		{
			this.formattedTime += "0" + String.valueOf(this.hours) + ":";
			
		}
		else
		{
			this.formattedTime += String.valueOf(this.hours) + ":";
		}
		
		if(this.minutes < 10)
		{
			this.formattedTime += "0" + String.valueOf(this.minutes) + ":";
		}
		else
		{
			this.formattedTime += String.valueOf(this.minutes) + ":";
		}
		
		if(this.remainingSeconds < 10)
		{
			this.formattedTime += "0" + String.valueOf(this.remainingSeconds);
			
		}
		else
		{
			this.formattedTime += String.valueOf(this.remainingSeconds);
		}
		
		System.out.println("The time is: " + this.formattedTime);
	}
	
	public static void main(String[] args)
	{
		TimeFormat tf = new TimeFormat();
		tf.timeFormat();
	}
}