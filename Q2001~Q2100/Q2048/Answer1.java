package Q2048;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2048
//@Memory 11244, @Time 68
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        double total = 0;
        for (int i=0; i<4; i++) {  // 4x4 입력 받아야 함으로, 2중 for문 4번씩 반복
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<4; j++) {
        		total+=Integer.parseInt(st.nextToken()); // 반복 하면서 합계를 구해 total 변수에 저장
        	}
        }

        while(true) { // 무한 반복 진행 
        	total/=2.0; // 총 합계를 2로 나눈다. (total <= 1 이 될때까지 반복)

        	if (total==1) { // 합계가 1이 되면 yes 출력 -> 통일이 됨
        		sb.append("yes");
        		break;
        	} else if (total<1) { // total이 1보다 작아지면 no -> 통일이 안됨
        		sb.append("no");
        		break;
        	}
        	
        }
        
    	System.out.println(sb);	// 
	}
}
