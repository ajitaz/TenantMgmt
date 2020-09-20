package io;

import java.io.IOException;

public class IOSystempackage {
public static void main(String[] args) throws IOException {
	System.out.println("Please enter charcter");
	int s = System.in.read();
	System.out.println(s);

	System.err.print("Error occurred");
}
}
