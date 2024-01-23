package com.mobileplayer;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public Album(){

    }
    // to check song exist or not
    public Song findSong(String title){
        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }

    // to add song we make this function
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
            System.out.println(title + " successfully added to the list");
            return true;
        }
        else{
            System.out.println("Song with name " + title + " already exist in the list ");
            return false;
        }
    }

    // add song to playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        // index start from 0 and trackNumber have index from 0 s0 ,,,
        int index = trackNumber -1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have song with tracknumber " + trackNumber);
        return false;
    }

    // addTOPlayList to check that song is already exist in album or not
    public boolean addToPlayList(String title , LinkedList<Song> PlayList){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return  true;
            }
        }
        System.out.println(title + " there is no such song in album");
        return false;
    }



}
