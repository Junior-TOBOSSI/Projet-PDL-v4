package dao;
import model.*;

import java.sql.*;

public class AdminDao extends ConnectionDao{
	
	public AdminDao() {
		super();
	}

	public boolean isAdmin (Admin ad) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean returnValue = false;
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM ADMIN WHERE IDADMIN = ?");
			ps.setInt(1, ad.getId());
			
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				returnValue = (rs.getString("MOTDEPASSE").equals(ad.getMotDePasse()));
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
	
	
}
