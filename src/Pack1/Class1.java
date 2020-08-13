package Pack1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Class1 
{
	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"R9ZN60WKQ6R");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
		caps.setCapability(MobileCapabilityType.APP,"D:\\Desktop and Download Data\\Backup Data\\Appium\\Apk_Sample\\Sales_Deals_Discounts_Buy_Save_with_eBay (1).apk");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);

	}

}
