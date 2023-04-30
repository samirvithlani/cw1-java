package com.lambda;

//annon function

interface Calls{
	
	void calling();
}
interface Message{
	
	String messaging(String x);
}
public class LamdaDemo1 {

	public static void main(String[] args) {
		
		
//		Calls c = ()->{
//			System.out.println("calling body....");
//		};
//		c.calling();
		
		Message m = (String txt)->{
			System.out.println(txt);
			return "hello";
		};
		System.out.println(m.messaging("ryl"));
		
		
	}
}
