package example.test;

public class Searcher {

	public int next;
	private String string;
	public int stopSymbol;
	private String string2;

	public Searcher(String string, String string2) {
		this.string = string; 
		// TODO Auto-generated constructor stub
		this.string2 = string2;
		
	}

	public void find() {
		// TODO Auto-generated method stub
		int countDown = next + string2.length();
		if(string2.charAt(7) != string.charAt(countDown)){
			stopSymbol = countDown;
			int lastIndexOf = string2.lastIndexOf(string.charAt(countDown));
			if(lastIndexOf != -1){
				next = stopSymbol-lastIndexOf;
			}
		}
		
	}

}
