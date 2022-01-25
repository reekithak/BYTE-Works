import java.util.Arrays;
import java.util.List;

public class Working {

	public static void main(String[] args)
	{
		List<String> city =  Arrays.asList("pune","mumbai","chennai","bangalore","noida");
		List<String> names = Arrays.asList("atul","rishab","akshay","suresh","rahul");
		List<String> airlines = Arrays.asList("airindia","vistara","spicejet","indigo","airasia");
		List<Integer> num1 = Arrays.asList(5,7,13,9,1);
		List<Integer> num2 = Arrays.asList(6,7,2,5);
		
		
		// 1
		System.out.println("---------First--------");
		city.stream().filter(str->str.length()>5).forEach(System.out::println);
		
		//2
		System.out.println("----------Second----------");
		names.stream().filter(str->str.endsWith("l")).forEach(System.out::println);
		
		//3
		System.out.println("------------Third-------------");
		airlines.stream().map(str->str.length()).forEach(System.out::println);
		
		
		//4 
		System.out.println("------------Fourth-------------");
		System.out.print(num1.stream().reduce(0,(a,b)->a+b));
		
		System.out.println("\n");
		//5
		System.out.println("----------Fifth------------");
		System.out.print(num2.stream().max(Integer::compare).get());
	}
	
}
