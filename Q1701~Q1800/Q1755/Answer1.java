package Q1755;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@author Yongsoo Kwon
//@URL https://www.codeup.kr/problem.php?id=1755
//@Memory 11176, @Time 67

public class Answer1 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String file = br.readLine();

        int index = file.indexOf('.'); // .의 위치 찾기
        String extend = file.substring(index); // .기준으로 잘라서 확장자 찾기
        
        switch(extend) {
        case ".dib" : sb.append("Paint.Picture"); break;
        case ".doc" : sb.append("Word.Document.8"); break;
        case ".docx" : sb.append("Word.Document.12"); break;  
        case ".htm" : sb.append("htmfile"); break;  
        case ".html" : sb.append("htmlfile"); break;  
        case ".hwp" : sb.append("Hwp.Document.96"); break;  
        case ".hwpx" : sb.append("Hwp.Document.hwpx.96"); break;  
        case ".hwt" : sb.append("Hwp.Document.hwt.96"); break;  
        case ".jpe" :
        case ".jpg" :
        case ".jpeg" : sb.append("jpegfile"); break;
        case ".ppt" : sb.append("PowerPoint.Show.8"); break;  
        case ".pptx" : sb.append("PowerPoint.Show.12"); break;  
        case ".pptxml" : sb.append("powerpointxmlfile"); break;
        }
        
        System.out.println(sb);
	}
    	 
}