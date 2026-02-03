package training2;

public class StarTriangle {
	
	private int width;
	
	
	
	public StarTriangle(int width) {
		this.width=width;
		
	}
	
	public String toString() {
		String output="";
		
		
		for(int i=1; i<=width; i++) {
			for(int j=0; j<i; j++) {
				output+= "[*]";
			}
			output+="\n";
		}
		return output;
		
	}
	

}
