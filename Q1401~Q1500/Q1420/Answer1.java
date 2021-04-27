package Q1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1420
//@Memory 11256, @Time 94

public class Answer1 {
	//	n명의 친구들의 이름과 정보 성적이 주어졌을 때 성적이 세 번째로 높은 학생의 이름을 출력하시오.
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int number = Integer.parseInt(br.readLine());
    	StringTokenizer st;
    	
    	Map<Integer, String> Students = new HashMap<Integer, String>();	// 이름과 키를 저장할 map
    	int[] heights = new int[number];	// 키 저장할 배열
    	
    	for (int i=0; i<number; i++) {
    		st = new StringTokenizer(br.readLine(), " ");
    		String name = st.nextToken();	// 이름
    		int height = Integer.parseInt(st.nextToken());	// 키
    		
    		Students.put(height, name);	// 이름과 키 amp에 저장
    		heights[i] = height;	// 키 배열에 저장 
    	}
    	
    	// 배열 오름차순 정렬
    	Arrays.sort(heights);

    	// 3번째로 큰 키를 key로 꺼낸다
    	System.out.println(Students.get(heights[number-3]));
        br.close();
    }
    	 
}