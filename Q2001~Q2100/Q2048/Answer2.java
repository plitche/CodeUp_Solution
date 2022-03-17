package Q2048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2048
//@Memory 11212, @Time 68
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        double total = 0;
        for (int i=0; i<4; i++) { // 4x4임으로 2중 for문 length 4만큼 반복
        	st = new StringTokenizer(br.readLine(), " "); // 반복문이 돌 때마다 st에서 토큰 가져오기
        	for (int j=0; j<4; j++) {
        		total+=Integer.parseInt(st.nextToken()); // 합계 구하기
        	}
        }

        int index = 0;
        while (true) { // 합계가 <= 1 이 될때까지 반복
        	if (total == Math.pow(2, index)) { // 합계가 2의 index 거듭제곱과 일치하면 yes 출력
        		System.out.println("yes");
        		break;
        	} else if (total < Math.pow(2, index)) { // 합계가 2의 index 거듭제곱 보다 작으면 no 출력
        		System.out.println("no");
        		break;
        	}
        	index++; // index 1 증가
        	
        }
	}
}
