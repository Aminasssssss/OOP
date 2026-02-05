package training2;

public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            System.out.println("Error, hour must be between 0-23");
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        
        if (minute < 0 || minute > 59) {
            System.out.println("Error, minute must be between 0-59");
            this.minute = 0;
        } else {
            this.minute = minute;
        }
        
        if (second < 0 || second > 59) {
            System.out.println("Error, it must be between 0-59");
            this.second = 0;
        } else {
            this.second = second;
        }
    }
    
    public String toUniversal() {
        String h = String.format("%02d", hour);
        String m = String.format("%02d", minute);
        String s = String.format("%02d", second);
        return h + ":" + m + ":" + s;
    }
    
    public String toStandard() {
        String ampm = "AM";
        int displayHour = hour;
        
        if (hour == 0) {
            displayHour = 12;
        } else if (hour == 12) {
            ampm = "PM";
        } else if (hour > 12) {
            displayHour = hour - 12;
            ampm = "PM";
        }
        
        String h = String.format("%02d", displayHour);
        String m = String.format("%02d", minute);
        String s = String.format("%02d", second);
        
        return h + ":" + m + ":" + s + " " + ampm;
    }
    
    public void add(Time other) {
        this.second = this.second + other.second;
        if (this.second >= 60) {
            this.second = this.second - 60;
            this.minute = this.minute + 1;
        }
        
        this.minute = this.minute + other.minute;
        if (this.minute >= 60) {
            this.minute = this.minute - 60;
            this.hour = this.hour + 1;
        }
        
        this.hour = this.hour + other.hour;
        if (this.hour >= 24) {
            this.hour = this.hour - 24;
        }
    }
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
}