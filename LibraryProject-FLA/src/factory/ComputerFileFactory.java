package factory;

import adapter.WordToPdf;
import model.author.Author;
import model.bibliography.Bibliography;
import model.computerfile.ComputerFile;
import model.computerfile.Pdf;
import model.computerfile.Word;

public class ComputerFileFactory extends BibliographyFactory{
//	public ComputerFile createCf(String title, Author author, String subject, String dateCreated, String format, double fileSize,Pdf pdf) {
//		ComputerFile newCf=new ComputerFile(title, author, subject, dateCreated, format, fileSize, pdf);
//		return newCf;
//	}
//	public ComputerFile createCf(String title, Author author, String subject, String dateCreated, String format, double fileSize,Word word) {
//		WordToPdf adapter=new WordToPdf(word.getFileSize());
//		ComputerFile newCf=new ComputerFile(title, author, subject, dateCreated, format, fileSize, adapter);
//		return newCf;
//	}
	public ComputerFile createCf(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
		ComputerFile newCf=null;
		if(format.equalsIgnoreCase("pdf")) {
			Pdf pdf=new Pdf(fileSize);
			newCf=new ComputerFile(title, author, subject, dateCreated, format, pdf);
//			return newCf;
		}else if(format.equalsIgnoreCase("word")) {
			Word word=new Word(fileSize);
			WordToPdf adapter=new WordToPdf(word.getFileSize());
			newCf=new ComputerFile(title, author, subject, dateCreated, format, adapter);
//			return newCf;
		}
		return newCf;
		
	}
}
