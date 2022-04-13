# Arrays
Exercise 1: Write a computer program that reads ten integers and display them in reverse order.

Exercise 2: Write a program that reads integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
Here is a sample run of the program:
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
Output:
2 occurs 2 times, 3 occurs 1 time, 4 occurs 1 time,
5 occurs 2 times, 6 occurs 1 time, 23 occurs 1 time, 43 occurs 1 time

Exercise 4: Implement the following method that returns true if the array is already sorted in increasing order:
public static boolean isSorted(int[] list)

Write a test program that prompts the user to enter a list of int numbers and displays whether the list is sorted or not.
Here is a sample run. Note that the first number in the input indicates the number of elements in the list. This number is NOT part of the list.
e.g. Input: Enter list: 8 10 15 16 6 1 9 11 1
Output: The list is not sorted
e.g. Input: Enter list: 10 1 1 3 4 4 5 7 9 11 21
Output :The list is already sorted

Exercise 5: Create a program that generates a random 7x7 array (1-100) and has two methods:
a. void sortArrayRows(int[][] arr) method which sorts each row of the array individually, then print a well formed array
example on a 3x3 2D array:
input: 
17 7 27 
12 2 1
8 70 45
printed output: 
7 17 27 
1 2 12
8 45 70
b. void sortArray(int[][] arr) method which sorts the entire array ascending (from smallest to largest) then prints a well formed array
example on a 3x3 2D array:
input: 
17 7 27 
12 2 1
8 70 45
printed output: 
1 2 7 
8 12 17 
27 45 70
