package in.steamsApiProblems.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingOerations {
	public static void main(String[] args) {
		
		Person p1=new Person("Sanjay","India");
		Person p2=new Person("Warner","Aus");
		Person p3=new Person("Jack","USA");
		Person p4=new Person("Ram","India");
		Person p5=new Person("Pollard","WI");
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		boolean status= persons.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println(status);
		
		boolean status2= persons.stream().allMatch(p -> p.country.equals("India"));
		System.out.println(status2);
		
		boolean status3= persons.stream().noneMatch(p -> p.country.equals("India"));
		System.out.println(status3);
		
		Optional<Person> optional = persons.stream().filter(p -> p.country.equals("India")).findAny();
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		Optional<Person> optional2 = persons.stream().filter(p -> p.country.equals("India")).findFirst();
		if(optional2.isPresent()) {
			System.out.println(optional2.get());
		}
	}
}

class Person{
	String name;
	String country;
	
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
	
}