package Day03;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task03 {

    // Tasks from https://www.w3resource.com/java-exercises/io/index.php

    private static void task01() {

        System.out.println("\nTask 01. Get a list of all file/directory names from the given folder\n");
        String folder = "src/";
        File file = new File (folder);
        if (file.exists()) {
            String[] fileList = file.list();

            if (fileList != null) {
                for (String filename : fileList) {
                    System.out.println(filename);
                }
            }

        } else {
            System.out.println("No such file or directory!");
        }
    }

    private static void task02() {

        System.out.println("\nTask 02. Get specific files by extensions from a specified folder\n");
        String folder = "src/Day03/";
        String extension = ".txt";
        File file = new File(folder);
        if (file.exists()) {
            String[] fileList = file.list();

            if (fileList != null) {
                for (String thisFile : fileList) {
                    if (thisFile.toLowerCase().endsWith(extension)) {
                        System.out.println(thisFile);
                    }
                }
            }
        } else {
            System.out.println("No such file or directory!");
        }
    }

    private static void task03() {

        System.out.println("\nTask 03. Check if a file or directory specified by pathname exists or not\n");
        String pathFile = "src/Day03/dwarves.txt";
        File file = new File(pathFile);
        if (file.exists()) {
            System.out.println("It exists!");
        } else {
            System.out.println("No such file or directory!");
        }
    }

    private static void task04() {

        System.out.println("\nTask 04. Check if a file or directory has read and write permission\n");
        String pathFile = "src/Day03/dwarves.txt";
        File file = new File(pathFile);
        if (file.exists()) {
            if (file.canRead()) {
                System.out.println("It has read permission");
            } else {
                System.out.println("No read permission");
            }
            if (file.canWrite()) {
                System.out.println("It has write permission");
            } else {
                System.out.println("No write permission");
            }
        } else {
            System.out.println("No such file or directory!");
        }
    }

    private static void task05() {

        System.out.println("\nTask 05. Check if given pathname is a directory or a file\n");
        String pathFile = "src/Day03/dwarves.txt";
        File file = new File(pathFile);
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("This is a file");
            } else if (file.isDirectory()) {
                System.out.println("This is a directory");
            }
        } else {
            System.out.println("No such file or directory!");
        }
    }

    private static void task06() {

        System.out.println("\nTask 06. Compare two files lexicographically\n");
        String fileOne = "src/Day03/dwarves.txt";
        String fileTwo = "src/Day03/write2me.txt";
        System.out.println("Comparison result: " + fileOne.compareTo(fileTwo));
    }

    private static void task07() {

        System.out.println("\nTask 07. Get last modified time of a file\n");
        String textFile = "src/Day03/dwarves.txt";
        File file = new File(textFile);
        Date date = new Date(file.lastModified());
        System.out.println("Last modification date: " + date);
    }

    private static void task08() {

        System.out.println("\nTask 08. Read input from the console\n");
        System.out.println("Please input something to read: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.println("Your input: " + userInput);
        scanner.close();
    }

    private static void task09() {

        System.out.println("\nTask 09. Get file size in bytes, Kb, Mb\n");
        String textFile = "src/Day03/dwarves.txt";
        File file = new File(textFile);

        if (file.exists()) {
            long bytes = file.length();
            long kBytes = (bytes / 1024);
            long mBytes = (kBytes / 1024);

            System.out.println("File size in bytes: " + bytes);
            System.out.println("File size in kilobytes: " + kBytes);
            System.out.println("File size in megabytes: " + mBytes);
        }
    }

    private static void task10() throws IOException {

        System.out.println("\nTask 10. Read contents from the file into byte array\n");
        String file = "src/Day03/dwarves.txt";
        Path path = Paths.get(file);
        byte[] data = Files.readAllBytes(path);
    }

    private static void task11() throws IOException {

        System.out.println("\nTask 11. Read a file contents line by line\n");
        String file = "src/Day03/dwarves.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("> " + line);
        }
        reader.close();
    }

    private static void task12() throws IOException {

        System.out.println("\nTask 12. Read a plain text file\n");
        String file = "src/Day03/dwarves.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    private static void task13() throws IOException {

        System.out.println("\nTask 13. Read a file line by one and store it in a variable\n");
        String file = "src/Day03/dwarves.txt";
        StringBuilder result = new StringBuilder();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null) {
            result.append(line);
        }
        reader.close();
        System.out.println("Result line: " + result);
    }

    private static void task14() throws IOException {

        System.out.println("\nTask 14. Store text file contents line by line into an array\n");
        String file = "src/Day03/dwarves.txt";
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            Scanner scanner = new Scanner(line).useDelimiter("\\s+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word);
            }
            scanner.close();
        }
        System.out.println(words);
    }

    private static void task15() throws IOException {

        System.out.println("\nTask 15. Write and read a simple text file\n");
        String file = "src/Day03/dwarves.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println("Reading file: ");
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        String fileToWrite = "src/Day03/write2me.txt";
        FileWriter writer = new FileWriter(fileToWrite);
        for (int i = 0; i < 5; i++) {
            writer.write("Line " + (i + 1)+ "\n");
        }
        writer.close();
    }

    private static void task16() throws IOException {

        System.out.println("\nTask 16. Append text to existing file\n");
        String file = "src/Day03/dwarves.txt";
        String lineToAdd = "Here be dragons!\n";
        FileWriter writer = new FileWriter(file, true);
        writer.append(lineToAdd);
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("> " + line);
        }
        reader.close();
    }

    private static void task17() throws IOException {

        System.out.println("\nTask 17. Read first three lines from a file\n");
        String file = "src/Day03/dwarves.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        for (int i = 0; i < 3; i++) {
            line = reader.readLine();
            System.out.println("> " + line);
        }
        reader.close();
    }

    private static void task18() throws IOException {

        System.out.println("\nTask 18. Find the longest word in a text file\n");
        String file = "src/Day03/dwarves.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        String longestWord = "";
        while (line != null) {
            Scanner scanner = new Scanner(line).useDelimiter("\\s");
            while (scanner.hasNext()) {
                String word = scanner.next();
                word = word.toLowerCase().replaceAll("[^a-z]", "");
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            line = reader.readLine();
            scanner.close();
        }
        reader.close();
        System.out.println("Longest word is " + longestWord);
    }

    public static void main(String[] args) throws IOException{
        // Just run any task you want, e.g.:

        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
        task09();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }
}
