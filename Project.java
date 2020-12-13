import java.util.Scanner; // Library that allows us to capture user input
import java.util.*; // Allows me to check for InputMismatchException
import java.io.*; // Allows for system input and output through data streams, serialization and the file system
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class HelloWorld
{
		// public allows other classes to use this function
		// static means that only a class can call for this function to execute
		// void states that this function doesn't return any values after it is done executing
		// main is required in every Java program. This function is always executed first
		// Every main function must accept an array of string objects
	
		// Class variables must start with static if you want to access them with any other methods in the class
		static String randomString = "String to print";
		
		// Constant variables are defined with the word final
		static final double PINUM = 3.1415929;
	
		public static void main(String[] args)
		{
			// System.out is an object that outputs information
			// println is a function that prints to the screen what ever you provide between braces
			// "Hello World" is a string of characters. Strings must be surrounded with quotes
			// Every statement ends with a semicolon ;
			System.out.println("Hello World");
			
			// Variable names are case sensitive. Age is not the same as age.
			// Variables must begin with a letter and contain numbers, _, or $
			// You must declare all variables before you can use them with a data type
						
			/* You can use any variable name except for 
			 * abstract		continue	for		new		switch	assert	default	goto	package		synchronized
			 * boolean	do	if	private	this	break	double	implements	protected	throw
			 * byte	else	import	public	throws	case	enum	instanceof	return	transient
			 * catch	extends	int	short	try	char	final	interface	static	void
			 * class	finally	long	strictfp	volatile	const	float	native	super	while
			 */
			
			// This is a declaration statement
			// integerOne is a local variable to the main function. It can only be accessed in main
			int integerOne = 22; 
			
			int integerTwo = integerOne + 1; // This is an expression statement
			
			// White space has no meaning in Java, aside from variables and keywords
			integerTwo =
					integerOne
					+ 3;
			
			System.out.println(integerTwo);
			
			// Javas Primitive Types
			
			byte bigByte = 127; // Minimum value -128 Maximum value 127
			short bigShort = 32767; // Minimum value -32768 Maximum value 32767
			int bigInt = 2147483647; // Minimum value -2147483648 Maximum value 2147483647
			long bigLong = 9223372036854775807L; // Minimum value -9223372036854775808L
			
			float bigFloat = 3.14F; // You must end a float with an F
			double bigDouble = 3.1234567890D; // The D is not required with doubles
			System.out.println(Float.MAX_VALUE); // Float is precise to 6 decimal places
			System.out.println(Double.MAX_VALUE); // Double is precise to 15 decimal places
			
			boolean trueOrFalse = true; // Booleans are True or False, not 1 or 0
			
			// A char will accept a number or a character surrounded by apostrophes
			char randomChar = 65; // Character Code for A is 65 Minimum value 0 Maximum value 65535
			char anotherChar = 'A';
			System.out.println(randomChar);
			
			// chars can also contain escaped characters
			char backSpace = '\b';
			char formFeed = '\f';
			char lineFeed = '\n';
			char carriageReturn = '\r';
			char horizontalTab = '\t';
			char doubleQuote = '\"';
			char singleQuote = '\'';
			char backSlash = '\\';
			
			// A string contains a series of characters
			String randomString = "I'm just a random";
			String anotherString = "string";
			
			// You combine strings with a +
			String combinedString = randomString + ' ' + anotherString;
			System.out.println(combinedString);
			
			// How to convert any other type to a string
			String byteString = Byte.toString(bigByte);
			String shortString = Short.toString(bigShort);
			String intString = Integer.toString(bigInt);
			String longString = Long.toString(bigLong);
			String floatString = Float.toString(bigFloat);
			String doubleString = Double.toString(bigDouble);
			String booleanString = Boolean.toString(trueOrFalse);
			String charString = Character.toString(randomChar); // You don't need to do this
			
			System.out.println(charString);
			
			// Can't do this because char is a primitive data type
			// System.out.println(randomChar.getClass());
			
			// You can do this because String is an object
			System.out.println(charString.getClass());
			
			// You use casting to convert from one primitive type to another
			// If you convert from a number that is to big the largest possible value will be 
			// used instead
			double aDoubleValue = 3.1456789;
			int doubleToInt = (int) aDoubleValue;
			System.out.println(doubleToInt);
			
			/* To cast to other primitive types just proceed with the conversion to type
			 * ie (byte) (short) (long) (double) 
			 * (float) & (boolean) & (char) don't work. 
			 * (char) stays as a number instead of a character
			 */
			
			// Use parseInt to convert a string into an integer
			int stringToInt = Integer.parseInt(intString);
			
			/* Other parse functions
			 * parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean
			 * There is no reason to parse a Character
			 */
			
		}
		// You must provide a closing brace } so Java knows when the function has ended
}




