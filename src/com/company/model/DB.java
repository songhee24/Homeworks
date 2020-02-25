package com.company.model;


import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "d244224d";

    public static void main(String[] args) {

    }

    public static Connection connect() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

}
