package org.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
@BeforeClass
public static void tc01()
{
	System.out.println("Tc01");
}
@Before
public void tc02()
{
	System.out.println("Tc02");
}
@Test
public void tc03()
{
	System.out.println("Tc03");
}
@After
public void tc04()
{
	System.out.println("Tc04");
}
@AfterClass
public static void tc05()
{
	System.out.println("Tc05");
}
}
