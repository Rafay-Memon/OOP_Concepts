public class Clock {
    private int hour;
    private int minutes;
    private int seconds;
    private boolean isAM;
    
    public Clock() {
        this.hour = 12;
        this.minutes = 0;
        this.seconds = 0;
        this.isAM = true;
    }
    
    public Clock(int hour, boolean isAM) {
        this.hour = hour;
        this.minutes = 0;
        this.seconds = 0;
        this.isAM = isAM;
    }
    
    public Clock(int hour, int minutes, int seconds, boolean isAM) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isAM = isAM;
    }
    
    public void setTime(int hour, int minutes, int seconds, boolean isAM) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
        this.isAM = isAM;
    }
    
    public int getHours() {
        return this.hour;
    }
    
    public int getMinutes() {
        return this.minutes;
    }
    
    public int getSeconds() {
        return this.seconds;
    }
    
    public boolean getIsAM() {
        return this.isAM;
    }
	
	public static void main(String[] args)
	{
		Clock c1 = new Clock();
		Clock c2 = new Clock(05,true);
		Clock c3 = new Clock(13,50,20,false);
		
	}
}