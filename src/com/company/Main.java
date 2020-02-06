package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String url = "jdbc:postgresql://localhost:5432/";
    private static final String user = "postgres";
    private static final String password = "d244224d";

    public static void main(String[] args) throws SQLException {
          Main DB = new Main();
          Connection connection = DB.connect();
          ArrayList<City> cities = new ArrayList<>();
          ArrayList<City> cities2 = new ArrayList<>();
          cities.add(new City(1,"Bishkek"));
          cities.add(new City(2,"Osh"));
          cities.add(new City(3,"Batken"));
          cities2.add(new City(3,"Konoha"));
          cities2.add(new City(1,"Tokyo"));
          DB.addToTableFromList(cities);
          DB.addToTableFromList(cities2);
         if(connection != null) connection.close();
    }

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public  void  addToTableFromList(ArrayList<City> arr){
        for (City c :arr){
            if (check(c.getId())){
               updCity(c,c.getId());
            }
            else addCity(c);
        }

    }

    public boolean check(int id){
        int a = 0;
        String SQl = "select count(*) from cities_2";
        try(Connection conn = connect();
            PreparedStatement statement = conn.prepareStatement(SQl)) {
            try (ResultSet rst = statement.executeQuery()){
                statement.setInt(1,id);
                rst.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return !(a == 0);
    }

    public void addCity(City city){
        String SQL = "insert into cities_2(id,name) values (?,?);";
        try(Connection conn = connect();
            PreparedStatement preparedStatement = conn.prepareStatement(SQL)) {
            preparedStatement.setInt(1,city.getId());
            preparedStatement.setString(2,city.getName());
            preparedStatement.executeUpdate();
            System.out.println("succes created");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void updCity(City city, int id){
        String SQL = "update cities_2 set id = ?,set name ? where id = ?;";
        try(Connection conn = connect();
            PreparedStatement preparedStatement = conn.prepareStatement(SQL)) {
            preparedStatement.setInt(1,city.getId());
            preparedStatement.setString(2,city.getName());
            preparedStatement.executeUpdate();
            System.out.println("succes upd");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
class City {
    private int id;
    private String name;

    public City(){

    }

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
