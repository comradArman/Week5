package week5codingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String x) {
		// TODO Auto-generated method stub
		
		String log2 = "";
		for (int i = 0; i < x.length(); i++) {
			log2 += x.charAt(i) + " ";
			
		}
		
		System.out.println(log2);
		System.out.println("");
	}

	@Override
	public void Error(String y) {
		// TODO Auto-generated method stub
		String e = "";
		for (int i = 0; i < y.length(); i++) {
			e += y.charAt(i) + " ";
			
		}
		
		System.out.println("Error: " + e );
	}

}
