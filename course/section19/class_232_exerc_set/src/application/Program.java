package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A?: ");
		int n = sc.nextInt();
		while (n > 0) {
			int number = sc.nextInt();
			a.add(number);
			n--;
		}
		System.out.print("How many students for course B?: ");
		n = sc.nextInt();
		while (n > 0) {
			int number = sc.nextInt();
			b.add(number);
			n--;
		}
		System.out.print("How many students for course C?: ");
		n = sc.nextInt();
		while (n > 0) {
			int number = sc.nextInt();
			c.add(number);
			n--;
		}
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}

}
