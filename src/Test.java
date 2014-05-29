import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Test {

	public static void main(String[] args) throws SQLException {
		System.out.println("YOO WAZZZZUPPPPP!!!!");
//can you see this ?// this will give error
		//Saw it, changed it!
		//Fixed Error!
		getConnection();

	}
	private static String userName = "test";
	private static String password = "untest";
	private static String dbms = "mysql";
	private static String serverName = "holmdelf_njcu";
	private static String portNumber = "3306";
	private static String dbName = "holmdelf_njcu";
	
	
	public static Connection getConnection() throws SQLException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", userName);
	    connectionProps.put("password", password);

	    if (dbms.equals("mysql")) {
	        conn = DriverManager.getConnection(
	                   "jdbc:" + dbms + "://" +
	                   serverName +
	                   ":" + portNumber + "/",
	                   connectionProps);
	    } else if (dbms.equals("derby")) {
	        conn = DriverManager.getConnection(
	                   "jdbc:" + dbms + ":" +
	                   dbName +
	                   ";create=true",
	                   connectionProps);
	    }
	    System.out.println("Connected to database");
	    return conn;
	}

}
