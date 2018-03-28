package com.naturalprogrammer.java8tutorial;

public class App2 {
public static void main(String[] args) {
		
		System.out.println(process("Hello World!", String::toUpperCase));
	}

	private static String process(String string, Processor processor) {
		return processor.process(string);
	}

}