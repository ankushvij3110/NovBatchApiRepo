package NovApiBatch.NovApi;

public class Ankush {//this concept was used for clarifying a doubt
	
	public Ankush abc() {
		
		//return new Ankush();
		//or can also be written as follows:
		Ankush ank = new Ankush();
		return ank;
		
		//so the method can also return the object of its class
		//Q. Can a method return an object of a parent class of the class its currently in? Answer. is in the Vij.java class and yes it can
	}
	
	public int abc1(int a) {
		
     //int a;
	
	   return a;
		
	}
	
	public static void main(String[] args) {
		
		Ankush anks=new Ankush();
		Ankush b=anks.abc();
		System.out.println(b);
	}

}
