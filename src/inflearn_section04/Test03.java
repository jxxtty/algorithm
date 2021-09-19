package inflearn_section04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// HashMap & Sliding window
public class Test03 {
	public void solution(int day, int range, int[] sales) {
		int num = (day - range) + 1;
		HashMap<Integer,Integer> maps = new HashMap<>();
		ArrayList<Integer> results = new ArrayList<>();
		for(int i = 0 ; i < range-1 ; i++) {
			maps.put(sales[i], maps.getOrDefault(sales[i], 0)+1);
		}
		// range가 4라면 3개까지만 넣어.
		int lt = 0;
		int rt = range-1;
		while(rt < day) {
			maps.put(sales[rt], maps.getOrDefault(sales[rt], 0)+1);
			results.add(maps.size());
			maps.put(sales[lt], maps.get(sales[lt])-1);
			if(maps.get(sales[lt]) == 0) maps.remove(sales[lt]);
			lt++;
			rt++;
		}
		
		for(int i : results) {
			System.out.print(i + " ");
		}
		
	}

	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		int range = scan.nextInt();
		int[] sales = new int[day];
		for(int i = 0 ; i < day ; i++) {
			sales[i] = scan.nextInt();
		}
		
		t.solution(day, range, sales);
	}

}
