package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Song nevergonna = new Song("Never Gonna Give You Up", "Rick Astley", "We're no strangers to love\n" +
                "You know the rules and so do I\n" +
                "A full commitment's what I'm thinking of\n" +
                "You wouldn't get this from any other guy\n" +
                "I just wanna tell you how I'm feeling\n" +
                "Gotta make you understand\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but you're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n" +
                "And if you ask me how I'm feeling\n" +
                "Don't tell me you're too blind to see\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "No, I'm never gonna give you up\n" +
                "No, I'm never gonna let you down\n" +
                "No, I'll never run around and hurt you\n" +
                "Never, ever desert you\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "No, I'm never gonna give you up\n" +
                "No, I'm never gonna let you down\n" +
                "No, I'll never run around and hurt you\n" +
                "I'll never, ever desert you", "Pop music");

        FileWriter fw = new FileWriter("Never Gonna Give You Up.txt");
        fw.write(nevergonna.getName() + "\n");
        fw.write(nevergonna.getAuthor() + "\n");
        fw.write(nevergonna.getGenre() + "\n");
        fw.write(nevergonna.getLyrics());
        fw.close();
    }
}
