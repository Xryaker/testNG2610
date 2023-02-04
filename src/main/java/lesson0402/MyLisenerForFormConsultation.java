package lesson0402;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyLisenerForFormConsultation implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        try {
            MyUtilsForDriver.takeSnapShot("/failure/"+result.getMethod()+".png");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        try {
            MyUtilsForDriver.takeSnapShot("/succesed/"+result.getTestName()+".png");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
