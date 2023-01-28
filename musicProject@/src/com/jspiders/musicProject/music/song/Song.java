package com.jspiders.musicProject.music.song;

public class Song {

	 int id;
	 String name;
	 String movie;
	 double length;
	 String composer;
	 String lyrist;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getLyrist() {
		return lyrist;
	}
	public void setLyrist(String lyrist) {
		this.lyrist = lyrist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", movie=" + movie + ", length=" + length + ", composer="
				+ composer + ", lyrist=" + lyrist + "]";
	}
	
	
}