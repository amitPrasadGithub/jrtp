package com.vb.mini1.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	public static Properties message = null;
	
	static {
		try {
		message = new Properties();
		message.load(new FileInputStream("src"+File.separator+"main"+File.separator+"resources"+File.separator+"message.properties"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
