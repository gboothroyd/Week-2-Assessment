package test;

/**
 * @author booth - gboothroyd@dmacc.edu
 *CIS175 - Fall 2021
 * Sep 6, 2021
 */

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {

	
	public static void main(String[] args) {
	
		
		Result result = 
				JUnitCore.runClasses(TestMovieLogic.class);
				for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
				
				
	}

}
