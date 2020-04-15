package factoryMethod;

public class HibernateConnection implements ConnectionFactory {
	@Override
	public Connection prepareConnection() {
		return new Hibernate();
	}
}
