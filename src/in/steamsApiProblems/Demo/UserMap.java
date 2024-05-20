package in.steamsApiProblems.Demo;

import java.util.Arrays;
import java.util.List;

public class UserMap {
	
	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("Arjun", "Ajay", "Balu", "Charan", "Amithab");
		
		System.out.println("*****to print names of with upper case*****");
		strList.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		
		System.out.println("*****to print length of the names*****");
		strList.stream().map(name -> name.length()).forEach(i -> System.out.println(i));
		
		System.out.println("*****to print length of the names starts with A*****");
		strList.stream().filter(name -> name.startsWith("A"))
		.map(name -> name +":"+ name.length())
		.forEach(name -> System.out.println(name));
		}

}
