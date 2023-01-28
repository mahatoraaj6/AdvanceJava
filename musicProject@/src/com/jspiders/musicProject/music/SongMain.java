package com.jspiders.musicProject.music;

import java.util.Scanner;

import com.jspiders.musicProject.music.songOperation.SongOperations;

public class SongMain {
    
	SongOperations songOperations = new SongOperations();
    Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		MusicPlayer music = new MusicPlayer();
		boolean loop= true;
		while (loop) {
			music.musicPlayer();
			loop= false;
		}
	}
	public void musicPlayer() {
		System.out.println("Welcome to music player.Choosed the option \n1.Add/Remove song.\n2.Play song.\n3.Edit song.\n4.Exit");
	    int choose = scanner.nextInt();   
    	switch (choose) {
		case 1:
			System.out.println("1. Add song.\n"+"2. Remove song.\n"+"3. Back");
			int choose1 = scanner.nextInt();
			switch (choose1) {
			case 1:
				songOperations.addSong();
				break;
            case 2:
				songOperations.removeSong();
				break;
            case 3:
				songOperations.back();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			break;
		case 2:
			System.out.println("1. Play all song.\n"+"2. Play random song.\n"+"3. Select song to play.\n"+"4. Back ");
			switch (scanner.nextInt()) {
			case 1:
				songOperations.playAllSong();
				break;
            case 2:
				songOperations.playRandomSong();
				break;
            case 3:
				songOperations.playSpeificSong();
				break;
            case 4:
				songOperations.back();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			break;
		case 3:
			System.out.println("1. Edit play list.\n"+"2. Back");
			switch (scanner.nextInt()) {
			case 1:
				songOperations.editPlaylist();
				break;
            case 2:
				songOperations.back();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			break;
		case 4:
		    songOperations.exit();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
    
