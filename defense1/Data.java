package kbtu.oop.lab1.problem1;

public class Data {
	private double max;
	private double sum;
	private int count;
	
	
	public Data() {
		sum=0;
		max=0;
		count=0;
		
		
	}
	public void addValue(double value) {
		sum=sum+value;
		count= count+1;
		
		if(count==1) {
			max= value;
		}
		else if(value>max) {
			max=value;
		}
	}
	
	public double getAverage() {
		if(count==0) {
			return 0;
		}
		return sum/count;
		
	}
	public double getMax() {
		if(count==0) {
			return 0;
		}
		return max;
	}
	public String toString() {
		return "Data{count=" + count + ", sum=" + sum + ", max=" + max + "}";
	}
}
