import java.util.*;

public class TWA1 {
    public static boolean filledSeats(char[][] plane) {
        for (int i = 0; i < plane.length; i++) {
            for (int j = 0; j < plane[0].length; j++) {
                if (plane[i][j] != 'X')
                    return false;
            }
        }
        return true;
    }

    public static int findRowSeat(String numSeat) {
        char rowChar = numSeat.charAt(0);
        return (int) rowChar - 48 - 1;
    }

    public static int findColumnSeat(String numSeat) {
        char colChar = numSeat.charAt(1);
        if (colChar == 'A')
            return 0;
        else if (colChar == 'B')
            return 1;
        else if (colChar == 'C')
            return 2;
        else if (colChar == 'D')
            return 3;
        else
            return -1;

    }

    public static void displaySeats(char[][] plane) {
        for (int i = 0; i < plane.length; i++) {

            System.out.print((i + 1) + " ");
            for (int j = 0; j < plane[0].length; j++) {
                System.out.print(plane[i][j] + " ");

                if (j == 1)
                    System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        char[][] plane = { { 'A', 'B', 'C', 'D' },
                { 'A', 'B', 'C', 'D' },
                { 'A', 'B', 'C', 'D' },
                { 'A', 'B', 'C', 'D' },
                { 'A', 'B', 'C', 'D' },
                { 'A', 'B', 'C', 'D' },
                { 'A', 'B', 'C', 'D' }, };
        Scanner input = new Scanner(System.in);
        String decision = "y";
        while (decision.equals("y") || decision.equals("Y") && !filledSeats(plane)) {

            displaySeats(plane);
            System.out.print("Enter a seat(For example 1A, 2B, or 4C): ");

            boolean okSeat = false;
            while (okSeat == false) {
                String seat = input.nextLine();
                int r = findRowSeat(seat);
                int c = findColumnSeat(seat);

                if (plane[r][c] == 'X')
                    System.out.print("Sorry, seat is occupied, enter a different seat:");
                else {
                    plane[r][c] = 'X';
                    okSeat = true;
                }
            }
            System.out.print("Still Continue ? (y/n)");
            decision = input.nextLine();
        }

        System.out.println("Plane seating chart:");
        displaySeats(plane);
    }
}