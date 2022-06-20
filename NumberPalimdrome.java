package numberpalimdrome;

import java.util.ArrayList;

/*		A palindromic number reads the same both ways. The largest palindrome made from
 *   	the product of two 2-digit numbers is 9009 = 91 × 99.
 *      Find the largest palindrome made from the product of two 3-digit numbers.
 *      */

public class NumberPalimdrome {

	public static void main(String[] args) {

		boolean result = false;
		boolean leave = false;
		int palindrome = 0;
		int multipleElevenThree = 0;
		int i = 999;
		ArrayList<Integer> isPalindrome = new ArrayList<Integer>();
		
		
		//Bucle para buscar el  numero palindromo más grande de 3 cifras y que ademas sea múltiplo de 11
		while (!leave) {
			isPalindrome = digit(i);
			if (isPalindrome(isPalindrome) && i % 11 == 0) {
				leave = true;
				multipleElevenThree = i;

			}

			i--;
		}

		i = 999;
		/*Bucle para buscar  que numero de 3 tres cifras  multiplicado 
		por mayor número palindromo de 3 cifras y múltiplo de 11 produce
		el mayor número palindromo  resultado del producto de dos números de 3 cifras.
		*/
		while (!result) {

			palindrome = multipleElevenThree * i;
			isPalindrome = digit(palindrome);
			result = isPalindrome(isPalindrome);

			i--;
		}

		System.out.println(multipleElevenThree + " x " + i + "  =  " + palindrome);

	}
	//función que   separar los dígitos  de un número  y lo devuelve en un ArrayList
	public static ArrayList<Integer> digit(int number) {

		ArrayList<Integer> listNumber = new ArrayList<Integer>();

		boolean leave = false;
		while (!leave) {

			if (number > 0) {
				listNumber.add(number % 10);
				number = number / 10;

			} else {
				leave = true;

			}

		}

		return listNumber;

	}

	// función que  devuelve si el numero es paildromo  recibe un Arraylist con los dígitos separados del número a investigar
	public static boolean isPalindrome(ArrayList<Integer> listNumber) {

		int size = listNumber.size();
		int i = 0, j = size - 1;
		boolean leave = false;
		boolean result = false;

		while (!leave && i < size) {
			if (listNumber.get(i) != listNumber.get(j)) {
				leave = true;
			}

			i++;
			j--;
		}

		if (i == size) {
			result = true;
		}

		return result;

	}

}
