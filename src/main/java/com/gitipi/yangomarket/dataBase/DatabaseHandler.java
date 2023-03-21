package com.gitipi.yangomarket.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {
    Connection dbConn;

    public Connection getDbConn() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql//" + dbHost + ":" + dbPort + ":" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConn = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConn;
    }


}
