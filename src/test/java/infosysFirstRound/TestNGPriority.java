package infosysFirstRound;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority=-2)
	public static void method1()
	{
		System.out.println("this is method1");
	}


	@Test(priority=-3)
	public static void method2()
	{
		System.out.println("this is method2");
	}
	

	@Test(priority=1)
	public static void method3()
	{
		System.out.println("this is method3");
	}
	

	@Test
	public static void method4()
	{
		System.out.println("this is method4");
	}
	

	@Test
	public static void method5()
	{
		System.out.println("this is method5");
	}
	
	
	
	public static void main(String[] args) {
		
		method1();
		method2();
		method3();
		method4();
		method5();
		
	}

}
