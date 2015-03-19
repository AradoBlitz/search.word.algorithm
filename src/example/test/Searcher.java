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

		if(pattern.charAt(12) != input.charAt(next + 12)){
			if(pattern.lastIndexOf(input.charAt(next + 12))!=-1){
			next = 12-pattern.lastIndexOf(input.charAt(next + 12));		
			stopSymbol=12;
			} else {
				next = next + pattern.length();
				stopSymbol=0;
			}
		}
		
		
	}

}
