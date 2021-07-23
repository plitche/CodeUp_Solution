package Q2084;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2083
//@Memory 85760, @Time 4011 시간초과
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[count];
        for (int i=0; i<count; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }

        int qNo = Integer.parseInt(br.readLine());
        
        for (int i=0; i<qNo; i++) {
        	int no = Integer.parseInt(br.readLine());
        	
        	for (int j=0; j<count; j++) {
        		if (arr[j] == no) {
        			sb.append(j+1+"\n");
        			break;
        		} else {
        			if (j==count-1) {
        				sb.append("-1\n");
        			}
        		}
        	}
        }
        
        System.out.println(sb);	
    	
	}
}