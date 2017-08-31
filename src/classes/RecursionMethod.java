
package classes;

import java.io.PrintStream;
import javax.swing.JOptionPane;

public class RecursionMethod {
	
	private final String TAG = RecursionMethod.class.getSimpleName();
	
	//Main method
    public static void main(String[] args) {
    	
        String number = JOptionPane.showInputDialog(null, (Object)"Please enter a number:");
        long num = Long.parseLong(number);
        System.out.println(String.format("Factorial of %d is: %d", num, RecursionMethod.runFactorial(num)));
    }

    //Recursive method
    public static long runFactorial(long num) {
        if (num <= 1) {
            return 1;
        }
        return num * RecursionMethod.runFactorial(num - 1);
    }
}