package com.naturalprogrammer.java8tutorial;

/**
 * 
 * @author Lon
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		System.out.println(process("Hello World!", (str) -> {
				return str.toLowerCase();
			}));
	}

	private static String process(String string, Processor processor) {
		return processor.process(string);
	}

}

interface Processor {
	String process(String str);
}
