package factoryMethod;

public class Hibernate implements Connection {
	@Override
	public void connect() {
		System.out.println("Hibernate Connection");
	}

}
