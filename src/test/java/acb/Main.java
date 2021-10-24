package acb;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// instance of class is created
		CallByValue object = new CallByValue();
		System.out.println("Value of a:" + a + "& b : " + b);

		// Passing variables in the class function
		object.Example(a, b);
        //Displaying the values after calling the function
		System.out.println("Value of a:"+a+"&b:"+b);
	}

	public static void change(int x) {
		x = 10;
		System.out.println(x);
	}

}
