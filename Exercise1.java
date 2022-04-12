import java.util.*;
public class Exercise1{
	public static void main(String[] args){
		// set up variables
		Scanner input = new Scanner(System.in);
		int[] intList = new int[10];

		// ask for input integers
		System.out.print("Please enter 10 integers: ");
		for (int i = 0; i < 10; i++){
			int integer = input.nextInt();
			intList[i] = integer;
		}

		// display original order
		System.out.println("The original order is: ");
		for (int i = 0; i < intList.length; i++){
			System.out.print(intList[i] + " ");
		}

		// reverse order and display
		System.out.println("\nThe reverse order is: ");
		for (int i = 0; i < intList.length; i++){
			System.out.print(intList[intList.length-1-i] + " ");
		}
		
		System.out.println();
		input.close();
	}
}