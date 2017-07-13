import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int loopChk = 0;

        do
        {
            double length, width, perimeter, area;

            String cont;

            System.out.print("Perimeter & Area Calculator\nThis program will calculate the perimeter and area of a room.\n");

            System.out.print("Please enter the length of the room: ");

            length = scnr.nextInt();
            scnr.nextLine();

            System.out.print("Please enter the width of the room: ");

            width = scnr.nextInt();
            scnr.nextLine();

            perimeter = 2 * (length + width);
            area = length * width;

            System.out.printf("Area: %s\n", area);
            System.out.printf("Perimeter: %s\n", perimeter);

            System.out.println("Calculate for another room? (Enter Y or N): ");

            cont = scnr.nextLine();
            cont = cont.toLowerCase();

            if(cont.equals ("n"))
            {
                loopChk = 1;
            }

        }while (loopChk == 0);

        System.out.println("Thank you for using our software!\nGoodbye.\nEnd of line. -MCP");
    }
}