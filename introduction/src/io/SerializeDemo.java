package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		try {
		
		fos = new FileOutputStream("b.ser");
		oos = new ObjectOutputStream(fos);
		Mobile m = new Mobile(2,"nice camera");
		oos.writeObject(m);
		}catch(FileNotFoundException e) {
			System.out.println("Sorry File not foud");
		}catch(IOException e) {
			System.out.println("Sorry cannot read/write");
		}finally {
			try {
				oos.close();
				
			
				fos.close();
			} catch (IOException e) {
				System.out.println("Sorry cannot close connection");	
			}
		}
	}
}
