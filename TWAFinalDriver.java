import java.util.Scanner;

public class TWAFinalDriver {
    public static void main(String[] args) {
        TWAFinal obj=new TWAFinal(10);
        Scanner input=new Scanner(System.in);
        int ch;
		// loop through the menu of items as long as ch is not equal to 4.
		do {
			System.out.println(" ---------------------------");
			 System.out.println(" |  WESTERN TRANS AIRLINE  |");
			 System.out.println(" ---------------------------");
			 System.out.println(" |\t   MENU            |");
			 System.out.println(" --------------------------");
			 System.out.println(" | 1. |check all seats     |\n | 2. |Reserve seats       | \n | 3. |cancel reservation  | \n | 4. |Check seats status  | \n | 5. |Exit                | ");
			 System.out.println(" --------------------------");
			 System.out.println("Enter choice:(1-5): ");
			 ch = input.nextInt();
			
			 switch(ch) {
			 // using switch statement to traverse through the menu.
			 case 1:
				 System.out.println("-------check seats:------- ");
                 obj.DisplayUnrevervedSeats();
					break;
			 case 2:
				 System.out.println("--------Reserve seats:------");
				 System.out.println("Enter seat to be reserved 0-9 " );
					int s = sc.nextInt();
					(s);
					 
					 break;
			 case 3:
				System.out.println("--------Cancel reservation:----");
				System.out.print("Enter seat to be unchecked: ");
					int u = sc.nextInt();
					uncheckSeat(u);
					 
					break;
			 case 4:
				 System.out.println("---------check seat status----------");
				 seatsStatus();
				 break;
			 case 5:
				 System.out.println("---Exited--- ");
				 System.exit(0);
				
				 break;
			default:
				 System.out.println("wrong choice");
				 break;
			 }
			  }while(ch !=5); // terminate the loop when the ch is at 5		
		 }
    }
}
