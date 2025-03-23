package gui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ProfilGui extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ProfilGui() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 54, 85));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROFIL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(31, 37, 124, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setIcon(new ImageIcon(ProfilGui.class.getResource("/data/login_icon.png")));
		lblNewLabel_1.setBounds(31, 75, 64, 64);
		panel.add(lblNewLabel_1);
		
	}
}
