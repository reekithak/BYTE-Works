import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewRepo {

		public static void main(String[] args)
		{
			
			Candidate c1 = new Candidate("ramesh","java","pune",5);
			Candidate c2 = new Candidate("raman","java","banglore",4);
			Candidate c3 = new Candidate("soumya","c","pune",11);
			Candidate c4 = new Candidate("raghu","java","chennai",3);
			Candidate c5 = new Candidate("pramod","java","mumbai",1);
			Candidate c6 = new Candidate("trisha","c","pune",0);
			Candidate c7 = new Candidate("nandan","c++","chennai",0);
			Candidate c8 = new Candidate("jeevan","java","mumbai",1);
			Candidate c9 = new Candidate("priya","java","banglore",11);
			Candidate c10 = new Candidate("priyanka","c++","chennai",4);
			
			List<Candidate> ls = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10);
			
			
			System.out.println("---------------Pune Candidates--------------------");
			List<Candidate> c_list = ls.stream().filter(t->t.city=="pune").collect(Collectors.toList());
			
			for(int i=0;i<c_list.size();i++)
			{
				
				System.out.print("Student "+i+"\n");
				c_list.get(i).printall();
				
			}
			
			
			//---------------------------------------------------------------------------
			System.out.println("---------------Fresher Candidates--------------------");
			List<Candidate> c_list1 = ls.stream().filter(t->t.yoe==0).collect(Collectors.toList());
			
			for(int i=0;i<c_list1.size();i++)
			{
				
				System.out.print("Student "+i+"\n");
				c_list1.get(i).printall();
				
			}
			
			//----------------------------------------------------------------------------
			
			System.out.println("---------------Max YOE Candidates--------------------");
			
			List<Integer> yoes = new ArrayList<>();
			for(int i=0;i<ls.size();i++)
			{
				yoes.add(ls.get(i).yoe);
			}
			
			Integer max_yoe = Collections.max(yoes);
			
			
					
			List<Candidate> c_list2 = ls.stream().filter(t->t.yoe==max_yoe).collect(Collectors.toList());
			
			for(int i=0;i<c_list2.size();i++)
			{
				
				System.out.print("Student "+i+"\n");
				c_list2.get(i).printall();
				
			}
			
			
//----------------------------------------------------------------------------
			
			System.out.println("---------------Tech C Candidates--------------------");
	
					
					
			List<Candidate> c_list3 = ls.stream().filter(t->t.tech_stack=="c").collect(Collectors.toList());
			
			for(int i=0;i<c_list3.size();i++)
			{
				
				System.out.print("Student "+i+"\n");
				c_list3.get(i).printall();
				
			}
			
			
			
			
		}
		
}
