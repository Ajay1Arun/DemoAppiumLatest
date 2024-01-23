package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class createDriverSession {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Honar 8 Lite");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
            //cap.setCapability(MobileCapabilityType.UDID,"a133859a");
            cap.setCapability(MobileCapabilityType.UDID,"BKFDU17420007539");
            cap.setCapability("appPackage","com.tatamotors.edp_impower");
            cap.setCapability("appActivity","com.tatamotors.edp_impower.MainActivity");
            String appUrl=System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "App" + File.separator + "Drishti.apk";
            cap.setCapability(MobileCapabilityType.APP,appUrl);

        URL url=new URL("http://localhost:4723/");
        AppiumDriver driver=new AppiumDriver(url,cap);
        System.out.println("Appium is started...!");
    }
}