//SCANNERS

public class LessonTwo
{
	/* static means that only a class can call for this function to execute
	* Creates a new scanner object named userInput
	* You create the Scanner object by calling new and passing the Scanner constructor
	* the input stream to look at (System.in = keyboard input)
	*/ 
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Your favorite number: "); // Same as println without a newline
		
		/* The if statement will only execute the code that lies between {} if the value inside () is true
		 * userInput.hasNextDouble() returns true if the next value entered is a Double
		 * There are similar methods for the other data types
		 * hasNextInt() : Integer input
		 * hasNextFloat() : Float input
		 * There are others for Boolean, Byte, Long, and Short
		 */
		
		if (userInput.hasNextInt())
		{
		
			int numberEntered = userInput.nextInt();
			/* userInput.nextDouble() receives user input and stores it in the variable numberEntered
			 * You have to use a different method based on the type of input
			 * nextInt() : Works for Integers
			 * nextDouble() : Works for Doubles
			 * nextFloat() : Works for Floats
			 * nextLine() : Works for Strings
			 * There are others for Boolean, Byte, Long, and Short
			 * If the user enters a value of the wrong type the program crashes
			 */
		
			System.out.println("You entered " + numberEntered);
			
			// Here I perform basic mathematics calculations
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
			
			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 " + " = " + numEnteredMinus2);
			
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
			
			// Without the cast the value wouldn't consider fractions
			double numEnteredDivide2 = (double)numberEntered / 2; 
			System.out.println(numberEntered + " / 2 " + " = " + numEnteredDivide2);
			
			// % Modulus returns the remainder of a division
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % 2 " + " = " + numEnteredRemainder);
			
			// Shorthand way to add to 2 to a variable and assign the result to self
			numberEntered += 2; // *= 	/=	%=  Also work
			numberEntered -= 2;
			
			// Shorthand way to add 1 to a variable
			numberEntered++;
			
			// Shorthand way to subtract 1 from a variable
			numberEntered--;
			
			int numEnteredABS = Math.abs(numberEntered); // Returns the absolute value
			
			// Returns the larger of the two arguments (They must be of the same type)
			int whichIsBigger = Math.max(5, 7); 
			
			// Returns the smaller of the two arguments (They must be of the same type)
			int whichIsSmaller = Math.min(5, 7);
			
			// Returns the square root argument 
			double numSqrt = Math.sqrt(5.23);
			
			// Rounds the number provided up
			int numCeiling = (int) Math.ceil(5.23);
			System.out.println("Ceiling: " + numCeiling);
			
			// Rounds the number provided down
			int numFloor = (int) Math.floor(5.23);
			System.out.println("Floor: " + numFloor);
			
			// Rounds the number based on the fraction
			int numRound = (int) Math.round(5.23);
			System.out.println("Rounded: " + numRound);
			
			// Generates random numbers between 0 to 9
			int randomNumber = (int) (Math.random() * 10); 
			System.out.println("A random number " + randomNumber);
			
		// If the above condition is false, the code following else is executed	
		} else {
			System.out.println("Sorry you must enter an integer");
		}
		
		
	}
	
}

