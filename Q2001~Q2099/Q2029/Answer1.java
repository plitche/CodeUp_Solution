package Q2029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2028
//@Memory 11284, @Time 265
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr;
        if (m==1) {
        	arr = new int[m+1];	
        } else {
        	arr = new int[m*2-1];
        }
        
        arr[0] = 1;
        arr[1] = 1;
        
        int index = 1;
        for (int i=2; i<arr.length; i+=2) {
        	arr[i] = arr[i-index];
        	arr[i-1] = arr[i-2]+arr[i];
        	index++;
            for (int j : arr) {
            	System.out.print(j + " ");
            }
            System.out.println();
        }
        

        
        System.out.println(arr[n-1]);
        
	}
}
 