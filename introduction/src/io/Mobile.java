package io;

import java.io.Serializable;

public class Mobile implements Serializable{
	int ram;
	String camera;
	Mobile(int ram, String camera){
		this.ram=ram;
		this.camera=camera;
	}
	public void test() {
		System.out.println("tring tring");
	}
}
