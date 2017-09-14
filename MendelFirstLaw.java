//http://rosalind.info/problems/iprb/

package rosalind.info;

import java.util.Scanner;

public class MendelFirstLaw {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double k = sc.nextInt(); //homozaygous dominant
		double m = sc.nextInt(); //heterozygous
		double n = sc.nextInt(); //homozygous recessive
		
		double total = k+m+n;
		double probBothDominant = (k/total)*((k-1)/(total-1));
		double probBothHetero = (m/total)*((m-1)/(total-1));
		double probDominantRec = ( (k/total)*(n/(total-1)) ) + ((n/total)*(k/(total-1)));
		double probDominantHetero = ( (k/total)*(m/(total-1)) ) + ((m/total)*(k/(total-1)));
		double probHeteroRec = ( (m/total)*(n/(total-1)) ) + ((n/total)*(m/(total-1)));
		
		System.out.println(probBothDominant + (probDominantHetero) + (probBothHetero*0.75) + probDominantRec + (probHeteroRec*0.5));
	}

}