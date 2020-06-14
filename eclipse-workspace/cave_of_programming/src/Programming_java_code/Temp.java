package Programming_java_code;

public class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		
	}

}
