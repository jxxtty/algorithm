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
				if(stamp.equals(buf[i])){ // 같고 flag가 1이아냐 -> list에 stamp와flag모두넣어
					flag++;
					list.add(stamp);
					list.add(String.valueOf(flag));
					break;
				} else if (flag == 1) {
					list.add(stamp);
					list.add(buf[i]);
					break;
				} else { // 같지않고, flag는 1이아니야
					list.add(stamp);
					list.add(String.valueOf(flag));
					list.add(buf[i]);
					break;
				}
			}
			
			if(stamp.equals(buf[i])) { // 같아 -> flag++
				flag++;
			} else if(flag == 1) { // 같지않고, flag가 이야 -> list에 stamp만 넣어
				list.add(stamp);
				stamp = buf[i];
				continue;
			} else { // 같지않고 flag가 1이 아니야 -> list에 stamp랑 flag둘다넣어
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
