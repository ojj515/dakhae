package mywork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileEncryption {

	/*
	 * 
	 *  frankenstein.txt를 시저 암호방식으로 암호화한 새 파일
	 *  frankenstein_encrypted.enc를 생성해보세요
	 * 
	 * (1) char 단위로 한 글자씩 암호화하는 속도를 측정해보기
	 * 
	 * (2) char[] 방식으로 암호화하는 속도를 측정해보기
	 * 
	 * (3) Buffered 클래스를 붙여 암호화하는 속도를 측정해보기
	 * 
	 * (4) 이미 같은 이름의 결과 파일이 경로에 존재한다면
	 *   파일의 이름 뒤에 (숫자)를 붙여 다음 파일이 생기게 만들기
	 *   
	 *   frankenstein_encrypted(1).enc
	 *   frankenstein_encrypted(2).enc
	 *   frankenstein_encrypted(3).enc
	 */
	
	String cryptSet; 
	
	public FileEncryption () {
		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
				+ "abcdefghijklmnopqrstuvwxyz{}[]|\\;:'\"/?<>,.";
	}
	public FileEncryption(String cryptSet) {
		this.cryptSet = cryptSet;
	}
	
	String encrypt(String plain,int key) {
		StringBuilder result = new StringBuilder();
		
		int len = plain.length();
		
		for(int i = 0; i < len; ++i) {
			// 문자를 하나씩 꺼낸다
			char ch = plain.charAt(i);
			// 암호표에서 해당 문자의 위치를 찾는다
			int index = cryptSet.indexOf(ch);
			
			// 만약 -1이 나왔다면 암호표에 존재하지 않는 문자이므로 그래도 유지
			if(index != -1) {
				result.append(cryptSet.charAt(
						(index + key) % cryptSet.length()));
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) throws IOException {

		String filePath = "D:\\workspace\\Home\\myfiles\\frankenstein.txt";

		FileWriter out = null;
		try {
			out = new FileWriter("myfiles/frankenstein_encrypted.enc");

			String content = new String(Files.readAllBytes(Paths.get(filePath)));

			FileEncryption a1 = new FileEncryption();

			int key = 10;

			String encrypted = a1.encrypt(content, 10);

			out.write(encrypted);

			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	        
		File emailFile = new File("myfiles/frankenstein_encrypted.enc");
		long start, end;
		
		start = System.currentTimeMillis();
		try(FileReader in = new FileReader(emailFile);) {
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time1 = end - start;
		
		start = System.currentTimeMillis();
		try (FileReader in = new FileReader(emailFile);) {
			char[] buff = new char[2048];

			int len;
			while ((len = in.read(buff)) != -1) {
				System.out.println(new String(buff, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time2 = end - start;
		
		start = System.currentTimeMillis();
		try (FileReader fin = new FileReader(emailFile); BufferedReader in = new BufferedReader(fin);) {
			String line;
			while ((line = in.readLine()) != null) {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time3 = end - start;
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("char 시간:" + time1);
		System.out.println("char[] 시간:" + time2);
		System.out.println("Buffered 시간" + time3);
		
		// 마지막 4번 문제는 잘 모르겠습니다 죄송합니다 ㅠ
		
	}
	
}
