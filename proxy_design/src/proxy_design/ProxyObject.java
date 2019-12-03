package proxy_design;

public class ProxyObject extends Student {

	private CSEStudent cSEStudent;

	private ECEStudent eceStudent;
	public ProxyObject() {
		cSEStudent = new CSEStudent();
		eceStudent = new ECEStudent();
	}
	@Override
	public void provideUpdates() {
		cSEStudent.provideUpdates();
		eceStudent.provideUpdates();
	}

}
