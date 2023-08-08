package TestNGB24;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyGroupB {
	
//	@Test(groups = { "smoke","smoke 1" })
//	public void test1(){
//		System.out.println("I m in test 1");
//	}
	
	@Test(groups = { "smoke" })
	public void test21(){
		System.out.println("I m in group b test 2");
	}
	
	@Test(groups = { "Regression", "smoke" })
	public void test31(){
		System.out.println("I m in  group b test 3");
	}
	
	@Test(groups = { "Regression" })
	public void test41(){
		System.out.println(" I m in group b test 4");
	}

}
