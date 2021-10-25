package programmers_level2;
// 썸머/윈터코딩(2019)_멀쩡한 사각형
public class Test12 {
	public long solution(int w, int h) {
        long answer = 1;

        long big = (w > h) ? w : h;
        long small = (h < w) ? h : w;
        
        /**
         * 유클리드 호제법
         * 최대공약수를 찾는다(small에 최대공약수가 저장되면서 반복문이 끝남)
         */
        long rest = big % small;
        while(rest != 0){
            long buffer = small % rest;
            small = rest;
            rest = buffer;
        }
        
        // 대각선이 지나가는 부분은 전체결과에서 제외한다. (지나가는 부분 = 가로 + 세로 - 가로세로의 최대공약수)
        answer = ((long) w * h) - (w + h - small); // long타입캐스팅 주의
      
        return answer;
    }
	
	public static void main(String[] args) {
		Test12 t = new Test12();
		
		int w = 8;
		int h = 12;
		System.out.println(t.solution(w, h)); // 80 => (8 * 12) - (8 + 12 - 4) = 96 - 16 = 80
	}

}
