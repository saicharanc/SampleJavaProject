package com.testing.com.testing.units;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorTest {

	Calculator c = null;
	CalculatorService service = mock(CalculatorService.class);
			

	@Before
	public void setup(){
		c = new Calculator(service);
	}
	
	@After
	public void atTheEnd(){
		System.out.println("Releasing all the resources");
	}
	
	@Test
	public void testPerform(){
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2,3));
		verify(service).add(2, 3);
	}
	
}
