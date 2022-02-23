public class Keep {
    System.out.println("Do you want to cancel the seat you chose? type yes or no");
        try (Scanner input2 = new Scanner(System.in)) {
            
            if (seats[i]==false) {
                seats[i] = false;
                System.out.println("\n"+"THIS ARE UNOCCUPIED SEATS ON THE PLANE:");
                for (i = 0; i < max; i++) {

                    if (seats[i] == false) {
                        System.out.println(i + " unoccupied seat");
                    }
                }
            }
        }
}
