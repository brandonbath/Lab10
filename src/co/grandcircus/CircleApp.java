package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double circRadius = 0;
		double checkRadius;
		System.out.println("Welcome to the Circle Tester.");

		
			String cont = "yes";

		

			while (cont.equals("yes")) {
			System.out.println("Enter a radius: ");
			checkRadius = scan.nextDouble();
			// double circRadius = Validator.getDouble(scan, "Enter a radius: ");
			if (checkRadius <= 0) {
				System.out.println("Number must be greater than 0");
			} else {
				circRadius = checkRadius;

			}

			Circle objectCircle = new Circle(circRadius);

			objectCircle.getCircumference();
			objectCircle.getArea();
			System.out.println("Circumference = " + objectCircle.getFormattedCircumference());
			System.out.println("Area = " + objectCircle.getFormattedArea());

			System.out.println("Do you want to continue? (yes or no)");
			cont = scan.next();

		} 
			System.out.println("Goodbye!");
			scan.close();
	}

}