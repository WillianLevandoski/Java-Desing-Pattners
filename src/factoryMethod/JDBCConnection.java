package factoryMethod;

public class JDBCConnection implements ConnectionFactory {

	@Override
	public Connection prepareConnection() {
		return new Hibernate();
	}

}
