package Q1005;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// @author Yongsoo Kwon
// @URL https://www.codeup.kr/problem.php?id=1005
// @How BufferedWriter
// @Memory 11040, @Time 84

public class Answer2 {

	public static void main(String[] args) throws IOException {
		/*	
		 * buffer(버퍼)
		 * - 일시적으로 전송할 데이터를 보관하는 임시 메모리 영역
		 * - 입출력 속도 향상에 도움이 된다. (많은 양을 처리할 때 성능에서 뛰어나다.)
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//버퍼를 이용한 출력
		
		//append() 메소드 대신 write() 메소드도 가능하다.
		bw.append("\"Hello World\"");
		// write() 메소드는 연결해서 사용이 불가하여 나누어서 작성한다. 
		/*
		 * bw.write("\"");	
		 * bw.write("Hello");
		 * bw.write("\s");
		 * bw.write("World");
		 * bw.write("\"");
		 * ---------------------
		 * bw.write("\'Hello World\'");
		 */
		 
		bw.flush();	//버퍼에 남아있는 데이터를 출력시킴(버퍼를 비우는 동작)
		bw.close();
	}
}
