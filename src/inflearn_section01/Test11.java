package inflearn_section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test11 {
	public String solution(String str) {
		String result = "";
		String[] buf = str.split("");
		String stamp = buf[0];
		int flag = 1;
		List<String> list = new ArrayList<>();
		
		for(int i = 1 ; i < buf.length ; i++) {
			if(i == buf.length-1) {
				if(stamp.equals(buf[i])){ // ���� flag�� 1�̾Ƴ� -> list�� stamp��flag��γ־�
					flag++;
					list.add(stamp);
					list.add(String.valueOf(flag));
					break;
				} else if (flag == 1) {
					list.add(stamp);
					list.add(buf[i]);
					break;
				} else { // �����ʰ�, flag�� 1�̾ƴϾ�
					list.add(stamp);
					list.add(String.valueOf(flag));
					list.add(buf[i]);
					break;
				}
			}
			
			if(stamp.equals(buf[i])) { // ���� -> flag++
				flag++;
			} else if(flag == 1) { // �����ʰ�, flag�� �̾� -> list�� stamp�� �־�
				list.add(stamp);
				stamp = buf[i];
				continue;
			} else { // �����ʰ� flag�� 1�� �ƴϾ� -> list�� stamp�� flag�Ѵٳ־�
				list.add(stamp);
				list.add(String.valueOf(flag));
				flag = 1;
				stamp = buf[i];
			}
			
			
		}
		
		for(String s : list) {
			result += s;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Test11 t = new Test11();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(t.solution(str));	
	}

}
