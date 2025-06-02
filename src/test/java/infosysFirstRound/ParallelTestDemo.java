package infosysFirstRound;

import org.testng.annotations.Test;

public class ParallelTestDemo {

	@Test
	public void testCase1() throws InterruptedException {
		System.out.println("TestCase1 - Executing on thread: " + Thread.currentThread().getId());
		Thread.sleep(1000);
	}

	@Test
	public void testCase2() throws InterruptedException {
		System.out.println("TestCase2 - Executing on thread: " + Thread.currentThread().getId());
		Thread.sleep(1000);
	}

	@Test
	public void testCase3() throws InterruptedException {
		System.out.println("TestCase3 - Executing on thread: " + Thread.currentThread().getId());
		Thread.sleep(1000);
	}

	@Test
	public void testCase4() throws InterruptedException {
		System.out.println("TestCase4 - Executing on thread: " + Thread.currentThread().getId());
		Thread.sleep(1000);
	}

	public static void main(String[] args) {

	}

}
