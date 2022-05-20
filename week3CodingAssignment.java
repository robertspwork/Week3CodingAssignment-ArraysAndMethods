import java.util.Arrays;

public class week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.	Create an array of int called ages 
		//that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8 ,28, 93};
		
		//a.	Programmatically subtract the value of the first element 
		//in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code). Print the result to the console.
		
		int subtraction = (ages[ages.length - ages.length] - ages[ages.length-1]);
		
		System.out.println("1.a) " + subtraction);
		
		//b.	Add a new age to your array and repeat the step above to ensure 
		//it is dynamic (works for arrays of different lengths).
		
		int[] newAge = new int[ages.length];
		
		System.arraycopy(ages, 0, newAge, 0, ages.length);
		
		newAge[newAge.length - 1] = 2;
		
		int subtraction2 = (newAge[newAge.length - newAge.length] - newAge[newAge.length-1]);
		
		System.out.println("1.b) " + subtraction2);
		
		//c.	Use a loop to iterate through the array and calculate the average 
		//age. Print the result to the console.
		
		int add = 0;
		
		for (int i = 0; i < newAge.length; i++) {
			add += newAge[i];
		}
		double avg = add / newAge.length;
		
		System.out.println("1.c) " + avg);
				
		//2.	Create an array of String called names that contains the following
		// values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// a.	Use a loop to iterate through the array and calculate the average number
		// of letters per name. Print the result to the console.
		double sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		avg = sum / names.length;
		System.out.println("2.a) " + avg);
		
		// b.	Use a loop to iterate through the array again and concatenate all the 
		// names together, separated by spaces, and print the result to the console.
		
		String namesTogether = "";
		for (int i = 0; i < names.length; i++) {
		
			namesTogether += names[i] + " ";
			System.out.println("2.b) " +namesTogether);
		}
		
		//3.	How do you access the last element of any array?
		
		System.out.println("3. To access the last element of an array use array[array.length - 1]");
		
		//4.	How do you access the first element of any array?
		
		System.out.println("4. To access the first element of an array use array[0]");
		
		//5.	Create a new array of int called nameLengths. Write a loop to iterate 
		// over the previously created names array and add the length of each name to 
		// the nameLengths array.
		
		int[] nameLengths = new int [names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum
		// of all the elements in the array. Print the result to the console.
		int sumOfElements = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfElements += nameLengths[i];
			
		}
		System.out.println("6. " + sumOfElements);
		
		//7.	Write a method that takes a String, word, and an int, n, as arguments and
		// returns the word concatenated to itself n number of times. (i.e. if I pass in 
		// “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		
		System.out.println("7. " + multiples("Hello", 3));
		
		//8.	Write a method that takes two Strings, firstName and lastName, and returns
		// a full name (the full name should be the first and the last name as a String 
		// separated by a space).
		
		System.out.println("8. " + fullName("Bat", "Man"));
		
		//9.	Write a method that takes an array of int and returns true if the sum of all
		// the ints in the array is greater than 100. 
		
		int[] test= {1,2,3};
		
		System.out.println("9. " + greaterThan100(test));
		
		//10.	Write a method that takes an array of double and returns the average of all 
		// the elements in the array.
		
		double[] arrayD = {0.1, 0.2, 0.3, 0.4};
		System.out.println("10. " + dAvg(arrayD));
		
		//11.	Write a method that takes two arrays of double and returns true if the 
		// average of the elements in the first array is greater than the average of the 
		// elements in the second array.
		
		double[] arrayD2 = {0.5, 0.6, 0.7, 0.8};
		System.out.println("11. " + firstVsLast(arrayD, arrayD2));
		
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and 
		// a double moneyInPocket, and returns true if it is hot outside and if 
		// moneyInPocket is greater than 10.50.
		
		boolean isHotOutside = true;
		double moneyInPocket = 10.6;
		System.out.println("12. " + willBuyDrinks(isHotOutside, moneyInPocket));
		
		//13.	Create a method of your own that solves a problem. In comments, write 
		// what the method does and why you created it.
		
		int che = 100;
	
		System.out.println("13. Your new checking acoount balance is " + bank(che));
		
		//13 Ans: This method is used to determine the difference between a persons bills 
		// and and how much money they are getting paid. If the person has more bills than 
		//they there check can cover then the person will need to make up the extra from 
		//there checking account. If the check is higher than the bills than the person can add the 
		// difference to there checking account.
	}

		
		public static String multiples(String word, int n) {
			String multiples = "";
			for (int i = 0; i < n; i++) {
				multiples += word;
			}
		
		return multiples;
		}
		
		
		public static String fullName(String first, String last) {
			return first + " " + last;
		}
		
		public static boolean greaterThan100(int[] arra) {
			int sum = 0;
			for (int number : arra) {
				sum += number;
				}
				
			return sum > 100;
		}
		
		public static double dAvg(double[] arr) {
			double sum = 0;
			for (double number : arr) {
				sum += number;
			}
			return sum / arr.length;
		}
		
		public static boolean firstVsLast(double[] first, double[] second) {
			double sum1 = 0;
			double sum2 = 0;
			for (double numb1 : first) {
				sum1 += numb1;
			}
			for (double numb2 : second) {
				sum2 += numb2;
			}
			return sum1 > sum2;
		}
		
		public static boolean willBuyDrinks(boolean isHotOutside, double moneyInPocket) {
			
		 
		return (isHotOutside == true && moneyInPocket > 10.50);
		}
		
		public static int bank(int checking) {
			int check = 600;
			int bills = 550;
			int difference = check - bills;
			if (difference > 0) {
				return Math.abs(difference + checking);
			}
			
		
		return Math.abs(checking + difference);
	}
	
}
	
	


