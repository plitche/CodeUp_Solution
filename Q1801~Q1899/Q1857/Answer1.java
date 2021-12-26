package Q1857;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1857
//@Memory 11196, @Time 68
public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int total = Integer.parseInt(st.nextToken());
        int many = Integer.parseInt(st.nextToken());
        
        System.out.println(loop(total, many)); // 총 개수와 고를 개수를 입력받아 재귀함수에 넘긴다.
	}
	
	public static int loop(int total, int many) {

		if (total<many) { // 총 개수보다 고를 개수가 더 적은경우는 0가지이다.
			return 0;
		} else if (total==many) { // 같은 경우는 1가지
			return 1;
		} else if (many==1) { // 고를 개수가 1개면 총 개수만큼
			return total;
		} else {
			return loop(total-1, many-1) + loop(total-1, many); 
		}
		
	}
    	 
}
