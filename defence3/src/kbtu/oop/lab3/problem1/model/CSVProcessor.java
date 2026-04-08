package kbtu.oop.lab3.problem1.model;

public class CSVProcessor extends DataProcessor{
	@Override
    protected void load() {
        System.out.println("Loading CSV file");
    }
    
    @Override
    protected void analyze() {
        System.out.println("Analyzing CSV data");
    }
    
    @Override
    protected void save() {
        System.out.println("Saving analysis results");
    }

}
