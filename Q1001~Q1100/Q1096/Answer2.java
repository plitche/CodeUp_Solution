package Q1096;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1096
//@Memory 11204, @Time 65

public class Answer2 {
	// 흰 돌이 올려진 바둑판의 상황을 출력한다. 흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int stone = Integer.parseInt(br.readLine());	// 바둑판에 놓일 돌의 개수
        
        int[][] location = new int[20][20];	// 바둑판 가로세로 길이
        
        for (int i=0; i<stone; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	// 바둑알이 놓일 때마다 x좌표 y좌표에 저장
        	location[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;  
        }
        
        for (int i=1; i<20; i++) {
        	for (int j=1; j<20; j++) {
        		sb.append(location[i][j]).append(" "); //2중 포문을 사용하여 sb에 저장
        	}
        	sb.append("\n");	// 줄 바꿈
        }
        
        System.out.println(sb);
        br.close();
    }

}
