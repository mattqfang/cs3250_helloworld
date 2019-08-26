package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HiMattTest {
	@Test
	public void testSay() {
		HelloMatt hi = new HelloMatt();
		String greeting = hi.say();
		assertEquals("Hi Matt", greeting);
	}
	
}
