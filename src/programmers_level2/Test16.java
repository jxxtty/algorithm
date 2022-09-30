package programmers_level2;

import java.util.Arrays;

// 월간코드챌린지 시즌1_이진변환 반복하기
public class Test16 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int removeZeroNum = 0;
        int removeTime = 0;

        StringBuilder sb = new StringBuilder(s);

        while(!sb.toString().equals("1")){
            removeTime++; // 0제거 횟수
            String beforeRemove = sb.toString();
            String afterRemove = beforeRemove.replaceAll("0","");
            removeZeroNum += beforeRemove.length()-afterRemove.length(); // 0제거 갯수
            sb.setLength(0); // sb초기화
            sb.append(Integer.toBinaryString(afterRemove.length()));
        }

        answer[0] = removeTime;
        answer[1] = removeZeroNum;

        return answer;
    }

    public static void main(String[] args) {
        Test16 t = new Test16();

        String one = "110010101001";
        System.out.println(Arrays.toString(t.solution(one))); // [3, 8]

        String two = "01110";
        System.out.println(Arrays.toString(t.solution(two))); // [3, 3]

        String three = "1111111";
        System.out.println(Arrays.toString(t.solution(three))); // [4, 1]
    }
}
