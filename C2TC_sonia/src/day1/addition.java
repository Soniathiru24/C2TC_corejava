package day1;
import java.util.Scanner;
public class addition {
	public static void main(String[]args) {
		int a;
		int b;
		int c;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the values:");
		a = scan.nextInt();
		b = scan.nextInt();
		c= a+b;
		System.out.println(c);
	}

}
