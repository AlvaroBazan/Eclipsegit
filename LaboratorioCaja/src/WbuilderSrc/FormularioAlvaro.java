package WbuilderSrc;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Window.Type;
import javax.swing.JPasswordField;

public class FormularioAlvaro {

	private JFrame frmLogin;
	private AbstractButton textUsuario;
	private AbstractButton textApellidos;
	private JPasswordField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioAlvaro window = new FormularioAlvaro();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormularioAlvaro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setBackground(Color.GREEN);
		frmLogin.setBounds(100, 100, 700, 367);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
	
		
		
		// aqui viene el nombre y el text area
		JLabel lblNewLabel = new JLabel("nombrre");
		lblNewLabel.setBounds(40, 34, 82, 40);
		lblNewLabel.setToolTipText("");
		frmLogin.getContentPane().add(lblNewLabel);
		
		JTextArea textNombre = new JTextArea();
		textNombre.setBounds(113, 42, 173, 32);
		frmLogin.getContentPane().add(textNombre);
		
		
		// aqui viene el appellido y su text area
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(40, 95, 82, 40);
		lblApellidos.setToolTipText("");
		frmLogin.getContentPane().add(lblApellidos);
		
		JTextArea textApellidos = new JTextArea();
		textApellidos.setBounds(112, 103, 256, 34);
		frmLogin.getContentPane().add(textApellidos);
		
		
		//Aqui viene el usuario y su text area
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(40, 146, 82, 40);
		lblUsuario.setToolTipText("");
		frmLogin.getContentPane().add(lblUsuario);
		
		JTextArea textUsuario = new JTextArea();
		textUsuario.setBounds(112, 154, 173, 32);
		frmLogin.getContentPane().add(textUsuario);


		//aqui viene la contraseña y su text area
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(40, 197, 82, 40);
		lblContrasea.setToolTipText("");
		frmLogin.getContentPane().add(lblContrasea);
		
		textContraseña = new JPasswordField();
		textContraseña.setBounds(113, 201, 173, 36);
		frmLogin.getContentPane().add(textContraseña);
		
		
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.setBounds(425, 224, 158, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has guardado los datos.");
				JOptionPane.showMessageDialog(null, "Entrada correcta");
				textNombre.setText(null);
				textApellidos.setText(null);
				textUsuario.setText(null);
				textContraseña.setText(null);
			}



		
		});
		frmLogin.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(425, 285, 158, 34);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hasta la vista");
				System.exit(0);
			}
		});
		frmLogin.getContentPane().add(btnNewButton_1);
		
		
	}	
}
