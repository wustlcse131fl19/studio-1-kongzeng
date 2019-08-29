package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("The first of two integers to be averaged?");
        int n2 = ap.nextInt("The second of two integers to be averaged?");

        double average = (double)(n1 + n2) / 2;
        System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");

    }
}