/**
 * 
 */
package com.javacambodia.solutions.playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pongs
 *
 */
public class Album {
	private int id;
	private String name;
	private int year;
	private Artist artist;
	private final List<Track> tracks = new ArrayList<Track>();
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the artist
	 */
	public Artist getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	/**
	 * @return the tracks
	 */
	public List<Track> getTracks() {
		return tracks;
	}
	
	public String toString() {
		String displayTracks = this.getTracks().stream()
					.map(s -> "\t- " + s.toString() + "\n")
					.collect(Collectors.joining());
		
		return "ID: " + this.getId() +
				", NAME: " + this.getName() +
				", YEAR: " + this.getYear() +
				", ARTIST: {" + this.getArtist().toString() + "} " +
				", TRACKS: \n" + displayTracks;
	}
}
