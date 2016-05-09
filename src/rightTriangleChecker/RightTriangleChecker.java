//Author:Danielle Hall
//This program determines whether or not a triangle is a right triangle based
//on user input
//Date: 5/7/16

package rightTriangleChecker;

import java.util.Scanner;

public class RightTriangleChecker {

	public static void main(String[] args) {
		String choice = "y";
		double sideA;
		double sideB;
		double sideC;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Right Triangle Checker App! This app"
				+ " will verify whether or not a triangle is a right triangle  \nbased"
				+ " on the data that you input. Let's get started!\n");
		while (choice.equalsIgnoreCase("y")) {
			// user inputs the side values
			System.out.print("Enter side 1 (1-100:) ");
			sideA = Validator.getValidDouble(1, 100);

			System.out.print("Enter side 2 (1-100): ");
			sideB = Validator.getValidDouble(1, 100);

			System.out.print("Enter side 3 (1-100): ");
			sideC = Validator.getValidDouble(1, 100);
			// call method for pythagorean theorem formula
			pythagorean(sideA, sideB, sideC);
			
			choice = Validator.getString("\nWould you like to enter another triangle? (y/n):");
		}
		System.out.println("Good-bye");
	}

	static void pythagorean(double sideA, double sideB, double sideC) {
		boolean isRightTriangle;
		double longestSide;
		double secondarySide;
		double secondarySide2;

		double calculations;

		longestSide = Math.max(sideA, Math.max(sideB, sideC));

		if ((sideA == longestSide && (sideB == longestSide || sideC == longestSide))
				|| (sideB == longestSide && (sideA == longestSide || sideC == longestSide))
				|| (sideC == longestSide && (sideA == longestSide || sideB == longestSide))) {
			
			isRightTriangle = false;
		}

		// designate all sides to A,B, and C based on length
		if (longestSide == sideA) {
			secondarySide = sideB;
			secondarySide2 = sideC;
		} else if (longestSide == sideB) {
			secondarySide = sideA;
			secondarySide2 = sideC;
		} else {
			secondarySide = sideA;
			secondarySide2 = sideB;
		}

		// Square the secondary sides and add them together
		calculations = Math.pow(secondarySide, 2) + Math.pow(secondarySide2, 2);
		if (calculations == Math.pow(longestSide, 2)) {
			isRightTriangle = true;
			System.out.println("Yes! This is a right triangle!");
		} else
			System.out.println("No! This is not a right triangle!");

	}

}