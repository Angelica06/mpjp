package s005;

//import java.util.Arrays;

public class Hello {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println("Hello!");
		//System.out.println(Array.toString(args));// mi converte in stringa l' array
		System.out.println("Length is "+args.length);
		
		System.out.println("Hello, " + args[0] + "!"); //mi stampa quello che scrio in input
	}
}
