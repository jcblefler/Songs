package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i< 10;i++){
//            String artist = "Prince";//modify program to prompt user for an artist
//            String title = "Purple Rain"; //modify program to prompt user for a title
            System.out.print("Enter an Artist: ");
            String artist = scanner.nextLine();
            System.out.print("Enter a Song Title: ");
            String title = scanner.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song song: songs){
            System.out.println(song.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song song: songs){
            if (song.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",song.display());
            }
        }
    }
}