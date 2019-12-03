package proxy_design;

public class ProxyDemo {

	public static void main(String[] args) {
		System.out.println("********** This is proxy demo ***********");
		ProxyObject proxyObject = new ProxyObject();
		proxyObject.provideUpdates();

	}

}
