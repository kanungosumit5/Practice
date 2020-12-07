package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomPractice;

public class TestFrameWork extends BaseTest
{
	@Test
	public void htmlDemo() throws IOException
	{
		PomPractice p=new PomPractice(driver);
		p.submit();
	}
	

}
