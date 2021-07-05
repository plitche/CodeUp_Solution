package Q2040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2040
//@Memory 11152, @Time 69
public class Answer1 {

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
        	
        	int pre1 = arr[i-1];
        	if (pre1 == arr[i]) {
        		count++;
        		continue;
        	} else {
        		for (int j=i-2; j>=0; j--) {
            		int pre2 = arr[j];
            		if (pre2 != pre1) {
            			if (pre2 == arr[i]) {
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