package Q1440;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1440
//@Memory 26964, @Time 159

public class Answer1 {
	//	첫째 줄에 숫자의 개수 n이 입력된다. (2 <= n <= 1000)
	//	다음 줄에 n개의 숫자 k가 공백으로 입력된다.(k는 int범위)
	//	대소 비교 결과를 출력하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 첫째줄에 입력받은 n개의 길이만큼 배열 길이 선언
        int[] numbers = new int[n];
        
        // n개의 숫자를 입력받기로 했음으로 n번 for문 반복
        for (int i=0; i<n; i++) {
        	numbers[i] = Integer.parseInt(st.nextToken());	// 입력받은 숫자 저장
        }
        
        for (int i=0; i<n; i++) {
        	// 일단 기준 숫자 저장
        	sb.append(i+1).append(": ");
        	for (int j=0; j<n; j++) {
        		if (i!=j) {	// 자기자신 숫자를 제외하고 비교
        			if(numbers[i] > numbers[j]) {
        				sb.append("> ");
        			} else if(numbers[i] < numbers[j]) {
        				sb.append("< ");
        			} else {
        				sb.append("= ");
        			}
        		}
        			
        	}
        	// 줄 띄움
        	sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}