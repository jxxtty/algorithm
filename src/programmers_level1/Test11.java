package programmers_level1;
// 탐욕법(Greedy)_체육복
import java.util.ArrayList;
import java.util.List;

public class Test11 {
	 public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int[] students = new int[n+1];
	        for(int stu : lost){ // ü������ �Ҿ���� �л� üũ
	            students[stu] = -1;
	        }
	        
	        List<Integer> list = new ArrayList<>(); // ����ü������ ������ �� �ִ� �л�
	        int attend_stu = n - lost.length;
	        for(int stu : reserve){
	            if(students[stu] == -1){ // ������������ ����ü������ �ִ� �л�
	                students[stu] = 0;
	                attend_stu++; 
	            } else {
	                list.add(stu);
	            }
	        }
	        
	        int back = 0; // �޹�ȣ�� ������ ���
	        int front = 0; // �չ�ȣ�� ������ ���
	        for(int stu : list){
	            if(stu+1 <= n && students[stu+1] == -1) back++;
	            if(stu-1 > 0 && students[stu-1] == -1) front++;
	        }
	        
	        back += attend_stu;
	        front += attend_stu;
	        answer = Math.max(back, front);
	        return answer;
	    }
	 
	public static void main(String[] args) {
		Test11 t = new Test11();
		
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		System.out.println(t.solution(5, lost, reserve)); // 5
		
		int[] lost2 = {2, 4};
		int[] reserve2 = {3};
		System.out.println(t.solution(5, lost2, reserve2)); // 4
		
		int[] lost3 = {3};
		int[] reserve3 = {1};
		System.out.println(t.solution(3, lost3, reserve3)); // 2
	}

}
