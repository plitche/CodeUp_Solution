package Q1856;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1856
//@Memory 11304, @Time 77
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        System.out.println(loop(count));
	}
	
	public static int loop(int count) {

		if (count==1) { // 남은 갯수가 1개일때는 당연히 1번
			return 1;
		} else if (count==2) { // 남은 갯수가 2개일 떄는 1번 + 1개일떄 경우의 수
			return 1 + loop(1); 
		} else  if (count==3) { // 남은 갯수가 3개 일때는 1번 + 1개일때 경우의 수 + 2개일때 경우의수
			return 1 + loop(1) + loop(2);
		} else {
			return loop(count-3) + loop(count-2) + loop(count-1); // 위 루프만큼 돌리기
		}
		
	}
    	 
}
