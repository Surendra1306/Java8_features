package in.steamsApiProblems.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
	
	public static void main(String[] args) {
		
		List<String> backend=Arrays.asList("Java","Dotnet","Nodejs","Python");
		List<String> frontend=Arrays.asList("Html","Css","React","Bootstrap");
		
		List<List<String>> courses=Arrays.asList(backend,frontend);
		
		Stream<String> flatMap = courses.stream().flatMap(s -> s.stream());
		flatMap.forEach(c -> System.out.println(c));
		//or
		//courses.stream().flatMap(s -> s.stream()).forEach(c -> System.out.println(c));
	}

}
