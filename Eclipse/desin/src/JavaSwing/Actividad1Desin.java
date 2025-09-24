package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiVentanSuma {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentanSuma window = new MiVentanSuma();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiVentanSuma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(99, 61, 96, 18);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 93, 96, 18);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1=Integer.parseInt(textField.getText());
				int num2=Integer.parseInt(textField_1.getText());
				
				int suma= num1+num2;
				JOptionPane.showMessageDialog(btnNewButton, suma);
				
			}
		});
		btnNewButton.setBounds(31, 124, 84, 20);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBounds(18, 64, 71, 12);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 2");
		lblNumero.setBounds(21, 96, 60, 12);
		frame.getContentPane().add(lblNumero);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(textField.getText());
				int num2=Integer.parseInt(textField_1.getText());
				
				int resta= num1-num2;
				JOptionPane.showMessageDialog(btnNewButton, resta);
			}
		});
		btnResta.setBounds(155, 124, 84, 20);
		frame.getContentPane().add(btnResta);
	}

}
