package com.company;

import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
    private ArrayList<Song> songs = new ArrayList<>();

    public void addSongToAlbum(){
        songs.add(new Song("BTS",2.43));
        songs.add(new Song("IU",2.25));
        songs.add(new Song("BIGBANG",3.43));
        songs.add(new Song("TaeYang",3.13));
        songs.add(new Song("MC THE MAX",4.3));
        songs.add(new Song("ROYKIM",3.12));
        songs.add(new Song("HENRY",3.23));
    }

    private int findSong(Song song){
        ListIterator<Song> iterator = songs.listIterator();
        while(iterator.hasNext()){
            Song currentSong = iterator.next();
            if(currentSong.getName().equals(song.getName())){
                return iterator.previousIndex();
            }
        }

        return -1;
    }

    private int findSong(String name){
        ListIterator<Song> iterator = songs.listIterator();
        while(iterator.hasNext()){
            Song currentSong = iterator.next();
            if(currentSong.getName().equals(name)){
                return iterator.previousIndex();
            }
        }

        return -1;
    }
}
