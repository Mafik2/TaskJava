package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[10];

		{
			jump1:
			System.out.println(" -ToDo app-");
			System.out.println("1) Manage Tasks");
			System.out.println("2) Exit");
			int input1 = Integer.parseInt(scan.nextLine());
			if (input1 == 1) {
				System.out.println("1) Create a new task");
				System.out.println("2) Update a task");
				System.out.println("3) Delete a task");
				System.out.println("4) Back to main menu");

			}
			int input2 = Integer.parseInt(scan.nextLine());
			if (input2 == 1) {
				System.out.println("Creating new task");
				System.out.println("Add pozition:");
				int poz = Integer.parseInt(scan.nextLine());
				System.out.println("Add task:");
				arr[poz] = scan.nextLine();


			}
			if (input2 == 2) {
				System.out.println("updating task:");
				System.out.println("Choose pozition");
				int poz = Integer.parseInt(scan.nextLine());
				System.out.println("Update task:");
				arr[poz] = scan.nextLine();


			}
			if (input2 == 3) {

			}
			if (input2 == 4) {

			}


			if (input1 == 2) {
				System.exit(input1);
			}
		}
	}
}


