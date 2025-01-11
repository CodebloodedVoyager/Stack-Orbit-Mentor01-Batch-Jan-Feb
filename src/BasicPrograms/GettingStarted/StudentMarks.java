package BasicPrograms.GettingStarted;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
/*
 * Q: Students Marks :1. Given marks as I/p,
 * 1. Display an appropriate message based on the following rule:
 * 1.1 Above 90, print excellent
 * 1.2 Above 80 & less than equal to 90 , GOOD
 * 1.3 Above 70 & less than equal to 80, FAIR
 * 1.4 Above 60 and less than equal to 70, MEETS EXPECTATION
 * 1.5 less than 60, BELOW PAR
 */
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the marks you want to see: ");
        int marks = scn.nextInt();

        if(marks>90){
            System.out.println("Excellent");
        }else if(marks > 80 && marks <= 90){
            System.out.println("GOOD");
        }else if(marks >70 && marks <= 80){
            System.out.println("FAIR");
        }else if(marks >60 && marks <= 70){
            System.out.println("GOOD");
        }else if(marks <= 60){
            System.out.println("Below Par");
        }

    }
}
