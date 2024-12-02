package model.computerfile;

import model.author.Author;

public class Word extends ComputerFile {

	public Word(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
		super(title, author, subject, dateCreated, format, fileSize);
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	
	
}
