package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
 	// write your code here
        String path = ".\\src\\com\\company\\Main.java";
        FileWriter fileWriter = new FileWriter("file.txt");
        FileWriter fileWriter1 = new FileWriter("file1.txt");
        FileReader fileReader = new FileReader(path);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            fileWriter.write(line + "\n");
            fileWriter1.write(line.trim());
        }
        fileReader.close();
        fileWriter1.close();
        fileWriter.close();
        File file = new File("C:\\Users\\user\\IdeaProjects\\Homeworks\\file.txt");
        try {
            if (file.length() > 100.0){
                throw new IllegalStateException();
            } else throw new FileNotFoundException();
        } catch (IllegalStateException ie){
            System.out.println("код слишком большой");
        } catch (FileNotFoundException fe){
            System.out.println("файл не доступен");
        }


    }
}
