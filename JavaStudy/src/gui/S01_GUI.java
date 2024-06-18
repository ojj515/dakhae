package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_GUI {
	
	/*
	 * 	# Java Swing
	 * 
	 *  - 자바로 GUI(Graphic User Interface) 프로그램을 만들 수 있는 API
	 * 
	 *  # Container
	 * 
	 *  - 컴포넌트들을 배치 할 수 있는 판
	 *  - 다양한 종류의 컨네이너들이 있다
	 *  (JFrame. JPanel, JDialog, ...)
	 * 
	 *  # Component
	 *  
	 *  - 컨테이너 위에 배치할 수 있는 다양한 것들
	 *  - 버튼, 표, 슬라이더 등 다양한 컴포넌트들이 존재한다
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		// 프레임 인스턴스를 생성
		JFrame frame = new JFrame("GUI입니다");		
		JFrame frame2 = new JFrame("옵션창입니다");
		
		// 컴포넌트 인스턴스를 생성
		JButton button1 =  new JButton("버튼1");
		JButton button2 =  new JButton("버튼2");
		
		// 버튼의 위치 및 크기를 설정
		button1.setLocation(30,30);
		button1.setSize(200,80);
		
		// 버튼의 위치와 크기를 한번에 설정
		button2.setBounds(30,120,200,80);		
		
		// 생성한 컴포넌트를 컨테이너 클래스에 붙일 수 있다
		// (JFrame도 컨테이너 역할을 할 수 있다)
		frame.add(button1);
		frame.add(button2);
		
		// 생성해놓은 프레임 인스턴스에 대한 설정
		
		frame.setLocation(100 + 1920, 100);
		// 해당 프레임의 레이아웃 설정 (레이아웃 없앰)
		frame.setLayout(null);
	
		// X 버튼을 눌렀을 때의 동작을 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창의 기본 크기를 설정
		frame.setSize(500,500);
		// 창을 보이게 설정 
		// (화면에 그린다, 그리는 동작은 모든 설정이 끝난 후 해주는 것이 좋다)
		frame.setVisible(true);
		
		frame2.setLocation(600 + 1920, 100);
		frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame2.setSize(300,500);
		frame2.setVisible(true);
		
	}
}
