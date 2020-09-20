package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CharacterStreamDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
		fr = new FileReader("abc.txt");
		fw = new FileWriter("b.txt",true);//,true  enables append mode
		int in = 0;
		fw.write(10);
		while( (in=fr.read())  !=-1 ) {
			System.out.print( (char) in);
			fw.write(in);
		}
		}catch(FileNotFoundException e) {
			System.out.println("Sorry File not foud");
		}catch(IOException e) {
			System.out.println("Sorry cannot read/write");
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("Sorry cannot close connection");	
			}
		}
		
	}
}
