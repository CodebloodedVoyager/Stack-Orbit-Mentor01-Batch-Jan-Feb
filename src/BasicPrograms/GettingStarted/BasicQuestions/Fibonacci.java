package BasicPrograms.GettingStarted.BasicQuestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int p = 0;
        int count = 2;
        while(count <= n) {
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
