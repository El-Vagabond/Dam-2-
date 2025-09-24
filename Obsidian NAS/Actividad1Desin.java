package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actividad1Desin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad1Desin window = new Actividad1Desin();
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
	public Actividad1Desin() {
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
				int num3=Integer.parseInt(textField_2.getText());
				int suma= num1+num2+num3;
				resultado.setText(String.valueOf(suma));
				
			}
		});
		btnNewButton.setBounds(18, 183, 84, 20);
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
				int num3=Integer.parseInt(textField_2.getText());
				int resta= num1-num2-num3;
				resultado.setText(String.valueOf(resta));
			}
		});
		btnResta.setBounds(112, 183, 84, 20);
		frame.getContentPane().add(btnResta);
		
		JLabel lblNumero_2 = new JLabel("Numero 3");
		lblNumero_2.setBounds(18, 132, 60, 12);
		frame.getContentPane().add(lblNumero_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 129, 96, 18);
		frame.getContentPane().add(textField_2);
		
		resultado = new JTextField();
		resultado.setColumns(10);
		resultado.setBounds(218, 184, 96, 18);
		frame.getContentPane().add(resultado);
	}
}
