package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Song song = new Song();
        FileReader fileReader = new FileReader("song.txt");
        Scanner sc = new Scanner(fileReader);
        song.setName(sc.nextLine());
        song.setArtistName(sc.nextLine());
        song.setGenre(sc.nextLine());
        System.out.println(song.getName() + "\n" + song.getArtistName() +"\n"+ song.getGenre());
        for (int i = 4; i <= 11;i++){
            song.setText(sc.nextLine());
            System.out.println(song.getText());
        }
        fileReader.close();

        Song song1 = new Song();
        song1.setName("Nothing else matters\n");
        song1.setArtistName("Metallica\n");
        song1.setGenre("«Power ballad»\n");
        song1.setText(
                "So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters"
        );
        FileWriter fileWriter = new FileWriter("song1.txt");
        fileWriter.write(song1.getName() + song1.getArtistName()  + song1.getGenre() + song1.getText());
        fileWriter.close();







    }
}
