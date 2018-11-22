package com.files.handle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData_Txt {

	public static void main(String[] args) throws IOException {
		
		String flPath = "C:\\Users\\skakunuri\\Desktop\\Notes\\Data\\Demo1.txt";
		FileWriter fr = new FileWriter(flPath,true); //true will append data
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("qewwefds");
		br.newLine();
		br.write("qwert");
		br.newLine();
		
		br.close();
		fr.close();

	}

}






