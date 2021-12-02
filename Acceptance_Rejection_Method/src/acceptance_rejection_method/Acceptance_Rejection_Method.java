package acceptance_rejection_method;

import java.util.Scanner;

/**
 * 6
 *
 * @author Hazique
 */
public class Acceptance_Rejection_Method {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double maxValue = 2.0736;

        System.out.print("Enter how many variate you want = ");
        int variateLength = input.nextInt();

        for (int i = 1; i <= variateLength; i++) {
            double x = Math.random();
            double g_X = (60 * Math.pow(x, 3) * Math.pow((1 - x), 2)) / maxValue;
            if (x <= g_X) {
                System.out.println(x + " <= " + g_X + " --> (True)");
                System.out.println("X" + i + " = " + g_X);
            } else {
                System.out.println(x + " <= " + g_X + " --> (False)");
                do {
                    x = Math.random();
                    g_X = (60 * Math.pow(x, 3) * Math.pow((1 - x), 2)) / maxValue;
                } while (!(x <= g_X));
                System.out.println(x + " <= " + g_X + " --> (True)");
                System.out.println("X" + i + " = " + g_X);
            }
        }
    }
}
