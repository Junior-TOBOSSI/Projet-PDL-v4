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
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EtapeGui extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	private JTextField textField;
	private JTextField textField_1;
	private String action;

	/**
	 * Create the panel.
	 */
	public EtapeGui(String action) {
		
		
		setVisible(true);
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(162, 63, 99));
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(192, 63, 99));
		panel_1.setBounds(40, 24, 759, 59);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel lblNewLabel = new JLabel("AJOUTER UNE ETAPE");
		
		if(action.equals("ajout")) {
			lblNewLabel.setText("AJOUTER UNE ETAPE");
		}
		else if(action.equals("modifier")){
			lblNewLabel.setText("MODIFIER UNE ETAPE");
		}
		else if(action.equals("supprime")) {
			lblNewLabel.setText("SUPPRIMER UNE ETAPE");
		}
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		panel_1.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(162, 63, 99));
		panel_4.setBounds(40, 91, 759, 338);
		panel.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel(" Id  ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 39, 130, 33);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Nom ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 83, 130, 33);
		panel_4.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(" Date de Debut ");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 133, 130, 33);
		panel_4.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel(" Date de Fin ");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 175, 130, 33);
		panel_4.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Filiere  ");
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
		
		JButton btnNewButton = new JButton(" Valider ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(162, 63, 99));
		btnNewButton.setBounds(355, 289, 115, 33);
		panel_4.add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setModel(new SpinnerDateModel(new Date(1741647600000L), new Date(1741647600000L), new Date(2120857200000L), Calendar.DAY_OF_YEAR));
		spinner.setBounds(161, 135, 571, 33);
		panel_4.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner_1.setModel(new SpinnerDateModel(new Date(1741647600000L), new Date(1741647600000L), new Date(1963090800000L), Calendar.DAY_OF_YEAR));
		spinner_1.setBounds(161, 183, 571, 33);
		panel_4.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner_2.setModel(new SpinnerListModel(new String[] {"FISE", "FISA"}));
		spinner_2.setBounds(161, 227, 571, 33);
		panel_4.add(spinner_2);
		}
}
