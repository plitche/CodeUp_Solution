package Q2033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2033
//@Memory 31456, @Time 213
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        st.nextToken(); // 사실 줄 개수는 필요 없다.
        int xLine = Integer.parseInt(st.nextToken());
        
        int[] leftContact = new int[xLine]; // 연결된 줄의 왼쪽 번호
        int[] rightContact = new int[xLine];	// 연결된 줄의 오른쪽 번호
        
        StringTokenizer st1;
        for (int i=0; i<xLine; i++) {
        	st1 = new StringTokenizer(br.readLine(), " ");
        	leftContact[i] = Integer.parseInt(st1.nextToken());
        	rightContact[i] = Integer.parseInt(st1.nextToken());
        }
        
        int startPoint = Integer.parseInt(br.readLine());
        
		for (int i=0; i<xLine; i++) {
		 	if (leftContact[i]==startPoint) { // 시작점이 연결된 줄의 왼쪽 번호와 같으면
		 		startPoint = rightContact[i];	// 오른쪽 줄로 바꾸라.
		 	} else if (rightContact[i]==startPoint) { // 시작점이 연결된 줄의 오른 번호와 같으면
		 		startPoint = leftContact[i];	// 왼쪽 줄로 바꾸라.
		 	}
		}
       
        System.out.println(startPoint);
        
	}
}
 