package day44;

import org.testng.annotations.Test;

public class SignUpTests {

	@Test(priority=1, groups= {"regression"})
	void signupbyemail()
	{
		System.out.println("this is sign up by email");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("this is sign up by facebook");
	}
	
	@Test(priority=3, groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("this is sign up by twitter");
	}
	
	
	
	
	
}
