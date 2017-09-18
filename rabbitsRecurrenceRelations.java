//http://rosalind.info/problems/fib/

package rosalind.info;

import java.util.Scanner;

public class rabbitsRecurrenceRelations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		output(s);
	}

	public static void output (String s) {
		String[] numbers = s.split(" ");
		int n = Integer.parseInt(numbers[0]);
		int k = Integer.parseInt(numbers[1]);
		System.out.println(recurrence(n, k));
	}

	public static long recurrence(int n, int k) {
		if (n <= 2)
			return 1;
		else 
			return  recurrence(n-1,k) + ( k * recurrence(n-2,k) );
	}

}
