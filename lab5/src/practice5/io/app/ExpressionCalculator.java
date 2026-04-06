package practice5.io.app;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExpressionCalculator {
    public static void main(String[] args) {
    	try(BufferedReader reader = new BufferedReader( new FileReader("expressions.txt"));
    			PrintWriter results= new PrintWriter(new FileWriter("results.txt"));
    			PrintWriter log= new PrintWriter(new FileWriter("log.txt"))){
    		
    		String line;
    		
    		while((line= reader.readLine())!=null) {
    			line= line.trim();
    			
    			
    			if(line.isEmpty()) {
    				continue;
    			}
    			
    			try {
    				double result = evaluate(line);
    				
    				results.println(line+ " = "+ result);
    				System.out.println(line+ " = "+ result);
    			}
    			
    			catch(NoSuchElementException | NumberFormatException | UnsupportedOperationException e) {
    				log.println(line + " -> "+ e.getMessage());
    			}
    		}
    	}
    	
    	catch(IOException e) {
            System.out.println("Error: " + e.getMessage());

    	}
    	
    }
    
    private static double evaluate(String expression) {
    	StringTokenizer tokenizer= new StringTokenizer(expression, "+-*/", true);
    	
    	
    	if(!tokenizer.hasMoreTokens()) {
    		throw new NoSuchElementException("Missing operand");
    	}
    	String left= tokenizer.nextToken().trim();
    	
    	
    	
    	if(!tokenizer.hasMoreTokens()) {
    		throw new NoSuchElementException("Missing operator");
    	}
    	String operator= tokenizer.nextToken().trim();
    	
    	
    	
    	if(!tokenizer.hasMoreTokens()) {
    		throw new NoSuchElementException("Missing operand");
    	}
    	String right= tokenizer.nextToken().trim();
    	
    	
    	
    	
    	if(left.isEmpty()) {
    		throw new NoSuchElementException("Missing operand");
    	}
    	if(right.isEmpty()) {
    		throw new NoSuchElementException("Missing operand");
    	}
    	
    	
    	double a= Double.parseDouble(left);
    	double b= Double.parseDouble(right);
    	
    	
    	switch(operator) {
    	
    	case "+":
    		return a+b;
    	case "-":
    		return a-b;
    	case "*":
    		return a*b;
    	case "/":
    		return a/b;
    	default:
    		throw new UnsupportedOperationException("Unknown operator: " + operator);
    		
    	}
    
    }
}
}