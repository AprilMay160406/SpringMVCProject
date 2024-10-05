package com.spring.repository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Blob;
import java.sql.Connection;

public class img {
	 public Blob getimg() {
		    Blob b = null;
		    Connection cn = LinkConnection.linkConnection();
		    String query = "SELECT * FROM test_img.photo;";
		    try {
		      PreparedStatement ps = cn.prepareStatement(query);
		      ResultSet rs = ps.executeQuery();
		      while (rs.next()) {
		        b = rs.getBlob("img");
		        System.out.println(b);
		      }
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }

		    return b;


	 }
}