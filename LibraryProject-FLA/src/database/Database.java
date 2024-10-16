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

}
