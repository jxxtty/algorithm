package programmers_level1;

import java.util.Arrays;

// ����/���� �ڵ�(~2018)_����
public class Test03 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = Arrays.stream(d).sum();
        if(budget >= sum) return d.length; // �̰� ��� �ɰͰ���.
        else {
            Arrays.sort(d);
            int buffer = 0;
            for(int i = 0 ; i < d.length ; i++){
                buffer += d[i];
                if(buffer > budget) break;
                answer++;
            }
        }
        return answer;
    }
    
	public static void main(String[] args) {
		Test03 t = new Test03();
		int[] d = {1,3,2,5,4};
		int[] d2 = {2,2,3,3};
		System.out.println(t.solution(d, 9)); // 3
		System.out.println(t.solution(d2, 10)); // 4
	}

}
