import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValid{

	public static boolean isValidMob(String str)
	{
		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher m = pattern.matcher(str);
		
		return (m.matches());
		
	}
	
	public static boolean isValidEmail(String str)
	{
		String mat_pat = "^^[A-Za-z0-9+_.-]+@(.+)\\.com$";
		Pattern pattern = Pattern.compile(mat_pat);
		Matcher m = pattern.matcher(str);
		
		return (m.matches());
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Mobile Number");
		String mob = sc.nextLine();
		
		try {
			if(isValidMob(mob))
			{
				System.out.println("Valid Mobile Number\n");
			}
			else
			{
				throw new InvalidMobileException("Not a valid Mobile Number\n");
			}
		}
		catch(InvalidMobileException a)
		{
			System.out.print("Invalid Number\n");
		}
		
		
		//----------------------------For Email--------------------------------------
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter an Email ID");
		String email = sc1.nextLine();
		
		try {
			if(isValidEmail(email))
			{
				System.out.println("Valid Email\n");
			}
			else
			{
				throw new InvalidEmailException("Not a valid Email\n");
			}
		}
		catch(InvalidEmailException a)
		{
			System.out.print("Invalid Email\n");
		}
		
		
		
		
		
	}
}
