import java.util.Scanner;

public class Lesson2 {
		
	//Метод, который считывает целое число из входного потока и возвращает его.
	
	public static int readInt(String prompt) {
		Scanner sc1 = new Scanner(System.in);
		int inputNumber = -1;
		System.out.println(prompt);
		while (inputNumber == -1) {
			try {
				inputNumber = (sc1.nextInt());
				System.out.println(inputNumber);
			} 
			catch(Exception e) {
				System.out.println("Exception" + e);
			}
		}
		return inputNumber;
	}
	
	//Write a function that takes an integer which is an age of a person and returns a string that says something like "this person's age is XXX"
	//Напишите функцию, которая принимает целое число, являющееся возрастом человека, и возвращает String, которая говорит что-то вроде "возраст этого человека - XXX"
	
	public static String retAge() {
		int inputAge = readInt("Input age: ");
		String resultString = "This is your age: " + inputAge;
		return resultString;
	}

	//Write a function that takes an integer which is a person's age and returns a string that says whether the person is a child, an adult, or old person.
	//Say, a child is anyone younger than 18, an adult is between 18 and 65, and an old person is more than 65 years old.
	//Напишите функцию, которая принимает целое число, являющееся возрастом человека, и возвращает строку, в которой говорится,
	//является ли человек ребенком, взрослым или пожилым человеком. Скажем, ребенок - это любой человек моложе 18 лет, взрослый -
	//от 18 до 65 лет, а пожилой человек - старше 65 лет.
		
	public static String findAge() {
		int inputAge = readInt("Input age: ");
		
		if (inputAge < 18) {
			return("You are a child");
		}
		else if (18 <= inputAge && inputAge < 65) {
			return("You are an adult");
		}
		else if (65 <= inputAge) {
			return("You are elderly");
		}
			return null;
	}
	
	//Write a function that takes an array of integers and returns the largest number in the array (if you get as far as reading about arrays)
	//Напишите функцию, которая принимает массив целых чисел и возвращает наибольшее число в массиве (если вы дошли до чтения о массивах)
		
	public static int arrayNum(int array[]) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		return max;
	}
	
	//Метод, который принимает два целых числа и возвращает наибольшее из них
	
	public static int returnMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	//Метод, который принимает два целых числа и возвращает наименьшее из них
	
	public static int returnMin(int num1, int num2) {
		if (num1 > num2) {
			return num2;
		}
		else {
			return num1;
		}
	}
	
	//Метод, который принимает два целых числа и перемножает их
	
	public static int returnMultiply(int num1, int num2) {
		int resultMultiply = num1 * num2;
			return resultMultiply;
	}
	
	//Метод, который будет принимать параметры A, B, C, D и возвращать результат следующего вычисления:
	//возьмите наибольшее из чисел a и B, умножьте его на наименьшее из чисел C и D
	
	public static int returnCalc(int a, int b, int c, int d) {
		
		int maxAB = returnMax(a, b);
		
		int minCD = 0;
		if (c < d) {
			minCD = c;
		}
		else {
			minCD = d;
		}
		
		return (maxAB * minCD);
	}
	
	//Вывод
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(retAge());
		System.out.println(findAge());
		System.out.println(arrayNum(new int[]{2,7,1}));
		System.out.println(returnMax(5,2));
		System.out.println(returnMin(8,3));
		System.out.println(returnMultiply(5,9));
		System.out.println(returnCalc(2,7,1,5));
	}
}