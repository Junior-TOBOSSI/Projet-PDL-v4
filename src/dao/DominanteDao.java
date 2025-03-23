package dao;
import model.*;

import java.sql.*;
import java.util.ArrayList;

public class DominanteDao extends ConnectionDao{
	
	private ArrayList<Dominante> listDominante;
	
	public DominanteDao() {
		super();
		listDominante = new ArrayList<>();
	}

	public int add(Dominante dom) {
		
		Connection con = null;
		PreparedStatement ps = null;
		int returnValue = 0;
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("INSERT INTO DOMINANTE(IDDOM, NOMLONG, SIGLE, PLACEMAX, PLACESAPPRENTIS) VALUES(?,?,?,?,?)");
			ps.setInt(1, dom.getId());
			ps.setString(2, dom.getNomLong());
			ps.setString(3, dom.getSigle());
			ps.setInt(4, dom.getPlaceMax());
			ps.setInt(5, dom.getPlacesApprentis());	
			
			returnValue = ps.executeUpdate();
		}
		catch(Exception e) {
			if(e.getMessage().contains("ORA-00001"))
				System.out.println("La dominante existe déjà dans la base de données");
			else
				e.printStackTrace();
		}
		finally {
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
	
	public ArrayList<Dominante> getAll() {
		
		
		listDominante = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM DOMINANTE ORDER BY IDDOM");
			rs = ps.executeQuery();
			
			while(rs.next()){
				listDominante.add(new Dominante(rs.getInt("IDDOM"), rs.getString("NOMLONG"), rs.getString("SIGLE"),
													rs.getInt("PLACEMAX"), rs.getInt("PLACESAPPRENTIS")));
			}
			
			
		}
		catch(Exception e) {
			if(e.getMessage().contains("ORA-00001"))
				System.out.println("La dominante existe déjà dans la base de données");
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
			
		return listDominante;
	}
	
	
	public int update(Dominante dom) {
		
		Connection con = null;
		PreparedStatement ps = null;
		int returnValue = 0;
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("UPDATE DOMINANTE SET NOMLONG = ?, SIGLE = ?, PLACEMAX = ?, PLACESAPPRENTIS = ? WHERE IDDOM = ?");
			ps.setString(1, dom.getNomLong());
			ps.setString(2, dom.getSigle());
			ps.setInt(3, dom.getPlaceMax());
			ps.setInt(4, dom.getPlacesApprentis());
			ps.setInt(5, dom.getId());
		
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
