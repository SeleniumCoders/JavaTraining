package com.exceptionsHandling.throwsKeyWord;

import java.io.IOException;

public class ClassName {
	
	public static void main(String[] args) {
		FileReading f = new FileReading();
		//f.readFile();
		try {
			f.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
