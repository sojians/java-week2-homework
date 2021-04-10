package week2;

public class Loops {

	public static void main(String[] args) {

		// A while loop that prints all even numbers from 0 to 100
		int numCount1 = 0;
		while(numCount1 <= 100) {
			System.out.println(numCount1);
			numCount1++;
		}
		
			// A while loop that prints every 3rd number going backwards from 100 until we reach 0
			// Originally thought they meant every number divisible by 3
		// int numCount2 = 100;
		// while(numCount2 >= 0) {
		//	if (numCount2 % 3 == 0) {
		//	System.out.println(numCount2);
		//	numCount2--;
		//	}
		//	else {
		//		numCount2--;
		//	}
		// }

		// A while loop that prints every 3rd number going backwards from 100 until we reach 0
		// What the statement wants
		int numCount2 = 100;
		while(numCount2 >= 0) {
			System.out.println(numCount2);
			numCount2 = numCount2 - 3;
		}
		
		// A for loop that prints every other number from 1 to 100
		for (int x = 1; x <= 100; x = x + 2) {
			System.out.println(x);
		}

		// A for loop that prints every number from 0 to 100, but if the number is 
		// divisible by 3, it prints “Hello” instead of the number, and if the number 
		// is divisible by 5, it prints “World” instead of the number, and if it is 
		// divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		for (int y = 0; y <= 100; y++) {
			
			// divisible by both 3 and 5, it prints “HelloWorld” instead of the number
			if(y % 3 == 0 && y % 5 == 0) {
				System.out.println("Hello World");
			}
			
			// divisible by 3, it prints “Hello” instead of the number
			else if(y % 3 == 0) {
				System.out.println("Hello");
			}
			
			// divisible by 5, it prints “World” instead of the number
			else if(y % 5 == 0) {
				System.out.println("World");
			}
			
			// just prints out the number
			else {
				System.out.println(y);
			}
				
		}		

	}

}
