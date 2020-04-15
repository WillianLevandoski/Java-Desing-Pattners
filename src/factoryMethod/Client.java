package factoryMethod;

public class Client {
	
	public static void main(String[] args) {
		ConnectionFactory connection = new HibernateConnection();
		Connection bd = connection.prepareConnection();
		bd.connect();
		
		System.out.println();
		
		connection = new JDBCConnection();
		bd = connection.prepareConnection();
		bd.connect();
	}

}
