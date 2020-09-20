package exceptionHandling;


public class TestThrow {
	
	public static void valid(int age) {
		
		if(age<18) {
			throw new ArithmeticException("not elligible");
		}
		else {
			System.out.println("Please vote the right person");
		}
	}
	public static void main(String[] pp) {
		try {
		valid(20);
		}
		catch(Exception e) {
			System.out.println("error");
		}
		System.out.println("finish");
	}
}
