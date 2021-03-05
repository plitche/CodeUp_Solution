package Q1098;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1098
//@Memory 11268, @Time 61

public class Answer2 {
	// 모든 막대를 놓은 격자판의 상태를 출력한다. 막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다. 단,각 숫자는 공백으로 구분하여 출력한다.
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // 입력받은 격자판 크기만큼 배열 크기 지정
        int[][] board = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        
        int n = Integer.parseInt(br.readLine()); // 막대의 개수
        for (int j=0; j<n; j++) {
        	StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        	int i = Integer.parseInt(st2.nextToken());	// 막대의 길이
        	int d = Integer.parseInt(st2.nextToken());	// 막대의 방향
        	int x = Integer.parseInt(st2.nextToken())-1;	// 가로 좌표
        	int y = Integer.parseInt(st2.nextToken())-1;	// 세로 좌표
        	
        	if (d==0) {	// 막대를 놓는 방향이 가로일 때
        		for (int k=0; k<i; k++) {	//막대의 길이만큼 for문 반복
            		board[x][y+k] = 1;	// 해당 좌표 1로 저장
            	}
        	} else {	// 막대를 놓는 방향이 세로 일 때
        		for (int k=0; k<i; k++) {		//막대의 길이만큼 for문 반복
        			board[x+k][y] = 1;	// 해당 좌표 1로 저장
            	}
        	}
        
        }
        StringBuilder sb = new StringBuilder();
        for (int[] i : board) {	// 2중 foreach문 활용
        	for (int j : i) {
        		sb.append(j).append(" ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }

}
