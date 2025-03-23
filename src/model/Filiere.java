package model;

/**
 * Cette classe permet la gestion d'instance de type filiere
 * 
 * Author Hilary BOCO - Gilbert TOBOSSI
 * 
 * Version 1.0
 * 
 */
public class Filiere {
	
	/**
	 * id represente id d'une filiere
	 */
	private int id;
	
	/**
	 * nomFiliere represente le nom de la filière (FISE ou FISA)
	 */
	private String nom;
	
	/**
	 * Constructor
	 * @param id
	 * @param nom
	 */
	public Filiere(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	/**
	 * Cette methode 
	 * @return id de la filière
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Cette methode
	 * @return nom de la filière
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Cette methode modifie le
	 * @param aNom
	 */
	public void setNom(String aNom) {
		this.nom = aNom;
	}
}

