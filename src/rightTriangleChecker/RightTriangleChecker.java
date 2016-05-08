package rightTriangleChecker;
import java.util.Scanner;
public class RightTriangleChecker {

	
		    public static void main(String[] args) {
		    	String choice = "y";
		    	double sideA; 
		    	double sideB; 
		    	double sideC;
		    	Scanner scan = new Scanner(System.in);
while (choice.equalsIgnoreCase("y") ){
				// user inputs the side values
				System.out.print("Enter side 1: ");
				sideA = scan.nextDouble();

				System.out.print("Enter side 2: ");
				sideB = scan.nextDouble();

				System.out.print("Enter side 3: ");
				sideC = scan.nextDouble();
				//call method for pythagorean theorem formula
				pythagorean(sideA, sideB, sideC);
				System.out.println("Would you like to enter another triangle? (y/n):");
				choice=scan.nextLine();
}
		    }
		    static void pythagorean(double sideA, double sideB, double sideC) {
		    	boolean isRightTriangle;
		    	double longestSide; 
		    	double secondarySide; 
		    	double secondarySide2; 
		    	
		    	double calculations;

		 
		    	longestSide = Math.max(sideA, Math.max(sideB, sideC));
		    	

				if ((sideA == longestSide && (sideB == longestSide || sideC == longestSide))
					|| (sideB == longestSide && (sideA  == longestSide || sideC == longestSide)) ||
						(sideC == longestSide && (sideA == longestSide || sideB == longestSide))) {
					// More than one side is the largest! It's safe to assume this isn't a right triangle.
					isRightTriangle = false;
				}
				
				//designate all sides to A,B, and C based on length
				if (longestSide == sideA) {
					secondarySide = sideB;
					secondarySide2 = sideC;
				}
				else if(longestSide == sideB){
					secondarySide = sideA;
					secondarySide2 = sideC;
				}
				else{
					secondarySide = sideA;
					secondarySide2 = sideB;
				}

				// Square the two small sides and add them together.
				calculations = Math.pow(secondarySide, 2) + Math.pow(secondarySide2, 2);
				if (calculations == Math.pow(longestSide, 2)){ 
					isRightTriangle = true;
				System.out.println("Yes! This is a right triangle!");}
				else
				System.out.println("No! This is not a right triangle!");
				
		    }
	
		}