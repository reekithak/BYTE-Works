
public class Candidate {

	String name;
	String tech_stack;
	String city;
	Integer yoe;
	
	public Candidate(String name,String tech_stack,String city,Integer yoe)
	{
		this.name = name;
		this.tech_stack = tech_stack;
		this.city = city;
		this.yoe = yoe;
	}
	
	void printall()
	{
		
		System.out.println(this.name);
		System.out.println(this.tech_stack);
		System.out.println(this.city);
		System.out.println(this.yoe);
	}
}
