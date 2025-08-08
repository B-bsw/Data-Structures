package lab5;

import java.util.Scanner;

public class TestDlink {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		int i;
		DoubleLinked link = new DoubleLinked();
		
		while(true) {
			System.out.println("Menu");
			System.out.println("1 :Insert data");
			System.out.println("2 :Delete data");
			System.out.println("3 :Search data");
			System.out.println("4 :Exit Program");
			System.out.print("Input your choice: ");
			select = sc.nextInt();
			
			switch(select) {
				case 1:
					System.out.print("Input data :");
					i = sc.nextInt();
					link.insertDlink(i);
					System.out.println("Data in linklist :");
					link.printDlink();
					System.out.println();
					break;
				case 2:
					System.out.print("Input data :");
					i = sc.nextInt();
					link.deleteDlink(i);
					System.out.println("Data in linklist :");
					link.printDlink();
					System.out.println();
					break;
				case 3:
					System.out.print("Search data :");
					i = sc.nextInt();
					link.searchData(i);
					if(link.searchData(i)) {
						System.out.println("Found data");
					}else {
						System.out.println("Not found data");
					}
					System.out.println();
					break;
				case 4:
					System.out.println("Data in linklist :");
					link.printDlink();
					System.out.println("Thank you!!!");
					break;
				default:
			}
			if(select == 4) {
				break;
			}
		}
	}

}
