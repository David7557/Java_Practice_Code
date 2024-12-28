package com.jsp.jdbc.connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Student_DAO {
    static Scanner scanner = new Scanner(System.in);
    //****************************Building the connection*********************************//
    public static Connection buildConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            FileReader fileReader = new FileReader("Login_Infromation.properties");
            Properties properties = new Properties();
            properties.load(fileReader);
            String url = properties.getProperty("url");
            connection = DriverManager.getConnection(url, properties);
        } catch (ClassNotFoundException | IOException | SQLException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

        return connection;
    }
   //******************************View the All student List***************************//

   public void viewAllTheStudents(){
        Connection connection = buildConnection();
       try {
           Statement statement = connection.createStatement();
           String query = "SELECT * FROM student;";
           ResultSet  resultSet = statement.executeQuery(query);
           while (resultSet.next()){
               System.out.println(resultSet.getInt("studentId")+"\t\t"+resultSet.getString("studentName")+"\t\t"+resultSet.getString("studentEmail")+"\t\t"+resultSet.getInt("studentAge")+"\t\t"+resultSet.getInt("studentMarks"));
           }

       } catch (SQLException e) {
           throw new RuntimeException(e);
       }finally {
           if (connection != null){
               try {
                   connection.close();
               } catch (SQLException e) {
                   throw new RuntimeException(e);
               }
           }
       }
   }
//****************************Insert data into student table****************************************//
    public void insetIntoStudent(){
        Connection connection = buildConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?);");
            System.out.println("Enter Student ID: ");
            preparedStatement.setInt(1, scanner.nextInt());
            System.out.println("Enter Student Name: ");
            preparedStatement.setString(2,scanner.next());
            System.out.println("Enter Student Email Address: ");
            preparedStatement.setString(3,scanner.next());
            System.out.println("Enter Student Age: ");
            preparedStatement.setInt(4, scanner.nextInt());
            System.out.println("Enter Student Marks: ");
            preparedStatement.setInt(5, scanner.nextInt());


            int rowsInserted = preparedStatement.executeUpdate();
            if(rowsInserted > 0){
                System.out.println(rowsInserted+" Rows Inserted Successfully!!");
            }else{
                System.out.println("Data not inserted!!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }













}
