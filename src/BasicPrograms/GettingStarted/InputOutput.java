package BasicPrograms.GettingStarted;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Its a Scanner Function for taking inputs


//      There's a difference btwn print() and println() [\m]
//      println(), takes us to next line (enter)

        System.out.println("Enter the name of the student:");
        String name = scn.nextLine();

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        System.out.println("Hello " + name + " " + "Welcome to the StackOrbit JAVA DSA Cohort 1");

//        method 2 :
        System.out.println("*\n**\n***\n****\n*****");

        scn.close();
    }
}


/*
*
* import java.util.*;
* Vishvaas Kro
*
* */