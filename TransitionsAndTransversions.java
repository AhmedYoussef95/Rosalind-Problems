//http://rosalind.info/problems/tran/

package rosalind.info;

import java.util.Scanner;

public class TransitionsAndTransversions {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] purines = new char[] {'A','G'};
		char[] pyrimidines = new char[] {'C','T'};
		double transitions = 0;
		double transversions = 0;
		
		String label1 = sc.nextLine(); //ignore dna label
		String s1 = sc.nextLine(); //first dna string
		String label2 = sc.nextLine(); //ignore dna label
		String s2 = sc.nextLine(); //second dna string
		
		//both strings are of equal length
		for (int i = 0; i < s1.length(); i++) {
			if( s1.charAt(i) != s2.charAt(i) ) {
				//check if it is a transversion
				if( (member(purines,s1.charAt(i)) && member(pyrimidines,s2.charAt(i))) ||  (member(pyrimidines,s1.charAt(i)) && member(purines,s2.charAt(i))))
					transversions++;
				else
					transitions++;
				
			}
		}
		
		System.out.println(transitions/transversions);
		
	}
	
	//determines if given element is in given array
	public static boolean member(char[] arr, char c) {
		boolean result = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == c) {
				result = true;
				break;
				}
		}
		return result;
	}

}
