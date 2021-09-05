package inflearn_section08;

import java.util.Scanner;

public class Test08 {
	static int[] ch, com, p;
	static int level, num;
	
	int[][] dy = new int[35][35];
	boolean flag = false;
	
	public int combi(int n, int r) {
		if(dy[n][r] > 0) return dy[n][r];
		
		if(n == r || r == 0) return 1;
		else return dy[n][r] = combi(n-1,r-1) + combi(n-1, r);
	}
	
	public void printCombi(int L, int sum) {
		if(flag) return;
		if(L == level) {
			if(sum == num) {
				for(int x : p) System.out.print(x + " ");
				flag = true;
			}
			
		} else {
			for(int i = 1 ; i <= level ; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					p[L] = i;
					printCombi(L+1, sum+(com[L] * p[L]));
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Test08 t = new Test08();
		Scanner scan = new Scanner(System.in);
		
		level = scan.nextInt();
		num = scan.nextInt();
		com = new int[level];
		p = new int[level];
		ch = new int[level+1];
		
		for(int i = 0 ; i < level ; i++) {
			com[i] = t.combi(level-1, i);
		}
		t.printCombi(0, 0);
	}

}
