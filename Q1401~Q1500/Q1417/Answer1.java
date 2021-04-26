package Q1417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1417
//@Memory 11148, @Time 94

public class Answer1 {
	//	CCTV를 정밀 분석한 결과 도둑은 검거한 10명 중 키가 3번째로 크다는 사실을 알았다.
	//	10명의 키를 조사하여 도둑을 검거하는 프로그램을 작성하시오. (단, 입력되는 모든 키는 서로 다르다.)
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 10명의 범인이 있음으로 배열 길이 10
        int[] height = new int[10];
        for (int i=0; i<10; i++) {
        	height[i] = Integer.parseInt(st.nextToken());
        }
        
        // 배열 정렬
        Arrays.sort(height);
        
        System.out.println(height[7]);
        br.close();
    }
    	 
}