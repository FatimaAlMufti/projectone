package codeforfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOptions {
	public static final String name = "src/codeforfiles/fillzz/";

	public void createFile() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a file to be created:");
		String dirPath = scanner.nextLine();
		Path path = FileSystems.getDefault().getPath(name + dirPath).toAbsolutePath();

		File file = path.toFile(); // initialize File object and passing path as argument
		boolean result;
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}
	}

	public void deleteFile() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a file to be deleted:");
			String dirPath = scanner.nextLine();
			Path path = FileSystems.getDefault().getPath(name + dirPath).toAbsolutePath();

			File f = path.toFile(); // file to be delete
			if (f.delete()) // returns Boolean value
			{
				System.out.println(f.getName() + " deleted"); // getting and printing the file name
			} else {
				System.out.println("failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SearchFile() {

		Boolean found = false;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a file name to be searched:");
		String dirPath = scanner.nextLine();

		Path path = FileSystems.getDefault().getPath(name + dirPath).toAbsolutePath();

		File f = path.toFile();
		if (f.exists()) {
			System.out.println("file is found");
		} else {
			System.out.println("file not found");
		}
		
		
		
		
		
		//ArrayList<File> files = new ArrayList<File>();

		// TODO Fix it so ArrayList obtains files
		// Finished TODO

//		for (int i = 0; i < files.size(); i++) {
//			if (files.get(i).getName().equals(f)) {
//				System.out.println("Found " + f);
//				found = true;
//			}
//		}
//		if (found == false) {
//			System.out.println("File not found");
//		}
	}

}
