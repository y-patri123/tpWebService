	package cm.iuc.tp.rs.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ConnectionMYSQL {
	    // Information d'accès à la base de données
		public static String url = "jdbc:mysql://localhost/biblio";
		public static String login = "root";//nom d'utilisateur de la base des données
		public static String passwd = "";//mot de pass
		public static Connection connection;
		
		/**
		 * Methode connection
		 * Elle ne prend rien en parametre
		 * @return Connection
		 */
		public static Connection getInstance() {
			
			if (connection==null) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connection = DriverManager.getConnection(url,login,passwd);
					
				}catch (Exception e) {
					
					//System.out.println("Probleme de connection");
					e.printStackTrace();
				}
				
			}
			
			return connection;
			
		}

	    
	    
	}
