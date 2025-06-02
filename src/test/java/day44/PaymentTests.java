package day44;

import org.testng.annotations.Test;

public class PaymentTests {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void paymentinRupees()
	{
		System.out.println("this is payment in rupees....");
	}
	
	@Test(priority=2, groups= {"sanity","regression","functional"})
	void paymentinDollers()
	{
		System.out.println("this is payment in dollers....");
	}
	
	
	
	
	
	
	
}
