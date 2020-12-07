package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void alive()
	{
		Reporter.log("alive", true);
		Reporter.log("dead", true);
	}

}
