package Q1855;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1855
//@Memory 11172, @Time 70
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        // 해당 자리, 몇 번째, 이전 값, 이후 값
        loop(0, count, 1, 2);
	}
	
	public static void loop(int index, int count, int bef, int aft) {
		if (count==1 || count==2) { // 1,2 中 한가지 숫자가 들어왔을 때에는 그냥 1 출력(피보나치 수열)
			System.out.println(1);
			return;
		}
		
		if (index+4>=count) {
			System.out.println(bef+aft);
		} else {
			loop(index+1, count, aft, bef+aft);
		}
		
	}
    	 
}
