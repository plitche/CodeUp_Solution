package Q1915;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1915
//@Memory 11160, @Time 66
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        loop(0, count, 1, 2); // 인덱스, 입력받은 숫자, 이전, 이후를 초기 상태로 넘기기
	}
	
	public static void loop(int index, int count, int bef, int aft) {
		if (count==1 || count==2) { // count가 1,2인 경우에는 1출력 후 리턴
			System.out.println(1);
			return;
		} else if (count ==3 ){ // count가 3인 경우에는 2출력 후 리턴
			System.out.println(2); 
			return;
		}
		
		if (index+4>=count) { // index+4인 이유는 count가 3까지는 바로 return 하기 때문
			System.out.println(bef+aft);
		} else {
			 // index를 +1해주고, 이전 정수 bef자리에 aft를 넘기고, 이후 aft를 before와 합친다.
			loop(index+1, count, aft, bef+aft);
		}
		
	}
    	 
}
