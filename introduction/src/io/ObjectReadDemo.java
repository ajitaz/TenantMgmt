package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadDemo {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois=null;
		try {
		
		fis = new FileInputStream("b.txt");
		ois = new ObjectInputStream(fis);
		Mobile n = (Mobile) ois.readObject();
		System.out.println("Ram="+n.ram);
		System.out.println("Camera="+n.camera);
		n.test();
		}catch(FileNotFoundException e) {
			System.out.println("Sorry File not foud");
		}catch(IOException e) {
			System.out.println("Sorry cannot read/write");
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry class not found");
		}finally {
			try {
				ois.close();
				
			
				fis.close();
			} catch (IOException e) {
				System.out.println("Sorry cannot close connection");	
			}
		}
	}
}
