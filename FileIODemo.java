package Assignment05;

import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {

        // Task1-1
        String fileName = "input.txt";

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("cannot find the file");
        }

        // Task1-2
        System.out.println("======Task2=======");
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Line: " + line);
                int characterCount = countCharacters(line);
                System.out.println("Character Count: " + characterCount);
            }
        } catch (IOException e) {
            System.out.println("cannot find the file");
        }

        // Task2
        fileName = "output.txt";

        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            // Write the following lines to the file
            bufferedWriter.write("Hello, this is line 1.");
            bufferedWriter.newLine();
            bufferedWriter.write("Java File I/O is interesting!");
            bufferedWriter.newLine();
            bufferedWriter.write("End of the assignment.");

            System.out.println("Lines written to " + fileName);

        } catch (IOException e) {
            System.out.println("cannot find the file");
        }

        // Task3: Append to file

        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.newLine();
            bufferedWriter.write("Appending new line.");
            bufferedWriter.newLine();
            bufferedWriter.write("File I/O without buffers.");

            System.out.println("Lines appended to " + fileName);

        } catch (IOException e) {
            System.out.println("cannot find the file");
        }

        // Task4: Challenge
        String newFile = "custom.txt";

        String contentToWrite = "This is the content to write without using buffers.";


        writeToFile(newFile, contentToWrite);

        System.out.println("Content written to " + newFile);



    }

    private static int countCharacters(String input) {
        return input.replaceAll("\\s", "").length();
    }

    private static void writeToFile(String filename, String content) {
        try (FileWriter fileWriter = new FileWriter(filename, true)) {
            fileWriter.write(content);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("cannot find the file");
        }
    }
}
