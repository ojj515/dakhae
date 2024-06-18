package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_Layout {

	/*
	 * 
	 * 	# 레이아웃(Layout)
	 * 
	 *  - 컨네이너에는 레이아웃을 설정할 수 있다
	 *  - 레이아웃은 해당 컨네이너에 컴포넌트를 배치하는 방식을 결정한다
	 * 

	 */
	
	public static void main(String[] args) {
		new Border();
		new MyGridLayout();
		new FlowLayoutExample();
	}
	
}

class Border {    
	JFrame f;
	
	Border()  {    
	    // 프레임 인스턴스 생성
		// (JFrame으로 만든 인스턴스는 레이아웃 기본값이 BorderLayout이다
		f = new JFrame();    
	        
	     // 버튼 인스턴스 생성
	    JButton b1 = new JButton("북쪽버튼");; // the button will be labeled as NORTH   
	    JButton b2 = new JButton("남쪽버튼");; // the button will be labeled as SOUTH  
	    JButton b3 = new JButton("남쪽버튼");; // the button will be labeled as EAST  
	    JButton b4 = new JButton("남쪽버튼");; // the button will be labeled as WEST  
	    JButton b5 = new JButton("중앙버튼");; // the button will be labeled as CENTER  
	       
	    // 보더 레이아웃이 설정된 컨테이넌에 컴포넌트를 붙일 때 방향을 설정 할 수 있다
	    f.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
	    f.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
	    f.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
	    f.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
	    f.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
	    
	    // 프레임의 기본 x버튼 동작이 눌렀을때 창을 사라지게 함 (DISPOSE_ON_CLOSE)
	    // 프로그램이 제대로 종료되게 하려면 하려면 EXIT_ON_CLOSE로 변경해야 함
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setSize(300, 300);    
	    f.setVisible(true);    
	}
	
}

class MyGridLayout {
	JFrame f;

	MyGridLayout() {
		f = new JFrame();
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		// adding buttons to the frame
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);

		// GridLayout은 행과 열을 설정할 수 있는 레이아웃
		f.setLayout(new GridLayout(2, 5));
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setSize(300, 300);
		f.setVisible(true);
	}

}

class FlowLayoutExample {

	JFrame frameObj;

// constructor    
	FlowLayoutExample() {
		// creating a frame object
		frameObj = new JFrame();

		// creating the buttons
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("10");

		// adding the buttons to frame
		frameObj.add(b1);
		frameObj.add(b2);
		frameObj.add(b3);
		frameObj.add(b4);
		frameObj.add(b5);
		frameObj.add(b6);
		frameObj.add(b7);
		frameObj.add(b8);
		frameObj.add(b9);
		frameObj.add(b10);

		// parameter less constructor is used
		// therefore, alignment is center
		// horizontal as well as the vertical gap is 5 units.
		frameObj.setLayout(new FlowLayout());

		frameObj.setSize(300, 300);
		frameObj.setVisible(true);
	}

}






