package brandt.jorgensen;

public interface ICoolStack<T> {
	
	// Add an item to the top of the stack
	public void push (T element);
	
	// Remove and return the top item from the stack
	public T pop();
	
	// View the top item in the stack
	public T peek();
	
	// Check to see if the stack is empty
	public boolean isEmpty();
	
	// Return the size of the stack
	public int size();
	
}
