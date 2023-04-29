/**
 * 
 */
package com.javacambodia.solutions.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * @author pongs
 *
 */
public class PlaylistMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Artist> listArtists = new LinkedList<Artist>();
		
		Artist kosal = new Artist();
		kosal.setId(1);
		kosal.setName("Sok Kosal");
		kosal.setGender('M');
		kosal.setAge(22);
		listArtists.add(kosal);
		
		Artist sovat = new Artist();
		sovat.setId(2);
		sovat.setName("Preap Sovat");
		sovat.setGender('M');
		sovat.setAge(42);
		listArtists.add(sovat);
		
		Artist nisa = new Artist();
		nisa.setId(3);
		nisa.setName("Sokon Nisa");
		nisa.setGender('F');
		nisa.setAge(30);
		
		// ...
		listArtists.forEach(System.out::println);
		
		// 
		
		// Each artist has x album
		Album sovatAlbum1 = new Album();
		sovatAlbum1.setId(1);
		sovatAlbum1.setName("Super 2020");
		sovatAlbum1.setYear(2020);
		sovatAlbum1.setArtist(sovat);
		sovatAlbum1.getTracks().add(new Track(1, "Cha Cha", "Disco", 3.2f));
		sovatAlbum1.getTracks().add(new Track(2, "Ago Go", "Disco", 4.2f));
		sovatAlbum1.getTracks().add(new Track(3, "Hello My Dear", "Slow", 5.2f));
		
		System.out.println(sovatAlbum1.toString());
		
		Album nisaAlbum1 = new Album();
		nisaAlbum1.setId(1);
		nisaAlbum1.setName("Hello Girl");
		nisaAlbum1.setYear(2020);
		nisaAlbum1.setArtist(nisa);
		nisaAlbum1.getTracks().add(new Track(4, "To Love Somebody", "Slow", 4.2f));
		nisaAlbum1.getTracks().add(new Track(5, "When I met you", "Slow", 5.2f));
		nisaAlbum1.getTracks().add(new Track(6, "It was a good time", "Slow", 3.0f));
		nisaAlbum1.getTracks().add(new Track(7, "Let's dance", "Disco", 6.2f));
		
		System.out.println(nisaAlbum1.toString());
		
		System.out.println(" === WHO HAS LONGER TRACKS ===");
		List<Album> allArtistAlbums = new ArrayList<Album>();
		allArtistAlbums.add(sovatAlbum1);
		allArtistAlbums.add(nisaAlbum1);
		
		Optional<Album> longerTrack = allArtistAlbums.stream()
				.reduce((album1, album2) -> album1.getTracks().size() > album2.getTracks().size() ? album1 : album2);
		
		if (longerTrack.isPresent()) {
			System.out.println(longerTrack.get().toString());
		} else {
			System.out.println("Oop!");
		}
		
	}

}
