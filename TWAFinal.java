import java.util.Scanner;

public class TWAFinal {
    Scanner input = new Scanner(System.in);
    private boolean seats[];
    int size;

    public TWAFinal(int number) {
        size = number;
        seats = new boolean[size];
    }

    // false=unreserved
    // true= reserved
    public void DisplayUnrevervedSeats() {
        int i;
        int max = size;
        System.out.println("UNRESERVED SEATS IN THE PLANE:");
        for (i = 0; i < max; i++) {

            if (seats[i] == false) {
                System.out.println("seat " + i + " unreserved");
            }
        }
    }

    public int reserveSeat() {

        int r = input.nextInt();
        if (r > 9) {
            System.out.println("Bad choice try again: ");
        } else if (seats[r] == false) {
            seats[r] = true;
            System.out.println("you have reserved a seat number " + r + "\n");

        } else if (seats[r] == true) {
            System.out.println("seat " + r + " is alredy reserved");
        }
        return r;

    }

    public int DisplayResevervedSeats() {
        int i;
        int max = size;
        System.out.println("RESERVED SEATS IN THE PLANE: \n");
        for (i = 0; i < max; i++) {

            if (seats[i] == true) {
                System.out.println("seat " + i + " reserved");
            }
        }
        return max;

    }

    public int cancelSeat() {
        int c = input.nextInt();
        if (c > 9) {
            System.out.println("bad choice try again ");
        } else if (seats[c] == true) {
            seats[c] = false;
            System.out.println("you have cancelled  seat number " + c + " you reserved \n");

        } else if (seats[c] == false) {
            System.out.println("the seat was not reserved");
            System.out.println("try again");
        }
        return c;
    }

    public int exitCode() {
        int e;
        int g = 1;
        e = input.nextInt();
        if (e == g) {
            System.out.println("exit..");
            System.exit(0);
        }
        return g;
    }

}
