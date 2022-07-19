package com.linecomparisoncomputation;

public class LineComparisonUC2 {

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

	void length1 (int x1, int x2, int y1, int y2) {
		length1 = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));  
		System.out.println("lenth1 "+length1);
	}

	void length2 (int a1, int a2, int b1, int b2) {
		length2 = (int) Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
	}

	void equal () {
		String str1 = String.valueOf(length1);
		String str2 = String.valueOf(length2);

		if (str1.equals(str2)) {
			System.out.println("Line1 and line2 are equal");
		}
		else
		{
			System.out.println("line1 and line2 not equal");
		}
	}


	public static void main(String[] args) {
		LineComparisonUC2 Object = new LineComparisonUC2();
		Object.length1(10,20,30,40);
		Object.length2(10,20,30,40);
		Object.equal();

	}
}

