package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Weekly4 {
	public String solution(String[] table, String[] languages, int[] preference) {
        String[] job = {"SI", "CONTENTS", "HARDWARE", "PORTAL", "GAME"};
        int[] score = new int[5];
        for(int i = 0 ; i < table.length ; i++){ // ������ ��ȣ�� ���� ���
            String[] buffer = table[i].split(" ");
            List<String> list = Arrays.asList(buffer);
            int sum = 0;
            
            for(int j = 0 ; j < languages.length ; j++){
                int now = list.indexOf(languages[j]);
                if(now != -1){ // now���� -1�̶�°� list���� ��ġ�ϴ� �׸��� ���ٴ� ��
                    sum += ((6-now) * preference[j]);
                }
            }
            score[i] = sum;
        }
        
        int max = Arrays.stream(score).max().getAsInt(); // �ִ�����
        
        // �ִ����� �ߺ��� ���������� �����ɷ� ���
        List<String> buffer = new ArrayList<>();
        for(int i = 0 ; i < score.length ; i++){
            if(score[i] == max) buffer.add(job[i]);
        }
        if(buffer.size() != 1) Collections.sort(buffer);
        
        return buffer.get(0);
    }

	public static void main(String[] args) {
		Weekly4 w = new Weekly4();
		Scanner scan = new Scanner(System.in);
		
		String[] table = new String[5];
		for(int i = 0 ; i < 5 ; i++) {
			table[i] = scan.nextLine();
		}
		
		int num = scan.nextInt();
		String[] languages = new String[num];
		for(int i = 0 ; i < num ; i++) {
			languages[i] = scan.nextLine();
		}
		
		int[] preference = new int[num];
		for(int i = 0 ; i < num ; i++) {
			preference[i] = scan.nextInt();
		}
		
		System.out.println(w.solution(table, languages, preference));
	}

}
