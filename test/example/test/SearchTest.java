package example.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	@Test
	public void testName() throws Exception {
		
		Searcher searcher = new Searcher("* * * * * * к * * * * * *"
											,"к о л о к о л");
		searcher.find();
		assertEquals(4, searcher.next);
		assertEquals(12, searcher.stopSymbol);
		
		searcher.find();
		assertEquals(17, searcher.next);
		assertEquals(0, searcher.stopSymbol);
		
	}
}
