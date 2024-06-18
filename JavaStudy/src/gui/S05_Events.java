package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class S05_Events {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Mouse Event");
		f.setLayout(null);
		
		// 글자를 표시할 때 쓰는 컴포넌트
		JLabel label = new JLabel("ID: ");
		label.setBounds(10, 10, 100, 50);
		
		// 글자를 한 줄 입력할 때 쓰는 컴포넌트
		JTextField idfield = new JTextField();
		idfield.setBounds(50, 20, 300, 30);
		
		
		// 모든 컴포넌트에는 키보드 이벤트를 추가할 수 있다
		idfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("눌린키: " + e.getKeyChar());
				System.out.println("키가 눌린 시간: " + e.getWhen());
			}
		});
		
		JLabel label2 = new JLabel("자기소개: ");
		label.setBounds(10, 100, 100, 50);
		// 글자를 여러 줄 입력할 때 쓰는 컴포넌트
		JTextArea introField = new JTextArea();
		introField.setBounds(10, 150, 300, 200);
		
		// 모든 컴포넌트에는 마우스 이벤트를 추가할 수 있다
		introField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("마우스가 클릭됨!");
				System.out.println("이벤트 발생 시의 X좌표: " + e.getX());
				System.out.println("이벤트 발생 시의 X좌표: " + e.getY());
				System.out.println("마우스의 어떤 버튼을 눌렀는가" + e.getButton());
				
				System.out.println("연속 클릭 횟수" + e.getClickCount());
				System.out.printf("모니터에서의 좌표: (%d, %d)\n", e.getXOnScreen(), e.getYOnScreen());
				introField.setText(String.format("(%d, %d)", e.getXOnScreen(), e.getYOnScreen()));

				
			}@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 텍스트 영역에 들어옴!");
				introField.setBackground(Color.BLUE);
				introField.setForeground(Color.YELLOW);
				introField.setFont(new Font("궁서체", Font.BOLD, 20));
				
			}@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 텍스트 영역에서 나감!");
				introField.setBackground(Color.WHITE);
				introField.setForeground(Color.BLACK);
			}
		});
			
		
			// 다양한 메서드를 오버라이드 하여 이벤트를 처리할 수 있다
		
		f.add(label);
		f.add(idfield);
		
		f.add(introField);
		
		f.setLocation(100, 100);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
	}
}
