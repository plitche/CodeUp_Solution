package Q1425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1425
//@Memory 11180, @Time 77

public class Answer1 {
	//	1. 첫 번째 줄에 학생 수(N)와 한줄에 앉을 수 있는 자리수(C)가 자연수로 주어진다. 단, (1≤N≤99), (1≤C≤10)
	//	2. 둘째 줄에는 N명의 학생 키들이 공백으로 구분되어 입력된다.
	//	학생들의 자리 배치 결과를 공백으로 분리하여 출력한다.
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1, " ");
        int N = Integer.parseInt(st1.nextToken());
        int C = Integer.parseInt(st1.nextToken());

        int[] desk = new int[N];
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        for (int i=0; i<desk.length; i++) {
            desk[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(desk);

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<desk.length; i++) {
            if (i%C==0 && i>0) {
                sb.append("\n");
            }
            sb.append(desk[i]).append(" ");
        }
        System.out.println(sb);
    }
    	 
}