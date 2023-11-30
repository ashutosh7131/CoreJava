import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_CRUD {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/employees_database";
		int rowsAffected;
		try {
			Connection connection = DriverManager.getConnection(url, "root", "1234");
			Statement statement = connection.createStatement();
			rowsAffected = statement.executeUpdate(
					"insert into employees_tbl(id,name,dept,salary) " + "values(900,'Ashu','PP',8500);");

			System.out.println("Executed An Insert Statement.....-Rows Affected: "+rowsAffected);
		} catch (SQLException e) {
			System.out.println("Error while Updating");
		}

	}

}
