package org.xtext.example.mydsl.generator;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileController {
	
	public FileController() {
		
	}
	
	public void writeFile(String file) {
		Path p= Paths.get("C:\\Users\\Schmidt\\Desktop\\JSchemaFile.txt");
		PrintWriter pr;
		
		try {
		 pr = new PrintWriter(Files.newBufferedWriter(p));
		} catch (IOException io) {
		 throw new RuntimeException("newBufferedWriter threw IO Exception");
		}
		 pr.write(file);
		
		pr.close();
	}

}
