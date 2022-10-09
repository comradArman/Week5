package week5codingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = new AsteriskLogger();
		
		logger.Log("hello");
		
		logger.Error("hello");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.Log("hello");
		logger2.Error("hello");
		
		
	}

}
