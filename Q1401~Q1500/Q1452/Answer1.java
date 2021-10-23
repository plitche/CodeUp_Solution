package Q1452;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1452
//@Memory 31692, @Time 261

public class Answer1 {
	//	두 배열을 합쳐서 오름차순 정렬된 배열을 출력하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] number = new int[n];
        
        // 입력받을 숫자의 개수 만큼 for문 반복
        for (int i=0; i<n; i++) {
        	number[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(number);
        
        for (int i : number) {
        	sb.append(i).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
    	 
}