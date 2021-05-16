package Q1551;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1551
//@Memory 31260, @Time 232
public class Answer1 {
	//	첫 줄에 데이터의 개수 n,
	//	두 번째 줄에 n개의 데이터가 공백을 두고 입력된다.
	//	세 번째 줄에 찾아야하는 값 k가 입력된다.

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String[] numbers = new String[count];
        for (int i=0; i<count; i++) {
        	numbers[i] = st.nextToken();
        }	
        
        String value = br.readLine();
        int result = -1;
        for (int i=0; i<count; i++) {
        	if (numbers[i].equals(value)) {
        		result = i+1;
        		break;
        	}
        }
        
        System.out.println(result);
    }
    
}