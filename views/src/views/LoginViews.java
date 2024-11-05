package views;

import java.awt.GridLayout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginViews extends JFrame {
	JFrame login;
	public LoginViews() {
		login = new JFrame();
		login.setTitle("Formulario de login");
		login.setBounds(200,100,500,300);
		
		login.setLayout(new GridLayout(4,2));
		
		JLabel titulo = new JLabel("Autenticacion", JLabel.CENTER);
		login.add(titulo);
		JLabel lUsuario = new JLabel ("Usuario: ");
		JTextField tUsuario = new JTextField(10);
		 
		//etiqueta y campo de contraseña 
		JLabel lPass = new JLabel ("Contraseña: ");
		JPasswordField tPass = new JPasswordField(10);
		
		//boton de acceder y cancelar
		JButton bAcceder = new JButton ("Acceder ");
		bAcceder.addActionListener (new ActionListener() {
			
			@Override //sobreescrito abstracta
			public void actionPerformed(ActionEvent e) {
				String user = tUsuario.getText();
				String pass = String.valueOf(tPass.getPassword());
				validarDatos(user,pass);
				
			}
			
		});
		login.add(titulo);
		login.add(bAcceder);
		
		login.add(lUsuario);
		login.add(lPass);
	
		
		login.add(tUsuario);
		login.add(tPass);
		
		login.setVisible(true);
	}
	
	public static void main (String [] args) {
		new LoginViews();
	}
	
	public void validarDatos(String u, String p) {
		
		String mensaje = "Usuario " +u+ "\nContraseña " +p;
		JOptionPane.showMessageDialog(login, mensaje);
		
	}
	
	

}
