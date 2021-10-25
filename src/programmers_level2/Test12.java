package programmers_level2;
// ���/�����ڵ�(2019)_������ �簢��
public class Test12 {
	public long solution(int w, int h) {
        long answer = 1;

        long big = (w > h) ? w : h;
        long small = (h < w) ? h : w;
        
        /**
         * ��Ŭ���� ȣ����
         * �ִ������� ã�´�(small�� �ִ������� ����Ǹ鼭 �ݺ����� ����)
         */
        long rest = big % small;
        while(rest != 0){
            long buffer = small % rest;
            small = rest;
            rest = buffer;
        }
        
        // �밢���� �������� �κ��� ��ü������� �����Ѵ�. (�������� �κ� = ���� + ���� - ���μ����� �ִ�����)
        answer = ((long) w * h) - (w + h - small); // longŸ��ĳ���� ����
      
        return answer;
    }
	
	public static void main(String[] args) {
		Test12 t = new Test12();
		
		int w = 8;
		int h = 12;
		System.out.println(t.solution(w, h)); // 80 => (8 * 12) - (8 + 12 - 4) = 96 - 16 = 80
	}

}
