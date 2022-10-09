package week5codingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String x) {
		// TODO Auto-generated method stub
		System.out.println("***"+ x +"***");
		System.out.println("");
	}

	@Override
	public void Error(String y) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("*********************");
		System.out.println("***Error: "+ y +"***");
		System.out.println("*********************");
		System.out.println("");
	}

}
