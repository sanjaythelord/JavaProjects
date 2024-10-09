package Java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		for(int i=1;i<10;i++) {
			values.add(i);
		}
		System.out.println("First output:");
		//forEach with StreamAPI
		values.stream().forEach(System.out::println);
		//advantages of using stream
		System.out.println("Second output:");
		values.parallelStream().forEach(System.out::println);
		// for printing larger values suppose say 100000 and concurrently
		//perform other such as multi threading
		System.out.println("Third output:");
		System.out.println(values.stream().filter(i -> {
			System.out.println("hi");//optional value
			return true;
		}).findFirst());
		
		
		List<Integer> val = Arrays.asList(1,2,3,4,5);
		Stream<Integer> s = val.stream();
		s.forEach(System.out::println);
		//once stream is used we cannot use it again 
		//s.forEach(System.out::println);

	}

}
