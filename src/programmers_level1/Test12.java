package programmers_level1;
// ���� �ڵ� ç���� ����3_�������� 1�� �Ǵ� �� ã��
public class Test12 {
	public int solution(int n) {
        int answer = 0;
        for(int x = 2 ; x < n ; x++){
            if(n % x == 1){
                answer = x;
                break;
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Test12 t = new Test12();
		
		int n = 10;
		System.out.println(t.solution(n)); // 3
		
		int n2 = 12;
		System.out.println(t.solution(n2)); // 11
	}

}
