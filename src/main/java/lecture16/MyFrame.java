package lecture16;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame() {

		setTitle("Hello Java String!");
		Container c = getContentPane();
		JButton b = new JButton();
		b.setText("Hello");
		c.add(b);

		// 기존의 방식 
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Clicked");
			}
			
		});
		
		// 람다식의 방식 
		b.addActionListener(e->{
			System.out.println("Button Clicked!!");
		});
		
		
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
