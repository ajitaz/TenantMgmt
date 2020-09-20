package appletdemo;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Applet3 extends Applet {
	@Override
	public void init() {
		
	}
	public void paint (Graphics g) {
		for (int i=0;i<10;i++) {
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
			}
			g.drawLine(1, 1, i*10, i*10);
			
		}
	}
	@Override
	public void stop() {
		System.out.println("Stopped");
	}
	@Override 
	public void destroy() {
		System.out.println("Destroyed");
	}
}
