package kbtu.oop.lab3.problem1.model;

public abstract class DataProcessor {
	public final void process() {
		load();
        analyze();
        save();
	}
	
	protected abstract void load();
    protected abstract void analyze();
    protected abstract void save();

}
