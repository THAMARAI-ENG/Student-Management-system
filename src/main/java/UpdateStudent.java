import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class UpdateStudent {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="root123";
		try {
		Connection con=DriverManager.getConnection(url, username, password);
		String query="UPDATE student SET age=10 WHERE id=1";
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);
		if(rows>0) {
			System.out.println("updated successfully");
		}
		con.close();
		}
		catch(Exception e) {
			System.out.println("e");
		}
	}

}
