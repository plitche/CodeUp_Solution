package Q2040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2040
//@Memory 11176, @Time 74
public class Answer2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;
        
        int[] arr = new int[10];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        if (arr[0] == arr[1]) {
        	count++;
        }
        
        for (int i=2; i<10; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	if (arr[i-1] == arr[i]) {
        		count++;
        	} else {
        		for (int j=i-2; j>=0; j--) {
            		if (arr[j] != arr[i-1]) {
            			if (arr[j] == arr[i]) {
            				count++;
            			}
            			break;
            		} 
            	}	
        	}
        }
        
        System.out.println(count);
	}
}