package mycommons.db;
// This class is a  of database.
public class DBConnector {

	private String host;//"host name" or "ip address"
	//private String hostAddress;
	private String dbName;
	private String userName;
	private String passWord;
	private String forName;
	
	public DBConnector(String forName,String host,String DBName,String DB_UserName,String DB_UserPassWord){
		
		this.host=host;
		//this.hostAddress=HostAddress;
		this.dbName=DBName;
		this.userName=DB_UserName;
		this.passWord=DB_UserPassWord;
		this.forName=forName;
		
	}
}
