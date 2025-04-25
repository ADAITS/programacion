package services.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileService {
	
	File file;
	FileWriter writer;
	Scanner reader;
	
	public FileService(File file) throws IOException {
		this.file = file;
		//this.writer = new FileWriter(file);
		//this.reader = new Scanner(file);
		System.out.println("Fichero abierto en:" + file.getAbsolutePath());
	}
	
	public FileService(String path) throws IOException {
		this(new File(path));
	}
	
	public boolean exists() {
		return this.file.exists();
	}
	
	public void overwriteFile(String[] content) throws IOException {
		writer = new FileWriter(file);
		for (int i=0; i<content.length; i+=1) {
            writer.write(content[i] + "\n");
        }
		writer.close();
	}
	
	public void writeFile(String[] content) throws IOException {
		writer = new FileWriter(file, true);
		for (int i=0; i<content.length; i+=1) {
            writer.write(content[i] + "\n");
        }
		writer.close();
	}
	
	public void addToFile(String content) {
		
	}
	
	public String[] readFile() {
		ArrayList<String> lines = new ArrayList<String>();
		try {
			reader = new Scanner(file);
			while(reader.hasNext()) {
				lines.add(reader.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines.toArray(new String[0]);
	}
	

}
