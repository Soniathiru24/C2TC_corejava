package day2;

public class decisionMakingWithOperator {
	public static void main(String[] args) {
		int x = 10, y = 7;
		int a = 12;
		int b = 10;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}
}
