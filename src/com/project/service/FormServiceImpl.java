package com.project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.db.DB;
import com.project.model.Registration;

public class FormServiceImpl implements FormService {
	Connection con = null;

	public FormServiceImpl() {
		con = DB.getDb();

	}

	@Override
	public boolean Insert(Registration r) {
		String sql = "INSERT INTO projecttable(username,password,first_name,middle_name,last_name,gender,phone,email,dateofbirth,college,address)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, r.getUsername());
			;
			ps.setString(2, r.getPassword());
			ps.setString(3, r.getFname());
			ps.setString(4, r.getMname());
			ps.setString(5, r.getLname());
			ps.setString(6, r.getGender());
			ps.setString(7, r.getPhone());
			ps.setString(8, r.getEmail());
			ps.setDate(9, r.getDob());
			ps.setString(10, r.getCollege());
			ps.setString(11, r.getAddress());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Registration login(Registration from) {

		Registration user= null;

		String sql = "SELECT * FROM projecttable where username='" + from.getUsername() + "' and password = '"
				+ from.getPassword() + "'     ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {

				user = new Registration();
				user.setId(rs.getInt("id"));
				user.setFname(rs.getString("first_name"));

				return user;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return user;
	}

	@Override
	public boolean ConfirmUsernameAndPhone(Registration f) {
		try {
			Statement st = con.createStatement();
			String sql = "SELECT * FROM projecttable";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString("username").equals(f.getUsername())
						&& (rs.getString("phone").equals(f.getPhone()) || rs.getString("email").equals(f.getEmail()))) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean UpdatePassword(Registration f) {
		String sql = "UPDATE projecttable SET password=? WHERE username=? AND phone=? OR email=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, f.getPassword());
			ps.setString(2, f.getUsername());
			ps.setString(3, f.getPhone());
			ps.setString(4, f.getEmail());
			ps.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean Update(Registration f) {
		String sql = "UPDATE projecttable SET username=?,first_name=?,middle_name=?,last_name=?,gender=?,phone=?,email=?,dateofbirth=?,college=?,address=? WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, f.getUsername());
			ps.setString(2, f.getFname());
			ps.setString(3, f.getMname());
			ps.setString(4, f.getLname());
			ps.setString(5, f.getGender());
			ps.setString(6, f.getPhone());
			ps.setString(7, f.getEmail());
			ps.setDate(8, f.getDob());
			ps.setString(9, f.getCollege());
			ps.setString(10, f.getAddress());
			ps.setInt(11, f.getId());
			ps.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}



	@Override
	public Registration getA(int id) {
		String sql = "SELECT * FROM projecttable WHERE id=" + id;
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Registration r = new Registration();
			while (rs.next()) {
				r.setId(rs.getInt("id"));
				r.setFname(rs.getString("first_name"));
				r.setMname(rs.getString("middle_name"));
				r.setLname(rs.getString("last_name"));
				r.setUsername(rs.getString("username"));
				r.setPhone(rs.getString("phone"));
				r.setEmail(rs.getString("email"));
				r.setDob(rs.getDate("dateofbirth"));
				r.setCollege(rs.getString("college"));
				r.setAddress(rs.getString("address"));
                r.setGender(rs.getString("gender"));
				return r;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean changePassword(Registration r,int id) {
    String sql="UPDATE projecttable SET password=? WHERE id="+id ;
      try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, r.getPassword());
		ps.execute();
		return true;
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return false;
	}

	@Override
	public boolean checkOldPassword(Registration r,int id) {
		String sql="SELECT * FROM projecttable WHERE id ="+id;
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
		   if(rs.next()) {
				if(rs.getString("password").equals(r.getOldpassword())) {
					return true;
				}
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Registration> getAll() {
		   List<Registration> uli=new ArrayList<>();
		
		String sql="SELECT * FROM projecttable";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				Registration r=new Registration();
				r.setId(rs.getInt("id"));
				r.setFname(rs.getString("first_name"));
				r.setMname(rs.getString("middle_name"));
				r.setLname(rs.getString("last_name"));
				r.setPhone(rs.getString("phone"));
				r.setEmail(rs.getString("email"));
				r.setUsername(rs.getString("username"));
				r.setPassword(rs.getString("password"));
				uli.add(r);
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		return uli;
	}

	@Override
	public List<Registration> search(String input) {
		  List<Registration> uli=new ArrayList<>();
		  String sql="Select * from projecttable where first_name like '%"+input+"%' or phone like '%"+input+"%' or username like '%"+input+"%' or last_name like '"+input +"' or email like '%"+input+"%'";
		  try {
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery(sql);
			while(rs.next()) {
				Registration r=new Registration();
				r.setId(rs.getInt("id"));
				r.setFname(rs.getString("first_name"));
				r.setMname(rs.getString("middle_name"));
				r.setLname(rs.getString("last_name"));
				r.setPhone(rs.getString("phone"));
				r.setEmail(rs.getString("email"));
				r.setUsername(rs.getString("username"));
				r.setPassword(rs.getString("password"));
				uli.add(r);
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return uli;
	}

	

}
