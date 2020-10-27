package com.whatsApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.whatsApp.entity.WhatsAppUser;

public class WhatsAppDAO implements WhatsAppDAOInterface{

	public int createProfileDAO(WhatsAppUser f) throws Exception {
		//step 1 load driver
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
				//step 2 connection with database
				Connection con=DriverManager.getConnection("jdbc:derby:/Users/harshitjain/downloads/db-derby-10.13.1.1-bin/bin/dumyDB;create=true","","");
				//step 3 create query
				PreparedStatement ps=con.prepareStatement("insert into whatsappuser values(?,?,?,?)");
				ps.setString(1, f.getName());
				ps.setString(2, f.getPassword());
				ps.setString(3,f.getEmail());
				ps.setString(4, f.getAddress());
				
				//step 4 execute query
				int i=ps.executeUpdate();
				
				return i;
	}

}
