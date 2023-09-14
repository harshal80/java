import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        // // code to crate a new file
        // File myfile = new File("HarshaldadaniFile.txt");
        // try {
        // myfile.createNewFile();

        // } catch (IOException e) {
        // System.out.println("Unable to crate theis file");
        // e.printStackTrace();

        // Code to write to a file
        // try {
        // FileWriter fileWriter = new FileWriter("HarshaldadaniFile.txt");
        // fileWriter.write("This is our first file from this java course\nOkay now
        // bye");
        // fileWriter.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // Reading a file

        File myFile = new File("HarshaldadaniFile.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Deleting a file
        // File myfile = new File("HarshaldadaniFile.txt");
        // if(myFile.delete()){
        // System.out.println("I have deleted: " + myfile.getName());
        // }
        // else{
        // System.out.println("Some problem occurred while deleting the file");
        // }
    }
}
