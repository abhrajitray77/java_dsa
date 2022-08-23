package com.abhra;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Enter your roll number");
        Scanner input = new Scanner(System.in);
        System.out.println();
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
    }
}
