package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n * (n + 1) / 2;
		System.out.println(sum);
	}
}
