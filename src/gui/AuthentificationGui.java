package gui;
import model.*;
import dao.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class AuthentificationGui extends JPanel {
	
	private static final long serialVersionUID = 1L;

	
	private JTextField idEnter;
	private JPasswordField passwordField;
	private JTextField textField;
	private int balise;
	private JLabel lblNewLabel;
	private JLabel lblMotDePasse;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnConnexion;
	
	/**
	 * Create the panel.
	 */
	public AuthentificationGui() {
		setSize(new Dimension(1023, 628));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 63, 99));
		panel.setBounds(0, 40, 1015, 482);
		add(panel);
		panel.setLayout(null);
		
		idEnter = new JTextField();
		idEnter.setFont(new Font("Tahoma", Font.PLAIN, 17));
		idEnter.setBounds(370, 202, 303, 35);
		panel.add(idEnter);
		idEnter.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(370, 279, 303, 35);
		panel.add(passwordField);
		
		btnConnexion = new JButton("Connexion");
		
		
		btnConnexion.setBackground(new Color(192, 63, 99));
		
		btnConnexion.setBounds(432, 347, 121, 35);
		panel.add(btnConnexion);
		
		lblNewLabel = new JLabel("Identifiant");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(370, 171, 262, 20);
		panel.add(lblNewLabel);
		
		lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMotDePasse.setBounds(370, 248, 262, 20);
		panel.add(lblMotDePasse);
		
		lblNewLabel_1 = new JLabel("<html><u>Mot de passe oublié ?</u></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(370, 413, 262, 20);
		panel.add(lblNewLabel_1);
		
		panel_1 = new JPanel();
		panel_1.setBounds(275, 72, 437, 51);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNewLabel_2 = new JLabel("          Authentification");
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(0, 0, 1015, 42);
		add(textField);
		textField.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(0, 513, 1015, 92);
		add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Ecole Supérieure d’Ingénieurs en  Génie Electrique ESIGELEC ");
		lblNewLabel_3.setBounds(74, 36, 764, 27);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setForeground(new Color(255, 128, 192));
		panel_2.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(AuthentificationGui.class.getResource("/data/logo_esigelec.png")));
		lblNewLabel_4.setBounds(790, 23, 104, 60);
		panel_2.add(lblNewLabel_4);
		
		btnConnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int utilisateurEnter = Integer.parseInt(idEnter.getText().strip());
				char[] motDePasseEnter = passwordField.getPassword();
				
				String motDePasseEnter_ = String.valueOf(motDePasseEnter, 0, motDePasseEnter.length);
				
				Admin ad = new Admin(utilisateurEnter, motDePasseEnter_);
				AdminDao adao = new AdminDao();
				
				
				if(adao.isAdmin(ad)) {
					balise = 1;
				}else {
					Student etu = new Student(utilisateurEnter, motDePasseEnter_);
					EtudiantDao etudao = new EtudiantDao();
					
					
					if(etudao.isStudent(etu)) {
						balise = 2;
					}
				}
			}
		});
	}
	
	
	public int getBalise() {
		return balise;
	}
	
	public JButton getBtnConnexion() {
		return btnConnexion;
	}
	
	
	/*
	public JTextField getMotDePasse() {
		return passwordField;
	}
	
	public JTextField getIdEnter() {
		return idEnter;
	}
	**/
}