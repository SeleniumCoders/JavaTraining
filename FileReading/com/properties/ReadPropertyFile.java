package com.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {
		//Load file into Stream Object
		FileInputStream filePath = new FileInputStream(".//ReasourceFiles//Config.properties");

		//Create Object of Properties class
		Properties config = new Properties();

		//Load Steam File to Propertis class
		config.load(filePath);

		System.out.println(config.get("url"));
	}
}
