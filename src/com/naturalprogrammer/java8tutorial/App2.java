package com.naturalprogrammer.java8tutorial;

public class App2 {
public static void main(String[] args) {
		
		System.out.println(process("Hello World!", str -> str.toLowerCase()));
		System.out.println(process("Hello World!", String::toLowerCase));
		
		
	}

	private static String process(String string, Processor processor) {
		return processor.process(string);
	}

}