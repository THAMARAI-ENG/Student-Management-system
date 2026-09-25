
import java.sql.*;
public class Insert {
	public static void main(String [] args) {
		String url="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="root123";
		try {
			Connection con=DriverManager.getConnection(url, username, password);
			String query="INSERT INTO student(name,age,department)VALUES(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "janagi");
			ps.setInt(2, 21);
			ps.setString(3,"CSE");
			ps.setString(1, "agila");
			ps.setInt(2, 19);
			ps.setString(3,"BCA");
			ps.setString(1, "gomathi");
			ps.setInt(2, 39);
			ps.setString(3,"M.com");
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("inserted successfully");
			}
			con.close();
		}
		catch(Exception e){
			System.out.println("e");
		}
		
	}

}
