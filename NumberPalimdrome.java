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
		int i = 999;
		int j=1;
		ArrayList<Integer> isPalindrome = new ArrayList<Integer>();
		ArrayList<Integer> multipleEleven = new ArrayList<Integer>();
		ArrayList<Integer> numPalindrome = new ArrayList<Integer>();
		
		
		
		//Bucle para buscar los  numeros multiplo de 11  más grande de 3 cifras y lo guandamos en un ArrayList 
		while (i>899) {
			
			if ( i % 11 == 0) {
			
				multipleEleven.add(i);
				
				j++;
			}

			i--;
		}
		
       int size = multipleEleven.size();
		i = 999;
		j=0;
		/*Bucle para buscar  que numero de 3 tres cifras  multiplicado 
		por mayor número  múltiplo de 11 produce
		el mayor número palindromo  resultado del producto de dos números de 3 cifras.
		*/
		while (!leave) {
			
			j=0;
           while(!result && j<size) {
			palindrome = multipleEleven.get(j) * i;
			isPalindrome = digit(palindrome);
			
			if(result = isPalindrome(isPalindrome)) {
				
				numPalindrome.add(palindrome);
				result = true;
				leave = true;
				
			}else {
				j++;
				
			}
			
			}
           if(!leave) {
        	   
        	   i--;   
           }
          
    
		
		}

		System.out.println(multipleEleven.get(j) + " x " + i + "  =  " + numPalindrome);
		
	

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
