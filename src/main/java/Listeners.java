import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Tests success..."+ iTestResult.getInstanceName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed capturing a screenshot..."+ "Method name: "+ iTestResult.getInstanceName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
