package jp.co.aforce.practice;

public class StackTraceExample {
	public static void main(String[] agrs) throws AforceException1{
		StackTraceExample example = new StackTraceExample();
		example.testMethod();
		
	}
	
	public void testMethod() throws AforceException1{
		try {
			throw new AforceException2();
		}catch(AforceException1 e) {
			e.printStackTrace();
		}
	}
}
