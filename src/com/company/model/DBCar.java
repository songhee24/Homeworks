package com.company.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCar {
    public static Car getCarByid(int id){
        String query = "select * from cars where id = ?";
        try(Connection connection = DB.connect();
            PreparedStatement statement = connection.prepareStatement(query);) {
            statement.setInt(1,id);
              try(ResultSet resultSet = statement.executeQuery()) {
                  if (resultSet.next()){
                      Car car = new Car();
                      car.setId(resultSet.getInt("ID"));
                      car.setManufactureYear(resultSet.getInt("manufacture_years"));
                      car.setPrice(resultSet.getInt("PRICE"));
                      car.setColor(resultSet.getString("COLOR"));
                      return car;
                  }
              }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
