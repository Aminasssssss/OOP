package practice5.io.app;

import java.io.*;
import java.util.Random;



public class TemperatureAnalyzer {
    private static final String BIN_FILE = "sensor.bin";
    private static final int COUNT = 60;
    private static final int TARGET_INDEX = 29;
    private static final double SPIKE_VALUE = 999.9;

    public static void main(String[] args) {
    	try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(BIN_FILE))) {
            Random random = new Random();
            for (int i = 0; i < COUNT; i++) {
                double temp = 15.0 + random.nextDouble() * 20.0;
                dos.writeDouble(temp);
            }
        } 
    	catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
    	
    	
        try(RandomAccessFile raf= new RandomAccessFile(BIN_FILE, "rw")){
        	raf.seek((long) TARGET_INDEX*8);
        	raf.writeDouble(SPIKE_VALUE);
        	
        }
        catch(IOException e) {
        	System.out.println("Error: "+  e.getMessage());
        	return;
        	
        }
        
        double sum= 0;
        double max= Double.MIN_VALUE;
        int count= 0;
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(BIN_FILE))) {
            for (int i = 0; i < COUNT; i++) {
                double temp = dis.readDouble();
                sum += temp;
                
                if (temp > max) {
                	max = temp;
                	
                }
                
            }
        }
        catch(IOException e) {
        	System.out.println("Error: " + e.getMessage());
        	return;
        }
        System.out.println("Average: " + (sum/count) + "°C");
        System.out.println("Max: " + max + "°C");
        		
    }
}
