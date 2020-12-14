import java.util.Scanner; 
import java.util.*; 
import java.io.*; 
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import java.util.LinkedList; 

public class Generics
{
	
		static String randomString = "String to print";
		
		static final double PINUM = 3.1415929;
	
		public static void main(String[] args)
		{

			System.out.println("Hello World");

			int integerOne = 22; 
			
			int integerTwo = integerOne + 1; // This is an expression statement
			
			integerTwo =
					integerOne
					+ 3;
			
			System.out.println(integerTwo);

			
			byte bigByte = 127; 
			short bigShort = 32767; 
			int bigInt = 2147483647; 
			long bigLong = 9223372036854775807L; 
			
			float bigFloat = 3.14F; 
			double bigDouble = 3.1234567890D; 
			System.out.println(Float.MAX_VALUE); 
			System.out.println(Double.MAX_VALUE); 
			
			boolean trueOrFalse = true; 
			
			char randomChar = 65; 
			char anotherChar = 'A';
			System.out.println(randomChar);
			
			char backSpace = '\b';
			char formFeed = '\f';
			char lineFeed = '\n';
			char carriageReturn = '\r';
			char horizontalTab = '\t';
			char doubleQuote = '\"';
			char singleQuote = '\'';
			char backSlash = '\\';
			
			String randomString = "I'm just a random";
			String anotherString = "string";
			
			String combinedString = randomString + ' ' + anotherString;
			System.out.println(combinedString);
			
			String byteString = Byte.toString(bigByte);
			String shortString = Short.toString(bigShort);
			String intString = Integer.toString(bigInt);
			String longString = Long.toString(bigLong);
			String floatString = Float.toString(bigFloat);
			String doubleString = Double.toString(bigDouble);
			String booleanString = Boolean.toString(trueOrFalse);
			String charString = Character.toString(randomChar); // You don't need to do this
			
			System.out.println(charString);
			
			System.out.println(charString.getClass());

			double aDoubleValue = 3.1456789;
			int doubleToInt = (int) aDoubleValue;
			System.out.println(doubleToInt);
			
			int stringToInt = Integer.parseInt(intString);
			
		}
}




//SCANNERS

public class Generics
{

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Your favorite number: ");
		
		
		if (userInput.hasNextInt())
		{
		
			int numberEntered = userInput.nextInt();
		
			System.out.println("You entered " + numberEntered);
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
			
			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 " + " = " + numEnteredMinus2);
			
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
			
			double numEnteredDivide2 = (double)numberEntered / 2; 
			System.out.println(numberEntered + " / 2 " + " = " + numEnteredDivide2);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % 2 " + " = " + numEnteredRemainder);
			
			numberEntered += 2; 
			numberEntered -= 2;
			
			numberEntered++;
			
			numberEntered--;
			
			int numEnteredABS = Math.abs(numberEntered); 
			
			int whichIsBigger = Math.max(5, 7); 
			
			int whichIsSmaller = Math.min(5, 7);

			double numSqrt = Math.sqrt(5.23);

			int numCeiling = (int) Math.ceil(5.23);
			System.out.println("Ceiling: " + numCeiling);

			int numFloor = (int) Math.floor(5.23);
			System.out.println("Floor: " + numFloor);

			int numRound = (int) Math.round(5.23);
			System.out.println("Rounded: " + numRound);

			int randomNumber = (int) (Math.random() * 10); 
			System.out.println("A random number " + randomNumber);

		} else {
			System.out.println("Sorry you must enter an integer");
		}
		
		
	}
	
}

//FUNCTIONS

public class Generics {
	
