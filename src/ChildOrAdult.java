import java.util.Scanner;

public class ChildOrAdult {
//Write a function that takes an integer which is a person's age and returns a string that says whether the person is a child, an adult, or old person.
//Say, a child is anyone younger than 18, an adult is between 18 and 65, and an old person is more than 65 years old.
//Напишите функцию, которая принимает целое число, являющееся возрастом человека, и возвращает строку, в которой говорится,
//является ли человек ребенком, взрослым или пожилым человеком. Скажем, ребенок - это любой человек моложе 18 лет, взрослый -
//от 18 до 65 лет, а пожилой человек - старше 65 лет.
	
	public static String findage() {
		
		Scanner Sc2 = new Scanner(System.in);
		System.out.println("Input age: ");
		
		int b = Sc2.nextInt();
		
		if (b<18) {
			return("You are a child");
		}
		else if (18<=b && b<65) {
			return("You are an adult");
		}
		else if (65<=b) {
			return("You are elderly");
		}
			return null;
	}
}