package acb;

public class CallByValue {
//function to change the value of the parameters
	
	public static void Example(int x, int y) {
		x=30;
		y=40;
		System.out.println(x+" "+y);
		x++;
		y++;
		System.out.println(x+" "+y);

}
}

