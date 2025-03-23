package dao;
import model.*;

import java.sql.*;
import java.util.ArrayList;

public class EtudiantDao extends ConnectionDao{
	private ArrayList<Student> listEtudiant;
	public EtudiantDao() {
		super();
	}

	public boolean isStudent (Student etu) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean returnValue = false;
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM STUDENT WHERE IDETUDIANT = ?");
			ps.setInt(1, etu.getId());
			
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				returnValue = (rs.getString("MOTDEPASSE").equals(etu.getMotDePasse()));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) {
					rs = null;
				}
			}catch(Exception ignore) {
			}
			try {
				if(ps != null) {
					ps = null;
				}	
			}catch(Exception ignore) {
			}
			try {
				if(con != null) {
					con = null;
				}
			}catch(Exception ignore) {
			}
		}
		return returnValue;
	}
		
		public ArrayList<Student> getAll() {
			
			
			listEtudiant = new ArrayList<>();
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;

			try {
				con = DriverManager.getConnection(URL, LOGIN, PASS);
				ps = con.prepareStatement("SELECT * FROM STUDENT ORDER BY IDETUDIANT");
				rs = ps.executeQuery();
				
				while(rs.next()){
					listEtudiant.add(new Student(rs.getInt("IDETUDIANT"), rs.getString("NOM"), rs.getString("PRENOM"),
														rs.getString("DATEDENAISANCE"), rs.getInt("CLASSEMENT"), null, rs.getInt("IDPROMOTION"), rs.getInt("IDFILIERE")));
				}
				
				
			}
			catch(Exception e) {
				if(e.getMessage().contains("ORA-00001"))
					System.out.println("L’étudiant existe déjà dans la base de données");
				else
					e.printStackTrace();
			}
			finally {
				
				try {
					if(rs != null) {
						rs.close();
					}	
				}catch(Exception ignore) {
				}
				
				
				
				
				try {
					if(ps != null) {
						ps.close();
					}	
				}catch(Exception ignore) {
				}
				try {
					if(con != null) {
						con.close();
					}
				}catch(Exception ignore) {
				}
			}
				
			return listEtudiant;
		}
		
		
		public int update(Student etu) {
			
			Connection con = null;
			PreparedStatement ps = null;
			int returnValue = 0;
			
			try {
				con = DriverManager.getConnection(URL, LOGIN, PASS);
				ps = con.prepareStatement("UPDATE STUDENT SET NOM = ?, PRENOM = ?, DATEDENAISANCE = ?, CLASSEMENT = ? , PROMOTION = ? , FILIERE = ? WHERE IDETUDIANT = ?");
				ps.setString(1, etu.getNom());
				ps.setString(2, etu.getPrenom());
				ps.setString(3,etu.getDateDeNaissance());
				ps.setInt(4, etu.getClassement ());
				ps.setInt(5, etu.getPromotion ());
				ps.setInt(6, etu.getfiliere());
				ps.setInt(7, etu.getId());
			
				returnValue = ps.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(con != null) {
						con.close();
					}
				}catch(Exception ignore) {
				}
				
				try {
					if(ps != null) {
						ps.close();
					}
				}catch(Exception ignore) {
				}
				
			}
			
			return returnValue;
		}
		
}