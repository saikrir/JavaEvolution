package javam.evolution;



public class TextBlocksExample {
	
	private static String printMessage(String javaVersion) {		
		String message =""" 
				Hello, This is a message 
				from Java %s
				Hope you like this feature
				""";
		return message.formatted(javaVersion);
	}
	
	
	public static void main(String[] args) {
		String javaVersion = System.getProperty("java.runtime.version");
		System.out.println(printMessage(javaVersion));
	}
	
}
