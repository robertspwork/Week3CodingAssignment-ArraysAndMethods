import java.util.Arrays;

public class week3LabCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Lab Part 1:
		
		int[] array = {1, 5, 2, 8, 13, 6};
		
		System.out.println(array[0]);
		
		System.out.println(array[array.length-1]);
		
		//System.out.println(array[array.length + 1]);
		
		//System.out.println(array[-1]);
		
		for (int i =0; i < array.length; i++) {
			System.out.println(array[i]);	
		}
		
		for (int number : array) {
			System.out.println(number);
		}
		
		double sum = 0;
		
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);
		
		double average = sum / array.length;
		System.out.println(average);
		
		for (int number : array) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}
		String[] names = {"Sam", "Sally", "Thomas","Robert"};
		int sumLetters = 0;
		for (String name : names) {
			sumLetters += name.length();
			
		}

		
		//Lab Part 2:
		
		greet("Tom");
		greet("Sally");
		
		String greet2 = greeting("Peter", "Nick");
		System.out.println(greet2);
		
		System.out.println(isStringLongerThanNumber("Hello", 3));
		
		System.out.println(doesArrayContainString(names, "Hello"));
		
		//Lab Part 3:
		
		System.out.println(getSmallestNumber(array));
		
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(calculateAverage(doubles));
		
		
		int[] nameLengths= extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
	}
	
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
		
	}

	public static String greeting(String name, String string) {
		
		return "Hi " + name + "!";
		
	} 
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return (string.length() > number) ;
	
	}
	
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		
		}
		return false;
		
	
	}	
	public static int getSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
		public static double calculateAverage(double[] array) {
			double sum = 0;
			for (double number : array) {
				sum += number;
				
			}
		 return sum / array.length;
		 
		 
	}
		public static int[] extractStringLengths(String[] strings) {
			int[] results = new int[strings.length];
			for (int i = 0; i < strings.length; i++) {
				results[i] = strings[i].length();
			}
			return results;
		}
}
	
	
return Arrays.stream(arra).sum() > 100;
	

