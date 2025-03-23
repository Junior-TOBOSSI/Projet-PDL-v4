package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AcceuilEtudiantGui extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private int compt = 0;
	private JButton btnDeconnexionEtudiant;
	private JButton btnChoix;

	/**
	 * Create the panel.
	 */
	public AcceuilEtudiantGui() {
		setBackground(new Color(192, 63, 99));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 518, 1021, 81);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("       Ecole Supérieure d’Ingénieurs en  Génie Electrique ESIGELEC ");
		lblNewLabel.setBounds(41, 17, 821, 36);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setForeground(new Color(255, 128, 192));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(AcceuilEtudiantGui.class.getResource("/data/logo_esigelec.png")));
		lblNewLabel_2.setBounds(814, 21, 93, 32);
		panel_1.add(lblNewLabel_2);
		
		JButton btnDominanteFinale = new JButton("Dominante Finale ");
		btnDominanteFinale.setIcon(new ImageIcon(AcceuilEtudiantGui.class.getResource("/data/rideaux.jpg")));
		btnDominanteFinale.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDominanteFinale.setBackground(new Color(255, 128, 192));
		btnDominanteFinale.setActionCommand("Choix");
		btnDominanteFinale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDominanteFinale.setBounds(678, 139, 245, 164);
		add(btnDominanteFinale);
		
		btnChoix = new JButton("Choix");
		
		btnChoix.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChoix.setBackground(new Color(255, 128, 192));
		btnChoix.setActionCommand("Choix ");
		btnChoix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChoix.setBounds(99, 325, 245, 159);
		add(btnChoix);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 593, 38);
		add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblBienvenueMonTalentueux = new JLabel("         Bienvenue mon talentueux et brillant ingénieur\r\n");
		panel.add(lblBienvenueMonTalentueux);
		lblBienvenueMonTalentueux.setForeground(new Color(255, 128, 192));
		lblBienvenueMonTalentueux.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(620, 14, 166, 35);
		add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Your a Winner");
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_3 = new JLabel("DOMINANTE FINALE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(705, 106, 192, 38);
		add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBounds(75, 88, 903, 422);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Si vous avez déjà fait vos choix, encore un peu de patience !");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(29, 41, 549, 28);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Vous le saurez bientôt !");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4_1.setBounds(29, 93, 222, 28);
		panel_3.add(lblNewLabel_4_1);
		
		JButton btnRetour = new JButton("RETOUR");
		btnRetour.setBackground(new Color(255, 128, 192));
		btnRetour.setVisible(false);
		btnRetour.setFont(new Font("Tahoma", Font.ITALIC, 17));
		btnRetour.setBounds(818, 49, 160, 38);
		add(btnRetour);
		
		btnDeconnexionEtudiant = new JButton("Deconnexion");
		btnDeconnexionEtudiant.setBackground(new Color(255, 128, 192));
		btnDeconnexionEtudiant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeconnexionEtudiant.setBounds(851, 0, 134, 35);
		add(btnDeconnexionEtudiant);

		btnDominanteFinale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_3.setVisible(true);	
				btnRetour.setVisible(true);
				btnDominanteFinale.setVisible(false);
				btnChoix.setVisible(false);
				lblNewLabel_3.setVisible(false);
			}
		});
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_3.setVisible(false);
				btnRetour.setVisible(false);
				btnDominanteFinale.setVisible(true);
				btnChoix.setVisible(true);
			}
		});
		
		btnDeconnexionEtudiant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(compt < 10) {
					setSize(new Dimension(1008, 598));
					compt++;
				}
			}
		});
	}
	
	public JButton getBtnChoix() {
		return btnChoix;
	}

	public void setBtnChoix(JButton btnChoix) {
		this.btnChoix = btnChoix;
	}

	public JButton getBtnDeconnexionEtudiant() {
		return btnDeconnexionEtudiant;
	}
}