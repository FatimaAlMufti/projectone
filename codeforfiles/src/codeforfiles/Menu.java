package codeforfiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	static int selection;
	public static void main(String[] args) {

		/*********************************************************/

		menu();

		
		Scanner input = new Scanner(System.in);

		try {
			while ((selection = input.nextInt()) != 3) {
				switch (selection) {
				case 1:
					// Perform "display file names in ascending order" case.
					Filenames f = new Filenames();
					f.userInput();
					break;
				case 2:
					// File OPERATIONS
					int s = menu2();
					break;
				case 3:
					
					System.exit(1);
				default:
					System.out.println("Invalid Option");
					break;
				}
				menu();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void menu() {
			while (selection !=3) {
		/***************************************************/
		System.out.println("application name: file search and sort");
		System.out.println("Developer Name: Fatima almufi");
			
		System.out.println("Choose from these choices");
		System.out.println("-------------------------\n");
		System.out.println("1 - Display file names");
		System.out.println("2 - File operations");
		System.out.println("3 - Quit");
			break;}
	}

	public static int menu2() {
		int select = 0;

		/***************************************************/
		while (select != 4) {
			System.out.println("Choose from these choices");
			System.out.println("-------------------------\n");
			System.out.println("1 - Create file");
			System.out.println("2 - Delete file");
			System.out.println("3 - Search for a file");
			System.out.println("4 - back to main menu");

			Scanner input = new Scanner(System.in);
			select = input.nextInt();
			choice(select);
		}
		return select;

	}

	public static void choice(int s) {

		/*********************************************************/

		// Scanner scanner = new Scanner(System.in);
		// int choice = scanner.nextInt();

		try {

			switch (s) {
			case 1:
				// Perform "create new file" case.
				FileOptions n = new FileOptions();
				n.createFile();
				break;
			case 2:
				// Perform "delete a file" case.
				FileOptions d = new FileOptions();
				d.deleteFile();
				break;
			case 3:
				// Perform "search for a file" case.
				FileOptions h = new FileOptions();
				h.SearchFile();
				break;
			case 4:
				main(null);
				// Perform "back" case.
				break;
			default:
				System.out.println("invalid selection");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
