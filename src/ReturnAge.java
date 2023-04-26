import java.util.Scanner;

public class ReturnAge {
//Write a function that takes an integer which is an age of a person and returns a string that says something like "this person's age is XXX"
//Напишите функцию, которая принимает целое число, являющееся возрастом человека, и возвращает String, которая говорит что-то вроде "возраст этого человека - XXX"
	
	public static String retage() {
		
		Scanner Sc1 = new Scanner(System.in);
		System.out.println("Input age: ");
		
		int a = Sc1.nextInt();
		
		return ("This is your age: " + a);
	}
}