	public static void main(String[] args)
	{
		int randomNumber = (int) (Math.random() * 50);
	
		if (randomNumber < 25)
		{
			System.out.println("The random number is less than 25");
		}

		else if (randomNumber > 25)
		{
			System.out.println("The random number is greater than 25");
		}
		
		else if (randomNumber == 25)
		{
			System.out.println("The random number is equal to 25");
		}

		else if (randomNumber != 15)
		{
			System.out.println("The random number is not equal to 15");
		}

		else if (randomNumber <= 25)
		{
			System.out.println("The random number is less than or equal to 25");
		}

		else if (randomNumber >= 25)
		{
			System.out.println("The random number is greater than or equal to 25");
		}
		
		else 
		{
			System.out.println("The random number is " + randomNumber);
		}
		
		System.out.println("The random number is " + randomNumber);
		
		if (!(false))
		{
			System.out.println("I turned false into true");
		}
		
		
		if ((false) && (true))
		{
			System.out.println("\nBoth are true");
		}
		
		if ((true) || (true))
		{
			System.out.println("\nAt least 1 are true");
		}
		
		if ((true) ^ (false))
		{
			System.out.println("\n1 is true and the other false");
		}
		
		int valueOne = 1;
		int valueTwo = 2;

		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		
		System.out.println(biggestValue + " is the biggest\n");
		
		char theGrade = 'B';
		switch (theGrade)
		{
		case 'A':
			System.out.println("Great Job");
			break;
		case 'b': 
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

public class Generics {
	
	// Creates a Scanner object that monitors keyboard input
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{

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
		
		int k = 1;
		
		do 
		{
			System.out.println(k);
			k++;
		} while (k <= 10); // Counts from 1 to 10

		
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

public class Generics {
	
	static double myPI = 3.14159265; 
	
	// Any changes made to randomNumber in any functions will effect its global value
	
	static int randomNumber;
	
	// Creates a Scanner object that monitors keyboard input
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		System.out.println(addThem(1,2)); // addThem(1,2) will be replaced with the value that method returns
		
		// Demonstrating passing by value
		int d = 5;
		
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
	
	public static int addThem(int a, int b)
	{
		double smallPI = 3.140; // This variable is local to the addThem function
		
		// compare returns 0 if equal | -1 if smallPI is less than myPI | 1 if smallPI is greater than myPI
		
		System.out.println(Double.compare(smallPI, myPI));
		
		int c = a + b;
		
		
		return c; 
	}
	
	
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

//TRY CATCH

public class Generics {
	
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
	
	public static void getAFile(String fileName)
	{
		try 
		{
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

public class Generics{
	
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
	
	
	public Monster(int health, int attack, int movement)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		
	}
	
	
	public Monster()
	{
		
	}
	
}



// GAME

public class Generics {
	
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





// BASSIC CLASS DEF

public class Generics{
	// Creates a multidimensional array of chars
	static char[][] battleBoard = new char[10][10];
	
	// This static method builds an empty battle board
	public static void buildBattleBoard(){
		
		// Cycles through the array and gives a default value of * to everything
		
		for(char[] row : battleBoard)
			Arrays.fill(row, '*');
	}
	
	// Redraws the board
	public static void redrawBoard()
	{
		
		int k = 1;
		while(k <= 30){ System.out.print('-'); k++; }
		System.out.println();
		
		for(int i = 0; i < battleBoard.length; i++)
		{
			for(int j = 0; j < battleBoard[i].length; j++)
			{
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
			
		}
		k = 1;
		while(k <= 30){ System.out.print('-'); k++; }
		System.out.println();
	}
	
	// Class Variables or Fields
	// You declare constants with final
	
	public final String TOMBSTONE = "Here Lies a Dead monster";
	
	// private fields are not visible outside of the class
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	
	// Monitors whether the monster is alive or dead
	private boolean alive = true;
	
	// public variables are visible outside of the class
	// You should have as few as possible public fields
	public String name = "Big Monster";
	public int xPosition = 0;
	public int yPosition = 0;
	public char nameChar1 = 'B';
	public static int numOfMonsters = 0;
	
	
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
	
	public boolean getAlive()
	{
		return alive;
	}
	
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
	
	public void moveMonster(MonsterTwo[] monster, int arrayItemIndex)
	{
		// isSpaceOpen will be used to track whether the space the
		// monster plans to move into is occupied
		boolean isSpaceOpen = true;
		
		// Define the maximum x and y for the battle board
		// It's 1 less because the array index starts at 0
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		
		// while loop used to make sure I don't move a monster
		// into an occupied space
		while(isSpaceOpen)
		{
		
		// Randomly generate move direction N, S, E, or W
		int randMoveDirection = (int) (Math.random() * 4);
		
		// Randomly generate move distance based on max move distance
		int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1));
		
		// Prints move distance and move direction
		System.out.println(randMoveDistance + " " + randMoveDirection);
		
		// Erase monsters character on the board by replacing it with a *
		
		battleBoard[this.yPosition][this.xPosition] = '*';
		

			
		if(randMoveDirection == 0)
		{
			// Find new xPosition & yPosition based on the current position on the board
			// If statements won't allow monster to move off the board
			
			if((this.yPosition - randMoveDistance) < 0)
			{
				this.yPosition = 0;
			} else {
				this.yPosition = this.yPosition - randMoveDistance;
			}
		} else if (randMoveDirection == 1) {
			if((this.xPosition + randMoveDistance) > maxXBoardSpace)
			{
				this.xPosition = maxXBoardSpace;
			} else {
				this.xPosition = this.xPosition + randMoveDistance;
			}
		} else if (randMoveDirection == 2) {
			if((this.yPosition + randMoveDistance) > maxYBoardSpace)
			{
				this.yPosition = maxYBoardSpace;
			} else {
				this.yPosition = this.yPosition + randMoveDistance;
			}
		} else {
			if((this.xPosition - randMoveDistance) < 0)
			{
				this.xPosition = 0;
			} else {
				this.xPosition = this.xPosition - randMoveDistance;
			}
		}
		
		// monster.length returns the number of items in the array monster
		for (int i = 0; i < monster.length; i++)
		{
			// if statement skips checking the same monster position against itself
			
			if (i == arrayItemIndex)
			{
				continue;
			} 
			
			// onMySpace receives the monster array, index for the object I'm 
			// checking currently, and the index for the monster sent to 
			// this function
			
			if(onMySpace(monster, i, arrayItemIndex))
			{
				// If a monster tries to move to an occupied space the
				// while loop repeats after I break out of the for loop
				
				isSpaceOpen = true;
				break;
			} else {
				// There was no monster in the space so end the while loop
				isSpaceOpen = false;
				
			}
			
		}
		
		} // End of while loop
		
		// Set the value in the array to the first letter of the monster
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;	
	}
	
	// Checks if one monster is trying to move into the same x/y position as 
	// another monster
	public boolean onMySpace(MonsterTwo[] monster, int indexToChk1, int indexToChk2)
	{
		// Checks if the 2 monsters have the same x/y position
		if((monster[indexToChk1].xPosition)==(monster[indexToChk2].xPosition)&&(monster[indexToChk1].yPosition)==(monster[indexToChk2].yPosition))
		{
			// If they are equal return true so a new x/y position is calculated
			
			return true;
			
		} else {
			
			// If false I know the x/y position isn't occupied
			return false;
		}
	}
	
	
	public MonsterTwo(int health, int attack, int movement, String name)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		/* If the attributes had the same names as the class health, attack, movement
		 * You could refer to the objects fields by proceeding them with this
		 * this.health = health;
		 * this.attack = attack;
		 * objectFieldName = attributeFieldName;
		 */
		
		// Define the maximum x and y for the battle board
		// It's 1 less because the array index starts at 0
		int maxXBoardSpace = battleBoard.length - 1;
		int maxYBoardSpace = battleBoard[0].length - 1;
		
		// The random starting position for a monster
		int randNumX, randNumY;
		
		// We use a do loop because we always want to define a start 
		// position for each monster
		
		do {
		// Calculate start position based on max board space
		randNumX = (int) (Math.random() * maxXBoardSpace);
		randNumY = (int) (Math.random() * maxYBoardSpace);
		} while(battleBoard[randNumY][randNumX] != '*');
		// Only allow monster to start on a space with a * on it
		
		// Assign x and y position to the object that called this method
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		// Assign character in the array based on the first initial
		// of the monsters name charAt(0) returns first letter of name
		this.nameChar1 = this.name.charAt(0);
		
		// Put first character of monster in the array
		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
		
		numOfMonsters++; // Adds 1 to the number of monsters on the board
	}
	
	// You can overload constructors like any other method
	// The following constructor is the one provided by default if you don't create any other constructors
	// Default Constructor
	
	public MonsterTwo()
	{
		numOfMonsters++; // Adds 1 to the number of monsters on the board
	}
	
public static void main(String[] args)
{
	
	
	
}
	
}


//COLLECTION CL

public class Generics {
	
	public static void main(String[] args)
	{
		
		// You can create an ArrayList variable
		ArrayList arrayListOne;
		
		// Then create an ArrayList object
		// You don't have to declare the ArrayList size like you
		// do with arrays (Default Size of 10)
		arrayListOne = new ArrayList();
		
		// You can create the ArrayList on one line
		
		ArrayList arrayListTwo = new ArrayList();
		
		// You can also define the type of elements the ArrayList
		// will hold
		ArrayList<String> names = new ArrayList<String>();
		
		// This is how you add elements to an ArrayList
		names.add("John Smith");
		names.add("Mohamed Alami");
		names.add("Oliver Miller");
		
		// You can also add an element in a specific position
		names.add(2, "Jack Ryan");
		
		// You retrieve values in an ArrayList with get
		// arrayListName.size() returns the size of the ArrayList
		for( int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		// You can replace a value using the set method
		names.set(0, "John Adams");
		
		// You can remove an item with remove
		names.remove(3);
		
		// You can also remove the first and second item with
		// the removeRange method
		// names.removeRange(0, 1);
		
		// When you print out the ArrayList itself the toString
		// method is called
		System.out.println(names);
		
		// You can also use the enhanced for with an ArrayList
		for(String i : names)
		{
			System.out.println(i);
		}
		System.out.println(); // Creates a newline
		
		// Before the enhanced for you had to use an iterator
		// to print out values in an ArrayList
		
		// Creates an iterator object with methods that allow
		// you to iterate through the values in the ArrayList
		Iterator indivItems = names.iterator();
		
		// When hasNext is called it returns true or false
		// depending on whether there are more items in the list
		
		while(indivItems.hasNext())
		{
			// next retrieves the next item in the ArrayList
			System.out.println(indivItems.next());
			
		}
		
		// I create an ArrayList without stating the type of values
		// it contains (Default is Object)
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		// addAll adds everything in one ArrayList to another
		nameCopy.addAll(names);
		System.out.println(nameCopy);
		
		String paulYoung = "Paul Young";
		
		// You can add variable values to an ArrayList
		names.add(paulYoung);
		
		// contains returns a boolean value based off of whether
		// the ArrayList contains the specified object
		
		if(names.contains(paulYoung))
		{
			System.out.println("Paul is here");
		}
		
		// containsAll checks if everything in one ArrayList is in
		// another ArrayList
		if(names.containsAll(nameCopy))
		{
			System.out.println("Everything in nameCopy is in names");
		}
		
		// Clear deletes everything in the ArrayList
		names.clear();
		
		// isEmpty returns a boolean value based on if the ArrayList 
		// is empty
		if (names.isEmpty())
		{
			
			System.out.println("The ArrayList is empty");
			
		}
		
		Object[] moreNames = new Object[4];
		
		// toArray converts the ArrayList into an array of objects
		moreNames = nameCopy.toArray();
		
		// toString converts items in the array into a String
		System.out.println(Arrays.toString(moreNames));
		
		
	}
	
}



// LinkedList

public class Generics {
	
	public static void main(String[] args){
		
		// Creates a LinkedList object
		LinkedList linkedListOne = new LinkedList();
		
		// Creates a LinkedList that contains Strings
		LinkedList<String> names = new LinkedList<String>();
		
		// You use add to add items to the Linked List
		names.add("Ahmed Bennani");
		names.add("Ali Syed");
		
		// addLast places the object last in the list
		names.addLast("Nathan Martin");
		
		// addLast places the object first in the list
		names.addFirst("Joshua Smith");
		
		// You can define what position to place the object in
		names.add(0, "Noah Peeters");
		
		// You replace a value in an index with set()
		names.set(2, "Paul Newman");
		
		// You remove items either by providing the index, or 
		// the value
		names.remove(4);
		names.remove("Joshua Smith");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		
		// You can retrieve values with get()
		System.out.println("\nFirst Index: " + names.get(0));

		// Retrieve the first value with getFirst()
		System.out.println("\nFirst Index: " + names.getFirst());

		// Retrieve the first value with getFirst()
		System.out.println("\nLast Index: " + names.getLast());
		

		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		// When you print out the LinkedList itself the toString
		// method is called
		System.out.println("\nnameCopy: " + nameCopy);

		// You can check if an object is in the list with contains()
		if(names.contains("Noah Peeters"))
		{
			System.out.println("\nNoahs Here");
		}
		

		// You can check if everything in one list is in another
		if(names.containsAll(nameCopy))
		{
			System.out.println("\nCollections are the same");
		}
		

		// Return the index for an object with indexOf
		System.out.println("\nIndex of Ali is: " + names.indexOf("Ali Syed"));

		// Check if a list is empty with isEmpty()
		System.out.println("List Empty: " + names.isEmpty());
		

		// Get the number of items in the list with size
		System.out.println("How many values: " + names.size());

		// peek() retrieves the first element, but doesn't throw an error 
		// if there is no element to retrieve
		System.out.println("Look without error: " + names.peek());
		
		
		// poll() returns the first value and deletes it from the list
		System.out.println("Remove first element: " + nameCopy.poll());
		

		// poll() returns the last value and deletes it from the list
		System.out.println("Remove last element: " + nameCopy.pollLast());
		

		// push puts a new element on the front of the list
		nameCopy.push("Noah Peeters");
		
		// pop removes an element on the front of the list
		nameCopy.pop();
		
		System.out.println("\nnameCopy: " + nameCopy);

		// Create a new array to hold values from the Linked List
		Object[] nameArray = new Object[4];
		
		// toArray converts the LinkedList into an array of objects
		nameArray = names.toArray();
		
		// toString converts items in the array into a String
		System.out.println(Arrays.toString(nameArray));
		
		// clear() deletes everything in the Linked List
		names.clear();
		
		
	}
	
}



// String class

public class Generics {
	
	public static void main(String[] args){
		
		// You create a String like this
		String randomString = "I'm just a random string";
		
		// If you want to use quotes in a string escape it with \
		// Always surround Strings with quotes " " and not Apostrophes ' '
		String gotToQuote ="He said, \"I'm here\"";
		
		// You combine Strings with a +
		System.out.println(randomString + " " + gotToQuote);
		
		// You can add other data type to the string with a +
		int numTwo = 2;
		System.out.println(randomString + " " + numTwo);
		
		
		// You compare strings with equals or equalsIgnoreCase
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(uppercaseStr.equals(lowercaseStr))
		{
			System.out.println("They're equal");
		}
		
		if(uppercaseStr.equalsIgnoreCase(lowercaseStr))
		{
			System.out.println("Same letters");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		// charAt returns the character in a string
		System.out.println("2nd Character: " + letters.charAt(1));

		System.out.println(letters.compareTo(moreLetters));
		
		// contains() returns a boolean depending on whether the 
		// String contains the String you pass it
		System.out.println(letters.contains("abc"));
		
		// endsWith() checks if the String ends with the String you pass
		System.out.println(letters.endsWith("de"));
		
		// startsWith() works similar to endsWith()
		
		// indexOf() returns the 1st index that matches the String passed
		System.out.println(letters.indexOf("cd"));
		
		// You can also specify the index to start searching from
		// indexOf(StringToLookFor, IndexStartPosition)
		
		// lastIndexOf() works like indexOf except it starts from the 
		// end of the String you are searching
		
		// length() returns the number of characters in a String
		System.out.println("Length of string: " + letters.length());
		
		// replace() replaces every occurrence of the first String with
		// the second String you provide
		System.out.println(letters.replace("abc", "xy"));

		String[] letterArray = letters.split("");
		
		// toString() converts the array into a String to print it 
		System.out.println(Arrays.toString(letterArray));
		
		// toCharArray() inserts every character in the string into
		// separate indexes in an array 
		char[] charArray = letters.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		
		// substring() returns a String starting at the first index
		// through the last index provided
		System.out.println(letters.substring(1,4));
		
		// toUpperCase() converts all letters into uppercase
		// toLowerCase() does the opposite
		System.out.println(letters.toUpperCase());
		
		String randString = "   abc   ";
		
		// trim() gets rid of leading and trailing white space
		System.out.println(randString.trim());
		
		StringBuilder randSB = new StringBuilder("A random string");
		
		// append() adds anything to the end of a SB
		System.out.println(randSB.append(" again"));
		
		// append() permanently effected the StringBuilder
		System.out.println(randSB);
		
		// delete() removes part of the SB from first index to the last
		System.out.println(randSB.delete(15, 21));
		
		// deleteCharAt(index) is used to delete individual chars
		
		// capacity() returns the number of indexs for the SB
		System.out.println(randSB.capacity());
		
		// ensureCapacity() increases the capacity for the SB
		randSB.ensureCapacity(60);
		System.out.println(randSB.capacity());
		
		// length() returns the number of characters in the SB
		System.out.println(randSB.length());
		
		// trimToSize() forces capacity to equal length
		randSB.trimToSize();
		
		// insert() inserts at the index you provide anything
		System.out.println(randSB.insert(1, "nother"));
		
		// toString converts a SB into a String
		String oldSB = randSB.toString();
		
		/* StringBuilders also have the same methods as Strings
		 * charAt(), indexOf(), lastIndexOf(), subString()
		 */
	}
	
}
