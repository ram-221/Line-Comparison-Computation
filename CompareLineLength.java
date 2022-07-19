package com.linecomparisoncomputation;

public class LineComparionUC3 {

	static int x1;
	static int x2;
	static int y1;
	static int y2;
	static int a1;
	static int a2;
	static int b1;
	static int b2;
	static int length1;
	static int length2;

	void length1(int x1, int x2, int y1, int y2) {
		length1 = (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
		System.out.println("line1 "+length1);
	}

	void length2(int x1, int x2, int y1, int y2) {
		length2 = (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
		System.out.println("line2 "+length2);
	}

	void equal() {
		String str1 = String.valueOf(length1);
		String str2 = String.valueOf(length2);

		if(str1.equals(str2)) {
			System.out.println("Line1 and line2 equal");
		}
		else
		{
			System.out.println("Line1 and line2 not equal");
		}
	}

	void compare() {
		String str1 = String.valueOf(length1);
		String str2 = String.valueOf(length2);
		int var = str1.compareTo(str2);

		if(var == 0)
		{
			System.out.println("Two lines are equall");
		}

		else if(var > 0)
		{
			System.out.println("The length1 of First line is greater then second line");
		}
		else
		{
			System.out.println("The length2 of Second line is greater then First line");
		}
	}


	public static void main(String[] args) {

		LineComparionUC3 obj = new LineComparionUC3();
		obj.length1(10, 20, 30, 40);
		obj.length2(10, 60, 50, 40);
		obj.equal();
		obj.compare();
	}

}
