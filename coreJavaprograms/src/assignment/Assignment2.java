package assignment;


	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Scanner;

	public class Assignment2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the file name:");

	        String fileName = scanner.nextLine();
	        readFileContent(fileName);

	        scanner.close();
	    }

	    public static void readFileContent(String fileName) {
	        BufferedReader reader = null;

	        try {
	            reader = new BufferedReader(new FileReader(fileName));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (FileNotFoundException e) {
	            System.out.println("Error: The file '" + fileName + "' does not exist.");
	        } catch (IOException e) {
	            System.out.println("Error: An IO error occurred while reading the file.");
	        } finally {
	            try {
	                if (reader != null) {
	                    reader.close();
	                }
	            } catch (IOException e) {
	                System.out.println("Error: An IO error occurred while closing the file.");
	            }
	        }
	    }
	}