//FUNCTIONS

public class LessonThree {
	
	public static void main(String[] args)
	{
		// Creates a random number between 0 and 50
		int randomNumber = (int) (Math.random() * 50);
		
		/* Relational Operators: 
		 * Java has 6 relational operators
		 * > : Greater Than
		 * < : Less Than
		 * == : Equal To
		 * != : Not Equal To
		 * >= : Greater Than Or Equal To
		 * <= : Less Than Or Equal To
		 */
		
		// If randomNumber is less than 25, execute the code between {} and then stop checking
		if (randomNumber < 25)
		{
			System.out.println("The random number is less than 25");
		}
		
		// If randomNumber wasn't less than 25, then check if it's greater than it. If so, execute the code between {} and then stop checking
		else if (randomNumber > 25)
		{
			System.out.println("The random number is greater than 25");
		}
		
		// Checks if randomNumber equals 25
		else if (randomNumber == 25)
		{
			System.out.println("The random number is equal to 25");
		}
		
		// Checks if randomNumber is not equal to 25
		else if (randomNumber != 15)
		{
			System.out.println("The random number is not equal to 15");
		}
		
		// Checks if randomNumber is less than or equal to 25
		else if (randomNumber <= 25)
		{
			System.out.println("The random number is less than or equal to 25");
		}
		
		// Checks if randomNumber is greater than or equal to 25
		else if (randomNumber >= 25)
		{
			System.out.println("The random number is greater than or equal to 25");
		}
		
		// If none of the above were correct print out the random number
		else 
		{
			System.out.println("The random number is " + randomNumber);
		}
		
		// Prints out the random number
		System.out.println("The random number is " + randomNumber);
		
		/* Logical Operators:
		 * Java has 6 logical operators
		 * ! : Converts the boolean value to its right to its opposite form ie. true to false
		 * & : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
		 * && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
		 * | : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
		 * || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
		 * ^ : Returns true if there is 1 true and 1 false boolean value on the right or left
		 */
		
		if (!(false))
		{
			System.out.println("I turned false into true");
		}
		
		
		if ((false) && (true))
		{
			System.out.println("\nBoth are true");
		}
		
		// There is also a & logical operator it checks the second boolean result even if the first comes back false
		
		if ((true) || (true))
		{
			System.out.println("\nAt least 1 are true");
		}
		
		// There is also a | logical operator it checks the second boolean result even if the first comes back true
		
		if ((true) ^ (false))
		{
			System.out.println("\n1 is true and the other false");
		}
		
		int valueOne = 1;
		int valueTwo = 2;
		
		// The Conditional or Ternary Operator assigns one or another value based on a condition
		// If true valueOne is assigned to biggestValue. If not valueTwo is assigned
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		
		System.out.println(biggestValue + " is the biggest\n");
		
		char theGrade = 'B';
		
		/* When you have a limited number of possible values a switch statement makes sense 
		 * The switch statement checks the value of theGrade to the values that follow case
		 * If it matches it executes the code between {} and then break ends the switch statement
		 * default code is executed if there are no matches
		 * You are not required to use the break or default statements
		 * The expression must be an int, short, byte, or char
		 */
		switch (theGrade)
		{
		case 'A':
			System.out.println("Great Job");
			break; // Ends the switch statement
		case 'b': // You can use multiple case statements in a row
		case 'B':
			System.out.println("Good Job, get an A next time");
			break;
		case 'C':
			System.out.println("OK, but you can do better");
			break;
		case 'D':
			System.out.println("You must work harder");
			break;
		default:
			System.out.println("You failed");
			break;
		}
		
	}
	
}


//MORE FUNCTIONS

public class LessonFour {
	
