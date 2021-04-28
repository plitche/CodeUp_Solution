package Q1445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1445
//@Memory 11736, @Time 76

public class Answer2 {
	//	두 배열을 합쳐서 오름차순 정렬된 배열을 출력하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        
        // 두 배열의 크기의 합만큼 결과 배열 길이 선언
        int[] result = new int[a + b];
        
        // 배열에 저장할 숫자들
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        
        // 처음은 index 0부터 a전까지 
        for (int i=0; i<a; i++) {
        	result[i] = Integer.parseInt(st2.nextToken());
        }
        // 두번째는 index a부터 a+b전까지
        for (int i=a; i<a+b; i++) {
        	result[i] = Integer.parseInt(st3.nextToken());
        }
        
        // 배열 정렬
        Arrays.sort(result);
        
        // for each문
        for (int i : result) {
        	sb.append(i).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
    	 
}