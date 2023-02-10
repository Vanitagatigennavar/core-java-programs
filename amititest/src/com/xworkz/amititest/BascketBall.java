package com.xworkz.amititest;


import java.util.Scanner;

public class BascketBall {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 5) {
      System.out.println("Number of employees participating in sports must be greater than 5");
      return;
    }
    int[] employees = new int[n];
    for (int i = 0; i < n; i++) {
      employees[i] = sc.nextInt();
    }
    String football = "";
    String basketball = "";
    for (int i = 0; i < n; i++) {
      if (employees[i] % 2 == 0 && employees[i] % 4 == 0) {
        football += employees[i] + " ";
      } else {
        basketball += employees[i] + " ";
      }
    }
    System.out.println("List of employees in foot ball team are: " + football.trim());
    System.out.println("List of employees in basket ball team are: " + basketball.trim());
  }
}
