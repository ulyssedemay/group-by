
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class InputFile {
	private BufferedReader reader = null;
	private String fileName = null;
	
	//Constructor 
	public InputFile(String fileName) {
		try {
			reader = new BufferedReader(new FileReader(fileName));			
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.fileName = fileName;
	}
	
	//Return the BufferedReader 
	public BufferedReader getReader () {
		return reader ;
	}
	
	//Return the name of the file 
	public String getFileName() {
		return fileName;
	}
	
	//Return one line from the file
	public String readLine() {
		try {	
			String line = reader.readLine();
			if(line != null) {
				return line; 
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return null; 
	}
	
	//Close the BufferedReader
	public void closeFile() {
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}