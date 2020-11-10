package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[10];

		int loop = 1;
		for (int i = 0; i < loop; i++) {


			{

				System.out.println(" -ToDo app-");
				System.out.println("1) Manage Tasks");
				System.out.println("2) Exit");
				int input1 = Integer.parseInt(scan.nextLine());

				if (input1 == 2) {
					System.exit(input1);
					System.out.println("why are you gay.");
					break;
				}
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
					poz--;
					System.out.println("Add task:");
					arr[poz] = scan.nextLine();


				}

				if (input2 == 2) {
					System.out.println("updating task:");
					System.out.println("Choose pozition");
					int poz = Integer.parseInt(scan.nextLine());
					poz--;
					System.out.println("Update task:");
					arr[poz] = scan.nextLine();


				}
				if (input2 == 3) {
					System.out.println("Destroy a task");
					System.out.println("Choose pozition");
					int poz = Integer.parseInt(scan.nextLine());
					poz--;

				}
				if (input2 == 4) {
					System.out.println("Back to main menu");

				}

				System.out.println("1. task		" + arr[0]);
				System.out.println("2. task		" + arr[1]);
				System.out.println("3. task		" + arr[2]);
				System.out.println("4. task		" + arr[3]);
				System.out.println("5. task		" + arr[4]);
				System.out.println("6. task		" + arr[5]);
				System.out.println("7. task		" + arr[6]);
				System.out.println("8. task		" + arr[7]);
				System.out.println("9. task		" + arr[8]);
				System.out.println("10. task	" + arr[9]);


			loop++;
			}
		}
	}
}


