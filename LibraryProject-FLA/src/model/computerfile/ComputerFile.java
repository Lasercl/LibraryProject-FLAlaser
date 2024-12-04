package model.computerfile;

import model.author.Author;
import model.bibliography.Bibliography;

public class ComputerFile extends Bibliography{
	private String dateCreated;
    private String format;
<<<<<<< HEAD
    private Pdf pdf;
    public ComputerFile(String title, Author author, String subject, String dateCreated, String format,Pdf pdf){
=======
    double fileSize;
    
//    private Pdf pdf;
    public ComputerFile(String title, Author author, String subject, String dateCreated, String format, double fileSize){
>>>>>>> 0afd445fe4789df678d4e5740a347f866b83b4e8
        super(title, author, subject);
        this.dateCreated = dateCreated;
        this.format = format;
        this.fileSize = fileSize;
//        this.pdf=pdf;
    }
    
    public String getDateCreated() {
        return dateCreated;
    }

    public String getFormat() {
        return format;
    }
    
    
    
<<<<<<< HEAD
    public Pdf getPdf() {
		return pdf;
	}

	public void setPdf(Pdf pdf) {
		this.pdf = pdf;
=======
    public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
>>>>>>> 0afd445fe4789df678d4e5740a347f866b83b4e8
	}

	public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    
}



