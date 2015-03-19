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

		int patternsIndex = pattern.length()-1;
		if(pattern.charAt(patternsIndex) != input.charAt(next + patternsIndex)){
			if(pattern.lastIndexOf(input.charAt(next + patternsIndex))!=-1){
			next = patternsIndex-pattern.lastIndexOf(input.charAt(next + patternsIndex));		
			stopSymbol=patternsIndex;
			} else {
				next = next + pattern.length();
				stopSymbol=0;
			}
		}
		
		
	}

}
