package com.exceptionsHandling.throwsKeyWord;

import java.io.IOException;

public class FileReading {
	
	
	public void readFile() throws IOException
	{
		System.out.println("File is opened");
		//throw new IOException("Error");
		System.out.println("File is reading");
	}

}
