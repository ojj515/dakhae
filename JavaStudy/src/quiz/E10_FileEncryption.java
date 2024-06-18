package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10_FileEncryption {

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
	 *   frankenstein_encrypted(1).eng
	 *   frankenstein_encrypted(2).eng
	 *   frankenstein_encrypted(3).eng
	 */
	
	public static String frankenstein = "Project Gutenberg's Frankenstein, by Mary Wollstonecraft (Godwin) Shelley\r\n"
			+ "\r\n"
			+ "This eBook is for the use of anyone anywhere at no cost and with\r\n"
			+ "almost no restrictions whatsoever.  You may copy it, give it away or\r\n"
			+ "re-use it under the terms of the Project Gutenberg License included\r\n"
			+ "with this eBook or online at www.gutenberg.net\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Title: Frankenstein\r\n"
			+ "       or The Modern Prometheus\r\n"
			+ "\r\n"
			+ "Author: Mary Wollstonecraft (Godwin) Shelley\r\n"
			+ "\r\n"
			+ "Release Date: June 17, 2008 [EBook #84]\r\n"
			+ "\r\n"
			+ "Language: English\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "*** START OF THIS PROJECT GUTENBERG EBOOK FRANKENSTEIN ***\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "\r\n"
			+ "Produced by Judith Boss, Christy Phillips, Lynn Hanninen,\r\n"
			+ "and David Meltzer. HTML version by Al Haines.";

	String cryptSet; 
	
	public E10_FileEncryption () {
		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
				+ "abcdefghijklmnopqrstuvwxyz{}[]|\\;:'\"/?<>,.";
	}
	public E10_FileEncryption(String cryptSet) {
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
		
		File file = new File("myfiles/frankenstein.txt");
		File newFile = new File("myfiles/frankenstein_encrypted.enc");
		
		try {
			FileInputStream input = new FileInputStream(file);
			FileOutputStream output = new FileOutputStream(newFile);
			
			byte[] buff = new byte[1024];
			
			int len;
			while ((len = input.read(buff)) > 0 ) {
				output.write(buff, 0, len);
			}
			input.close();
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		File file1 = new File("myfiles/frankenstein_encrypted.enc");
				
		FileWriter out = null;
		
		try {
			out = new FileWriter("myfiles/frankenstein_encrypted.enc");
			
			E10_FileEncryption a1 = new E10_FileEncryption();
			
			int key = 10;
			
			
			String encrypted = a1.encrypt(frankenstein, 10);
			
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
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.print("시간" + time1);
	}
	
}


//E10_FileEncryption a1 = new E10_FileEncryption();
//
//int key = 10;
//
//String encrypted = a1.encrypt(frankenstein, 10);
