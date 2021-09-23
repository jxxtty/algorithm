package inflearn_section02;

import java.util.Scanner;

// �Ҽ�(�����佺�׳׽� ü)
public class Test05 {
	public int solution(int num) {
		int result = 0;
		int[] buf = new int[num+1]; // 20�� ������ ����20¥�� -> ��ü��0���� �ʱ�ȭ�Ǿ�����
		// �Ҽ��� 0, �ƴϸ� 1�� ©����!
		buf[0] = 1;
		buf[1] = 1;
		for(int i = 2; i < num+1 ; i++) {
			if(buf[i] == 0) {
				for(int j = 2; j*i < num+1 ; j++) {
					buf[i*j] = 1;
				}
			}
		}
		for(int i = 0 ; i < buf.length ; i++) {
			if(buf[i] == 0) {
				
				result++;
			}
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(t.solution(num));
	}

}
