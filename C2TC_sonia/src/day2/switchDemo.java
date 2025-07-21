package day2;

public class switchDemo {
	public static void main(String[] args) {

		char x = 's';
		switch (x) 
		{
		case 'l' : 
		case 'L' : 
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D' :
			System.out.println(x+" is a Digit");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is Special Symbol");
		default:
			System.out.println(x+" is other than letter, digit, space or special symbol ");
			break;
		}
	
	}

}
