package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("AllStarLyrics.txt");
        Scanner sc = new Scanner(fr);
        String name = sc.nextLine();
        String author = sc.nextLine();
        String genre = sc.nextLine();
        String lyrics = "";
        while (sc.hasNextLine()){
            lyrics += sc.nextLine() + "\n";
        }
        Song allstar = new Song(name, author, lyrics, genre);

        System.out.println(allstar.getFullSong());
    }
}
