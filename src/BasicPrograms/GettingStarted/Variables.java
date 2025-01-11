package BasicPrograms.GettingStarted;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
//        Variables & its Data Types
        int x = 15;
        int y = 10;
        int sum = x + y; // op : 25
        int prod = x * y; // op : 150
        int div = x / y; // op : 0
        int mod = x % y; // op : 5
        int exp = x*y / y+x; // */% >> +-

        System.out.println("Sum Of " + x + " and " + y + " is " + sum);
        System.out.println("Product Of " + x + " and " + y + " is " + prod);
        System.out.println("Division Of " + x + " and " + y + " is " + div);
        System.out.println("Modulo Of " + x + " and " + y + " is " + mod);
        System.out.println("Soln of Expression is : " + exp);

    }
}
