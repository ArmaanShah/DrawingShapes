
/*
 * DrawingShapes.java
 * Author:  Armaan Shah
 * Submission Date: October 31st 2024
 *
 *This program does the following:
 *The following code takes an input of a character from the user and 
 *follows the code to draw the corresponding shape with *. After entering the 
 *character the user wants the program will prompt the user with more information such as
 *length or height and ensure that all values are valid. 
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
import java.util.Scanner;

public class DrawingShapes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Prompt user for the shape
		System.out.println("Enter a shape: r t h o p ");
		String UserShape = scanner.nextLine();

		// Check for invalid shape input
		if (!(UserShape.equals("r") || UserShape.equals("t") || UserShape.equals("h") || UserShape.equals("o")
				|| UserShape.equals("p"))) {
			System.out.println("Invalid shape\nGoodbye!");
			scanner.close();
			System.exit(0);
		}

		// If user inputs r for rectangle
		if (UserShape.equals("r")) {
			// Prompt for length
			System.out.println("Enter a length: ");
			int RectLength = scanner.nextInt();

			// Ensures Rectlength is valid
			if (RectLength <= 1) {
				System.out.println("Length must be greater than 1\nGoodbye!");
				scanner.close();
				System.exit(0);
			}
			// Prompt for height
			System.out.println("Enter a height: ");
			int RectHeight = scanner.nextInt();

			// Ensures RectHeight is valid
			if (RectHeight <= 1) {
				System.out.println("Height must be greater than 1\nGoodbye!");
				scanner.close();
				System.exit(0);
			}

			// Draws the rectangle
			System.out.println("Below is a " + RectLength + " by " + RectHeight + " rectangle of *");
			for (int i = 0; i < RectHeight; i++) {
				for (int j = 0; j < RectLength; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		// If user inputs t for triangle
		else if (UserShape.equals("t")) {
			// Prompt for length
			System.out.println("Enter a length: ");
			int TriLength = scanner.nextInt();

			// Ensures TriLength is valid
			if (TriLength <= 1) {
				System.out.println("Length must be greater than 1\nGoodbye!");
				scanner.close();
				System.exit(0);
			}

			// Draws the triangle
			System.out.println("Below is a triangle with two side lengths of " + TriLength + " *");
			for (int i = 1; i <= TriLength; i++) {
				for (int j = 0; j < TriLength - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < (2 * i - 1); k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		// If user inputs h for hexagon
		else if (UserShape.equals("h")) {
			// Prompt for length
			System.out.println("Enter a length: ");
			int HexLength = scanner.nextInt();

			// Ensures HexLength is valid
			if (HexLength <= 1) {
				System.out.println("Length must be greater than 1\nGoodbye!");
				scanner.close();
				System.exit(0);
			}

			// Draws the hexagon (broken up into top half and bottom half)
			System.out.println("Below is a hexagon with side lengths of " + HexLength + " *");

			// Top half of the hexagon
			for (int i = 0; i < HexLength; i++) {
				for (int j = 0; j < HexLength - i - 1; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < HexLength + 2 * i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

			// Bottom half of the hexagon
			for (int i = HexLength - 2; i >= 0; i--) {
				for (int j = 0; j < HexLength - i-1; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < HexLength + 2 * i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		// If user inputs o for octagon
		if (UserShape.equals("o")) {
			// Prompt for length
			System.out.println("Enter a length: ");
			int OctLength = scanner.nextInt();

			// Ensures OctLength is valid
			if (OctLength <= 1) {
				System.out.println("Length must be greater than 1\nGoodbye!");
				scanner.close();
				System.exit(0);
			}

			// Draws the octagon (broken up into top, middle, and bottom)
			System.out.println("Below is an octagon with side lengths of " + OctLength + " *");

			// Top part of the octagon
			for (int i = 0; i < OctLength - 1; i++) {
				// Print leading spaces
				for (int j = 0; j < OctLength - i - 1; j++) {
					System.out.print(" ");
				}
				// Print stars
				for (int j = 0; j < OctLength + 2 * i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			// Middle part of the octagon
			for (int i = 0; i < OctLength; i++) {
				// Print stars for the widest row
				for (int j = 0; j < 3 * OctLength - 2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			// Bottom part of the octagon
			for (int i = OctLength - 2; i >= 0; i--) {
				// Print leading spaces
				for (int j = 0; j < OctLength - i - 1; j++) {
					System.out.print(" ");
				}
				// Print stars
				for (int j = 0; j < OctLength + 2 * i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		// If user inputs p for pentagon
		if (UserShape.equals("p")) {
			// Prompt for length
			System.out.println("Enter a length: ");
			int PentLength = scanner.nextInt();

			// Ensures PentLength is valid
			if (PentLength <= 1) {
				System.out.println("Length must be greater than 1\nGoodbye!");
				scanner.close();
				System.exit(0);
			}

			// Draws the pentagon
			System.out.println("Below is a pentagon with 4 side lengths of " + PentLength + " *");

			// Top triangle part of the pentagon
			for (int i = 0; i < PentLength; i++) {
				// Print leading spaces
				for (int j = 0; j < PentLength - i - 1; j++) {
					System.out.print(" ");
				}
				// Print stars
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			// Bottom rectangle part of the pentagon
			for (int i = 0; i < PentLength - 1; i++) {
				for (int j = 0; j < 2 * PentLength - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}// main method

}// class
