package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import dao.DominanteDao;
import dao.EtudiantDao;
import model.Dominante;
import model.Student;

public class ConsulterEtudiant extends JPanel {

	private static final long serialVersionUID = 1L;
	private  int mBefore = 1;
	/**
	 * Create the panel.
	 */
	public ConsulterEtudiant() {

		EtudiantDao conEtu= new EtudiantDao();
		
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		add(panel);
		panel.setLayout(null);
		
		/* Zone id */
		JPanel panelId = new JPanel();
		panelId.setBounds(0, 37, 99, 416);
		panel.add(panelId);
		panelId.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelId.setLayout(new GridLayout(conEtu.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteID = new JLabel(" ID"); 
		enteteID.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelId.add(enteteID);
		
		/* Zone nom  */
		JPanel panelNom = new JPanel();
		panelNom.setBounds(99, 37, 401, 416);
		panelNom.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelNom);
		panelNom.setLayout(new GridLayout(conEtu.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteNom = new JLabel(" Nom "); 
		enteteNom.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelNom.add(enteteNom);
		
		
		/* Zone Prenom */
		JPanel panelPrénom = new JPanel();
		panelPrénom.setBounds(498, 37, 115, 416);
		panel.add(panelPrénom);
		panelPrénom.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrénom.setLayout(new GridLayout(conEtu.getAll().size() + 1, 0, 0, 0));
		
		JLabel entetePrénom = new JLabel(" Prenom"); 
		entetePrénom.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrénom.add(entetePrénom);
		
		
		/* Zone date de Naissance  */
		JPanel paneldatedeNaissance = new JPanel();
		paneldatedeNaissance.setBounds(723, 37, 96, 416);
		panel.add(paneldatedeNaissance);
		paneldatedeNaissance.setBorder(new LineBorder(new Color(0, 0, 0)));
		paneldatedeNaissance.setLayout(new GridLayout(conEtu.getAll().size() + 1, 0, 0, 0));
		
		JLabel entetedatedeNaissance = new JLabel("date de Naissance");
		entetedatedeNaissance.setBorder(new LineBorder(new Color(0, 0, 0)));
		paneldatedeNaissance.add(entetedatedeNaissance);
		
		/* Zone Classement */
		JPanel panelClassement= new JPanel();
		panelClassement.setBounds(613, 37, 110, 416);
		panelClassement.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelClassement);
		panelClassement.setLayout(new GridLayout(conEtu.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteClassement = new JLabel(" Classement ");
		enteteClassement.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelClassement.add(enteteClassement);
		
		/* Zone Promotion */
		JPanel panelPromotion= new JPanel();
		panelPromotion.setBounds(613, 37, 110, 416);
		panelPromotion.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelPromotion);
		panelPromotion.setLayout(new GridLayout(conEtu.getAll().size() + 1, 0, 0, 0));
		
		JLabel entetePromotion = new JLabel(" Promotion ");
		entetePromotion.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPromotion.add(entetePromotion);
		
		/* Zone Filiere */
		JPanel panelFiliere= new JPanel();
		panelFiliere.setBounds(613, 37, 110, 416);
		panelFiliere.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelFiliere);
		panelFiliere.setLayout(new GridLayout(conEtu.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteFiliere = new JLabel(" Filiere ");
		enteteFiliere.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFiliere.add(enteteFiliere);
		
		
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon(ConsulterEtudiant.class.getResource("/data/poubelle.jpg")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(723, 0, 50, 34);
		panel.add(btnDelete);
		
		JButton btnSet = new JButton("");
		btnSet.setIcon(new ImageIcon(ConsulterEtudiant.class.getResource("/data/modifierIcone.jpg")));
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSet.setBounds(648, 0, 50, 34);
		panel.add(btnSet);
		
		JButton btnAdd = new JButton("");
		
		btnAdd.setIcon(new ImageIcon(ConsulterEtudiant.class.getResource("/data/addIcone.jpg")));
		btnAdd.setBounds(557, 0, 50, 34);
		panel.add(btnAdd);
		
		JButton btnValider = new JButton("");
		
		btnValider.setIcon(new ImageIcon(ConsulterEtudiant.class.getResource("/data/validerIcone.jpg")));
		btnValider.setBounds(10, 0, 51, 34);
		panel.add(btnValider);
		
		JButton btnRefresh = new JButton("");
		btnRefresh.setBounds(92, 0, 50, 34);
		panel.add(btnRefresh);
		
		JScrollPane scroll = new JScrollPane(panel);
		scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroll);
		
		
		ArrayList<JButton> listEtudiantID = new ArrayList<>();
		JTextField[] listEtudiantNom = new JTextField[conEtu.getAll().size()];
		JTextField[] listEtudiantPrenom = new JTextField[conEtu.getAll().size()];
		JTextField[] listEtudiantDateDeNaissance= new JTextField[conEtu.getAll().size()];
		JTextField[] listEtudiantClassement = new JTextField[conEtu.getAll().size()];
		JTextField[] listEtudiantPromotion = new JTextField[conEtu.getAll().size()];
		JTextField[] listEtudiantFiliere = new JTextField[conEtu.getAll().size()];
		
		
		
		
		
		

		for(int i = 0; i < conEtu.getAll().size(); i++) {
			
			
			Student etu = conEtu.getAll().get(i);
			/* On ajoute l'id */
			JButton etuButtonID = new JButton();
			etuButtonID.setText(" " + etu.getId());
			listEtudiantID.add(i,etuButtonID);
			panelId.add(listEtudiantID.get(i));
			
			/*+ " " + dom.getNomLong() + " " + dom.getSigle() + " " + dom.getPlaceMax() + 
					" " + dom.getPlacesApprentis() + " ");
					*/
			
			/* On ajoute le nom */
			JTextField etuLabelNom = new JTextField();
			etuLabelNom.setText(" " +etu.getNom());
			etuLabelNom.setEditable(false);
			listEtudiantNom[i] = etuLabelNom;
			panelNom.add(listEtudiantNom[i]);
			
			/* On ajoute le prenom */
			JTextField etuLabelPrenom = new JTextField();
			etuLabelPrenom.setText(" " + etu.getPrenom());
			etuLabelPrenom.setEditable(false);
			listEtudiantPrenom[i] = etuLabelPrenom;
			panelPrénom.add(listEtudiantPrenom[i]);
			
			/* On ajoute la date de naissance*/
			JTextField etuLabelDateDeNaissance = new JTextField();
			etuLabelDateDeNaissance.setText(" " + etu.getDateDeNaissance());
			etuLabelDateDeNaissance.setEditable(false);
			listEtudiantDateDeNaissance[i] = etuLabelDateDeNaissance;
			paneldatedeNaissance.add(listEtudiantDateDeNaissance[i]);
			
			/* On ajoute le classement */
			JTextField etuLabelClassement = new JTextField();
			etuLabelClassement.setText(" " +etu.getClassement());
			etuLabelClassement.setEditable(false);
			listEtudiantClassement[i] = etuLabelClassement;
			panelClassement.add(listEtudiantClassement[i]);
			
		}
		
		
		for(JButton btn : listEtudiantID) {
			
			btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
					/* On active la zone selectionneé */
					listEtudiantNom[mBefore].setEditable(false);
					listEtudiantPrenom[mBefore].setEditable(false);
					listEtudiantDateDeNaissance[mBefore].setEditable(false);
					listEtudiantClassement[mBefore].setEditable(false);
					int num = Integer.parseInt(btn.getText().strip()) - 1;
					
					listEtudiantNom[num].setEditable(true);
					listEtudiantPrenom[num].setEditable(true);
					listEtudiantDateDeNaissance[num].setEditable(true);
					listEtudiantClassement[num].setEditable(true);
					mBefore = num;
					
								
					btnValider.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
					
							/* on recupere les nouvelles informations tapées par l'utilisateur */
							String nouveauNom = listEtudiantNom[num].getText().strip();
							String nouveauPrenom = listEtudiantPrenom[num].getText().strip();
							String nouveauDateDeNaissance = listEtudiantDateDeNaissance[num].getText().strip();
							int nouveauClassement = Integer.parseInt(listEtudiantClassement[num].getText().strip());
							
							Student etu = new Student(num, nouveauNom, nouveauPrenom, nouveauDateDeNaissance, nouveauClassement);
							EtudiantDao etuAo = new EtudiantDao();
							
						System.out.println(etu.toString());
							etuAo.update(etu);
						}
					});
					
				}
			});	
		}
		
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				/*
				panelId.setLayout(new GridLayout(conDom.getAll().size() + 2, 0, 0, 0));
				
				JButton domButtonID = new JButton();
				domButtonID.setText(" " + conDom.getAll().size() + 1);
				listDominanteID.add(conDom.getAll().size(), domButtonID);
				panelId.add(listDominanteID.get(conDom.getAll().size()));
				panel.revalidate();
				panel.repaint();
				*/
			}
		});
	}
}