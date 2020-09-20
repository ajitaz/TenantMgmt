package finalKeyword;

public class Flim extends Movie{
	
/**public void gift() {
		System.out.println("this is film"); //cannot override,due to final keyword in method gift() of Parent class "Movie" 
} */
	public static void main(String[] args) {
		final double PI=3.14286;
		System.out.println(PI);
		Flim f=new Flim();
		f.gift();
	}
}
