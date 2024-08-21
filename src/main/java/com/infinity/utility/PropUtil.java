package com.infinity.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	FileInputStream fis = null;
	private String filePath;

	public PropUtil(String fPath) {
		this.filePath = fPath;
	}

	public String readPropertyFile(String FilePath, String Key) {
		try {
			fis = new FileInputStream(FilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String keys = prop.getProperty(Key);
		return keys;
	}

}
