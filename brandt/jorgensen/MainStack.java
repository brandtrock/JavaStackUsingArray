package brandt.jorgensen;

public class MainStack {

	public static void main(String[] args) {
		
		CoolStack<Integer> awesomeStack = new CoolStack<Integer>();
		
		System.out.println("----------------------------------------");
		
		/*
		 * Main Method Question "a,b"
		 */
		// Loop to populate the stack with numbers 1 through 20
		for ( int i = 1; i < 21; i++ ) {
			awesomeStack.push(i);
		}
		
		System.out.println("----------------------------------------");
		
		/*
		 * Main Method Question "c,d"
		 */
		awesomeStack.pop(); // 1
		awesomeStack.pop(); // 2
		awesomeStack.pop(); // 3
		awesomeStack.pop(); // 4
		awesomeStack.pop(); // 5
		System.out.println( "Peek: " + awesomeStack.peek() ); // value?

		System.out.println("----------------------------------------");
		
		/*
		 * Main Method Question "e"
		 */
		awesomeStack.pop();
		System.out.println( "Pop: " + awesomeStack.pop() ); // value?
		

		System.out.println("----------------------------------------");
		
		/*
		 * Main Method Question "f,g"
		 */
		awesomeStack.push(18);
		awesomeStack.push(21);
		awesomeStack.push(23);
		awesomeStack.pop();
		awesomeStack.pop();
		System.out.println( "Peek: " + awesomeStack.peek() );
		
		
		
		System.out.println("----------------------------------------");
		System.out.println("HERE COME THE PEOPLE . . .");
		System.out.println("----------------------------------------");
		
		
		
		/*
		 * Stack Object for Person Class
		 */
		Person Ali = new Person("Ali", "Naqvi"); // 1
		Person Joe = new Person("Joe", "Cool"); // 2
		Person Jo = new Person("Jo", "Nice"); // 3
		Person Allice = new Person("Allice", "Good"); // 4
		Person Tim = new Person("Tim", "Johnson"); // 5
		Person Jim = new Person("Jim", "Raff"); // 6
		Person JoAnna = new Person("JoAnna", "Halls"); // 7 
		
		CoolStack<Person> peopleStacking = new CoolStack<Person>();
		
		// HOW MANY TIMES DID THE ARRAY GROW?
		peopleStacking.push( Ali ); // 1
		peopleStacking.push( Joe ); // 2
		peopleStacking.push( Jo ); // 3
		peopleStacking.push( Allice ); // 4
		peopleStacking.push( Tim ); // 5
		peopleStacking.push( Jim ); // 6
		peopleStacking.push( JoAnna ); // 7
		
		System.out.println("----------------------------------------");
		
		// WHAT IS THE SIZE OF THE STACK?
		System.out.println( "Size: " + peopleStacking.size() );
		
		System.out.println("----------------------------------------");
		
		// POP, POP, POP - WHAT DID YOU GET?
		peopleStacking.pop();
		peopleStacking.pop();

		System.out.println( "Pop: " + peopleStacking.pop().getFullName() );
		
		System.out.println("----------------------------------------");
	}

}
