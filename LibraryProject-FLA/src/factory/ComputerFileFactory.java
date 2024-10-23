package factory;

import adapter.WordToPdf;
import model.author.Author;
import model.bibliography.Bibliography;
import model.computerfile.ComputerFile;
import model.computerfile.Pdf;
import model.computerfile.Word;

public class ComputerFileFactory extends BibliographyFactory{
	public ComputerFile createCf(String title, Author author, String subject, String dateCreated, String format, double fileSize,Pdf pdf) {
		ComputerFile newCf=new ComputerFile(title, author, subject, dateCreated, format, fileSize, pdf);
		return newCf;
	}
	public ComputerFile createCf(String title, Author author, String subject, String dateCreated, String format, double fileSize,Word word) {
		WordToPdf adapter=new WordToPdf(word.getFileSize());
		ComputerFile newCf=new ComputerFile(title, author, subject, dateCreated, format, fileSize, adapter);
		return newCf;
	}
}
