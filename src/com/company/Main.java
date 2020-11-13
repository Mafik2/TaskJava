package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[10];

		int poc = 0;
		int loop = 1;

		System.out.println("$$$$$$$$\\        $$$$$$$\\                                                \n" +
			"\\__$$  __|       $$  __$$\\                                               \n" +
			"   $$ | $$$$$$\\  $$ |  $$ | $$$$$$\\         $$$$$$\\   $$$$$$\\   $$$$$$\\  \n" +
			"   $$ |$$  __$$\\ $$ |  $$ |$$  __$$\\        \\____$$\\ $$  __$$\\ $$  __$$\\ \n" +
			"   $$ |$$ /  $$ |$$ |  $$ |$$ /  $$ |       $$$$$$$ |$$ /  $$ |$$ /  $$ |\n" +
			"   $$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |      $$  __$$ |$$ |  $$ |$$ |  $$ |\n" +
			"   $$ |\\$$$$$$  |$$$$$$$  |\\$$$$$$  |      \\$$$$$$$ |$$$$$$$  |$$$$$$$  |\n" +
			"   \\__| \\______/ \\_______/  \\______/        \\_______|$$  ____/ $$  ____/ \n" +
			" --------------------------------------             $$ |      $$ |      \n" +
			"                                                     $$ |      $$ |      \n" +
			"                                                     \\__|      \\__|");

		for (int i = 0; i < loop; i++) {


			{

				System.out.println();
				System.out.println("You have " + poc + "/10 tasks");
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("1) Manage Tasks");
				System.out.println("2) Exit");
				System.out.println("3) Show tasks");

				System.out.println("---------------------------------------------------------------------------");
				int input1 = Integer.parseInt(scan.nextLine());

				if (input1 == 2) {
					System.exit(input1);
					System.out.println("");
					break;
				}

				if (input1 == 1) {
					System.out.println("1) Create a new task");
					System.out.println("2) Update a task");
					System.out.println("3) Delete a task");
					System.out.println("4) Back to main menu");
					System.out.println("---------------------------------------------------------------------------");
				}
				if (input1 == 3) {
					System.out.println("1.  task		" + arr[0]);
					System.out.println("2.  task		" + arr[1]);
					System.out.println("3.  task		" + arr[2]);
					System.out.println("4.  task		" + arr[3]);
					System.out.println("5.  task		" + arr[4]);
					System.out.println("6.  task		" + arr[5]);
					System.out.println("7.  task		" + arr[6]);
					System.out.println("8.  task		" + arr[7]);
					System.out.println("9.  task		" + arr[8]);
					System.out.println("10. task		" + arr[9]);

					System.out.println("---------------------------------------------------------------------------");
					System.out.println("1) Create a new task");
					System.out.println("2) Update a task");
					System.out.println("3) Delete a task");
					System.out.println("4) Back to main menu");
					System.out.println("---------------------------------------------------------------------------");
				}

				int input2 = Integer.parseInt(scan.nextLine());
				if (input2 == 1) {
					System.out.println("Creating new task");
					System.out.println("Add position 1 - 10:");
					System.out.println("---------------------------------------------------------------------------");
					int poz = Integer.parseInt(scan.nextLine());
					poz--;
					poc++;
					System.out.println("Add task:");
					System.out.println("---------------------------------------------------------------------------");
					arr[poz] = scan.nextLine();
				}


				if (input2 == 2) {
					System.out.println("updating task:");
					System.out.println("Choose position");
					System.out.println("---------------------------------------------------------------------------");
					int poz = Integer.parseInt(scan.nextLine());
					poz--;
					System.out.println("Update task:");
					System.out.println("---------------------------------------------------------------------------");
					arr[poz] = scan.nextLine();


				}
				if (input2 == 3) {
					System.out.println("Destroy a task");
					System.out.println("Choose position");
					int poz = Integer.parseInt(scan.nextLine());
					arr[poz] = "";
					System.out.println("Task has been destroyed");

					poc--;
					poz--;
					break;

				}
				if (input2 == 4) {
					System.out.println("Back to main menu");

				}
			}
			System.out.println();

			loop++;
		}
	}
}



