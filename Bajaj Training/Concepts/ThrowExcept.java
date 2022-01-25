import java.io.FileNotFoundException;

public class ThrowExcept {

	public static void method3() throws NullPointerException
	{
		
		throw new NullPointerException();
	}

	
   public static void method2() throws FileNotFoundException
	{
		try
		{
			method3();
		}
		catch(NullPointerException e)
		{
		System.out.println("Exception of 3 caught: "+ e);
		}
		
		throw new FileNotFoundException();
		
	}
	
	
	public static void main(String[] args)
	{
		
		try
		{
			method2();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception of method 2 caught: "+ e);
			
		}
		
		System.out.println("Hello");
		
		
		
		
	}
	


}
