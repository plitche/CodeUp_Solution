package Q2603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2602
//@Memory 11160, @Time 61
public class Answer2 {
	
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int[] totalX = new int[3];
        int[] totalY = new int[3];
        for (int i=0; i<3; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	for (int j=0; j<3; j++) {
        		int number = Integer.parseInt(st.nextToken());
        		totalX[i] += number;
        		totalY[j] += number;
        		sb.append(number + " ");
        	}
        	sb.append(totalX[i]).append("\n");
        }
        
        sb.append(totalY[0] + " ").append(totalY[1] + " ").append(totalY[2] + " ").append(totalX[0]+totalX[1]+totalX[2]);
        
        System.out.println(sb);
	}
}

