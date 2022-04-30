package projectarchiture.mavanjava;

import org.testng.annotations.Test;

public class APITest {

	@Test(groups={"Regression"})
	public void apihit() {
		System.out.println("API Hit");
	}

	@Test
	public void apiStart() {
		System.out.println("API Start");
	}
}
