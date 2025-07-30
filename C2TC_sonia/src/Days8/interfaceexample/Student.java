package Days8.interfaceexample;

public class Student implements coder{
	@Override
	public void rules() {
		System.out.println("Morning wakeup at "+wakeupTime);
		System.out.println("And do the program practice");
	}
}