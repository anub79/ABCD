package acb;

import org.testng.annotations.Factory;

public class FactoryClass {

	@Factory
	public Object[] factoryMethod() {

		Object[] data = new Object[5];
		
		data[0] = new SimpleTest(10);
		data[1] = new SimpleTest(10);
		data[2] = new SimpleTest(10);
		data[3] = new SimpleTest(10);
		data[4] = new SimpleTest(10);

		return data;
	}
}
