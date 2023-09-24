package testcases;

import org.testng.annotations.Test;

//import org.apache.logging.log4j.Logger;

import utilities.LoggerLoad;
//import utilities.*;
public class LoggerTest {

	
	
	//@Test
	public void test1() throws InterruptedException
	{
		LoggerLoad.info("<-------info----123------->");
		LoggerLoad.warn("<-------warn--qwe--------->");
		LoggerLoad.error("<-------err------its error----->");
	}
	
	public static void main(String[] args)throws InterruptedException {
		
		LoggerTest obj = new LoggerTest();
		obj.test1();
	}
}

