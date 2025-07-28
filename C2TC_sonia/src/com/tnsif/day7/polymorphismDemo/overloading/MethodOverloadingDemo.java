package com.tnsif.day7.polymorphismDemo.overloading;

public class MethodOverloadingDemo {
public static void main(String[]args) {
	Addition a = new Addition ();
	a.add();
	System.out.println(a.add(3));
	System.out.println(a.add(3,7));
	System.out.println(a.add(3.5));
	
	a.show(101,"shakthi");
	a.show("shakthi",101);
	
}
}