	// Creates a Scanner object that monitors keyboard input
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		/*
		 * The while loop : A while loop executes the code between {} until the 
		 * condition is no longer true
		 */
		// while loops create a loop iterator before the loop begins
		int i = 1;
		
		while(i < 20)
		{
			// Use continue to skip over printing 3
			if(i == 3)
			{
				i+=2; // When using continue, don't forget to change the iterator
				continue; // continue skips a loop iteration, but not the loop
			}
			
			System.out.println(i);
			i++;
			
			// Just print odd numbers
			if((i%2) == 0)
			{
				i++;
			}
			
			// i is greater than 10 jump out of the loop
			if(i > 10)
			{
				break; // Forces the program to leave the loop prematurely
			}
		}
		
		/* 
		 * Code that calculates the value for PI
		 */
		double myPi = 4.0; // My starting value for pi
		
		// Starting value for my loop iterator in the loop
		double j = 3.0; 
		
		// The while loop
		while(j<11)
		{
			// I calculate pi with this formula
			// PI = 4 - 4/3 + 4/5 - 4/7...
			myPi = myPi - (4/j) + (4/(j+2));
			j += 4;
			System.out.println(myPi);
		}
		
		System.out.println("Value of PI: " + Math.PI);
		
		/*
		 * Execute while loop until the user quits it
		 */
		String contYorN = "Y";
		int h = 1;
		
		// equalsIgnoreCase checks if the input string is equal to y or Y
		while (contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.print("Continue y or n?");
			contYorN = userInput.nextLine(); // Accepts a string input from the user
			h++;
			
		}
		
		/* 
		 * The do while loop : Used when you want to guarantee the code 
		 * between {} will execute at least once. The code is executed and
		 * then java checks if it should execute again
		 */
		// loop iterator for the do while loop
		// It must be created before the expression is evaluated below
		int k = 1;
		
		do 
		{
			System.out.println(k);
			k++;
		} while (k <= 10); // Counts from 1 to 10
		
		/*
		 * The for loop : Another looping tool in Java
		 * for( declare iterator; conditional statement; change iterator value)
		 */
		
		for (int l=10; l >= 1; l--)
		{
			System.out.println(l);
		}
		
		// System.out.println(l); The variable l is not callable outside of for

		int m, n; // You don't have to declare variables in the for loop
		// You can use multiple variables in the for loop
		for (m=1, n=2; m <= 9; m+=2, n+=2)
		{
			System.out.println(m + "\n" + n);
		}
		
		// You can have for loops inside of for loops, but I'll save 
		// that topic until I talk about arrays
		
	}
	
}

//SIMPLE FUNCTIONS

public class LessonFive {
	// main is a method that contains all of the code to be executed when a program runs
	
	// This is a class variable that is available to every method
	// If you declare a variable in a method it is only accessible in that method (local variable)
	
	static double myPI = 3.14159265; 
	
	// Any changes made to randomNumber in any functions will effect its global value
	
	static int randomNumber;
	
	// Creates a Scanner object that monitors keyboard input
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		/* Basic Method
		 * accessModifier static returnDataType methodName (parameters)
		 * { Statements }
		 * Access Modifier: Determines who can execute a method
		 * static: Used when you want to be able to execute a method that isn't part of a class definition
		 * Return Data Type: The data type of value returned after a method executes (void if no values are returned)
		 * Method Name: Must start with a letter, but can include letters, numbers, $, or _
		 * Parameters / Arguments: Values passed to a method
		 */
		
		System.out.println(addThem(1,2)); // addThem(1,2) will be replaced with the value that method returns
		
		// Demonstrating passing by value
		int d = 5;
		
		// Changes to the variable d in tryToChange don't effect its value globally
		// We are passing the value of d to tryToChange and not the variable
		
		tryToChange(d);
		System.out.println("Static Variable d = "+ d);
		
		// Guessing a random number
		System.out.println("\n");
		
