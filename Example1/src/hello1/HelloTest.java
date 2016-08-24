package hello1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hello.Hello;

public class HelloTest {
	
	@BeforeClass
	public  static void before(){
		System.out.println("before");
	}
	
	@AfterClass
	public static  void after(){
		System.out.println("after");
	}

	@Test
	public void lengthTestTest() {
		Hello hello= new Hello();
		assertFalse(hello.lengthTest("mewael"));
		assertTrue(hello.lengthTest("mewae"));
		assertTrue(hello.lengthTest("aronn"));
		assertTrue(hello.lengthTest("andemariam"));
	
	}
	
	@Test
	public void addTest(){
		Hello add= new Hello();
		int number= add.add(1, 2);
		assertEquals(3,number);
	}

}
