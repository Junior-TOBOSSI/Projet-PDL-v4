package model;

/**
 * Cette classe permet la gestion d'instance de type Admin
 * 
 * Author Hilary BOCO - Gilbert TOBOSSI
 * 
 * Version 1.0
 * 
 */
public class Student {
	
	/**
	 * id de l'étudiant
	 */
	private int id;
	
	/**
	 * nom de l'étudiant
	 */
	private String nom;
	
	/**
	 * prenom de l'admin
	 */
	private String prenom;
	

	/**
	 * classement de l'étudiant
	 */
	private int classement;

	/**
	 * date de naissance de l'étudiant
	 */
	private String dateDeNaissance;

	/**
	 * promotion de l'étudiant
	 */
	private int promotion;
	

	/**
	 * filiere de l'étudiant
	 */
	private int filiere;
	
	/**
	 * mot de passe de l'étudiant
	 */
	private String motDePasse;
	
	
	public Student(int id, String motDePasse) {
		this.id = id;
		this.motDePasse = motDePasse;
	}
	
	public Student(int id, String nom, String prenom, String dateDENaissance,  int classement, String motDePasse, int promotion, int filiere) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.motDePasse = motDePasse;
		this.promotion = promotion;
		this.classement = classement;
		this.filiere = filiere;
	}
	
	public Student(int id, String nom, String prenom, String dateDENaissance,  int classement) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDENaissance;
		this.classement = classement;
	}
	
	
	/**
	 * Cette methode 
	 * @return id de l'admin
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Cette methode 
	 * @return nom de l'étudiant
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Cette methode 
	 * @return prenom de l'étudiant
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Cette methode 
	 * @return age de l'étudiant
	 */
	public String getMotDePasse() {
		return motDePasse;
	}
	
	public int getClassement() {
		return classement;
	}
	
	public int getPromotion() {
		return promotion;
	}
	
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	
	public int getfiliere() {
		return filiere;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setDateDeNaissance(String date) {
		this.dateDeNaissance = date;
	}
	
	public void setClassement(int classement) {
		this.classement = classement;
	}
	
	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}
	
	public void setFiliere(int filiere) {
		this.filiere = filiere;
	}
}