		System.out.println(getRandomNum()); // Both prints and generates the value for randomNumber
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while(guessResult != -1)
		{
		System.out.print("Guess a number between 0 and 50: ");
		
		// Accepts an integer input from the user
		// You can't declare this variable inside the while loop if you want to access it outside the while loop
		
		randomGuess = userInput.nextInt(); 
		
		guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yes the random number is " + randomGuess);
		
		System.out.println(randomNumber); // Random value was changed globally by getRandomNum
		
	}
	
	// Adds the two numbers sent and returns the solution
	// public is the access modifier and means anyone can execute this method
	// Java Methods can return any primitive data type, or reference to an object (More on that later)
	
	public static int addThem(int a, int b)
	{
		double smallPI = 3.140; // This variable is local to the addThem function
		
		// compare returns 0 if equal | -1 if smallPI is less than myPI | 1 if smallPI is greater than myPI
		
		System.out.println(Double.compare(smallPI, myPI));
		
		int c = a + b;
		
		// return returns a value that replaces the call to this method
		// It must be an int since you defined this method returns ints above
		
		return c; 
	}
	
	// When you define an attribute / parameter you must define its type
	// That's why you can't type tryToChange(d)
	// Because this function doesn't return a value return type is void
	
	public static void tryToChange(int d)
	{
		d = d + 1;
		System.out.println("tryToChange d = " + d);
	}
	
	public static int getRandomNum()
	{
		// Creates a random number between 0 and 50
		// Since randomNumber is a class variable you don't have to declare, or define its type
		// If int randomNumber was declared in this method it wouldn't effect the global variable named randomNumber
		
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess)
	{
		if(guess == randomNumber)
		{
			return -1;
		} else {
			return guess; // Must return a value of type int
		}
	}
	
}


		/* An exception object is created when an error occurs
		 * It tells you what error occurred
		 * Here are many of the java exceptions
		 * 
		 * java.lang.RuntimeException : exceptions that can be thrown during the normal 
		 * operation of the Java Virtual Machine. These exceptions are your responsibility 
		 * as a programmer
		 * 
		 * ArithmeticException, ArrayStoreException, BufferOverflowException, 
		 * BufferUnderflowException, CannotRedoException, CannotUndoException, 
		 * ClassCastException, CMMException, ConcurrentModificationException, 
		 * DOMException, EmptyStackException, IllegalArgumentException, 
		 * IllegalMonitorStateException, IllegalPathStateException, 
		 * IllegalStateException, ImagingOpException, IndexOutOfBoundsException, 
		 * MissingResourceException, NegativeArraySizeException, NoSuchElementException, 
		 * NullPointerException, ProfileDataException, ProviderException, 
		 * RasterFormatException, SecurityException, SystemException, 
		 * UndeclaredThrowableException, UnmodifiableSetException, 
		 * UnsupportedOperationException
		 * 
		 * java.lang.Exception : exceptions that are checked for by the java compiler
		 * 
		 * AclNotFoundException, ActivationException, AlreadyBoundException, 
		 * ApplicationException, AWTException, BackingStoreException, 
		 * BadAttributeValueExpException, BadBinaryOpValueExpException, 
		 * BadLocationException, BadStringOperationException, 
		 * BrokenBarrierException, CertificateException, ClassNotFoundException, 
		 * CloneNotSupportedException, DataFormatException, 
		 * DatatypeConfigurationException, DestroyFailedException, 
		 * ExecutionException, ExpandVetoException, FontFormatException, 
		 * GeneralSecurityException, GSSException, IllegalAccessException, 
		 * IllegalClassFormatException, InstantiationException, 
		 * InterruptedException, IntrospectionException, 
		 * InvalidApplicationException, InvalidMidiDataException, 
		 * InvalidPreferencesFormatException, InvalidTargetObjectTypeException, 
		 * InvocationTargetException, IOException, JAXBException, JMException, 
		 * KeySelectorException, LastOwnerException, LineUnavailableException, 
		 * MarshalException, MidiUnavailableException, MimeTypeParseException, 
		 * MimeTypeParseException, NamingException, NoninvertibleTransformException, 
		 * NoSuchFieldException, NoSuchMethodException, NotBoundException, 
		 * NotOwnerException, ParseException, ParserConfigurationException, 
		 * PrinterException, PrintException, PrivilegedActionException, 
		 * PropertyVetoException, RefreshFailedException, RemarshalException, 
		 * RuntimeException, SAXException, ScriptException, ServerNotActiveException, 
		 * SOAPException, SQLException, TimeoutException, TooManyListenersException, 
		 * TransformerException, TransformException, UnmodifiableClassException, 
		 * UnsupportedAudioFileException, UnsupportedCallbackException, 
		 * UnsupportedFlavorException, UnsupportedLookAndFeelException, 
		 * URIReferenceException, URISyntaxException, UserException, XAException, 
		 * XMLParseException, XMLSignatureException, XMLStreamException, XPathException
		 */

		/* Common Exceptions
		 * ArithmeticException: An arithmetic operation occurs with no answer 
		 * (Division by Zero)
		 * 
		 * ClassNotFoundException: A class is called for that doesn't exist
		 * 
		 * IllegalArgumentException: A method has been passed an illegal argument
		 * 
		 * IndexOutOfBoundsException: Thrown when an index for an array, string is
		 * called for, but doesn't exist
		 * 
		 * InputMismatchException: (Part of NoSuchElementException) User enters the 
		 * wrong data type into a Scanner method
		 * 
		 * IOException: An I/O operation failed
		 */


