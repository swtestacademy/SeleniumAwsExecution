import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OptionsManager {

    //Get Chrome Options
    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        //options.addArguments("--incognito");
        return options;
        /*ChromeDriverService service = new ChromeDriverService.Builder()
                .usingAnyFreePort()
                .build();
        ChromeDriver driver = new ChromeDriver(service, options);*/
    }

    //Get Firefox Options
    public static FirefoxOptions getFirefoxOptions () {
        FirefoxOptions options = new FirefoxOptions();
        FirefoxProfile profile = new FirefoxProfile();
        //Accept Untrusted Certificates
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(false);
        //Use No Proxy Settings
        profile.setPreference("network.proxy.type", 0);
        //Set Firefox profile to capabilities
        options.setCapability(FirefoxDriver.PROFILE, profile);
        return options;
    }
 //Get IE Options
    public static InternetExplorerOptions getIEOptions () {
        InternetExplorerOptions options = new InternetExplorerOptions();

        return options;
    }


}