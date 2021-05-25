package orderdetails;
import java.util.Scanner;

public class Furniture extends Base implements Quality{

	Scanner input = new Scanner(System.in);
	
	int chairPrice;
	int deskPrice;
	int chairQuantity;
	int deskQuantity;
	String chairDimensions;
	String deskDimensions;
	double salesTax;
	String chairType;
	String deskType;
	int totalPrice;
	double furniturePrice = chairPrice + deskPrice + salesTax;
	
	public Furniture() {
		super();
		selection();
		setDimensions();
		Type();
		salesTax();
		printing();
	}
	
	
	
	//----------------------------------------Methods------------------------------------
	@Override
	public void selection() {
		System.out.println("Enter number of Chairs: " );
		chairQuantity = input.nextInt();
		chairPrice = 1000 * chairQuantity;
		System.out.println("Enter number of Desks: ");
		deskQuantity = input.nextInt();
		deskPrice = 1500 * deskQuantity;
		totalPrice = chairPrice + deskPrice;
	}
	
	public void setDimensions() {
		input.nextLine();
		System.out.println("Enter Chair Dimensions: (Height * Width)\t");
		chairDimensions = input.nextLine();
		System.out.println("Enter Desk Dimensions: (Height * Width)\t");
		deskDimensions = input.nextLine();
	
	}
	
	public void salesTax() {
		salesTax = totalPrice*0.17;
		furniturePrice = chairPrice + deskPrice + salesTax;
	}
	
	int choice;
	public void Type() {
		System.out.println("Enter Chair Type: 1. Iron\t2.Wood");
		choice = input.nextInt();
		if (choice == 1) {
			chairType = "Iron";
		}else if (choice == 2) {
			chairType = "Wood";
		}
		System.out.println("Enter Chair Type: 1. Iron\t2.Wood\t3. Plastic");
		choice = input.nextInt();
		if (choice == 1) {
			deskType = "Iron";
		}else if (choice == 2) {
			deskType = "Wood";
		}else if (choice == 3) {
			deskType = "Plastic";
		}
	}
		//--------------------------------------Printing-------------------------
		public void printing() {
			System.out.println("Supplier Name: " + super.supplierName);
			System.out.println("Customer Name: " + super.customerName);
			System.out.println("Chair Quantity: " + chairQuantity + "\nDesk Quantity: " + deskQuantity);
			System.out.println("Chair Quality: " + chairType + "\nDesk Quality: " + deskType);
			System.out.println("Chair Price: " + chairPrice + "\nDesk Price: " + deskPrice + "\nSales Tax: " + salesTax );
			System.out.println("Total Furniture Price: " + furniturePrice);
		
		}
		
	
	
	
	
	
	
}