//TRY CATCH

public class LessonSix {
	
	// Creates a Scanner object that monitors keyboard input
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		divideByZero(2);
		
		System.out.print("How old are you? ");
		int age = checkValidAge();
		
		if (age != 0){
		System.out.println("You are " + age + " years old");
		}
		
		getAFile("./somestuff.txt");
		
	}
	
	public static void divideByZero(int a)
	{
		
		try
		{
			// The following throws an error because you can't divide by zero
			// Exception in thread "main" java.lang.ArithmeticException
			System.out.println(a/0);
		}
		
		// If the exception ArithmeticException is thrown the following execute
		catch (ArithmeticException e)
		{
			// Your custom error message
			System.out.println("You can't divide by zero");
			
			// Java's error message for this exception
			System.out.println(e.getMessage());
			
			// Prints the exception name and error message
			System.out.println(e.toString());
			
			// Prints the standard error stack trace
			e.printStackTrace();
		}
		
	}
	
	public static int checkValidAge()
	{
		
		try
		{
			return userInput.nextInt(); // nextInt() receives the user input
		}
		
		catch (InputMismatchException e)
		{
			userInput.next(); // Skips the last user input and waits for the next
			System.out.print("That isn't a whole number");
			return 0;
		}
		
	}
	
	/* If you prefer to throw an exception to the calling method you use throw
	 * public static void getAFile(String fileName) throws IOException, FileNotFoundException
	 * {
	 * 		FileInputStream file = new FileInputStream(fileName);
	 * }
	 * 
	 * If main called this method, main would have to handle the exception
	 * 
	 * public static void main(String[] args) {
	 * 		try {
	 * 			getAFile("./somestuff.txt");
	 * 		}
	 * 		catch(IOException e) {
	 * 			System.out.println("An unknown IO Error Occured");
	 * 		}
	 */
	
	public static void getAFile(String fileName)
	{
		try 
		{
		/* If I tried to do this without providing for an exception
		* I'd get the error Unhandled Exception Type FileNotFoundException
		* A checked exception is an exception the compiler forces you to protect against
		*/ 
		FileInputStream file = new FileInputStream(fileName); 
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("Sorry I couldn't find that file");
		}
		
		// You can catch numerous exceptions (List most specific first
		catch (IOException e) // Catches any IO Exception
		{
			System.out.println("An unknown IO Error Occured");
		}
		
		/* To ignore an exception do this
		 * catch (ClassNotFoundException e)
		 * {}
		 */
		
		/* Java 7 allows you to catch multiple exceptions at once
		 * catch (FileNotFoundException | IOException e)
		 * {}
		 */
		
		// This will catch any exception (This should always be last)
		catch (Exception e)
		{
			System.out.println("I catch every exception");
		}
		
		// If used finally is always executed whether there was an exception or not
		// It is used for clean up work like closing files and database connections
		finally
		{
			System.out.println("");
		}
		
	}
	
}


