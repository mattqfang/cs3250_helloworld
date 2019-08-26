package uvu.cs.cs3250;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void testSay() {
		HelloWorld hi = new HelloWorld();
		String greeting = hi.say();
		assertEquals("Hi Matt", greeting);
	}
	
}
