import java.util.ArrayList;
import java.util.Scanner;
public class main
{
	public static void promt_key()
	{
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
	 
	 static void print_tables()
     {
		 System.out.println("1 extra-large table with max capacity of 12 people.");
		 System.out.println("3 large tables with max capacity of 6 people.");
		 System.out.println("8 medium tables with max capacity of 4 people.");
		 System.out.println("4 small tables with max capacity of 2 people.");
		 //promt_key();
     }
	 
	public static void main(String[] args)
	{
		System.out.println("\t\t\t\t\t\t Hotel Reservation System");
		//print_tables();
		ArrayList<Boolean> extra_large_table = new ArrayList<>();
		ArrayList<Boolean> large_table = new ArrayList<>();
		ArrayList<Boolean> mediun_table = new ArrayList<>();
		ArrayList<Boolean> small_table = new ArrayList<>();
		//extra_large_table.add(true);
		for(int i=0;i<12;i++)
		{
			extra_large_table.add(true);
		}
		for(int i=0;i<18;i++)
		{
			large_table.add(true);
		}
		for(int i=0;i<32;i++)
		{
			mediun_table.add(true);
		}
		for(int i=0;i<8;i++)
		{
			small_table.add(true);
		}
		int choice = 1;
		while(choice!=-1)
		{
			System.out.println("Press 1 to view All seating plan");
            System.out.println("Press 2 to view Remaining Tables");
            System.out.println("Press 3 to book a table");
            System.out.println("Press 4 to print Challan");
            System.out.println("Press -1 Terminate program");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Whats your choice ? ");
            choice = scanner.nextInt();
            
            switch (choice) {
			case 1:
				print_tables();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case -1:
				break;
			default:
				break;
			}
		}
		
		
		
		
		
		
	}
}