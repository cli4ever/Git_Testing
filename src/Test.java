import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Test {

	public static void main(String[] args) {
		System.out.println("YOO WAZZZZUPPPPP!!!!");
//can you see this ?// this will give error
		//Saw it, changed it!
		//Fixed Error!

	}
	private String userName = "test";
	private String password = "untest";
	private String dbms = "mysql";
	private String serverName = "holmdelf_njcu";
	private String portNumber = "3306";
	private String dbName = "holmdelf_njcu";
	
	
	public Connection getConnection() throws SQLException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", this.userName);
	    connectionProps.put("password", this.password);

	    if (this.dbms.equals("mysql")) {
	        conn = DriverManager.getConnection(
	                   "jdbc:" + this.dbms + "://" +
	                   this.serverName +
	                   ":" + this.portNumber + "/",
	                   connectionProps);
	    } else if (this.dbms.equals("derby")) {
	        conn = DriverManager.getConnection(
	                   "jdbc:" + this.dbms + ":" +
	                   this.dbName +
	                   ";create=true",
	                   connectionProps);
	    }
	    System.out.println("Connected to database");
	    return conn;
	}

}
