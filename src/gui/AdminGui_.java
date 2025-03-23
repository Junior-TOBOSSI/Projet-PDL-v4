package gui;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

public class AdminGui_ extends JPanel {

	private static final long serialVersionUID = 1L;

	private int compt;
	private JButton btnDeconnexionAdmin;
	private JButton btnAdd;
	/**
	 * Create the panel.
	 */
	private JPanel panel_1_1;
	private JPanel panel_1;
	
	public AdminGui_(String onglet) {
		
		compt = 0;
		setLayout(new GridLayout(0, 1, 0, 0));
		ConsulterDominante monPanel = new ConsulterDominante();
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		JPanel menu = new JPanel();
		menu.setBounds(169, 0, 852, 56);
		panel.add(menu);
		menu.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel menuDom = new JPanel();
		menu.add(menuDom);
		menuDom.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton menuDomBtn = new JButton("Dominante ");
		menuDomBtn.setForeground(Color.WHITE);
		menuDomBtn.setBackground(new Color(192, 63, 99));
		menuDom.add(menuDomBtn);
		
		JPanel menuEtd = new JPanel();
		menu.add(menuEtd);
		menuEtd.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton menuEtdBtn = new JButton("Etudiant ");
		menuEtdBtn.setForeground(Color.WHITE);
		menuEtdBtn.setBackground(new Color(192, 63, 99));
		menuEtd.add(menuEtdBtn);
		
		JPanel menuEtp = new JPanel();
		menu.add(menuEtp);
		menuEtp.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton menuEtpBtn = new JButton("Etape ");
		menuEtpBtn.setForeground(Color.WHITE);
		menuEtpBtn.setBackground(new Color(192, 63, 99));
		menuEtp.add(menuEtpBtn);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 63, 99));
		panel_1.setBounds(170, 112, 805, 461);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 101, 145, 247);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 64, 122, 42);
		panel_4.add(panel_2_1);
		panel_2_1.setBackground(new Color(162, 63, 99));
		panel_2_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("MODIFIER");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(162, 63, 99));
		panel_2_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 122, 42);
		panel_4.add(panel_2);
		panel_2.setBackground(new Color(162, 63, 99));
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_2 = new JButton("AJOUTER");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(162, 63, 99));
		panel_2.add(btnNewButton_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(10, 115, 122, 42);
		panel_4.add(panel_2_2);
		panel_2_2.setBackground(new Color(162, 63, 99));
		panel_2_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("SUPPRIMER");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(162, 63, 99));
		panel_2_2.add(btnNewButton);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBackground(new Color(162, 63, 99));
		panel_2_2_1.setBounds(10, 168, 122, 42);
		panel_4.add(panel_2_2_1);
		panel_2_2_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnConsulter = new JButton("CONSULTER");
	
		btnConsulter.setForeground(Color.WHITE);
		btnConsulter.setBackground(new Color(162, 63, 99));
		panel_2_2_1.add(btnConsulter);
		
		
		panel_1_1 = new EtudiantGui("ajout");
		
		reInitializeSubPanel(panel_1, panel_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(panel.getBackground());
		panel_3.setVisible(false);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(30, 45, 122, 115);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("PROFIL");
		btnNewButton_3.setBounds(10, 30, 107, 31);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBackground(new Color(162, 63, 99));
		panel_3.add(btnNewButton_3);
		
		JButton btnQuitter = new JButton("");
		btnQuitter.setIcon(new ImageIcon(AdminGui_.class.getResource("/data/quitterIcone.jpg")));
		btnQuitter.setBounds(95, 0, 27, 23);
		btnQuitter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnQuitter.setBackground(new Color(162, 63, 99));
		panel_3.add(btnQuitter);
		
		btnDeconnexionAdmin = new JButton("DECONNEXION");
		btnDeconnexionAdmin.setBounds(10, 72, 107, 31);
		btnDeconnexionAdmin.setBackground(new Color(162, 63, 99));
		btnDeconnexionAdmin.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(btnDeconnexionAdmin);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBackground(panel.getBackground());
		btnNewButton_5.setIcon(new ImageIcon(AdminGui_.class.getResource("/data/login_icon.png")));
		btnNewButton_5.setBounds(10, 11, 56, 56);
		panel.add(btnNewButton_5);
		panel_1.revalidate();
		
		
		menuEtpBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1_1 = new EtapeGui_("ajout");
				
				reInitializeSubPanel(panel_1, panel_1_1);
			}
		});
		
		menuDomBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1_1 = new DominanteGui("ajout");
				
				reInitializeSubPanel(panel_1, panel_1_1);
			}
		});
		menuEtdBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_1_1 = new EtudiantGui("ajout");
				reInitializeSubPanel(panel_1, panel_1_1);
			}
		});
		
		
		
		btnQuitter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_3.setVisible(false);
				panel_4.setVisible(true);	
			}
		});
		
		btnConsulter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnConsulter.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						panel_1_1 = new ConsulterDominante();
						reInitializeSubPanel(panel_1, panel_1_1);
					}
				});
			}
		});
		
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_3.setVisible(true);
				panel_4.setVisible(false);		
			}
		});
		
		if(onglet.equals("etudiant")){
			panel_1_1 = new EtudiantGui("ajout");
			reInitializeSubPanel(panel_1, panel_1_1);
			
		}else if(onglet.equals("etape")){
			panel_1_1 = new EtapeGui("ajout");
			reInitializeSubPanel(panel_1, panel_1_1);
			
		}else{
			panel_1_1 = new DominanteGui("ajout");
			reInitializeSubPanel(panel_1, panel_1_1);
			/*
			panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1_1.setBackground(new Color(162, 63, 99));
			panel_1_1.setForeground(new Color(255, 255, 255));
			panel_1.removeAll();
			panel_1.add(panel_1_1);	
			panel_1.revalidate();
			*/
		}
		
		
		btnAdd = monPanel.getBtnAdd();
		
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel_1_1 = new DominanteGui("ajout");
				reInitializeSubPanel(panel_1, panel_1_1);
			}
		});
		
		

	}
	
	
	public JButton getBtnDeconnexion() {
		return btnDeconnexionAdmin;
	}
	
	public void reInitializeSubPanel(JPanel panelContainer, JPanel panelToAdd) {
		panelContainer.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelContainer.setBackground(new Color(162, 63, 99));
		panelContainer.setForeground(new Color(255, 255, 255));
		panelContainer.removeAll();
		panelContainer.add(panelToAdd);	
		panelContainer.revalidate();
	}
}
