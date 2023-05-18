
public class ArrayOfNumbers {
//Write a function that takes an array of integers and returns the largest number in the array (if you get as far as reading about arrays)
//Напишите функцию, которая принимает массив целых чисел и возвращает наибольшее число в массиве (если вы дошли до чтения о массивах)
	
	public static int arraynum(int a[]) {
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			if (max<a[i])
				max=a[i];
		}
		return max;
	}
}