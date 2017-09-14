//http://rosalind.info/problems/hamm/

package rosalind.info;

import java.util.Scanner;

public class CountingPointMutations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(output(s,t));
	}
	
	public static int output(String s, String t) {
		int hammingDistance = 0;
		
		//both strings are of equal length
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(i))
				hammingDistance++;
		}
		
		return hammingDistance;
	}
}
