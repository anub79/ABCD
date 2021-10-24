package acb;
import org.testng.annotations.Test;

public class SimpleTest {
	private int param;

	public SimpleTest(int param) {
		this.param = param;
	}
	@Test
	public void simpleTest1() {
		System.out.println("Simple Test Method1 "+param);
		
	}
	@Test
	public void simpleTest2() {
		System.out.println("Simple Test Method2 "+param);
		
	}
	@Test
	public void simpleTest3() {
		System.out.println("Simple Test Method3 "+param);
		
	}
	@Test
	public void simpleTest4() {
		System.out.println("Simple Test Method4 "+param);
		
	}
	@Test
	public void simpleTest5() {
		System.out.println("Simple Test Method5"+param);
		
	}

}


	
	






















