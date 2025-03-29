package Day10.singleton_design;
//This is k/a Singleton design
public class Connection {
	private static Connection connection;
	private String dbName;
	private String userName;
	
	private Connection(String dbName, String userName) {
		this.dbName=dbName;
		this.userName=userName;
	}
	public String getDBname() {
		return dbName;
	}
	public String getUsername() {
		return userName;
	}
	
	public void setDBname(String db) {
		this.dbName=db;
	}
	public void setuserName(String u) {
		this.userName=u;
	}
	
	public static Connection getobj(String dbName, String userName) {
		if(connection==null) {
		connection=new Connection(dbName,userName);
	}
		return connection;
		}
	
}
