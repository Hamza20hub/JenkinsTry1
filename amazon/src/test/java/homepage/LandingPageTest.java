package homepage;


import base.CommonAPI;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static org.testng.Assert.assertTrue;

public class LandingPageTest extends CommonAPI {

    @Test
    public void currentUrlTest() throws InterruptedException {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("CNN.com"));

        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Search for " + currentUrl);
    }

    @Test
    public void titleTest() throws InterruptedException {
        String currentUrl = driver.getTitle();
        assertTrue(currentUrl.contains("amazonsss.com"));

        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Search for " + currentUrl);
    }
}
