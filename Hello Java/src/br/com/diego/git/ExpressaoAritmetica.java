/**
 * 
 */
package br.com.diego.git;

import java.util.Scanner;

/**
 * @author diego
 *  Expressões Aritméticas com três formas de se declarar
 */
public class ExpressaoAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/*primeira forma*/
		//int result = ((((n + 1) * n) + 2) * n) + 3;
		
		/*segunda forma*/
//		int result = (n + 1) *n;
//		result = (result + 2) * n + 3;
//		
//		System.out.println(result);
		
		/*terceira forma*/
		System.out.println(((n + 1) * n + 2) * n + 3);

	}

}
