package Q1095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1095
//@Memory 12688, @Time 76

public class Answer2 {
	// 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	// 총 출석을 부를 숫자 변수에 저장
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int minNumber = 23;	// 출석 부를수 있는 숫자중 가장 큰 수
        for (int i=0; i<count; i++) {	// 출석 부를 횟수만큼
        	int number = Integer.parseInt(st.nextToken());
        	if (minNumber > number) { // 출석 부른  숫자가 minNumber보다 낮으면
        		minNumber = number;	// minNumber에 저장
        	}
        }

        System.out.println(minNumber);
    }

}
