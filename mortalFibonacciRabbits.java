//http://rosalind.info/problems/fib/

package rosalind.info;

import java.util.Scanner;

public class mortalFibonacciRabbits {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		output(s);
	}

	public static void output (String s) {
		String[] numbers = s.split(" ");
		int n = Integer.parseInt(numbers[0]);
		int m = Integer.parseInt(numbers[1]);
		System.out.println(recurrence(n, m));
	}

	public static long recurrence(int n, int m) {
		if (n <= 0)
			return 0;
		else if (n <= 2)
			return 1;
		else 
			return  ( recurrence(n-1,m) + recurrence(n-2,m) ) - recurrence(n-(m+1), m);
	}

}
