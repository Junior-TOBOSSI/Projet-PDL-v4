package gui;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import dao.DominanteDao;
import model.*;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ConsulterDominante extends JPanel {

	private static final long serialVersionUID = 1L;
	private int mBefore = 1;
	private JButton btnAdd;
	

	/**
	 * Create the panel.
	 */
	public ConsulterDominante() {
		
		DominanteDao conDom = new DominanteDao();
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
		panelId.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteID = new JLabel(" ID"); 
		enteteID.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelId.add(enteteID);
		
		/* Zone nom long */
		JPanel panelNomLong = new JPanel();
		panelNomLong.setBounds(99, 37, 401, 416);
		panelNomLong.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelNomLong);
		panelNomLong.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteNomLong = new JLabel(" Nom Long"); 
		enteteNomLong.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelNomLong.add(enteteNomLong);
		
		
		/* Zone Sigle */
		JPanel panelSigle = new JPanel();
		panelSigle.setBounds(498, 37, 115, 416);
		panel.add(panelSigle);
		panelSigle.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSigle.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel enteteSigle = new JLabel(" Sigle"); 
		enteteSigle.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSigle.add(enteteSigle);
		
		
		/* Zone place Apprentis */
		JPanel panelPlaceApprentis = new JPanel();
		panelPlaceApprentis.setBounds(723, 37, 96, 416);
		panel.add(panelPlaceApprentis);
		panelPlaceApprentis.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlaceApprentis.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel entetePlaceApprentis = new JLabel(" Pl. Apprentis");
		entetePlaceApprentis.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlaceApprentis.add(entetePlaceApprentis);
		
		/* Zone place Max */
		JPanel panelPlaceMax = new JPanel();
		panelPlaceMax.setBounds(613, 37, 110, 416);
		panelPlaceMax.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(panelPlaceMax);
		panelPlaceMax.setLayout(new GridLayout(conDom.getAll().size() + 1, 0, 0, 0));
		
		JLabel entetePlaceMax = new JLabel(" Pl. Max");
		entetePlaceMax.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPlaceMax.add(entetePlaceMax);
		
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon(ConsulterDominante.class.getResource("/data/poubelle.jpg")));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(748, 0, 50, 34);
		panel.add(btnDelete);
		
		btnAdd = new JButton("");
		
		btnAdd.setIcon(new ImageIcon(ConsulterDominante.class.getResource("/data/addIcone.jpg")));
		btnAdd.setBounds(697, 0, 50, 34);
		panel.add(btnAdd);
		
		JButton btnValider = new JButton("");
		
		
		btnValider.setIcon(new ImageIcon(ConsulterDominante.class.getResource("/data/validerIcone.jpg")));
		btnValider.setBounds(646, 0, 51, 34);
		panel.add(btnValider);
		
		JButton btnRefresh = new JButton("");
		btnRefresh.setBounds(0, 0, 50, 34);
		panel.add(btnRefresh);
		
		JScrollPane scroll = new JScrollPane(panel);
		scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);
		add(scroll);
		
		
		ArrayList<JButton> listDominanteID = new ArrayList<>();
		JTextField[] listDominanteNomLong = new JTextField[conDom.getAll().size()];
		JTextField[] listDominanteSigle = new JTextField[conDom.getAll().size()];
		JTextField[] listDominantePlaceMax = new JTextField[conDom.getAll().size()];
		JTextField[] listDominantePlacesApprentis = new JTextField[conDom.getAll().size()];
		

		for(int i = 0; i < conDom.getAll().size(); i++) {
			
			
			Dominante dom = conDom.getAll().get(i);
			/* On ajoute l'id */
			JButton domButtonID = new JButton();
			domButtonID.setText(" " + dom.getId());
			listDominanteID.add(i,domButtonID);
			panelId.add(listDominanteID.get(i));
			
			/*+ " " + dom.getNomLong() + " " + dom.getSigle() + " " + dom.getPlaceMax() + 
					" " + dom.getPlacesApprentis() + " ");
					*/
			
			/* On ajoute le nom Long */
			JTextField domLabelNomLong = new JTextField();
			domLabelNomLong.setText(" " + dom.getNomLong());
			domLabelNomLong.setEditable(false);
			listDominanteNomLong[i] = domLabelNomLong;
			panelNomLong.add(listDominanteNomLong[i]);
			
			/* On ajoute le sigle */
			JTextField domLabelSigle = new JTextField();
			domLabelSigle.setText(" " + dom.getSigle());
			domLabelSigle.setEditable(false);
			listDominanteSigle[i] = domLabelSigle;
			panelSigle.add(listDominanteSigle[i]);
			
			/* On ajoute le nombre de place maximum */
			JTextField domLabelPlaceMax = new JTextField();
			domLabelPlaceMax.setText(" " + dom.getPlaceMax());
			domLabelPlaceMax.setEditable(false);
			listDominantePlaceMax[i] = domLabelPlaceMax;
			panelPlaceMax.add(listDominantePlaceMax[i]);
			
			/* On ajoute le nombre de place apprentis */
			JTextField domLabelPlaceApprentis = new JTextField();
			domLabelPlaceApprentis.setText(" " + dom.getPlacesApprentis());
			domLabelPlaceApprentis.setEditable(false);
			listDominantePlacesApprentis[i] = domLabelPlaceApprentis;
			panelPlaceApprentis.add(listDominantePlacesApprentis[i]);
			
		}
		
		
		for(JButton btn : listDominanteID) {
			
			btn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					/* On active la zone selectionneé */
					listDominanteNomLong[mBefore].setEditable(false);
					listDominanteSigle[mBefore].setEditable(false);
					listDominantePlaceMax[mBefore].setEditable(false);
					listDominantePlacesApprentis[mBefore].setEditable(false);
					int num = Integer.parseInt(btn.getText().strip()) - 1;
					
					listDominanteNomLong[num].setEditable(true);
					listDominanteSigle[num].setEditable(true);
					listDominantePlaceMax[num].setEditable(true);
					listDominantePlacesApprentis[num].setEditable(true);
					mBefore = num;
					
								
					btnValider.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							
							int confirm = JOptionPane.showConfirmDialog(null, "Est vous sur de vouloir modifier ces informations ?", 
									"Validation", JOptionPane.DEFAULT_OPTION);
							
							/* on recupere les nouvelles informations tapées par l'utilisateur */
							String nouveauNomLong = listDominanteNomLong[num].getText().strip();
							String nouveauSigle = listDominanteSigle[num].getText().strip();
							int nouveauPlaceMax = Integer.parseInt(listDominantePlaceMax[num].getText().strip());
							int nouveauPlaceApprentis = Integer.parseInt(listDominantePlacesApprentis[num].getText().strip());
							
							Dominante dom = new Dominante(num +1, nouveauNomLong, nouveauSigle, nouveauPlaceMax, nouveauPlaceApprentis);
							DominanteDao domAo = new DominanteDao();
							
							if(confirm == 0) {
								domAo.update(dom);
							}
						}
					});
					
				}
			});	
		}		
	}


	public JButton getBtnAdd() {
		return btnAdd;
	}


	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}
}
