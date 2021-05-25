package orderdetails;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		
		int choice;
		System.out.println("What do you want to buy:\t1. Furniture\t2. Stationery");
		choice = i.nextInt();
		
		if (choice == 1) {
			Furniture f = new Furniture();
		}else if (choice == 2) {
			Base n = new Notebook();
		}
		
		System.out.println("Current Time: " + t);
		System.out.println("Current Date: " + d);

	}

}
