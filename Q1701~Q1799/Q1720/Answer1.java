package Q1720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1720
//@Memory 11316, @Time 68

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int[] arr;
        int many = 0;
        for(int i=0; i<count; i++) {
        	st  = new StringTokenizer(br.readLine(), " ");
        	arr = new int[3];
        	
        	int result;
        	for (int j=0; j<3; j++) {
        		arr[j] = Integer.parseInt(st.nextToken());
        	}
        	result = Integer.parseInt(st.nextToken());
        	Arrays.sort(arr);
        	
        	if (arr[0] == result) {
        		
        	} else {
        		many++;
        		sb.append(i+1).append(" ").append(arr[0]);
        	}
        	
        }
        
        if (many == 0) {
        	sb.append("-1");
        }
        
        System.out.println(sb);
    }
    	 
}