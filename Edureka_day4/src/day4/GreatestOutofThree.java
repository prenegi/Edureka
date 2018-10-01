package day4;

public class GreatestOutofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 34, num2 = 2, num3 = -90;

		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 is greatest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 is greatest");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println("num3 is greatest");
		}
	}

}
