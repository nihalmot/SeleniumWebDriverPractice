package infosysFirstRound;

import org.testng.annotations.Test;

public class ParallelClass2Demo {

	@Test
    public void testThree() throws InterruptedException {
        System.out.println("TestClassTwo - testThree | Thread: " + Thread.currentThread().getId());
        Thread.sleep(1000);
    }

    @Test
    public void testFour() throws InterruptedException {
        System.out.println("TestClassTwo - testFour | Thread: " + Thread.currentThread().getId());
        Thread.sleep(1000);
    }
	
	
	public static void main(String[] args) {
		
		

	}

}
