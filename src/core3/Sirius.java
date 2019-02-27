package core3;

public class Sirius extends Star{
	
	public static int population4 = 25000;
	public static String polution4 = "very poluted";
	
	public static int method() 
	{
		return population4;
	}
	
	
	public static String method2() 
	{
		return polution4;
	}


	@Override
	public int methodAny2() {
		
		return 0;
	}


	public static int getPopulation4() {
		return population4;
	}


	public static void setPopulation4(int population4) {
		Sirius.population4 = population4;
	}


	public static String getPolution4() {
		return polution4;
	}


	public static void setPolution4(String polution4) {
		Sirius.polution4 = polution4;
	}

	
	

	
	
	

}
