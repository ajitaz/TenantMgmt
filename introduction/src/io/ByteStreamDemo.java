package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
		fis = new FileInputStream("abc.txt");
		fos = new FileOutputStream("b.txt",true);//,true  enables append mode
		int in = 0;
		fos.write(10);
		while( (in=fis.read())  !=-1 ) {
			System.out.print( (char) in);
			fos.write(in);
		}
		}catch(FileNotFoundException e) {
			System.out.println("Sorry File not foud");
		}catch(IOException e) {
			System.out.println("Sorry cannot read/write");
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				System.out.println("Sorry cannot close connection");	
			}
		}
		
	}
}
