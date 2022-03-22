package Q2044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=2044
//@Memory 11152, @Time 62
public class Answer1 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine(); // 한 줄 입력받기
        
        char[] arr = new char[line.length()]; // 입력받은 문자열의 길이만큼 char타입 배열 길이 선언
        int i = 0;
        int index = 0;
        while(true) { // true로 무한 반복 진행 -> 추후 조건에 따라 break
        	if (line.charAt(index) == 'A') { // A가 입력되면 i-1
        		i -= 1;
        		if (index == arr.length-1) { // index의 길이가 length의 길이-1 와 같다면 i-1 후 break;
        			i -= 1;
        			break;
        		}
        	} else if (line.charAt(index) == 'B') {  // B가 입력되면 i-2
        		i -= 2;
        		if (index == arr.length-1) { // index의 길이가 length의 길이-1 와 같다면 i-2 후 break;
        			i -= 2;
        			break;
        		}
        	} else if (line.charAt(index) == 'C') {  // C가 입력되면 i를 0으로 초기화
        		i = 0;
        		if (index == arr.length-1) {  // index의 길이가 length의 길이-1 와 같다면 break;
        			break;
        		}
        	} else {  // A,B,C 가 아닌 경우 
        		arr[i] = line.charAt(index); // array의 i자리에 해당 index 문자 저장

        		if (index<arr.length-1) { // index가 array의 길이-1 보다 작다면 i+1
        			i++;	
        		}
        	}
        	
        	if (index<arr.length-1) { // index가 array의 길이-1 보다 작다면 i+1
        		index++;	
        	} else {
        		break; // 반대의 경우 break
        	}
        	
        }
        
    	for (int j=0; j<=i; j++) { // arr의 길이만큼 반복하여 Stringbuilder에 저장 후 출력
        	sb.append(arr[j]);
        }	
        
    	System.out.println(sb);	
	}
}