package appTest;

import app.Calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
	@BeforeClass
	public static void BeforeEverything() {
		System.out.println("DB Connection Opens");
		System.out.println(" ");
	}
	
	@Test
	public void addTest() {
		System.out.println("TestCase for Add Method");
		Calc c = new Calc();
		int exResult =20;
		int acResult=c.add(10,10);
		Assert.assertEquals(exResult, acResult);
		}
	@Test
	public void subTest() {
		System.out.println("TestCase for Sub Method");
		Calc c = new Calc();
		int exResult =0;
		int acResult=c.sub(10,10);
		Assert.assertEquals(exResult, acResult);
	}
	@Test
	public void multTest() {
		System.out.println("TestCase for Mult Method");
		Calc c = new Calc();
		int exResult =100;
		int acResult=c.mult(10,10);
		Assert.assertEquals(exResult, acResult);
	}
	@Test
	public void divTest() {
		System.out.println("TestCase for Div Method");
		Calc c = new Calc();
		int exResult =1;
		int acResult=c.div(10,10);
		Assert.assertEquals(exResult, acResult);
	}
	@Test(expected = ArithmeticException.class)
	public void divTestByZero() {
		System.out.println("TestCase for Div Method by ZERO");
		Calc c = new Calc();
		c.div(10,0);
	}
	
	@Test
	public void addDoubleTest() {
		System.out.println("TestCase for Add Double Method");
		Calc c = new Calc();
		double exResult = 20.0;
		double acResult=c.MethodForDouble(10,10);
		Assert.assertEquals(exResult,acResult,0);
		}
	@Before
	public void before() {
		System.out.println("BEFORE: TSS is doing some Testing...");
	}
	@After
	public void after() {
		System.out.println("AFTER: TSS is doing some Testing...");
		System.out.println(" ");
	}
	@AfterClass
	public static void afterEverything() {
		System.out.println("DB Close");
	}

}
