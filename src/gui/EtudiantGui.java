package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import javax.swing.border.LineBorder;

public class EtudiantGui extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 * @param string 
	 */
	public EtudiantGui(String action) {

		setBackground(new Color(255, 255, 255));
		
		setVisible(true);
		
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(165, 54, 85));
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(165, 54, 85));
		panel_1.setBounds(40, 24, 759, 50);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel lblNewLabel = new JLabel("AJOUTER UN ETUDIANT");
		
		if(action.equals("ajout")) {
			lblNewLabel.setText("AJOUTER UN ETUDIANT");
		}
		else if(action.equals("modifier")){
			lblNewLabel.setText("MODIFIER UN ETUDIANT ");
		}
		else if(action.equals("supprime")) {
			lblNewLabel.setText("SUPPRIMER UN ETUDIANT");
		}
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(165, 54, 85));
		panel_1.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(165, 54, 85));
		panel_4.setBounds(40, 85, 759, 375);
		panel.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel(" Id  ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 11, 130, 33);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Nom/Last Name ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(20, 62, 130, 33);
		panel_4.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Prenom/First Name");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 106, 130, 33);
		panel_4.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Date de Naissance ");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 150, 130, 33);
		panel_4.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Classement 1A");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_1.setBounds(10, 194, 120, 33);
		panel_4.add(lblNewLabel_1_3_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(161, 110, 571, 33);
		panel_4.add(textField_2);
		
		JButton btnNewButton = new JButton(" Valider ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(162, 63, 99));
		btnNewButton.setBounds(359, 332, 115, 33);
		panel_4.add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1741734000000L), new Date(1741734000000L), new Date(1962831600000L), Calendar.DAY_OF_YEAR));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setBounds(161, 150, 571, 33);
		panel_4.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner_1.setBounds(161, 194, 571, 33);
		panel_4.add(spinner_1);
		
		textField = new JTextField();
		textField.setBounds(161, 10, 571, 38);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 61, 572, 38);
		panel_4.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(161, 282, 571, 33);
		panel_4.add(textField_3);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Filiere ");
		lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_1_1.setBounds(20, 238, 120, 33);
		panel_4.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Promotion");
		lblNewLabel_1_3_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_1_2.setBounds(20, 282, 120, 33);
		panel_4.add(lblNewLabel_1_3_1_2);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setModel(new SpinnerListModel(new String[] {"FISE", "FISA"}));
		spinner_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner_1_1.setBounds(161, 238, 571, 33);
		panel_4.add(spinner_1_1);

	}
}