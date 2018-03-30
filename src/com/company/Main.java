package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean done = false;
        String result;
        Scanner sc = new Scanner(System.in);

        while (done != true) {

            System.out.println("Are your eyes red?");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("get some sleep!");
            } else {
                System.out.println("You look great!");

            }

            System.out.print("Do you want to try again? (y/n) ");
            result = sc.nextLine();

            if (result.equalsIgnoreCase("y")) {
                done = false;
            } else {
                done = true;
            }
        }
    }

}