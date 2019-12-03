package dp.singleton;

public class Captain {
	
	
	/*
	 * Lazy loading- instantiate on demand if object not instatiated.
	 */
	
	/*static int count = -1;
	private static Captain captain;// = new Captain();
	//Get only one instance.
	private Captain () {
		
	}
	public static synchronized Captain getInstance() {
		if(captain == null) {
			++count;
			captain = new Captain();
			System.out.println("New Captain selected for our team");
		} else {
			System.out.print("You already have a Captain for your team.");
			System.out.println("Send him for the toss.");
		}
		System.out.println("Calling getInstancse method : "+count);
		//eack call will instantiate new instance.
		return captain;
	}*/
	
	//Eager Loading - Instantiate on each call.
	//private static Captain _captain = new Captain();
	//Private constructor to prevent instantiation from out side.
	private Captain() {
		
	}
	
	/*In the above solution an object of the singleton class is always instantiated.
	Case (iii): To deal with this kind of situation, Bill Pugh came up with a different approach:*/
	
	private static class SingletonHelper {
		//Nested class is referenced after getCaptain() is called
		private static final Captain _captain = new Captain();
	}
	
	/*public static Captain getInstance() {
		return _captain;
	}*/
	
	public static Captain getInstance() {
		return SingletonHelper._captain;
	}
	
}
