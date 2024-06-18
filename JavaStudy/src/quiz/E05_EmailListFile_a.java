package quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E05_EmailListFile_a {

	// 문자열을 전달해주면 해당 문자열 앞에 있는 이메일들만 추출하여 파일로 써주는 메서드
	public static void makeEmailFile(String text) {

		 Pattern emailPattern = Pattern.compile("\\S*@\\S*");
		 Matcher m = emailPattern.matcher(text);
		 
		 FileWriter fout = null;
		 
		 try {
			 fout = new FileWriter("myfiles/emails.txt");
			 
			 while(m.find()) {
				 String email = m.group();
				 fout.append(email + "\n");
			 }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fout != null) {
					fout.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	 
	// D11번 문제에 있는 기자들의 이메일로만 이루어진 파일을 myfiles 폴더에 생성해보세요
	
	public static void main(String[] args) {
		makeEmailFile(D11_ReporterList_a.reporters);
	}
}
