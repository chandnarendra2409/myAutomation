package listenersPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListners1 implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// Before every method in the test class
		System.out.println("before Invocation: "+testResult.getTestClass().getName()+"=>"+method.getTestMethod().getMethodName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// After every method in the test class
		System.out.println("After Invocation: "+testResult.getTestClass().getName()+"=>"+method.getTestMethod().getMethodName());
		
	}

}
