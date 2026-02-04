package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//sometimes run a test case wont run ,may be : Network issues called flaky testcase 
//reTRY mechanism will run 2 times ,ITestResult is Interface
public class Retry implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit = 2;

	public boolean retry(ITestResult result) {

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
