package dp.singleton;

public class MakeCaptain {

	public static void main(String[] args) {
		/*Captain cap1 = Captain.getInstance();
		System.out.println("First captain object : "+cap1);
		Captain cap2 = Captain.getInstance();
		System.out.println("second captain object : "+cap2);
		System.out.println("== : "+(cap1 == cap2));
		System.out.println("Equality check : "+Captain.getInstance().equals(Captain.getInstance()));*/
		
		//Eager Loading testing
		Captain cap1 = Captain.getInstance();
		System.out.println("first captain : "+cap1);
		Captain cap2 = Captain.getInstance();
		System.out.println("Second Captain : "+cap2);
		System.out.println("equality : "+cap1.equals(cap2));
		
	}

}
