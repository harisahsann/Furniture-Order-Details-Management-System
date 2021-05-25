package orderdetails;
import java.util.Scanner;

public abstract class Base {
	String supplierName;
	String customerName;
	

	
	//---------------CONSTRUCTOR------------------------------
	public Base() {
		supplierName = "Ali Express China";
		customerName = "Ali";
		
	}
	Scanner input = new Scanner(System.in);
	
	//-----------------------------------SETTERS & GETTERS---------------

	
	
	//---------------------------METHODS-------------------------
	
	public abstract void Type();	
	public abstract void selection();
	public abstract void printing();
	
	
	
	
	
	
	
	
	
	
}