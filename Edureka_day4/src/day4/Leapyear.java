package day4;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 1700;
		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " a leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " a leap year");
		} else {
			System.out.println(year+" not a leap year");
		}

	}

}
