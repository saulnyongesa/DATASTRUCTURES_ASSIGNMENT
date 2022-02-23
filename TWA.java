import java.util.Scanner;

class TWA {
    private boolean seats[];
    int size;

    public TWA(int number) {
        size = number;
        seats = new boolean[size];
    }

    Scanner input = new Scanner(System.in);
    // let false== unoccupied and true == occupied

    public void unoccupiedSeats() {

        int i;
        int max = size;
        // displaying the total seats in the plane
        System.out.println("THIS ARE UNOCCUPIED SEATS ON THE PLANE:");
        for (i = 0; i < max; i++) {

            if (seats[i] == false) {
                System.out.println(i + " seat not reserved");
            }
        }
        // end displaying seats in the plane

        // reserving a seat
        System.out.println("\n" + "choose a seat to reserve eg 0 to 9:");

        i = input.nextInt();
        if (seats[i] == false) {
            seats[i] = true;
            System.out.println("you have reserved a seat number " + i + "\n");

        }
        // end of reserving a seat

        // displaying the remaining seats after one is assigned to the passenger
        System.out.println("Remaining unreserved seats are:" + "\n");

        for (i = 0; i < max; i++) {

            if (seats[i] == false) {
                System.out.println(i + " seat not reserved");
            }
        }
        // end of displaying

    }

    public void cancelSeat() {
        // cancellation of resevede seat

        System.out.println("Do you want to cancel the seat you chose? type number of seat you reserved eg 0..9:");
        int c = input.nextInt();
        if (seats[c] == true) {
            seats[c] = false;
            System.out.println("you have cancelled  seat number " + c + " you reserved \n");

        }
        else{
            System.out.println("sorry you didnt reserve that seat");
        }
        // end of cancellation

    }

    public static void main(String[] args) {
        TWA b = new TWA(10);
        b.unoccupiedSeats();
        b.cancelSeat();

    }
}