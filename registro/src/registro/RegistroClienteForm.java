package registro;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RegistroClienteForm  extends JFrame {
	
	public RegistroClienteForm() {
		setTitle("Registro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 250);
		setLocationRelativeTo(null);
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets (5, 5, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		JLabel nombreApellidoLabel = new JLabel ("Nombre y Apellido");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.gridwidth = 1;
		add(nombreApellidoLabel, gbc);
		
		JTextField nombreApellidoField = new JTextField (30);
		gbc.gridx= 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(nombreApellidoField, gbc);
		
		JLabel cedulaLabel = new JLabel ("Cedula: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.gridwidth = 1;
		add(cedulaLabel, gbc);
		
		JTextField cedulaField = new JTextField (30);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(cedulaField, gbc);
		
		JButton guardarButton = new JButton ("Guardar");
		JButton cancelarButton = new JButton ("Cancelar");
		JPanel botonesPanel = new JPanel ( new FlowLayout(FlowLayout.CENTER, 10, 0));
		botonesPanel.add(guardarButton);
		botonesPanel.add(cancelarButton);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		add(botonesPanel, gbc);
		
		guardarButton.addActionListener(new ActionListener ()  {
			@Override
			public void actionPerformed (ActionEvent e) {
				String nombreApellido = nombreApellidoField.getText();
				String cedula = cedulaField.getText();
				
				JOptionPane.showMessageDialog(null, "Cliente guardado: \nNombre y Apellido: " + nombreApellido + "\nCedula: " + cedula );
				
			}
		});
		
		cancelarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
				dispose();
			}
		});
		
	}
	public static void main (String [] args) {
		SwingUtilities.invokeLater (() -> {
			RegistroClienteForm form = new RegistroClienteForm();
					form.setVisible(true);
		});
	}
	

}
