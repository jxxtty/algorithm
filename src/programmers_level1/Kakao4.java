package programmers_level1;
// 2018 카카오 블라인드 채용_[1차]비밀지도
public class Kakao4 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binary = new String[n];
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            String arr1Binary = Integer.toBinaryString(arr1[i]);
            String arr2Binary = Integer.toBinaryString(arr2[i]);
            long binaryInt1 = Long.parseLong(arr1Binary);
            long binaryInt2 = Long.parseLong(arr2Binary);
            
            binary[i] = String.valueOf(binaryInt1 + binaryInt2);
            if(maxLen < binary[i].length()) maxLen = binary[i].length();
        }
        
        for(int i = 0 ; i < n ; i++){
            String tmp = binary[i];
            if(tmp.length() != maxLen){
                int num = maxLen - tmp.length();
                StringBuilder sb = new StringBuilder(tmp);
                while(num > 0){
                    sb.insert(0, "0");
                    num--;
                }
                tmp = sb.toString();
            }
            tmp = tmp.replace("0", " ").replace("1", "#").replace("2","#");
            answer[i] = tmp;
        }
       
        return answer;
    }
	
	public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
	
	public static void main(String[] args) {
		Kakao4 k = new Kakao4();
		int[] firstArr1 = {9, 20, 28, 18, 11};
		int[] firstArr2 = {30, 1, 21, 17, 28};
		System.out.println(k.solution(5, firstArr1, firstArr2)); // ["#####","# # #", "### #", "# ##", "#####"]
		
		int[] secondArr1 = {46, 33, 33, 22, 31, 50};
		int[] secondArr2 = {27, 56, 19, 14, 14, 10};
		System.out.println(k.solution(6, secondArr1, secondArr2)); // ["######", "### #", "## ##", " #### ", " #####", "### # "]
	}

}
