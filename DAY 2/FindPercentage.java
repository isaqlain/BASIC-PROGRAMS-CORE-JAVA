/*
 * FindPercentage
*
 * Version info
 *
 * Copyright notice
 */

package P2;

import java.util.*;

public class FindPercentage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter the obtained Marks ");
		int obtainedmarks = scanner.nextInt();

		System.out.println("Please Enter the Total Marks ");
		int totalmarks = scanner.nextInt();

		float p = findPercentage(obtainedmarks, totalmarks);
		System.out.println("The percentage is " + String.format("%.2f",p));

	}

	public static float findPercentage(int obtainedmarks, int totalmarks) {

		float p = (float)(obtainedmarks * 100 / totalmarks);

		return p;

	}

}

