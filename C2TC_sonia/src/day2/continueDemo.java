package day2;

public class continueDemo {
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue; // exit loop when i is 5
            }
            System.out.println(i);
        }
    }
}
