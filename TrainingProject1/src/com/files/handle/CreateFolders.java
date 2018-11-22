package com.files.handle;

import java.io.File;

public class CreateFolders {

	public static void main(String[] args) {
		
		String flPath = "C:\\Users\\skakunuri\\Desktop\\Notes\\Data\\d\\d1";
		File fl = new File(flPath);
		fl.exists(); //return true if path/file exist
		fl.isDirectory(); //return true if it is folder
		fl.isFile();//return true if it is file
		
		fl.getAbsolutePath();//return entire file path
		fl.mkdir(); //creates single folder if it is not exist
		fl.mkdirs(); //creates complete folder path if it is not exist
		//flPath&"d1\\d2\\d3"
		
	}

}
