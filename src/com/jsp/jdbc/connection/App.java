package com.jsp.jdbc.connection;

public class App {
    public static void main(String[] args) {
        Student_DAO student_dao = new Student_DAO();
        System.out.println("Student ID\tStudent Name\tStudent Email\tStudent Age\tStudent Marks");
        System.out.println("----------\t------------\t-------------\t-----------\t-------------");
        student_dao.viewAllTheStudents();
        //student_dao.insetIntoStudent();
    }
}
