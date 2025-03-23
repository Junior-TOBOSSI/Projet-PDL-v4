package gui;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import dao.*;


public class ChoixEtudiantGui extends JPanel {

	private static final long serialVersionUID = 1L;
	private int compteur = 1;
	private JPanel panelDominantes;
	private ArrayList<JLabel> listLabelsDom;
	private DominanteDao conDom = new DominanteDao();

	/**
	 * Create the panel.
	 */
	public ChoixEtudiantGui() {
		
		
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JPanel panelEntete = new JPanel();
		panelEntete.setBackground(new Color(192, 63, 99));
		panelEntete.setBounds(0, 0, 1005, 88);
		panel.add(panelEntete);
		panelEntete.setLayout(null);
		
		JLabel lblCestLheureDe = new JLabel("C’est l’heure de choisir ta voie \r\n");
		lblCestLheureDe.setBounds(333, 23, 412, 27);
		lblCestLheureDe.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelEntete.add(lblCestLheureDe);
		
		panelDominantes = new JPanel();
		panelDominantes.setBounds(104, 114, 677, 474);
		panel.add(panelDominantes);
		panelDominantes.setLayout(new GridLayout(conDom.getAll().size(), 0, 0, 0));
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBackground(new Color(192, 63, 99));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(819, 237, 146, 45);
		panel.add(btnNewButton);
		
		JButton btnReprendre = new JButton("Reprendre");
		
		btnReprendre.setBackground(new Color(192, 63, 99));
		btnReprendre.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnReprendre.setBounds(819, 315, 146, 45);
		panel.add(btnReprendre);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(192, 63, 99));
		btnRetour.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnRetour.setBounds(819, 396, 146, 45);
		panel.add(btnRetour);
		
		listLabelsDom = new ArrayList<>();
		
		remplirPanel();
		
		btnReprendre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				listLabelsDom = new ArrayList<>();
				panelDominantes.removeAll();
				
				remplirPanel();
				
				panel.revalidate();
				panel.repaint();
				compteur = 0;
				
				afficherOption();
			}
		});
		
		afficherOption();

	}
	
	public void afficherOption() {
		for(JLabel labelDom : listLabelsDom) {
			
			labelDom.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if(compteur > 6) {
						JOptionPane.showConfirmDialog(null, "Nombres de choix maximum de 5 ", "Erreur", JOptionPane.DEFAULT_OPTION);
					}else {
						if(!labelDom.getText().contains("-")) {
							labelDom.setText(labelDom.getText() + "  " + " -    " + String.valueOf(compteur));
							labelDom.setBorder(new LineBorder(new Color(34, 76, 245)));
							compteur++;
						}
					}
				}
			});
		}
	}
	
	public void remplirPanel() {
		
		for(int i = 0; i < conDom.getAll().size(); i++) {
			
			// un crée un label pour la dominante
			JLabel labelDom = new JLabel();
			labelDom.setText(" " + conDom.getAll().get(i).getNomLong() + " (" + conDom.getAll().get(i).getSigle() + " )");
			listLabelsDom.add(i, labelDom);
			panelDominantes.add(listLabelsDom.get(i));	
		}
	}
}
