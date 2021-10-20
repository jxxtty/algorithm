package programmers_level2;

public class Test08 {
	public String makeSameFormat(String s, int n){
        StringBuilder sb = new StringBuilder();
        int num = n - s.length();
        if(num > 0){
            sb.append("0");
            num--;
        }
        sb.append(s);
        return sb.toString();
    }
    
    public long[] solution(long[] numbers) { // �ٸ� ���� ������Ԥ���
        long[] answer = new long[numbers.length];
        
        for(int i = 0 ; i < numbers.length ; i++){
            long tmp = numbers[i];
            String now = Long.toBinaryString(tmp);
            boolean isNotFind = true;
            while(isNotFind){
                tmp += 1;
                String buf = Long.toBinaryString(tmp);
                if(now.length() < buf.length()) now = makeSameFormat(now, buf.length());
                int diff = 0;
                for(int j = 0 ; j < buf.length() ; j++){
                    if(now.charAt(j) != buf.charAt(j)) diff++;
                    if(diff > 2) break;
                }
                
                if(diff <= 2){
                    isNotFind = false;
                    answer[i] = tmp;
                }
                
            }
        }
        
        
        return answer;
    }
    
    public long[] solution2(long[] numbers) { // ¦�� Ȧ�� ������ �����Ѵ�.
        long[] answer = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;

            } else {
                StringBuilder sb = new StringBuilder();
                String binaryString = Long.toBinaryString(numbers[i]);
                if (!binaryString.contains("0")) {
                    // �� ���� 10����
                    sb.append("10");

                    // ������ �ڸ����� ��� 1��
                    sb.append(binaryString.substring(1).replace("0", "1"));

                } else {
                    int lastIndex = binaryString.lastIndexOf("0");
                    int firstOneIndex = binaryString.indexOf("1", lastIndex);
                    // ������ 0�� 1�� ����
                    sb.append(binaryString, 0, lastIndex).append("1");

                    // ������ 0 ���� 1�� 0���� ����
                    sb.append("0");

                    // �� ���� ��Ʈ��
                    sb.append(binaryString.substring(firstOneIndex + 1));
                }
                answer[i] = Long.parseLong(sb.toString(), 2);
            }
        }
        return answer;
    }
    
	public static void main(String[] args) {
		Test08 t = new Test08();
		
		long[] numbers = {2, 7};
		for(long l : t.solution(numbers)) {
			System.out.print(l + " ");
		}
		System.out.println();
		
		for(long l : t.solution2(numbers)) {
			System.out.print(l + " ");
		}
		System.out.println();
	}

}
