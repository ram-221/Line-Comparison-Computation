package com.linecomparisoncomputation;

public class LineComaparison {

	void line(double x1, double x2, double y1, double y2) {
		double value = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(value);
	}

	public static void main(String[] args) {

		LineComaparison obj = new LineComaparison();
		obj.line(5, 10, 5, 0);

	}

}
