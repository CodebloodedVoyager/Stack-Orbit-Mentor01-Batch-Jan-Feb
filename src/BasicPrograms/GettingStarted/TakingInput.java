package BasicPrograms.GettingStarted;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // Scanner helps in Taking Input

        Scanner scn = new Scanner(System.in);

//        int n = in.nextInt();
/* This won't work, It'll be a bug if we're taking Int & string as input.
therefore we've to use Integer.parseInt(scn.nextLine());
*/
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        System.out.println("Hello " + name + ". Here's the counting");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }



    }
}
