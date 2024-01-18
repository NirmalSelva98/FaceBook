package org.base;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class Unit2 {
@RunWith(Suite.class)
@SuiteClasses({Junit.class,Junit1.class})
public class JunitSuiteLevel{
}
}