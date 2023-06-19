import java.util.Scanner;

public class CtoFConverter
{
    private static boolean done;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0.0;
        double tempF = 0.0;
        String trash = "";
        done = false;
        do
        {
            System.out.print("Enter temp in celsius: ");
            if (in.hasNextInt())
            {
                tempC = in.nextDouble();
                tempF = ((9/5*tempC)+32);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid temp not: " + trash + "\n");
            }

        }
        while (tempF == 0);
        System.out.println("The temp in farenhiet  " + tempF);
    }
}