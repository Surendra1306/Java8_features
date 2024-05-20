package in.steamsApiProblems.Demo;

import java.util.stream.Stream;

public class UserFilter {
	public static void main(String[] args) {
		
		User u1=new User("Amar",34);
		User u2=new User("Akash",22);
		User u3=new User("Vijay",55);
		User u4=new User("Ajay",12);
		 
		Stream<User> stream=Stream.of(u1,u2,u3,u4);
		
//stream.filter(u -> u.age>20 && u.name.startsWith("A").forEach(u -> System.out.println(u));
		
		stream.filter(u -> u.age>20)
			  .filter(u -> u.name.startsWith("A"))
			  .forEach(u -> System.out.println(u));
	}

}

class User{
	
	String name;
	Integer age;
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
