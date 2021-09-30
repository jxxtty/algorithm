package programmers_level1;

import java.util.Scanner;

public class Test02_2 {
	public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(n%3);
            n = n/3;
        }
        return Integer.parseInt(sb.toString(),3);
    }
	public static void main(String[] args) {
		Test02_2 t = new Test02_2();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println(t.solution(n));
	}

}
