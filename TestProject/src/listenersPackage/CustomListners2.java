package listenersPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// when test method starts
		System.out.println("onTestStart -> Test Name: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// when test method passed
		System.out.println("onTestSuccess -> Test Name: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// when test method failed
		System.out.println("onTestFailed -> Test Name: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// before <test> tag of xml file
		System.out.println("onStart -> Test Name: "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// after <test> tag of xml file
				System.out.println("onFinish -> Test Name: "+context.getName());
		
	}


}
