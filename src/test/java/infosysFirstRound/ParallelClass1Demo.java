package infosysFirstRound;

import org.testng.annotations.Test;

public class ParallelClass1Demo {

	@Test
    public void testOne() throws InterruptedException {
        System.out.println("TestClassOne - testOne | Thread: " + Thread.currentThread().getId());
        Thread.sleep(1000);
    }

    @Test
    public void testTwo() throws InterruptedException {
        System.out.println("TestClassOne - testTwo | Thread: " + Thread.currentThread().getId());
        Thread.sleep(1000);
    }
	
	
	public static void main(String[] args) {
		

	}

}
