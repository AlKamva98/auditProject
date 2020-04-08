package com.java.createaccount.doa;

import com.java.createaccount.model.Lecturer;

import java.sql.*;

public class LecturerDoa {

    String databaseURL = "jdbc:mysql://localhost/test_db";

    public int createLecturerAccount(Lecturer lecturer) throws ClassNotFoundException {

       String insertInto = "insert into Lecturer_details(lectName, lectEmailAd, lectUniNo, lectUniPassw) values(?, ?, ?, ?)";


       int result = 0;

       Class.forName("com.mysql.jdbc.Driver");
       try(Connection connection = DriverManager.getConnection(databaseURL, "root", "J@mes1992!")){
           PreparedStatement preparedStatement = connection.prepareStatement(insertInto);
           preparedStatement.setString(1,lecturer.getLectName());
           preparedStatement.setString(2,lecturer.getLectEmailAd());
           preparedStatement.setString(3,lecturer.getLectUniNo());
           preparedStatement.setString(4,lecturer.getLectUniPassw());

           System.out.println(preparedStatement);

           result = preparedStatement.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }
        return result;
    }
}
