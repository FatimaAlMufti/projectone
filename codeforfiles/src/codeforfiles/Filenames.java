package codeforfiles;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Filenames {
	public static final String name = "src/codeforfiles/fillzz/";

	public void userInput() {

		// Takes the directory path as the user input
		Path path = FileSystems.getDefault().getPath(name).toAbsolutePath();
		File folder = path.toFile();

		if (folder.isDirectory()) {
			File[] fileList = folder.listFiles();

			Arrays.sort(fileList);

			System.out.println("\nTotal number of items present in the directory: " + fileList.length);

			// Lists only files since we have applied file filter
			for (File file : fileList) {
				System.out.println(file.getName());
			}

			// Creating a filter to return only files.
			FileFilter fileFilter = new FileFilter() {
				@Override
				public boolean accept(File file) {
					return !file.isDirectory();
				}
			};

//			fileList = folder.listFiles(fileFilter);
//
//			// Sort files by name
//			Arrays.sort(fileList, new Comparator() {
//				@Override
//				public int compare(Object f1, Object f2) {
//					return ((File) f1).getName().compareTo(((File) f2).getName());
//				}
//			});
//
//				//Prints the files in file name ascending order
//			for (File file : fileList) {
//				System.out.println(file.getName());
//			}

		}
	}
}
