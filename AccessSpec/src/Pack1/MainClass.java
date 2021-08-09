package Pack1;
import java.util.Scanner;

import Pack2.ClassC;
import Pack2.ClassD;

public class MainClass {
	public static void main(String[] args) {
		
		//Super class object
		ClassA.demo();
		ClassA a = new ClassA();
		a.demo();
		a.test();
		a.testdemo();
		
		//Sub class objet
		ClassB.demo();
		ClassB b = new ClassB();
		b.demo();
		b.test();
		b.xyz();
		b.testdemo();
		
		// Up Casting 
		ClassA c = new ClassB();
		c.demo();
		c.test();
		c.testdemo();
		//c.xyz();
	}
	
	
	
	// to take data from cosole 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter msg");
	String ja =  sc.nextLine();
	System.out.println(ja);
	//-----------------------------------///
}
