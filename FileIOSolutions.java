/*
 * Mackenzie Hughes
 */

import java.io.*;
import java.util.Scanner;

public class FileIOSolutions {

    // Method to replace "is" with "was" (case insensitive) in the input file and output to a new file.
    public static void pastTense(String inputFile, String outputFile) {
        try (Scanner scanner = new Scanner(new File(inputFile));
             PrintWriter writer = new PrintWriter(new File(outputFile))) {

            // Reading the file word by word
            while (scanner.hasNext()) {
                String word = scanner.next();
                
                // Replace "is" (case insensitive) with "was"
                if (word.equalsIgnoreCase("is")) {
                    word = "was";
                }
                
                // Print to console
                System.out.println(word);
                
                // Write the word to output file
                writer.println(word);
            }
        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }

    // Method to calculate the total volume of tubes from a tab-delimited file
    public static double totalTubeVolume(String inputFile) {
        double totalVolume = 0;
        try (Scanner scanner = new Scanner(new File(inputFile))) {

            // Reading the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\t");
                
                // Validate the format of each line
                if (parts.length == 3) {
                    try {
                        double radius = Double.parseDouble(parts[1]);
                        double height = Double.parseDouble(parts[2]);
                        
                        // Calculate the volume of the tube (V = π * r^2 * h)
                        double volume = Math.PI * Math.pow(radius, 2) * height;
                        totalVolume += volume;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format in line: " + line);
                    }
                } else {
                    System.out.println("Invalid format in line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }

        return totalVolume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the File I/O Problem's Solutions!");

        while (true) {
            System.out.println("\nEnter 1. For Test 1");
            System.out.println("Enter 2. For Test 2");
            System.out.println("Enter 9. To Quit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\n-----------------------\nTest01\n-----------------------");
                System.out.println("Testing method \"pastTense\" with the file \"ItIs.txt\" and outputting to \"ItWas.txt\"");
                pastTense("ItIs.txt", "ItWas.txt");

            } else if (choice == 2) {
                System.out.println("\n-----------------------\nTest02\n-----------------------");
                System.out.println("Testing method \"totalTubeVolume\" with the file \"Tubes.txt\"");
                double totalVolume = totalTubeVolume("Tubes.txt");
                System.out.println("The total combined volume is: " + totalVolume);

            } else if (choice == 9) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }

        scanner.close();
    }
}
