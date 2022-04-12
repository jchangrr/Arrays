public class Exercise5{
	public static void main(String[] args){
		// create 7x7 random array
		int[][] arr = new int[7][7];
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++)
				arr[i][j] = (int)(Math.random()*100);
		}
		// print original array then call methods
		System.out.println("The original array is: ");
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
		System.out.println();
		}
		System.out.println("\nSorted Array A is: ");
		sortArrayRows(arr);
		System.out.println("\nSorted Array B is: ");
		sortArray(arr);
	}

	public static void sortArrayRows(int[][] arr){
		// sort rows
		for (int row = 0; row < arr.length; row++){
			for (int column = 0; column < arr[row].length; column++){
				int min = arr[row][column];
				int minIndex = column;

				for (int j = column + 1; j < arr[row].length; j++){
					if (min > arr[row][j]){
						min = arr[row][j];
						minIndex = j;
					}
				}

				if (minIndex != column){
					arr[row][minIndex] = arr[row][column];
					arr[row][column] = min;
				}
			}

			for (int i = 0; i < arr[row].length; i++)
				System.out.print(arr[row][i] + " ");
			System.out.println();
		}
	}

	public static void sortArray(int[][] arr){
		// sort complete array
		int[] simple = new int[49];
		int count = 0;
		for (int row = 0; row < arr.length; row++){
			for (int column = 0; column < arr[row].length; column++){
				simple[count] = arr[row][column];
				count++;
			}
		}

		for (int i = 0; i < simple.length; i++){
			int min = simple[i];
			int minIndex = i;

			for (int j = i + 1; j < simple.length; j++){
				if (min > simple[j]){
					min = simple[j];
					minIndex = j;
				}
			}
			if (minIndex != i){
				simple[minIndex] = simple[i];
				simple[i] = min;
			}
		}

		count = 0;
		for (int row = 0; row < arr.length; row++){
			for (int column = 0; column < arr[row].length; column++){
				arr[row][column] = simple[count];
				count++;
			}
		}


		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
		System.out.println();
		}
	}
}