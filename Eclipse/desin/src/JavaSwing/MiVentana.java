package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MiVentana {

	private JFrame frmMiVentanuca;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana window = new MiVentana();
					window.frmMiVentanuca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiVentanuca = new JFrame();
		frmMiVentanuca.getContentPane().setBackground(new Color(255, 128, 64));
		frmMiVentanuca.getContentPane().setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		frmMiVentanuca.setTitle("Mi Ventanuca");
		frmMiVentanuca.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ALUMNOS-FP\\Downloads\\12998596.png"));
		frmMiVentanuca.setBounds(100, 100, 450, 300);
		frmMiVentanuca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiVentanuca.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		textField.setBounds(46, 71, 131, 18);
		frmMiVentanuca.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Hacerse Rico");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(new Color(255, 128, 0));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		btnNewButton.setBounds(187, 70, 119, 20);
		frmMiVentanuca.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Aceptar Permisos");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 64));
		chckbxNewCheckBox.setForeground(new Color(0, 255, 255));
		chckbxNewCheckBox.setBounds(85, 106, 137, 20);
		frmMiVentanuca.getContentPane().add(chckbxNewCheckBox);
	}
}
