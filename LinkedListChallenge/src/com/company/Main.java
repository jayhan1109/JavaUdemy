package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static LinkedList<Song> playlist = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);
    private boolean quit = false;

    public static void main(String[] args) {
        System.out.println("Welcome To Sportify");
        while (!quit) {
            menu();
            while (!sc.hasNextInt()) {
                System.out.println("Invalid Input\n");
                menu();
            }

            int select = sc.nextInt();

            switch (select) {
                case 0:
                    showPlaylist();
                    break;
                case 1:
                    nextSong();
                    break;
                case 2:
                    preSong();
                    break;
                case 3:
                    replaySong();
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    private static void menu() {
        System.out.print("Select a option\n" +
                "0 - See the playlist\n" +
                "1 - Play next song\n" +
                "2 - Play previous song\n" +
                "3 - Replay current song\n" +
                "4 - Add song in playlist\n" +
                "5 - Quit\n" +
                ">>");
    }

    private static void showPlaylist(){
        ListIterator<Song> iterator = playlist.listIterator();
        while(iterator.hasNext()){
            
        }
    }
}
