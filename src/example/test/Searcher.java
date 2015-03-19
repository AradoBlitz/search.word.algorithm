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
			if(pattern.indexOf(input.charAt(next + 12))!=-1){
			next = 6;		
			stopSymbol=12;
			} else {
				next = 18;
				stopSymbol=17;
			}
		}
		
		
	}

}
