package Q1805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1805
//@Memory 14584, @Time 181
class machine {
	 int no;
	 int gas;
}

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        machine[] arr = new machine[count];

        for(int i=0; i<count; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	machine arr1 = new machine();
        	arr1.no = Integer.parseInt(st.nextToken());
        	arr1.gas = Integer.parseInt(st.nextToken());
        	arr[i] = arr1;
        }

        for(int j = 0; j < arr.length -1; j++) {
        	for(int i = 0; i < arr.length -1; i++) {
	            if(arr[i].no > arr[i+1].no) {
	            	machine temp = arr[i];
		            arr[i] = arr[i+1];
		            arr[i+1] = temp;
            	}
        	}
        }

        for(int i=0; i<arr.length; i++) {
        	System.out.printf("%d %d\n", arr[i].no, arr[i].gas);
        }
	}
    	 
}
