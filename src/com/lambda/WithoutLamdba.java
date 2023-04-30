package com.lambda;
//functionl
interface Prints{
	//without return wit==hout args
	void printing();
	
}
public class WithoutLamdba implements Prints {

	@Override
	public void printing() {

		System.out.println("printing calle....");
		
	}
	
	
	public static void main(String[] args) {
		
		Prints p = new WithoutLamdba();
		p.printing();
				
	}

}