// MONSTER

public class Monster{
	
	// Class Variables or Fields
	// You declare constants with final
	
	public final String TOMBSTONE = "Here Lies a Dead monster";
	
	// private fields are not visible outside of the class
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	// public variables are visible outside of the class
	// You should have as few as possible public fields
	public String name = "Big Monster";
	
	// Class Methods
	// Accessor Methods are used to get and set the values of private fields
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	// You can create multiple versions using the same method name
	// Now setHealth can except an attack that contains decimals
	// When overloading a method you can't just change the return type
	// Focus on creating methods that except different parameters
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth)
	{
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	/* The Constructor
	 * Code that is executed when an object is created from this class definition
	 * The method name is the same as the class
	 * The constructor is only executed once per object
	 * The constructor can't return a value
	 */
	
	public Monster(int health, int attack, int movement)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		/* If the attributes had the same names as the class health, attack, movement
		 * You could refer to the objects fields by proceeding them with this
		 * this.health = health;
		 * this.attack = attack;
		 * objectFieldName = attributeFieldName;
		 */
		
	}
	
	// You can overload constructors like any other method
	// The following constructor is the one provided by default if you don't create any other constructors
	// Default Constructor
	
	public Monster()
	{
		
	}
	
	/* You can use the this keyword to call other constructors
	 * public LessonSeven(int newHealth)
	 * {
	 * 		health = newHealth;
	 * }
	 * 
	 * public LessonSeven(int newHealth, int newAttack)
	 * {
	 * 		this(newHealth); // Any calls to another constructor must occur on the first line
	 * 		attack = newAttack;
	 * }
	 */
	
}



// GAME

public class LessonEight {
	
	public static void main(String[] args)
	{
		
		MonsterTwo.buildBattleBoard();
		
		char[][] tempBattleBoard = new char[10][10];
		
		// ObjectName[] ArrayName = new ObjectName[4];
		
		MonsterTwo[] Monsters = new MonsterTwo[4];
		
		// MonsterTwo(int health, int attack, int movement, String name)
		
		Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
		Monsters[1] = new MonsterTwo(500, 40, 2, "Drac");
		Monsters[2] = new MonsterTwo(1000, 20, 1, "Paul");
		Monsters[3] = new MonsterTwo(1000, 20, 1, "George");
		
		MonsterTwo.redrawBoard();
		
	}
	
	
}



//MORE ARRAYS AND OTHERS


public class LessonNine {
	
