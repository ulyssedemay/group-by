import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputFile {
	
	private BufferedWriter writer = null;
	private String fileName = null;
	
	//Constructeur 
	public OutputFile(String fileName) {
		try {
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(fileName))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.fileName = fileName;
	}
	
	//Return the BufferReader 
	public BufferedWriter getReader () {
		return writer ;
	}
	
	//return the name of the file 
	public String getFileName() {
		return fileName;
	}
	
	//Return one line from the file
	public boolean writeLine(String line) {
		try {
			writer.write(line);
			writer.newLine();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		 
	}
	
	//Fermer le fichier 
	public void closeFile() {
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}