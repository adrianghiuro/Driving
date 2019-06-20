package ro.itschool.curs5;

import java.util.Scanner;

public class DrivingLicence {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello. Your name?");
        String name = keyboard.next();
        System.out.println(name);
        int age = keyboard.nextInt();
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (age >= 16 && age <= 17) {
            System.out.println("You can drive, but not vote.");
        } else if (age >= 17 && age <= 24) {
            System.out.println("You can vote but not rent a car.");
        } else if (age >= 25) {
            System.out.println("You can do anything that's legal.");
        }

    }
}

