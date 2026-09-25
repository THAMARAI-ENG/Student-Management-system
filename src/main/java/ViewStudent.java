import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class ViewStudent {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/testdb";
		String user="root";
		String password="root123";
				try {
					Connection con=DriverManager.getConnection(url, user, password);
					String query="SELECT * FROM student";
					Statement st=con.createStatement();
					//PreparedStatement ps=con.prepareStatement(query);
					//ps.executequery();
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("department")+" "+rs.getInt("age"));
					}
					con.close();
				}
                catch(Exception e) {
                	System.out.println("e");
                }
	}

}
