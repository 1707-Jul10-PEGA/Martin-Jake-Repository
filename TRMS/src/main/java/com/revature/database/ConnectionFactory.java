package com.revature.database;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private static ConnectionFactory cf = null;
    private static Boolean build = true;

    private ConnectionFactory() {
 
    }

    public static synchronized ConnectionFactory getInstance() {
        if (build) {
            cf = new ConnectionFactory();
            build = false;
        }
        return cf;
    }

    public Connection getConnection() {
        Connection conn = null;

        try {
        	Class.forName ("oracle.jdbc.driver.OracleDriver");
          conn = DriverManager.getConnection("jdbc:oracle:thin:@martin-db-instance.cyv5ylreauwt.us-west-2.rds.amazonaws.com:1521:ORCL","TRMS_DB","trms_560");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return conn;

    }

}