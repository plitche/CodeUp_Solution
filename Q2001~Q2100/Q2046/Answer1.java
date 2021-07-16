package Q2046;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2046
//@Memory 11180, @Time 69
public class Answer1 {
// 아직 못품
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), "/");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), "/");
        
        String result = null;
        boolean isSame = true;
        
        while(st2.hasMoreTokens()) {
        	String a = st1.nextToken();
        	String b = st2.nextToken();
        	
        	if (b.indexOf(".") == -1) {
        		if (a.equals(b)) {
        			result += "../";
        			isSame = false;
        		} else {
        			result += b+"/";
        		}
        	} else {
        		result += b;
        	}
        }
        
        if (isSame) {
        	int index = result.lastIndexOf('/');
        	System.out.println("./"+result.substring(index+1));	
        } else {
        	System.out.println("../"+result.substring(4));
        }
    		
	}
}
