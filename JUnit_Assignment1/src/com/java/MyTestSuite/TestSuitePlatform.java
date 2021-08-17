package com.java.MyTestSuite;

import com.java.MyTestClasses.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({test_Power_of_two.class, test_Power_of_two.class, test_Sum_of_Natural.class,
					test_Sum_of_Square_itsDifference.class })
public class TestSuitePlatform {

}
