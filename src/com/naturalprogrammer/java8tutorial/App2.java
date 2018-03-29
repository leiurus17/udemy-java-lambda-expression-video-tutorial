package com.naturalprogrammer.java8tutorial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;

public class App2 {
	public static void main(String[] args) {

		String prefix = "MR. ";

		System.out.println(process("Hello World!", str -> str.toLowerCase()));
		System.out.println(process("Hello World!", String::toLowerCase));

		System.out.println(process2("Hello World!", 5, (str, i) -> str.substring(i)));
		System.out.println(process2("Hello World!", 5, String::substring));
		
		System.out.println(process("Hello World!", str -> prefix.concat(str)));
		System.out.println(process("Hello World!", prefix::concat));
		
		String[] names = {"Mr Sanjay", "Ms Trupti", "Dr John"};
		String[] names2 = {"Mr Sanjay", "Ms Trupti", "Dr John"};
		
		Arrays.sort(names, new Comparator<String>() {
			
			public int compare(String name1, String name2) {
				return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
			}
		});
		
		Arrays.sort(names2, (name1, name2) ->
			name1.split(" ")[1].compareTo(name2.split(" ")[1])
		);
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(names2));

	}

	private static String process2(String string, int i, BiFunction<String, Integer, String> processor) {
		return processor.apply(string, i);
	}

	private static String process(String string, Processor processor) {
		return processor.process(string);
	}

}