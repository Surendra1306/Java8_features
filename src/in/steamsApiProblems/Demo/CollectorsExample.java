package in.steamsApiProblems.Demo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class CollectorsExample {

 
	public static void main(String[] args) {
		
		Person1 p1=new Person1("Sanjay","India");
		Person1 p2=new Person1("Warner","Aus");
		Person1 p3=new Person1("Jack","USA");
		Person1 p4=new Person1("Ram","India");
		Person1 p5=new Person1("Pollard","WI");
		
		List<Person1> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		 List<Person1> collect = persons.stream().filter(ct -> ct.country.equals("India"))
		 				 .collect(Collectors.toList());
		 System.out.println(collect.size());
		 collect.forEach(name -> System.out.println(name));
		 
		 //names belong to india and store into names collections-print only names
		 
		 List<String> nameList =  persons.stream().filter(n -> n.country.equals("India"))
				 						 .map(n -> n.name)
		 				 				 .collect(Collectors.toList());
		 System.out.println(nameList);
}
}
class Person1{
	String name;
	String country;
	
	public Person1(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}	
}
