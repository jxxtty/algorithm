package inflearn_section06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point implements Comparable<Point>{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y - o.y;
		else return this.x - o.x;
	}
}
public class Test07 {

	public static void main(String[] args) {
		Test07 t = new Test07();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Point> list = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.add(new Point(x,y));
		}
		
		Collections.sort(list);
		
		for(Point p : list) {
			System.out.println(p.x + " " + p.y);
		}
	}

}
