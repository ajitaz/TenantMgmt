package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
		fr = new FileReader("abc.txt");
		fw = new FileWriter("b.txt",true);//,true  enables append mode
		br = new BufferedReader(fr);
		bw = new BufferedWriter(fw);
		int in = 0;
		bw.write(10);
		while( (in=br.read())  !=-1 ) {
			System.out.print( (char) in);
			bw.write(in);
		}
		}catch(FileNotFoundException e) {
			System.out.println("Sorry File not foud");
		}catch(IOException e) {
			System.out.println("Sorry cannot read/write");
		}finally {
			try {
				br.close();
				bw.close();
				fr.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("Sorry cannot close connection");	
			}
		}
		
	}
}
