package database;

import java.util.ArrayList;

import model.artwork.Artwork;
import model.author.Author;
import model.book.Book;
import model.computerfile.ComputerFile;

public class Database {
	private ArrayList<Book> bookData;
	private ArrayList<ComputerFile> compData;
	private ArrayList<Artwork> artData;
	private ArrayList<Author> authorData;
	
	private static volatile Database instance = null;
	
	public static Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}

	private Database() {
		bookData = new ArrayList<Book>();
		compData = new ArrayList<ComputerFile>();
		artData = new ArrayList<Artwork>();
		authorData = new ArrayList<Author>();
	}

	public ArrayList<Book> getBookData() {
		return bookData;
	}

	public ArrayList<ComputerFile> getCompData() {
		return compData;
	}

	public ArrayList<Artwork> getArtData() {
		return artData;
	}

	public ArrayList<Author> getAuthorData() {
		return authorData;
	}

	public void setBookData(ArrayList<Book> bookData) {
		this.bookData = bookData;
	}

	public void setCompData(ArrayList<ComputerFile> compData) {
		this.compData = compData;
	}

	public void setArtData(ArrayList<Artwork> artData) {
		this.artData = artData;
	}

	public void setAuthorData(ArrayList<Author> authorData) {
		this.authorData = authorData;
	}
	
	

}
