package markovharmony.db;

public class dbElement {
	public String title;
	public String artist;
	public Genre genre;
	public int year;
	public Mode mode; 
	public String country;
	public String era;
	public Integer[] chords;
	public dbElement(){
		
	}
	public dbElement(String title, String artist, Genre genre, int year, Mode mode, String country, String era, Integer[] chords) {
		super();
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
		this.mode = mode;
		this.country = country;
		this.era = era;
		this.chords = chords;
	}
}
