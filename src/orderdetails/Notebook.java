package orderdetails;

public class Notebook extends Base{

	public Notebook() {
		super();
		selection();
		Type();
		printing();
		
	}
	
	String type;
	int quantity;
	int totalPrice;
	
	
	
	
	//----------------Methods-------------------
	int choice;
	public void Type() {
		System.out.println("Enter Note Type: 1. Lab/Scientific \t2. Spiral");
		choice = input.nextInt();
		if (choice == 1) {
			type = "Lab/Scientific";
		}else if (choice == 2) {
			type = "Spiral";
		}
	}
	
	public void selection() {
		System.out.println("Enter number of Notebooks: " );
		quantity = input.nextInt();
		totalPrice = 100 * quantity;
	}
	
	public void printing() {
		System.out.println("Supplier Name: " + super.supplierName);
		System.out.println("Customer Name: " + super.customerName);
		System.out.println("Notebook Quantity: " + quantity);
		System.out.println("Notebook Quality: " + type);
		System.out.println("Total Stationery Price: " + totalPrice);
	
	}
	
	
	
	
}

