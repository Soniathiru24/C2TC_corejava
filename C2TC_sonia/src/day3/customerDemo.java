package day3;

public class customerDemo {
	public static void main(String[]args) {
		customer c1=new customer();
    	c1.setCid(12);
		c1.setCname("soni");
		c1.setCity("chennai");
		
	    System.out.println(c1);
//		System.out.println("name of the customer is " + c1.getCname());
//	    System.out.println("ID of the customer is " + c1.getCid());
//    	System.out.println("name of the customer is "+ c1.getCity());//
//	
		customer c2=new customer();
		c2.setCid(12);
		c2.setCname("sumi");
		c2.setCity("pondy");		
    	System.out.println(c2);
		System.out.println("customer 1 city:"+c1.getCity() + "customer 2 city:" + c2.getCity());
//		System.out.println("name of the customer is " + c2.getCname());
//		System.out.println("ID of the customer is " + c2.getCid());
//		System.out.println("name of the customer is "+ c2.getCity());
//	
}

}
