package inflearn_section05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
// �踷��� �ڸ���
public class Test05 {
	public int solution(String str) {
		int answer = 0;
		char[] strArr = str.toCharArray();
		Stack<Integer> tmp = new Stack<>();
		List<Integer> lazer = new ArrayList<>();
		for(int i = 0 ; i < strArr.length ; i++) {
			if(strArr[i] == '(') tmp.push(i);
			else {
				int loc = tmp.pop();
				if(loc+1 == i) lazer.add(loc); // �������� ������
				else {
					int count = 0;
					for(int laz : lazer) {
						if(loc < laz && i > laz) count++;
					}
					answer += (count+1);
				}
			}
			
			if(tmp.isEmpty()) lazer.clear();
			
		}
		return answer;
	}

	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(t.solution(str));
	}

}
