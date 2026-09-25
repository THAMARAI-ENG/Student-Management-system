package com.sms.operation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.sms.model.Student;
import com.sms.db.DbConnection;
public class StudentDao {
     public static void addStudent(Student s) {
    	 try {
    		 Connection con=DbConnection.getConnection();
    		 String query="INSERT INTO student (id,name,age,department) VALUES (?,?,?,?)";
    		 PreparedStatement ps=con.prepareStatement(query);
    		 ps.setInt(1,s.getId());
    		 ps.setString(2,s.getName());
    		 ps.setInt(3,s.getAge());
    		 ps.setString(4,s.getDepartment());
    		 ps.executeUpdate();
    		 System.out.println("STUDENT ADDED SUCCESSFULLY!......");
    		 
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
     public static void deleteStudent(int id) {
    	 try {
    	 Connection con=DbConnection.getConnection();
    	 String query="DELETE FROM student WHERE id=?";
    	 PreparedStatement ps=con.prepareStatement(query);
    	 ps.setInt(1,id);
    	 ps.executeUpdate();
    	 System.out.println("STUDENT DELETED SUCCESSFULLY!......");
     }
     catch(Exception e) {
    	 e.printStackTrace();
	 }
    }
    public static void updateStudent(Student s) {
    	try {
   		 Connection con=DbConnection.getConnection();
   		 String query="UPDATE student SET name=?,age=?,department=? WHERE id=?";
   		 PreparedStatement ps=con.prepareStatement(query);
   		 ps.setString(1,s.getName());
   		 ps.setInt(2,s.getAge());
   		 ps.setString(3,s.getDepartment());
   		 ps.setInt(4,s.getId());
   		 ps.executeUpdate();
   		 System.out.println("STUDENT UPDATEDED SUCCESSFULLY!......");
   		 
   	 }
   	 catch(Exception e) {
   		 e.printStackTrace();
   	 }
   }
    public static void searchStudent(int id) {
    	try {
       	 Connection con=DbConnection.getConnection();
       	 String query="SELECT * FROM student WHERE id=?";
       	 PreparedStatement ps=con.prepareStatement(query);
       	 ps.setInt(1,id);
       	 ResultSet rs=ps.executeQuery();
       	 if(rs.next()) {
       	    System.out.println("NAME:"+rs.getString("name")+" "+"AGE:"+rs.getInt("age")+" "+"DEPARTMENT:"+rs.getString("department")
       	    );
       	 }
       	 else {
       		System.out.println("STUDENT NOT FOUND");
       	 }
       	 System.out.println("GOT STUDENT INFORMATION SUCCESSFULLY!......");
        }
        catch(Exception e) {
       	 e.printStackTrace();
   	 }
    }
    public static void viewStudent() {
    	try {
    	Connection con=DbConnection.getConnection();
    	String query="SELECT * FROM student";
    	PreparedStatement ps=con.prepareStatement(query);
    	ResultSet rs=ps.executeQuery();
    	System.out.println("STUDENT DETAILS!");
    	while(rs.next()) {
    		System.out.println("ID:"+rs.getInt("id")+" "+"NAME:"+rs.getString("name")+" "+"AGE:"+rs.getInt("age")+" "+"DEPARTMENT"+rs.getString("department"));	
    	}
      }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}

