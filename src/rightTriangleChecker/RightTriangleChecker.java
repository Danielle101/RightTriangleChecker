package rightTriangleChecker;
import java.util.Scanner;
public class RightTriangleChecker {

	
		    public static void main(String[] args) {
		    	// Declare variables
		    	double side1, side2, side3;
		    	Scanner kbReader = new Scanner(System.in);

				// Query values from the user
				System.out.print("Enter one side: ");
				side1 = kbReader.nextDouble();

				System.out.print("Enter another side: ");
				side2 = kbReader.nextDouble();

				System.out.print("Enter one last side: ");
				side3 = kbReader.nextDouble();

				pythagorean(side1, side2, side3);
		    }
		    static void pythagorean(double side1, double side2, double side3) {
		    	// This gets the largest number and does the pythagorean theorem.
		    	// Set our variables
		    	boolean isRightTriangle;
		    	double largestSide, secondarySide, secondarySide2, cSquared, mathResults;

		    	// Do some calculations!
		    	largestSide = Math.max(side1, Math.max(side2, side3));
		    	cSquared = Math.pow(largestSide, 2);

				if ((side1 == largestSide && (side2 == largestSide || side3 == largestSide))
					|| (side2 == largestSide && (side1  == largestSide || side3 == largestSide)) ||
						(side3 == largestSide && (side1 == largestSide || side2 == largestSide))) {
					// More than one side is the largest! It's safe to assume this isn't a right triangle.
					isRightTriangle = false;
				}
				
				// Run the numbers through some checks.
				if (largestSide == side1) {
					secondarySide = side2;
					secondarySide2 = side3;
				}
				else if(largestSide == side2){
					secondarySide = side1;
					secondarySide2 = side3;
				}
				else{
					secondarySide = side1;
					secondarySide2 = side2;
				}

				// Square the two small sides and add them together.
				mathResults = Math.pow(secondarySide, 2) + Math.pow(secondarySide2, 2);
				if (mathResults == Math.pow(largestSide, 2)) // Is the largest side (squared) equal to our equation above?
					isRightTriangle = true;
				System.out.println("Yes! This is a right triangle!");
				else
					isRightTriangle = false;

				System.out.println("No! This is not a right triangle!");
		    }
		}