package in.steamsApiProblems.Demo; 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//2
public class StreamExample2 {
	
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(33,65,11,21,1,77,14,98);
		
		System.out.println("******First Approach************");
		
		for(int i:list) {
			if(i>10) {
				System.out.println(i);
			}
		}
		
		System.out.println("******Second Approach************");
		
		Stream<Integer> stream = list.stream();
		Stream<Integer> filter = stream.filter(i -> i>20);
		filter.forEach(i -> System.out.println(i));
		
		System.out.println("*******Third Approach****************");
		
		list.stream().filter(i -> i>30).forEach(i -> System.out.println(i));
		

		System.out.println("*******WAP to sort names start with A ****************");
		
		List<String> strList=Arrays.asList("Ajay","Arun","Vikas","Amar","Jaya","Krinsna");
		strList.stream().filter(names -> names.startsWith("A")).forEach(names -> System.out.println(names));
	}

}
