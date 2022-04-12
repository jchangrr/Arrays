import java.util.*;
public class Exercise4{
	public static void main(String[] args){
		// set up variables
		Scanner input = new Scanner(System.in);
		
		// ask for input and turn into array
		System.out.print("Enter list: ");
		int length = input.nextInt();
		int[] listArray = new int[length];
		for (int i = 0; i < length; i++)
			listArray[i] = input.nextInt();

		// call isSorted method and print output
		if (isSorted(listArray))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");

		input.close();

	}

	public static boolean isSorted(int[] listArray){	
		// determine if list is sorted or not	
		int min = listArray[0];
		boolean sort = true;
		for (int i = 0; i < listArray.length; i++){
			if (listArray[i] < min)
				sort = false;
		}
		return sort;
	}
}