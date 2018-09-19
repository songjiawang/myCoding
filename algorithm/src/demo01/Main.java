package demo01;

public class Main {
	static{
		System.out.println("static block");
	}
	{
		System.out.println("not static block");
	}
	public static void main(String[] args) {
		new Main();
		new Main();
	}
	
}
