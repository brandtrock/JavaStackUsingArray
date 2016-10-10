package brandt.jorgensen;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoolStackTests {
	
	/*
	 * TEST PUSH METHOD
	 */
	@Test
	public void testPush(){
		CoolStack<String> testStack = new CoolStack<String>();
		testStack.push("First Item");
		assertEquals( "First Item", testStack.peek() ); // Uses peek() to check first-item
	}
	
	/*
	 * TEST POP METHOD
	 */
	@Test
	public void testPop(){
		CoolStack<String> testStack = new CoolStack<String>();
		testStack.push("First Item");
		testStack.push("Second Item");
		assertEquals( "Second Item", testStack.pop() ); // Should return the top element it removed
	}

	/*
	 * TEST PEEK METHOD
	 */
	@Test
	public void testPeek(){
		CoolStack<String> testStack = new CoolStack<String>();
		testStack.push("First Item");
		testStack.push("Second Item");
		testStack.push("Third Item");
		assertEquals( "Third Item", testStack.peek() ); // Should return just the top element
	}
	
	/*
	 * TEST IS EMPTY METHOD
	 */
	@Test
	public void testIsEmpty(){
		CoolStack<String> testStack = new CoolStack<String>();
		assertEquals( true, testStack.isEmpty() ); // Should return true
	}
	
	/*
	 * TEST SIZE METHOD
	 */
	@Test
	public void testSize(){
		CoolStack<String> testStack = new CoolStack<String>();
		assertEquals( 1, testStack.size() ); // Without any elements, the default size is 1
	}
}
