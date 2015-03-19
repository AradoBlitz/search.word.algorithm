package example.test;

public class Searcher {

	public int next;
	private String input;
	public int stopSymbol;
	private String pattern;

	public Searcher(String input, String pattern) {
		this.input = input;
		this.pattern = pattern;		
	}

	public void find() {

		if(pattern.charAt(12) != input.charAt(12))
			next = 6;
		
		stopSymbol=13;
		
	}

}