	public static void main(String[] args){
		
		// An array is a variable that can hold a bunch of values
		// Think of an array as a big box filled with other boxes
		// Each box has a number on it called an index that you use 
		// to access its specific value
		
		/* Array Rules
		 * An array can contain only values of the same type
		 * An arrays size can't be changed once it is set
		 * An array is an object
		 */
		
		// You declare an array with the dataType[] arrayName
		int[] randomArray; 
		
		// You create an array with 
		// dataType[] arrayName = new dataType[sizeOfArray];
		
		int[] numberArray = new int[10];
		
		// You can add values to the array in many ways
		// Individually
		
		// Most create array and define size first
		randomArray = new int[20]; 
		randomArray[1] = 2;
		
		// You can also create the array and its values from the start
		String[] stringArray = {"Just", "Random", "Words"};
		
		// You can add values with a loop
		// arrayName.length returns the number of elements in the array
		for(int i = 0; i < numberArray.length; i++)
		{
			
			numberArray[i] = i;
			
		}
		
		// Draws 41 lines on the screen
		int k = 1;
		while(k <= 41){ System.out.print('-'); k++; }
		System.out.println();
		
		// Cycles through all of the boxes in the array and prints them
		for(int j = 0; j < numberArray.length; j++)
		{
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		
		// Draws 41 lines on the screen
		k = 1;
		while(k <= 41){ System.out.print('-'); k++; }
		System.out.println();
		
		// Multidimensional Array
		// To but arrays in an array just add another []
		
		String[][] multiDArray = new String[10][10];
		
		// Adding values to a multidimensional array
		
		for(int i = 0; i < multiDArray.length; i++)
		{
			
			// To get the length for the array in the array you must follow it 
			// with brackets with the index between them like [i]
			
			for(int j = 0; j < multiDArray[i].length; j++)
			{
				
				multiDArray[i][j] = i + " " + j;
				
			}
			
		}
		
		// Draws 61 lines on the screen
		k = 1;
		while(k <= 61){ System.out.print('-'); k++; }
		System.out.println();
		
		// Prints out a multidimensional array with the values being the indexes
		
		for(int i = 0; i < multiDArray.length; i++)
		{
			
			for(int j = 0; j < multiDArray[i].length; j++)
			{
				
				System.out.print("| " + multiDArray[i][j] + " ");
				
			}
			System.out.println("|");
			
		}
		
		// Draws 61 lines on the screen
		k = 1;
		while(k <= 61){ System.out.print('-'); k++; }
		System.out.println();
		
		// You can use the enhanced for loop to print out array values
		// for(itemDataType tempVariable : arrayName)
		
		for(int row : numberArray)
		{
			System.out.print(row);
		}
		System.out.println("\n");
		
		// To use enhanced for for a multidimensional array you follow this formula
		// for(dataType[] varForRow : arrayName)
		
		for(String[] rows : multiDArray) 
		{
			// for(elementDataType varForColumn : varForRow)
			for(String column : rows) 
			{
				System.out.print("| " + column + " ");
		    }
		        System.out.println("|");
		}
		
		// You can copy an array in a couple of ways
		// Arrays.copyOf(arrayToCopy, numberToCopyFromBeginning);
		
		int[] numberCopy = Arrays.copyOf(numberArray, 5);
		for(int num : numberCopy)
		{
			System.out.print(num);
		}
		System.out.println("\n");
		
		// You can copy an array from one index to another with copyOfRange
		// int[] numberCopy = Arrays.copyOf(numberArray, 1, 5);
		
		// You can print out the whole array with toString
		System.out.println(Arrays.toString(numberCopy));
		
		
		// Do define a default value for an array use fill
		// Arrays.fill(arrayName, valueToFill);
		// valueToFill must be the same for each element in the array
		
		int[] moreNumbers = new int[100];
		Arrays.fill(moreNumbers, 2);
		
		// Filling a multidimensional array
		char[][] boardGame = new char[10][10];
		for(char[] row : boardGame)
		{
			Arrays.fill(row, '*');
		}
		
		// You can sort an array using sort()
		int[] numsToSort = new int[10];
		
		// Generate array full of random numbers
		for(int i = 0; i < 10; i++)
		{
			numsToSort[i] = (int) (Math.random() * 100);
		}
		
		// Sort the array in ascending order
		Arrays.sort(numsToSort);
		
		System.out.println(Arrays.toString(numsToSort));
		
		// binarySearch returns the index for the searched for value
		// If it doesn't find it it returns a negative number
		
		int whereIs50 = Arrays.binarySearch(numsToSort, 50);
		
		System.out.println(whereIs50);
	}
	
}
