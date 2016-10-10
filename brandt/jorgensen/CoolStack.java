package brandt.jorgensen;

public class CoolStack<T> implements ICoolStack<T> {
	
	// Private variables
	private T[] stack, larger;
	private int count;
	private final int DEFAULT_SIZE = 1; // start with the minimum length of the stack
	
	/*
	 * CONSTRUCTOR
	 */
	public CoolStack(){
		stack = (T[])(new Object[DEFAULT_SIZE]);
		count = 0;
	}
	
	/*
	 * EXPAND STACK METHOD, PRIVATE
	 */
	private void expandStack() {
		// create a placeholder array for GROWTH STRATEGY
		larger = (T[])(new Object[stack.length * 2]); // double the size
		
		// move content over from old stack to new stack
		for ( int i = 0; i < stack.length; i++ ){
			larger[i] = stack[i];
		}
		
		// point old stack to the new stack
		stack = larger;
		
		// Record the time
		System.out.println("Array Growth Timestamp: " + System.currentTimeMillis() );
	}
	
	/*
	 * CUSTOM TO STRING METHOD, PUBLIC
	 */
	public String toString() {
		String result = "<top of stack>\n";
		
		// Iterate over each stack item, output line-by-line
		for ( int i = count - 1; i >= 0; i-- ) {
			result += stack[i] + "\n";
		}
		
		return result + "<bottom of stack>";
	}
	
	
	// ----------------------------------------------------------------- //
	//                    INTERFACE PUBLIC METHODS						 //
	// ----------------------------------------------------------------- //
	
	
	/*
	 * PUSH METHOD
	 * @see brandt.jorgensen.ICoolStack#push(java.lang.Object)
	 */
	public void push (T element) {
		if ( count == stack.length ) {
			// stack full, double the size
			expandStack();
		} 
		
		// Add an item to the top of the stack
		stack[count] = element;
		
		// increase count
		count++;
	}
	
	/*
	 * POP METHOD
	 * @see brandt.jorgensen.ICoolStack#pop()
	 */
	public T pop(){
		// Remove and return the top item from the stack
		T viewTopElement = null; // placeholder for top element
		
		// TODO: replace with isEmpty() check and an Exception
		if ( (count - 1) >= 0 ){
			// grab the top element
			viewTopElement = stack[count - 1];
			
			// remove the top element
			stack[count - 1] = null; 
			
			// decrement count due to stack size change
			count--; 
		 }
  
		 return viewTopElement;
	}
	
	
	/*
	 * PEEK METHOD
	 * @see brandt.jorgensen.ICoolStack#peek()
	 */
	public T peek(){
		// View the top item in the stack
		T viewTopElement = null;  // placeholder for top element
		   
		   // TODO: replace with isEmpty() check and an Exception
		   if ( (count - 1) >= 0 ){
			   // grab the top element
			   viewTopElement = stack[count - 1];
		   }
		   
		   return viewTopElement;
	}
	
	/*
	 * IS EMPTY METHOD
	 * @see brandt.jorgensen.ICoolStack#isEmpty()
	 */
	public boolean isEmpty(){
		// Check to see if the stack is empty
		return ( count == 0 ) ? true : false;
	}
	
	/*
	 * SIZE METHOD
	 * @see brandt.jorgensen.ICoolStack#size()
	 */
	public int size(){
		// Return the size of the stack
		return stack.length; // this should be an Integer type
	}

}
