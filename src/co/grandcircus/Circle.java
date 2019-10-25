package co.grandcircus;

public class Circle {
	// Instance variables
	double radi;
	double circCircumf;
	double circArea;
	double pie = Math.PI;
	// and here...

	// use name of class
	public Circle(double radius) {
		radi = radius;
		/*
		 * if (this.radius <= 0) { System.out.println("Number must be greater than 0");
		 * } else { this.radius = radius; }
		 */

	}

	public double getCircumference() {
		circCircumf = (2 * pie * radi);
		return circCircumf;

	}

	public double getArea() {
		circArea = pie * (radi * radi);
		return circArea;
	}

	private static String formatNumber(double x) {
		return String.format("%.2f", x);
	}

	public String getFormattedCircumference() {
		return formatNumber(circCircumf);
	}

	public String getFormattedArea() {
		return formatNumber(circArea);
	}
}
