package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiVentanaCodigo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 200);

		frame.setVisible(true);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);

		JLabel label1 = new JLabel("Texto 1");
		label1.setBounds(50, 30, 50, 60);
		panel.add(label1);
		
		JLabel label2 = new JLabel("Texto 2");
		label1.setBounds(50, 30, 80, 25);
		panel.add(label2);
		JLabel label3 = new JLabel("Texto 3");
		label1.setBounds(50, 30, 80, 25);
		panel.add(label3);
		JLabel label4 = new JLabel("Texto 4");
		label1.setBounds(50, 30, 80, 25);
		panel.add(label4);
		
		JTextField text1= new JTextField(20);
		text1.setBounds(40,20,80,25);
		panel.add(text1);
		
		JButton boton = new JButton("Vamo a Darle");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato = text1.getText();
				System.out.println(dato);
			}
		});
		boton.setBounds(10,20,100,25);
		panel.add(boton);
		
				
				
	}

}