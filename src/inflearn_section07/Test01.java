package inflearn_section07;

import java.util.Scanner;

public class Test01 {
	public void printNum(int num) {
		if(num == 0) return;
		else {
			printNum(num-1);
			System.out.print(num +" ");
		}
		
	}
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in); 
		
		int num = scan.nextInt();
		
		t.printNum(num);
	}

}
