package gui;
import model.*;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.border.LineBorder;

import dao.DominanteDao;

import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DominanteGui extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private String action;

	/**
	 * Create the panel.
	 */
	public DominanteGui(String action) {
		initialize(action);
	}
	
	public void initialize(String action) {
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
		panel_1.setBounds(40, 24, 759, 59);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel lblNewLabel = new JLabel("AJOUTER UNE DOMINANTE");
		
		if(action.equals("ajout")) {
			lblNewLabel.setText("AJOUTER UNE DOMINANTE");
		}
		else if(action.equals("modifier")){
			lblNewLabel.setText("MODIFIER UNE DOMINANTE");
		}
		else if(action.equals("supprime")) {
			lblNewLabel.setText("SUPPRIMER UNE DOMINANTE");
		}
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		panel_1.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(165, 54, 85));
		panel_4.setBounds(40, 91, 759, 338);
		panel.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel(" Id  ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 39, 130, 33);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Nom Long ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 83, 130, 33);
		panel_4.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sigle ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 133, 130, 33);
		panel_4.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Places Max ");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 175, 130, 33);
		panel_4.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Places Max Apprentis  ");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3_1.setBounds(10, 219, 130, 33);
		panel_4.add(lblNewLabel_1_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(161, 39, 571, 33);
		panel_4.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(161, 83, 571, 33);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(161, 133, 571, 33);
		panel_4.add(textField_2);
		
		JButton btnNewButton = new JButton(" Valider ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(162, 63, 99));
		btnNewButton.setBounds(355, 289, 115, 33);
		panel_4.add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setBounds(161, 177, 571, 33);
		panel_4.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner_1.setBounds(161, 221, 571, 33);
		panel_4.add(spinner_1);
		
		JLabel lblNewLabel_2 = new JLabel("Données incorrectes !!!");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(480, 293, 174, 25);
		panel_4.add(lblNewLabel_2);
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_2.setVisible(false);
				
				int idEnter = Integer.parseInt(textField.getText());
				String nomLongEnter = textField_1.getText().strip();
				String sigleEnter = textField_2.getText().strip();
				int placeMaxEnter = Integer.parseInt(spinner.getModel().getValue().toString());
				int placeApprentisEnter = Integer.parseInt(spinner_1.getModel().getValue().toString());
				
				
				if(nomLongEnter.length() < 50
					&& sigleEnter.length() < 10
					&& placeMaxEnter  < 35
					&& placeApprentisEnter  < 12){
						Dominante dom = new Dominante(idEnter, nomLongEnter, sigleEnter, placeMaxEnter, placeApprentisEnter);
						
						DominanteDao domDao = new DominanteDao();
						int state = domDao.add(dom);
						if(state == 0) {
							lblNewLabel_2.setText("Erreur de connexion !!!");
							lblNewLabel_2.setVisible(true);
						}
						else {
							lblNewLabel_2.setText("Opération réussie !");
							lblNewLabel_2.setVisible(true);
						}
				}
				else {
					lblNewLabel_2.setText("Données incorrectes !!!");
					lblNewLabel_2.setVisible(true);
				}
			}
		});
	}
	}
