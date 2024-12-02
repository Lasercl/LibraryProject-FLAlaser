package factory;

import adapter.WordToPdf;
import model.author.Author;
import model.bibliography.Bibliography;
import model.computerfile.ComputerFile;
import model.computerfile.Pdf;
import model.computerfile.Word;

public class ComputerFileFactory extends BibliographyFactory{
	
	public ComputerFile createCfPdf(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
		Pdf newCf=new Pdf(title, author, subject, dateCreated, format, fileSize);
		ComputerFile computerFile = null;
		computerFile = newCf;
		return computerFile;
	}
	public ComputerFile createCfWord(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
//		WordToPdf adapter=new WordToPdf(word.getFileSize());
		Word newCf=new Word(title, author, subject, dateCreated, format, fileSize);
		return newCf;
	}
}
