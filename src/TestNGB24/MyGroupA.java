package TestNGB24;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyGroupA {
	
	@Test(groups = { "smoke" })
	public void test1(){
		System.out.println("I m in group a test 1");
	}
	
	@Test(groups = { "smoke","fundTrasfer" })
	public void test2(){
		System.out.println("I m in group a test 2");
	}
	
	@Test(groups = { "Regression", "smoke" })
	public void test3(){
		System.out.println("I m in group a test 3");
	}
	
	@Test(groups = { "Regression" })
	public void test4(){
		System.out.println("I m in  group a test 4");
	}

}
