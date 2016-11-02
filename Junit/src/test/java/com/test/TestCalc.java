package com.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.les.Calc;



public class TestCalc {

	
	private static Calc calc;
	
	@BeforeClass
	public static void init(){
		
		calc = new Calc();
	}
	@AfterClass
	public static void destroy(){
		calc = null;
	}
	@Test
	public void testAdd(){
		int expected = calc.add(5, 5);
		int real = 10;
		Assert.assertEquals(expected,real );
		if(expected!= real){
			Assert.fail("hahhahah lol");
		}
		
		
	}
	 
	@Test
	public void testMultiply(){
		
		Assert.assertEquals("error",calc.multiply(2, 5),10 );
	}
	
	
	@Test
	public void testDevide(){
		
		Assert.assertEquals("error",calc.devide(10, 5),2 ,0.0000001);
	}
	
}
