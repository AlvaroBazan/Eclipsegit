package WbuilderSrc;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora1 {

	private JFrame frame;
	private JTextField textField;
	private JButton bLimpiar, bDividir, bMultiplicar, bSumar, bRestar,bIgual;
	private JButton b9,b8,b7,b6,b5,b4,b3,b2,b1,b0,bComa;
	private float numero1;
	private float numero2;
	private String operador;
	private float resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora1 window = new Calculadora1();
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
	public Calculadora1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 495, 685);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 454, 84);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bLimpiar = new JButton("C");
		bLimpiar.setBounds(10, 134, 83, 84);
		bLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=0;
				numero2=0;
				textField.setText("");
			}
		});
		frame.getContentPane().add(bLimpiar);
		
		JButton bDividir = new JButton("/");
		bDividir.setBounds(123, 134, 83, 84);
		bDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Float.parseFloat(textField.getText());
				operador = "/";
				textField.setText("");
			}
		});
		frame.getContentPane().add(bDividir);
		
		JButton bMultiplicar = new JButton("*");
		bMultiplicar.setBounds(242, 134, 83, 84);
		bMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Float.parseFloat(textField.getText());
				operador = "*";
				textField.setText("");
			}
		});		
		frame.getContentPane().add(bMultiplicar);
		
		JButton bRestar = new JButton("-");
		bRestar.setBounds(366, 134, 83, 84);
		bRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Float.parseFloat(textField.getText());
				operador = "-";
				textField.setText("");
			}
		});
		frame.getContentPane().add(bRestar);
		
		JButton bSumar = new JButton("+");
		bSumar.setBounds(366, 245, 83, 158);
		bSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Float.parseFloat(textField.getText());
				operador = "+";
				textField.setText("");
			}
		});
		frame.getContentPane().add(bSumar);
		
		
		JButton b9 = new JButton("9");
		b9.setBounds(10, 229, 83, 84);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		frame.getContentPane().add(b9);
		
		JButton b8 = new JButton("8");
		b8.setBounds(123, 229, 83, 84);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		frame.getContentPane().add(b8);
		
		JButton b7 = new JButton("7");
		b7.setBounds(242, 229, 83, 84);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		frame.getContentPane().add(b7);
		
		JButton b6 = new JButton("6");
		b6.setBounds(10, 324, 83, 84);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		frame.getContentPane().add(b6);
		
		JButton b5 = new JButton("5");
		b5.setBounds(123, 324, 83, 84);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		frame.getContentPane().add(b5);
		
		JButton b4 = new JButton("4");
		b4.setBounds(242, 324, 83, 84);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		frame.getContentPane().add(b4);
		
		JButton b3 = new JButton("3");
		b3.setBounds(10, 434, 83, 84);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		frame.getContentPane().add(b3);
		
		JButton b2 = new JButton("2");
		b2.setBounds(123, 434, 83, 84);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		frame.getContentPane().add(b2);
		
		JButton b1 = new JButton("1");
		b1.setBounds(242, 434, 83, 84);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		frame.getContentPane().add(b1);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		b0.setBounds(10, 533, 196, 84);
		frame.getContentPane().add(b0);
		
		JButton bComa = new JButton(".");
		bComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		bComa.setBounds(242, 533, 83, 84);
		frame.getContentPane().add(bComa);
		
		JButton bIgual = new JButton("=");
		bIgual.setBounds(366, 434, 69, 183);
		bIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2= Float.parseFloat(textField.getText());
				
				switch(operador) {
				case ("+"):
				resultado =numero1+numero2;
				textField.setText(""+resultado);	
				
				}
				switch(operador) {
				case ("-"):
				resultado =numero1+numero2;
				textField.setText(""+resultado);	
				
				}
				switch(operador) {
				case ("*"):
				resultado =numero1+numero2;
				textField.setText(""+resultado);	
				
				}
				switch(operador) {
				case ("/"):
				resultado =numero1+numero2;
				textField.setText(""+resultado);	
				
				}
				
			}
		});
		frame.getContentPane().add(bIgual);
		
		
	}
}
