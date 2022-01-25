import java.util.Scanner;



public class newmain {

	
	class AgeDemo
	{
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.print("Enter ur age :: \n");
			int age = s.nextInt();
			
			
			try {
				if(age<18)
					throw new InvalidAgeException(age +" is not a valid age to vote\n");
				else
					System.out.print("Valid Age, allowed to vote");
			}
			catch(InvalidAgeException a)
			{
				System.out.print("Invalid Age\n");
			}
		}
	}
}
