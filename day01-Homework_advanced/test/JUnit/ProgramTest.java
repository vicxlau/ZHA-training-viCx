package JUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import controller.PSSGameController;

public class ProgramTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		PSSGameController g = new PSSGameController();
		g.execute();
		
	}

}
