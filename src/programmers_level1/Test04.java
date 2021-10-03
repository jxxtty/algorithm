package programmers_level1;
// ���� �ڵ� ç���� ����2_���� ���ϱ�
public class Test04 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0 ; i < absolutes.length ; i++){
            if(signs[i]){
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		System.out.println(t.solution(absolutes, signs)); // 9
		
		int[] absolutes2 = {1, 2, 3};
		boolean[] signs2 = {false, false, true};
		System.out.println(t.solution(absolutes2, signs2)); //0
	}

}
