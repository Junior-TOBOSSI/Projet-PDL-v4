package model;

/**
* Cette classe permet la gestion d'instance de type Etape
* 
* Author Hilary BOCO - Gilbert TOBOSSI
* 
* Version 1.0
* 
*/
public class Etape {

	/**
	 * id represent l'id de l'étape
	 */
	private int id;
	
	/**
	 * dateDeDebut represente la date de debut de l'etape
	 */
	private String dateDeDebut;
	
	/**
	 * dateDeFin represente la date de fin de l'etape
	 */
	private String dateDeFin;
	
	/**
	 * nom represente le nom de l'etape
	 */
	private String nom;
	
	/**
	 * Constructor
	 * @param id
	 * @param dateDeDebut
	 * @param dateDeFin
	 * @param nom
	 */
	public Etape(int id, String dateDeDebut, String dateDeFin, String nom) {
		this.id = id;
		this.dateDeDebut = dateDeDebut;
		this.dateDeFin = dateDeFin;
		this.nom = nom;
	}
	
	/**
	 * Cette methode permet d'accéder au 
	 * @return id de l'étape
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Cette methode permet d'accéder au 
	 * @return dateDeDebut de l'étape
	 */
	public String getDateDeDebut() {
		return dateDeDebut;
	}
	
	/**
	 * Cette methode permet d'accéder à la
	 * @return dateDeFin de l'étape
	 */
	public String getDateDeFin() {
		return dateDeFin;
	}
	
	/**
	 * Cette methode permet d'accéder au 
	 * @return nom de l'étape
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Cette methode permet de modifier la
	 * @param dateDeDebut
	 */
	public void setDateDeDebut(String dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}
	
	/**
	 * Cette methode permet de modifier la
	 * @param dateDeDeFin
	 */
	public void setDateDeFin(String dateDeDeFin) {
		this.dateDeFin = dateDeFin;
	}
	
	/**
	 * Cette methode permet de modifier le
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	

}
