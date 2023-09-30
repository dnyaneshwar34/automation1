package grouping;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("tc"+result.getName()+"pass");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("tc"+result.getName()+"success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("tc"+result.getName()+"failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("tc"+result.getName()+"skipped");
	}

	

	
	

}
