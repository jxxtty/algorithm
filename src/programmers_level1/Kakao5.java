package programmers_level1;
// 2020 카카오 인턴십_키패드 누르기
public class Kakao5 {
	static int left, right;
    public int getDistance(int now, int num){
        int x = (now - 1) / 3;
        int y = (now - 1) % 3;
        
        int numX = num / 3;
        int numY = 1;
        
        return Math.abs(x - numX) + Math.abs(y - numY);
    }
    
    public int getDistance2(int now, int num) { // 숫자 당 좌표값(x,y)을 미리 배열로 저장해두고 호출해서 사용한다
    	int[][] numpadPos = {
                {3,1}, //0
                {0,0}, //1
                {0,1}, //2
                {0,2}, //3
                {1,0}, //4
                {1,1}, //5
                {1,2}, //6
                {2,0}, //7
                {2,1}, //8
                {2,2}  //9
        };
    	
    	return Math.abs(numpadPos[now][0]-numpadPos[num][0]) + Math.abs(numpadPos[now][1]-numpadPos[num][1]);
    }
    
    
    public String pushKeypad(int num, String hand){
        if(num == 1 || num == 4 || num == 7) {
            left = num;
            return "L";
        } else if(num == 3 || num == 6 || num == 9) {
            right = num;
            return "R";
        } else{ // 2, 5, 8, 0
            int leftDis = getDistance(left, num);
            int rightDis = getDistance(right, num);
            
            if(leftDis == rightDis){
                if(hand.equals("right")) {
                    right = num;
                    return "R";
                } else {
                    left = num;
                    return "L";
                }
            } else {
                if(leftDis > rightDis) {
                    right = num;
                    return "R";
                } else {
                    left = num;
                    return "L";
                }
            }
        }
    }
    
    public String solution(int[] numbers, String hand) {
        // * : 10, 0 : 11, # : 13
        left = 10; // *
        right = 12; // #
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < numbers.length ; i++){
            String leftRight = pushKeypad((numbers[i] == 0)? 11 : numbers[i], hand);
            sb.append(leftRight);
        }
        
        return sb.toString();
    }
    
	public static void main(String[] args) {
		Kakao5 k = new Kakao5();
		
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(k.solution(numbers, "right")); // LRLLLRLLRRL
		
		int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		System.out.println(k.solution(numbers2, "left")); // LRLLRRLLLRR
		
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		System.out.println(k.solution(numbers3, "right")); // LLRLLRLLRL
	}

}
