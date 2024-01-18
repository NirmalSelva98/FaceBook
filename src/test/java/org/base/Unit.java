package org.base;

import org.junit.Assert;
import org.junit.Test;

public class Unit extends BaseClass {
@Test
public void tc01() {
	String s = "Java";
	boolean equals = s.equals("Java");
	System.out.println(equals);
	Assert.assertTrue(equals);
	System.out.println("Test Program");
}
	@Test
	public void tc02() {
		String s = "Java";
		boolean equals = s.equals("Java");
		System.out.println(equals);
		Assert.assertFalse(equals);
		System.out.println("Test Program");
}
	public void tc03() {
		String s = "Java";
				Assert.assertEquals(s, "Java");
		System.out.println("message");
}
}
