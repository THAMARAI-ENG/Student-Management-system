import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DeleteStudent {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/testdb";
	String username="root";
	String password="root123";
	try {
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement ps=con.prepareStatement("DELETE FROM student WHERE id=3");
	int rows=ps.executeUpdate();  // usually returns number of rows affected
	if(rows>0) {
		System.out.println("deleted successfully");
	}
	con.close();
	}
	catch(Exception e) {
		System.out.println("e");
	}
}
}
