package it.polito.tdp.anagrammi.dao;

import java.sql.*;

public class ConnectionDB {

		static private final String jdbcUrl = "jdbc:mysql://localhost/mark?user=root&password=root";
		static private Connection connection = null;

		public static Connection getConnection() {

			try {
				if (connection == null) {
					connection = DriverManager.getConnection(jdbcUrl);
				}
				return connection;

			} catch (SQLException e) {

				e.printStackTrace();
				throw new RuntimeException("Cannot get a connection " + jdbcUrl, e);
			}
		}
	}



