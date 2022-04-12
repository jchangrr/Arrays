import java.util.*;
public class Exercise2{
	public static void main(String[] args){
		// set up variables
		Scanner input = new Scanner(System.in);
		int inputInt = 0;
		int j = 0;
		int[] arrayList = new int[5];
		
		// ask for integers between 1 and 100
		System.out.print("Enter the integers between 1 and 100: ");
		do{
			inputInt = input.nextInt();
			// adjust array size based on number of inputs
			if (j > arrayList.length-1){
				int[] temp = new int[arrayList.length * 2];
				for (int i = 0; i < arrayList.length; i++)
					temp[i] = arrayList[i];
				arrayList = temp;
			}
			arrayList[j] = inputInt;
			j++;
		} while (inputInt != 0);

		// count how many times each number occurs
		for (int key = 1; key < 101; key++){
			int count = 0;
			for (int i = 0; i < arrayList.length; i++){
				if (key == arrayList[i])
					count++;
			}
			if (count != 0)
				System.out.print(key + " occurs " + count + " times, ");
		}
	}
}