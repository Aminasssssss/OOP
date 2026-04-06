package practice5.io.app;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
       
    	Map<String, Integer> wordCount= new HashMap<>();
    	
    	
    	try(BufferedReader reader= new BufferedReader(new FileReader("input.txt"))){
    		String line;
    		
    		while((line= reader.readLine())!=null) {
    			String cleanLine= line.toLowerCase().replaceAll("[^a-z\\s]", "");
    			String[] words= cleanLine.split("\\s+");
    			
    			for(String word: words) {
    				wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
    				
    			}
    		}
    	}
    	catch(IOException e) {
    		System.out.println("Error: "+ e.getMessage());
    		return;
    	}
    	
    	List<Map.Entry<String, Integer>> sortedEntities= new ArrayList<>(wordCount.entrySet());
    	sortedEntities.sort((e1,e2)->e2.getValue().compareTo(e1.getValue()));
    	
    	
    	try(PrintWriter writer= new PrintWriter(new FileWriter("report.txt"))){
    		 writer.printf("%-25s %s%n", "WORD", "FREQUENCY");
    		 
    		 for (Map.Entry<String, Integer> entry : sortedEntities) {
                 writer.printf("%-25s %d%n", entry.getKey(), entry.getValue());
             }
    		 
    		 writer.println("Total unique words: " + wordCount.size());
    		 
    		 
    		
    	}
    	catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
    	}
    }
}