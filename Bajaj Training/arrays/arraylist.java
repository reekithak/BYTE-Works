import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {

			ArrayList<String> arr = new ArrayList();
			arr.add("mango");
			arr.add("apple");
			arr.add("banana");
			arr.add("grapes");
			
			
			for(String i:arr)
			{
				System.out.print(i+"\n");
			}
			System.out.print("using Iterator \n");
			
			Iterator itr = arr.iterator();
			
			while(itr.hasNext())
			{
				Object ele = itr.next();
				System.out.print(ele + "\n");
			}
	

	}

}
