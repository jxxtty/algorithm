package inflearn_section08;

import java.util.Scanner;

public class Test02 {

	static int cart;
	static int[] puppies;
	static int maxSum = 0;
	public void inCart(int puppy, int sum) {
		if(sum > cart) return;
		if(puppy == puppies.length) {
			if(sum > maxSum) maxSum = sum;
		} else {
			inCart(puppy+1, sum+puppies[puppy]);
			inCart(puppy+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in);
		cart = scan.nextInt();
		int num = scan.nextInt();
		puppies = new int[num];
		for(int i = 0 ; i < num ; i++) {
			puppies[i] = scan.nextInt();
		}
		t.inCart(0, 0);
		System.out.println(maxSum);
	}

}
