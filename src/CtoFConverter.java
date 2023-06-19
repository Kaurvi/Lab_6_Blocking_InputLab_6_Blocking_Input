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
            if (in.hasNextDouble())
            {
                tempC = in.nextDouble();
                tempF = ((tempC*9/5)+32);
                System.out.println("The temp in farenhiet  " + tempF);
                if(tempF == 32.0) {
                    System.out.println("The temperature you've entered is " + tempF + " which is a freezing point!");
                } else if (tempF == 212.0) {
                    System.out.println("The temperature you've entered is " + tempF + " which is a boiling point!");
                }
            } else {
                trash = in.next();
                System.out.println("You must enter a valid temp not: " + trash + "\n");
                done = true;
            }
        }
        while (!done);
    }
}
