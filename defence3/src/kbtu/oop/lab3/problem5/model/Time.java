package kbtu.oop.lab3.problem5.model;

public class Time implements Comparable<Time>{
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(int hours, int minutes, int seconds) {
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	
	public int getHours() { 
		return hours; 
	}
    public int getMinutes() { 
    	return minutes; 
    }
    public int getSeconds() { 
    	return seconds; 
    }

    @Override
    public int compareTo(Time other) {
    	if(this.hours!=other.hours) {
    		return Integer.compare(this.hours, other.hours);
    	}
    	if(this.minutes!=other.minutes) {
    		return Integer.compare(this.minutes, other.minutes);
    	}
    	return Integer.compare(this.seconds, other.seconds);
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
