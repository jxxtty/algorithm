package inflearn_section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	public String solution(String str) {
		String result = "";
		List<String> list = new ArrayList<>();
		String[] buf = str.split("");
		
		list.add(buf[0]);
		for(int i = 1 ; i < buf.length ; i++) {
			int chk = 0;
			
			// list�� ����ִ� ���� �迭�� ���� �����ϸ� chk++�� �Ѵ�.
			for(String s : list) {
				if(s.equals(buf[i])) {
					chk++;
				}
			}
			
			// chk���� 0�̶�� �����Ѱ��� ���ٴ� ���̱⶧���� list�� buf[i]���� �߰����ش�.
			if(chk == 0) {
				list.add(buf[i]);
			}
		}

		// list�� ���� ����� �ϳ��� string���� ������ش�.
		for(String s : list) {
			result += s;
		}
		return result;
	}

	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(t.solution(str));	
	}

}
