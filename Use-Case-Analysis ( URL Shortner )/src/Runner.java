import java.util.Scanner;

public class Runner {

	
	public static void main(String args[]) {
		URLShortener u = new URLShortener(5, "www.myshorturl.com/");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Link to Shorten:\n");
		String str_ = sc.nextLine();
		String urls[] = {str_};

		
		
		for (int i = 0; i < urls.length; i+=2) {
			System.out.println("URL:" + urls[i] + "\tTiny: "
					+ u.shortenURL(urls[i]) + "\tExpanded: "
					+ u.expandURL(u.shortenURL(urls[i])));
		}
	}
}

