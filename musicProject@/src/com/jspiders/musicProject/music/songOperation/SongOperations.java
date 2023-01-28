package com.jspiders.musicProject.music.songOperation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.musicProject.music.song.Song;

public class SongOperations {
	Scanner scanner = new Scanner(System.in);
	ArrayList <Song> arrylist = new ArrayList<Song>();
    Song song = new Song();
	public void addSong() {
		System.out.println("How many songs you want to add?");
		int addCount = scanner.nextInt();
		for (int i=0;i<addCount;i++) {
//			Song song = new Song();
			System.out.println("Enter the ID for song: ");
			song.setId(scanner.nextInt());
			
			System.out.println("Enter the Name for song: ");
			song.setName(scanner.next());
			
			System.out.println("Enter the Movie Name for song: ");
			song.setMovie(scanner.next());
			
			System.out.println("Enter the Length for song: ");
			song.setLength(scanner.nextDouble());
			
			System.out.println("Enter the Composer Name for song: ");
			song.setComposer(scanner.next());
			
			System.out.println("Enter the Lyrist Name for song: ");
			song.setLyrist(scanner.next());
			
			arrylist.add(song);
			System.out.println(song.getName()+" Song add suessfully.");
		}
	}
	
	public void displayAllSongs() {
		if (arrylist.isEmpty()) {
			System.out.println("Add songs then you will get songlist.");
			addSong();
		}
		for(Song song : arrylist) {
			System.out.println(song.getName());
		}
	}
    public void removeSong() {
		if (arrylist.isEmpty()) {
			System.out.println("Add song then remove...");
			addSong();
		}
		System.out.println("Select song to remove.");
		displayAllSongs();
		int removeId = scanner.nextInt();
		System.out.println(arrylist.get(removeId - 1).getName()+" removed Successfully...");
		arrylist.remove(removeId - 1);
		displayAllSongs();
	}
    
    
    public void back() {
		
	}
    
    public void playAllSong() {
		if (arrylist.isEmpty()) {
			System.out.println("Add songs then play..");
			addSong();
		}
		System.out.println("Playing all songs");
		for(Song song : arrylist) {
			System.out.println(song.getName());
		}
   	}
    
    public void playRandomSong() {
		if(arrylist.isEmpty()) {
			System.out.println(" first Add songs then play...");
			addSong();
		}
		System.out.println("Playing random songs");
    	double number = Math.random();
    	int random = (int) (number * 10) + 1;
    	if (random>arrylist.size()) {
			random = 1;
		}
    	System.out.println("Playing song "+ arrylist.get(random).getName());
	}
    
    
    public void playSpeificSong() {
		if (arrylist.isEmpty()) {
			System.out.println("Add songs then play...");
			addSong();
		}
		System.out.println("Select song to play.");
		displayAllSongs();
		int play = scanner.nextInt();
		System.out.println("Playing song "+arrylist.get(play - 1).getName());
   	}
    
    public void editPlaylist() {
    	if (arrylist.isEmpty()) {
			System.out.println("Add songs then edit the song..");
			addSong();
		}
    	System.out.println("Select song to edit");
		displayAllSongs();
		int edit = scanner.nextInt();
		arrylist.remove(edit - 1);
//		Song song1 = new Song();
		
		System.out.println("Enter the new Id for song: ");
		song.setId(scanner.nextInt());
		
		System.out.println("Enter the new Name for song: ");
		song.setName(scanner.next());
		
		System.out.println("Enter the new Movie Name for song: ");
		song.setMovie(scanner.next());
		
		System.out.println("Enter the new Length for song: ");
//		double length = scanner.nextDouble();
		song.setLength(scanner.nextDouble());
		
		System.out.println("Enter the new Composer Name for song: ");
		song.setComposer(scanner.next());
		
		System.out.println("Enter the new Lyrist Name for song: ");
		song.setLyrist(scanner.next());
		
		arrylist.add(edit - 1,song);
		System.out.println(arrylist.get(edit - 1).getName()+" song updated details added successfully.");
   	}
    public void exit() {
		
   	}
}