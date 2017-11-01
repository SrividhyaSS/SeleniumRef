package demopackage;


import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class VerifyingFacoryCases 
{
	private int id;
	
	public VerifyingFacoryCases (int id)
	{
		this.id = id;
		
	}
  @Test
  public void TestMethod1() 
  
  {
	  int outputvalue = id +1;
	  System.out.println("TestNMethod1 outputvalue is :"+outputvalue);
	  
  }
  
  @Test
  
public void TestMethod2() 
  
  {
	  int outputvalue = id +1;
	  System.out.println("TestNMethod2 outputvalue is :"+outputvalue);
	  
  }
  
  public static class SimpeTestFactory
  {
	  @Factory
	  public Object [] factoryMethod()
	  {
		return new Object [] {new VerifyingFacoryCases(0), new VerifyingFacoryCases(1)};
		
				
	  }
  }
  
	  
		  
	 
  }

