package in.steamsApiProblems.Demo;

import java.util.Arrays;
import java.util.List;

public class SlicingOperations {
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Harsha","Rithvik","Suri","Satya","Rama");
		
		names.stream().limit(3).forEach(n -> System.out.println(n));
		
		names.stream().skip(2).forEach(name -> System.out.println(name));
		
		List<String> str2=Arrays.asList("Harsha","Rama","Suri","Suri","Rama","Harsha");
		str2.stream().distinct().forEach(d -> System.out.println(d));
	}

}
