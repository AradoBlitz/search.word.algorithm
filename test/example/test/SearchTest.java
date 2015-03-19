package example.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	@Test
	public void testName() throws Exception {
		
		Searcher searcher = new Searcher("* * * * * * к * * * * * *"
											,"к о л о к о л");
		searcher.next();
		assertEquals(4, searcher.next);
		assertEquals(12, searcher.stopSymbol);
		
		searcher.next();
		assertEquals(17, searcher.next);
		assertEquals(0, searcher.stopSymbol);
		
	}
	
	@Test
	public void noStopSymbolFound() throws Exception {
		Searcher searcher = new Searcher("* * * * * а л * * * * * * * *"
										,"к о л о к о л");
		searcher.next();
		assertEquals(11, searcher.patternsIndex);
		assertEquals(0, searcher.next);
		assertEquals(0, searcher.stopSymbol);
		
		searcher.next();
		assertEquals(10, searcher.patternsIndex);
		assertEquals(0, searcher.next);
		assertEquals(0, searcher.stopSymbol);
		
		searcher.next();
		assertEquals(12, searcher.patternsIndex);
		assertEquals(13, searcher.next);
		assertEquals(0, searcher.stopSymbol);
	}
	
	@Test
	public void findSequance() throws Exception {
		
		Searcher searcher = new Searcher("qwe", "qwe");
		searcher.next();
		assertEquals(1, searcher.patternsIndex);
		searcher.next();
		assertEquals(0, searcher.patternsIndex);
		searcher.next();
		assertEquals(2, searcher.patternsIndex);
		assertEquals(0, searcher.begin);
		
	}
}
