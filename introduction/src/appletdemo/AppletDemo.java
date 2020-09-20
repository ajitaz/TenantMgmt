package appletdemo;
import java.applet.*;
import java.awt.*;

public class AppletDemo extends Applet{
	@Override
	public void init() {
		Label lab = new Label("hello");
		add(lab);
	}
	@Override
	public void start() {
		System.out.println("Starting");
	}
	@Override 
	public void stop() {
		System.out.println("Stoped");
	}
	@Override
	public void destroy() {
		System.out.println("Destory");
	}
}
