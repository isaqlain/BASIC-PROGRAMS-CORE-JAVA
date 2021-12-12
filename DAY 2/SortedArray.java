package P2;

import java.util.*;

public class SortedArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you wants to enter ");
		int size = scanner.nextInt();

		int[] a = new int[size]; // Creating fixed size array

		System.out.println("Enter all the elements:");

		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		SortedArray.sortArray(a);  

		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}

	}

	public static int[] sortArray(int[] a) {

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a;
	}
}
