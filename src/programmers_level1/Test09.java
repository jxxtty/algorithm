package programmers_level1;
// ���� �ڵ� ç���� ����2_����� ������ ����
// left ~ right���� ����� ������ ���ϴµ�, ����� ������ ¦����� �ش� ���ڸ� ���ϰ� Ȧ����� ����
public class Test09 {
	public int getDivisor(int num){
        int cnt = 1; // ���ݱ����� ����� ������ ���ϹǷ�, ������ ������ ���Եǰ� 1�� ����
        for(int i = 1 ; i <= num/2 ; i++){
            if(num % i == 0) cnt++;
        }
        return cnt;
    }
	
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right ; i++){
            int result = getDivisor(i);
            if(result % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
	public static void main(String[] args) {
		Test09 t = new Test09();
		
		System.out.println(t.solution(13, 17)); // 43
		System.out.println(t.solution(24, 27)); // 52
	}

}
