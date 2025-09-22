package JavaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MiVentanPro {

	private JFrame frame;
	private JTextField txtEntradaTexto_2;
	private JTextField txtEntradaTexto_1;
	private JTextField txtEntradaTexto;
	private JTextField txtMostrarResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentanPro window = new MiVentanPro();
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
	public MiVentanPro() {
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
		
		txtEntradaTexto_2 = new JTextField();
		txtEntradaTexto_2.setText("Entrada Texto 1");
		txtEntradaTexto_2.setBounds(134, 35, 158, 18);
		frame.getContentPane().add(txtEntradaTexto_2);
		txtEntradaTexto_2.setColumns(10);
		
		txtEntradaTexto_1 = new JTextField();
		txtEntradaTexto_1.setText("Entrada Texto 2");
		txtEntradaTexto_1.setColumns(10);
		txtEntradaTexto_1.setBounds(134, 72, 158, 18);
		frame.getContentPane().add(txtEntradaTexto_1);
		
		txtEntradaTexto = new JTextField();
		txtEntradaTexto.setText("Entrada Texto 3");
		txtEntradaTexto.setColumns(10);
		txtEntradaTexto.setBounds(134, 112, 168, 18);
		frame.getContentPane().add(txtEntradaTexto);
		
		JButton btnNewButton = new JButton("BOTON 1");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(22, 164, 84, 20);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBoton = new JButton("BOTON 2");
		btnBoton.setHorizontalAlignment(SwingConstants.LEFT);
		btnBoton.setForeground(new Color(255, 255, 255));
		btnBoton.setBackground(new Color(0, 255, 255));
		btnBoton.setBounds(116, 164, 84, 20);
		frame.getContentPane().add(btnBoton);
		
		txtMostrarResultado = new JTextField();
		txtMostrarResultado.setText("Mostrar Resultado");
		txtMostrarResultado.setColumns(10);
		txtMostrarResultado.setBounds(206, 165, 96, 18);
		frame.getContentPane().add(txtMostrarResultado);
		
		JTextPane txtpnEtiqueta = new JTextPane();
		txtpnEtiqueta.setText("Etiqueta 1");
		txtpnEtiqueta.setBounds(22, 35, 64, 18);
		frame.getContentPane().add(txtpnEtiqueta);
		
		JTextPane txtpnEtiqueta_3 = new JTextPane();
		txtpnEtiqueta_3.setText("Etiqueta 2");
		txtpnEtiqueta_3.setBounds(22, 72, 64, 18);
		frame.getContentPane().add(txtpnEtiqueta_3);
		
		JTextPane txtpnEtiqueta_1 = new JTextPane();
		txtpnEtiqueta_1.setText("Etiqueta 3");
		txtpnEtiqueta_1.setBounds(22, 112, 64, 18);
		frame.getContentPane().add(txtpnEtiqueta_1);
	}
}
