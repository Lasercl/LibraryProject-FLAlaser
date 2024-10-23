package factory;

import model.author.Author;
import model.bibliography.Bibliography;
import model.computerfile.ComputerFile;

public class ComputerFileFactory extends BibliographyFactory{

	@Override
	public Bibliography createBibliography(String title, Author author) {
//		String subject="Computer File";
//		ComputerFile newCF=createcompfile(String title, Author author, String subject, String dateCreated, String format, double fileSize) ;
//		return newCF;
	}
	public Bibliography createBibliography(String title, Author author, String subject, String dateCreated, String format, double fileSize) {
		ComputerFile newCF=new ComputerFile(title, author, subject, dateCreated, format, fileSize);
		return newCF;

	}
	
	
}
