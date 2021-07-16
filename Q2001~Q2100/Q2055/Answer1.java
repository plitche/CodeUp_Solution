package Q2055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2052
//@Memory 11264, @Time 69
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        List<Integer> list = new ArrayList<Integer>();

    	for (int i=1; i*i<=b; i++) {
    		if (a%i == 0) {
    			list.add(i);
    			list.add(a/i);
    		}
    		if (b%i == 0) {
    			list.add(i);
    			list.add(b/i);
    		}
    	}
    	
    	Collections.sort(list);
    	
    	int pre = list.get(0);
    	sb.append(pre + " ");
    	for (int i=1; i<list.size(); i++) {
    		int after = list.get(i);
    		if (pre==after) {
    			continue;
    		} else {
    			sb.append(after + " ");
    			pre=after;
    		}
    	}
        
    	System.out.println(sb);	
	}
}
