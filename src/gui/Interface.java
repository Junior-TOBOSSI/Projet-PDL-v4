package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import dao.AdminDao;
import dao.EtudiantDao;
import model.Admin;
import model.Student;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.border.EmptyBorder;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frmChoixDominantes;
	private int connection;
	private JButton btnDeconnexionEtudiant;
	private JButton btnConnexion;
	private JButton btnDeconnAcceuilAdmin;
	private JButton btnDominateFrAcc;
	private JButton btnEtapeFrAcc;
	private JButton btnEtudiantFrAcc;
	private JButton btnChoix;
	private JButton btnDeconnexionAdmin1; 
	private JButton btnDeconnexionAdmin2;
	private JButton btnDeconnexionAdmin3;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmChoixDominantes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmChoixDominantes = new JFrame();
		frmChoixDominantes.getContentPane().setForeground(new Color(255, 255, 255));
		frmChoixDominantes.getContentPane().setBackground(new Color(255, 255, 255));
		frmChoixDominantes.setBackground(new Color(192, 63, 99));
		frmChoixDominantes.setResizable(false);
		frmChoixDominantes.setTitle("Choix Dominantes");
		frmChoixDominantes.setBounds(100, 100, 1001, 634);
		frmChoixDominantes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChoixDominantes.setLocationRelativeTo(null);
		frmChoixDominantes.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		
		frmChoixDominantes.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		frmChoixDominantes.setVisible(true);
		
		// Instanciation du panel d'authentification et ajout comme panel de base
		
		AuthentificationGui authen = new AuthentificationGui();
		panel.add(authen);
		
		// Intanciation des panels intérieurs
		
		AcceuilEtudiantGui acceuilEtu = new AcceuilEtudiantGui();
		AcceuilAdminGui acceuilAdmin = new AcceuilAdminGui();
		ChoixEtudiantGui choixEtu = new ChoixEtudiantGui();
		AdminGui_ adminGui_dominante = new AdminGui_("dominante");
		AdminGui_ adminGui_etudiant = new AdminGui_("etudiant");
		AdminGui_ adminGui_etape = new AdminGui_("etape");
		
		// Instanciation des boutons importés
		
		btnDeconnexionAdmin1 = adminGui_dominante.getBtnDeconnexion();
		btnDeconnexionAdmin2 = adminGui_etudiant.getBtnDeconnexion();
		btnDeconnexionAdmin3 = adminGui_etape.getBtnDeconnexion();
		btnDeconnexionEtudiant = acceuilEtu.getBtnDeconnexionEtudiant();
		btnDeconnAcceuilAdmin = acceuilAdmin.getBtnDeconnexion();
		btnDominateFrAcc = acceuilAdmin.getBtnDominante();
		btnConnexion = authen.getBtnConnexion();
		btnEtudiantFrAcc = acceuilAdmin.getBtnEtudiant();
		btnEtapeFrAcc = acceuilAdmin.getBtnEtape();
		btnChoix = acceuilEtu.getBtnChoix();
		
		btnDeconnexionAdmin1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				checkRemove(panel, adminGui_etudiant);
				checkRemove(panel, adminGui_etape);
				checkRemove(panel, adminGui_dominante);
				
				reInitializePanel(panel, null, authen);
			}
		});	
		
		btnDeconnexionAdmin2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				checkRemove(panel, adminGui_etudiant);
				checkRemove(panel, adminGui_etape);
				checkRemove(panel, adminGui_dominante);
				
				reInitializePanel(panel, null, authen);
			}
		});	
		
		btnDeconnexionAdmin3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				checkRemove(panel, adminGui_etudiant);
				checkRemove(panel, adminGui_etape);
				checkRemove(panel, adminGui_dominante);
				
				reInitializePanel(panel, null, authen);
				
				
			}
		});	
		
		
		
		
		btnDeconnexionEtudiant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				reInitializePanel(panel, acceuilEtu, authen);
				
			}
		});		
		
		
		
		btnDeconnAcceuilAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				reInitializePanel(panel, acceuilAdmin, authen);
			}
		});
		
		
		
		
		btnConnexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				connection = authen.getBalise();	
				
				if(connection == 1) {
					
					reInitializePanel(panel, authen, acceuilAdmin);
				}else {
					if(connection == 2) {
						
						reInitializePanel(panel, authen, acceuilEtu);
					}
				}
			}
		});
		
		
		
		
		btnDominateFrAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				reInitializePanel(panel, null, adminGui_dominante);

			}
		});
		
		
		btnEtudiantFrAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				reInitializePanel(panel, null, adminGui_etudiant);
			}
		});
		
		
		btnEtapeFrAcc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				reInitializePanel(panel, null, adminGui_etape);
			}
		});
		
		
		btnChoix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				reInitializePanel(panel, null, choixEtu);
			}
		});	
	}
	
	
	public void reInitializePanel(JPanel panelContainer, JPanel panelToRemove, JPanel panelToAdd) {
		
		
		checkRemove(panelContainer, panelToRemove);
		panelContainer.removeAll();
		panelContainer.add(panelToAdd);
		panelContainer.revalidate();
		panelContainer.repaint();
	}
	
	
	public void checkRemove(JPanel panelContainer, JPanel panelToRemove) {
		
		if(panelToRemove != null) {
			panelContainer.remove(panelToRemove);
		}
	}
}